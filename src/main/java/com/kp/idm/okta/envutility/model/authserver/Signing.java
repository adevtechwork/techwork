
package com.kp.idm.okta.envutility.model.authserver;

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
    "rotationMode",
    "lastRotated",
    "nextRotation",
    "kid"
})
public class Signing {

    @JsonProperty("rotationMode")
    private String rotationMode;
    @JsonProperty("lastRotated")
    private String lastRotated;
    @JsonProperty("nextRotation")
    private String nextRotation;
    @JsonProperty("kid")
    private String kid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rotationMode")
    public String getRotationMode() {
        return rotationMode;
    }

    @JsonProperty("rotationMode")
    public void setRotationMode(String rotationMode) {
        this.rotationMode = rotationMode;
    }

    @JsonProperty("lastRotated")
    public String getLastRotated() {
        return lastRotated;
    }

    @JsonProperty("lastRotated")
    public void setLastRotated(String lastRotated) {
        this.lastRotated = lastRotated;
    }

    @JsonProperty("nextRotation")
    public String getNextRotation() {
        return nextRotation;
    }

    @JsonProperty("nextRotation")
    public void setNextRotation(String nextRotation) {
        this.nextRotation = nextRotation;
    }

    @JsonProperty("kid")
    public String getKid() {
        return kid;
    }

    @JsonProperty("kid")
    public void setKid(String kid) {
        this.kid = kid;
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
