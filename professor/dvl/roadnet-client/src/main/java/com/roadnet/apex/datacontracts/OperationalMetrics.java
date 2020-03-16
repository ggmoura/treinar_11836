
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfManipulationSourceintFfzvU1AO;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfMissedTimeWindowTypeintFfzvU1AO;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfMotionStateintFfzvU1AO;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfOrderStateintFfzvU1AO;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfOrderTypeintFfzvU1AO;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfRouteStateintFfzvU1AO;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfWorkerDutyStatusintFfzvU1AO;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfbooleanint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOflongint;


/**
 * <p>Classe Java de OperationalMetrics complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OperationalMetrics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancelledOrderCountBySource" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfManipulationSourceintFfzvU1aO" minOccurs="0"/&gt;
 *         &lt;element name="CancelledOrderCountByType" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfOrderTypeintFfzvU1aO" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentCountByMotionState" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfMotionStateintFfzvU1aO" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentCountByOnActiveRoute" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfbooleanint" minOccurs="0"/&gt;
 *         &lt;element name="OrderCountByState" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfOrderStateintFfzvU1aO" minOccurs="0"/&gt;
 *         &lt;element name="OrderCountByType" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfOrderTypeintFfzvU1aO" minOccurs="0"/&gt;
 *         &lt;element name="ResourceExceptionCountByAcknowledged" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfbooleanint" minOccurs="0"/&gt;
 *         &lt;element name="RouteCountByRouteState" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfRouteStateintFfzvU1aO" minOccurs="0"/&gt;
 *         &lt;element name="TimeWindowCountByMissedTimeWindowType" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfMissedTimeWindowTypeintFfzvU1aO" minOccurs="0"/&gt;
 *         &lt;element name="UnacknowledgedResourceExceptionCountByRuleKey" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOflongint" minOccurs="0"/&gt;
 *         &lt;element name="UnassignedOrderCountByType" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfOrderTypeintFfzvU1aO" minOccurs="0"/&gt;
 *         &lt;element name="WorkerCountByDutyStatus" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfWorkerDutyStatusintFfzvU1aO" minOccurs="0"/&gt;
 *         &lt;element name="WorkerCountByOnActiveRoute" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfbooleanint" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationalMetrics", propOrder = {
    "cancelledOrderCountBySource",
    "cancelledOrderCountByType",
    "equipmentCountByMotionState",
    "equipmentCountByOnActiveRoute",
    "orderCountByState",
    "orderCountByType",
    "resourceExceptionCountByAcknowledged",
    "routeCountByRouteState",
    "timeWindowCountByMissedTimeWindowType",
    "unacknowledgedResourceExceptionCountByRuleKey",
    "unassignedOrderCountByType",
    "workerCountByDutyStatus",
    "workerCountByOnActiveRoute"
})
public class OperationalMetrics {

    @XmlElementRef(name = "CancelledOrderCountBySource", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfManipulationSourceintFfzvU1AO> cancelledOrderCountBySource;
    @XmlElementRef(name = "CancelledOrderCountByType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfOrderTypeintFfzvU1AO> cancelledOrderCountByType;
    @XmlElementRef(name = "EquipmentCountByMotionState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfMotionStateintFfzvU1AO> equipmentCountByMotionState;
    @XmlElementRef(name = "EquipmentCountByOnActiveRoute", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfbooleanint> equipmentCountByOnActiveRoute;
    @XmlElementRef(name = "OrderCountByState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfOrderStateintFfzvU1AO> orderCountByState;
    @XmlElementRef(name = "OrderCountByType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfOrderTypeintFfzvU1AO> orderCountByType;
    @XmlElementRef(name = "ResourceExceptionCountByAcknowledged", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfbooleanint> resourceExceptionCountByAcknowledged;
    @XmlElementRef(name = "RouteCountByRouteState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfRouteStateintFfzvU1AO> routeCountByRouteState;
    @XmlElementRef(name = "TimeWindowCountByMissedTimeWindowType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfMissedTimeWindowTypeintFfzvU1AO> timeWindowCountByMissedTimeWindowType;
    @XmlElementRef(name = "UnacknowledgedResourceExceptionCountByRuleKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOflongint> unacknowledgedResourceExceptionCountByRuleKey;
    @XmlElementRef(name = "UnassignedOrderCountByType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfOrderTypeintFfzvU1AO> unassignedOrderCountByType;
    @XmlElementRef(name = "WorkerCountByDutyStatus", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfWorkerDutyStatusintFfzvU1AO> workerCountByDutyStatus;
    @XmlElementRef(name = "WorkerCountByOnActiveRoute", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfbooleanint> workerCountByOnActiveRoute;

    /**
     * Obtém o valor da propriedade cancelledOrderCountBySource.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfManipulationSourceintFfzvU1AO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfManipulationSourceintFfzvU1AO> getCancelledOrderCountBySource() {
        return cancelledOrderCountBySource;
    }

    /**
     * Define o valor da propriedade cancelledOrderCountBySource.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfManipulationSourceintFfzvU1AO }{@code >}
     *     
     */
    public void setCancelledOrderCountBySource(JAXBElement<ArrayOfKeyValueOfManipulationSourceintFfzvU1AO> value) {
        this.cancelledOrderCountBySource = value;
    }

    /**
     * Obtém o valor da propriedade cancelledOrderCountByType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfOrderTypeintFfzvU1AO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfOrderTypeintFfzvU1AO> getCancelledOrderCountByType() {
        return cancelledOrderCountByType;
    }

    /**
     * Define o valor da propriedade cancelledOrderCountByType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfOrderTypeintFfzvU1AO }{@code >}
     *     
     */
    public void setCancelledOrderCountByType(JAXBElement<ArrayOfKeyValueOfOrderTypeintFfzvU1AO> value) {
        this.cancelledOrderCountByType = value;
    }

    /**
     * Obtém o valor da propriedade equipmentCountByMotionState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfMotionStateintFfzvU1AO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfMotionStateintFfzvU1AO> getEquipmentCountByMotionState() {
        return equipmentCountByMotionState;
    }

    /**
     * Define o valor da propriedade equipmentCountByMotionState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfMotionStateintFfzvU1AO }{@code >}
     *     
     */
    public void setEquipmentCountByMotionState(JAXBElement<ArrayOfKeyValueOfMotionStateintFfzvU1AO> value) {
        this.equipmentCountByMotionState = value;
    }

    /**
     * Obtém o valor da propriedade equipmentCountByOnActiveRoute.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfbooleanint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfbooleanint> getEquipmentCountByOnActiveRoute() {
        return equipmentCountByOnActiveRoute;
    }

    /**
     * Define o valor da propriedade equipmentCountByOnActiveRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfbooleanint }{@code >}
     *     
     */
    public void setEquipmentCountByOnActiveRoute(JAXBElement<ArrayOfKeyValueOfbooleanint> value) {
        this.equipmentCountByOnActiveRoute = value;
    }

    /**
     * Obtém o valor da propriedade orderCountByState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfOrderStateintFfzvU1AO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfOrderStateintFfzvU1AO> getOrderCountByState() {
        return orderCountByState;
    }

    /**
     * Define o valor da propriedade orderCountByState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfOrderStateintFfzvU1AO }{@code >}
     *     
     */
    public void setOrderCountByState(JAXBElement<ArrayOfKeyValueOfOrderStateintFfzvU1AO> value) {
        this.orderCountByState = value;
    }

    /**
     * Obtém o valor da propriedade orderCountByType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfOrderTypeintFfzvU1AO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfOrderTypeintFfzvU1AO> getOrderCountByType() {
        return orderCountByType;
    }

    /**
     * Define o valor da propriedade orderCountByType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfOrderTypeintFfzvU1AO }{@code >}
     *     
     */
    public void setOrderCountByType(JAXBElement<ArrayOfKeyValueOfOrderTypeintFfzvU1AO> value) {
        this.orderCountByType = value;
    }

    /**
     * Obtém o valor da propriedade resourceExceptionCountByAcknowledged.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfbooleanint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfbooleanint> getResourceExceptionCountByAcknowledged() {
        return resourceExceptionCountByAcknowledged;
    }

    /**
     * Define o valor da propriedade resourceExceptionCountByAcknowledged.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfbooleanint }{@code >}
     *     
     */
    public void setResourceExceptionCountByAcknowledged(JAXBElement<ArrayOfKeyValueOfbooleanint> value) {
        this.resourceExceptionCountByAcknowledged = value;
    }

    /**
     * Obtém o valor da propriedade routeCountByRouteState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfRouteStateintFfzvU1AO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfRouteStateintFfzvU1AO> getRouteCountByRouteState() {
        return routeCountByRouteState;
    }

    /**
     * Define o valor da propriedade routeCountByRouteState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfRouteStateintFfzvU1AO }{@code >}
     *     
     */
    public void setRouteCountByRouteState(JAXBElement<ArrayOfKeyValueOfRouteStateintFfzvU1AO> value) {
        this.routeCountByRouteState = value;
    }

    /**
     * Obtém o valor da propriedade timeWindowCountByMissedTimeWindowType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfMissedTimeWindowTypeintFfzvU1AO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfMissedTimeWindowTypeintFfzvU1AO> getTimeWindowCountByMissedTimeWindowType() {
        return timeWindowCountByMissedTimeWindowType;
    }

    /**
     * Define o valor da propriedade timeWindowCountByMissedTimeWindowType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfMissedTimeWindowTypeintFfzvU1AO }{@code >}
     *     
     */
    public void setTimeWindowCountByMissedTimeWindowType(JAXBElement<ArrayOfKeyValueOfMissedTimeWindowTypeintFfzvU1AO> value) {
        this.timeWindowCountByMissedTimeWindowType = value;
    }

    /**
     * Obtém o valor da propriedade unacknowledgedResourceExceptionCountByRuleKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOflongint> getUnacknowledgedResourceExceptionCountByRuleKey() {
        return unacknowledgedResourceExceptionCountByRuleKey;
    }

    /**
     * Define o valor da propriedade unacknowledgedResourceExceptionCountByRuleKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOflongint }{@code >}
     *     
     */
    public void setUnacknowledgedResourceExceptionCountByRuleKey(JAXBElement<ArrayOfKeyValueOflongint> value) {
        this.unacknowledgedResourceExceptionCountByRuleKey = value;
    }

    /**
     * Obtém o valor da propriedade unassignedOrderCountByType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfOrderTypeintFfzvU1AO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfOrderTypeintFfzvU1AO> getUnassignedOrderCountByType() {
        return unassignedOrderCountByType;
    }

    /**
     * Define o valor da propriedade unassignedOrderCountByType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfOrderTypeintFfzvU1AO }{@code >}
     *     
     */
    public void setUnassignedOrderCountByType(JAXBElement<ArrayOfKeyValueOfOrderTypeintFfzvU1AO> value) {
        this.unassignedOrderCountByType = value;
    }

    /**
     * Obtém o valor da propriedade workerCountByDutyStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfWorkerDutyStatusintFfzvU1AO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfWorkerDutyStatusintFfzvU1AO> getWorkerCountByDutyStatus() {
        return workerCountByDutyStatus;
    }

    /**
     * Define o valor da propriedade workerCountByDutyStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfWorkerDutyStatusintFfzvU1AO }{@code >}
     *     
     */
    public void setWorkerCountByDutyStatus(JAXBElement<ArrayOfKeyValueOfWorkerDutyStatusintFfzvU1AO> value) {
        this.workerCountByDutyStatus = value;
    }

    /**
     * Obtém o valor da propriedade workerCountByOnActiveRoute.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfbooleanint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfbooleanint> getWorkerCountByOnActiveRoute() {
        return workerCountByOnActiveRoute;
    }

    /**
     * Define o valor da propriedade workerCountByOnActiveRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfbooleanint }{@code >}
     *     
     */
    public void setWorkerCountByOnActiveRoute(JAXBElement<ArrayOfKeyValueOfbooleanint> value) {
        this.workerCountByOnActiveRoute = value;
    }

}
