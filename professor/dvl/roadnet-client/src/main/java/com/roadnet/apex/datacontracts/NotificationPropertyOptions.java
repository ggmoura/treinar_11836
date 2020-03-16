
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de NotificationPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NotificationPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotificationType_NotificationType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RecipientEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationPropertyOptions", propOrder = {
    "notificationTypeNotificationType",
    "recipientEntityKey",
    "route",
    "routeEntityKey",
    "telematicsDeviceEntityKey",
    "workerEntityKey"
})
public class NotificationPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "NotificationType_NotificationType")
    protected Boolean notificationTypeNotificationType;
    @XmlElement(name = "RecipientEntityKey")
    protected Boolean recipientEntityKey;
    @XmlElement(name = "Route")
    protected Boolean route;
    @XmlElement(name = "RouteEntityKey")
    protected Boolean routeEntityKey;
    @XmlElement(name = "TelematicsDeviceEntityKey")
    protected Boolean telematicsDeviceEntityKey;
    @XmlElement(name = "WorkerEntityKey")
    protected Boolean workerEntityKey;

    /**
     * Obtém o valor da propriedade notificationTypeNotificationType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotificationTypeNotificationType() {
        return notificationTypeNotificationType;
    }

    /**
     * Define o valor da propriedade notificationTypeNotificationType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotificationTypeNotificationType(Boolean value) {
        this.notificationTypeNotificationType = value;
    }

    /**
     * Obtém o valor da propriedade recipientEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecipientEntityKey() {
        return recipientEntityKey;
    }

    /**
     * Define o valor da propriedade recipientEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecipientEntityKey(Boolean value) {
        this.recipientEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade route.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoute() {
        return route;
    }

    /**
     * Define o valor da propriedade route.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoute(Boolean value) {
        this.route = value;
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
     * Obtém o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelematicsDeviceEntityKey() {
        return telematicsDeviceEntityKey;
    }

    /**
     * Define o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelematicsDeviceEntityKey(Boolean value) {
        this.telematicsDeviceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade workerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerEntityKey() {
        return workerEntityKey;
    }

    /**
     * Define o valor da propriedade workerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerEntityKey(Boolean value) {
        this.workerEntityKey = value;
    }

}
