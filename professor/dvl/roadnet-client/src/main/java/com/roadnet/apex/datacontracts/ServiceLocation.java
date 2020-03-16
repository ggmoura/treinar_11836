
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de ServiceLocation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}Location"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveAlertSubscriptions" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceLocationActiveAlertSubscription" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalFixedTravelTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="BuildingDeliverySequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeHistory" type="{http://roadnet.com/apex/DataContracts/}ArrayOfConsigneeHistory" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_DeliveryDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeRestrictions" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceLocationEquipmentTypeRestriction" minOccurs="0"/&gt;
 *         &lt;element name="IsAssignedToRouteTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseOverrides" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceLocationOpenCloseDetail" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCategoryEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTimeOverrides" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceLocationServiceTimeDetail" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTimeTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowOverrides" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceLocationServiceWindowDetail" minOccurs="0"/&gt;
 *         &lt;element name="StandingDeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="StandingPickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="StoreNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeWindowImportance_TimeWindowImportance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeWindowTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLocation", propOrder = {
    "activeAlertSubscriptions",
    "additionalFixedTravelTime",
    "buildingDeliverySequence",
    "consigneeHistory",
    "dayOfWeekFlagsDeliveryDays",
    "equipmentTypeRestrictions",
    "isAssignedToRouteTemplate",
    "openCloseOverrides",
    "preferredRouteIdentifier",
    "priority",
    "serviceLocationCategoryEntityKey",
    "serviceTimeOverrides",
    "serviceTimeTypeEntityKey",
    "serviceWindowOverrides",
    "standingDeliveryQuantities",
    "standingPickupQuantities",
    "storeNumber",
    "timeWindowImportanceTimeWindowImportance",
    "timeWindowTypeEntityKey"
})
public class ServiceLocation
    extends Location
{

    @XmlElementRef(name = "ActiveAlertSubscriptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceLocationActiveAlertSubscription> activeAlertSubscriptions;
    @XmlElement(name = "AdditionalFixedTravelTime")
    protected Duration additionalFixedTravelTime;
    @XmlElement(name = "BuildingDeliverySequence")
    protected Integer buildingDeliverySequence;
    @XmlElementRef(name = "ConsigneeHistory", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfConsigneeHistory> consigneeHistory;
    @XmlElementRef(name = "DayOfWeekFlags_DeliveryDays", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dayOfWeekFlagsDeliveryDays;
    @XmlElementRef(name = "EquipmentTypeRestrictions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceLocationEquipmentTypeRestriction> equipmentTypeRestrictions;
    @XmlElement(name = "IsAssignedToRouteTemplate")
    protected Boolean isAssignedToRouteTemplate;
    @XmlElementRef(name = "OpenCloseOverrides", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceLocationOpenCloseDetail> openCloseOverrides;
    @XmlElementRef(name = "PreferredRouteIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredRouteIdentifier;
    @XmlElement(name = "Priority")
    protected Integer priority;
    @XmlElementRef(name = "ServiceLocationCategoryEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> serviceLocationCategoryEntityKey;
    @XmlElementRef(name = "ServiceTimeOverrides", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceLocationServiceTimeDetail> serviceTimeOverrides;
    @XmlElementRef(name = "ServiceTimeTypeEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> serviceTimeTypeEntityKey;
    @XmlElementRef(name = "ServiceWindowOverrides", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceLocationServiceWindowDetail> serviceWindowOverrides;
    @XmlElementRef(name = "StandingDeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> standingDeliveryQuantities;
    @XmlElementRef(name = "StandingPickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> standingPickupQuantities;
    @XmlElementRef(name = "StoreNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> storeNumber;
    @XmlElementRef(name = "TimeWindowImportance_TimeWindowImportance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeWindowImportanceTimeWindowImportance;
    @XmlElementRef(name = "TimeWindowTypeEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> timeWindowTypeEntityKey;

    /**
     * Obtém o valor da propriedade activeAlertSubscriptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationActiveAlertSubscription }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceLocationActiveAlertSubscription> getActiveAlertSubscriptions() {
        return activeAlertSubscriptions;
    }

    /**
     * Define o valor da propriedade activeAlertSubscriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationActiveAlertSubscription }{@code >}
     *     
     */
    public void setActiveAlertSubscriptions(JAXBElement<ArrayOfServiceLocationActiveAlertSubscription> value) {
        this.activeAlertSubscriptions = value;
    }

    /**
     * Obtém o valor da propriedade additionalFixedTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAdditionalFixedTravelTime() {
        return additionalFixedTravelTime;
    }

    /**
     * Define o valor da propriedade additionalFixedTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAdditionalFixedTravelTime(Duration value) {
        this.additionalFixedTravelTime = value;
    }

    /**
     * Obtém o valor da propriedade buildingDeliverySequence.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuildingDeliverySequence() {
        return buildingDeliverySequence;
    }

    /**
     * Define o valor da propriedade buildingDeliverySequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuildingDeliverySequence(Integer value) {
        this.buildingDeliverySequence = value;
    }

    /**
     * Obtém o valor da propriedade consigneeHistory.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfConsigneeHistory }{@code >}
     *     
     */
    public JAXBElement<ArrayOfConsigneeHistory> getConsigneeHistory() {
        return consigneeHistory;
    }

    /**
     * Define o valor da propriedade consigneeHistory.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfConsigneeHistory }{@code >}
     *     
     */
    public void setConsigneeHistory(JAXBElement<ArrayOfConsigneeHistory> value) {
        this.consigneeHistory = value;
    }

    /**
     * Obtém o valor da propriedade dayOfWeekFlagsDeliveryDays.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDayOfWeekFlagsDeliveryDays() {
        return dayOfWeekFlagsDeliveryDays;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsDeliveryDays.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDayOfWeekFlagsDeliveryDays(JAXBElement<String> value) {
        this.dayOfWeekFlagsDeliveryDays = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationEquipmentTypeRestriction }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceLocationEquipmentTypeRestriction> getEquipmentTypeRestrictions() {
        return equipmentTypeRestrictions;
    }

    /**
     * Define o valor da propriedade equipmentTypeRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationEquipmentTypeRestriction }{@code >}
     *     
     */
    public void setEquipmentTypeRestrictions(JAXBElement<ArrayOfServiceLocationEquipmentTypeRestriction> value) {
        this.equipmentTypeRestrictions = value;
    }

    /**
     * Obtém o valor da propriedade isAssignedToRouteTemplate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAssignedToRouteTemplate() {
        return isAssignedToRouteTemplate;
    }

    /**
     * Define o valor da propriedade isAssignedToRouteTemplate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAssignedToRouteTemplate(Boolean value) {
        this.isAssignedToRouteTemplate = value;
    }

    /**
     * Obtém o valor da propriedade openCloseOverrides.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationOpenCloseDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceLocationOpenCloseDetail> getOpenCloseOverrides() {
        return openCloseOverrides;
    }

    /**
     * Define o valor da propriedade openCloseOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationOpenCloseDetail }{@code >}
     *     
     */
    public void setOpenCloseOverrides(JAXBElement<ArrayOfServiceLocationOpenCloseDetail> value) {
        this.openCloseOverrides = value;
    }

    /**
     * Obtém o valor da propriedade preferredRouteIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredRouteIdentifier() {
        return preferredRouteIdentifier;
    }

    /**
     * Define o valor da propriedade preferredRouteIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredRouteIdentifier(JAXBElement<String> value) {
        this.preferredRouteIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade priority.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Define o valor da propriedade priority.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCategoryEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServiceLocationCategoryEntityKey() {
        return serviceLocationCategoryEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationCategoryEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServiceLocationCategoryEntityKey(JAXBElement<Long> value) {
        this.serviceLocationCategoryEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceTimeOverrides.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationServiceTimeDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceLocationServiceTimeDetail> getServiceTimeOverrides() {
        return serviceTimeOverrides;
    }

    /**
     * Define o valor da propriedade serviceTimeOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationServiceTimeDetail }{@code >}
     *     
     */
    public void setServiceTimeOverrides(JAXBElement<ArrayOfServiceLocationServiceTimeDetail> value) {
        this.serviceTimeOverrides = value;
    }

    /**
     * Obtém o valor da propriedade serviceTimeTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServiceTimeTypeEntityKey() {
        return serviceTimeTypeEntityKey;
    }

    /**
     * Define o valor da propriedade serviceTimeTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServiceTimeTypeEntityKey(JAXBElement<Long> value) {
        this.serviceTimeTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindowOverrides.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationServiceWindowDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceLocationServiceWindowDetail> getServiceWindowOverrides() {
        return serviceWindowOverrides;
    }

    /**
     * Define o valor da propriedade serviceWindowOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationServiceWindowDetail }{@code >}
     *     
     */
    public void setServiceWindowOverrides(JAXBElement<ArrayOfServiceLocationServiceWindowDetail> value) {
        this.serviceWindowOverrides = value;
    }

    /**
     * Obtém o valor da propriedade standingDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getStandingDeliveryQuantities() {
        return standingDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade standingDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setStandingDeliveryQuantities(JAXBElement<Quantities> value) {
        this.standingDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade standingPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getStandingPickupQuantities() {
        return standingPickupQuantities;
    }

    /**
     * Define o valor da propriedade standingPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setStandingPickupQuantities(JAXBElement<Quantities> value) {
        this.standingPickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade storeNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStoreNumber() {
        return storeNumber;
    }

    /**
     * Define o valor da propriedade storeNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStoreNumber(JAXBElement<String> value) {
        this.storeNumber = value;
    }

    /**
     * Obtém o valor da propriedade timeWindowImportanceTimeWindowImportance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeWindowImportanceTimeWindowImportance() {
        return timeWindowImportanceTimeWindowImportance;
    }

    /**
     * Define o valor da propriedade timeWindowImportanceTimeWindowImportance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeWindowImportanceTimeWindowImportance(JAXBElement<String> value) {
        this.timeWindowImportanceTimeWindowImportance = value;
    }

    /**
     * Obtém o valor da propriedade timeWindowTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTimeWindowTypeEntityKey() {
        return timeWindowTypeEntityKey;
    }

    /**
     * Define o valor da propriedade timeWindowTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTimeWindowTypeEntityKey(JAXBElement<Long> value) {
        this.timeWindowTypeEntityKey = value;
    }

}
