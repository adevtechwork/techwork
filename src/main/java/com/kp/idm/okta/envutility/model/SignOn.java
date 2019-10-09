
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
    "defaultRelayState",
    "ssoAcsUrl",
    "idpIssuer",
    "audience",
    "recipient",
    "destination",
    "subjectNameIdTemplate",
    "subjectNameIdFormat",
    "responseSigned",
    "assertionSigned",
    "signatureAlgorithm",
    "digestAlgorithm",
    "honorForceAuthn",
    "authnContextClassRef",
    "spIssuer",
    "requestCompressed",
    "attributeStatements",
    "ssoAcsUrlOverride",
    "audienceOverride",
    "recipientOverride",
    "destinationOverride"
})
public class SignOn {

    @JsonProperty("defaultRelayState")
    private Object defaultRelayState;
    @JsonProperty("ssoAcsUrl")
    private String ssoAcsUrl;
    @JsonProperty("idpIssuer")
    private String idpIssuer;
    @JsonProperty("audience")
    private String audience;
    @JsonProperty("recipient")
    private String recipient;
    @JsonProperty("destination")
    private String destination;
    @JsonProperty("subjectNameIdTemplate")
    private String subjectNameIdTemplate;
    @JsonProperty("subjectNameIdFormat")
    private String subjectNameIdFormat;
    @JsonProperty("responseSigned")
    private Boolean responseSigned;
    @JsonProperty("assertionSigned")
    private Boolean assertionSigned;
    @JsonProperty("signatureAlgorithm")
    private String signatureAlgorithm;
    @JsonProperty("digestAlgorithm")
    private String digestAlgorithm;
    @JsonProperty("honorForceAuthn")
    private Boolean honorForceAuthn;
    @JsonProperty("authnContextClassRef")
    private String authnContextClassRef;
    @JsonProperty("spIssuer")
    private Object spIssuer;
    @JsonProperty("requestCompressed")
    private Boolean requestCompressed;
    @JsonProperty("attributeStatements")
    private List<AttributeStatement> attributeStatements = null;
    @JsonProperty("ssoAcsUrlOverride")
    private Object ssoAcsUrlOverride;
    @JsonProperty("audienceOverride")
    private Object audienceOverride;
    @JsonProperty("recipientOverride")
    private Object recipientOverride;
    @JsonProperty("destinationOverride")
    private Object destinationOverride;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("defaultRelayState")
    public Object getDefaultRelayState() {
        return defaultRelayState;
    }

    @JsonProperty("defaultRelayState")
    public void setDefaultRelayState(Object defaultRelayState) {
        this.defaultRelayState = defaultRelayState;
    }

    @JsonProperty("ssoAcsUrl")
    public String getSsoAcsUrl() {
        return ssoAcsUrl;
    }

    @JsonProperty("ssoAcsUrl")
    public void setSsoAcsUrl(String ssoAcsUrl) {
        this.ssoAcsUrl = ssoAcsUrl;
    }

    @JsonProperty("idpIssuer")
    public String getIdpIssuer() {
        return idpIssuer;
    }

    @JsonProperty("idpIssuer")
    public void setIdpIssuer(String idpIssuer) {
        this.idpIssuer = idpIssuer;
    }

    @JsonProperty("audience")
    public String getAudience() {
        return audience;
    }

    @JsonProperty("audience")
    public void setAudience(String audience) {
        this.audience = audience;
    }

    @JsonProperty("recipient")
    public String getRecipient() {
        return recipient;
    }

    @JsonProperty("recipient")
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @JsonProperty("subjectNameIdTemplate")
    public String getSubjectNameIdTemplate() {
        return subjectNameIdTemplate;
    }

    @JsonProperty("subjectNameIdTemplate")
    public void setSubjectNameIdTemplate(String subjectNameIdTemplate) {
        this.subjectNameIdTemplate = subjectNameIdTemplate;
    }

