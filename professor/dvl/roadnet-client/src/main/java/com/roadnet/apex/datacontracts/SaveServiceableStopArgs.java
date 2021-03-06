
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de SaveServiceableStopArgs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SaveServiceableStopArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}SaveStopArgs"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdjustedFixedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedPerUnitServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="CoordinateOverride" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="Orders" type="{http://roadnet.com/apex/DataContracts/}ArrayOfSaveAssignedOrderArgs" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveServiceableStopArgs", propOrder = {
    "adjustedFixedServiceTime",
    "adjustedPerUnitServiceTime",
    "coordinateOverride",
    "orders",
    "serviceLocationEntityKey"
})
public class SaveServiceableStopArgs
    extends SaveStopArgs
{

    @XmlElementRef(name = "AdjustedFixedServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> adjustedFixedServiceTime;
    @XmlElementRef(name = "AdjustedPerUnitServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> adjustedPerUnitServiceTime;
    @XmlElementRef(name = "CoordinateOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinateOverride;
    @XmlElementRef(name = "Orders", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSaveAssignedOrderArgs> orders;
    @XmlElement(name = "ServiceLocationEntityKey")
    protected Long serviceLocationEntityKey;

    /**
     * Obtém o valor da propriedade adjustedFixedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getAdjustedFixedServiceTime() {
        return adjustedFixedServiceTime;
    }

    /**
     * Define o valor da propriedade adjustedFixedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setAdjustedFixedServiceTime(JAXBElement<Duration> value) {
        this.adjustedFixedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade adjustedPerUnitServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getAdjustedPerUnitServiceTime() {
        return adjustedPerUnitServiceTime;
    }

    /**
     * Define o valor da propriedade adjustedPerUnitServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setAdjustedPerUnitServiceTime(JAXBElement<Duration> value) {
        this.adjustedPerUnitServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade coordinateOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getCoordinateOverride() {
        return coordinateOverride;
    }

    /**
     * Define o valor da propriedade coordinateOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setCoordinateOverride(JAXBElement<Coordinate> value) {
        this.coordinateOverride = value;
    }

    /**
     * Obtém o valor da propriedade orders.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaveAssignedOrderArgs }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSaveAssignedOrderArgs> getOrders() {
        return orders;
    }

    /**
     * Define o valor da propriedade orders.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaveAssignedOrderArgs }{@code >}
     *     
     */
    public void setOrders(JAXBElement<ArrayOfSaveAssignedOrderArgs> value) {
        this.orders = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceLocationEntityKey() {
        return serviceLocationEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceLocationEntityKey(Long value) {
        this.serviceLocationEntityKey = value;
    }

}
