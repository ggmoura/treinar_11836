
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de CustomFormInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomFormInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomFormDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomFormEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CustomFormIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAssignmentRules" type="{http://roadnet.com/apex/DataContracts/}ArrayOfCustomFormAssignmentRule" minOccurs="0"/&gt;
 *         &lt;element name="EnableSafeToOperateQuestion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FormControls" type="{http://roadnet.com/apex/DataContracts/}ArrayOfFormControlInfo" minOccurs="0"/&gt;
 *         &lt;element name="IsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PerformedAt_DefaultFor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFormInfo", propOrder = {
    "customFormDescription",
    "customFormEntityKey",
    "customFormIdentifier",
    "dynamicAssignmentRules",
    "enableSafeToOperateQuestion",
    "formControls",
    "isRequired",
    "performedAtDefaultFor"
})
public class CustomFormInfo
    extends DataTransferObject
{

    @XmlElementRef(name = "CustomFormDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customFormDescription;
    @XmlElement(name = "CustomFormEntityKey")
    protected Long customFormEntityKey;
    @XmlElementRef(name = "CustomFormIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customFormIdentifier;
    @XmlElementRef(name = "DynamicAssignmentRules", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCustomFormAssignmentRule> dynamicAssignmentRules;
    @XmlElement(name = "EnableSafeToOperateQuestion")
    protected Boolean enableSafeToOperateQuestion;
    @XmlElementRef(name = "FormControls", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFormControlInfo> formControls;
    @XmlElement(name = "IsRequired")
    protected Boolean isRequired;
    @XmlElementRef(name = "PerformedAt_DefaultFor", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> performedAtDefaultFor;

    /**
     * Obtém o valor da propriedade customFormDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomFormDescription() {
        return customFormDescription;
    }

    /**
     * Define o valor da propriedade customFormDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomFormDescription(JAXBElement<String> value) {
        this.customFormDescription = value;
    }

    /**
     * Obtém o valor da propriedade customFormEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomFormEntityKey() {
        return customFormEntityKey;
    }

    /**
     * Define o valor da propriedade customFormEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomFormEntityKey(Long value) {
        this.customFormEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade customFormIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomFormIdentifier() {
        return customFormIdentifier;
    }

    /**
     * Define o valor da propriedade customFormIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomFormIdentifier(JAXBElement<String> value) {
        this.customFormIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade dynamicAssignmentRules.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomFormAssignmentRule }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCustomFormAssignmentRule> getDynamicAssignmentRules() {
        return dynamicAssignmentRules;
    }

    /**
     * Define o valor da propriedade dynamicAssignmentRules.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomFormAssignmentRule }{@code >}
     *     
     */
    public void setDynamicAssignmentRules(JAXBElement<ArrayOfCustomFormAssignmentRule> value) {
        this.dynamicAssignmentRules = value;
    }

    /**
     * Obtém o valor da propriedade enableSafeToOperateQuestion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableSafeToOperateQuestion() {
        return enableSafeToOperateQuestion;
    }

    /**
     * Define o valor da propriedade enableSafeToOperateQuestion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableSafeToOperateQuestion(Boolean value) {
        this.enableSafeToOperateQuestion = value;
    }

    /**
     * Obtém o valor da propriedade formControls.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFormControlInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFormControlInfo> getFormControls() {
        return formControls;
    }

    /**
     * Define o valor da propriedade formControls.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFormControlInfo }{@code >}
     *     
     */
    public void setFormControls(JAXBElement<ArrayOfFormControlInfo> value) {
        this.formControls = value;
    }

    /**
     * Obtém o valor da propriedade isRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRequired() {
        return isRequired;
    }

    /**
     * Define o valor da propriedade isRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRequired(Boolean value) {
        this.isRequired = value;
    }

    /**
     * Obtém o valor da propriedade performedAtDefaultFor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerformedAtDefaultFor() {
        return performedAtDefaultFor;
    }

    /**
     * Define o valor da propriedade performedAtDefaultFor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerformedAtDefaultFor(JAXBElement<String> value) {
        this.performedAtDefaultFor = value;
    }

}
