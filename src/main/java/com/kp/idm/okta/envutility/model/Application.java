
package com.kp.idm.okta.envutility.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    
    "name",
    "label",
    "status",
    "lastUpdated",
    "created",
    "accessibility",
    "visibility",
    "features",
    "signOnMode",
    "credentials",
    "settings",
    "_links"
})
public class Application {

	
	//@JsonProperty("name") private String name;
	
    @JsonProperty("label")
    private String label;
    @JsonProperty("status")
    private String status;
    @JsonProperty("lastUpdated")
    private String lastUpdated;
    @JsonProperty("created")
    private String created;
    @JsonProperty("accessibility")
    private Accessibility accessibility;
    @JsonProperty("visibility")
    private Visibility visibility;
    @JsonProperty("features")
    private List<Object> features = null;
    @JsonProperty("signOnMode")
    private String signOnMode;
    @JsonProperty("credentials")
    private Credentials credentials;
    @JsonProperty("settings")
    private Settings settings;
    @JsonProperty("_links")
    private Links links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	
	 // @JsonProperty("name") public String getName() { return name; }
	  
	 // @JsonProperty("name") public void setName(String name) { this.name = name; }
	 

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("lastUpdated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("lastUpdated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("accessibility")
    public Accessibility getAccessibility() {
        return accessibility;
    }

    @JsonProperty("accessibility")
    public void setAccessibility(Accessibility accessibility) {
        this.accessibility = accessibility;
    }

    @JsonProperty("visibility")
    public Visibility getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("features")
    public List<Object> getFeatures() {
        return features;
    }

    @JsonProperty("features")
    public void setFeatures(List<Object> features) {
        this.features = features;
    }

    @JsonProperty("signOnMode")
    public String getSignOnMode() {
        return signOnMode;
    }

    @JsonProperty("signOnMode")
    public void setSignOnMode(String signOnMode) {
        this.signOnMode = signOnMode;
    }

    @JsonProperty("credentials")
    public Credentials getCredentials() {
        return credentials;
    }

    @JsonProperty("credentials")
    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    @JsonProperty("settings")
    public Settings getSettings() {
        return settings;
    }

    @JsonProperty("settings")
    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    @JsonProperty("_links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

	
   

}
