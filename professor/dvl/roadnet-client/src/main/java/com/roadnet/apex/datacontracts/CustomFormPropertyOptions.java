
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CustomFormPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomFormPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssignmentRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AssignmentRulesOptions" type="{http://roadnet.com/apex/DataContracts/}CustomFormAssignmentRulePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="CustomFormType_FormType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableSafeToOperateQuestion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FormControls" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FormControlsOptions" type="{http://roadnet.com/apex/DataContracts/}FormControlAssignmentPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "CustomFormPropertyOptions", propOrder = {
    "assignmentRules",
    "assignmentRulesOptions",
    "customFormTypeFormType",
    "description",
    "enableSafeToOperateQuestion",
    "formControls",
    "formControlsOptions",
    "identifier",
    "isHidden",
    "isRequired",
    "usedForIntegration"
})
public class CustomFormPropertyOptions
    extends VisibleInMultipleRegionsAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "AssignmentRules")
    protected Boolean assignmentRules;
    @XmlElementRef(name = "AssignmentRulesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomFormAssignmentRulePropertyOptions> assignmentRulesOptions;
    @XmlElement(name = "CustomFormType_FormType")
    protected Boolean customFormTypeFormType;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "EnableSafeToOperateQuestion")
    protected Boolean enableSafeToOperateQuestion;
    @XmlElement(name = "FormControls")
    protected Boolean formControls;
    @XmlElementRef(name = "FormControlsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<FormControlAssignmentPropertyOptions> formControlsOptions;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
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
     *     {@link Boolean }
     *     
     */
    public Boolean isAssignmentRules() {
        return assignmentRules;
    }

    /**
     * Define o valor da propriedade assignmentRules.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignmentRules(Boolean value) {
        this.assignmentRules = value;
    }

    /**
     * Obtém o valor da propriedade assignmentRulesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomFormAssignmentRulePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<CustomFormAssignmentRulePropertyOptions> getAssignmentRulesOptions() {
        return assignmentRulesOptions;
    }

    /**
     * Define o valor da propriedade assignmentRulesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomFormAssignmentRulePropertyOptions }{@code >}
     *     
     */
    public void setAssignmentRulesOptions(JAXBElement<CustomFormAssignmentRulePropertyOptions> value) {
        this.assignmentRulesOptions = value;
    }

    /**
     * Obtém o valor da propriedade customFormTypeFormType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomFormTypeFormType() {
        return customFormTypeFormType;
    }

    /**
     * Define o valor da propriedade customFormTypeFormType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomFormTypeFormType(Boolean value) {
        this.customFormTypeFormType = value;
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
     *     {@link Boolean }
     *     
     */
    public Boolean isFormControls() {
        return formControls;
    }

    /**
     * Define o valor da propriedade formControls.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFormControls(Boolean value) {
        this.formControls = value;
    }

    /**
     * Obtém o valor da propriedade formControlsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FormControlAssignmentPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<FormControlAssignmentPropertyOptions> getFormControlsOptions() {
        return formControlsOptions;
    }

    /**
     * Define o valor da propriedade formControlsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FormControlAssignmentPropertyOptions }{@code >}
     *     
     */
    public void setFormControlsOptions(JAXBElement<FormControlAssignmentPropertyOptions> value) {
        this.formControlsOptions = value;
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
