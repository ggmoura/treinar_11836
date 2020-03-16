
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.SimpleExpressionBase;


/**
 * <p>Classe Java de PassAttributes complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PassAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdjustStartEarly" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="AdjustStartLate" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="AdjustStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllConsideredSizesMustMeetMinRouteCapacity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AssignHelper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BreakTemplates" type="{http://roadnet.com/apex/DataContracts/}ArrayOfBreakTemplate" minOccurs="0"/&gt;
 *         &lt;element name="CellSetEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ConsiderSize1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConsiderSize2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConsiderSize3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotEquipmentTypeQuantities" type="{http://roadnet.com/apex/DataContracts/}ArrayOfDepotEquipmentTypeQuantity" minOccurs="0"/&gt;
 *         &lt;element name="EnableCompartmentRouting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnforceRigidCellBoundaries" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Filter" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression}SimpleExpressionBase" minOccurs="0"/&gt;
 *         &lt;element name="IncludeServiceTimeInTimeWindowCalculations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastStopIsDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoadAction_StartingLoadAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaxServiceStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxWaitTimeForTimeOfDayRestriction" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MaxWaitTimePerStop" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MaximumRunTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MaximumTravelTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MinimumPercentOfPreferredTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MultiDayRoutingOptions" type="{http://roadnet.com/apex/DataContracts/}MultiDayRoutingOptions" minOccurs="0"/&gt;
 *         &lt;element name="MustMakeAllTimeWindows" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MustMeetAllRouteMinimums" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmitStem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OnlyRouteOrdersInCells" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PickupsAtEnd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PostRouteTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PreRouteTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRunTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="RecalculateBreaksAfterRouteCreation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReloadOptions" type="{http://roadnet.com/apex/DataContracts/}ReloadOptions" minOccurs="0"/&gt;
 *         &lt;element name="ResourceAvailabilityMode_ResourceMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteIdentifierSeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteMinimumPercentOfCapacity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ShouldUseAllResources" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
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
@XmlType(name = "PassAttributes", propOrder = {
    "adjustStartEarly",
    "adjustStartLate",
    "adjustStartTime",
    "allConsideredSizesMustMeetMinRouteCapacity",
    "assignHelper",
    "breakTemplates",
    "cellSetEntityKey",
    "considerSize1",
    "considerSize2",
    "considerSize3",
    "depotEquipmentTypeQuantities",
    "enableCompartmentRouting",
    "enforceRigidCellBoundaries",
    "filter",
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
    "resourceAvailabilityModeResourceMode",
    "routeIdentifierSeed",
    "routeMinimumPercentOfCapacity",
    "shouldUseAllResources",
    "startTime",
    "useEquipmentTypeUsageOrdering",
    "waitToMakeTimeWindows"
})
public class PassAttributes
    extends DataTransferObject
{

    @XmlElement(name = "AdjustStartEarly")
    protected Duration adjustStartEarly;
    @XmlElement(name = "AdjustStartLate")
    protected Duration adjustStartLate;
    @XmlElement(name = "AdjustStartTime")
    protected Boolean adjustStartTime;
    @XmlElement(name = "AllConsideredSizesMustMeetMinRouteCapacity")
    protected Boolean allConsideredSizesMustMeetMinRouteCapacity;
    @XmlElement(name = "AssignHelper")
    protected Boolean assignHelper;
    @XmlElementRef(name = "BreakTemplates", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBreakTemplate> breakTemplates;
    @XmlElementRef(name = "CellSetEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> cellSetEntityKey;
    @XmlElement(name = "ConsiderSize1")
    protected Boolean considerSize1;
    @XmlElement(name = "ConsiderSize2")
    protected Boolean considerSize2;
    @XmlElement(name = "ConsiderSize3")
    protected Boolean considerSize3;
    @XmlElementRef(name = "DepotEquipmentTypeQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDepotEquipmentTypeQuantity> depotEquipmentTypeQuantities;
    @XmlElement(name = "EnableCompartmentRouting")
    protected Boolean enableCompartmentRouting;
    @XmlElement(name = "EnforceRigidCellBoundaries")
    protected Boolean enforceRigidCellBoundaries;
    @XmlElementRef(name = "Filter", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<SimpleExpressionBase> filter;
    @XmlElement(name = "IncludeServiceTimeInTimeWindowCalculations")
    protected Boolean includeServiceTimeInTimeWindowCalculations;
    @XmlElement(name = "LastStopIsDestination")
    protected Boolean lastStopIsDestination;
    @XmlElementRef(name = "LoadAction_StartingLoadAction", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loadActionStartingLoadAction;
    @XmlElementRef(name = "MaxServiceStops", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxServiceStops;
    @XmlElementRef(name = "MaxWaitTimeForTimeOfDayRestriction", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> maxWaitTimeForTimeOfDayRestriction;
    @XmlElementRef(name = "MaxWaitTimePerStop", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> maxWaitTimePerStop;
    @XmlElement(name = "MaximumRunTime")
    protected Duration maximumRunTime;
    @XmlElementRef(name = "MaximumTravelTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> maximumTravelTime;
    @XmlElementRef(name = "MinimumPercentOfPreferredTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> minimumPercentOfPreferredTime;
    @XmlElementRef(name = "MultiDayRoutingOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiDayRoutingOptions> multiDayRoutingOptions;
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
    protected Duration postRouteTime;
    @XmlElement(name = "PreRouteTime")
    protected Duration preRouteTime;
    @XmlElement(name = "PreferredRunTime")
    protected Duration preferredRunTime;
    @XmlElement(name = "RecalculateBreaksAfterRouteCreation")
    protected Boolean recalculateBreaksAfterRouteCreation;
    @XmlElementRef(name = "ReloadOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ReloadOptions> reloadOptions;
    @XmlElementRef(name = "ResourceAvailabilityMode_ResourceMode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resourceAvailabilityModeResourceMode;
    @XmlElementRef(name = "RouteIdentifierSeed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeIdentifierSeed;
    @XmlElementRef(name = "RouteMinimumPercentOfCapacity", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> routeMinimumPercentOfCapacity;
    @XmlElement(name = "ShouldUseAllResources")
    protected Boolean shouldUseAllResources;
    @XmlElementRef(name = "StartTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startTime;
    @XmlElement(name = "UseEquipmentTypeUsageOrdering")
    protected Boolean useEquipmentTypeUsageOrdering;
    @XmlElement(name = "WaitToMakeTimeWindows")
    protected Boolean waitToMakeTimeWindows;

    /**
     * Obtém o valor da propriedade adjustStartEarly.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAdjustStartEarly() {
        return adjustStartEarly;
    }

    /**
     * Define o valor da propriedade adjustStartEarly.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAdjustStartEarly(Duration value) {
        this.adjustStartEarly = value;
    }

    /**
     * Obtém o valor da propriedade adjustStartLate.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAdjustStartLate() {
        return adjustStartLate;
    }

    /**
     * Define o valor da propriedade adjustStartLate.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAdjustStartLate(Duration value) {
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfBreakTemplate }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBreakTemplate> getBreakTemplates() {
        return breakTemplates;
    }

    /**
     * Define o valor da propriedade breakTemplates.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBreakTemplate }{@code >}
     *     
     */
    public void setBreakTemplates(JAXBElement<ArrayOfBreakTemplate> value) {
        this.breakTemplates = value;
    }

    /**
     * Obtém o valor da propriedade cellSetEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCellSetEntityKey() {
        return cellSetEntityKey;
    }

    /**
     * Define o valor da propriedade cellSetEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCellSetEntityKey(JAXBElement<Long> value) {
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfDepotEquipmentTypeQuantity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDepotEquipmentTypeQuantity> getDepotEquipmentTypeQuantities() {
        return depotEquipmentTypeQuantities;
    }

    /**
     * Define o valor da propriedade depotEquipmentTypeQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDepotEquipmentTypeQuantity }{@code >}
     *     
     */
    public void setDepotEquipmentTypeQuantities(JAXBElement<ArrayOfDepotEquipmentTypeQuantity> value) {
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
     * Obtém o valor da propriedade filter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}
     *     
     */
    public JAXBElement<SimpleExpressionBase> getFilter() {
        return filter;
    }

    /**
     * Define o valor da propriedade filter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}
     *     
     */
    public void setFilter(JAXBElement<SimpleExpressionBase> value) {
        this.filter = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoadActionStartingLoadAction() {
        return loadActionStartingLoadAction;
    }

    /**
     * Define o valor da propriedade loadActionStartingLoadAction.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoadActionStartingLoadAction(JAXBElement<String> value) {
        this.loadActionStartingLoadAction = value;
    }

    /**
     * Obtém o valor da propriedade maxServiceStops.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxServiceStops() {
        return maxServiceStops;
    }

    /**
     * Define o valor da propriedade maxServiceStops.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxServiceStops(JAXBElement<Integer> value) {
        this.maxServiceStops = value;
    }

    /**
     * Obtém o valor da propriedade maxWaitTimeForTimeOfDayRestriction.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getMaxWaitTimeForTimeOfDayRestriction() {
        return maxWaitTimeForTimeOfDayRestriction;
    }

    /**
     * Define o valor da propriedade maxWaitTimeForTimeOfDayRestriction.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setMaxWaitTimeForTimeOfDayRestriction(JAXBElement<Duration> value) {
        this.maxWaitTimeForTimeOfDayRestriction = value;
    }

    /**
     * Obtém o valor da propriedade maxWaitTimePerStop.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getMaxWaitTimePerStop() {
        return maxWaitTimePerStop;
    }

    /**
     * Define o valor da propriedade maxWaitTimePerStop.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setMaxWaitTimePerStop(JAXBElement<Duration> value) {
        this.maxWaitTimePerStop = value;
    }

    /**
     * Obtém o valor da propriedade maximumRunTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumRunTime() {
        return maximumRunTime;
    }

    /**
     * Define o valor da propriedade maximumRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumRunTime(Duration value) {
        this.maximumRunTime = value;
    }

    /**
     * Obtém o valor da propriedade maximumTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getMaximumTravelTime() {
        return maximumTravelTime;
    }

    /**
     * Define o valor da propriedade maximumTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setMaximumTravelTime(JAXBElement<Duration> value) {
        this.maximumTravelTime = value;
    }

    /**
     * Obtém o valor da propriedade minimumPercentOfPreferredTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMinimumPercentOfPreferredTime() {
        return minimumPercentOfPreferredTime;
    }

    /**
     * Define o valor da propriedade minimumPercentOfPreferredTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMinimumPercentOfPreferredTime(JAXBElement<Double> value) {
        this.minimumPercentOfPreferredTime = value;
    }

    /**
     * Obtém o valor da propriedade multiDayRoutingOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiDayRoutingOptions }{@code >}
     *     
     */
    public JAXBElement<MultiDayRoutingOptions> getMultiDayRoutingOptions() {
        return multiDayRoutingOptions;
    }

    /**
     * Define o valor da propriedade multiDayRoutingOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiDayRoutingOptions }{@code >}
     *     
     */
    public void setMultiDayRoutingOptions(JAXBElement<MultiDayRoutingOptions> value) {
        this.multiDayRoutingOptions = value;
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
     *     {@link Duration }
     *     
     */
    public Duration getPostRouteTime() {
        return postRouteTime;
    }

    /**
     * Define o valor da propriedade postRouteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPostRouteTime(Duration value) {
        this.postRouteTime = value;
    }

    /**
     * Obtém o valor da propriedade preRouteTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreRouteTime() {
        return preRouteTime;
    }

    /**
     * Define o valor da propriedade preRouteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPreRouteTime(Duration value) {
        this.preRouteTime = value;
    }

    /**
     * Obtém o valor da propriedade preferredRunTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreferredRunTime() {
        return preferredRunTime;
    }

    /**
     * Define o valor da propriedade preferredRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPreferredRunTime(Duration value) {
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
     *     {@link JAXBElement }{@code <}{@link ReloadOptions }{@code >}
     *     
     */
    public JAXBElement<ReloadOptions> getReloadOptions() {
        return reloadOptions;
    }

    /**
     * Define o valor da propriedade reloadOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReloadOptions }{@code >}
     *     
     */
    public void setReloadOptions(JAXBElement<ReloadOptions> value) {
        this.reloadOptions = value;
    }

    /**
     * Obtém o valor da propriedade resourceAvailabilityModeResourceMode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResourceAvailabilityModeResourceMode() {
        return resourceAvailabilityModeResourceMode;
    }

    /**
     * Define o valor da propriedade resourceAvailabilityModeResourceMode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResourceAvailabilityModeResourceMode(JAXBElement<String> value) {
        this.resourceAvailabilityModeResourceMode = value;
    }

    /**
     * Obtém o valor da propriedade routeIdentifierSeed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteIdentifierSeed() {
        return routeIdentifierSeed;
    }

    /**
     * Define o valor da propriedade routeIdentifierSeed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteIdentifierSeed(JAXBElement<String> value) {
        this.routeIdentifierSeed = value;
    }

    /**
     * Obtém o valor da propriedade routeMinimumPercentOfCapacity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRouteMinimumPercentOfCapacity() {
        return routeMinimumPercentOfCapacity;
    }

    /**
     * Define o valor da propriedade routeMinimumPercentOfCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRouteMinimumPercentOfCapacity(JAXBElement<Double> value) {
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
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartTime() {
        return startTime;
    }

    /**
     * Define o valor da propriedade startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<XMLGregorianCalendar> value) {
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
