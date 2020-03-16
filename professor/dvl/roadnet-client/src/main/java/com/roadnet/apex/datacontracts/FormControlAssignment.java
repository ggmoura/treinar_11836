
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de FormControlAssignment complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FormControlAssignment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FormControlEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FormControlType_FormControlType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsCommentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsResponseRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ParentSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormControlAssignment", propOrder = {
    "condition",
    "formControlEntityKey",
    "formControlTypeFormControlType",
    "isCommentRequired",
    "isResponseRequired",
    "parentSequence",
    "sequenceNumber"
})
public class FormControlAssignment
    extends DomainEntity
{

    @XmlElementRef(name = "Condition", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> condition;
    @XmlElementRef(name = "FormControlEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> formControlEntityKey;
    @XmlElementRef(name = "FormControlType_FormControlType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formControlTypeFormControlType;
    @XmlElement(name = "IsCommentRequired")
    protected Boolean isCommentRequired;
    @XmlElement(name = "IsResponseRequired")
    protected Boolean isResponseRequired;
    @XmlElementRef(name = "ParentSequence", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentSequence;
    @XmlElement(name = "SequenceNumber")
    protected Integer sequenceNumber;

    /**
     * Obtém o valor da propriedade condition.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCondition() {
        return condition;
    }

    /**
     * Define o valor da propriedade condition.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCondition(JAXBElement<String> value) {
        this.condition = value;
    }

    /**
     * Obtém o valor da propriedade formControlEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getFormControlEntityKey() {
        return formControlEntityKey;
    }

    /**
     * Define o valor da propriedade formControlEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setFormControlEntityKey(JAXBElement<Long> value) {
        this.formControlEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade formControlTypeFormControlType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormControlTypeFormControlType() {
        return formControlTypeFormControlType;
    }

    /**
     * Define o valor da propriedade formControlTypeFormControlType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormControlTypeFormControlType(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentSequence() {
        return parentSequence;
    }

    /**
     * Define o valor da propriedade parentSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentSequence(JAXBElement<String> value) {
        this.parentSequence = value;
    }

    /**
     * Obtém o valor da propriedade sequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Define o valor da propriedade sequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNumber(Integer value) {
        this.sequenceNumber = value;
    }

}
