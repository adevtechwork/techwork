
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
    "userNameTemplate",
    
    "oauthClient"
})
public class Credentials {

    @JsonProperty("userNameTemplate")
    private UserNameTemplate userNameTemplate;
  
    @JsonProperty("oauthClient")
    private OauthClient oauthClient;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("userNameTemplate")
    public UserNameTemplate getUserNameTemplate() {
        return userNameTemplate;
    }

    @JsonProperty("userNameTemplate")
    public void setUserNameTemplate(UserNameTemplate userNameTemplate) {
        this.userNameTemplate = userNameTemplate;
    }

   

    @JsonProperty("oauthClient")
    public OauthClient getOauthClient() {
        return oauthClient;
    }

    @JsonProperty("oauthClient")
    public void setOauthClient(OauthClient oauthClient) {
        this.oauthClient = oauthClient;
    }

   

}
