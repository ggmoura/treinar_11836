
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de StopTemplatePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StopTemplatePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlwaysCreate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CreateIfEmpty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Departure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotCoordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DistanceTo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAccuracy_DepotGeocodeAccuracy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAccuracy_LayoverLocationGeocodeAccuracy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAccuracy_ServiceLocationGeocodeAccuracy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAttentionReason_DepotGeocodeAttentionReason" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAttentionReason_ServiceLocationGeocodeAttentionReason" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeMethod_DepotGeocodeMethod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeMethod_ServiceLocationGeocodeMethod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IncludeAllServiceLocationOpenCloseOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IncludeAllServiceLocationServiceWindowOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationAccountEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationAlternateContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationCoordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationIsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationStandardInstructions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoadAction_LoadAction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Paid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlacementType_Placement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReloadTimeOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteTemplateIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationAccountEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationAlternateContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationBuildingDeliverySequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCategoryEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCoordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCustomProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationIsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationLastOrderDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationOpenCloseOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationOpenCloseOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}OrderClassifiedOpenCloseDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationPriority" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationServiceWindowOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationServiceWindowOverridesOptions" type="{http://roadnet.com/apex/DataContracts/}OrderClassifiedServiceWindowDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationTimeWindowTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopTemplateAlertFlags_Alerts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeWindowImportance_ServiceLocationTimeWindowImportance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_DepotTimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_LayoverLocationTimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_ServiceLocationTimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopTemplatePropertyOptions", propOrder = {
    "alwaysCreate",
    "createIfEmpty",
    "departure",
    "depotAddress",
    "depotCoordinate",
    "depotDescription",
    "depotEntityKey",
    "depotIdentifier",
    "distanceTo",
    "geocodeAccuracyDepotGeocodeAccuracy",
    "geocodeAccuracyLayoverLocationGeocodeAccuracy",
    "geocodeAccuracyServiceLocationGeocodeAccuracy",
    "geocodeAttentionReasonDepotGeocodeAttentionReason",
    "geocodeAttentionReasonServiceLocationGeocodeAttentionReason",
    "geocodeMethodDepotGeocodeMethod",
    "geocodeMethodServiceLocationGeocodeMethod",
    "includeAllServiceLocationOpenCloseOverrides",
    "includeAllServiceLocationServiceWindowOverrides",
    "index",
    "layoverLocationAccountEntityKey",
    "layoverLocationAddress",
    "layoverLocationAlternateContact",
    "layoverLocationContact",
    "layoverLocationCoordinate",
    "layoverLocationDescription",
    "layoverLocationEntityKey",
    "layoverLocationIdentifier",
    "layoverLocationIsDeleted",
    "layoverLocationStandardInstructions",
    "loadActionLoadAction",
    "paid",
    "placementTypePlacement",
    "reloadTimeOverride",
    "routeTemplateIdentifier",
    "sequenceNumber",
    "serviceLocationAccountEntityKey",
    "serviceLocationAddress",
    "serviceLocationAlternateContact",
    "serviceLocationBuildingDeliverySequence",
    "serviceLocationCategoryEntityKey",
    "serviceLocationContact",
    "serviceLocationCoordinate",
    "serviceLocationCustomProperties",
    "serviceLocationDescription",
    "serviceLocationEntityKey",
    "serviceLocationIdentifier",
    "serviceLocationIsDeleted",
    "serviceLocationLastOrderDate",
    "serviceLocationOpenCloseOverrides",
    "serviceLocationOpenCloseOverridesOptions",
    "serviceLocationPriority",
    "serviceLocationServiceWindowOverrides",
    "serviceLocationServiceWindowOverridesOptions",
    "serviceLocationTimeWindowTypeEntityKey",
    "stopTemplateAlertFlagsAlerts",
    "timeWindowImportanceServiceLocationTimeWindowImportance",
    "worldTimeZoneDepotTimeZone",
    "worldTimeZoneLayoverLocationTimeZone",
    "worldTimeZoneServiceLocationTimeZone"
})
public class StopTemplatePropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "AlwaysCreate")
    protected Boolean alwaysCreate;
    @XmlElement(name = "CreateIfEmpty")
    protected Boolean createIfEmpty;
    @XmlElement(name = "Departure")
    protected Boolean departure;
    @XmlElement(name = "DepotAddress")
    protected Boolean depotAddress;
    @XmlElement(name = "DepotCoordinate")
    protected Boolean depotCoordinate;
    @XmlElement(name = "DepotDescription")
    protected Boolean depotDescription;
    @XmlElement(name = "DepotEntityKey")
    protected Boolean depotEntityKey;
    @XmlElement(name = "DepotIdentifier")
    protected Boolean depotIdentifier;
    @XmlElement(name = "DistanceTo")
    protected Boolean distanceTo;
    @XmlElement(name = "GeocodeAccuracy_DepotGeocodeAccuracy")
    protected Boolean geocodeAccuracyDepotGeocodeAccuracy;
    @XmlElement(name = "GeocodeAccuracy_LayoverLocationGeocodeAccuracy")
    protected Boolean geocodeAccuracyLayoverLocationGeocodeAccuracy;
    @XmlElement(name = "GeocodeAccuracy_ServiceLocationGeocodeAccuracy")
    protected Boolean geocodeAccuracyServiceLocationGeocodeAccuracy;
    @XmlElement(name = "GeocodeAttentionReason_DepotGeocodeAttentionReason")
    protected Boolean geocodeAttentionReasonDepotGeocodeAttentionReason;
    @XmlElement(name = "GeocodeAttentionReason_ServiceLocationGeocodeAttentionReason")
    protected Boolean geocodeAttentionReasonServiceLocationGeocodeAttentionReason;
    @XmlElement(name = "GeocodeMethod_DepotGeocodeMethod")
    protected Boolean geocodeMethodDepotGeocodeMethod;
    @XmlElement(name = "GeocodeMethod_ServiceLocationGeocodeMethod")
    protected Boolean geocodeMethodServiceLocationGeocodeMethod;
    @XmlElement(name = "IncludeAllServiceLocationOpenCloseOverrides")
    protected Boolean includeAllServiceLocationOpenCloseOverrides;
    @XmlElement(name = "IncludeAllServiceLocationServiceWindowOverrides")
    protected Boolean includeAllServiceLocationServiceWindowOverrides;
    @XmlElement(name = "Index")
    protected Boolean index;
    @XmlElement(name = "LayoverLocationAccountEntityKey")
    protected Boolean layoverLocationAccountEntityKey;
    @XmlElement(name = "LayoverLocationAddress")
    protected Boolean layoverLocationAddress;
    @XmlElement(name = "LayoverLocationAlternateContact")
    protected Boolean layoverLocationAlternateContact;
    @XmlElement(name = "LayoverLocationContact")
    protected Boolean layoverLocationContact;
    @XmlElement(name = "LayoverLocationCoordinate")
    protected Boolean layoverLocationCoordinate;
    @XmlElement(name = "LayoverLocationDescription")
    protected Boolean layoverLocationDescription;
    @XmlElement(name = "LayoverLocationEntityKey")
    protected Boolean layoverLocationEntityKey;
    @XmlElement(name = "LayoverLocationIdentifier")
    protected Boolean layoverLocationIdentifier;
    @XmlElement(name = "LayoverLocationIsDeleted")
    protected Boolean layoverLocationIsDeleted;
    @XmlElement(name = "LayoverLocationStandardInstructions")
    protected Boolean layoverLocationStandardInstructions;
    @XmlElement(name = "LoadAction_LoadAction")
    protected Boolean loadActionLoadAction;
    @XmlElement(name = "Paid")
    protected Boolean paid;
    @XmlElement(name = "PlacementType_Placement")
    protected Boolean placementTypePlacement;
    @XmlElement(name = "ReloadTimeOverride")
    protected Boolean reloadTimeOverride;
    @XmlElement(name = "RouteTemplateIdentifier")
    protected Boolean routeTemplateIdentifier;
    @XmlElement(name = "SequenceNumber")
    protected Boolean sequenceNumber;
    @XmlElement(name = "ServiceLocationAccountEntityKey")
    protected Boolean serviceLocationAccountEntityKey;
    @XmlElement(name = "ServiceLocationAddress")
    protected Boolean serviceLocationAddress;
    @XmlElement(name = "ServiceLocationAlternateContact")
    protected Boolean serviceLocationAlternateContact;
    @XmlElement(name = "ServiceLocationBuildingDeliverySequence")
    protected Boolean serviceLocationBuildingDeliverySequence;
    @XmlElement(name = "ServiceLocationCategoryEntityKey")
    protected Boolean serviceLocationCategoryEntityKey;
    @XmlElement(name = "ServiceLocationContact")
    protected Boolean serviceLocationContact;
    @XmlElement(name = "ServiceLocationCoordinate")
    protected Boolean serviceLocationCoordinate;
    @XmlElement(name = "ServiceLocationCustomProperties")
    protected Boolean serviceLocationCustomProperties;
    @XmlElement(name = "ServiceLocationDescription")
    protected Boolean serviceLocationDescription;
    @XmlElement(name = "ServiceLocationEntityKey")
    protected Boolean serviceLocationEntityKey;
    @XmlElement(name = "ServiceLocationIdentifier")
    protected Boolean serviceLocationIdentifier;
    @XmlElement(name = "ServiceLocationIsDeleted")
    protected Boolean serviceLocationIsDeleted;
    @XmlElement(name = "ServiceLocationLastOrderDate")
    protected Boolean serviceLocationLastOrderDate;
    @XmlElement(name = "ServiceLocationOpenCloseOverrides")
    protected Boolean serviceLocationOpenCloseOverrides;
    @XmlElementRef(name = "ServiceLocationOpenCloseOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderClassifiedOpenCloseDetailPropertyOptions> serviceLocationOpenCloseOverridesOptions;
    @XmlElement(name = "ServiceLocationPriority")
    protected Boolean serviceLocationPriority;
    @XmlElement(name = "ServiceLocationServiceWindowOverrides")
    protected Boolean serviceLocationServiceWindowOverrides;
    @XmlElementRef(name = "ServiceLocationServiceWindowOverridesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderClassifiedServiceWindowDetailPropertyOptions> serviceLocationServiceWindowOverridesOptions;
    @XmlElement(name = "ServiceLocationTimeWindowTypeEntityKey")
    protected Boolean serviceLocationTimeWindowTypeEntityKey;
    @XmlElement(name = "StopTemplateAlertFlags_Alerts")
    protected Boolean stopTemplateAlertFlagsAlerts;
    @XmlElement(name = "TimeWindowImportance_ServiceLocationTimeWindowImportance")
    protected Boolean timeWindowImportanceServiceLocationTimeWindowImportance;
    @XmlElement(name = "WorldTimeZone_DepotTimeZone")
    protected Boolean worldTimeZoneDepotTimeZone;
    @XmlElement(name = "WorldTimeZone_LayoverLocationTimeZone")
    protected Boolean worldTimeZoneLayoverLocationTimeZone;
    @XmlElement(name = "WorldTimeZone_ServiceLocationTimeZone")
    protected Boolean worldTimeZoneServiceLocationTimeZone;

    /**
     * Obtém o valor da propriedade alwaysCreate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlwaysCreate() {
        return alwaysCreate;
    }

    /**
     * Define o valor da propriedade alwaysCreate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlwaysCreate(Boolean value) {
        this.alwaysCreate = value;
    }

    /**
     * Obtém o valor da propriedade createIfEmpty.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateIfEmpty() {
        return createIfEmpty;
    }

    /**
     * Define o valor da propriedade createIfEmpty.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateIfEmpty(Boolean value) {
        this.createIfEmpty = value;
    }

    /**
     * Obtém o valor da propriedade departure.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeparture() {
        return departure;
    }

    /**
     * Define o valor da propriedade departure.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeparture(Boolean value) {
        this.departure = value;
    }

    /**
     * Obtém o valor da propriedade depotAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepotAddress() {
        return depotAddress;
    }

    /**
     * Define o valor da propriedade depotAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepotAddress(Boolean value) {
        this.depotAddress = value;
    }

    /**
     * Obtém o valor da propriedade depotCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepotCoordinate() {
        return depotCoordinate;
    }

    /**
     * Define o valor da propriedade depotCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepotCoordinate(Boolean value) {
        this.depotCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade depotDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepotDescription() {
        return depotDescription;
    }

    /**
     * Define o valor da propriedade depotDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepotDescription(Boolean value) {
        this.depotDescription = value;
    }

    /**
     * Obtém o valor da propriedade depotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepotEntityKey() {
        return depotEntityKey;
    }

    /**
     * Define o valor da propriedade depotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepotEntityKey(Boolean value) {
        this.depotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade depotIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepotIdentifier() {
        return depotIdentifier;
    }

    /**
     * Define o valor da propriedade depotIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepotIdentifier(Boolean value) {
        this.depotIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade distanceTo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistanceTo() {
        return distanceTo;
    }

    /**
     * Define o valor da propriedade distanceTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistanceTo(Boolean value) {
        this.distanceTo = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAccuracyDepotGeocodeAccuracy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocodeAccuracyDepotGeocodeAccuracy() {
        return geocodeAccuracyDepotGeocodeAccuracy;
    }

    /**
     * Define o valor da propriedade geocodeAccuracyDepotGeocodeAccuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocodeAccuracyDepotGeocodeAccuracy(Boolean value) {
        this.geocodeAccuracyDepotGeocodeAccuracy = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAccuracyLayoverLocationGeocodeAccuracy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocodeAccuracyLayoverLocationGeocodeAccuracy() {
        return geocodeAccuracyLayoverLocationGeocodeAccuracy;
    }

    /**
     * Define o valor da propriedade geocodeAccuracyLayoverLocationGeocodeAccuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocodeAccuracyLayoverLocationGeocodeAccuracy(Boolean value) {
        this.geocodeAccuracyLayoverLocationGeocodeAccuracy = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAccuracyServiceLocationGeocodeAccuracy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocodeAccuracyServiceLocationGeocodeAccuracy() {
        return geocodeAccuracyServiceLocationGeocodeAccuracy;
    }

    /**
     * Define o valor da propriedade geocodeAccuracyServiceLocationGeocodeAccuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocodeAccuracyServiceLocationGeocodeAccuracy(Boolean value) {
        this.geocodeAccuracyServiceLocationGeocodeAccuracy = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAttentionReasonDepotGeocodeAttentionReason.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocodeAttentionReasonDepotGeocodeAttentionReason() {
        return geocodeAttentionReasonDepotGeocodeAttentionReason;
    }

    /**
     * Define o valor da propriedade geocodeAttentionReasonDepotGeocodeAttentionReason.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocodeAttentionReasonDepotGeocodeAttentionReason(Boolean value) {
        this.geocodeAttentionReasonDepotGeocodeAttentionReason = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAttentionReasonServiceLocationGeocodeAttentionReason.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocodeAttentionReasonServiceLocationGeocodeAttentionReason() {
        return geocodeAttentionReasonServiceLocationGeocodeAttentionReason;
    }

    /**
     * Define o valor da propriedade geocodeAttentionReasonServiceLocationGeocodeAttentionReason.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocodeAttentionReasonServiceLocationGeocodeAttentionReason(Boolean value) {
        this.geocodeAttentionReasonServiceLocationGeocodeAttentionReason = value;
    }

    /**
     * Obtém o valor da propriedade geocodeMethodDepotGeocodeMethod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocodeMethodDepotGeocodeMethod() {
        return geocodeMethodDepotGeocodeMethod;
    }

    /**
     * Define o valor da propriedade geocodeMethodDepotGeocodeMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocodeMethodDepotGeocodeMethod(Boolean value) {
        this.geocodeMethodDepotGeocodeMethod = value;
    }

    /**
     * Obtém o valor da propriedade geocodeMethodServiceLocationGeocodeMethod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocodeMethodServiceLocationGeocodeMethod() {
        return geocodeMethodServiceLocationGeocodeMethod;
    }

    /**
     * Define o valor da propriedade geocodeMethodServiceLocationGeocodeMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocodeMethodServiceLocationGeocodeMethod(Boolean value) {
        this.geocodeMethodServiceLocationGeocodeMethod = value;
    }

    /**
     * Obtém o valor da propriedade includeAllServiceLocationOpenCloseOverrides.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAllServiceLocationOpenCloseOverrides() {
        return includeAllServiceLocationOpenCloseOverrides;
    }

    /**
     * Define o valor da propriedade includeAllServiceLocationOpenCloseOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAllServiceLocationOpenCloseOverrides(Boolean value) {
        this.includeAllServiceLocationOpenCloseOverrides = value;
    }

    /**
     * Obtém o valor da propriedade includeAllServiceLocationServiceWindowOverrides.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAllServiceLocationServiceWindowOverrides() {
        return includeAllServiceLocationServiceWindowOverrides;
    }

    /**
     * Define o valor da propriedade includeAllServiceLocationServiceWindowOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAllServiceLocationServiceWindowOverrides(Boolean value) {
        this.includeAllServiceLocationServiceWindowOverrides = value;
    }

    /**
     * Obtém o valor da propriedade index.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndex() {
        return index;
    }

    /**
     * Define o valor da propriedade index.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndex(Boolean value) {
        this.index = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationAccountEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationAccountEntityKey() {
        return layoverLocationAccountEntityKey;
    }

    /**
     * Define o valor da propriedade layoverLocationAccountEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationAccountEntityKey(Boolean value) {
        this.layoverLocationAccountEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationAddress() {
        return layoverLocationAddress;
    }

    /**
     * Define o valor da propriedade layoverLocationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationAddress(Boolean value) {
        this.layoverLocationAddress = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationAlternateContact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationAlternateContact() {
        return layoverLocationAlternateContact;
    }

    /**
     * Define o valor da propriedade layoverLocationAlternateContact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationAlternateContact(Boolean value) {
        this.layoverLocationAlternateContact = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationContact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationContact() {
        return layoverLocationContact;
    }

    /**
     * Define o valor da propriedade layoverLocationContact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationContact(Boolean value) {
        this.layoverLocationContact = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationCoordinate() {
        return layoverLocationCoordinate;
    }

    /**
     * Define o valor da propriedade layoverLocationCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationCoordinate(Boolean value) {
        this.layoverLocationCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationDescription() {
        return layoverLocationDescription;
    }

    /**
     * Define o valor da propriedade layoverLocationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationDescription(Boolean value) {
        this.layoverLocationDescription = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationEntityKey() {
        return layoverLocationEntityKey;
    }

    /**
     * Define o valor da propriedade layoverLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationEntityKey(Boolean value) {
        this.layoverLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationIdentifier() {
        return layoverLocationIdentifier;
    }

    /**
     * Define o valor da propriedade layoverLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationIdentifier(Boolean value) {
        this.layoverLocationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationIsDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationIsDeleted() {
        return layoverLocationIsDeleted;
    }

    /**
     * Define o valor da propriedade layoverLocationIsDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationIsDeleted(Boolean value) {
        this.layoverLocationIsDeleted = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationStandardInstructions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationStandardInstructions() {
        return layoverLocationStandardInstructions;
    }

    /**
     * Define o valor da propriedade layoverLocationStandardInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationStandardInstructions(Boolean value) {
        this.layoverLocationStandardInstructions = value;
    }

    /**
     * Obtém o valor da propriedade loadActionLoadAction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoadActionLoadAction() {
        return loadActionLoadAction;
    }

    /**
     * Define o valor da propriedade loadActionLoadAction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoadActionLoadAction(Boolean value) {
        this.loadActionLoadAction = value;
    }

    /**
     * Obtém o valor da propriedade paid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaid() {
        return paid;
    }

    /**
     * Define o valor da propriedade paid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaid(Boolean value) {
        this.paid = value;
    }

    /**
     * Obtém o valor da propriedade placementTypePlacement.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlacementTypePlacement() {
        return placementTypePlacement;
    }

    /**
     * Define o valor da propriedade placementTypePlacement.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlacementTypePlacement(Boolean value) {
        this.placementTypePlacement = value;
    }

    /**
     * Obtém o valor da propriedade reloadTimeOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReloadTimeOverride() {
        return reloadTimeOverride;
    }

    /**
     * Define o valor da propriedade reloadTimeOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReloadTimeOverride(Boolean value) {
        this.reloadTimeOverride = value;
    }

    /**
     * Obtém o valor da propriedade routeTemplateIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteTemplateIdentifier() {
        return routeTemplateIdentifier;
    }

    /**
     * Define o valor da propriedade routeTemplateIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteTemplateIdentifier(Boolean value) {
        this.routeTemplateIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade sequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Define o valor da propriedade sequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSequenceNumber(Boolean value) {
        this.sequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationAccountEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationAccountEntityKey() {
        return serviceLocationAccountEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationAccountEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationAccountEntityKey(Boolean value) {
        this.serviceLocationAccountEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationAddress() {
        return serviceLocationAddress;
    }

    /**
     * Define o valor da propriedade serviceLocationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationAddress(Boolean value) {
        this.serviceLocationAddress = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationAlternateContact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationAlternateContact() {
        return serviceLocationAlternateContact;
    }

    /**
     * Define o valor da propriedade serviceLocationAlternateContact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationAlternateContact(Boolean value) {
        this.serviceLocationAlternateContact = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationBuildingDeliverySequence.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationBuildingDeliverySequence() {
        return serviceLocationBuildingDeliverySequence;
    }

    /**
     * Define o valor da propriedade serviceLocationBuildingDeliverySequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationBuildingDeliverySequence(Boolean value) {
        this.serviceLocationBuildingDeliverySequence = value;
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
     * Obtém o valor da propriedade serviceLocationContact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationContact() {
        return serviceLocationContact;
    }

    /**
     * Define o valor da propriedade serviceLocationContact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationContact(Boolean value) {
        this.serviceLocationContact = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationCoordinate() {
        return serviceLocationCoordinate;
    }

    /**
     * Define o valor da propriedade serviceLocationCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationCoordinate(Boolean value) {
        this.serviceLocationCoordinate = value;
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
     * Obtém o valor da propriedade serviceLocationDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationDescription() {
        return serviceLocationDescription;
    }

    /**
     * Define o valor da propriedade serviceLocationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationDescription(Boolean value) {
        this.serviceLocationDescription = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationEntityKey() {
        return serviceLocationEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationEntityKey(Boolean value) {
        this.serviceLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationIdentifier() {
        return serviceLocationIdentifier;
    }

    /**
     * Define o valor da propriedade serviceLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationIdentifier(Boolean value) {
        this.serviceLocationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationIsDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationIsDeleted() {
        return serviceLocationIsDeleted;
    }

    /**
     * Define o valor da propriedade serviceLocationIsDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationIsDeleted(Boolean value) {
        this.serviceLocationIsDeleted = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationLastOrderDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationLastOrderDate() {
        return serviceLocationLastOrderDate;
    }

    /**
     * Define o valor da propriedade serviceLocationLastOrderDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationLastOrderDate(Boolean value) {
        this.serviceLocationLastOrderDate = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationOpenCloseOverrides.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationOpenCloseOverrides() {
        return serviceLocationOpenCloseOverrides;
    }

    /**
     * Define o valor da propriedade serviceLocationOpenCloseOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationOpenCloseOverrides(Boolean value) {
        this.serviceLocationOpenCloseOverrides = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationOpenCloseOverridesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderClassifiedOpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OrderClassifiedOpenCloseDetailPropertyOptions> getServiceLocationOpenCloseOverridesOptions() {
        return serviceLocationOpenCloseOverridesOptions;
    }

    /**
     * Define o valor da propriedade serviceLocationOpenCloseOverridesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderClassifiedOpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public void setServiceLocationOpenCloseOverridesOptions(JAXBElement<OrderClassifiedOpenCloseDetailPropertyOptions> value) {
        this.serviceLocationOpenCloseOverridesOptions = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationPriority.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationPriority() {
        return serviceLocationPriority;
    }

    /**
     * Define o valor da propriedade serviceLocationPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationPriority(Boolean value) {
        this.serviceLocationPriority = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationServiceWindowOverrides.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationServiceWindowOverrides() {
        return serviceLocationServiceWindowOverrides;
    }

    /**
     * Define o valor da propriedade serviceLocationServiceWindowOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationServiceWindowOverrides(Boolean value) {
        this.serviceLocationServiceWindowOverrides = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationServiceWindowOverridesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderClassifiedServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OrderClassifiedServiceWindowDetailPropertyOptions> getServiceLocationServiceWindowOverridesOptions() {
        return serviceLocationServiceWindowOverridesOptions;
    }

    /**
     * Define o valor da propriedade serviceLocationServiceWindowOverridesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderClassifiedServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public void setServiceLocationServiceWindowOverridesOptions(JAXBElement<OrderClassifiedServiceWindowDetailPropertyOptions> value) {
        this.serviceLocationServiceWindowOverridesOptions = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationTimeWindowTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationTimeWindowTypeEntityKey() {
        return serviceLocationTimeWindowTypeEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationTimeWindowTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationTimeWindowTypeEntityKey(Boolean value) {
        this.serviceLocationTimeWindowTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade stopTemplateAlertFlagsAlerts.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopTemplateAlertFlagsAlerts() {
        return stopTemplateAlertFlagsAlerts;
    }

    /**
     * Define o valor da propriedade stopTemplateAlertFlagsAlerts.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopTemplateAlertFlagsAlerts(Boolean value) {
        this.stopTemplateAlertFlagsAlerts = value;
    }

    /**
     * Obtém o valor da propriedade timeWindowImportanceServiceLocationTimeWindowImportance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeWindowImportanceServiceLocationTimeWindowImportance() {
        return timeWindowImportanceServiceLocationTimeWindowImportance;
    }

    /**
     * Define o valor da propriedade timeWindowImportanceServiceLocationTimeWindowImportance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeWindowImportanceServiceLocationTimeWindowImportance(Boolean value) {
        this.timeWindowImportanceServiceLocationTimeWindowImportance = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneDepotTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorldTimeZoneDepotTimeZone() {
        return worldTimeZoneDepotTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneDepotTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorldTimeZoneDepotTimeZone(Boolean value) {
        this.worldTimeZoneDepotTimeZone = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneLayoverLocationTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorldTimeZoneLayoverLocationTimeZone() {
        return worldTimeZoneLayoverLocationTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneLayoverLocationTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorldTimeZoneLayoverLocationTimeZone(Boolean value) {
        this.worldTimeZoneLayoverLocationTimeZone = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneServiceLocationTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorldTimeZoneServiceLocationTimeZone() {
        return worldTimeZoneServiceLocationTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneServiceLocationTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorldTimeZoneServiceLocationTimeZone(Boolean value) {
        this.worldTimeZoneServiceLocationTimeZone = value;
    }

}
