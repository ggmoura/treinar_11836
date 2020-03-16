
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteNotePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteNotePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepotDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FromDriver" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ImageThumbnail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsAcknowledged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Sender" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteNotePropertyOptions", propOrder = {
    "depotDescription",
    "depotIdentifier",
    "fromDriver",
    "image",
    "imageThumbnail",
    "isAcknowledged",
    "lineItemIdentifier",
    "message",
    "orderNumber",
    "routeEntityKey",
    "sender",
    "serviceLocationDescription",
    "serviceLocationIdentifier",
    "stopEntityKey",
    "stopSequenceNumber",
    "timestamp"
})
public class RouteNotePropertyOptions
    extends RegionBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "DepotDescription")
    protected Boolean depotDescription;
    @XmlElement(name = "DepotIdentifier")
    protected Boolean depotIdentifier;
    @XmlElement(name = "FromDriver")
    protected Boolean fromDriver;
    @XmlElement(name = "Image")
    protected Boolean image;
    @XmlElement(name = "ImageThumbnail")
    protected Boolean imageThumbnail;
    @XmlElement(name = "IsAcknowledged")
    protected Boolean isAcknowledged;
    @XmlElement(name = "LineItemIdentifier")
    protected Boolean lineItemIdentifier;
    @XmlElement(name = "Message")
    protected Boolean message;
    @XmlElement(name = "OrderNumber")
    protected Boolean orderNumber;
    @XmlElement(name = "RouteEntityKey")
    protected Boolean routeEntityKey;
    @XmlElement(name = "Sender")
    protected Boolean sender;
    @XmlElement(name = "ServiceLocationDescription")
    protected Boolean serviceLocationDescription;
    @XmlElement(name = "ServiceLocationIdentifier")
    protected Boolean serviceLocationIdentifier;
    @XmlElement(name = "StopEntityKey")
    protected Boolean stopEntityKey;
    @XmlElement(name = "StopSequenceNumber")
    protected Boolean stopSequenceNumber;
    @XmlElement(name = "Timestamp")
    protected Boolean timestamp;

    /**
     * Obtém o valor da propriedade depotDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepotDescription() {
        return depotDescription;
    }

    /**
     * Define o valor da propriedade depotDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepotDescription(Boolean value) {
        this.depotDescription = value;
    }

    /**
     * Obtém o valor da propriedade depotIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepotIdentifier() {
        return depotIdentifier;
    }

    /**
     * Define o valor da propriedade depotIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepotIdentifier(Boolean value) {
        this.depotIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade fromDriver.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFromDriver() {
        return fromDriver;
    }

    /**
     * Define o valor da propriedade fromDriver.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFromDriver(Boolean value) {
        this.fromDriver = value;
    }

    /**
     * Obtém o valor da propriedade image.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImage() {
        return image;
    }

    /**
     * Define o valor da propriedade image.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImage(Boolean value) {
        this.image = value;
    }

    /**
     * Obtém o valor da propriedade imageThumbnail.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImageThumbnail() {
        return imageThumbnail;
    }

    /**
     * Define o valor da propriedade imageThumbnail.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImageThumbnail(Boolean value) {
        this.imageThumbnail = value;
    }

    /**
     * Obtém o valor da propriedade isAcknowledged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAcknowledged() {
        return isAcknowledged;
    }

    /**
     * Define o valor da propriedade isAcknowledged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAcknowledged(Boolean value) {
        this.isAcknowledged = value;
    }

    /**
     * Obtém o valor da propriedade lineItemIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLineItemIdentifier() {
        return lineItemIdentifier;
    }

    /**
     * Define o valor da propriedade lineItemIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineItemIdentifier(Boolean value) {
        this.lineItemIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade message.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMessage() {
        return message;
    }

    /**
     * Define o valor da propriedade message.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMessage(Boolean value) {
        this.message = value;
    }

    /**
     * Obtém o valor da propriedade orderNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderNumber() {
        return orderNumber;
    }

    /**
     * Define o valor da propriedade orderNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderNumber(Boolean value) {
        this.orderNumber = value;
    }

    /**
     * Obtém o valor da propriedade routeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteEntityKey() {
        return routeEntityKey;
    }

    /**
     * Define o valor da propriedade routeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteEntityKey(Boolean value) {
        this.routeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade sender.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSender() {
        return sender;
    }

    /**
     * Define o valor da propriedade sender.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSender(Boolean value) {
        this.sender = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationDescription() {
        return serviceLocationDescription;
    }

    /**
     * Define o valor da propriedade serviceLocationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationDescription(Boolean value) {
        this.serviceLocationDescription = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationIdentifier() {
        return serviceLocationIdentifier;
    }

    /**
     * Define o valor da propriedade serviceLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationIdentifier(Boolean value) {
        this.serviceLocationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade stopEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopEntityKey() {
        return stopEntityKey;
    }

    /**
     * Define o valor da propriedade stopEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopEntityKey(Boolean value) {
        this.stopEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade stopSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopSequenceNumber() {
        return stopSequenceNumber;
    }

    /**
     * Define o valor da propriedade stopSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopSequenceNumber(Boolean value) {
        this.stopSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade timestamp.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimestamp() {
        return timestamp;
    }

    /**
     * Define o valor da propriedade timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimestamp(Boolean value) {
        this.timestamp = value;
    }

}
