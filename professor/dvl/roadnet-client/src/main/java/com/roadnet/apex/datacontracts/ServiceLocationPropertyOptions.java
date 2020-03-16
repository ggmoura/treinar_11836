
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ServiceLocationPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceLocationPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}LocationPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveAlertSubscriptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ActiveAlertSubscriptionsOptions" type="{http://roadnet.com/apex/DataContracts/}ServiceLocationActiveAlertSubscriptionPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalFixedTravelTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BuildingDeliverySequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeHistoryOptions" type="{http://roadnet.com/apex/DataContracts/}ConsigneeHistoryPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_DeliveryDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeRestrictions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeRestrictionsOptions" type="{http://roadnet.com/apex/DataContracts/}ServiceLocationEquipmentTypeRestrictionPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="IsAssignedToRouteTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}OrderClassifiedOpenCloseDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCategoryEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTimeOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTimeOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}OrderClassifiedServiceTimeDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTimeTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}OrderClassifiedServiceWindowDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="StandingDeliveryQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StandingPickupQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StoreNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeWindowImportance_TimeWindowImportance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeWindowTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLocationPropertyOptions", propOrder = {
    "activeAlertSubscriptions",
    "activeAlertSubscriptionsOptions",
    "additionalFixedTravelTime",
    "buildingDeliverySequence",
    "consigneeHistory",
    "consigneeHistoryOptions",
    "dayOfWeekFlagsDeliveryDays",
    "equipmentTypeRestrictions",
    "equipmentTypeRestrictionsOptions",
    "isAssignedToRouteTemplate",
    "openCloseOverrides",
    "openCloseOverridesOptions",
    "preferredRouteIdentifier",
    "priority",
    "serviceLocationCategoryEntityKey",
    "serviceTimeOverrides",
    "serviceTimeOverridesOptions",
    "serviceTimeTypeEntityKey",
    "serviceWindowOverrides",
    "serviceWindowOverridesOptions",
    "standingDeliveryQuantities",
    "standingPickupQuantities",
    "storeNumber",
    "timeWindowImportanceTimeWindowImportance",
    "timeWindowTypeEntityKey"
})
public class ServiceLocationPropertyOptions
    extends LocationPropertyOptions
{

    @XmlElement(name = "ActiveAlertSubscriptions")
    protected Boolean activeAlertSubscriptions;
    @XmlElementRef(name = "ActiveAlertSubscriptionsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceLocationActiveAlertSubscriptionPropertyOptions> activeAlertSubscriptionsOptions;
    @XmlElement(name = "AdditionalFixedTravelTime")
    protected Boolean additionalFixedTravelTime;
    @XmlElement(name = "BuildingDeliverySequence")
    protected Boolean buildingDeliverySequence;
    @XmlElement(name = "ConsigneeHistory")
    protected Boolean consigneeHistory;
    @XmlElementRef(name = "ConsigneeHistoryOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ConsigneeHistoryPropertyOptions> consigneeHistoryOptions;
    @XmlElement(name = "DayOfWeekFlags_DeliveryDays")
    protected Boolean dayOfWeekFlagsDeliveryDays;
    @XmlElement(name = "EquipmentTypeRestrictions")
    protected Boolean equipmentTypeRestrictions;
    @XmlElementRef(name = "EquipmentTypeRestrictionsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceLocationEquipmentTypeRestrictionPropertyOptions> equipmentTypeRestrictionsOptions;
    @XmlElement(name = "IsAssignedToRouteTemplate")
    protected Boolean isAssignedToRouteTemplate;
    @XmlElement(name = "OpenCloseOverrides")
    protected Boolean openCloseOverrides;
    @XmlElementRef(name = "OpenCloseOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderClassifiedOpenCloseDetailPropertyOptions> openCloseOverridesOptions;
    @XmlElement(name = "PreferredRouteIdentifier")
    protected Boolean preferredRouteIdentifier;
    @XmlElement(name = "Priority")
    protected Boolean priority;
    @XmlElement(name = "ServiceLocationCategoryEntityKey")
    protected Boolean serviceLocationCategoryEntityKey;
    @XmlElement(name = "ServiceTimeOverrides")
    protected Boolean serviceTimeOverrides;
    @XmlElementRef(name = "ServiceTimeOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderClassifiedServiceTimeDetailPropertyOptions> serviceTimeOverridesOptions;
    @XmlElement(name = "ServiceTimeTypeEntityKey")
    protected Boolean serviceTimeTypeEntityKey;
    @XmlElement(name = "ServiceWindowOverrides")
    protected Boolean serviceWindowOverrides;
    @XmlElementRef(name = "ServiceWindowOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderClassifiedServiceWindowDetailPropertyOptions> serviceWindowOverridesOptions;
    @XmlElement(name = "StandingDeliveryQuantities")
    protected Boolean standingDeliveryQuantities;
    @XmlElement(name = "StandingPickupQuantities")
    protected Boolean standingPickupQuantities;
    @XmlElement(name = "StoreNumber")
    protected Boolean storeNumber;
    @XmlElement(name = "TimeWindowImportance_TimeWindowImportance")
    protected Boolean timeWindowImportanceTimeWindowImportance;
    @XmlElement(name = "TimeWindowTypeEntityKey")
    protected Boolean timeWindowTypeEntityKey;

    /**
     * Obtém o valor da propriedade activeAlertSubscriptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveAlertSubscriptions() {
        return activeAlertSubscriptions;
    }

    /**
     * Define o valor da propriedade activeAlertSubscriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveAlertSubscriptions(Boolean value) {
        this.activeAlertSubscriptions = value;
    }

    /**
     * Obtém o valor da propriedade activeAlertSubscriptionsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceLocationActiveAlertSubscriptionPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ServiceLocationActiveAlertSubscriptionPropertyOptions> getActiveAlertSubscriptionsOptions() {
        return activeAlertSubscriptionsOptions;
    }

    /**
     * Define o valor da propriedade activeAlertSubscriptionsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceLocationActiveAlertSubscriptionPropertyOptions }{@code >}
     *     
     */
    public void setActiveAlertSubscriptionsOptions(JAXBElement<ServiceLocationActiveAlertSubscriptionPropertyOptions> value) {
        this.activeAlertSubscriptionsOptions = value;
    }

    /**
     * Obtém o valor da propriedade additionalFixedTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalFixedTravelTime() {
        return additionalFixedTravelTime;
    }

    /**
     * Define o valor da propriedade additionalFixedTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalFixedTravelTime(Boolean value) {
        this.additionalFixedTravelTime = value;
    }

    /**
     * Obtém o valor da propriedade buildingDeliverySequence.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuildingDeliverySequence() {
        return buildingDeliverySequence;
    }

    /**
     * Define o valor da propriedade buildingDeliverySequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuildingDeliverySequence(Boolean value) {
        this.buildingDeliverySequence = value;
    }

    /**
     * Obtém o valor da propriedade consigneeHistory.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsigneeHistory() {
        return consigneeHistory;
    }

    /**
     * Define o valor da propriedade consigneeHistory.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsigneeHistory(Boolean value) {
        this.consigneeHistory = value;
    }

    /**
     * Obtém o valor da propriedade consigneeHistoryOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConsigneeHistoryPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ConsigneeHistoryPropertyOptions> getConsigneeHistoryOptions() {
        return consigneeHistoryOptions;
    }

    /**
     * Define o valor da propriedade consigneeHistoryOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConsigneeHistoryPropertyOptions }{@code >}
     *     
     */
    public void setConsigneeHistoryOptions(JAXBElement<ConsigneeHistoryPropertyOptions> value) {
        this.consigneeHistoryOptions = value;
    }

    /**
     * Obtém o valor da propriedade dayOfWeekFlagsDeliveryDays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDayOfWeekFlagsDeliveryDays() {
        return dayOfWeekFlagsDeliveryDays;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsDeliveryDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDayOfWeekFlagsDeliveryDays(Boolean value) {
        this.dayOfWeekFlagsDeliveryDays = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentTypeRestrictions() {
        return equipmentTypeRestrictions;
    }

    /**
     * Define o valor da propriedade equipmentTypeRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentTypeRestrictions(Boolean value) {
        this.equipmentTypeRestrictions = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeRestrictionsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceLocationEquipmentTypeRestrictionPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ServiceLocationEquipmentTypeRestrictionPropertyOptions> getEquipmentTypeRestrictionsOptions() {
        return equipmentTypeRestrictionsOptions;
    }

    /**
     * Define o valor da propriedade equipmentTypeRestrictionsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceLocationEquipmentTypeRestrictionPropertyOptions }{@code >}
     *     
     */
    public void setEquipmentTypeRestrictionsOptions(JAXBElement<ServiceLocationEquipmentTypeRestrictionPropertyOptions> value) {
        this.equipmentTypeRestrictionsOptions = value;
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
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenCloseOverrides() {
        return openCloseOverrides;
    }

    /**
     * Define o valor da propriedade openCloseOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenCloseOverrides(Boolean value) {
        this.openCloseOverrides = value;
    }

    /**
     * Obtém o valor da propriedade openCloseOverridesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderClassifiedOpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OrderClassifiedOpenCloseDetailPropertyOptions> getOpenCloseOverridesOptions() {
        return openCloseOverridesOptions;
    }

    /**
     * Define o valor da propriedade openCloseOverridesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderClassifiedOpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public void setOpenCloseOverridesOptions(JAXBElement<OrderClassifiedOpenCloseDetailPropertyOptions> value) {
        this.openCloseOverridesOptions = value;
    }

    /**
     * Obtém o valor da propriedade preferredRouteIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredRouteIdentifier() {
        return preferredRouteIdentifier;
    }

    /**
     * Define o valor da propriedade preferredRouteIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredRouteIdentifier(Boolean value) {
        this.preferredRouteIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade priority.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriority() {
        return priority;
    }

    /**
     * Define o valor da propriedade priority.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriority(Boolean value) {
        this.priority = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCategoryEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationCategoryEntityKey() {
        return serviceLocationCategoryEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationCategoryEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationCategoryEntityKey(Boolean value) {
        this.serviceLocationCategoryEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceTimeOverrides.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceTimeOverrides() {
        return serviceTimeOverrides;
    }

    /**
     * Define o valor da propriedade serviceTimeOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceTimeOverrides(Boolean value) {
        this.serviceTimeOverrides = value;
    }

    /**
     * Obtém o valor da propriedade serviceTimeOverridesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderClassifiedServiceTimeDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OrderClassifiedServiceTimeDetailPropertyOptions> getServiceTimeOverridesOptions() {
        return serviceTimeOverridesOptions;
    }

    /**
     * Define o valor da propriedade serviceTimeOverridesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderClassifiedServiceTimeDetailPropertyOptions }{@code >}
     *     
     */
    public void setServiceTimeOverridesOptions(JAXBElement<OrderClassifiedServiceTimeDetailPropertyOptions> value) {
        this.serviceTimeOverridesOptions = value;
    }

    /**
     * Obtém o valor da propriedade serviceTimeTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceTimeTypeEntityKey() {
        return serviceTimeTypeEntityKey;
    }

    /**
     * Define o valor da propriedade serviceTimeTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceTimeTypeEntityKey(Boolean value) {
        this.serviceTimeTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindowOverrides.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceWindowOverrides() {
        return serviceWindowOverrides;
    }

    /**
     * Define o valor da propriedade serviceWindowOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceWindowOverrides(Boolean value) {
        this.serviceWindowOverrides = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindowOverridesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderClassifiedServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OrderClassifiedServiceWindowDetailPropertyOptions> getServiceWindowOverridesOptions() {
        return serviceWindowOverridesOptions;
    }

    /**
     * Define o valor da propriedade serviceWindowOverridesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderClassifiedServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public void setServiceWindowOverridesOptions(JAXBElement<OrderClassifiedServiceWindowDetailPropertyOptions> value) {
        this.serviceWindowOverridesOptions = value;
    }

    /**
     * Obtém o valor da propriedade standingDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandingDeliveryQuantities() {
        return standingDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade standingDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandingDeliveryQuantities(Boolean value) {
        this.standingDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade standingPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandingPickupQuantities() {
        return standingPickupQuantities;
    }

    /**
     * Define o valor da propriedade standingPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandingPickupQuantities(Boolean value) {
        this.standingPickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade storeNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStoreNumber() {
        return storeNumber;
    }

    /**
     * Define o valor da propriedade storeNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoreNumber(Boolean value) {
        this.storeNumber = value;
    }

    /**
     * Obtém o valor da propriedade timeWindowImportanceTimeWindowImportance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeWindowImportanceTimeWindowImportance() {
        return timeWindowImportanceTimeWindowImportance;
    }

    /**
     * Define o valor da propriedade timeWindowImportanceTimeWindowImportance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeWindowImportanceTimeWindowImportance(Boolean value) {
        this.timeWindowImportanceTimeWindowImportance = value;
    }

    /**
     * Obtém o valor da propriedade timeWindowTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeWindowTypeEntityKey() {
        return timeWindowTypeEntityKey;
    }

    /**
     * Define o valor da propriedade timeWindowTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeWindowTypeEntityKey(Boolean value) {
        this.timeWindowTypeEntityKey = value;
    }

}
