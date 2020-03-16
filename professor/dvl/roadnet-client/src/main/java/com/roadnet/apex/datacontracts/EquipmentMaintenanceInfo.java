
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de EquipmentMaintenanceInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentMaintenanceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BusinessUnitBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CalculatedDueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DaysUntilDueDate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DistanceUntilDueOdometer" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DueOdometer" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="DueTotalEngineRunTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentMaintenanceInfoState_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentMaintenancePlanEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentServiceEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HoursUntilDueEngineHours" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaintenancePlanDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaintenancePlanIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentMaintenanceInfo", propOrder = {
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
public class EquipmentMaintenanceInfo
    extends BusinessUnitBasedAggregateRootEntity
{

    @XmlElementRef(name = "CalculatedDueDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> calculatedDueDate;
    @XmlElementRef(name = "DaysUntilDueDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> daysUntilDueDate;
    @XmlElementRef(name = "DistanceUntilDueOdometer", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> distanceUntilDueOdometer;
    @XmlElementRef(name = "DueDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dueDate;
    @XmlElementRef(name = "DueOdometer", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> dueOdometer;
    @XmlElementRef(name = "DueTotalEngineRunTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> dueTotalEngineRunTime;
    @XmlElementRef(name = "EquipmentDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentDescription;
    @XmlElement(name = "EquipmentEntityKey")
    protected Long equipmentEntityKey;
    @XmlElementRef(name = "EquipmentIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentIdentifier;
    @XmlElementRef(name = "EquipmentMaintenanceInfoState_State", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentMaintenanceInfoStateState;
    @XmlElement(name = "EquipmentMaintenancePlanEntityKey")
    protected Long equipmentMaintenancePlanEntityKey;
    @XmlElementRef(name = "EquipmentServiceEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> equipmentServiceEntityKey;
    @XmlElementRef(name = "EquipmentTypeIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentTypeIdentifier;
    @XmlElementRef(name = "HoursUntilDueEngineHours", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoursUntilDueEngineHours;
    @XmlElementRef(name = "MaintenancePlanDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maintenancePlanDescription;
    @XmlElementRef(name = "MaintenancePlanIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maintenancePlanIdentifier;
    @XmlElementRef(name = "ScheduledDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> scheduledDate;

    /**
     * Obtém o valor da propriedade calculatedDueDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCalculatedDueDate() {
        return calculatedDueDate;
    }

    /**
     * Define o valor da propriedade calculatedDueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCalculatedDueDate(JAXBElement<XMLGregorianCalendar> value) {
        this.calculatedDueDate = value;
    }

    /**
     * Obtém o valor da propriedade daysUntilDueDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDaysUntilDueDate() {
        return daysUntilDueDate;
    }

    /**
     * Define o valor da propriedade daysUntilDueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDaysUntilDueDate(JAXBElement<Integer> value) {
        this.daysUntilDueDate = value;
    }

    /**
     * Obtém o valor da propriedade distanceUntilDueOdometer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDistanceUntilDueOdometer() {
        return distanceUntilDueOdometer;
    }

    /**
     * Define o valor da propriedade distanceUntilDueOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDistanceUntilDueOdometer(JAXBElement<Distance> value) {
        this.distanceUntilDueOdometer = value;
    }

    /**
     * Obtém o valor da propriedade dueDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDueDate() {
        return dueDate;
    }

    /**
     * Define o valor da propriedade dueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDueDate(JAXBElement<XMLGregorianCalendar> value) {
        this.dueDate = value;
    }

    /**
     * Obtém o valor da propriedade dueOdometer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDueOdometer() {
        return dueOdometer;
    }

    /**
     * Define o valor da propriedade dueOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDueOdometer(JAXBElement<Distance> value) {
        this.dueOdometer = value;
    }

    /**
     * Obtém o valor da propriedade dueTotalEngineRunTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getDueTotalEngineRunTime() {
        return dueTotalEngineRunTime;
    }

    /**
     * Define o valor da propriedade dueTotalEngineRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setDueTotalEngineRunTime(JAXBElement<Duration> value) {
        this.dueTotalEngineRunTime = value;
    }

    /**
     * Obtém o valor da propriedade equipmentDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentDescription() {
        return equipmentDescription;
    }

    /**
     * Define o valor da propriedade equipmentDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentDescription(JAXBElement<String> value) {
        this.equipmentDescription = value;
    }

    /**
     * Obtém o valor da propriedade equipmentEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEquipmentEntityKey() {
        return equipmentEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEquipmentEntityKey(Long value) {
        this.equipmentEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipmentIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentIdentifier() {
        return equipmentIdentifier;
    }

    /**
     * Define o valor da propriedade equipmentIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentIdentifier(JAXBElement<String> value) {
        this.equipmentIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade equipmentMaintenanceInfoStateState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentMaintenanceInfoStateState() {
        return equipmentMaintenanceInfoStateState;
    }

    /**
     * Define o valor da propriedade equipmentMaintenanceInfoStateState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentMaintenanceInfoStateState(JAXBElement<String> value) {
        this.equipmentMaintenanceInfoStateState = value;
    }

    /**
     * Obtém o valor da propriedade equipmentMaintenancePlanEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEquipmentMaintenancePlanEntityKey() {
        return equipmentMaintenancePlanEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentMaintenancePlanEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEquipmentMaintenancePlanEntityKey(Long value) {
        this.equipmentMaintenancePlanEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipmentServiceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEquipmentServiceEntityKey() {
        return equipmentServiceEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentServiceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEquipmentServiceEntityKey(JAXBElement<Long> value) {
        this.equipmentServiceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentTypeIdentifier() {
        return equipmentTypeIdentifier;
    }

    /**
     * Define o valor da propriedade equipmentTypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentTypeIdentifier(JAXBElement<String> value) {
        this.equipmentTypeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade hoursUntilDueEngineHours.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoursUntilDueEngineHours() {
        return hoursUntilDueEngineHours;
    }

    /**
     * Define o valor da propriedade hoursUntilDueEngineHours.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoursUntilDueEngineHours(JAXBElement<Integer> value) {
        this.hoursUntilDueEngineHours = value;
    }

    /**
     * Obtém o valor da propriedade maintenancePlanDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaintenancePlanDescription() {
        return maintenancePlanDescription;
    }

    /**
     * Define o valor da propriedade maintenancePlanDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaintenancePlanDescription(JAXBElement<String> value) {
        this.maintenancePlanDescription = value;
    }

    /**
     * Obtém o valor da propriedade maintenancePlanIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaintenancePlanIdentifier() {
        return maintenancePlanIdentifier;
    }

    /**
     * Define o valor da propriedade maintenancePlanIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaintenancePlanIdentifier(JAXBElement<String> value) {
        this.maintenancePlanIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade scheduledDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getScheduledDate() {
        return scheduledDate;
    }

    /**
     * Define o valor da propriedade scheduledDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setScheduledDate(JAXBElement<XMLGregorianCalendar> value) {
        this.scheduledDate = value;
    }

}
