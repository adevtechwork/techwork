
package com.kp.idm.okta.envutility.model.group;

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
    "created",
    "lastUpdated",
    "lastMembershipUpdated",
    "objectClass",
    "type",
    "profile",
    "_links"
})
public class ApplicationGroup {

    @JsonProperty("id")
    private String id;
    @JsonProperty("created")
    private String created;
    @JsonProperty("lastUpdated")
    private String lastUpdated;
    @JsonProperty("lastMembershipUpdated")
    private String lastMembershipUpdated;
    @JsonProperty("objectClass")
    private List<String> objectClass = null;
    @JsonProperty("type")
    private String type;
    @JsonProperty("profile")
    private Profile profile;
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

    @JsonProperty("lastMembershipUpdated")
    public String getLastMembershipUpdated() {
        return lastMembershipUpdated;
    }

    @JsonProperty("lastMembershipUpdated")
    public void setLastMembershipUpdated(String lastMembershipUpdated) {
        this.lastMembershipUpdated = lastMembershipUpdated;
    }

    @JsonProperty("objectClass")
    public List<String> getObjectClass() {
        return objectClass;
    }

    @JsonProperty("objectClass")
    public void setObjectClass(List<String> objectClass) {
        this.objectClass = objectClass;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("profile")
    public Profile getProfile() {
        return profile;
    }

    @JsonProperty("profile")
    public void setProfile(Profile profile) {
        this.profile = profile;
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
