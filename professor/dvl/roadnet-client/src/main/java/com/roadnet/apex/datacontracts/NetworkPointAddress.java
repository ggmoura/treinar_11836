
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NetworkPointAddress complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkPointAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}INetworkSpatial"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HouseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Locality" type="{http://roadnet.com/apex/DataContracts/}Locality" minOccurs="0"/&gt;
 *         &lt;element name="Point" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="Streets" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNetworkStreet" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkPointAddress", propOrder = {
    "houseNumber",
    "locality",
    "point",
    "streets"
})
public class NetworkPointAddress
    extends INetworkSpatial
{

    @XmlElementRef(name = "HouseNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseNumber;
    @XmlElementRef(name = "Locality", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Locality> locality;
    @XmlElementRef(name = "Point", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> point;
    @XmlElementRef(name = "Streets", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkStreet> streets;

    /**
     * Obtém o valor da propriedade houseNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHouseNumber() {
        return houseNumber;
    }

    /**
     * Define o valor da propriedade houseNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHouseNumber(JAXBElement<String> value) {
        this.houseNumber = value;
    }

    /**
     * Obtém o valor da propriedade locality.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Locality }{@code >}
     *     
     */
    public JAXBElement<Locality> getLocality() {
        return locality;
    }

    /**
     * Define o valor da propriedade locality.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Locality }{@code >}
     *     
     */
    public void setLocality(JAXBElement<Locality> value) {
        this.locality = value;
    }

    /**
     * Obtém o valor da propriedade point.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getPoint() {
        return point;
    }

    /**
     * Define o valor da propriedade point.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setPoint(JAXBElement<Coordinate> value) {
        this.point = value;
    }

    /**
     * Obtém o valor da propriedade streets.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkStreet }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkStreet> getStreets() {
        return streets;
    }

    /**
     * Define o valor da propriedade streets.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkStreet }{@code >}
     *     
     */
    public void setStreets(JAXBElement<ArrayOfNetworkStreet> value) {
        this.streets = value;
    }

}
