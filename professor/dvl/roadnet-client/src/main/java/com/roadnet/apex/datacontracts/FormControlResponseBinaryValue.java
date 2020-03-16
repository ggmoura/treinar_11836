
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FormControlResponseBinaryValue complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FormControlResponseBinaryValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}FormControlResponseValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BinaryDataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BinaryValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="TextValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormControlResponseBinaryValue", propOrder = {
    "binaryDataType",
    "binaryValue",
    "textValue"
})
public class FormControlResponseBinaryValue
    extends FormControlResponseValue
{

    @XmlElementRef(name = "BinaryDataType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> binaryDataType;
    @XmlElementRef(name = "BinaryValue", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> binaryValue;
    @XmlElementRef(name = "TextValue", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textValue;

    /**
     * Obtém o valor da propriedade binaryDataType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBinaryDataType() {
        return binaryDataType;
    }

    /**
     * Define o valor da propriedade binaryDataType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBinaryDataType(JAXBElement<String> value) {
        this.binaryDataType = value;
    }

    /**
     * Obtém o valor da propriedade binaryValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getBinaryValue() {
        return binaryValue;
    }

    /**
     * Define o valor da propriedade binaryValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setBinaryValue(JAXBElement<byte[]> value) {
        this.binaryValue = value;
    }

    /**
     * Obtém o valor da propriedade textValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextValue() {
        return textValue;
    }

    /**
     * Define o valor da propriedade textValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextValue(JAXBElement<String> value) {
        this.textValue = value;
    }

}
