
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * <p>Classe Java de EquipmentMaintenancePlan complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentMaintenancePlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleByDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleByDistanceValue" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleByEngineHours" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleByEngineHoursValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleByMonths" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleByMonthsValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentMaintenancePlan", propOrder = {
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
public class EquipmentMaintenancePlan
    extends VisibleInMultipleRegionsAggregateRootEntity
{

    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "EquipmentTypeEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> equipmentTypeEntityKeys;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "ScheduleByDistance")
    protected Boolean scheduleByDistance;
    @XmlElementRef(name = "ScheduleByDistanceValue", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> scheduleByDistanceValue;
    @XmlElement(name = "ScheduleByEngineHours")
    protected Boolean scheduleByEngineHours;
    @XmlElementRef(name = "ScheduleByEngineHoursValue", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scheduleByEngineHoursValue;
    @XmlElement(name = "ScheduleByMonths")
    protected Boolean scheduleByMonths;
    @XmlElementRef(name = "ScheduleByMonthsValue", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scheduleByMonthsValue;

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getEquipmentTypeEntityKeys() {
        return equipmentTypeEntityKeys;
    }

    /**
     * Define o valor da propriedade equipmentTypeEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setEquipmentTypeEntityKeys(JAXBElement<ArrayOflong> value) {
        this.equipmentTypeEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getScheduleByDistanceValue() {
        return scheduleByDistanceValue;
    }

    /**
     * Define o valor da propriedade scheduleByDistanceValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setScheduleByDistanceValue(JAXBElement<Distance> value) {
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
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScheduleByEngineHoursValue() {
        return scheduleByEngineHoursValue;
    }

    /**
     * Define o valor da propriedade scheduleByEngineHoursValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScheduleByEngineHoursValue(JAXBElement<Integer> value) {
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
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScheduleByMonthsValue() {
        return scheduleByMonthsValue;
    }

    /**
     * Define o valor da propriedade scheduleByMonthsValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScheduleByMonthsValue(JAXBElement<Integer> value) {
        this.scheduleByMonthsValue = value;
    }

}
