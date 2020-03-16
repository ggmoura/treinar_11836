
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteTenderNotification complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteTenderNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}Notification"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteTenderNotificationType_RouteTenderNotificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteTenderNotification", propOrder = {
    "routeTenderNotificationTypeRouteTenderNotificationType"
})
public class RouteTenderNotification
    extends Notification
{

    @XmlElementRef(name = "RouteTenderNotificationType_RouteTenderNotificationType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeTenderNotificationTypeRouteTenderNotificationType;

    /**
     * Obtém o valor da propriedade routeTenderNotificationTypeRouteTenderNotificationType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteTenderNotificationTypeRouteTenderNotificationType() {
        return routeTenderNotificationTypeRouteTenderNotificationType;
    }

    /**
     * Define o valor da propriedade routeTenderNotificationTypeRouteTenderNotificationType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteTenderNotificationTypeRouteTenderNotificationType(JAXBElement<String> value) {
        this.routeTenderNotificationTypeRouteTenderNotificationType = value;
    }

}
