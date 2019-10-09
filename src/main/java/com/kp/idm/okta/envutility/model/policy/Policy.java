
package com.kp.idm.okta.envutility.model.policy;

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
    "type",
    "id",
    "status",
    "name",
    "description",
    "priority",
    "system",
    "conditions",
    "created",
    "lastUpdated",
    "_links"
})
public class Policy {

    @JsonProperty("type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("status")
    private String status;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("priority")
    private Integer priority;
    @JsonProperty("system")
    private Boolean system;
    @JsonProperty("conditions")
    private Conditions conditions;
    @JsonProperty("created")
    private String created;
    @JsonProperty("lastUpdated")
    private String lastUpdated;
    @JsonProperty("_links")
    private Links links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
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
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @JsonProperty("system")
    public Boolean getSystem() {
        return system;
    }

    @JsonProperty("system")
    public void setSystem(Boolean system) {
        this.system = system;
    }

    @JsonProperty("conditions")
    public Conditions getConditions() {
        return conditions;
    }

    @JsonProperty("conditions")
    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
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
