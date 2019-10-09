
package com.kp.idm.okta.envutility.model.groups;

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
    "self",
    "group"
})
public class Links {

    @JsonProperty("app")
    private App app;
    @JsonProperty("self")
    private Self self;
    @JsonProperty("group")
    private Group group;
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

    @JsonProperty("self")
    public Self getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(Self self) {
        this.self = self;
    }

    @JsonProperty("group")
    public Group getGroup() {
        return group;
    }

    @JsonProperty("group")
    public void setGroup(Group group) {
        this.group = group;
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
