
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OrderPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}OrderBasePropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryQuantitiesDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryQuantitiesPercentageDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EntryMethod_EntryMethod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ManagedByUserEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileQuantityItemSource_Source" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NetRevenue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseDetailsOptions" type="{http://roadnet.com/apex/DataContracts/}OpenCloseDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="PickupQuantitiesDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PickupQuantitiesPercentageDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDeliveryCategory1Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDeliveryCategory2Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDeliveryCategory3Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDeliveryQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedPickupCategory1Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedPickupCategory2Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedPickupCategory3Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedPickupQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRouteIdentifierOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteWorkers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteWorkersOptions" type="{http://roadnet.com/apex/DataContracts/}WorkerPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCustomProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowDetailsOptions" type="{http://roadnet.com/apex/DataContracts/}ServiceWindowDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="SessionDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SessionDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SessionMode_SessionMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SpecialInstructions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TakenBy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TasksOptions" type="{http://roadnet.com/apex/DataContracts/}TaskPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="UnassignedOrderGroupEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VerificationHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VerificationHistoryOptions" type="{http://roadnet.com/apex/DataContracts/}VerificationHistoryItemPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderPropertyOptions", propOrder = {
    "beginDate",
    "deliveryQuantitiesDifference",
    "deliveryQuantitiesPercentageDifference",
    "deviceIdentifier",
    "endDate",
    "entryMethodEntryMethod",
    "managedByUserEntityKey",
    "mobileDeviceIdentifier",
    "mobileQuantityItemSourceSource",
    "netRevenue",
    "openCloseDetails",
    "openCloseDetailsOptions",
    "pickupQuantitiesDifference",
    "pickupQuantitiesPercentageDifference",
    "plannedDeliveryCategory1Quantities",
    "plannedDeliveryCategory2Quantities",
    "plannedDeliveryCategory3Quantities",
    "plannedDeliveryQuantities",
    "plannedPickupCategory1Quantities",
    "plannedPickupCategory2Quantities",
    "plannedPickupCategory3Quantities",
    "plannedPickupQuantities",
    "preferredRouteIdentifier",
    "preferredRouteIdentifierOverride",
    "routeWorkers",
    "routeWorkersOptions",
    "serviceLocationCustomProperties",
    "serviceWindowDetails",
    "serviceWindowDetailsOptions",
    "sessionDate",
    "sessionDescription",
    "sessionEntityKey",
    "sessionModeSessionMode",
    "specialInstructions",
    "takenBy",
    "tasksOptions",
    "unassignedOrderGroupEntityKey",
    "verificationHistory",
    "verificationHistoryOptions"
})
public class OrderPropertyOptions
    extends OrderBasePropertyOptions
{

    @XmlElement(name = "BeginDate")
    protected Boolean beginDate;
    @XmlElement(name = "DeliveryQuantitiesDifference")
    protected Boolean deliveryQuantitiesDifference;
    @XmlElement(name = "DeliveryQuantitiesPercentageDifference")
    protected Boolean deliveryQuantitiesPercentageDifference;
    @XmlElement(name = "DeviceIdentifier")
    protected Boolean deviceIdentifier;
    @XmlElement(name = "EndDate")
    protected Boolean endDate;
    @XmlElement(name = "EntryMethod_EntryMethod")
    protected Boolean entryMethodEntryMethod;
    @XmlElement(name = "ManagedByUserEntityKey")
    protected Boolean managedByUserEntityKey;
    @XmlElement(name = "MobileDeviceIdentifier")
    protected Boolean mobileDeviceIdentifier;
    @XmlElement(name = "MobileQuantityItemSource_Source")
    protected Boolean mobileQuantityItemSourceSource;
    @XmlElement(name = "NetRevenue")
    protected Boolean netRevenue;
    @XmlElement(name = "OpenCloseDetails")
    protected Boolean openCloseDetails;
    @XmlElementRef(name = "OpenCloseDetailsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenCloseDetailPropertyOptions> openCloseDetailsOptions;
    @XmlElement(name = "PickupQuantitiesDifference")
    protected Boolean pickupQuantitiesDifference;
    @XmlElement(name = "PickupQuantitiesPercentageDifference")
    protected Boolean pickupQuantitiesPercentageDifference;
    @XmlElement(name = "PlannedDeliveryCategory1Quantities")
    protected Boolean plannedDeliveryCategory1Quantities;
    @XmlElement(name = "PlannedDeliveryCategory2Quantities")
    protected Boolean plannedDeliveryCategory2Quantities;
    @XmlElement(name = "PlannedDeliveryCategory3Quantities")
    protected Boolean plannedDeliveryCategory3Quantities;
    @XmlElement(name = "PlannedDeliveryQuantities")
    protected Boolean plannedDeliveryQuantities;
    @XmlElement(name = "PlannedPickupCategory1Quantities")
    protected Boolean plannedPickupCategory1Quantities;
    @XmlElement(name = "PlannedPickupCategory2Quantities")
    protected Boolean plannedPickupCategory2Quantities;
    @XmlElement(name = "PlannedPickupCategory3Quantities")
    protected Boolean plannedPickupCategory3Quantities;
    @XmlElement(name = "PlannedPickupQuantities")
    protected Boolean plannedPickupQuantities;
    @XmlElement(name = "PreferredRouteIdentifier")
    protected Boolean preferredRouteIdentifier;
    @XmlElement(name = "PreferredRouteIdentifierOverride")
    protected Boolean preferredRouteIdentifierOverride;
    @XmlElement(name = "RouteWorkers")
    protected Boolean routeWorkers;
    @XmlElementRef(name = "RouteWorkersOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<WorkerPropertyOptions> routeWorkersOptions;
    @XmlElement(name = "ServiceLocationCustomProperties")
    protected Boolean serviceLocationCustomProperties;
    @XmlElement(name = "ServiceWindowDetails")
    protected Boolean serviceWindowDetails;
    @XmlElementRef(name = "ServiceWindowDetailsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceWindowDetailPropertyOptions> serviceWindowDetailsOptions;
    @XmlElement(name = "SessionDate")
    protected Boolean sessionDate;
    @XmlElement(name = "SessionDescription")
    protected Boolean sessionDescription;
    @XmlElement(name = "SessionEntityKey")
    protected Boolean sessionEntityKey;
    @XmlElement(name = "SessionMode_SessionMode")
    protected Boolean sessionModeSessionMode;
    @XmlElement(name = "SpecialInstructions")
    protected Boolean specialInstructions;
    @XmlElement(name = "TakenBy")
    protected Boolean takenBy;
    @XmlElementRef(name = "TasksOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TaskPropertyOptions> tasksOptions;
    @XmlElement(name = "UnassignedOrderGroupEntityKey")
    protected Boolean unassignedOrderGroupEntityKey;
    @XmlElement(name = "VerificationHistory")
    protected Boolean verificationHistory;
    @XmlElementRef(name = "VerificationHistoryOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<VerificationHistoryItemPropertyOptions> verificationHistoryOptions;

    /**
     * Obtém o valor da propriedade beginDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBeginDate() {
        return beginDate;
    }

    /**
     * Define o valor da propriedade beginDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeginDate(Boolean value) {
        this.beginDate = value;
    }

    /**
     * Obtém o valor da propriedade deliveryQuantitiesDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryQuantitiesDifference() {
        return deliveryQuantitiesDifference;
    }

    /**
     * Define o valor da propriedade deliveryQuantitiesDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryQuantitiesDifference(Boolean value) {
        this.deliveryQuantitiesDifference = value;
    }

    /**
     * Obtém o valor da propriedade deliveryQuantitiesPercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryQuantitiesPercentageDifference() {
        return deliveryQuantitiesPercentageDifference;
    }

    /**
     * Define o valor da propriedade deliveryQuantitiesPercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryQuantitiesPercentageDifference(Boolean value) {
        this.deliveryQuantitiesPercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade deviceIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeviceIdentifier() {
        return deviceIdentifier;
    }

    /**
     * Define o valor da propriedade deviceIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeviceIdentifier(Boolean value) {
        this.deviceIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade endDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndDate() {
        return endDate;
    }

    /**
     * Define o valor da propriedade endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndDate(Boolean value) {
        this.endDate = value;
    }

    /**
     * Obtém o valor da propriedade entryMethodEntryMethod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntryMethodEntryMethod() {
        return entryMethodEntryMethod;
    }

    /**
     * Define o valor da propriedade entryMethodEntryMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntryMethodEntryMethod(Boolean value) {
        this.entryMethodEntryMethod = value;
    }

    /**
     * Obtém o valor da propriedade managedByUserEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManagedByUserEntityKey() {
        return managedByUserEntityKey;
    }

    /**
     * Define o valor da propriedade managedByUserEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManagedByUserEntityKey(Boolean value) {
        this.managedByUserEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileDeviceIdentifier() {
        return mobileDeviceIdentifier;
    }

    /**
     * Define o valor da propriedade mobileDeviceIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileDeviceIdentifier(Boolean value) {
        this.mobileDeviceIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade mobileQuantityItemSourceSource.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileQuantityItemSourceSource() {
        return mobileQuantityItemSourceSource;
    }

    /**
     * Define o valor da propriedade mobileQuantityItemSourceSource.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileQuantityItemSourceSource(Boolean value) {
        this.mobileQuantityItemSourceSource = value;
    }

    /**
     * Obtém o valor da propriedade netRevenue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetRevenue() {
        return netRevenue;
    }

    /**
     * Define o valor da propriedade netRevenue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetRevenue(Boolean value) {
        this.netRevenue = value;
    }

    /**
     * Obtém o valor da propriedade openCloseDetails.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenCloseDetails() {
        return openCloseDetails;
    }

    /**
     * Define o valor da propriedade openCloseDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenCloseDetails(Boolean value) {
        this.openCloseDetails = value;
    }

    /**
     * Obtém o valor da propriedade openCloseDetailsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OpenCloseDetailPropertyOptions> getOpenCloseDetailsOptions() {
        return openCloseDetailsOptions;
    }

    /**
     * Define o valor da propriedade openCloseDetailsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public void setOpenCloseDetailsOptions(JAXBElement<OpenCloseDetailPropertyOptions> value) {
        this.openCloseDetailsOptions = value;
    }

    /**
     * Obtém o valor da propriedade pickupQuantitiesDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPickupQuantitiesDifference() {
        return pickupQuantitiesDifference;
    }

    /**
     * Define o valor da propriedade pickupQuantitiesDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupQuantitiesDifference(Boolean value) {
        this.pickupQuantitiesDifference = value;
    }

    /**
     * Obtém o valor da propriedade pickupQuantitiesPercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPickupQuantitiesPercentageDifference() {
        return pickupQuantitiesPercentageDifference;
    }

    /**
     * Define o valor da propriedade pickupQuantitiesPercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupQuantitiesPercentageDifference(Boolean value) {
        this.pickupQuantitiesPercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade plannedDeliveryCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedDeliveryCategory1Quantities() {
        return plannedDeliveryCategory1Quantities;
    }

    /**
     * Define o valor da propriedade plannedDeliveryCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedDeliveryCategory1Quantities(Boolean value) {
        this.plannedDeliveryCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedDeliveryCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedDeliveryCategory2Quantities() {
        return plannedDeliveryCategory2Quantities;
    }

    /**
     * Define o valor da propriedade plannedDeliveryCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedDeliveryCategory2Quantities(Boolean value) {
        this.plannedDeliveryCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedDeliveryCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedDeliveryCategory3Quantities() {
        return plannedDeliveryCategory3Quantities;
    }

    /**
     * Define o valor da propriedade plannedDeliveryCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedDeliveryCategory3Quantities(Boolean value) {
        this.plannedDeliveryCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedDeliveryQuantities() {
        return plannedDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade plannedDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedDeliveryQuantities(Boolean value) {
        this.plannedDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedPickupCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedPickupCategory1Quantities() {
        return plannedPickupCategory1Quantities;
    }

    /**
     * Define o valor da propriedade plannedPickupCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedPickupCategory1Quantities(Boolean value) {
        this.plannedPickupCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedPickupCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedPickupCategory2Quantities() {
        return plannedPickupCategory2Quantities;
    }

    /**
     * Define o valor da propriedade plannedPickupCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedPickupCategory2Quantities(Boolean value) {
        this.plannedPickupCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedPickupCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedPickupCategory3Quantities() {
        return plannedPickupCategory3Quantities;
    }

    /**
     * Define o valor da propriedade plannedPickupCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedPickupCategory3Quantities(Boolean value) {
        this.plannedPickupCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedPickupQuantities() {
        return plannedPickupQuantities;
    }

    /**
     * Define o valor da propriedade plannedPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedPickupQuantities(Boolean value) {
        this.plannedPickupQuantities = value;
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
     * Obtém o valor da propriedade preferredRouteIdentifierOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredRouteIdentifierOverride() {
        return preferredRouteIdentifierOverride;
    }

    /**
     * Define o valor da propriedade preferredRouteIdentifierOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredRouteIdentifierOverride(Boolean value) {
        this.preferredRouteIdentifierOverride = value;
    }

    /**
     * Obtém o valor da propriedade routeWorkers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteWorkers() {
        return routeWorkers;
    }

    /**
     * Define o valor da propriedade routeWorkers.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteWorkers(Boolean value) {
        this.routeWorkers = value;
    }

    /**
     * Obtém o valor da propriedade routeWorkersOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WorkerPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<WorkerPropertyOptions> getRouteWorkersOptions() {
        return routeWorkersOptions;
    }

    /**
     * Define o valor da propriedade routeWorkersOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WorkerPropertyOptions }{@code >}
     *     
     */
    public void setRouteWorkersOptions(JAXBElement<WorkerPropertyOptions> value) {
        this.routeWorkersOptions = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCustomProperties.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationCustomProperties() {
        return serviceLocationCustomProperties;
    }

    /**
     * Define o valor da propriedade serviceLocationCustomProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationCustomProperties(Boolean value) {
        this.serviceLocationCustomProperties = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindowDetails.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceWindowDetails() {
        return serviceWindowDetails;
    }

    /**
     * Define o valor da propriedade serviceWindowDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceWindowDetails(Boolean value) {
        this.serviceWindowDetails = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindowDetailsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ServiceWindowDetailPropertyOptions> getServiceWindowDetailsOptions() {
        return serviceWindowDetailsOptions;
    }

    /**
     * Define o valor da propriedade serviceWindowDetailsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public void setServiceWindowDetailsOptions(JAXBElement<ServiceWindowDetailPropertyOptions> value) {
        this.serviceWindowDetailsOptions = value;
    }

    /**
     * Obtém o valor da propriedade sessionDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSessionDate() {
        return sessionDate;
    }

    /**
     * Define o valor da propriedade sessionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSessionDate(Boolean value) {
        this.sessionDate = value;
    }

    /**
     * Obtém o valor da propriedade sessionDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSessionDescription() {
        return sessionDescription;
    }

    /**
     * Define o valor da propriedade sessionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSessionDescription(Boolean value) {
        this.sessionDescription = value;
    }

    /**
     * Obtém o valor da propriedade sessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSessionEntityKey() {
        return sessionEntityKey;
    }

    /**
     * Define o valor da propriedade sessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSessionEntityKey(Boolean value) {
        this.sessionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade sessionModeSessionMode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSessionModeSessionMode() {
        return sessionModeSessionMode;
    }

    /**
     * Define o valor da propriedade sessionModeSessionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSessionModeSessionMode(Boolean value) {
        this.sessionModeSessionMode = value;
    }

    /**
     * Obtém o valor da propriedade specialInstructions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Define o valor da propriedade specialInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecialInstructions(Boolean value) {
        this.specialInstructions = value;
    }

    /**
     * Obtém o valor da propriedade takenBy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTakenBy() {
        return takenBy;
    }

    /**
     * Define o valor da propriedade takenBy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTakenBy(Boolean value) {
        this.takenBy = value;
    }

    /**
     * Obtém o valor da propriedade tasksOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaskPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<TaskPropertyOptions> getTasksOptions() {
        return tasksOptions;
    }

    /**
     * Define o valor da propriedade tasksOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaskPropertyOptions }{@code >}
     *     
     */
    public void setTasksOptions(JAXBElement<TaskPropertyOptions> value) {
        this.tasksOptions = value;
    }

    /**
     * Obtém o valor da propriedade unassignedOrderGroupEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnassignedOrderGroupEntityKey() {
        return unassignedOrderGroupEntityKey;
    }

    /**
     * Define o valor da propriedade unassignedOrderGroupEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnassignedOrderGroupEntityKey(Boolean value) {
        this.unassignedOrderGroupEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade verificationHistory.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerificationHistory() {
        return verificationHistory;
    }

    /**
     * Define o valor da propriedade verificationHistory.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerificationHistory(Boolean value) {
        this.verificationHistory = value;
    }

    /**
     * Obtém o valor da propriedade verificationHistoryOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VerificationHistoryItemPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<VerificationHistoryItemPropertyOptions> getVerificationHistoryOptions() {
        return verificationHistoryOptions;
    }

    /**
     * Define o valor da propriedade verificationHistoryOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VerificationHistoryItemPropertyOptions }{@code >}
     *     
     */
    public void setVerificationHistoryOptions(JAXBElement<VerificationHistoryItemPropertyOptions> value) {
        this.verificationHistoryOptions = value;
    }

}
