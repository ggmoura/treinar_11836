
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de RetrieveOperationalMetricsOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveOperationalMetricsOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancelledOrderCountBySource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CancelledOrderCountByType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EarliestRouteTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EarliestUnassignedOrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentCountByMotionState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentCountByOnActiveRoute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderCountByState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderCountByType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ResourceExceptionCountByAcknowledged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteCountByRouteState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeWindowCountByMissedTimeWindowType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UnacknowledgedResourceExceptionCountByRuleKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UnassignedOrderCountByType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerCountByDutyStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerCountByOnActiveRoute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveOperationalMetricsOptions", propOrder = {
    "cancelledOrderCountBySource",
    "cancelledOrderCountByType",
    "earliestRouteTime",
    "earliestUnassignedOrderDate",
    "equipmentCountByMotionState",
    "equipmentCountByOnActiveRoute",
    "orderCountByState",
    "orderCountByType",
    "orderDate",
    "resourceExceptionCountByAcknowledged",
    "routeCountByRouteState",
    "timeWindowCountByMissedTimeWindowType",
    "unacknowledgedResourceExceptionCountByRuleKey",
    "unassignedOrderCountByType",
    "workerCountByDutyStatus",
    "workerCountByOnActiveRoute"
})
public class RetrieveOperationalMetricsOptions {

