
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
    "logo",
    "users",
    "apps"
})
public class Links {

    @JsonProperty("logo")
    private List<Logo> logo = null;
    @JsonProperty("users")
    private Users users;
    @JsonProperty("apps")
    private Apps apps;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("apps")
    public Apps getApps() {
        return apps;
    }

    @JsonProperty("apps")
    public void setApps(Apps apps) {
        this.apps = apps;
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
