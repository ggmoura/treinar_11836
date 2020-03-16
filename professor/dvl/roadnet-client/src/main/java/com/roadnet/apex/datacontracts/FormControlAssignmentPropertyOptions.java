
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de FormControlAssignmentPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FormControlAssignmentPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FormControlEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FormControlType_FormControlType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCommentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsResponseRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ParentSequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormControlAssignmentPropertyOptions", propOrder = {
    "condition",
    "formControlEntityKey",
    "formControlTypeFormControlType",
    "isCommentRequired",
    "isResponseRequired",
    "parentSequence",
    "sequenceNumber"
})
public class FormControlAssignmentPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "Condition")
    protected Boolean condition;
    @XmlElement(name = "FormControlEntityKey")
    protected Boolean formControlEntityKey;
    @XmlElement(name = "FormControlType_FormControlType")
    protected Boolean formControlTypeFormControlType;
    @XmlElement(name = "IsCommentRequired")
    protected Boolean isCommentRequired;
    @XmlElement(name = "IsResponseRequired")
    protected Boolean isResponseRequired;
    @XmlElement(name = "ParentSequence")
    protected Boolean parentSequence;
    @XmlElement(name = "SequenceNumber")
    protected Boolean sequenceNumber;

    /**
     * Obtém o valor da propriedade condition.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCondition() {
        return condition;
    }

    /**
     * Define o valor da propriedade condition.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCondition(Boolean value) {
        this.condition = value;
    }

    /**
     * Obtém o valor da propriedade formControlEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFormControlEntityKey() {
        return formControlEntityKey;
    }

    /**
     * Define o valor da propriedade formControlEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFormControlEntityKey(Boolean value) {
        this.formControlEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade formControlTypeFormControlType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFormControlTypeFormControlType() {
        return formControlTypeFormControlType;
    }

    /**
     * Define o valor da propriedade formControlTypeFormControlType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFormControlTypeFormControlType(Boolean value) {
        this.formControlTypeFormControlType = value;
    }

    /**
     * Obtém o valor da propriedade isCommentRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCommentRequired() {
        return isCommentRequired;
    }

    /**
     * Define o valor da propriedade isCommentRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCommentRequired(Boolean value) {
        this.isCommentRequired = value;
    }

    /**
     * Obtém o valor da propriedade isResponseRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsResponseRequired() {
        return isResponseRequired;
    }

    /**
     * Define o valor da propriedade isResponseRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsResponseRequired(Boolean value) {
        this.isResponseRequired = value;
    }

    /**
     * Obtém o valor da propriedade parentSequence.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParentSequence() {
        return parentSequence;
    }

    /**
     * Define o valor da propriedade parentSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParentSequence(Boolean value) {
        this.parentSequence = value;
    }

    /**
     * Obtém o valor da propriedade sequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Define o valor da propriedade sequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSequenceNumber(Boolean value) {
        this.sequenceNumber = value;
    }

}
