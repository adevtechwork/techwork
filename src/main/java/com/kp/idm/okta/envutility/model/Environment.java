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
    "id",
    "name",
    "values",
    "_postman_variable_scope",
    "_postman_exported_at",
    "_postman_exported_using"
})
public class Environment {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("values")
    private List<Value> values = null;
    @JsonProperty("_postman_variable_scope")
    private String postmanVariableScope;
    @JsonProperty("_postman_exported_at")
    private String postmanExportedAt;
    @JsonProperty("_postman_exported_using")
    private String postmanExportedUsing;
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

    @JsonProperty("values")
    public List<Value> getValues() {
        return values;
    }

    @JsonProperty("values")
    public void setValues(List<Value> values) {
        this.values = values;
    }

    @JsonProperty("_postman_variable_scope")
    public String getPostmanVariableScope() {
        return postmanVariableScope;
    }

    @JsonProperty("_postman_variable_scope")
    public void setPostmanVariableScope(String postmanVariableScope) {
        this.postmanVariableScope = postmanVariableScope;
    }

    @JsonProperty("_postman_exported_at")
    public String getPostmanExportedAt() {
        return postmanExportedAt;
    }

    @JsonProperty("_postman_exported_at")
    public void setPostmanExportedAt(String postmanExportedAt) {
        this.postmanExportedAt = postmanExportedAt;
    }

    @JsonProperty("_postman_exported_using")
    public String getPostmanExportedUsing() {
        return postmanExportedUsing;
    }

    @JsonProperty("_postman_exported_using")
    public void setPostmanExportedUsing(String postmanExportedUsing) {
        this.postmanExportedUsing = postmanExportedUsing;
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
