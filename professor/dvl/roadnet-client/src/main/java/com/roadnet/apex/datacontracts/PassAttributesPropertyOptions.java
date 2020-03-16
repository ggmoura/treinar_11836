
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de PassAttributesPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PassAttributesPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdjustStartEarly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AdjustStartLate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AdjustStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllConsideredSizesMustMeetMinRouteCapacity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AssignHelper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BreakTemplates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BreakTemplatesOptions" type="{http://roadnet.com/apex/DataContracts/}BreakTemplatePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="CellSetEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConsiderSize1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConsiderSize2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConsiderSize3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotEquipmentTypeQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableCompartmentRouting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnforceRigidCellBoundaries" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Filters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IncludeServiceTimeInTimeWindowCalculations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastStopIsDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoadAction_StartingLoadAction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxServiceStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxWaitTimeForTimeOfDayRestriction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxWaitTimePerStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumRunTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumTravelTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumPercentOfPreferredTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MultiDayRoutingOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MultiDayRoutingOptionsOptions" type="{http://roadnet.com/apex/DataContracts/}MultiDayRoutingOptionsPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="MustMakeAllTimeWindows" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MustMeetAllRouteMinimums" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmitStem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OnlyRouteOrdersInCells" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PickupsAtEnd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PostRouteTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreRouteTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRunTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RecalculateBreaksAfterRouteCreation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReloadOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReloadOptionsOptions" type="{http://roadnet.com/apex/DataContracts/}ReloadOptionsPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ResourceAvailabilityMode_ResourceMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteIdentifierSeed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteMinimumPercentOfCapacity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldUseAllResources" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseEquipmentTypeUsageOrdering" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WaitToMakeTimeWindows" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassAttributesPropertyOptions", propOrder = {
    "adjustStartEarly",
    "adjustStartLate",
    "adjustStartTime",
    "allConsideredSizesMustMeetMinRouteCapacity",
    "assignHelper",
    "breakTemplates",
    "breakTemplatesOptions",
    "cellSetEntityKey",
    "considerSize1",
    "considerSize2",
    "considerSize3",
    "depotEquipmentTypeQuantities",
    "enableCompartmentRouting",
    "enforceRigidCellBoundaries",
    "filters",
    "includeServiceTimeInTimeWindowCalculations",
    "lastStopIsDestination",
    "loadActionStartingLoadAction",
    "maxServiceStops",
    "maxWaitTimeForTimeOfDayRestriction",
    "maxWaitTimePerStop",
    "maximumRunTime",
    "maximumTravelTime",
    "minimumPercentOfPreferredTime",
    "multiDayRoutingOptions",
    "multiDayRoutingOptionsOptions",
    "mustMakeAllTimeWindows",
    "mustMeetAllRouteMinimums",
    "omitStem",
    "onlyRouteOrdersInCells",
    "pickupsAtEnd",
    "postRouteTime",
    "preRouteTime",
    "preferredRunTime",
    "recalculateBreaksAfterRouteCreation",
    "reloadOptions",
    "reloadOptionsOptions",
    "resourceAvailabilityModeResourceMode",
    "routeIdentifierSeed",
    "routeMinimumPercentOfCapacity",
    "shouldUseAllResources",
    "startTime",
    "useEquipmentTypeUsageOrdering",
    "waitToMakeTimeWindows"
})
public class PassAttributesPropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "AdjustStartEarly")
    protected Boolean adjustStartEarly;
    @XmlElement(name = "AdjustStartLate")
    protected Boolean adjustStartLate;
    @XmlElement(name = "AdjustStartTime")
    protected Boolean adjustStartTime;
    @XmlElement(name = "AllConsideredSizesMustMeetMinRouteCapacity")
    protected Boolean allConsideredSizesMustMeetMinRouteCapacity;
    @XmlElement(name = "AssignHelper")
    protected Boolean assignHelper;
    @XmlElement(name = "BreakTemplates")
    protected Boolean breakTemplates;
    @XmlElementRef(name = "BreakTemplatesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<BreakTemplatePropertyOptions> breakTemplatesOptions;
    @XmlElement(name = "CellSetEntityKey")
    protected Boolean cellSetEntityKey;
    @XmlElement(name = "ConsiderSize1")
    protected Boolean considerSize1;
    @XmlElement(name = "ConsiderSize2")
    protected Boolean considerSize2;
    @XmlElement(name = "ConsiderSize3")
    protected Boolean considerSize3;
    @XmlElement(name = "DepotEquipmentTypeQuantities")
    protected Boolean depotEquipmentTypeQuantities;
    @XmlElement(name = "EnableCompartmentRouting")
    protected Boolean enableCompartmentRouting;
    @XmlElement(name = "EnforceRigidCellBoundaries")
    protected Boolean enforceRigidCellBoundaries;
    @XmlElement(name = "Filters")
    protected Boolean filters;
    @XmlElement(name = "IncludeServiceTimeInTimeWindowCalculations")
    protected Boolean includeServiceTimeInTimeWindowCalculations;
    @XmlElement(name = "LastStopIsDestination")
    protected Boolean lastStopIsDestination;
    @XmlElement(name = "LoadAction_StartingLoadAction")
    protected Boolean loadActionStartingLoadAction;
    @XmlElement(name = "MaxServiceStops")
    protected Boolean maxServiceStops;
    @XmlElement(name = "MaxWaitTimeForTimeOfDayRestriction")
    protected Boolean maxWaitTimeForTimeOfDayRestriction;
    @XmlElement(name = "MaxWaitTimePerStop")
    protected Boolean maxWaitTimePerStop;
    @XmlElement(name = "MaximumRunTime")
    protected Boolean maximumRunTime;
    @XmlElement(name = "MaximumTravelTime")
    protected Boolean maximumTravelTime;
    @XmlElement(name = "MinimumPercentOfPreferredTime")
    protected Boolean minimumPercentOfPreferredTime;
    @XmlElement(name = "MultiDayRoutingOptions")
    protected Boolean multiDayRoutingOptions;
    @XmlElementRef(name = "MultiDayRoutingOptionsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiDayRoutingOptionsPropertyOptions> multiDayRoutingOptionsOptions;
    @XmlElement(name = "MustMakeAllTimeWindows")
    protected Boolean mustMakeAllTimeWindows;
    @XmlElement(name = "MustMeetAllRouteMinimums")
    protected Boolean mustMeetAllRouteMinimums;
    @XmlElement(name = "OmitStem")
    protected Boolean omitStem;
    @XmlElement(name = "OnlyRouteOrdersInCells")
    protected Boolean onlyRouteOrdersInCells;
    @XmlElement(name = "PickupsAtEnd")
    protected Boolean pickupsAtEnd;
    @XmlElement(name = "PostRouteTime")
    protected Boolean postRouteTime;
    @XmlElement(name = "PreRouteTime")
    protected Boolean preRouteTime;
    @XmlElement(name = "PreferredRunTime")
    protected Boolean preferredRunTime;
    @XmlElement(name = "RecalculateBreaksAfterRouteCreation")
    protected Boolean recalculateBreaksAfterRouteCreation;
    @XmlElement(name = "ReloadOptions")
    protected Boolean reloadOptions;
    @XmlElementRef(name = "ReloadOptionsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ReloadOptionsPropertyOptions> reloadOptionsOptions;
    @XmlElement(name = "ResourceAvailabilityMode_ResourceMode")
    protected Boolean resourceAvailabilityModeResourceMode;
    @XmlElement(name = "RouteIdentifierSeed")
    protected Boolean routeIdentifierSeed;
    @XmlElement(name = "RouteMinimumPercentOfCapacity")
    protected Boolean routeMinimumPercentOfCapacity;
    @XmlElement(name = "ShouldUseAllResources")
    protected Boolean shouldUseAllResources;
    @XmlElement(name = "StartTime")
    protected Boolean startTime;
    @XmlElement(name = "UseEquipmentTypeUsageOrdering")
    protected Boolean useEquipmentTypeUsageOrdering;
    @XmlElement(name = "WaitToMakeTimeWindows")
    protected Boolean waitToMakeTimeWindows;

    /**
     * Obtém o valor da propriedade adjustStartEarly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustStartEarly() {
        return adjustStartEarly;
    }

    /**
     * Define o valor da propriedade adjustStartEarly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustStartEarly(Boolean value) {
        this.adjustStartEarly = value;
    }

    /**
     * Obtém o valor da propriedade adjustStartLate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustStartLate() {
        return adjustStartLate;
    }

    /**
     * Define o valor da propriedade adjustStartLate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustStartLate(Boolean value) {
        this.adjustStartLate = value;
    }

    /**
     * Obtém o valor da propriedade adjustStartTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustStartTime() {
        return adjustStartTime;
    }

    /**
     * Define o valor da propriedade adjustStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustStartTime(Boolean value) {
        this.adjustStartTime = value;
    }

    /**
     * Obtém o valor da propriedade allConsideredSizesMustMeetMinRouteCapacity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllConsideredSizesMustMeetMinRouteCapacity() {
        return allConsideredSizesMustMeetMinRouteCapacity;
    }

    /**
     * Define o valor da propriedade allConsideredSizesMustMeetMinRouteCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllConsideredSizesMustMeetMinRouteCapacity(Boolean value) {
        this.allConsideredSizesMustMeetMinRouteCapacity = value;
    }

    /**
     * Obtém o valor da propriedade assignHelper.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssignHelper() {
        return assignHelper;
    }

    /**
     * Define o valor da propriedade assignHelper.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignHelper(Boolean value) {
        this.assignHelper = value;
    }

    /**
     * Obtém o valor da propriedade breakTemplates.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBreakTemplates() {
        return breakTemplates;
    }

    /**
     * Define o valor da propriedade breakTemplates.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBreakTemplates(Boolean value) {
        this.breakTemplates = value;
    }

    /**
     * Obtém o valor da propriedade breakTemplatesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BreakTemplatePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<BreakTemplatePropertyOptions> getBreakTemplatesOptions() {
        return breakTemplatesOptions;
    }

    /**
     * Define o valor da propriedade breakTemplatesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BreakTemplatePropertyOptions }{@code >}
     *     
     */
    public void setBreakTemplatesOptions(JAXBElement<BreakTemplatePropertyOptions> value) {
        this.breakTemplatesOptions = value;
    }

    /**
     * Obtém o valor da propriedade cellSetEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCellSetEntityKey() {
        return cellSetEntityKey;
    }

    /**
     * Define o valor da propriedade cellSetEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCellSetEntityKey(Boolean value) {
        this.cellSetEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade considerSize1.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsiderSize1() {
        return considerSize1;
    }

    /**
     * Define o valor da propriedade considerSize1.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsiderSize1(Boolean value) {
        this.considerSize1 = value;
    }

    /**
     * Obtém o valor da propriedade considerSize2.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsiderSize2() {
        return considerSize2;
    }

    /**
     * Define o valor da propriedade considerSize2.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsiderSize2(Boolean value) {
        this.considerSize2 = value;
    }

    /**
     * Obtém o valor da propriedade considerSize3.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsiderSize3() {
        return considerSize3;
    }

    /**
     * Define o valor da propriedade considerSize3.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsiderSize3(Boolean value) {
        this.considerSize3 = value;
    }

    /**
     * Obtém o valor da propriedade depotEquipmentTypeQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepotEquipmentTypeQuantities() {
        return depotEquipmentTypeQuantities;
    }

    /**
     * Define o valor da propriedade depotEquipmentTypeQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepotEquipmentTypeQuantities(Boolean value) {
        this.depotEquipmentTypeQuantities = value;
    }

    /**
     * Obtém o valor da propriedade enableCompartmentRouting.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableCompartmentRouting() {
        return enableCompartmentRouting;
    }

    /**
     * Define o valor da propriedade enableCompartmentRouting.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableCompartmentRouting(Boolean value) {
        this.enableCompartmentRouting = value;
    }

    /**
     * Obtém o valor da propriedade enforceRigidCellBoundaries.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnforceRigidCellBoundaries() {
        return enforceRigidCellBoundaries;
    }

    /**
     * Define o valor da propriedade enforceRigidCellBoundaries.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnforceRigidCellBoundaries(Boolean value) {
        this.enforceRigidCellBoundaries = value;
    }

    /**
     * Obtém o valor da propriedade filters.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilters() {
        return filters;
    }

    /**
     * Define o valor da propriedade filters.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilters(Boolean value) {
        this.filters = value;
    }

    /**
     * Obtém o valor da propriedade includeServiceTimeInTimeWindowCalculations.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeServiceTimeInTimeWindowCalculations() {
        return includeServiceTimeInTimeWindowCalculations;
    }

    /**
     * Define o valor da propriedade includeServiceTimeInTimeWindowCalculations.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeServiceTimeInTimeWindowCalculations(Boolean value) {
        this.includeServiceTimeInTimeWindowCalculations = value;
    }

    /**
     * Obtém o valor da propriedade lastStopIsDestination.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastStopIsDestination() {
        return lastStopIsDestination;
    }

    /**
     * Define o valor da propriedade lastStopIsDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastStopIsDestination(Boolean value) {
        this.lastStopIsDestination = value;
    }

    /**
     * Obtém o valor da propriedade loadActionStartingLoadAction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoadActionStartingLoadAction() {
        return loadActionStartingLoadAction;
    }

    /**
     * Define o valor da propriedade loadActionStartingLoadAction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoadActionStartingLoadAction(Boolean value) {
        this.loadActionStartingLoadAction = value;
    }

    /**
     * Obtém o valor da propriedade maxServiceStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxServiceStops() {
        return maxServiceStops;
    }

    /**
     * Define o valor da propriedade maxServiceStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxServiceStops(Boolean value) {
        this.maxServiceStops = value;
    }

    /**
     * Obtém o valor da propriedade maxWaitTimeForTimeOfDayRestriction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxWaitTimeForTimeOfDayRestriction() {
        return maxWaitTimeForTimeOfDayRestriction;
    }

    /**
     * Define o valor da propriedade maxWaitTimeForTimeOfDayRestriction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxWaitTimeForTimeOfDayRestriction(Boolean value) {
        this.maxWaitTimeForTimeOfDayRestriction = value;
    }

    /**
     * Obtém o valor da propriedade maxWaitTimePerStop.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxWaitTimePerStop() {
        return maxWaitTimePerStop;
    }

    /**
     * Define o valor da propriedade maxWaitTimePerStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxWaitTimePerStop(Boolean value) {
        this.maxWaitTimePerStop = value;
    }

    /**
     * Obtém o valor da propriedade maximumRunTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumRunTime() {
        return maximumRunTime;
    }

    /**
     * Define o valor da propriedade maximumRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumRunTime(Boolean value) {
        this.maximumRunTime = value;
    }

    /**
     * Obtém o valor da propriedade maximumTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumTravelTime() {
        return maximumTravelTime;
    }

    /**
     * Define o valor da propriedade maximumTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumTravelTime(Boolean value) {
        this.maximumTravelTime = value;
    }

    /**
     * Obtém o valor da propriedade minimumPercentOfPreferredTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumPercentOfPreferredTime() {
        return minimumPercentOfPreferredTime;
    }

    /**
     * Define o valor da propriedade minimumPercentOfPreferredTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumPercentOfPreferredTime(Boolean value) {
        this.minimumPercentOfPreferredTime = value;
    }

    /**
     * Obtém o valor da propriedade multiDayRoutingOptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiDayRoutingOptions() {
        return multiDayRoutingOptions;
    }

    /**
     * Define o valor da propriedade multiDayRoutingOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiDayRoutingOptions(Boolean value) {
        this.multiDayRoutingOptions = value;
    }

    /**
     * Obtém o valor da propriedade multiDayRoutingOptionsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiDayRoutingOptionsPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<MultiDayRoutingOptionsPropertyOptions> getMultiDayRoutingOptionsOptions() {
        return multiDayRoutingOptionsOptions;
    }

    /**
     * Define o valor da propriedade multiDayRoutingOptionsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiDayRoutingOptionsPropertyOptions }{@code >}
     *     
     */
    public void setMultiDayRoutingOptionsOptions(JAXBElement<MultiDayRoutingOptionsPropertyOptions> value) {
        this.multiDayRoutingOptionsOptions = value;
    }

    /**
     * Obtém o valor da propriedade mustMakeAllTimeWindows.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustMakeAllTimeWindows() {
        return mustMakeAllTimeWindows;
    }

    /**
     * Define o valor da propriedade mustMakeAllTimeWindows.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustMakeAllTimeWindows(Boolean value) {
        this.mustMakeAllTimeWindows = value;
    }

    /**
     * Obtém o valor da propriedade mustMeetAllRouteMinimums.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustMeetAllRouteMinimums() {
        return mustMeetAllRouteMinimums;
    }

    /**
     * Define o valor da propriedade mustMeetAllRouteMinimums.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustMeetAllRouteMinimums(Boolean value) {
        this.mustMeetAllRouteMinimums = value;
    }

    /**
     * Obtém o valor da propriedade omitStem.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOmitStem() {
        return omitStem;
    }

    /**
     * Define o valor da propriedade omitStem.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOmitStem(Boolean value) {
        this.omitStem = value;
    }

    /**
     * Obtém o valor da propriedade onlyRouteOrdersInCells.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlyRouteOrdersInCells() {
        return onlyRouteOrdersInCells;
    }

    /**
     * Define o valor da propriedade onlyRouteOrdersInCells.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyRouteOrdersInCells(Boolean value) {
        this.onlyRouteOrdersInCells = value;
    }

    /**
     * Obtém o valor da propriedade pickupsAtEnd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPickupsAtEnd() {
        return pickupsAtEnd;
    }

    /**
     * Define o valor da propriedade pickupsAtEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupsAtEnd(Boolean value) {
        this.pickupsAtEnd = value;
    }

    /**
     * Obtém o valor da propriedade postRouteTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostRouteTime() {
        return postRouteTime;
    }

    /**
     * Define o valor da propriedade postRouteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostRouteTime(Boolean value) {
        this.postRouteTime = value;
    }

    /**
     * Obtém o valor da propriedade preRouteTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreRouteTime() {
        return preRouteTime;
    }

    /**
     * Define o valor da propriedade preRouteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreRouteTime(Boolean value) {
        this.preRouteTime = value;
    }

    /**
     * Obtém o valor da propriedade preferredRunTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredRunTime() {
        return preferredRunTime;
    }

    /**
     * Define o valor da propriedade preferredRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredRunTime(Boolean value) {
        this.preferredRunTime = value;
    }

    /**
     * Obtém o valor da propriedade recalculateBreaksAfterRouteCreation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecalculateBreaksAfterRouteCreation() {
        return recalculateBreaksAfterRouteCreation;
    }

    /**
     * Define o valor da propriedade recalculateBreaksAfterRouteCreation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecalculateBreaksAfterRouteCreation(Boolean value) {
        this.recalculateBreaksAfterRouteCreation = value;
    }

    /**
     * Obtém o valor da propriedade reloadOptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReloadOptions() {
        return reloadOptions;
    }

    /**
     * Define o valor da propriedade reloadOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReloadOptions(Boolean value) {
        this.reloadOptions = value;
    }

    /**
     * Obtém o valor da propriedade reloadOptionsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReloadOptionsPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ReloadOptionsPropertyOptions> getReloadOptionsOptions() {
        return reloadOptionsOptions;
    }

    /**
     * Define o valor da propriedade reloadOptionsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReloadOptionsPropertyOptions }{@code >}
     *     
     */
    public void setReloadOptionsOptions(JAXBElement<ReloadOptionsPropertyOptions> value) {
        this.reloadOptionsOptions = value;
    }

    /**
     * Obtém o valor da propriedade resourceAvailabilityModeResourceMode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResourceAvailabilityModeResourceMode() {
        return resourceAvailabilityModeResourceMode;
    }

    /**
     * Define o valor da propriedade resourceAvailabilityModeResourceMode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResourceAvailabilityModeResourceMode(Boolean value) {
        this.resourceAvailabilityModeResourceMode = value;
    }

    /**
     * Obtém o valor da propriedade routeIdentifierSeed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteIdentifierSeed() {
        return routeIdentifierSeed;
    }

    /**
     * Define o valor da propriedade routeIdentifierSeed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteIdentifierSeed(Boolean value) {
        this.routeIdentifierSeed = value;
    }

    /**
     * Obtém o valor da propriedade routeMinimumPercentOfCapacity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteMinimumPercentOfCapacity() {
        return routeMinimumPercentOfCapacity;
    }

    /**
     * Define o valor da propriedade routeMinimumPercentOfCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteMinimumPercentOfCapacity(Boolean value) {
        this.routeMinimumPercentOfCapacity = value;
    }

    /**
     * Obtém o valor da propriedade shouldUseAllResources.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldUseAllResources() {
        return shouldUseAllResources;
    }

    /**
     * Define o valor da propriedade shouldUseAllResources.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldUseAllResources(Boolean value) {
        this.shouldUseAllResources = value;
    }

    /**
     * Obtém o valor da propriedade startTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartTime() {
        return startTime;
    }

    /**
     * Define o valor da propriedade startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartTime(Boolean value) {
        this.startTime = value;
    }

    /**
     * Obtém o valor da propriedade useEquipmentTypeUsageOrdering.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseEquipmentTypeUsageOrdering() {
        return useEquipmentTypeUsageOrdering;
    }

    /**
     * Define o valor da propriedade useEquipmentTypeUsageOrdering.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseEquipmentTypeUsageOrdering(Boolean value) {
        this.useEquipmentTypeUsageOrdering = value;
    }

    /**
     * Obtém o valor da propriedade waitToMakeTimeWindows.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaitToMakeTimeWindows() {
        return waitToMakeTimeWindows;
    }

    /**
     * Define o valor da propriedade waitToMakeTimeWindows.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaitToMakeTimeWindows(Boolean value) {
        this.waitToMakeTimeWindows = value;
    }

}
