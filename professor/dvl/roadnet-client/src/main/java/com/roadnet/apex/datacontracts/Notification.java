
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.RequestDeviceToCheckInNotification;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.TelematicsDeviceIgnitionKillSwitchNotification;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.TelematicsDeviceOutputChangeNotification;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.TelematicsDeviceParameterChangeNotification;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.TelematicsDeviceRequestRebootNotification;


/**
 * <p>Classe Java de Notification complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Notification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NotificationType_NotificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipientEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notification", propOrder = {
    "eventTime",
    "notificationTypeNotificationType",
    "recipientEntityKey",
    "routeEntityKey",
    "telematicsDeviceEntityKey",
    "workerEntityKey"
})
@XmlSeeAlso({
    CorrespondenceSentNotification.class,
    RouteOptimizationNotification.class,
    RouteTenderNotification.class,
    InternalMilesAheadNotification.class,
    RouteDepartedNotification.class,
    RouteLoadedNotification.class,
    WorkerLoginStateNotification.class,
    StopDeliveryDetailsUpdateNotification.class,
    RouteStatusChangeNotification.class,
    RoutePhaseChangeNotification.class,
    RouteStateChangeNotification.class,
    StopStateChangeNotification.class,
    RouteChangeNotification.class,
    StopSequenceNotification.class,
    TextMessageNotification.class,
    RequestDeviceToCheckInNotification.class,
    TelematicsDeviceIgnitionKillSwitchNotification.class,
    TelematicsDeviceOutputChangeNotification.class,
    TelematicsDeviceParameterChangeNotification.class,
    TelematicsDeviceRequestRebootNotification.class
})
public class Notification
    extends AggregateRootEntity
{

    @XmlElementRef(name = "EventTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> eventTime;
    @XmlElementRef(name = "NotificationType_NotificationType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notificationTypeNotificationType;
    @XmlElement(name = "RecipientEntityKey")
    protected Long recipientEntityKey;
    @XmlElementRef(name = "RouteEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> routeEntityKey;
    @XmlElementRef(name = "TelematicsDeviceEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> telematicsDeviceEntityKey;
    @XmlElementRef(name = "WorkerEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> workerEntityKey;

    /**
     * Obtém o valor da propriedade eventTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEventTime() {
        return eventTime;
    }

    /**
     * Define o valor da propriedade eventTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEventTime(JAXBElement<XMLGregorianCalendar> value) {
        this.eventTime = value;
    }

    /**
     * Obtém o valor da propriedade notificationTypeNotificationType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotificationTypeNotificationType() {
        return notificationTypeNotificationType;
    }

    /**
     * Define o valor da propriedade notificationTypeNotificationType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotificationTypeNotificationType(JAXBElement<String> value) {
        this.notificationTypeNotificationType = value;
    }

    /**
     * Obtém o valor da propriedade recipientEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecipientEntityKey() {
        return recipientEntityKey;
    }

    /**
     * Define o valor da propriedade recipientEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecipientEntityKey(Long value) {
        this.recipientEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRouteEntityKey() {
        return routeEntityKey;
    }

    /**
     * Define o valor da propriedade routeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRouteEntityKey(JAXBElement<Long> value) {
        this.routeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTelematicsDeviceEntityKey() {
        return telematicsDeviceEntityKey;
    }

    /**
     * Define o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTelematicsDeviceEntityKey(JAXBElement<Long> value) {
        this.telematicsDeviceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade workerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getWorkerEntityKey() {
        return workerEntityKey;
    }

    /**
     * Define o valor da propriedade workerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setWorkerEntityKey(JAXBElement<Long> value) {
        this.workerEntityKey = value;
    }

}
