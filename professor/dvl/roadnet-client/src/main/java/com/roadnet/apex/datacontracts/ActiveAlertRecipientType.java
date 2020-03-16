
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de ActiveAlertRecipientType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ActiveAlertRecipientType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BusinessUnitBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalField1" type="{http://roadnet.com/apex/DataContracts/}ActiveAlertRecipientType.AdditionalField" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalField2" type="{http://roadnet.com/apex/DataContracts/}ActiveAlertRecipientType.AdditionalField" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalField3" type="{http://roadnet.com/apex/DataContracts/}ActiveAlertRecipientType.AdditionalField" minOccurs="0"/&gt;
 *         &lt;element name="AlertSendTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LookAheadPeriod" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="LookBackPeriod" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="ShowWorkerInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Templates" type="{http://roadnet.com/apex/DataContracts/}ArrayOfActiveAlertRecipientTypeTemplate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveAlertRecipientType", propOrder = {
    "additionalField1",
    "additionalField2",
    "additionalField3",
    "alertSendTime",
    "description",
    "identifier",
    "isDeleted",
    "lookAheadPeriod",
    "lookBackPeriod",
    "showWorkerInformation",
    "templates"
})
public class ActiveAlertRecipientType
    extends BusinessUnitBasedAggregateRootEntity
{

    @XmlElementRef(name = "AdditionalField1", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ActiveAlertRecipientTypeAdditionalField> additionalField1;
    @XmlElementRef(name = "AdditionalField2", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ActiveAlertRecipientTypeAdditionalField> additionalField2;
    @XmlElementRef(name = "AdditionalField3", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ActiveAlertRecipientTypeAdditionalField> additionalField3;
    @XmlElement(name = "AlertSendTime")
    protected Duration alertSendTime;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "LookAheadPeriod")
    protected Duration lookAheadPeriod;
    @XmlElement(name = "LookBackPeriod")
    protected Duration lookBackPeriod;
    @XmlElement(name = "ShowWorkerInformation")
    protected Boolean showWorkerInformation;
    @XmlElementRef(name = "Templates", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfActiveAlertRecipientTypeTemplate> templates;

    /**
     * Obtém o valor da propriedade additionalField1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActiveAlertRecipientTypeAdditionalField }{@code >}
     *     
     */
    public JAXBElement<ActiveAlertRecipientTypeAdditionalField> getAdditionalField1() {
        return additionalField1;
    }

    /**
     * Define o valor da propriedade additionalField1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActiveAlertRecipientTypeAdditionalField }{@code >}
     *     
     */
    public void setAdditionalField1(JAXBElement<ActiveAlertRecipientTypeAdditionalField> value) {
        this.additionalField1 = value;
    }

    /**
     * Obtém o valor da propriedade additionalField2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActiveAlertRecipientTypeAdditionalField }{@code >}
     *     
     */
    public JAXBElement<ActiveAlertRecipientTypeAdditionalField> getAdditionalField2() {
        return additionalField2;
    }

    /**
     * Define o valor da propriedade additionalField2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActiveAlertRecipientTypeAdditionalField }{@code >}
     *     
     */
    public void setAdditionalField2(JAXBElement<ActiveAlertRecipientTypeAdditionalField> value) {
        this.additionalField2 = value;
    }

    /**
     * Obtém o valor da propriedade additionalField3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActiveAlertRecipientTypeAdditionalField }{@code >}
     *     
     */
    public JAXBElement<ActiveAlertRecipientTypeAdditionalField> getAdditionalField3() {
        return additionalField3;
    }

    /**
     * Define o valor da propriedade additionalField3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActiveAlertRecipientTypeAdditionalField }{@code >}
     *     
     */
    public void setAdditionalField3(JAXBElement<ActiveAlertRecipientTypeAdditionalField> value) {
        this.additionalField3 = value;
    }

    /**
     * Obtém o valor da propriedade alertSendTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAlertSendTime() {
        return alertSendTime;
    }

    /**
     * Define o valor da propriedade alertSendTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAlertSendTime(Duration value) {
        this.alertSendTime = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade isDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Define o valor da propriedade isDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Obtém o valor da propriedade lookAheadPeriod.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getLookAheadPeriod() {
        return lookAheadPeriod;
    }

    /**
     * Define o valor da propriedade lookAheadPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setLookAheadPeriod(Duration value) {
        this.lookAheadPeriod = value;
    }

    /**
     * Obtém o valor da propriedade lookBackPeriod.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getLookBackPeriod() {
        return lookBackPeriod;
    }

    /**
     * Define o valor da propriedade lookBackPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setLookBackPeriod(Duration value) {
        this.lookBackPeriod = value;
    }

    /**
     * Obtém o valor da propriedade showWorkerInformation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowWorkerInformation() {
        return showWorkerInformation;
    }

    /**
     * Define o valor da propriedade showWorkerInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowWorkerInformation(Boolean value) {
        this.showWorkerInformation = value;
    }

    /**
     * Obtém o valor da propriedade templates.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfActiveAlertRecipientTypeTemplate }{@code >}
     *     
     */
    public JAXBElement<ArrayOfActiveAlertRecipientTypeTemplate> getTemplates() {
        return templates;
    }

    /**
     * Define o valor da propriedade templates.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfActiveAlertRecipientTypeTemplate }{@code >}
     *     
     */
    public void setTemplates(JAXBElement<ArrayOfActiveAlertRecipientTypeTemplate> value) {
        this.templates = value;
    }

}
