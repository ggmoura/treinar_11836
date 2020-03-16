
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de InternalMilesAheadNotification complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="InternalMilesAheadNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}Notification"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangedRouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RouteChangeNotification_ChangeType_ChangeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternalMilesAheadNotification", propOrder = {
    "changedRouteEntityKey",
    "routeChangeNotificationChangeTypeChangeType"
})
public class InternalMilesAheadNotification
    extends Notification
{

    @XmlElementRef(name = "ChangedRouteEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> changedRouteEntityKey;
    @XmlElementRef(name = "RouteChangeNotification_ChangeType_ChangeType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeChangeNotificationChangeTypeChangeType;

    /**
     * Obtém o valor da propriedade changedRouteEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getChangedRouteEntityKey() {
        return changedRouteEntityKey;
    }

    /**
     * Define o valor da propriedade changedRouteEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setChangedRouteEntityKey(JAXBElement<Long> value) {
        this.changedRouteEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeChangeNotificationChangeTypeChangeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteChangeNotificationChangeTypeChangeType() {
        return routeChangeNotificationChangeTypeChangeType;
    }

    /**
     * Define o valor da propriedade routeChangeNotificationChangeTypeChangeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteChangeNotificationChangeTypeChangeType(JAXBElement<String> value) {
        this.routeChangeNotificationChangeTypeChangeType = value;
    }

}
