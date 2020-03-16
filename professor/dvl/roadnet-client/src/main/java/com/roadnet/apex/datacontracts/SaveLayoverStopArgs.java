
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SaveLayoverStopArgs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SaveLayoverStopArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}SaveStopArgs"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Coordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="Departure" type="{http://roadnet.com/apex/DataContracts/}LayoverDeparture" minOccurs="0"/&gt;
 *         &lt;element name="EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Paid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlacementType_PlacementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeZone" type="{http://roadnet.com/apex/DataContracts/}WorldTimeZone" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveLayoverStopArgs", propOrder = {
    "coordinate",
    "departure",
    "entityKey",
    "layoverLocationEntityKey",
    "paid",
    "placementTypePlacementType",
    "timeZone"
})
public class SaveLayoverStopArgs
    extends SaveStopArgs
{

    @XmlElementRef(name = "Coordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinate;
    @XmlElementRef(name = "Departure", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LayoverDeparture> departure;
    @XmlElementRef(name = "EntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> entityKey;
    @XmlElementRef(name = "LayoverLocationEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> layoverLocationEntityKey;
    @XmlElement(name = "Paid")
    protected Boolean paid;
    @XmlElementRef(name = "PlacementType_PlacementType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> placementTypePlacementType;
    @XmlElement(name = "TimeZone")
    @XmlSchemaType(name = "string")
    protected WorldTimeZone timeZone;

    /**
     * Obtém o valor da propriedade coordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getCoordinate() {
        return coordinate;
    }

    /**
     * Define o valor da propriedade coordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setCoordinate(JAXBElement<Coordinate> value) {
        this.coordinate = value;
    }

    /**
     * Obtém o valor da propriedade departure.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LayoverDeparture }{@code >}
     *     
     */
    public JAXBElement<LayoverDeparture> getDeparture() {
        return departure;
    }

    /**
     * Define o valor da propriedade departure.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LayoverDeparture }{@code >}
     *     
     */
    public void setDeparture(JAXBElement<LayoverDeparture> value) {
        this.departure = value;
    }

    /**
     * Obtém o valor da propriedade entityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEntityKey() {
        return entityKey;
    }

    /**
     * Define o valor da propriedade entityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEntityKey(JAXBElement<Long> value) {
        this.entityKey = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLayoverLocationEntityKey() {
        return layoverLocationEntityKey;
    }

    /**
     * Define o valor da propriedade layoverLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLayoverLocationEntityKey(JAXBElement<Long> value) {
        this.layoverLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade paid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaid() {
        return paid;
    }

    /**
     * Define o valor da propriedade paid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaid(Boolean value) {
        this.paid = value;
    }

    /**
     * Obtém o valor da propriedade placementTypePlacementType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlacementTypePlacementType() {
        return placementTypePlacementType;
    }

    /**
     * Define o valor da propriedade placementTypePlacementType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlacementTypePlacementType(JAXBElement<String> value) {
        this.placementTypePlacementType = value;
    }

    /**
     * Obtém o valor da propriedade timeZone.
     * 
     * @return
     *     possible object is
     *     {@link WorldTimeZone }
     *     
     */
    public WorldTimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * Define o valor da propriedade timeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link WorldTimeZone }
     *     
     */
    public void setTimeZone(WorldTimeZone value) {
        this.timeZone = value;
    }

}
