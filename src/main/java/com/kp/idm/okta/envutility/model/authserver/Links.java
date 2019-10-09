
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
    "rotateKey",
    "metadata",
    "keys",
    "claims",
    "policies",
    "self",
    "scopes",
    "deactivate"
})
public class Links {

    @JsonProperty("rotateKey")
    private RotateKey rotateKey;
    @JsonProperty("metadata")
    private List<Metadatum> metadata = null;
    @JsonProperty("keys")
    private Keys keys;
    @JsonProperty("claims")
    private Claims claims;
    @JsonProperty("policies")
    private Policies policies;
    @JsonProperty("self")
    private Self self;
    @JsonProperty("scopes")
    private Scopes scopes;
    @JsonProperty("deactivate")
    private Deactivate deactivate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rotateKey")
    public RotateKey getRotateKey() {
        return rotateKey;
    }

    @JsonProperty("rotateKey")
    public void setRotateKey(RotateKey rotateKey) {
        this.rotateKey = rotateKey;
    }

    @JsonProperty("metadata")
    public List<Metadatum> getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(List<Metadatum> metadata) {
        this.metadata = metadata;
    }

    @JsonProperty("keys")
    public Keys getKeys() {
        return keys;
    }

    @JsonProperty("keys")
    public void setKeys(Keys keys) {
        this.keys = keys;
    }

    @JsonProperty("claims")
    public Claims getClaims() {
        return claims;
    }

    @JsonProperty("claims")
    public void setClaims(Claims claims) {
        this.claims = claims;
    }

    @JsonProperty("policies")
    public Policies getPolicies() {
        return policies;
    }

    @JsonProperty("policies")
    public void setPolicies(Policies policies) {
        this.policies = policies;
    }

    @JsonProperty("self")
    public Self getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(Self self) {
        this.self = self;
    }

    @JsonProperty("scopes")
    public Scopes getScopes() {
        return scopes;
    }

    @JsonProperty("scopes")
    public void setScopes(Scopes scopes) {
        this.scopes = scopes;
    }

    @JsonProperty("deactivate")
    public Deactivate getDeactivate() {
        return deactivate;
    }

    @JsonProperty("deactivate")
    public void setDeactivate(Deactivate deactivate) {
        this.deactivate = deactivate;
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
