
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de FormControlInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FormControlInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FormControl" type="{http://roadnet.com/apex/DataContracts/}FormControl" minOccurs="0"/&gt;
 *         &lt;element name="FormControlType_FormControlType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormControlInfo", propOrder = {
    "commentRequired",
    "condition",
    "formControl",
    "formControlTypeFormControlType",
    "parentSequence",
    "required",
    "sequence"
})
public class FormControlInfo
    extends DataTransferObject
{

    @XmlElement(name = "CommentRequired")
    protected Boolean commentRequired;
    @XmlElementRef(name = "Condition", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> condition;
    @XmlElementRef(name = "FormControl", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<FormControl> formControl;
    @XmlElementRef(name = "FormControlType_FormControlType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formControlTypeFormControlType;
    @XmlElementRef(name = "ParentSequence", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentSequence;
    @XmlElement(name = "Required")
    protected Boolean required;
    @XmlElement(name = "Sequence")
    protected Integer sequence;

    /**
     * Obtém o valor da propriedade commentRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommentRequired() {
        return commentRequired;
    }

    /**
     * Define o valor da propriedade commentRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommentRequired(Boolean value) {
        this.commentRequired = value;
    }

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
     * Obtém o valor da propriedade formControl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FormControl }{@code >}
     *     
     */
    public JAXBElement<FormControl> getFormControl() {
        return formControl;
    }

    /**
     * Define o valor da propriedade formControl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FormControl }{@code >}
     *     
     */
    public void setFormControl(JAXBElement<FormControl> value) {
        this.formControl = value;
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
     * Obtém o valor da propriedade required.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Define o valor da propriedade required.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * Obtém o valor da propriedade sequence.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Define o valor da propriedade sequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(Integer value) {
        this.sequence = value;
    }

}
