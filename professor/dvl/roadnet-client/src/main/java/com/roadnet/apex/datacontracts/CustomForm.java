
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CustomForm complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssignmentRules" type="{http://roadnet.com/apex/DataContracts/}ArrayOfCustomFormAssignmentRule" minOccurs="0"/&gt;
 *         &lt;element name="CustomFormType_FormType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnableSafeToOperateQuestion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FormControls" type="{http://roadnet.com/apex/DataContracts/}ArrayOfFormControlAssignment" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsHidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UsedForIntegration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomForm", propOrder = {
    "assignmentRules",
    "customFormTypeFormType",
    "description",
    "enableSafeToOperateQuestion",
    "formControls",
    "identifier",
    "isHidden",
    "isRequired",
    "usedForIntegration"
})
public class CustomForm
    extends VisibleInMultipleRegionsAggregateRootEntity
{

    @XmlElementRef(name = "AssignmentRules", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCustomFormAssignmentRule> assignmentRules;
    @XmlElementRef(name = "CustomFormType_FormType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customFormTypeFormType;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "EnableSafeToOperateQuestion")
    protected Boolean enableSafeToOperateQuestion;
    @XmlElementRef(name = "FormControls", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFormControlAssignment> formControls;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "IsHidden")
    protected Boolean isHidden;
    @XmlElement(name = "IsRequired")
    protected Boolean isRequired;
    @XmlElement(name = "UsedForIntegration")
    protected Boolean usedForIntegration;

    /**
     * Obtém o valor da propriedade assignmentRules.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomFormAssignmentRule }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCustomFormAssignmentRule> getAssignmentRules() {
        return assignmentRules;
    }

    /**
     * Define o valor da propriedade assignmentRules.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomFormAssignmentRule }{@code >}
     *     
     */
    public void setAssignmentRules(JAXBElement<ArrayOfCustomFormAssignmentRule> value) {
        this.assignmentRules = value;
    }

    /**
     * Obtém o valor da propriedade customFormTypeFormType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomFormTypeFormType() {
        return customFormTypeFormType;
    }

    /**
     * Define o valor da propriedade customFormTypeFormType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomFormTypeFormType(JAXBElement<String> value) {
        this.customFormTypeFormType = value;
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfFormControlAssignment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFormControlAssignment> getFormControls() {
        return formControls;
    }

    /**
     * Define o valor da propriedade formControls.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFormControlAssignment }{@code >}
     *     
     */
    public void setFormControls(JAXBElement<ArrayOfFormControlAssignment> value) {
        this.formControls = value;
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
     * Obtém o valor da propriedade isHidden.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Define o valor da propriedade isHidden.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHidden(Boolean value) {
        this.isHidden = value;
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
     * Obtém o valor da propriedade usedForIntegration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsedForIntegration() {
        return usedForIntegration;
    }

    /**
     * Define o valor da propriedade usedForIntegration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsedForIntegration(Boolean value) {
        this.usedForIntegration = value;
    }

}