    @JsonProperty("subjectNameIdFormat")
    public String getSubjectNameIdFormat() {
        return subjectNameIdFormat;
    }

    @JsonProperty("subjectNameIdFormat")
    public void setSubjectNameIdFormat(String subjectNameIdFormat) {
        this.subjectNameIdFormat = subjectNameIdFormat;
    }

    @JsonProperty("responseSigned")
    public Boolean getResponseSigned() {
        return responseSigned;
    }

    @JsonProperty("responseSigned")
    public void setResponseSigned(Boolean responseSigned) {
        this.responseSigned = responseSigned;
    }

    @JsonProperty("assertionSigned")
    public Boolean getAssertionSigned() {
        return assertionSigned;
    }

    @JsonProperty("assertionSigned")
    public void setAssertionSigned(Boolean assertionSigned) {
        this.assertionSigned = assertionSigned;
    }

    @JsonProperty("signatureAlgorithm")
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    @JsonProperty("signatureAlgorithm")
    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    @JsonProperty("digestAlgorithm")
    public String getDigestAlgorithm() {
        return digestAlgorithm;
    }

    @JsonProperty("digestAlgorithm")
    public void setDigestAlgorithm(String digestAlgorithm) {
        this.digestAlgorithm = digestAlgorithm;
    }

    @JsonProperty("honorForceAuthn")
    public Boolean getHonorForceAuthn() {
        return honorForceAuthn;
    }

    @JsonProperty("honorForceAuthn")
    public void setHonorForceAuthn(Boolean honorForceAuthn) {
        this.honorForceAuthn = honorForceAuthn;
    }

    @JsonProperty("authnContextClassRef")
    public String getAuthnContextClassRef() {
        return authnContextClassRef;
    }

    @JsonProperty("authnContextClassRef")
    public void setAuthnContextClassRef(String authnContextClassRef) {
        this.authnContextClassRef = authnContextClassRef;
    }

    @JsonProperty("spIssuer")
    public Object getSpIssuer() {
        return spIssuer;
    }

    @JsonProperty("spIssuer")
    public void setSpIssuer(Object spIssuer) {
        this.spIssuer = spIssuer;
    }

    @JsonProperty("requestCompressed")
    public Boolean getRequestCompressed() {
        return requestCompressed;
    }

    @JsonProperty("requestCompressed")
    public void setRequestCompressed(Boolean requestCompressed) {
        this.requestCompressed = requestCompressed;
    }

    @JsonProperty("attributeStatements")
    public List<AttributeStatement> getAttributeStatements() {
        return attributeStatements;
    }

    @JsonProperty("attributeStatements")
    public void setAttributeStatements(List<AttributeStatement> attributeStatements) {
        this.attributeStatements = attributeStatements;
    }

    @JsonProperty("ssoAcsUrlOverride")
    public Object getSsoAcsUrlOverride() {
        return ssoAcsUrlOverride;
    }

    @JsonProperty("ssoAcsUrlOverride")
    public void setSsoAcsUrlOverride(Object ssoAcsUrlOverride) {
        this.ssoAcsUrlOverride = ssoAcsUrlOverride;
    }

    @JsonProperty("audienceOverride")
    public Object getAudienceOverride() {
        return audienceOverride;
    }

    @JsonProperty("audienceOverride")
    public void setAudienceOverride(Object audienceOverride) {
        this.audienceOverride = audienceOverride;
    }

    @JsonProperty("recipientOverride")
    public Object getRecipientOverride() {
        return recipientOverride;
    }

    @JsonProperty("recipientOverride")
    public void setRecipientOverride(Object recipientOverride) {
        this.recipientOverride = recipientOverride;
    }

    @JsonProperty("destinationOverride")
    public Object getDestinationOverride() {
        return destinationOverride;
    }

    @JsonProperty("destinationOverride")
    public void setDestinationOverride(Object destinationOverride) {
        this.destinationOverride = destinationOverride;
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
