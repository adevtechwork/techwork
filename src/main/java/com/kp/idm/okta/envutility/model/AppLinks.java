
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
    "kapstonellcorg654825_pingsaml_1_link",
    "oidc_client_link",
    "login"
})
public class AppLinks {

    @JsonProperty("kapstonellcorg654825_pingsaml_1_link")
    private Boolean kapstonellcorg654825Pingsaml1Link;
    @JsonProperty("oidc_client_link")
    private Boolean oidcClientLink;
    @JsonProperty("login")
    private Boolean login;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("kapstonellcorg654825_pingsaml_1_link")
    public Boolean getKapstonellcorg654825Pingsaml1Link() {
        return kapstonellcorg654825Pingsaml1Link;
    }

    @JsonProperty("kapstonellcorg654825_pingsaml_1_link")
    public void setKapstonellcorg654825Pingsaml1Link(Boolean kapstonellcorg654825Pingsaml1Link) {
        this.kapstonellcorg654825Pingsaml1Link = kapstonellcorg654825Pingsaml1Link;
    }

    @JsonProperty("oidc_client_link")
    public Boolean getOidcClientLink() {
        return oidcClientLink;
    }

    @JsonProperty("oidc_client_link")
    public void setOidcClientLink(Boolean oidcClientLink) {
        this.oidcClientLink = oidcClientLink;
    }

    @JsonProperty("login")
    public Boolean getLogin() {
        return login;
    }

    @JsonProperty("login")
    public void setLogin(Boolean login) {
        this.login = login;
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
