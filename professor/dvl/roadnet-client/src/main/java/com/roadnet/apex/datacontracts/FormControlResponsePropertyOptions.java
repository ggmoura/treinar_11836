
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de FormControlResponsePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FormControlResponsePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AnsweredTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FormControlEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FormControlIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RepetitionNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormControlResponsePropertyOptions", propOrder = {
    "answeredTime",
    "formControlEntityKey",
    "formControlIdentifier",
    "repetitionNumber",
    "sequence",
    "value"
})
public class FormControlResponsePropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "AnsweredTime")
    protected Boolean answeredTime;
    @XmlElement(name = "FormControlEntityKey")
    protected Boolean formControlEntityKey;
    @XmlElement(name = "FormControlIdentifier")
    protected Boolean formControlIdentifier;
    @XmlElement(name = "RepetitionNumber")
    protected Boolean repetitionNumber;
    @XmlElement(name = "Sequence")
    protected Boolean sequence;
    @XmlElement(name = "Value")
    protected Boolean value;

    /**
     * Obtém o valor da propriedade answeredTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnsweredTime() {
        return answeredTime;
    }

    /**
     * Define o valor da propriedade answeredTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnsweredTime(Boolean value) {
        this.answeredTime = value;
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
     * Obtém o valor da propriedade formControlIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFormControlIdentifier() {
        return formControlIdentifier;
    }

    /**
     * Define o valor da propriedade formControlIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFormControlIdentifier(Boolean value) {
        this.formControlIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade repetitionNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRepetitionNumber() {
        return repetitionNumber;
    }

    /**
     * Define o valor da propriedade repetitionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepetitionNumber(Boolean value) {
        this.repetitionNumber = value;
    }

    /**
     * Obtém o valor da propriedade sequence.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSequence() {
        return sequence;
    }

    /**
     * Define o valor da propriedade sequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSequence(Boolean value) {
        this.sequence = value;
    }

    /**
     * Obtém o valor da propriedade value.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValue() {
        return value;
    }

    /**
     * Define o valor da propriedade value.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValue(Boolean value) {
        this.value = value;
    }

}
