
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.ImmutableObject;


/**
 * <p>Classe Java de Color complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Color"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}ImmutableObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Alpha" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="Blue" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="Green" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="Red" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Color", propOrder = {
    "alpha",
    "blue",
    "green",
    "red"
})
public class Color
    extends ImmutableObject
{

    @XmlElement(name = "Alpha")
    @XmlSchemaType(name = "unsignedByte")
    protected Short alpha;
    @XmlElement(name = "Blue")
    @XmlSchemaType(name = "unsignedByte")
    protected Short blue;
    @XmlElement(name = "Green")
    @XmlSchemaType(name = "unsignedByte")
    protected Short green;
    @XmlElement(name = "Red")
    @XmlSchemaType(name = "unsignedByte")
    protected Short red;

    /**
     * Obtém o valor da propriedade alpha.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAlpha() {
        return alpha;
    }

    /**
     * Define o valor da propriedade alpha.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAlpha(Short value) {
        this.alpha = value;
    }

    /**
     * Obtém o valor da propriedade blue.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBlue() {
        return blue;
    }

    /**
     * Define o valor da propriedade blue.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBlue(Short value) {
        this.blue = value;
    }

    /**
     * Obtém o valor da propriedade green.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGreen() {
        return green;
    }

    /**
     * Define o valor da propriedade green.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGreen(Short value) {
        this.green = value;
    }

    /**
     * Obtém o valor da propriedade red.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRed() {
        return red;
    }

    /**
     * Define o valor da propriedade red.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRed(Short value) {
        this.red = value;
    }

}
