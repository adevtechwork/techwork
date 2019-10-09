package com.kp.idm.okta.envutility.controller;

import org.apache.http.client.utils.URIBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.kp.idm.okta.envutility.model.Application;
import com.kp.idm.okta.envutility.model.Environment;
import com.kp.idm.okta.envutility.model.Value;
import com.kp.idm.okta.envutility.model.authserver.AuthServer;
import com.kp.idm.okta.envutility.model.group.ApplicationGroup;
import com.kp.idm.okta.envutility.model.groups.ApplicationGroups;
import com.kp.idm.okta.envutility.model.groups.Group;
import com.kp.idm.okta.envutility.model.policy.Policy;
import com.kp.idm.okta.envutility.util.EnvironmentUtil;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.ParameterizedTypeReference;

@RestController
public class OktaEnvController {
	static Logger logger = LoggerFactory.getLogger(OktaEnvController.class);
	@Autowired
    RestTemplate restTemplate;

	@org.springframework.beans.factory.annotation.Value("${keyPrefix}")
	private String keyPrefix;

	@org.springframework.beans.factory.annotation.Value("${keyPostfix}")
	private String keyPostfix;
	

	
	private static String oktaHost;
	private static String newoktaDomain;

	@org.springframework.beans.factory.annotation.Value("${oktagetAppEndpoint}")
	private String oktagetAppEndpoint;
	@org.springframework.beans.factory.annotation.Value("${oktagetAuthEndpoint}")
	private String oktagetAuthEndpoint;
	

	
	private static String oktaAuth;
	@org.springframework.beans.factory.annotation.Value("${newoktaDomain}")
    public void setNewoktaDomain(String newDomain) {
		newoktaDomain = newDomain;
    }
	@org.springframework.beans.factory.annotation.Value("${oktaHost}")
    public void setOktaHost(String host) {
		oktaHost = host;
    }
	@org.springframework.beans.factory.annotation.Value("${oktaAuth}")
    public void setOktaAuth(String auth) {
		oktaAuth = auth;
    }
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("Starting - OktaEnvController");

