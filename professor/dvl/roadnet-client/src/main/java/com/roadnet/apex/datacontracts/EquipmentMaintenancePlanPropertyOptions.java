
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EquipmentMaintenancePlanPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentMaintenancePlanPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleByDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleByDistanceValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleByEngineHours" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleByEngineHoursValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleByMonths" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleByMonthsValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentMaintenancePlanPropertyOptions", propOrder = {
    "description",
    "equipmentTypeEntityKeys",
    "identifier",
    "isDeleted",
    "scheduleByDistance",
    "scheduleByDistanceValue",
    "scheduleByEngineHours",
    "scheduleByEngineHoursValue",
    "scheduleByMonths",
    "scheduleByMonthsValue"
})
public class EquipmentMaintenancePlanPropertyOptions
    extends VisibleInMultipleRegionsAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "EquipmentTypeEntityKeys")
    protected Boolean equipmentTypeEntityKeys;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "ScheduleByDistance")
    protected Boolean scheduleByDistance;
    @XmlElement(name = "ScheduleByDistanceValue")
    protected Boolean scheduleByDistanceValue;
    @XmlElement(name = "ScheduleByEngineHours")
    protected Boolean scheduleByEngineHours;
    @XmlElement(name = "ScheduleByEngineHoursValue")
    protected Boolean scheduleByEngineHoursValue;
    @XmlElement(name = "ScheduleByMonths")
    protected Boolean scheduleByMonths;
    @XmlElement(name = "ScheduleByMonthsValue")
    protected Boolean scheduleByMonthsValue;

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
     * Obtém o valor da propriedade equipmentTypeEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentTypeEntityKeys() {
        return equipmentTypeEntityKeys;
    }

    /**
     * Define o valor da propriedade equipmentTypeEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentTypeEntityKeys(Boolean value) {
        this.equipmentTypeEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifier(Boolean value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade isDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Define o valor da propriedade isDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Obtém o valor da propriedade scheduleByDistance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScheduleByDistance() {
        return scheduleByDistance;
    }

    /**
     * Define o valor da propriedade scheduleByDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduleByDistance(Boolean value) {
        this.scheduleByDistance = value;
    }

    /**
     * Obtém o valor da propriedade scheduleByDistanceValue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScheduleByDistanceValue() {
        return scheduleByDistanceValue;
    }

    /**
     * Define o valor da propriedade scheduleByDistanceValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduleByDistanceValue(Boolean value) {
        this.scheduleByDistanceValue = value;
    }

    /**
     * Obtém o valor da propriedade scheduleByEngineHours.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScheduleByEngineHours() {
        return scheduleByEngineHours;
    }

    /**
     * Define o valor da propriedade scheduleByEngineHours.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduleByEngineHours(Boolean value) {
        this.scheduleByEngineHours = value;
    }

    /**
     * Obtém o valor da propriedade scheduleByEngineHoursValue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScheduleByEngineHoursValue() {
        return scheduleByEngineHoursValue;
    }

    /**
     * Define o valor da propriedade scheduleByEngineHoursValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduleByEngineHoursValue(Boolean value) {
        this.scheduleByEngineHoursValue = value;
    }

    /**
     * Obtém o valor da propriedade scheduleByMonths.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScheduleByMonths() {
        return scheduleByMonths;
    }

    /**
     * Define o valor da propriedade scheduleByMonths.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduleByMonths(Boolean value) {
        this.scheduleByMonths = value;
    }

    /**
     * Obtém o valor da propriedade scheduleByMonthsValue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScheduleByMonthsValue() {
        return scheduleByMonthsValue;
    }

    /**
     * Define o valor da propriedade scheduleByMonthsValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduleByMonthsValue(Boolean value) {
        this.scheduleByMonthsValue = value;
    }

}
