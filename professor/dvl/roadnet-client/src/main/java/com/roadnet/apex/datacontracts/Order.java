
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;


/**
 * <p>Classe Java de Order complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Order"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}OrderBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryQuantitiesDifference" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryQuantitiesPercentageDifference" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="DeviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="EntryMethod_EntryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManagedByUserEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileQuantityItemSource_Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfOrderOpenCloseDetail" minOccurs="0"/&gt;
 *         &lt;element name="PickupQuantitiesDifference" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PickupQuantitiesPercentageDifference" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDeliveryCategory1Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDeliveryCategory2Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDeliveryCategory3Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedPickupCategory1Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedPickupCategory2Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedPickupCategory3Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedPickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRouteIdentifierOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteWorkers" type="{http://roadnet.com/apex/DataContracts/}ArrayOfWorker" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCustomProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfOrderServiceWindowDetail" minOccurs="0"/&gt;
 *         &lt;element name="SessionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SessionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SessionMode_SessionMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpecialInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TakenBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnassignedOrderGroupEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="VerificationHistory" type="{http://roadnet.com/apex/DataContracts/}ArrayOfVerificationHistoryItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order", propOrder = {
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
    "serviceLocationCustomProperties",
    "serviceWindowDetails",
    "sessionDate",
    "sessionDescription",
    "sessionEntityKey",
    "sessionModeSessionMode",
    "specialInstructions",
    "takenBy",
    "unassignedOrderGroupEntityKey",
    "verificationHistory"
})
public class Order
    extends OrderBase
{

    @XmlElementRef(name = "BeginDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> beginDate;
    @XmlElementRef(name = "DeliveryQuantitiesDifference", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> deliveryQuantitiesDifference;
    @XmlElementRef(name = "DeliveryQuantitiesPercentageDifference", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> deliveryQuantitiesPercentageDifference;
    @XmlElementRef(name = "DeviceIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deviceIdentifier;
    @XmlElementRef(name = "EndDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endDate;
    @XmlElementRef(name = "EntryMethod_EntryMethod", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entryMethodEntryMethod;
    @XmlElement(name = "ManagedByUserEntityKey")
    protected Long managedByUserEntityKey;
    @XmlElementRef(name = "MobileDeviceIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileDeviceIdentifier;
    @XmlElementRef(name = "MobileQuantityItemSource_Source", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileQuantityItemSourceSource;
    @XmlElementRef(name = "NetRevenue", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> netRevenue;
    @XmlElementRef(name = "OpenCloseDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderOpenCloseDetail> openCloseDetails;
    @XmlElementRef(name = "PickupQuantitiesDifference", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> pickupQuantitiesDifference;
    @XmlElementRef(name = "PickupQuantitiesPercentageDifference", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> pickupQuantitiesPercentageDifference;
    @XmlElementRef(name = "PlannedDeliveryCategory1Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedDeliveryCategory1Quantities;
    @XmlElementRef(name = "PlannedDeliveryCategory2Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedDeliveryCategory2Quantities;
    @XmlElementRef(name = "PlannedDeliveryCategory3Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedDeliveryCategory3Quantities;
    @XmlElementRef(name = "PlannedDeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedDeliveryQuantities;
    @XmlElementRef(name = "PlannedPickupCategory1Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedPickupCategory1Quantities;
    @XmlElementRef(name = "PlannedPickupCategory2Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedPickupCategory2Quantities;
    @XmlElementRef(name = "PlannedPickupCategory3Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedPickupCategory3Quantities;
    @XmlElementRef(name = "PlannedPickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedPickupQuantities;
    @XmlElementRef(name = "PreferredRouteIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredRouteIdentifier;
    @XmlElementRef(name = "PreferredRouteIdentifierOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredRouteIdentifierOverride;
    @XmlElementRef(name = "RouteWorkers", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWorker> routeWorkers;
    @XmlElementRef(name = "ServiceLocationCustomProperties", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> serviceLocationCustomProperties;
    @XmlElementRef(name = "ServiceWindowDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderServiceWindowDetail> serviceWindowDetails;
    @XmlElementRef(name = "SessionDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> sessionDate;
    @XmlElementRef(name = "SessionDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionDescription;
    @XmlElementRef(name = "SessionEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> sessionEntityKey;
    @XmlElementRef(name = "SessionMode_SessionMode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionModeSessionMode;
    @XmlElementRef(name = "SpecialInstructions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialInstructions;
    @XmlElementRef(name = "TakenBy", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> takenBy;
    @XmlElementRef(name = "UnassignedOrderGroupEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> unassignedOrderGroupEntityKey;
    @XmlElementRef(name = "VerificationHistory", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVerificationHistoryItem> verificationHistory;

    /**
     * Obtém o valor da propriedade beginDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBeginDate() {
        return beginDate;
    }

    /**
     * Define o valor da propriedade beginDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBeginDate(JAXBElement<XMLGregorianCalendar> value) {
        this.beginDate = value;
    }

    /**
     * Obtém o valor da propriedade deliveryQuantitiesDifference.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getDeliveryQuantitiesDifference() {
        return deliveryQuantitiesDifference;
    }

    /**
     * Define o valor da propriedade deliveryQuantitiesDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setDeliveryQuantitiesDifference(JAXBElement<Quantities> value) {
        this.deliveryQuantitiesDifference = value;
    }

    /**
     * Obtém o valor da propriedade deliveryQuantitiesPercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getDeliveryQuantitiesPercentageDifference() {
        return deliveryQuantitiesPercentageDifference;
    }

    /**
     * Define o valor da propriedade deliveryQuantitiesPercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setDeliveryQuantitiesPercentageDifference(JAXBElement<Quantities> value) {
        this.deliveryQuantitiesPercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade deviceIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeviceIdentifier() {
        return deviceIdentifier;
    }

    /**
     * Define o valor da propriedade deviceIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeviceIdentifier(JAXBElement<String> value) {
        this.deviceIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade endDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDate() {
        return endDate;
    }

    /**
     * Define o valor da propriedade endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.endDate = value;
    }

    /**
     * Obtém o valor da propriedade entryMethodEntryMethod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntryMethodEntryMethod() {
        return entryMethodEntryMethod;
    }

    /**
     * Define o valor da propriedade entryMethodEntryMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntryMethodEntryMethod(JAXBElement<String> value) {
        this.entryMethodEntryMethod = value;
    }

    /**
     * Obtém o valor da propriedade managedByUserEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManagedByUserEntityKey() {
        return managedByUserEntityKey;
    }

    /**
     * Define o valor da propriedade managedByUserEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManagedByUserEntityKey(Long value) {
        this.managedByUserEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileDeviceIdentifier() {
        return mobileDeviceIdentifier;
    }

    /**
     * Define o valor da propriedade mobileDeviceIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileDeviceIdentifier(JAXBElement<String> value) {
        this.mobileDeviceIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade mobileQuantityItemSourceSource.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileQuantityItemSourceSource() {
        return mobileQuantityItemSourceSource;
    }

    /**
     * Define o valor da propriedade mobileQuantityItemSourceSource.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileQuantityItemSourceSource(JAXBElement<String> value) {
        this.mobileQuantityItemSourceSource = value;
    }

    /**
     * Obtém o valor da propriedade netRevenue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNetRevenue() {
        return netRevenue;
    }

    /**
     * Define o valor da propriedade netRevenue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNetRevenue(JAXBElement<Double> value) {
        this.netRevenue = value;
    }

    /**
     * Obtém o valor da propriedade openCloseDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderOpenCloseDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderOpenCloseDetail> getOpenCloseDetails() {
        return openCloseDetails;
    }

    /**
     * Define o valor da propriedade openCloseDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderOpenCloseDetail }{@code >}
     *     
     */
    public void setOpenCloseDetails(JAXBElement<ArrayOfOrderOpenCloseDetail> value) {
        this.openCloseDetails = value;
    }

    /**
     * Obtém o valor da propriedade pickupQuantitiesDifference.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPickupQuantitiesDifference() {
        return pickupQuantitiesDifference;
    }

    /**
     * Define o valor da propriedade pickupQuantitiesDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPickupQuantitiesDifference(JAXBElement<Quantities> value) {
        this.pickupQuantitiesDifference = value;
    }

    /**
     * Obtém o valor da propriedade pickupQuantitiesPercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPickupQuantitiesPercentageDifference() {
        return pickupQuantitiesPercentageDifference;
    }

    /**
     * Define o valor da propriedade pickupQuantitiesPercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPickupQuantitiesPercentageDifference(JAXBElement<Quantities> value) {
        this.pickupQuantitiesPercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade plannedDeliveryCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedDeliveryCategory1Quantities() {
        return plannedDeliveryCategory1Quantities;
    }

    /**
     * Define o valor da propriedade plannedDeliveryCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedDeliveryCategory1Quantities(JAXBElement<Quantities> value) {
        this.plannedDeliveryCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedDeliveryCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedDeliveryCategory2Quantities() {
        return plannedDeliveryCategory2Quantities;
    }

    /**
     * Define o valor da propriedade plannedDeliveryCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedDeliveryCategory2Quantities(JAXBElement<Quantities> value) {
        this.plannedDeliveryCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedDeliveryCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedDeliveryCategory3Quantities() {
        return plannedDeliveryCategory3Quantities;
    }

    /**
     * Define o valor da propriedade plannedDeliveryCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedDeliveryCategory3Quantities(JAXBElement<Quantities> value) {
        this.plannedDeliveryCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedDeliveryQuantities() {
        return plannedDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade plannedDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedDeliveryQuantities(JAXBElement<Quantities> value) {
        this.plannedDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedPickupCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedPickupCategory1Quantities() {
        return plannedPickupCategory1Quantities;
    }

    /**
     * Define o valor da propriedade plannedPickupCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedPickupCategory1Quantities(JAXBElement<Quantities> value) {
        this.plannedPickupCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedPickupCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedPickupCategory2Quantities() {
        return plannedPickupCategory2Quantities;
    }

    /**
     * Define o valor da propriedade plannedPickupCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedPickupCategory2Quantities(JAXBElement<Quantities> value) {
        this.plannedPickupCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedPickupCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedPickupCategory3Quantities() {
        return plannedPickupCategory3Quantities;
    }

    /**
     * Define o valor da propriedade plannedPickupCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedPickupCategory3Quantities(JAXBElement<Quantities> value) {
        this.plannedPickupCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedPickupQuantities() {
        return plannedPickupQuantities;
    }

    /**
     * Define o valor da propriedade plannedPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedPickupQuantities(JAXBElement<Quantities> value) {
        this.plannedPickupQuantities = value;
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
     * Obtém o valor da propriedade preferredRouteIdentifierOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredRouteIdentifierOverride() {
        return preferredRouteIdentifierOverride;
    }

    /**
     * Define o valor da propriedade preferredRouteIdentifierOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredRouteIdentifierOverride(JAXBElement<String> value) {
        this.preferredRouteIdentifierOverride = value;
    }

    /**
     * Obtém o valor da propriedade routeWorkers.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorker }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWorker> getRouteWorkers() {
        return routeWorkers;
    }

    /**
     * Define o valor da propriedade routeWorkers.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorker }{@code >}
     *     
     */
    public void setRouteWorkers(JAXBElement<ArrayOfWorker> value) {
        this.routeWorkers = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCustomProperties.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringanyType> getServiceLocationCustomProperties() {
        return serviceLocationCustomProperties;
    }

    /**
     * Define o valor da propriedade serviceLocationCustomProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public void setServiceLocationCustomProperties(JAXBElement<ArrayOfKeyValueOfstringanyType> value) {
        this.serviceLocationCustomProperties = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindowDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderServiceWindowDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderServiceWindowDetail> getServiceWindowDetails() {
        return serviceWindowDetails;
    }

    /**
     * Define o valor da propriedade serviceWindowDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderServiceWindowDetail }{@code >}
     *     
     */
    public void setServiceWindowDetails(JAXBElement<ArrayOfOrderServiceWindowDetail> value) {
        this.serviceWindowDetails = value;
    }

    /**
     * Obtém o valor da propriedade sessionDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSessionDate() {
        return sessionDate;
    }

    /**
     * Define o valor da propriedade sessionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSessionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.sessionDate = value;
    }

    /**
     * Obtém o valor da propriedade sessionDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSessionDescription() {
        return sessionDescription;
    }

    /**
     * Define o valor da propriedade sessionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSessionDescription(JAXBElement<String> value) {
        this.sessionDescription = value;
    }

    /**
     * Obtém o valor da propriedade sessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSessionEntityKey() {
        return sessionEntityKey;
    }

    /**
     * Define o valor da propriedade sessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSessionEntityKey(JAXBElement<Long> value) {
        this.sessionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade sessionModeSessionMode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSessionModeSessionMode() {
        return sessionModeSessionMode;
    }

    /**
     * Define o valor da propriedade sessionModeSessionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSessionModeSessionMode(JAXBElement<String> value) {
        this.sessionModeSessionMode = value;
    }

    /**
     * Obtém o valor da propriedade specialInstructions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Define o valor da propriedade specialInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialInstructions(JAXBElement<String> value) {
        this.specialInstructions = value;
    }

    /**
     * Obtém o valor da propriedade takenBy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTakenBy() {
        return takenBy;
    }

    /**
     * Define o valor da propriedade takenBy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTakenBy(JAXBElement<String> value) {
        this.takenBy = value;
    }

    /**
     * Obtém o valor da propriedade unassignedOrderGroupEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUnassignedOrderGroupEntityKey() {
        return unassignedOrderGroupEntityKey;
    }

    /**
     * Define o valor da propriedade unassignedOrderGroupEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUnassignedOrderGroupEntityKey(JAXBElement<Long> value) {
        this.unassignedOrderGroupEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade verificationHistory.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVerificationHistoryItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVerificationHistoryItem> getVerificationHistory() {
        return verificationHistory;
    }

    /**
     * Define o valor da propriedade verificationHistory.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVerificationHistoryItem }{@code >}
     *     
     */
    public void setVerificationHistory(JAXBElement<ArrayOfVerificationHistoryItem> value) {
        this.verificationHistory = value;
    }

}
