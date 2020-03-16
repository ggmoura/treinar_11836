
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteChangeNotification complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteChangeNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}Notification"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineItems" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRouteChangeNotification.ChangedEntity" minOccurs="0"/&gt;
 *         &lt;element name="Orders" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRouteChangeNotification.ChangedEntity" minOccurs="0"/&gt;
 *         &lt;element name="Stops" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRouteChangeNotification.ChangedStop" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteChangeNotification", propOrder = {
    "lineItems",
    "orders",
    "stops"
})
public class RouteChangeNotification
    extends Notification
{

    @XmlElementRef(name = "LineItems", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteChangeNotificationChangedEntity> lineItems;
    @XmlElementRef(name = "Orders", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteChangeNotificationChangedEntity> orders;
    @XmlElementRef(name = "Stops", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteChangeNotificationChangedStop> stops;

    /**
     * Obtém o valor da propriedade lineItems.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteChangeNotificationChangedEntity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteChangeNotificationChangedEntity> getLineItems() {
        return lineItems;
    }

    /**
     * Define o valor da propriedade lineItems.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteChangeNotificationChangedEntity }{@code >}
     *     
     */
    public void setLineItems(JAXBElement<ArrayOfRouteChangeNotificationChangedEntity> value) {
        this.lineItems = value;
    }

    /**
     * Obtém o valor da propriedade orders.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteChangeNotificationChangedEntity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteChangeNotificationChangedEntity> getOrders() {
        return orders;
    }

    /**
     * Define o valor da propriedade orders.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteChangeNotificationChangedEntity }{@code >}
     *     
     */
    public void setOrders(JAXBElement<ArrayOfRouteChangeNotificationChangedEntity> value) {
        this.orders = value;
    }

    /**
     * Obtém o valor da propriedade stops.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteChangeNotificationChangedStop }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteChangeNotificationChangedStop> getStops() {
        return stops;
    }

    /**
     * Define o valor da propriedade stops.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteChangeNotificationChangedStop }{@code >}
     *     
     */
    public void setStops(JAXBElement<ArrayOfRouteChangeNotificationChangedStop> value) {
        this.stops = value;
    }

}
