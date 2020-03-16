
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActiveAlertRecipientTypePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ActiveAlertRecipientTypePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BusinessUnitBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveAlertRecipientTypeTemplatePropertyOptions" type="{http://roadnet.com/apex/DataContracts/}ActiveAlertRecipientTypeTemplatePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalField1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalField2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalField3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AlertSendTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LookAheadPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LookBackPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowWorkerInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Templates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveAlertRecipientTypePropertyOptions", propOrder = {
    "activeAlertRecipientTypeTemplatePropertyOptions",
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
public class ActiveAlertRecipientTypePropertyOptions
    extends BusinessUnitBasedAggregateRootEntityPropertyOptions
{

    @XmlElementRef(name = "ActiveAlertRecipientTypeTemplatePropertyOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ActiveAlertRecipientTypeTemplatePropertyOptions> activeAlertRecipientTypeTemplatePropertyOptions;
    @XmlElement(name = "AdditionalField1")
    protected Boolean additionalField1;
    @XmlElement(name = "AdditionalField2")
    protected Boolean additionalField2;
    @XmlElement(name = "AdditionalField3")
    protected Boolean additionalField3;
    @XmlElement(name = "AlertSendTime")
    protected Boolean alertSendTime;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "LookAheadPeriod")
    protected Boolean lookAheadPeriod;
    @XmlElement(name = "LookBackPeriod")
    protected Boolean lookBackPeriod;
    @XmlElement(name = "ShowWorkerInformation")
    protected Boolean showWorkerInformation;
    @XmlElement(name = "Templates")
    protected Boolean templates;

    /**
     * Obtém o valor da propriedade activeAlertRecipientTypeTemplatePropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActiveAlertRecipientTypeTemplatePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ActiveAlertRecipientTypeTemplatePropertyOptions> getActiveAlertRecipientTypeTemplatePropertyOptions() {
        return activeAlertRecipientTypeTemplatePropertyOptions;
    }

    /**
     * Define o valor da propriedade activeAlertRecipientTypeTemplatePropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActiveAlertRecipientTypeTemplatePropertyOptions }{@code >}
     *     
     */
    public void setActiveAlertRecipientTypeTemplatePropertyOptions(JAXBElement<ActiveAlertRecipientTypeTemplatePropertyOptions> value) {
        this.activeAlertRecipientTypeTemplatePropertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade additionalField1.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalField1() {
        return additionalField1;
    }

    /**
     * Define o valor da propriedade additionalField1.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalField1(Boolean value) {
        this.additionalField1 = value;
    }

    /**
     * Obtém o valor da propriedade additionalField2.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalField2() {
        return additionalField2;
    }

    /**
     * Define o valor da propriedade additionalField2.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalField2(Boolean value) {
        this.additionalField2 = value;
    }

    /**
     * Obtém o valor da propriedade additionalField3.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalField3() {
        return additionalField3;
    }

    /**
     * Define o valor da propriedade additionalField3.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalField3(Boolean value) {
        this.additionalField3 = value;
    }

    /**
     * Obtém o valor da propriedade alertSendTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlertSendTime() {
        return alertSendTime;
    }

    /**
     * Define o valor da propriedade alertSendTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlertSendTime(Boolean value) {
        this.alertSendTime = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifier(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isLookAheadPeriod() {
        return lookAheadPeriod;
    }

    /**
     * Define o valor da propriedade lookAheadPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLookAheadPeriod(Boolean value) {
        this.lookAheadPeriod = value;
    }

    /**
     * Obtém o valor da propriedade lookBackPeriod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLookBackPeriod() {
        return lookBackPeriod;
    }

    /**
     * Define o valor da propriedade lookBackPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLookBackPeriod(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isTemplates() {
        return templates;
    }

    /**
     * Define o valor da propriedade templates.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTemplates(Boolean value) {
        this.templates = value;
    }

}
