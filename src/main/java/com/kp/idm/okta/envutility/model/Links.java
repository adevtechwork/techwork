
package com.kp.idm.okta.envutility.model;

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
    "help",
    "metadata",
    "appLinks",
    "groups",
    "logo",
    "users",
    "deactivate",
    "activate"
})
public class Links {

    @JsonProperty("help")
    private Help help;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("appLinks")
    private List<AppLink> appLinks = null;
    @JsonProperty("groups")
    private Groups groups;
    @JsonProperty("logo")
    private List<Logo> logo = null;
    @JsonProperty("users")
    private Users users;
    @JsonProperty("deactivate")
    private Deactivate deactivate;
    @JsonProperty("activate")
    private Activate activate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("help")
    public Help getHelp() {
        return help;
    }

    @JsonProperty("help")
    public void setHelp(Help help) {
        this.help = help;
    }

    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @JsonProperty("appLinks")
    public List<AppLink> getAppLinks() {
        return appLinks;
    }

    @JsonProperty("appLinks")
    public void setAppLinks(List<AppLink> appLinks) {
        this.appLinks = appLinks;
    }

    @JsonProperty("groups")
    public Groups getGroups() {
        return groups;
    }

    @JsonProperty("groups")
    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    @JsonProperty("logo")
    public List<Logo> getLogo() {
        return logo;
    }

    @JsonProperty("logo")
    public void setLogo(List<Logo> logo) {
        this.logo = logo;
    }

    @JsonProperty("users")
    public Users getUsers() {
        return users;
    }

    @JsonProperty("users")
    public void setUsers(Users users) {
        this.users = users;
    }

    @JsonProperty("deactivate")
    public Deactivate getDeactivate() {
        return deactivate;
    }

    @JsonProperty("deactivate")
    public void setDeactivate(Deactivate deactivate) {
        this.deactivate = deactivate;
    }

    @JsonProperty("activate")
    public Activate getActivate() {
        return activate;
    }

    @JsonProperty("activate")
    public void setActivate(Activate activate) {
        this.activate = activate;
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
