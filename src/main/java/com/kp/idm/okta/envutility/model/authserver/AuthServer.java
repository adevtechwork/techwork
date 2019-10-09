
package com.kp.idm.okta.envutility.model.authserver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "description",
    "audiences",
    "issuer",
    "issuerMode",
    "status",
    "created",
    "lastUpdated",
    "credentials",
    "_links"
})
public class AuthServer {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("audiences")
    private List<String> audiences = null;
    @JsonProperty("issuer")
    private String issuer;
    @JsonProperty("issuerMode")
    private String issuerMode;
    @JsonProperty("status")
    private String status;
    @JsonProperty("created")
    private String created;
    @JsonProperty("lastUpdated")
    private String lastUpdated;
    @JsonProperty("credentials")
    private Credentials credentials;
    @JsonProperty("_links")
    private Links links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("audiences")
    public List<String> getAudiences() {
        return audiences;
    }

    @JsonProperty("audiences")
    public void setAudiences(List<String> audiences) {
        this.audiences = audiences;
    }

    @JsonProperty("issuer")
    public String getIssuer() {
        return issuer;
    }

    @JsonProperty("issuer")
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @JsonProperty("issuerMode")
    public String getIssuerMode() {
        return issuerMode;
    }

    @JsonProperty("issuerMode")
    public void setIssuerMode(String issuerMode) {
        this.issuerMode = issuerMode;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("lastUpdated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("lastUpdated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("credentials")
    public Credentials getCredentials() {
        return credentials;
    }

    @JsonProperty("credentials")
    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    @JsonProperty("_links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
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
