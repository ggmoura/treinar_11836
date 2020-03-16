
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PasswordPolicyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PasswordPolicyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowUsernameMatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationNotificationDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExpireAfterDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HistoryLength" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumLength" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumLowercaseCharacterCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumNumericCharacterCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumSpecialCharacterCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumUppercaseCharacterCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PasswordPolicyOptions", propOrder = {
    "allowUsernameMatch",
    "expirationEnabled",
    "expirationNotificationDays",
    "expireAfterDays",
    "historyLength",
    "minimumLength",
    "minimumLowercaseCharacterCount",
    "minimumNumericCharacterCount",
    "minimumSpecialCharacterCount",
    "minimumUppercaseCharacterCount"
})
public class PasswordPolicyOptions {

    @XmlElement(name = "AllowUsernameMatch")
    protected Boolean allowUsernameMatch;
    @XmlElement(name = "ExpirationEnabled")
    protected Boolean expirationEnabled;
    @XmlElement(name = "ExpirationNotificationDays")
    protected Boolean expirationNotificationDays;
    @XmlElement(name = "ExpireAfterDays")
    protected Boolean expireAfterDays;
    @XmlElement(name = "HistoryLength")
    protected Boolean historyLength;
    @XmlElement(name = "MinimumLength")
    protected Boolean minimumLength;
    @XmlElement(name = "MinimumLowercaseCharacterCount")
    protected Boolean minimumLowercaseCharacterCount;
    @XmlElement(name = "MinimumNumericCharacterCount")
    protected Boolean minimumNumericCharacterCount;
    @XmlElement(name = "MinimumSpecialCharacterCount")
    protected Boolean minimumSpecialCharacterCount;
    @XmlElement(name = "MinimumUppercaseCharacterCount")
    protected Boolean minimumUppercaseCharacterCount;

    /**
     * Obtém o valor da propriedade allowUsernameMatch.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowUsernameMatch() {
        return allowUsernameMatch;
    }

    /**
     * Define o valor da propriedade allowUsernameMatch.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowUsernameMatch(Boolean value) {
        this.allowUsernameMatch = value;
    }

    /**
     * Obtém o valor da propriedade expirationEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpirationEnabled() {
        return expirationEnabled;
    }

    /**
     * Define o valor da propriedade expirationEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpirationEnabled(Boolean value) {
        this.expirationEnabled = value;
    }

    /**
     * Obtém o valor da propriedade expirationNotificationDays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpirationNotificationDays() {
        return expirationNotificationDays;
    }

    /**
     * Define o valor da propriedade expirationNotificationDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpirationNotificationDays(Boolean value) {
        this.expirationNotificationDays = value;
    }

    /**
     * Obtém o valor da propriedade expireAfterDays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpireAfterDays() {
        return expireAfterDays;
    }

    /**
     * Define o valor da propriedade expireAfterDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpireAfterDays(Boolean value) {
        this.expireAfterDays = value;
    }

    /**
     * Obtém o valor da propriedade historyLength.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHistoryLength() {
        return historyLength;
    }

    /**
     * Define o valor da propriedade historyLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHistoryLength(Boolean value) {
        this.historyLength = value;
    }

    /**
     * Obtém o valor da propriedade minimumLength.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumLength() {
        return minimumLength;
    }

    /**
     * Define o valor da propriedade minimumLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumLength(Boolean value) {
        this.minimumLength = value;
    }

    /**
     * Obtém o valor da propriedade minimumLowercaseCharacterCount.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumLowercaseCharacterCount() {
        return minimumLowercaseCharacterCount;
    }

    /**
     * Define o valor da propriedade minimumLowercaseCharacterCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumLowercaseCharacterCount(Boolean value) {
        this.minimumLowercaseCharacterCount = value;
    }

    /**
     * Obtém o valor da propriedade minimumNumericCharacterCount.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumNumericCharacterCount() {
        return minimumNumericCharacterCount;
    }

    /**
     * Define o valor da propriedade minimumNumericCharacterCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumNumericCharacterCount(Boolean value) {
        this.minimumNumericCharacterCount = value;
    }

    /**
     * Obtém o valor da propriedade minimumSpecialCharacterCount.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumSpecialCharacterCount() {
        return minimumSpecialCharacterCount;
    }

    /**
     * Define o valor da propriedade minimumSpecialCharacterCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumSpecialCharacterCount(Boolean value) {
        this.minimumSpecialCharacterCount = value;
    }

    /**
     * Obtém o valor da propriedade minimumUppercaseCharacterCount.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumUppercaseCharacterCount() {
        return minimumUppercaseCharacterCount;
    }

    /**
     * Define o valor da propriedade minimumUppercaseCharacterCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumUppercaseCharacterCount(Boolean value) {
        this.minimumUppercaseCharacterCount = value;
    }

}
