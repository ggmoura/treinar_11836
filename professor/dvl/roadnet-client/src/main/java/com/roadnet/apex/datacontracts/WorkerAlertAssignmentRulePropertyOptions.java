
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de WorkerAlertAssignmentRulePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WorkerAlertAssignmentRulePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BusinessUnitBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderAssignmentCriteria" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteAssignmentCriteria" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationAssignmentCriteria" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerAlertEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerAlertTriggerProximity_TriggerProximity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkerAlertAssignmentRulePropertyOptions", propOrder = {
    "description",
    "entityType",
    "orderAssignmentCriteria",
    "routeAssignmentCriteria",
    "serviceLocationAssignmentCriteria",
    "workerAlertEntityKey",
    "workerAlertTriggerProximityTriggerProximity"
})
public class WorkerAlertAssignmentRulePropertyOptions
    extends BusinessUnitBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "EntityType")
    protected Boolean entityType;
    @XmlElement(name = "OrderAssignmentCriteria")
    protected Boolean orderAssignmentCriteria;
    @XmlElement(name = "RouteAssignmentCriteria")
    protected Boolean routeAssignmentCriteria;
    @XmlElement(name = "ServiceLocationAssignmentCriteria")
    protected Boolean serviceLocationAssignmentCriteria;
    @XmlElement(name = "WorkerAlertEntityKey")
    protected Boolean workerAlertEntityKey;
    @XmlElement(name = "WorkerAlertTriggerProximity_TriggerProximity")
    protected Boolean workerAlertTriggerProximityTriggerProximity;

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade entityType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntityType() {
        return entityType;
    }

    /**
     * Define o valor da propriedade entityType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntityType(Boolean value) {
        this.entityType = value;
    }

    /**
     * Obtém o valor da propriedade orderAssignmentCriteria.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderAssignmentCriteria() {
        return orderAssignmentCriteria;
    }

    /**
     * Define o valor da propriedade orderAssignmentCriteria.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderAssignmentCriteria(Boolean value) {
        this.orderAssignmentCriteria = value;
    }

    /**
     * Obtém o valor da propriedade routeAssignmentCriteria.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteAssignmentCriteria() {
        return routeAssignmentCriteria;
    }

    /**
     * Define o valor da propriedade routeAssignmentCriteria.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteAssignmentCriteria(Boolean value) {
        this.routeAssignmentCriteria = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationAssignmentCriteria.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationAssignmentCriteria() {
        return serviceLocationAssignmentCriteria;
    }

    /**
     * Define o valor da propriedade serviceLocationAssignmentCriteria.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationAssignmentCriteria(Boolean value) {
        this.serviceLocationAssignmentCriteria = value;
    }

    /**
     * Obtém o valor da propriedade workerAlertEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerAlertEntityKey() {
        return workerAlertEntityKey;
    }

    /**
     * Define o valor da propriedade workerAlertEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerAlertEntityKey(Boolean value) {
        this.workerAlertEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade workerAlertTriggerProximityTriggerProximity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerAlertTriggerProximityTriggerProximity() {
        return workerAlertTriggerProximityTriggerProximity;
    }

    /**
     * Define o valor da propriedade workerAlertTriggerProximityTriggerProximity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerAlertTriggerProximityTriggerProximity(Boolean value) {
        this.workerAlertTriggerProximityTriggerProximity = value;
    }

}
