
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
    "autoSubmitToolbar",
    "hide",
    "appLinks"
})
public class Visibility {

    @JsonProperty("autoSubmitToolbar")
    private Boolean autoSubmitToolbar;
    @JsonProperty("hide")
    private Hide hide;
    @JsonProperty("appLinks")
    private AppLinks appLinks;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("autoSubmitToolbar")
    public Boolean getAutoSubmitToolbar() {
        return autoSubmitToolbar;
    }

    @JsonProperty("autoSubmitToolbar")
    public void setAutoSubmitToolbar(Boolean autoSubmitToolbar) {
        this.autoSubmitToolbar = autoSubmitToolbar;
    }

    @JsonProperty("hide")
    public Hide getHide() {
        return hide;
    }

    @JsonProperty("hide")
    public void setHide(Hide hide) {
        this.hide = hide;
    }

    @JsonProperty("appLinks")
    public AppLinks getAppLinks() {
        return appLinks;
    }

    @JsonProperty("appLinks")
    public void setAppLinks(AppLinks appLinks) {
        this.appLinks = appLinks;
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
