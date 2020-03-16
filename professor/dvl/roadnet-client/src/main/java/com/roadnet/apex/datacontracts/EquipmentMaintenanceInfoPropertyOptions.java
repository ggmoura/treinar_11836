
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EquipmentMaintenanceInfoPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentMaintenanceInfoPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CalculatedDueDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DaysUntilDueDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DistanceUntilDueOdometer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DueOdometer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DueTotalEngineRunTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentMaintenanceInfoState_State" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentMaintenancePlanEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentServiceEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HoursUntilDueEngineHours" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaintenancePlanDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaintenancePlanIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentMaintenanceInfoPropertyOptions", propOrder = {
    "calculatedDueDate",
    "daysUntilDueDate",
    "distanceUntilDueOdometer",
    "dueDate",
    "dueOdometer",
    "dueTotalEngineRunTime",
    "equipmentDescription",
    "equipmentEntityKey",
    "equipmentIdentifier",
    "equipmentMaintenanceInfoStateState",
    "equipmentMaintenancePlanEntityKey",
    "equipmentServiceEntityKey",
    "equipmentTypeIdentifier",
    "hoursUntilDueEngineHours",
    "maintenancePlanDescription",
    "maintenancePlanIdentifier",
    "scheduledDate"
})
public class EquipmentMaintenanceInfoPropertyOptions
    extends VisibleInMultipleRegionsAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "CalculatedDueDate")
    protected Boolean calculatedDueDate;
    @XmlElement(name = "DaysUntilDueDate")
    protected Boolean daysUntilDueDate;
    @XmlElement(name = "DistanceUntilDueOdometer")
    protected Boolean distanceUntilDueOdometer;
    @XmlElement(name = "DueDate")
    protected Boolean dueDate;
    @XmlElement(name = "DueOdometer")
    protected Boolean dueOdometer;
    @XmlElement(name = "DueTotalEngineRunTime")
    protected Boolean dueTotalEngineRunTime;
    @XmlElement(name = "EquipmentDescription")
    protected Boolean equipmentDescription;
    @XmlElement(name = "EquipmentEntityKey")
    protected Boolean equipmentEntityKey;
    @XmlElement(name = "EquipmentIdentifier")
    protected Boolean equipmentIdentifier;
    @XmlElement(name = "EquipmentMaintenanceInfoState_State")
    protected Boolean equipmentMaintenanceInfoStateState;
    @XmlElement(name = "EquipmentMaintenancePlanEntityKey")
    protected Boolean equipmentMaintenancePlanEntityKey;
    @XmlElement(name = "EquipmentServiceEntityKey")
    protected Boolean equipmentServiceEntityKey;
    @XmlElement(name = "EquipmentTypeIdentifier")
    protected Boolean equipmentTypeIdentifier;
    @XmlElement(name = "HoursUntilDueEngineHours")
    protected Boolean hoursUntilDueEngineHours;
    @XmlElement(name = "MaintenancePlanDescription")
    protected Boolean maintenancePlanDescription;
    @XmlElement(name = "MaintenancePlanIdentifier")
    protected Boolean maintenancePlanIdentifier;
    @XmlElement(name = "ScheduledDate")
    protected Boolean scheduledDate;

    /**
     * Obtém o valor da propriedade calculatedDueDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculatedDueDate() {
        return calculatedDueDate;
    }

    /**
     * Define o valor da propriedade calculatedDueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculatedDueDate(Boolean value) {
        this.calculatedDueDate = value;
    }

    /**
     * Obtém o valor da propriedade daysUntilDueDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDaysUntilDueDate() {
        return daysUntilDueDate;
    }

    /**
     * Define o valor da propriedade daysUntilDueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDaysUntilDueDate(Boolean value) {
        this.daysUntilDueDate = value;
    }

    /**
     * Obtém o valor da propriedade distanceUntilDueOdometer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistanceUntilDueOdometer() {
        return distanceUntilDueOdometer;
    }

    /**
     * Define o valor da propriedade distanceUntilDueOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistanceUntilDueOdometer(Boolean value) {
        this.distanceUntilDueOdometer = value;
    }

    /**
     * Obtém o valor da propriedade dueDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDueDate() {
        return dueDate;
    }

    /**
     * Define o valor da propriedade dueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDueDate(Boolean value) {
        this.dueDate = value;
    }

    /**
     * Obtém o valor da propriedade dueOdometer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDueOdometer() {
        return dueOdometer;
    }

    /**
     * Define o valor da propriedade dueOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDueOdometer(Boolean value) {
        this.dueOdometer = value;
    }

    /**
     * Obtém o valor da propriedade dueTotalEngineRunTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDueTotalEngineRunTime() {
        return dueTotalEngineRunTime;
    }

    /**
     * Define o valor da propriedade dueTotalEngineRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDueTotalEngineRunTime(Boolean value) {
        this.dueTotalEngineRunTime = value;
    }

    /**
     * Obtém o valor da propriedade equipmentDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentDescription() {
        return equipmentDescription;
    }

    /**
     * Define o valor da propriedade equipmentDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentDescription(Boolean value) {
        this.equipmentDescription = value;
    }

    /**
     * Obtém o valor da propriedade equipmentEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentEntityKey() {
        return equipmentEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentEntityKey(Boolean value) {
        this.equipmentEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipmentIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentIdentifier() {
        return equipmentIdentifier;
    }

    /**
     * Define o valor da propriedade equipmentIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentIdentifier(Boolean value) {
        this.equipmentIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade equipmentMaintenanceInfoStateState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentMaintenanceInfoStateState() {
        return equipmentMaintenanceInfoStateState;
    }

    /**
     * Define o valor da propriedade equipmentMaintenanceInfoStateState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentMaintenanceInfoStateState(Boolean value) {
        this.equipmentMaintenanceInfoStateState = value;
    }

    /**
     * Obtém o valor da propriedade equipmentMaintenancePlanEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentMaintenancePlanEntityKey() {
        return equipmentMaintenancePlanEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentMaintenancePlanEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentMaintenancePlanEntityKey(Boolean value) {
        this.equipmentMaintenancePlanEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipmentServiceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentServiceEntityKey() {
        return equipmentServiceEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentServiceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentServiceEntityKey(Boolean value) {
        this.equipmentServiceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentTypeIdentifier() {
        return equipmentTypeIdentifier;
    }

    /**
     * Define o valor da propriedade equipmentTypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentTypeIdentifier(Boolean value) {
        this.equipmentTypeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade hoursUntilDueEngineHours.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHoursUntilDueEngineHours() {
        return hoursUntilDueEngineHours;
    }

    /**
     * Define o valor da propriedade hoursUntilDueEngineHours.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHoursUntilDueEngineHours(Boolean value) {
        this.hoursUntilDueEngineHours = value;
    }

    /**
     * Obtém o valor da propriedade maintenancePlanDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaintenancePlanDescription() {
        return maintenancePlanDescription;
    }

    /**
     * Define o valor da propriedade maintenancePlanDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaintenancePlanDescription(Boolean value) {
        this.maintenancePlanDescription = value;
    }

    /**
     * Obtém o valor da propriedade maintenancePlanIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaintenancePlanIdentifier() {
        return maintenancePlanIdentifier;
    }

    /**
     * Define o valor da propriedade maintenancePlanIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaintenancePlanIdentifier(Boolean value) {
        this.maintenancePlanIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade scheduledDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScheduledDate() {
        return scheduledDate;
    }

    /**
     * Define o valor da propriedade scheduledDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduledDate(Boolean value) {
        this.scheduledDate = value;
    }

}
