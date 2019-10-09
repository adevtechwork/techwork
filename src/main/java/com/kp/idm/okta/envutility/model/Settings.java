
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
    "app",
    "notifications",
    "signOn",
    "oauthClient"
})
public class Settings {

    @JsonProperty("app")
    private App app;
    @JsonProperty("notifications")
    private Notifications notifications;
    @JsonProperty("signOn")
    private SignOn signOn;
    @JsonProperty("oauthClient")
    private OauthClient_ oauthClient;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("app")
    public App getApp() {
        return app;
    }

    @JsonProperty("app")
    public void setApp(App app) {
        this.app = app;
    }

    @JsonProperty("notifications")
    public Notifications getNotifications() {
        return notifications;
    }

    @JsonProperty("notifications")
    public void setNotifications(Notifications notifications) {
        this.notifications = notifications;
    }

    @JsonProperty("signOn")
    public SignOn getSignOn() {
        return signOn;
    }

    @JsonProperty("signOn")
    public void setSignOn(SignOn signOn) {
        this.signOn = signOn;
    }

    @JsonProperty("oauthClient")
    public OauthClient_ getOauthClient() {
        return oauthClient;
    }

    @JsonProperty("oauthClient")
    public void setOauthClient(OauthClient_ oauthClient) {
        this.oauthClient = oauthClient;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
