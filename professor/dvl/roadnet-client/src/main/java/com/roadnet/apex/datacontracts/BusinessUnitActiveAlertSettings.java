
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de BusinessUnit.ActiveAlertSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BusinessUnit.ActiveAlertSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlertDateFormat_DateFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlertTimeFormat_TimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayQuantityPrecision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EarlyServiceStartBuffer" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="EmailTemplateImage1" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="EmailTemplateImage2" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="LateServiceStartBuffer" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MissedServiceWindowAdditionalGracePeriod" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MissedServiceWindowGracePeriod" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="Quantities_Field_DisplayQuantityUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoundToNearest_ServiceStartBufferRounding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderEmailAddressEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SmsProviderSettings" type="{http://roadnet.com/apex/DataContracts/}BusinessUnit.MessagingProviderSettings" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessUnit.ActiveAlertSettings", propOrder = {
    "alertDateFormatDateFormat",
    "alertTimeFormatTimeFormat",
    "displayQuantityPrecision",
    "earlyServiceStartBuffer",
    "emailTemplateImage1",
    "emailTemplateImage2",
    "lateServiceStartBuffer",
    "missedServiceWindowAdditionalGracePeriod",
    "missedServiceWindowGracePeriod",
    "quantitiesFieldDisplayQuantityUnit",
    "roundToNearestServiceStartBufferRounding",
    "senderEmailAddressEntityKey",
    "smsProviderSettings"
})
public class BusinessUnitActiveAlertSettings
    extends DataTransferObject
{

    @XmlElementRef(name = "AlertDateFormat_DateFormat", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alertDateFormatDateFormat;
    @XmlElementRef(name = "AlertTimeFormat_TimeFormat", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alertTimeFormatTimeFormat;
    @XmlElement(name = "DisplayQuantityPrecision")
    protected Integer displayQuantityPrecision;
    @XmlElement(name = "EarlyServiceStartBuffer")
    protected Duration earlyServiceStartBuffer;
    @XmlElementRef(name = "EmailTemplateImage1", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> emailTemplateImage1;
    @XmlElementRef(name = "EmailTemplateImage2", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> emailTemplateImage2;
    @XmlElement(name = "LateServiceStartBuffer")
    protected Duration lateServiceStartBuffer;
    @XmlElement(name = "MissedServiceWindowAdditionalGracePeriod")
    protected Duration missedServiceWindowAdditionalGracePeriod;
    @XmlElement(name = "MissedServiceWindowGracePeriod")
    protected Duration missedServiceWindowGracePeriod;
    @XmlElementRef(name = "Quantities_Field_DisplayQuantityUnit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quantitiesFieldDisplayQuantityUnit;
    @XmlElementRef(name = "RoundToNearest_ServiceStartBufferRounding", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roundToNearestServiceStartBufferRounding;
    @XmlElementRef(name = "SenderEmailAddressEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> senderEmailAddressEntityKey;
    @XmlElementRef(name = "SmsProviderSettings", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<BusinessUnitMessagingProviderSettings> smsProviderSettings;

    /**
     * Obtém o valor da propriedade alertDateFormatDateFormat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlertDateFormatDateFormat() {
        return alertDateFormatDateFormat;
    }

    /**
     * Define o valor da propriedade alertDateFormatDateFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlertDateFormatDateFormat(JAXBElement<String> value) {
        this.alertDateFormatDateFormat = value;
    }

    /**
     * Obtém o valor da propriedade alertTimeFormatTimeFormat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlertTimeFormatTimeFormat() {
        return alertTimeFormatTimeFormat;
    }

    /**
     * Define o valor da propriedade alertTimeFormatTimeFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlertTimeFormatTimeFormat(JAXBElement<String> value) {
        this.alertTimeFormatTimeFormat = value;
    }

    /**
     * Obtém o valor da propriedade displayQuantityPrecision.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayQuantityPrecision() {
        return displayQuantityPrecision;
    }

    /**
     * Define o valor da propriedade displayQuantityPrecision.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayQuantityPrecision(Integer value) {
        this.displayQuantityPrecision = value;
    }

    /**
     * Obtém o valor da propriedade earlyServiceStartBuffer.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEarlyServiceStartBuffer() {
        return earlyServiceStartBuffer;
    }

    /**
     * Define o valor da propriedade earlyServiceStartBuffer.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEarlyServiceStartBuffer(Duration value) {
        this.earlyServiceStartBuffer = value;
    }

    /**
     * Obtém o valor da propriedade emailTemplateImage1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getEmailTemplateImage1() {
        return emailTemplateImage1;
    }

    /**
     * Define o valor da propriedade emailTemplateImage1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setEmailTemplateImage1(JAXBElement<byte[]> value) {
        this.emailTemplateImage1 = value;
    }

    /**
     * Obtém o valor da propriedade emailTemplateImage2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getEmailTemplateImage2() {
        return emailTemplateImage2;
    }

    /**
     * Define o valor da propriedade emailTemplateImage2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setEmailTemplateImage2(JAXBElement<byte[]> value) {
        this.emailTemplateImage2 = value;
    }

    /**
     * Obtém o valor da propriedade lateServiceStartBuffer.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getLateServiceStartBuffer() {
        return lateServiceStartBuffer;
    }

    /**
     * Define o valor da propriedade lateServiceStartBuffer.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setLateServiceStartBuffer(Duration value) {
        this.lateServiceStartBuffer = value;
    }

    /**
     * Obtém o valor da propriedade missedServiceWindowAdditionalGracePeriod.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMissedServiceWindowAdditionalGracePeriod() {
        return missedServiceWindowAdditionalGracePeriod;
    }

    /**
     * Define o valor da propriedade missedServiceWindowAdditionalGracePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMissedServiceWindowAdditionalGracePeriod(Duration value) {
        this.missedServiceWindowAdditionalGracePeriod = value;
    }

    /**
     * Obtém o valor da propriedade missedServiceWindowGracePeriod.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMissedServiceWindowGracePeriod() {
        return missedServiceWindowGracePeriod;
    }

    /**
     * Define o valor da propriedade missedServiceWindowGracePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMissedServiceWindowGracePeriod(Duration value) {
        this.missedServiceWindowGracePeriod = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesFieldDisplayQuantityUnit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantitiesFieldDisplayQuantityUnit() {
        return quantitiesFieldDisplayQuantityUnit;
    }

    /**
     * Define o valor da propriedade quantitiesFieldDisplayQuantityUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantitiesFieldDisplayQuantityUnit(JAXBElement<String> value) {
        this.quantitiesFieldDisplayQuantityUnit = value;
    }

    /**
     * Obtém o valor da propriedade roundToNearestServiceStartBufferRounding.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoundToNearestServiceStartBufferRounding() {
        return roundToNearestServiceStartBufferRounding;
    }

    /**
     * Define o valor da propriedade roundToNearestServiceStartBufferRounding.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoundToNearestServiceStartBufferRounding(JAXBElement<String> value) {
        this.roundToNearestServiceStartBufferRounding = value;
    }

    /**
     * Obtém o valor da propriedade senderEmailAddressEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSenderEmailAddressEntityKey() {
        return senderEmailAddressEntityKey;
    }

    /**
     * Define o valor da propriedade senderEmailAddressEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSenderEmailAddressEntityKey(JAXBElement<Long> value) {
        this.senderEmailAddressEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade smsProviderSettings.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BusinessUnitMessagingProviderSettings }{@code >}
     *     
     */
    public JAXBElement<BusinessUnitMessagingProviderSettings> getSmsProviderSettings() {
        return smsProviderSettings;
    }

    /**
     * Define o valor da propriedade smsProviderSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BusinessUnitMessagingProviderSettings }{@code >}
     *     
     */
    public void setSmsProviderSettings(JAXBElement<BusinessUnitMessagingProviderSettings> value) {
        this.smsProviderSettings = value;
    }

}