		return "envsuccess";
	}

	@RequestMapping(value = "/execute", method = RequestMethod.GET, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<String> execute(@RequestPart("envfile") MultipartFile envFile,
			@RequestPart("appfile") MultipartFile appFile)
	{
		logger.info("Starting - OktaEnvController execute");

		String jsonMap = null;
		String envJsonFile = null;

		Map<String, String> envKeyMap = new HashMap<>();
		try {

			jsonMap = new String(appFile.getBytes());
			envJsonFile = new String(envFile.getBytes());

			// Validate input files
			if (EnvironmentUtil.isValidJSON(envJsonFile) && EnvironmentUtil.isValidJSON(jsonMap)) {

				Environment envJson = new ObjectMapper().readValue(envFile.getBytes(), Environment.class);
				System.out.println(envFile.getOriginalFilename() + envJson.getValues().size());

				for (int i = 0; i < envJson.getValues().size(); i++)

				{
					Value value = envJson.getValues().get(i);
					envKeyMap.put(value.getKey(), value.getValue());
				}

				// Replace all keys in appJson
				for (Map.Entry<String, String> entry : envKeyMap.entrySet()) {
					jsonMap = jsonMap.toString().replace(keyPrefix + entry.getKey() + keyPostfix, entry.getValue());
				}

				System.out.println("Json ...." + jsonMap.toString());
			}

			else {
				// Invalid json

				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad json");

			}

		

		List<String> result = EnvironmentUtil.extractTokens(jsonMap.toString(), keyPrefix, keyPostfix);
		if (result.size() > 0)
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Keys are missing : " + result.toString());
		else
			return ResponseEntity.ok(jsonMap.toString());
		
		
		} 
		catch (JsonParseException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(jsonMap.toString());
		} 
		catch (JsonMappingException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(jsonMap.toString());
		} 
		catch (IOException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(jsonMap.toString());
		}
	}
	
	public static HttpHeaders getHeadersWithSSWSCredentials() {

        HttpHeaders headers = new HttpHeaders();
       // headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("Authorization", "SSWS " + oktaAuth);
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "application/json");

        return headers;
    }
	
	
	public static URI buildPathURL(String path) {
        System.setProperty("https.protocols", "TLSv1.2");
        URIBuilder builder = new URIBuilder();
        URI url = null;
        builder.setScheme("https").setHost(oktaHost).setPath(path);

        try {
            url = builder.build();
        } catch (URISyntaxException e) {

            logger.error("Error building buildPathURL ", e);
        }
        return url;
    }
	@RequestMapping(value = "/exportAppConfig", method = RequestMethod.GET)
	public ResponseEntity<String> exportConfig()
	{
		logger.info("Starting - OktaEnvController exportAppConfig");
		

		HttpHeaders headers = getHeadersWithSSWSCredentials();
		URI url = null;
		url=buildPathURL(oktagetAppEndpoint);
		ResponseEntity<List<Application>> responseEntity=null;
		List<Application> listApps=null;
		Map<String, String> envKeyMap = new HashMap<>();
		HttpEntity<Application> requestEntity = new HttpEntity<Application>(headers);
		
		
		responseEntity=restTemplate.exchange(url, HttpMethod.GET, requestEntity,
                new ParameterizedTypeReference<List<Application>>() {
                });
		
		listApps=responseEntity.getBody();
		
		logger.info("responseEntity.getStatusCode()"+(responseEntity.getStatusCode().value()==200)+listApps.size());
		
		
		
		StringBuffer responseBody=new StringBuffer();
		if(responseEntity.getStatusCode().value()==200)
		{
			try {	
			/*
			 * String responseBody=responseEntity.getBody().toString();
			 * responseBody=responseBody.replace(oktaHost, newoktaDomain);
			 */
			
			ResponseEntity<Application>  responseAppEntity=null;
			
			ObjectMapper mapper = new ObjectMapper();
			
			ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
			
			writer.writeValue(new File("C://kp/file/appConfigs_"+new Date().getTime()+".json"),mapper.writerWithDefaultPrettyPrinter().writeValueAsString(listApps));
			
			for (Application application : listApps)
			{
				mapper = new ObjectMapper();
				responseBody.append( mapper.writerWithDefaultPrettyPrinter().writeValueAsString(application));
			}
			
			
			for (Application application : listApps) {
				
				
				String label=application.getLabel()+"_tenant2_"+new Date().getTime();
				application.setLabel(label);
				HttpEntity<Application> appEntity = new HttpEntity<Application>(application,headers);
						
				logger.info(" Adding application :"+mapper.writeValueAsString(application));
				
				
				responseAppEntity=restTemplate.exchange(url, HttpMethod.POST, appEntity,Application.class);
				responseBody.append(responseEntity.getBody().toString());
			}
			}
			catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return ResponseEntity.ok().body(responseBody.toString());
			
		}
		else {
			// Invalid json

			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad json");

		}
		
		
	}
	
	@RequestMapping(value = "/exportGroupsConfig", method = RequestMethod.GET)
	public ResponseEntity<String> exportGroupsConfig()
	{
		logger.info("Starting - OktaEnvController exportAppConfig");
		

		HttpHeaders headers = getHeadersWithSSWSCredentials();
		URI url = null;
		url=buildPathURL(oktagetAppEndpoint);
		ResponseEntity<List<Application>> responseEntity=null;
		ResponseEntity<List<ApplicationGroups>> groupsresponseEntity=null;
		ResponseEntity<ApplicationGroup> groupresponseEntity=null;
		List<Application> listApps=null;
		List<ApplicationGroups> listGroups=null;
		ApplicationGroup appGroup=null;
		Map<String, String> envKeyMap = new HashMap<>();
		HttpEntity<Application> requestEntity = new HttpEntity<Application>(headers);
		HttpEntity<ApplicationGroups> groupsrequestEntity = new HttpEntity<ApplicationGroups>(headers);
		HttpEntity<ApplicationGroup> grouprequestEntity = new HttpEntity<ApplicationGroup>(headers);
		
		
		responseEntity=restTemplate.exchange(url, HttpMethod.GET, requestEntity,
                new ParameterizedTypeReference<List<Application>>() {
                });
		
		listApps=responseEntity.getBody();
		
		logger.info("responseEntity.getStatusCode()"+(responseEntity.getStatusCode().value()==200)+listApps.size());
		
		
		StringBuffer groupresponseBody=new StringBuffer();
		if(responseEntity.getStatusCode().value()==200)
		{
			
              for (Application application : listApps) {
				
            	groupresponseBody.append(application.getLabel()+"||");
				String groupsUrl=application.getLinks().getGroups().getHref();				
				groupsresponseEntity=restTemplate.exchange(groupsUrl, HttpMethod.GET, groupsrequestEntity,
		                new ParameterizedTypeReference<List<ApplicationGroups>>() {
		                });
				
				listGroups=groupsresponseEntity.getBody();
				
				for (ApplicationGroups applicationGroup : listGroups) {
					
					
					String groupUrl=applicationGroup.getLinks().getGroup().getHref();				
					groupresponseEntity=restTemplate.exchange(groupUrl, HttpMethod.GET, grouprequestEntity,
			                new ParameterizedTypeReference<ApplicationGroup>() {
			                });
					
					appGroup=groupresponseEntity.getBody();
					groupresponseBody.append(appGroup.getProfile().getName()+",");
					
				}
				groupresponseBody.append("\n");
				
			}
              logger.info(".................groups fetched...."+groupresponseBody.toString());
			
			return ResponseEntity.ok().body(groupresponseBody.toString());
			
		}
		else {
			// Invalid json

			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad json");

		}
		
		
	}
	
	@RequestMapping(value = "/exportAuthServerConfig", method = RequestMethod.GET)
	public ResponseEntity<String> exportAuthServerConfig()
	{
		logger.info("Starting - OktaEnvController exportAuthServerConfig");
		

		HttpHeaders headers = getHeadersWithSSWSCredentials();
		URI url = null;
		url=buildPathURL(oktagetAuthEndpoint);
		
		ResponseEntity<List<AuthServer>> authsresponseEntity=null;
		ResponseEntity<AuthServer> authresponseEntity=null;
		List<AuthServer> listAuths=null;
		
		AuthServer appGroup=null;
		Map<String, String> envKeyMap = new HashMap<>();
		HttpEntity<AuthServer> requestEntity = new HttpEntity<AuthServer>(headers);
		HttpEntity<Policy> policiesrequestEntity = new HttpEntity<Policy>(headers);
		
		ResponseEntity<List<Policy>> policiesresponseEntity=null;
		ResponseEntity<Policy> policyresponseEntity=null;
		List<Policy> listPolicy=null;
		
		authsresponseEntity=restTemplate.exchange(url, HttpMethod.GET, requestEntity,
                new ParameterizedTypeReference<List<AuthServer>>() {
                });
		
		listAuths=authsresponseEntity.getBody();
		ObjectMapper mapper = new ObjectMapper();
		try {
			logger.info("responseEntity.getStatusCode()"+(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(listAuths))+authsresponseEntity.getBody());
            ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
			
			writer.writeValue(new File("C://kp/file/authServersConfigs_"+new Date().getTime()+".json"),mapper.writerWithDefaultPrettyPrinter().writeValueAsString(listAuths));
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		StringBuffer authresponseBody=new StringBuffer();
		if(authsresponseEntity.getStatusCode().value()==200)
		{
			
              for (AuthServer authServer : listAuths) {
  				
            	authresponseBody.append(authServer.getName()+"||");
  				String policiesUrl=authServer.getLinks().getPolicies().getHref();				
  				policiesresponseEntity=restTemplate.exchange(policiesUrl, HttpMethod.GET, policiesrequestEntity,
  		                new ParameterizedTypeReference<List<Policy>>() {
  		                });
  				
  				listPolicy=policiesresponseEntity.getBody();
  				
  				for (Policy policy : listPolicy) {
  					
  					authresponseBody.append("Name: "+policy.getName()+", Type: "+policy.getType()+" , Clients: "+policy.getConditions().getClients().getInclude().toString()+"\t");
					/*
					 * String policyUrl=policy.getLinks().get.getHref();
					 * groupresponseEntity=restTemplate.exchange(groupUrl, HttpMethod.GET,
					 * grouprequestEntity, new ParameterizedTypeReference<ApplicationGroup>() { });
					 * 
					 * appGroup=groupresponseEntity.getBody();
					 * groupresponseBody.append(appGroup.getProfile().getName()+",");
					 */
  					
  				}
  				authresponseBody.append("\n");
  				
  			}
              logger.info(".................Policies fetched...."+authresponseBody.toString());
			
			return ResponseEntity.ok().body(authresponseBody.toString());
			
		}
		else {
			// Invalid json

			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad json");

		}
		
		
	}

}
