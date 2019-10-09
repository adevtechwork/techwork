
package com.kp.idm.okta.envutility.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "autoKeyRotation",    
    "token_endpoint_auth_method"
})
public class OauthClient {

    @JsonProperty("autoKeyRotation")
    private Boolean autoKeyRotation;
	
    @JsonProperty("token_endpoint_auth_method")
    private String tokenEndpointAuthMethod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("autoKeyRotation")
    public Boolean getAutoKeyRotation() {
        return autoKeyRotation;
    }

    @JsonProperty("autoKeyRotation")
    public void setAutoKeyRotation(Boolean autoKeyRotation) {
        this.autoKeyRotation = autoKeyRotation;
    }

  

    @JsonProperty("token_endpoint_auth_method")
    public String getTokenEndpointAuthMethod() {
        return tokenEndpointAuthMethod;
    }

    @JsonProperty("token_endpoint_auth_method")
    public void setTokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
        this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
    }

   

}
