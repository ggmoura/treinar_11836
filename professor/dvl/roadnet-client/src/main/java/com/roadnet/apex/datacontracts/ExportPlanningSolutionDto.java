
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ExportPlanningSolutionDto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ExportPlanningSolutionDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActiveWeeks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Equipment1Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Equipment1TypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Equipment2Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Equipment2TypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FixedFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="LastStopIsDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderAdditionalServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="OrderClassIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderCoordinateOverride" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="OrderCycleQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="OrderFixedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="OrderForceBulkServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderLoad0" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="OrderLoad1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="OrderLoad2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="OrderLoad3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="OrderLoad4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="OrderLoad5" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="OrderLoad6" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="OrderOpenCloseDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfOrderOpenCloseDetail" minOccurs="0"/&gt;
 *         &lt;element name="OrderOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderPerUnitVariableServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="OrderPreviousDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderPreviousOriginIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderPreviousWeeks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderRequiredRouteOriginIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderSelector" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="OrderServicePatternIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderServicePatternSetIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderServiceWindowDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfOrderServiceWindowDetail" minOccurs="0"/&gt;
 *         &lt;element name="OrderStopNumber0" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OrderStopNumber1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OrderStopNumber2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OrderStopNumber3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OrderStopNumber4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OrderStopNumber5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OrderStopNumber6" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OrderUploadSelector" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="PlanningSessionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanningSessionStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PreviousTerritoryIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecurringOrderCustomProperties" type="{http://roadnet.com/apex/DataContracts/}ExportPlanningSolutionDto.ExportPlanningSolutionCustomPropertiesDto" minOccurs="0"/&gt;
 *         &lt;element name="RouteArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RouteCompleteTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RouteDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RouteDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteHelper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RouteTotalDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="RouteTotalServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="RouteTotalTravelTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationAccountIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationAddress" type="{http://roadnet.com/apex/DataContracts/}Address" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationAlternateContact" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationBuildingDeliverySequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCategoryIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationContact" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCustomProperties" type="{http://roadnet.com/apex/DataContracts/}ExportPlanningSolutionDto.ExportPlanningSolutionCustomPropertiesDto" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationPreferredRouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationServiceTimeTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationServiceWindowTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationStandardInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationStoreNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StopArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="StopDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StopDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="StopDistanceTo" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="StopOpenCloseDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceableStopOpenCloseDetail" minOccurs="0"/&gt;
 *         &lt;element name="StopQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="StopSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StopServiceStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="StopServiceWindowDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceableStopServiceWindowDetail" minOccurs="0"/&gt;
 *         &lt;element name="StopTotalFixedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="StopTotalServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="StopTotalVariableServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="StopTravelTimeTo" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryOriginDepotIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VariableFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Week" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Worker1Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Worker1Name" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="Worker1TypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Worker2Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Worker2Name" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="Worker2TypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportPlanningSolutionDto", propOrder = {
    "activeDays",
    "activeWeeks",
    "equipment1Identifier",
    "equipment1TypeIdentifier",
    "equipment2Identifier",
    "equipment2TypeIdentifier",
    "fixedFee",
    "lastStopIsDestination",
    "orderAdditionalServiceTime",
    "orderClassIdentifier",
    "orderCoordinateOverride",
    "orderCycleQuantities",
    "orderFixedServiceTime",
    "orderForceBulkServiceTime",
    "orderLoad0",
    "orderLoad1",
    "orderLoad2",
    "orderLoad3",
    "orderLoad4",
    "orderLoad5",
    "orderLoad6",
    "orderOpenCloseDetails",
    "orderOrderNumber",
    "orderPerUnitVariableServiceTime",
    "orderPreviousDays",
    "orderPreviousOriginIdentifier",
    "orderPreviousWeeks",
    "orderRequiredRouteOriginIdentifier",
    "orderSelector",
    "orderServicePatternIdentifier",
    "orderServicePatternSetIdentifier",
    "orderServiceWindowDetails",
    "orderStopNumber0",
    "orderStopNumber1",
    "orderStopNumber2",
    "orderStopNumber3",
    "orderStopNumber4",
    "orderStopNumber5",
    "orderStopNumber6",
    "orderUploadSelector",
    "planningSessionDescription",
    "planningSessionStartDate",
    "previousTerritoryIds",
    "recurringOrderCustomProperties",
    "routeArrivalTime",
    "routeCompleteTime",
    "routeDepartureTime",
    "routeDescription",
    "routeHelper",
    "routeIdentifier",
    "routeStartTime",
    "routeTotalDistance",
    "routeTotalServiceTime",
    "routeTotalTravelTime",
    "serviceLocationAccountIdentifier",
    "serviceLocationAddress",
    "serviceLocationAlternateContact",
    "serviceLocationBuildingDeliverySequence",
    "serviceLocationCategoryIdentifier",
    "serviceLocationContact",
    "serviceLocationCoordinate",
    "serviceLocationCustomProperties",
    "serviceLocationDescription",
    "serviceLocationIdentifier",
    "serviceLocationPhoneNumber",
    "serviceLocationPreferredRouteIdentifier",
    "serviceLocationPriority",
    "serviceLocationServiceTimeTypeIdentifier",
    "serviceLocationServiceWindowTypeIdentifier",
    "serviceLocationStandardInstructions",
    "serviceLocationStoreNumber",
    "serviceLocationTimeZone",
    "serviceLocationZone",
    "stopArrivalTime",
    "stopDay",
    "stopDepartureTime",
    "stopDistanceTo",
    "stopOpenCloseDetails",
    "stopQuantities",
    "stopSequenceNumber",
    "stopServiceStartTime",
    "stopServiceWindowDetails",
    "stopTotalFixedServiceTime",
    "stopTotalServiceTime",
    "stopTotalVariableServiceTime",
    "stopTravelTimeTo",
    "territoryDescription",
    "territoryIdentifier",
    "territoryOriginDepotIdentifier",
    "variableFee",
    "week",
    "worker1Identifier",
    "worker1Name",
    "worker1TypeIdentifier",
    "worker2Identifier",
    "worker2Name",
    "worker2TypeIdentifier"
})
public class ExportPlanningSolutionDto
    extends AggregateRootEntity
{

    @XmlElementRef(name = "ActiveDays", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activeDays;
    @XmlElementRef(name = "ActiveWeeks", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activeWeeks;
    @XmlElementRef(name = "Equipment1Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipment1Identifier;
    @XmlElementRef(name = "Equipment1TypeIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipment1TypeIdentifier;
    @XmlElementRef(name = "Equipment2Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipment2Identifier;
    @XmlElementRef(name = "Equipment2TypeIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipment2TypeIdentifier;
    @XmlElementRef(name = "FixedFee", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> fixedFee;
    @XmlElementRef(name = "LastStopIsDestination", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> lastStopIsDestination;
    @XmlElementRef(name = "OrderAdditionalServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> orderAdditionalServiceTime;
    @XmlElementRef(name = "OrderClassIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderClassIdentifier;
    @XmlElementRef(name = "OrderCoordinateOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> orderCoordinateOverride;
    @XmlElementRef(name = "OrderCycleQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> orderCycleQuantities;
    @XmlElementRef(name = "OrderFixedServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> orderFixedServiceTime;
    @XmlElementRef(name = "OrderForceBulkServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> orderForceBulkServiceTime;
    @XmlElementRef(name = "OrderLoad0", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> orderLoad0;
    @XmlElementRef(name = "OrderLoad1", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> orderLoad1;
    @XmlElementRef(name = "OrderLoad2", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> orderLoad2;
    @XmlElementRef(name = "OrderLoad3", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> orderLoad3;
    @XmlElementRef(name = "OrderLoad4", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> orderLoad4;
    @XmlElementRef(name = "OrderLoad5", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> orderLoad5;
    @XmlElementRef(name = "OrderLoad6", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> orderLoad6;
    @XmlElementRef(name = "OrderOpenCloseDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderOpenCloseDetail> orderOpenCloseDetails;
    @XmlElementRef(name = "OrderOrderNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderOrderNumber;
    @XmlElementRef(name = "OrderPerUnitVariableServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> orderPerUnitVariableServiceTime;
    @XmlElementRef(name = "OrderPreviousDays", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderPreviousDays;
    @XmlElementRef(name = "OrderPreviousOriginIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderPreviousOriginIdentifier;
    @XmlElementRef(name = "OrderPreviousWeeks", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderPreviousWeeks;
    @XmlElementRef(name = "OrderRequiredRouteOriginIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderRequiredRouteOriginIdentifier;
    @XmlElementRef(name = "OrderSelector", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> orderSelector;
    @XmlElementRef(name = "OrderServicePatternIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderServicePatternIdentifier;
    @XmlElementRef(name = "OrderServicePatternSetIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderServicePatternSetIdentifier;
    @XmlElementRef(name = "OrderServiceWindowDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderServiceWindowDetail> orderServiceWindowDetails;
    @XmlElementRef(name = "OrderStopNumber0", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> orderStopNumber0;
    @XmlElementRef(name = "OrderStopNumber1", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> orderStopNumber1;
    @XmlElementRef(name = "OrderStopNumber2", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> orderStopNumber2;
    @XmlElementRef(name = "OrderStopNumber3", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> orderStopNumber3;
    @XmlElementRef(name = "OrderStopNumber4", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> orderStopNumber4;
    @XmlElementRef(name = "OrderStopNumber5", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> orderStopNumber5;
    @XmlElementRef(name = "OrderStopNumber6", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> orderStopNumber6;
    @XmlElementRef(name = "OrderUploadSelector", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> orderUploadSelector;
    @XmlElementRef(name = "PlanningSessionDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> planningSessionDescription;
    @XmlElementRef(name = "PlanningSessionStartDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> planningSessionStartDate;
    @XmlElementRef(name = "PreviousTerritoryIds", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousTerritoryIds;
    @XmlElementRef(name = "RecurringOrderCustomProperties", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ExportPlanningSolutionDtoExportPlanningSolutionCustomPropertiesDto> recurringOrderCustomProperties;
    @XmlElementRef(name = "RouteArrivalTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> routeArrivalTime;
    @XmlElementRef(name = "RouteCompleteTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> routeCompleteTime;
    @XmlElementRef(name = "RouteDepartureTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> routeDepartureTime;
    @XmlElementRef(name = "RouteDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeDescription;
    @XmlElementRef(name = "RouteHelper", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> routeHelper;
    @XmlElementRef(name = "RouteIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeIdentifier;
    @XmlElementRef(name = "RouteStartTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> routeStartTime;
    @XmlElementRef(name = "RouteTotalDistance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> routeTotalDistance;
    @XmlElementRef(name = "RouteTotalServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> routeTotalServiceTime;
    @XmlElementRef(name = "RouteTotalTravelTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> routeTotalTravelTime;
    @XmlElementRef(name = "ServiceLocationAccountIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationAccountIdentifier;
    @XmlElementRef(name = "ServiceLocationAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> serviceLocationAddress;
    @XmlElementRef(name = "ServiceLocationAlternateContact", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> serviceLocationAlternateContact;
    @XmlElementRef(name = "ServiceLocationBuildingDeliverySequence", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> serviceLocationBuildingDeliverySequence;
    @XmlElementRef(name = "ServiceLocationCategoryIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationCategoryIdentifier;
    @XmlElementRef(name = "ServiceLocationContact", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> serviceLocationContact;
    @XmlElementRef(name = "ServiceLocationCoordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> serviceLocationCoordinate;
    @XmlElementRef(name = "ServiceLocationCustomProperties", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ExportPlanningSolutionDtoExportPlanningSolutionCustomPropertiesDto> serviceLocationCustomProperties;
    @XmlElementRef(name = "ServiceLocationDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationDescription;
    @XmlElementRef(name = "ServiceLocationIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationIdentifier;
    @XmlElementRef(name = "ServiceLocationPhoneNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationPhoneNumber;
    @XmlElementRef(name = "ServiceLocationPreferredRouteIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationPreferredRouteIdentifier;
    @XmlElementRef(name = "ServiceLocationPriority", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> serviceLocationPriority;
    @XmlElementRef(name = "ServiceLocationServiceTimeTypeIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationServiceTimeTypeIdentifier;
    @XmlElementRef(name = "ServiceLocationServiceWindowTypeIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationServiceWindowTypeIdentifier;
    @XmlElementRef(name = "ServiceLocationStandardInstructions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationStandardInstructions;
    @XmlElementRef(name = "ServiceLocationStoreNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationStoreNumber;
    @XmlElementRef(name = "ServiceLocationTimeZone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationTimeZone;
    @XmlElementRef(name = "ServiceLocationZone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationZone;
    @XmlElementRef(name = "StopArrivalTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> stopArrivalTime;
    @XmlElementRef(name = "StopDay", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stopDay;
    @XmlElementRef(name = "StopDepartureTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> stopDepartureTime;
    @XmlElementRef(name = "StopDistanceTo", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> stopDistanceTo;
    @XmlElementRef(name = "StopOpenCloseDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceableStopOpenCloseDetail> stopOpenCloseDetails;
    @XmlElementRef(name = "StopQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> stopQuantities;
    @XmlElementRef(name = "StopSequenceNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stopSequenceNumber;
    @XmlElement(name = "StopServiceStartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stopServiceStartTime;
    @XmlElementRef(name = "StopServiceWindowDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceableStopServiceWindowDetail> stopServiceWindowDetails;
    @XmlElementRef(name = "StopTotalFixedServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> stopTotalFixedServiceTime;
    @XmlElementRef(name = "StopTotalServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> stopTotalServiceTime;
    @XmlElementRef(name = "StopTotalVariableServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> stopTotalVariableServiceTime;
    @XmlElementRef(name = "StopTravelTimeTo", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> stopTravelTimeTo;
    @XmlElementRef(name = "TerritoryDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> territoryDescription;
    @XmlElementRef(name = "TerritoryIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> territoryIdentifier;
    @XmlElementRef(name = "TerritoryOriginDepotIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> territoryOriginDepotIdentifier;
    @XmlElementRef(name = "VariableFee", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> variableFee;
    @XmlElementRef(name = "Week", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> week;
    @XmlElementRef(name = "Worker1Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worker1Identifier;
    @XmlElementRef(name = "Worker1Name", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> worker1Name;
    @XmlElementRef(name = "Worker1TypeIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worker1TypeIdentifier;
    @XmlElementRef(name = "Worker2Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worker2Identifier;
    @XmlElementRef(name = "Worker2Name", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> worker2Name;
    @XmlElementRef(name = "Worker2TypeIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worker2TypeIdentifier;

    /**
     * Obtém o valor da propriedade activeDays.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActiveDays() {
        return activeDays;
    }

    /**
     * Define o valor da propriedade activeDays.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActiveDays(JAXBElement<String> value) {
        this.activeDays = value;
    }

    /**
     * Obtém o valor da propriedade activeWeeks.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActiveWeeks() {
        return activeWeeks;
    }

    /**
     * Define o valor da propriedade activeWeeks.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActiveWeeks(JAXBElement<String> value) {
        this.activeWeeks = value;
    }

    /**
     * Obtém o valor da propriedade equipment1Identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipment1Identifier() {
        return equipment1Identifier;
    }

    /**
     * Define o valor da propriedade equipment1Identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipment1Identifier(JAXBElement<String> value) {
        this.equipment1Identifier = value;
    }

    /**
     * Obtém o valor da propriedade equipment1TypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipment1TypeIdentifier() {
        return equipment1TypeIdentifier;
    }

    /**
     * Define o valor da propriedade equipment1TypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipment1TypeIdentifier(JAXBElement<String> value) {
        this.equipment1TypeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade equipment2Identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipment2Identifier() {
        return equipment2Identifier;
    }

    /**
     * Define o valor da propriedade equipment2Identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipment2Identifier(JAXBElement<String> value) {
        this.equipment2Identifier = value;
    }

    /**
     * Obtém o valor da propriedade equipment2TypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipment2TypeIdentifier() {
        return equipment2TypeIdentifier;
    }

    /**
     * Define o valor da propriedade equipment2TypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipment2TypeIdentifier(JAXBElement<String> value) {
        this.equipment2TypeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade fixedFee.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getFixedFee() {
        return fixedFee;
    }

    /**
     * Define o valor da propriedade fixedFee.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setFixedFee(JAXBElement<Double> value) {
        this.fixedFee = value;
    }

    /**
     * Obtém o valor da propriedade lastStopIsDestination.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLastStopIsDestination() {
        return lastStopIsDestination;
    }

    /**
     * Define o valor da propriedade lastStopIsDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLastStopIsDestination(JAXBElement<Boolean> value) {
        this.lastStopIsDestination = value;
    }

    /**
     * Obtém o valor da propriedade orderAdditionalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getOrderAdditionalServiceTime() {
        return orderAdditionalServiceTime;
    }

    /**
     * Define o valor da propriedade orderAdditionalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setOrderAdditionalServiceTime(JAXBElement<Duration> value) {
        this.orderAdditionalServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade orderClassIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderClassIdentifier() {
        return orderClassIdentifier;
    }

    /**
     * Define o valor da propriedade orderClassIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderClassIdentifier(JAXBElement<String> value) {
        this.orderClassIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade orderCoordinateOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getOrderCoordinateOverride() {
        return orderCoordinateOverride;
    }

    /**
     * Define o valor da propriedade orderCoordinateOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setOrderCoordinateOverride(JAXBElement<Coordinate> value) {
        this.orderCoordinateOverride = value;
    }

    /**
     * Obtém o valor da propriedade orderCycleQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getOrderCycleQuantities() {
        return orderCycleQuantities;
    }

    /**
     * Define o valor da propriedade orderCycleQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setOrderCycleQuantities(JAXBElement<Quantities> value) {
        this.orderCycleQuantities = value;
    }

    /**
     * Obtém o valor da propriedade orderFixedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getOrderFixedServiceTime() {
        return orderFixedServiceTime;
    }

    /**
     * Define o valor da propriedade orderFixedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setOrderFixedServiceTime(JAXBElement<Duration> value) {
        this.orderFixedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade orderForceBulkServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getOrderForceBulkServiceTime() {
        return orderForceBulkServiceTime;
    }

    /**
     * Define o valor da propriedade orderForceBulkServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setOrderForceBulkServiceTime(JAXBElement<Boolean> value) {
        this.orderForceBulkServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade orderLoad0.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOrderLoad0() {
        return orderLoad0;
    }

    /**
     * Define o valor da propriedade orderLoad0.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOrderLoad0(JAXBElement<Double> value) {
        this.orderLoad0 = value;
    }

    /**
     * Obtém o valor da propriedade orderLoad1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOrderLoad1() {
        return orderLoad1;
    }

    /**
     * Define o valor da propriedade orderLoad1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOrderLoad1(JAXBElement<Double> value) {
        this.orderLoad1 = value;
    }

    /**
     * Obtém o valor da propriedade orderLoad2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOrderLoad2() {
        return orderLoad2;
    }

    /**
     * Define o valor da propriedade orderLoad2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOrderLoad2(JAXBElement<Double> value) {
        this.orderLoad2 = value;
    }

    /**
     * Obtém o valor da propriedade orderLoad3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOrderLoad3() {
        return orderLoad3;
    }

    /**
     * Define o valor da propriedade orderLoad3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOrderLoad3(JAXBElement<Double> value) {
        this.orderLoad3 = value;
    }

    /**
     * Obtém o valor da propriedade orderLoad4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOrderLoad4() {
        return orderLoad4;
    }

    /**
     * Define o valor da propriedade orderLoad4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOrderLoad4(JAXBElement<Double> value) {
        this.orderLoad4 = value;
    }

    /**
     * Obtém o valor da propriedade orderLoad5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOrderLoad5() {
        return orderLoad5;
    }

    /**
     * Define o valor da propriedade orderLoad5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOrderLoad5(JAXBElement<Double> value) {
        this.orderLoad5 = value;
    }

    /**
     * Obtém o valor da propriedade orderLoad6.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOrderLoad6() {
        return orderLoad6;
    }

    /**
     * Define o valor da propriedade orderLoad6.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOrderLoad6(JAXBElement<Double> value) {
        this.orderLoad6 = value;
    }

    /**
     * Obtém o valor da propriedade orderOpenCloseDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderOpenCloseDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderOpenCloseDetail> getOrderOpenCloseDetails() {
        return orderOpenCloseDetails;
    }

    /**
     * Define o valor da propriedade orderOpenCloseDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderOpenCloseDetail }{@code >}
     *     
     */
    public void setOrderOpenCloseDetails(JAXBElement<ArrayOfOrderOpenCloseDetail> value) {
        this.orderOpenCloseDetails = value;
    }

    /**
     * Obtém o valor da propriedade orderOrderNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderOrderNumber() {
        return orderOrderNumber;
    }

    /**
     * Define o valor da propriedade orderOrderNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderOrderNumber(JAXBElement<String> value) {
        this.orderOrderNumber = value;
    }

    /**
     * Obtém o valor da propriedade orderPerUnitVariableServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getOrderPerUnitVariableServiceTime() {
        return orderPerUnitVariableServiceTime;
    }

    /**
     * Define o valor da propriedade orderPerUnitVariableServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setOrderPerUnitVariableServiceTime(JAXBElement<Duration> value) {
        this.orderPerUnitVariableServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade orderPreviousDays.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderPreviousDays() {
        return orderPreviousDays;
    }

    /**
     * Define o valor da propriedade orderPreviousDays.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderPreviousDays(JAXBElement<String> value) {
        this.orderPreviousDays = value;
    }

    /**
     * Obtém o valor da propriedade orderPreviousOriginIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderPreviousOriginIdentifier() {
        return orderPreviousOriginIdentifier;
    }

    /**
     * Define o valor da propriedade orderPreviousOriginIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderPreviousOriginIdentifier(JAXBElement<String> value) {
        this.orderPreviousOriginIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade orderPreviousWeeks.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderPreviousWeeks() {
        return orderPreviousWeeks;
    }

    /**
     * Define o valor da propriedade orderPreviousWeeks.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderPreviousWeeks(JAXBElement<String> value) {
        this.orderPreviousWeeks = value;
    }

    /**
     * Obtém o valor da propriedade orderRequiredRouteOriginIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderRequiredRouteOriginIdentifier() {
        return orderRequiredRouteOriginIdentifier;
    }

    /**
     * Define o valor da propriedade orderRequiredRouteOriginIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderRequiredRouteOriginIdentifier(JAXBElement<String> value) {
        this.orderRequiredRouteOriginIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade orderSelector.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrderSelector() {
        return orderSelector;
    }

    /**
     * Define o valor da propriedade orderSelector.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrderSelector(JAXBElement<Integer> value) {
        this.orderSelector = value;
    }

    /**
     * Obtém o valor da propriedade orderServicePatternIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderServicePatternIdentifier() {
        return orderServicePatternIdentifier;
    }

    /**
     * Define o valor da propriedade orderServicePatternIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderServicePatternIdentifier(JAXBElement<String> value) {
        this.orderServicePatternIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade orderServicePatternSetIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderServicePatternSetIdentifier() {
        return orderServicePatternSetIdentifier;
    }

    /**
     * Define o valor da propriedade orderServicePatternSetIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderServicePatternSetIdentifier(JAXBElement<String> value) {
        this.orderServicePatternSetIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade orderServiceWindowDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderServiceWindowDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderServiceWindowDetail> getOrderServiceWindowDetails() {
        return orderServiceWindowDetails;
    }

    /**
     * Define o valor da propriedade orderServiceWindowDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderServiceWindowDetail }{@code >}
     *     
     */
    public void setOrderServiceWindowDetails(JAXBElement<ArrayOfOrderServiceWindowDetail> value) {
        this.orderServiceWindowDetails = value;
    }

    /**
     * Obtém o valor da propriedade orderStopNumber0.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrderStopNumber0() {
        return orderStopNumber0;
    }

    /**
     * Define o valor da propriedade orderStopNumber0.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrderStopNumber0(JAXBElement<Integer> value) {
        this.orderStopNumber0 = value;
    }

    /**
     * Obtém o valor da propriedade orderStopNumber1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrderStopNumber1() {
        return orderStopNumber1;
    }

    /**
     * Define o valor da propriedade orderStopNumber1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrderStopNumber1(JAXBElement<Integer> value) {
        this.orderStopNumber1 = value;
    }

    /**
     * Obtém o valor da propriedade orderStopNumber2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrderStopNumber2() {
        return orderStopNumber2;
    }

    /**
     * Define o valor da propriedade orderStopNumber2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrderStopNumber2(JAXBElement<Integer> value) {
        this.orderStopNumber2 = value;
    }

    /**
     * Obtém o valor da propriedade orderStopNumber3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrderStopNumber3() {
        return orderStopNumber3;
    }

    /**
     * Define o valor da propriedade orderStopNumber3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrderStopNumber3(JAXBElement<Integer> value) {
        this.orderStopNumber3 = value;
    }

    /**
     * Obtém o valor da propriedade orderStopNumber4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrderStopNumber4() {
        return orderStopNumber4;
    }

    /**
     * Define o valor da propriedade orderStopNumber4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrderStopNumber4(JAXBElement<Integer> value) {
        this.orderStopNumber4 = value;
    }

    /**
     * Obtém o valor da propriedade orderStopNumber5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrderStopNumber5() {
        return orderStopNumber5;
    }

    /**
     * Define o valor da propriedade orderStopNumber5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrderStopNumber5(JAXBElement<Integer> value) {
        this.orderStopNumber5 = value;
    }

    /**
     * Obtém o valor da propriedade orderStopNumber6.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrderStopNumber6() {
        return orderStopNumber6;
    }

    /**
     * Define o valor da propriedade orderStopNumber6.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrderStopNumber6(JAXBElement<Integer> value) {
        this.orderStopNumber6 = value;
    }

    /**
     * Obtém o valor da propriedade orderUploadSelector.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrderUploadSelector() {
        return orderUploadSelector;
    }

    /**
     * Define o valor da propriedade orderUploadSelector.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrderUploadSelector(JAXBElement<Integer> value) {
        this.orderUploadSelector = value;
    }

    /**
     * Obtém o valor da propriedade planningSessionDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlanningSessionDescription() {
        return planningSessionDescription;
    }

    /**
     * Define o valor da propriedade planningSessionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlanningSessionDescription(JAXBElement<String> value) {
        this.planningSessionDescription = value;
    }

    /**
     * Obtém o valor da propriedade planningSessionStartDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlanningSessionStartDate() {
        return planningSessionStartDate;
    }

    /**
     * Define o valor da propriedade planningSessionStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlanningSessionStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.planningSessionStartDate = value;
    }

    /**
     * Obtém o valor da propriedade previousTerritoryIds.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousTerritoryIds() {
        return previousTerritoryIds;
    }

    /**
     * Define o valor da propriedade previousTerritoryIds.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousTerritoryIds(JAXBElement<String> value) {
        this.previousTerritoryIds = value;
    }

    /**
     * Obtém o valor da propriedade recurringOrderCustomProperties.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExportPlanningSolutionDtoExportPlanningSolutionCustomPropertiesDto }{@code >}
     *     
     */
    public JAXBElement<ExportPlanningSolutionDtoExportPlanningSolutionCustomPropertiesDto> getRecurringOrderCustomProperties() {
        return recurringOrderCustomProperties;
    }

    /**
     * Define o valor da propriedade recurringOrderCustomProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExportPlanningSolutionDtoExportPlanningSolutionCustomPropertiesDto }{@code >}
     *     
     */
    public void setRecurringOrderCustomProperties(JAXBElement<ExportPlanningSolutionDtoExportPlanningSolutionCustomPropertiesDto> value) {
        this.recurringOrderCustomProperties = value;
    }

    /**
     * Obtém o valor da propriedade routeArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRouteArrivalTime() {
        return routeArrivalTime;
    }

    /**
     * Define o valor da propriedade routeArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRouteArrivalTime(JAXBElement<XMLGregorianCalendar> value) {
        this.routeArrivalTime = value;
    }

    /**
     * Obtém o valor da propriedade routeCompleteTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRouteCompleteTime() {
        return routeCompleteTime;
    }

    /**
     * Define o valor da propriedade routeCompleteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRouteCompleteTime(JAXBElement<XMLGregorianCalendar> value) {
        this.routeCompleteTime = value;
    }

    /**
     * Obtém o valor da propriedade routeDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRouteDepartureTime() {
        return routeDepartureTime;
    }

    /**
     * Define o valor da propriedade routeDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRouteDepartureTime(JAXBElement<XMLGregorianCalendar> value) {
        this.routeDepartureTime = value;
    }

    /**
     * Obtém o valor da propriedade routeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteDescription() {
        return routeDescription;
    }

    /**
     * Define o valor da propriedade routeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteDescription(JAXBElement<String> value) {
        this.routeDescription = value;
    }

    /**
     * Obtém o valor da propriedade routeHelper.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRouteHelper() {
        return routeHelper;
    }

    /**
     * Define o valor da propriedade routeHelper.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRouteHelper(JAXBElement<Boolean> value) {
        this.routeHelper = value;
    }

    /**
     * Obtém o valor da propriedade routeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteIdentifier() {
        return routeIdentifier;
    }

    /**
     * Define o valor da propriedade routeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteIdentifier(JAXBElement<String> value) {
        this.routeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade routeStartTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRouteStartTime() {
        return routeStartTime;
    }

    /**
     * Define o valor da propriedade routeStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRouteStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.routeStartTime = value;
    }

    /**
     * Obtém o valor da propriedade routeTotalDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getRouteTotalDistance() {
        return routeTotalDistance;
    }

    /**
     * Define o valor da propriedade routeTotalDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setRouteTotalDistance(JAXBElement<Distance> value) {
        this.routeTotalDistance = value;
    }

    /**
     * Obtém o valor da propriedade routeTotalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getRouteTotalServiceTime() {
        return routeTotalServiceTime;
    }

    /**
     * Define o valor da propriedade routeTotalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setRouteTotalServiceTime(JAXBElement<Duration> value) {
        this.routeTotalServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade routeTotalTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getRouteTotalTravelTime() {
        return routeTotalTravelTime;
    }

    /**
     * Define o valor da propriedade routeTotalTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setRouteTotalTravelTime(JAXBElement<Duration> value) {
        this.routeTotalTravelTime = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationAccountIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationAccountIdentifier() {
        return serviceLocationAccountIdentifier;
    }

    /**
     * Define o valor da propriedade serviceLocationAccountIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationAccountIdentifier(JAXBElement<String> value) {
        this.serviceLocationAccountIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getServiceLocationAddress() {
        return serviceLocationAddress;
    }

    /**
     * Define o valor da propriedade serviceLocationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setServiceLocationAddress(JAXBElement<Address> value) {
        this.serviceLocationAddress = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationAlternateContact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getServiceLocationAlternateContact() {
        return serviceLocationAlternateContact;
    }

    /**
     * Define o valor da propriedade serviceLocationAlternateContact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setServiceLocationAlternateContact(JAXBElement<PersonName> value) {
        this.serviceLocationAlternateContact = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationBuildingDeliverySequence.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getServiceLocationBuildingDeliverySequence() {
        return serviceLocationBuildingDeliverySequence;
    }

    /**
     * Define o valor da propriedade serviceLocationBuildingDeliverySequence.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setServiceLocationBuildingDeliverySequence(JAXBElement<Integer> value) {
        this.serviceLocationBuildingDeliverySequence = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCategoryIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationCategoryIdentifier() {
        return serviceLocationCategoryIdentifier;
    }

    /**
     * Define o valor da propriedade serviceLocationCategoryIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationCategoryIdentifier(JAXBElement<String> value) {
        this.serviceLocationCategoryIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationContact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getServiceLocationContact() {
        return serviceLocationContact;
    }

    /**
     * Define o valor da propriedade serviceLocationContact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setServiceLocationContact(JAXBElement<PersonName> value) {
        this.serviceLocationContact = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getServiceLocationCoordinate() {
        return serviceLocationCoordinate;
    }

    /**
     * Define o valor da propriedade serviceLocationCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setServiceLocationCoordinate(JAXBElement<Coordinate> value) {
        this.serviceLocationCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCustomProperties.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExportPlanningSolutionDtoExportPlanningSolutionCustomPropertiesDto }{@code >}
     *     
     */
    public JAXBElement<ExportPlanningSolutionDtoExportPlanningSolutionCustomPropertiesDto> getServiceLocationCustomProperties() {
        return serviceLocationCustomProperties;
    }

    /**
     * Define o valor da propriedade serviceLocationCustomProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExportPlanningSolutionDtoExportPlanningSolutionCustomPropertiesDto }{@code >}
     *     
     */
    public void setServiceLocationCustomProperties(JAXBElement<ExportPlanningSolutionDtoExportPlanningSolutionCustomPropertiesDto> value) {
        this.serviceLocationCustomProperties = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationDescription() {
        return serviceLocationDescription;
    }

    /**
     * Define o valor da propriedade serviceLocationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationDescription(JAXBElement<String> value) {
        this.serviceLocationDescription = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationIdentifier() {
        return serviceLocationIdentifier;
    }

    /**
     * Define o valor da propriedade serviceLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationIdentifier(JAXBElement<String> value) {
        this.serviceLocationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationPhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationPhoneNumber() {
        return serviceLocationPhoneNumber;
    }

    /**
     * Define o valor da propriedade serviceLocationPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationPhoneNumber(JAXBElement<String> value) {
        this.serviceLocationPhoneNumber = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationPreferredRouteIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationPreferredRouteIdentifier() {
        return serviceLocationPreferredRouteIdentifier;
    }

    /**
     * Define o valor da propriedade serviceLocationPreferredRouteIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationPreferredRouteIdentifier(JAXBElement<String> value) {
        this.serviceLocationPreferredRouteIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationPriority.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getServiceLocationPriority() {
        return serviceLocationPriority;
    }

    /**
     * Define o valor da propriedade serviceLocationPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setServiceLocationPriority(JAXBElement<Integer> value) {
        this.serviceLocationPriority = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationServiceTimeTypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationServiceTimeTypeIdentifier() {
        return serviceLocationServiceTimeTypeIdentifier;
    }

    /**
     * Define o valor da propriedade serviceLocationServiceTimeTypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationServiceTimeTypeIdentifier(JAXBElement<String> value) {
        this.serviceLocationServiceTimeTypeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationServiceWindowTypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationServiceWindowTypeIdentifier() {
        return serviceLocationServiceWindowTypeIdentifier;
    }

    /**
     * Define o valor da propriedade serviceLocationServiceWindowTypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationServiceWindowTypeIdentifier(JAXBElement<String> value) {
        this.serviceLocationServiceWindowTypeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationStandardInstructions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationStandardInstructions() {
        return serviceLocationStandardInstructions;
    }

    /**
     * Define o valor da propriedade serviceLocationStandardInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationStandardInstructions(JAXBElement<String> value) {
        this.serviceLocationStandardInstructions = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationStoreNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationStoreNumber() {
        return serviceLocationStoreNumber;
    }

    /**
     * Define o valor da propriedade serviceLocationStoreNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationStoreNumber(JAXBElement<String> value) {
        this.serviceLocationStoreNumber = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationTimeZone() {
        return serviceLocationTimeZone;
    }

    /**
     * Define o valor da propriedade serviceLocationTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationTimeZone(JAXBElement<String> value) {
        this.serviceLocationTimeZone = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationZone() {
        return serviceLocationZone;
    }

    /**
     * Define o valor da propriedade serviceLocationZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationZone(JAXBElement<String> value) {
        this.serviceLocationZone = value;
    }

    /**
     * Obtém o valor da propriedade stopArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStopArrivalTime() {
        return stopArrivalTime;
    }

    /**
     * Define o valor da propriedade stopArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStopArrivalTime(JAXBElement<XMLGregorianCalendar> value) {
        this.stopArrivalTime = value;
    }

    /**
     * Obtém o valor da propriedade stopDay.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStopDay() {
        return stopDay;
    }

    /**
     * Define o valor da propriedade stopDay.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStopDay(JAXBElement<String> value) {
        this.stopDay = value;
    }

    /**
     * Obtém o valor da propriedade stopDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStopDepartureTime() {
        return stopDepartureTime;
    }

    /**
     * Define o valor da propriedade stopDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStopDepartureTime(JAXBElement<XMLGregorianCalendar> value) {
        this.stopDepartureTime = value;
    }

    /**
     * Obtém o valor da propriedade stopDistanceTo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getStopDistanceTo() {
        return stopDistanceTo;
    }

    /**
     * Define o valor da propriedade stopDistanceTo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setStopDistanceTo(JAXBElement<Distance> value) {
        this.stopDistanceTo = value;
    }

    /**
     * Obtém o valor da propriedade stopOpenCloseDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopOpenCloseDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceableStopOpenCloseDetail> getStopOpenCloseDetails() {
        return stopOpenCloseDetails;
    }

    /**
     * Define o valor da propriedade stopOpenCloseDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopOpenCloseDetail }{@code >}
     *     
     */
    public void setStopOpenCloseDetails(JAXBElement<ArrayOfServiceableStopOpenCloseDetail> value) {
        this.stopOpenCloseDetails = value;
    }

    /**
     * Obtém o valor da propriedade stopQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getStopQuantities() {
        return stopQuantities;
    }

    /**
     * Define o valor da propriedade stopQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setStopQuantities(JAXBElement<Quantities> value) {
        this.stopQuantities = value;
    }

    /**
     * Obtém o valor da propriedade stopSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStopSequenceNumber() {
        return stopSequenceNumber;
    }

    /**
     * Define o valor da propriedade stopSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStopSequenceNumber(JAXBElement<Integer> value) {
        this.stopSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade stopServiceStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStopServiceStartTime() {
        return stopServiceStartTime;
    }

    /**
     * Define o valor da propriedade stopServiceStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStopServiceStartTime(XMLGregorianCalendar value) {
        this.stopServiceStartTime = value;
    }

    /**
     * Obtém o valor da propriedade stopServiceWindowDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopServiceWindowDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceableStopServiceWindowDetail> getStopServiceWindowDetails() {
        return stopServiceWindowDetails;
    }

    /**
     * Define o valor da propriedade stopServiceWindowDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopServiceWindowDetail }{@code >}
     *     
     */
    public void setStopServiceWindowDetails(JAXBElement<ArrayOfServiceableStopServiceWindowDetail> value) {
        this.stopServiceWindowDetails = value;
    }

    /**
     * Obtém o valor da propriedade stopTotalFixedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getStopTotalFixedServiceTime() {
        return stopTotalFixedServiceTime;
    }

    /**
     * Define o valor da propriedade stopTotalFixedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setStopTotalFixedServiceTime(JAXBElement<Duration> value) {
        this.stopTotalFixedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade stopTotalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getStopTotalServiceTime() {
        return stopTotalServiceTime;
    }

    /**
     * Define o valor da propriedade stopTotalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setStopTotalServiceTime(JAXBElement<Duration> value) {
        this.stopTotalServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade stopTotalVariableServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getStopTotalVariableServiceTime() {
        return stopTotalVariableServiceTime;
    }

    /**
     * Define o valor da propriedade stopTotalVariableServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setStopTotalVariableServiceTime(JAXBElement<Duration> value) {
        this.stopTotalVariableServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade stopTravelTimeTo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getStopTravelTimeTo() {
        return stopTravelTimeTo;
    }

    /**
     * Define o valor da propriedade stopTravelTimeTo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setStopTravelTimeTo(JAXBElement<Duration> value) {
        this.stopTravelTimeTo = value;
    }

    /**
     * Obtém o valor da propriedade territoryDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTerritoryDescription() {
        return territoryDescription;
    }

    /**
     * Define o valor da propriedade territoryDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTerritoryDescription(JAXBElement<String> value) {
        this.territoryDescription = value;
    }

    /**
     * Obtém o valor da propriedade territoryIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTerritoryIdentifier() {
        return territoryIdentifier;
    }

    /**
     * Define o valor da propriedade territoryIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTerritoryIdentifier(JAXBElement<String> value) {
        this.territoryIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade territoryOriginDepotIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTerritoryOriginDepotIdentifier() {
        return territoryOriginDepotIdentifier;
    }

    /**
     * Define o valor da propriedade territoryOriginDepotIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTerritoryOriginDepotIdentifier(JAXBElement<String> value) {
        this.territoryOriginDepotIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade variableFee.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVariableFee() {
        return variableFee;
    }

    /**
     * Define o valor da propriedade variableFee.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVariableFee(JAXBElement<Double> value) {
        this.variableFee = value;
    }

    /**
     * Obtém o valor da propriedade week.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWeek() {
        return week;
    }

    /**
     * Define o valor da propriedade week.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWeek(JAXBElement<Integer> value) {
        this.week = value;
    }

    /**
     * Obtém o valor da propriedade worker1Identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorker1Identifier() {
        return worker1Identifier;
    }

    /**
     * Define o valor da propriedade worker1Identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorker1Identifier(JAXBElement<String> value) {
        this.worker1Identifier = value;
    }

    /**
     * Obtém o valor da propriedade worker1Name.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getWorker1Name() {
        return worker1Name;
    }

    /**
     * Define o valor da propriedade worker1Name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setWorker1Name(JAXBElement<PersonName> value) {
        this.worker1Name = value;
    }

    /**
     * Obtém o valor da propriedade worker1TypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorker1TypeIdentifier() {
        return worker1TypeIdentifier;
    }

    /**
     * Define o valor da propriedade worker1TypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorker1TypeIdentifier(JAXBElement<String> value) {
        this.worker1TypeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade worker2Identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorker2Identifier() {
        return worker2Identifier;
    }

    /**
     * Define o valor da propriedade worker2Identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorker2Identifier(JAXBElement<String> value) {
        this.worker2Identifier = value;
    }

    /**
     * Obtém o valor da propriedade worker2Name.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getWorker2Name() {
        return worker2Name;
    }

    /**
     * Define o valor da propriedade worker2Name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setWorker2Name(JAXBElement<PersonName> value) {
        this.worker2Name = value;
    }

    /**
     * Obtém o valor da propriedade worker2TypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorker2TypeIdentifier() {
        return worker2TypeIdentifier;
    }

    /**
     * Define o valor da propriedade worker2TypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorker2TypeIdentifier(JAXBElement<String> value) {
        this.worker2TypeIdentifier = value;
    }

}
