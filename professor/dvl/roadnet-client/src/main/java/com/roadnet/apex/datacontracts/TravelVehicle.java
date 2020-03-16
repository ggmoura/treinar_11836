
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de TravelVehicle complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TravelVehicle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Commercial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GrossWeight" type="{http://roadnet.com/apex/DataContracts/}Weight" minOccurs="0"/&gt;
 *         &lt;element name="Height" type="{http://roadnet.com/apex/DataContracts/}Length" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{http://roadnet.com/apex/DataContracts/}Length" minOccurs="0"/&gt;
 *         &lt;element name="Width" type="{http://roadnet.com/apex/DataContracts/}Length" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelVehicle", propOrder = {
    "commercial",
    "grossWeight",
    "height",
    "length",
    "width"
})
public class TravelVehicle
    extends DataTransferObject
{

    @XmlElement(name = "Commercial")
    protected Boolean commercial;
    @XmlElementRef(name = "GrossWeight", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Weight> grossWeight;
    @XmlElementRef(name = "Height", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Length> height;
    @XmlElementRef(name = "Length", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Length> length;
    @XmlElementRef(name = "Width", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Length> width;

    /**
     * Obtém o valor da propriedade commercial.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommercial() {
        return commercial;
    }

    /**
     * Define o valor da propriedade commercial.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommercial(Boolean value) {
        this.commercial = value;
    }

    /**
     * Obtém o valor da propriedade grossWeight.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Weight }{@code >}
     *     
     */
    public JAXBElement<Weight> getGrossWeight() {
        return grossWeight;
    }

    /**
     * Define o valor da propriedade grossWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Weight }{@code >}
     *     
     */
    public void setGrossWeight(JAXBElement<Weight> value) {
        this.grossWeight = value;
    }

    /**
     * Obtém o valor da propriedade height.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public JAXBElement<Length> getHeight() {
        return height;
    }

    /**
     * Define o valor da propriedade height.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public void setHeight(JAXBElement<Length> value) {
        this.height = value;
    }

    /**
     * Obtém o valor da propriedade length.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public JAXBElement<Length> getLength() {
        return length;
    }

    /**
     * Define o valor da propriedade length.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public void setLength(JAXBElement<Length> value) {
        this.length = value;
    }

    /**
     * Obtém o valor da propriedade width.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public JAXBElement<Length> getWidth() {
        return width;
    }

    /**
     * Define o valor da propriedade width.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public void setWidth(JAXBElement<Length> value) {
        this.width = value;
    }

}
