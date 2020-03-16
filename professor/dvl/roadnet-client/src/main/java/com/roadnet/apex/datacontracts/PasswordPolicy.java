
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de PasswordPolicy complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PasswordPolicy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowUsernameMatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationNotificationDays" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ExpireAfterDays" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="HistoryLength" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="MinimumLength" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="MinimumLowercaseCharacterCount" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="MinimumNumericCharacterCount" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="MinimumSpecialCharacterCount" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="MinimumUppercaseCharacterCount" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PasswordPolicy", propOrder = {
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
public class PasswordPolicy
    extends DataTransferObject
{

    @XmlElement(name = "AllowUsernameMatch")
    protected Boolean allowUsernameMatch;
    @XmlElement(name = "ExpirationEnabled")
    protected Boolean expirationEnabled;
    @XmlElement(name = "ExpirationNotificationDays")
    protected Short expirationNotificationDays;
    @XmlElement(name = "ExpireAfterDays")
    protected Short expireAfterDays;
    @XmlElement(name = "HistoryLength")
    protected Short historyLength;
    @XmlElement(name = "MinimumLength")
    protected Short minimumLength;
    @XmlElement(name = "MinimumLowercaseCharacterCount")
    protected Short minimumLowercaseCharacterCount;
    @XmlElement(name = "MinimumNumericCharacterCount")
    protected Short minimumNumericCharacterCount;
    @XmlElement(name = "MinimumSpecialCharacterCount")
    protected Short minimumSpecialCharacterCount;
    @XmlElement(name = "MinimumUppercaseCharacterCount")
    protected Short minimumUppercaseCharacterCount;

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
     *     {@link Short }
     *     
     */
    public Short getExpirationNotificationDays() {
        return expirationNotificationDays;
    }

    /**
     * Define o valor da propriedade expirationNotificationDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setExpirationNotificationDays(Short value) {
        this.expirationNotificationDays = value;
    }

    /**
     * Obtém o valor da propriedade expireAfterDays.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getExpireAfterDays() {
        return expireAfterDays;
    }

    /**
     * Define o valor da propriedade expireAfterDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setExpireAfterDays(Short value) {
        this.expireAfterDays = value;
    }

    /**
     * Obtém o valor da propriedade historyLength.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getHistoryLength() {
        return historyLength;
    }

    /**
     * Define o valor da propriedade historyLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setHistoryLength(Short value) {
        this.historyLength = value;
    }

    /**
     * Obtém o valor da propriedade minimumLength.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMinimumLength() {
        return minimumLength;
    }

    /**
     * Define o valor da propriedade minimumLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMinimumLength(Short value) {
        this.minimumLength = value;
    }

    /**
     * Obtém o valor da propriedade minimumLowercaseCharacterCount.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMinimumLowercaseCharacterCount() {
        return minimumLowercaseCharacterCount;
    }

    /**
     * Define o valor da propriedade minimumLowercaseCharacterCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMinimumLowercaseCharacterCount(Short value) {
        this.minimumLowercaseCharacterCount = value;
    }

    /**
     * Obtém o valor da propriedade minimumNumericCharacterCount.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMinimumNumericCharacterCount() {
        return minimumNumericCharacterCount;
    }

    /**
     * Define o valor da propriedade minimumNumericCharacterCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMinimumNumericCharacterCount(Short value) {
        this.minimumNumericCharacterCount = value;
    }

    /**
     * Obtém o valor da propriedade minimumSpecialCharacterCount.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMinimumSpecialCharacterCount() {
        return minimumSpecialCharacterCount;
    }

    /**
     * Define o valor da propriedade minimumSpecialCharacterCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMinimumSpecialCharacterCount(Short value) {
        this.minimumSpecialCharacterCount = value;
    }

    /**
     * Obtém o valor da propriedade minimumUppercaseCharacterCount.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMinimumUppercaseCharacterCount() {
        return minimumUppercaseCharacterCount;
    }

    /**
     * Define o valor da propriedade minimumUppercaseCharacterCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMinimumUppercaseCharacterCount(Short value) {
        this.minimumUppercaseCharacterCount = value;
    }

}