    @XmlElement(name = "CancelledOrderCountBySource")
    protected Boolean cancelledOrderCountBySource;
    @XmlElement(name = "CancelledOrderCountByType")
    protected Boolean cancelledOrderCountByType;
    @XmlElement(name = "EarliestRouteTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestRouteTime;
    @XmlElement(name = "EarliestUnassignedOrderDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestUnassignedOrderDate;
    @XmlElement(name = "EquipmentCountByMotionState")
    protected Boolean equipmentCountByMotionState;
    @XmlElement(name = "EquipmentCountByOnActiveRoute")
    protected Boolean equipmentCountByOnActiveRoute;
    @XmlElement(name = "OrderCountByState")
    protected Boolean orderCountByState;
    @XmlElement(name = "OrderCountByType")
    protected Boolean orderCountByType;
    @XmlElement(name = "OrderDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "ResourceExceptionCountByAcknowledged")
    protected Boolean resourceExceptionCountByAcknowledged;
    @XmlElement(name = "RouteCountByRouteState")
    protected Boolean routeCountByRouteState;
    @XmlElement(name = "TimeWindowCountByMissedTimeWindowType")
    protected Boolean timeWindowCountByMissedTimeWindowType;
    @XmlElement(name = "UnacknowledgedResourceExceptionCountByRuleKey")
    protected Boolean unacknowledgedResourceExceptionCountByRuleKey;
    @XmlElement(name = "UnassignedOrderCountByType")
    protected Boolean unassignedOrderCountByType;
    @XmlElement(name = "WorkerCountByDutyStatus")
    protected Boolean workerCountByDutyStatus;
    @XmlElement(name = "WorkerCountByOnActiveRoute")
    protected Boolean workerCountByOnActiveRoute;

    /**
     * Obtém o valor da propriedade cancelledOrderCountBySource.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelledOrderCountBySource() {
        return cancelledOrderCountBySource;
    }

    /**
     * Define o valor da propriedade cancelledOrderCountBySource.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelledOrderCountBySource(Boolean value) {
        this.cancelledOrderCountBySource = value;
    }

    /**
     * Obtém o valor da propriedade cancelledOrderCountByType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelledOrderCountByType() {
        return cancelledOrderCountByType;
    }

    /**
     * Define o valor da propriedade cancelledOrderCountByType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelledOrderCountByType(Boolean value) {
        this.cancelledOrderCountByType = value;
    }

    /**
     * Obtém o valor da propriedade earliestRouteTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestRouteTime() {
        return earliestRouteTime;
    }

    /**
     * Define o valor da propriedade earliestRouteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestRouteTime(XMLGregorianCalendar value) {
        this.earliestRouteTime = value;
    }

    /**
     * Obtém o valor da propriedade earliestUnassignedOrderDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestUnassignedOrderDate() {
        return earliestUnassignedOrderDate;
    }

    /**
     * Define o valor da propriedade earliestUnassignedOrderDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestUnassignedOrderDate(XMLGregorianCalendar value) {
        this.earliestUnassignedOrderDate = value;
    }

    /**
     * Obtém o valor da propriedade equipmentCountByMotionState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentCountByMotionState() {
        return equipmentCountByMotionState;
    }

    /**
     * Define o valor da propriedade equipmentCountByMotionState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentCountByMotionState(Boolean value) {
        this.equipmentCountByMotionState = value;
    }

    /**
     * Obtém o valor da propriedade equipmentCountByOnActiveRoute.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentCountByOnActiveRoute() {
        return equipmentCountByOnActiveRoute;
    }

    /**
     * Define o valor da propriedade equipmentCountByOnActiveRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentCountByOnActiveRoute(Boolean value) {
        this.equipmentCountByOnActiveRoute = value;
    }

    /**
     * Obtém o valor da propriedade orderCountByState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderCountByState() {
        return orderCountByState;
    }

    /**
     * Define o valor da propriedade orderCountByState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderCountByState(Boolean value) {
        this.orderCountByState = value;
    }

    /**
     * Obtém o valor da propriedade orderCountByType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderCountByType() {
        return orderCountByType;
    }

    /**
     * Define o valor da propriedade orderCountByType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderCountByType(Boolean value) {
        this.orderCountByType = value;
    }

    /**
     * Obtém o valor da propriedade orderDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Define o valor da propriedade orderDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Obtém o valor da propriedade resourceExceptionCountByAcknowledged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResourceExceptionCountByAcknowledged() {
        return resourceExceptionCountByAcknowledged;
    }

    /**
     * Define o valor da propriedade resourceExceptionCountByAcknowledged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResourceExceptionCountByAcknowledged(Boolean value) {
        this.resourceExceptionCountByAcknowledged = value;
    }

    /**
     * Obtém o valor da propriedade routeCountByRouteState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteCountByRouteState() {
        return routeCountByRouteState;
    }

    /**
     * Define o valor da propriedade routeCountByRouteState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteCountByRouteState(Boolean value) {
        this.routeCountByRouteState = value;
    }

    /**
     * Obtém o valor da propriedade timeWindowCountByMissedTimeWindowType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeWindowCountByMissedTimeWindowType() {
        return timeWindowCountByMissedTimeWindowType;
    }

    /**
     * Define o valor da propriedade timeWindowCountByMissedTimeWindowType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeWindowCountByMissedTimeWindowType(Boolean value) {
        this.timeWindowCountByMissedTimeWindowType = value;
    }

    /**
     * Obtém o valor da propriedade unacknowledgedResourceExceptionCountByRuleKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnacknowledgedResourceExceptionCountByRuleKey() {
        return unacknowledgedResourceExceptionCountByRuleKey;
    }

    /**
     * Define o valor da propriedade unacknowledgedResourceExceptionCountByRuleKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnacknowledgedResourceExceptionCountByRuleKey(Boolean value) {
        this.unacknowledgedResourceExceptionCountByRuleKey = value;
    }

    /**
     * Obtém o valor da propriedade unassignedOrderCountByType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnassignedOrderCountByType() {
        return unassignedOrderCountByType;
    }

    /**
     * Define o valor da propriedade unassignedOrderCountByType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnassignedOrderCountByType(Boolean value) {
        this.unassignedOrderCountByType = value;
    }

    /**
     * Obtém o valor da propriedade workerCountByDutyStatus.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerCountByDutyStatus() {
        return workerCountByDutyStatus;
    }

    /**
     * Define o valor da propriedade workerCountByDutyStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerCountByDutyStatus(Boolean value) {
        this.workerCountByDutyStatus = value;
    }

    /**
     * Obtém o valor da propriedade workerCountByOnActiveRoute.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerCountByOnActiveRoute() {
        return workerCountByOnActiveRoute;
    }

    /**
     * Define o valor da propriedade workerCountByOnActiveRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerCountByOnActiveRoute(Boolean value) {
        this.workerCountByOnActiveRoute = value;
    }

}
