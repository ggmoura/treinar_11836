
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteStatusChangeNotification complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteStatusChangeNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}Notification"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteStatus_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteStatusChangeNotification", propOrder = {
    "routeStatusStatus"
})
public class RouteStatusChangeNotification
    extends Notification
{

    @XmlElementRef(name = "RouteStatus_Status", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeStatusStatus;

    /**
     * Obtém o valor da propriedade routeStatusStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteStatusStatus() {
        return routeStatusStatus;
    }

    /**
     * Define o valor da propriedade routeStatusStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteStatusStatus(JAXBElement<String> value) {
        this.routeStatusStatus = value;
    }

}
