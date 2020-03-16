
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
 * <p>Classe Java de SendOrderDto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SendOrderDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="BuildingDeliverySequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Consignee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Coordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="CoordinateOverride" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryCategory1Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryCategory2Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryCategory3Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="DepotIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Driver1" type="{http://roadnet.com/apex/DataContracts/}Worker" minOccurs="0"/&gt;
 *         &lt;element name="Driver2" type="{http://roadnet.com/apex/DataContracts/}Worker" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="EntryMethod_EntryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Equipment1" type="{http://roadnet.com/apex/DataContracts/}Equipment" minOccurs="0"/&gt;
 *         &lt;element name="Equipment2" type="{http://roadnet.com/apex/DataContracts/}Equipment" minOccurs="0"/&gt;
 *         &lt;element name="Fee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FixedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="ForceBulkServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItems" type="{http://roadnet.com/apex/DataContracts/}ArrayOfLineItem" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfLineItems" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OrderClassIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderOpenCloseDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfOrderOpenCloseDetail" minOccurs="0"/&gt;
 *         &lt;element name="OrderServiceWindowDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfOrderServiceWindowDetail" minOccurs="0"/&gt;
 *         &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderTypeQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="Paid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PerUnitVariableServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PickupCategory1Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PickupCategory2Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PickupCategory3Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedPickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRouteIdentifierOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriorityOverride" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RequiredDestinationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequiredOriginIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Route" type="{http://roadnet.com/apex/DataContracts/}Route" minOccurs="0"/&gt;
 *         &lt;element name="RouteArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RouteCompleteTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RouteDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RouteDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RouteTotalDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="RouteTotalServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="RouteTotalTravelTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="Selector" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocation" type="{http://roadnet.com/apex/DataContracts/}ServiceLocation" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationAccountIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationAddress" type="{http://roadnet.com/apex/DataContracts/}Address" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationAlternateContact" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationContact" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationStandardInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="SessionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SpecialInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StopArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="StopDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="StopDistanceTo" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="StopOpenCloseDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceableStopOpenCloseDetail" minOccurs="0"/&gt;
 *         &lt;element name="StopServiceStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="StopServiceWindowDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceableStopServiceWindowDetail" minOccurs="0"/&gt;
 *         &lt;element name="StopTotalFixedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="StopTotalPlannedFixedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="StopTotalPlannedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="StopTotalPlannedVariableServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="StopTotalServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="StopTotalVariableServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="StopTravelTimeTo" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="StopType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TakenBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemplateStopSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UploadSelector" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="Urgency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VariableServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendOrderDto", propOrder = {
    "additionalServiceTime",
    "beginDate",
    "buildingDeliverySequence",
    "consignee",
    "coordinate",
    "coordinateOverride",
    "deliveryCategory1Quantities",
    "deliveryCategory2Quantities",
    "deliveryCategory3Quantities",
    "deliveryQuantities",
    "depotIdentifier",
    "driver1",
    "driver2",
    "endDate",
    "entryMethodEntryMethod",
    "equipment1",
    "equipment2",
    "fee",
    "fixedServiceTime",
    "forceBulkServiceTime",
    "lineItems",
    "numberOfLineItems",
    "orderClassIdentifier",
    "orderIdentifier",
    "orderOpenCloseDetails",
    "orderServiceWindowDetails",
    "orderType",
    "orderTypeQuantities",
    "paid",
    "perUnitVariableServiceTime",
    "pickupCategory1Quantities",
    "pickupCategory2Quantities",
    "pickupCategory3Quantities",
    "pickupQuantities",
    "plannedDeliveryQuantities",
    "plannedPickupQuantities",
    "preferredRouteIdentifier",
    "preferredRouteIdentifierOverride",
    "priorityOverride",
    "requiredDestinationIdentifier",
    "requiredOriginIdentifier",
    "route",
    "routeArrivalTime",
    "routeCompleteTime",
    "routeDepartureTime",
    "routeDescription",
    "routeIdentifier",
    "routeStartTime",
    "routeTotalDistance",
    "routeTotalServiceTime",
    "routeTotalTravelTime",
    "selector",
    "sequenceNumber",
    "serviceLocation",
    "serviceLocationAccountIdentifier",
    "serviceLocationAddress",
    "serviceLocationAlternateContact",
    "serviceLocationContact",
    "serviceLocationDescription",
    "serviceLocationIdentifier",
    "serviceLocationPhoneNumber",
    "serviceLocationStandardInstructions",
    "serviceTime",
    "sessionDate",
    "specialInstructions",
    "stopArrivalTime",
    "stopDepartureTime",
    "stopDistanceTo",
    "stopOpenCloseDetails",
    "stopServiceStartTime",
    "stopServiceWindowDetails",
    "stopTotalFixedServiceTime",
    "stopTotalPlannedFixedServiceTime",
    "stopTotalPlannedServiceTime",
    "stopTotalPlannedVariableServiceTime",
    "stopTotalServiceTime",
    "stopTotalVariableServiceTime",
    "stopTravelTimeTo",
    "stopType",
    "takenBy",
    "templateStopSequenceNumber",
    "uploadSelector",
    "urgency",
    "variableServiceTime"
})
public class SendOrderDto
    extends AggregateRootEntity
{

    @XmlElementRef(name = "AdditionalServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> additionalServiceTime;
    @XmlElementRef(name = "BeginDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> beginDate;
    @XmlElementRef(name = "BuildingDeliverySequence", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> buildingDeliverySequence;
    @XmlElementRef(name = "Consignee", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consignee;
    @XmlElementRef(name = "Coordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinate;
    @XmlElementRef(name = "CoordinateOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinateOverride;
    @XmlElementRef(name = "DeliveryCategory1Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> deliveryCategory1Quantities;
    @XmlElementRef(name = "DeliveryCategory2Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> deliveryCategory2Quantities;
    @XmlElementRef(name = "DeliveryCategory3Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> deliveryCategory3Quantities;
    @XmlElementRef(name = "DeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> deliveryQuantities;
    @XmlElementRef(name = "DepotIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depotIdentifier;
    @XmlElementRef(name = "Driver1", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Worker> driver1;
    @XmlElementRef(name = "Driver2", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Worker> driver2;
    @XmlElementRef(name = "EndDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endDate;
    @XmlElementRef(name = "EntryMethod_EntryMethod", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entryMethodEntryMethod;
    @XmlElementRef(name = "Equipment1", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Equipment> equipment1;
    @XmlElementRef(name = "Equipment2", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Equipment> equipment2;
    @XmlElementRef(name = "Fee", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> fee;
    @XmlElementRef(name = "FixedServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> fixedServiceTime;
    @XmlElementRef(name = "ForceBulkServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> forceBulkServiceTime;
    @XmlElementRef(name = "LineItems", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLineItem> lineItems;
    @XmlElementRef(name = "NumberOfLineItems", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfLineItems;
    @XmlElementRef(name = "OrderClassIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderClassIdentifier;
    @XmlElementRef(name = "OrderIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderIdentifier;
    @XmlElementRef(name = "OrderOpenCloseDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderOpenCloseDetail> orderOpenCloseDetails;
    @XmlElementRef(name = "OrderServiceWindowDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderServiceWindowDetail> orderServiceWindowDetails;
    @XmlElementRef(name = "OrderType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderType;
    @XmlElementRef(name = "OrderTypeQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> orderTypeQuantities;
    @XmlElementRef(name = "Paid", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> paid;
    @XmlElementRef(name = "PerUnitVariableServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> perUnitVariableServiceTime;
    @XmlElementRef(name = "PickupCategory1Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> pickupCategory1Quantities;
    @XmlElementRef(name = "PickupCategory2Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> pickupCategory2Quantities;
    @XmlElementRef(name = "PickupCategory3Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> pickupCategory3Quantities;
    @XmlElementRef(name = "PickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> pickupQuantities;
    @XmlElementRef(name = "PlannedDeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedDeliveryQuantities;
    @XmlElementRef(name = "PlannedPickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedPickupQuantities;
    @XmlElementRef(name = "PreferredRouteIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredRouteIdentifier;
    @XmlElementRef(name = "PreferredRouteIdentifierOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredRouteIdentifierOverride;
    @XmlElementRef(name = "PriorityOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> priorityOverride;
    @XmlElementRef(name = "RequiredDestinationIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requiredDestinationIdentifier;
    @XmlElementRef(name = "RequiredOriginIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requiredOriginIdentifier;
    @XmlElementRef(name = "Route", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Route> route;
    @XmlElement(name = "RouteArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar routeArrivalTime;
    @XmlElement(name = "RouteCompleteTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar routeCompleteTime;
    @XmlElement(name = "RouteDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar routeDepartureTime;
    @XmlElementRef(name = "RouteDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeDescription;
    @XmlElementRef(name = "RouteIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeIdentifier;
    @XmlElement(name = "RouteStartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar routeStartTime;
    @XmlElementRef(name = "RouteTotalDistance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> routeTotalDistance;
    @XmlElement(name = "RouteTotalServiceTime")
    protected Duration routeTotalServiceTime;
    @XmlElement(name = "RouteTotalTravelTime")
    protected Duration routeTotalTravelTime;
    @XmlElementRef(name = "Selector", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> selector;
    @XmlElementRef(name = "SequenceNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sequenceNumber;
    @XmlElementRef(name = "ServiceLocation", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceLocation> serviceLocation;
    @XmlElementRef(name = "ServiceLocationAccountIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationAccountIdentifier;
    @XmlElementRef(name = "ServiceLocationAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> serviceLocationAddress;
    @XmlElementRef(name = "ServiceLocationAlternateContact", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> serviceLocationAlternateContact;
    @XmlElementRef(name = "ServiceLocationContact", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> serviceLocationContact;
    @XmlElementRef(name = "ServiceLocationDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationDescription;
    @XmlElementRef(name = "ServiceLocationIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationIdentifier;
    @XmlElementRef(name = "ServiceLocationPhoneNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationPhoneNumber;
    @XmlElementRef(name = "ServiceLocationStandardInstructions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationStandardInstructions;
    @XmlElementRef(name = "ServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> serviceTime;
    @XmlElementRef(name = "SessionDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> sessionDate;
    @XmlElementRef(name = "SpecialInstructions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialInstructions;
    @XmlElementRef(name = "StopArrivalTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> stopArrivalTime;
    @XmlElementRef(name = "StopDepartureTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> stopDepartureTime;
    @XmlElementRef(name = "StopDistanceTo", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> stopDistanceTo;
    @XmlElementRef(name = "StopOpenCloseDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceableStopOpenCloseDetail> stopOpenCloseDetails;
    @XmlElement(name = "StopServiceStartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stopServiceStartTime;
    @XmlElementRef(name = "StopServiceWindowDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceableStopServiceWindowDetail> stopServiceWindowDetails;
    @XmlElementRef(name = "StopTotalFixedServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> stopTotalFixedServiceTime;
    @XmlElementRef(name = "StopTotalPlannedFixedServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> stopTotalPlannedFixedServiceTime;
    @XmlElementRef(name = "StopTotalPlannedServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> stopTotalPlannedServiceTime;
    @XmlElementRef(name = "StopTotalPlannedVariableServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> stopTotalPlannedVariableServiceTime;
    @XmlElementRef(name = "StopTotalServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> stopTotalServiceTime;
    @XmlElementRef(name = "StopTotalVariableServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> stopTotalVariableServiceTime;
    @XmlElementRef(name = "StopTravelTimeTo", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> stopTravelTimeTo;
    @XmlElementRef(name = "StopType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stopType;
    @XmlElementRef(name = "TakenBy", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> takenBy;
    @XmlElementRef(name = "TemplateStopSequenceNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> templateStopSequenceNumber;
    @XmlElementRef(name = "UploadSelector", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> uploadSelector;
    @XmlElementRef(name = "Urgency", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> urgency;
    @XmlElementRef(name = "VariableServiceTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> variableServiceTime;

    /**
     * Obtém o valor da propriedade additionalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getAdditionalServiceTime() {
        return additionalServiceTime;
    }

    /**
     * Define o valor da propriedade additionalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setAdditionalServiceTime(JAXBElement<Duration> value) {
        this.additionalServiceTime = value;
    }

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
     * Obtém o valor da propriedade buildingDeliverySequence.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBuildingDeliverySequence() {
        return buildingDeliverySequence;
    }

    /**
     * Define o valor da propriedade buildingDeliverySequence.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBuildingDeliverySequence(JAXBElement<Integer> value) {
        this.buildingDeliverySequence = value;
    }

    /**
     * Obtém o valor da propriedade consignee.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsignee() {
        return consignee;
    }

    /**
     * Define o valor da propriedade consignee.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsignee(JAXBElement<String> value) {
        this.consignee = value;
    }

    /**
     * Obtém o valor da propriedade coordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getCoordinate() {
        return coordinate;
    }

    /**
     * Define o valor da propriedade coordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setCoordinate(JAXBElement<Coordinate> value) {
        this.coordinate = value;
    }

    /**
     * Obtém o valor da propriedade coordinateOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getCoordinateOverride() {
        return coordinateOverride;
    }

    /**
     * Define o valor da propriedade coordinateOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setCoordinateOverride(JAXBElement<Coordinate> value) {
        this.coordinateOverride = value;
    }

    /**
     * Obtém o valor da propriedade deliveryCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getDeliveryCategory1Quantities() {
        return deliveryCategory1Quantities;
    }

    /**
     * Define o valor da propriedade deliveryCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setDeliveryCategory1Quantities(JAXBElement<Quantities> value) {
        this.deliveryCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade deliveryCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getDeliveryCategory2Quantities() {
        return deliveryCategory2Quantities;
    }

    /**
     * Define o valor da propriedade deliveryCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setDeliveryCategory2Quantities(JAXBElement<Quantities> value) {
        this.deliveryCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade deliveryCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getDeliveryCategory3Quantities() {
        return deliveryCategory3Quantities;
    }

    /**
     * Define o valor da propriedade deliveryCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setDeliveryCategory3Quantities(JAXBElement<Quantities> value) {
        this.deliveryCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade deliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getDeliveryQuantities() {
        return deliveryQuantities;
    }

    /**
     * Define o valor da propriedade deliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setDeliveryQuantities(JAXBElement<Quantities> value) {
        this.deliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade depotIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepotIdentifier() {
        return depotIdentifier;
    }

    /**
     * Define o valor da propriedade depotIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepotIdentifier(JAXBElement<String> value) {
        this.depotIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade driver1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Worker }{@code >}
     *     
     */
    public JAXBElement<Worker> getDriver1() {
        return driver1;
    }

    /**
     * Define o valor da propriedade driver1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Worker }{@code >}
     *     
     */
    public void setDriver1(JAXBElement<Worker> value) {
        this.driver1 = value;
    }

    /**
     * Obtém o valor da propriedade driver2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Worker }{@code >}
     *     
     */
    public JAXBElement<Worker> getDriver2() {
        return driver2;
    }

    /**
     * Define o valor da propriedade driver2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Worker }{@code >}
     *     
     */
    public void setDriver2(JAXBElement<Worker> value) {
        this.driver2 = value;
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
     * Obtém o valor da propriedade equipment1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Equipment }{@code >}
     *     
     */
    public JAXBElement<Equipment> getEquipment1() {
        return equipment1;
    }

    /**
     * Define o valor da propriedade equipment1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Equipment }{@code >}
     *     
     */
    public void setEquipment1(JAXBElement<Equipment> value) {
        this.equipment1 = value;
    }

    /**
     * Obtém o valor da propriedade equipment2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Equipment }{@code >}
     *     
     */
    public JAXBElement<Equipment> getEquipment2() {
        return equipment2;
    }

    /**
     * Define o valor da propriedade equipment2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Equipment }{@code >}
     *     
     */
    public void setEquipment2(JAXBElement<Equipment> value) {
        this.equipment2 = value;
    }

    /**
     * Obtém o valor da propriedade fee.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getFee() {
        return fee;
    }

    /**
     * Define o valor da propriedade fee.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setFee(JAXBElement<Double> value) {
        this.fee = value;
    }

    /**
     * Obtém o valor da propriedade fixedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getFixedServiceTime() {
        return fixedServiceTime;
    }

    /**
     * Define o valor da propriedade fixedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setFixedServiceTime(JAXBElement<Duration> value) {
        this.fixedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade forceBulkServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getForceBulkServiceTime() {
        return forceBulkServiceTime;
    }

    /**
     * Define o valor da propriedade forceBulkServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setForceBulkServiceTime(JAXBElement<Boolean> value) {
        this.forceBulkServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade lineItems.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLineItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLineItem> getLineItems() {
        return lineItems;
    }

    /**
     * Define o valor da propriedade lineItems.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLineItem }{@code >}
     *     
     */
    public void setLineItems(JAXBElement<ArrayOfLineItem> value) {
        this.lineItems = value;
    }

    /**
     * Obtém o valor da propriedade numberOfLineItems.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfLineItems() {
        return numberOfLineItems;
    }

    /**
     * Define o valor da propriedade numberOfLineItems.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfLineItems(JAXBElement<Integer> value) {
        this.numberOfLineItems = value;
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
     * Obtém o valor da propriedade orderIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderIdentifier() {
        return orderIdentifier;
    }

    /**
     * Define o valor da propriedade orderIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderIdentifier(JAXBElement<String> value) {
        this.orderIdentifier = value;
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
     * Obtém o valor da propriedade orderType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderType() {
        return orderType;
    }

    /**
     * Define o valor da propriedade orderType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderType(JAXBElement<String> value) {
        this.orderType = value;
    }

    /**
     * Obtém o valor da propriedade orderTypeQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getOrderTypeQuantities() {
        return orderTypeQuantities;
    }

    /**
     * Define o valor da propriedade orderTypeQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setOrderTypeQuantities(JAXBElement<Quantities> value) {
        this.orderTypeQuantities = value;
    }

    /**
     * Obtém o valor da propriedade paid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPaid() {
        return paid;
    }

    /**
     * Define o valor da propriedade paid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPaid(JAXBElement<Boolean> value) {
        this.paid = value;
    }

    /**
     * Obtém o valor da propriedade perUnitVariableServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPerUnitVariableServiceTime() {
        return perUnitVariableServiceTime;
    }

    /**
     * Define o valor da propriedade perUnitVariableServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPerUnitVariableServiceTime(JAXBElement<Duration> value) {
        this.perUnitVariableServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade pickupCategory1Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPickupCategory1Quantities() {
        return pickupCategory1Quantities;
    }

    /**
     * Define o valor da propriedade pickupCategory1Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPickupCategory1Quantities(JAXBElement<Quantities> value) {
        this.pickupCategory1Quantities = value;
    }

    /**
     * Obtém o valor da propriedade pickupCategory2Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPickupCategory2Quantities() {
        return pickupCategory2Quantities;
    }

    /**
     * Define o valor da propriedade pickupCategory2Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPickupCategory2Quantities(JAXBElement<Quantities> value) {
        this.pickupCategory2Quantities = value;
    }

    /**
     * Obtém o valor da propriedade pickupCategory3Quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPickupCategory3Quantities() {
        return pickupCategory3Quantities;
    }

    /**
     * Define o valor da propriedade pickupCategory3Quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPickupCategory3Quantities(JAXBElement<Quantities> value) {
        this.pickupCategory3Quantities = value;
    }

    /**
     * Obtém o valor da propriedade pickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPickupQuantities() {
        return pickupQuantities;
    }

    /**
     * Define o valor da propriedade pickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPickupQuantities(JAXBElement<Quantities> value) {
        this.pickupQuantities = value;
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
     * Obtém o valor da propriedade priorityOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPriorityOverride() {
        return priorityOverride;
    }

    /**
     * Define o valor da propriedade priorityOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPriorityOverride(JAXBElement<Integer> value) {
        this.priorityOverride = value;
    }

    /**
     * Obtém o valor da propriedade requiredDestinationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequiredDestinationIdentifier() {
        return requiredDestinationIdentifier;
    }

    /**
     * Define o valor da propriedade requiredDestinationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequiredDestinationIdentifier(JAXBElement<String> value) {
        this.requiredDestinationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade requiredOriginIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequiredOriginIdentifier() {
        return requiredOriginIdentifier;
    }

    /**
     * Define o valor da propriedade requiredOriginIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequiredOriginIdentifier(JAXBElement<String> value) {
        this.requiredOriginIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade route.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Route }{@code >}
     *     
     */
    public JAXBElement<Route> getRoute() {
        return route;
    }

    /**
     * Define o valor da propriedade route.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Route }{@code >}
     *     
     */
    public void setRoute(JAXBElement<Route> value) {
        this.route = value;
    }

    /**
     * Obtém o valor da propriedade routeArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRouteArrivalTime() {
        return routeArrivalTime;
    }

    /**
     * Define o valor da propriedade routeArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRouteArrivalTime(XMLGregorianCalendar value) {
        this.routeArrivalTime = value;
    }

    /**
     * Obtém o valor da propriedade routeCompleteTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRouteCompleteTime() {
        return routeCompleteTime;
    }

    /**
     * Define o valor da propriedade routeCompleteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRouteCompleteTime(XMLGregorianCalendar value) {
        this.routeCompleteTime = value;
    }

    /**
     * Obtém o valor da propriedade routeDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRouteDepartureTime() {
        return routeDepartureTime;
    }

    /**
     * Define o valor da propriedade routeDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRouteDepartureTime(XMLGregorianCalendar value) {
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRouteStartTime() {
        return routeStartTime;
    }

    /**
     * Define o valor da propriedade routeStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRouteStartTime(XMLGregorianCalendar value) {
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
     *     {@link Duration }
     *     
     */
    public Duration getRouteTotalServiceTime() {
        return routeTotalServiceTime;
    }

    /**
     * Define o valor da propriedade routeTotalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRouteTotalServiceTime(Duration value) {
        this.routeTotalServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade routeTotalTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRouteTotalTravelTime() {
        return routeTotalTravelTime;
    }

    /**
     * Define o valor da propriedade routeTotalTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRouteTotalTravelTime(Duration value) {
        this.routeTotalTravelTime = value;
    }

    /**
     * Obtém o valor da propriedade selector.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSelector() {
        return selector;
    }

    /**
     * Define o valor da propriedade selector.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSelector(JAXBElement<Integer> value) {
        this.selector = value;
    }

    /**
     * Obtém o valor da propriedade sequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Define o valor da propriedade sequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSequenceNumber(JAXBElement<Integer> value) {
        this.sequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceLocation }{@code >}
     *     
     */
    public JAXBElement<ServiceLocation> getServiceLocation() {
        return serviceLocation;
    }

    /**
     * Define o valor da propriedade serviceLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceLocation }{@code >}
     *     
     */
    public void setServiceLocation(JAXBElement<ServiceLocation> value) {
        this.serviceLocation = value;
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
     * Obtém o valor da propriedade serviceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getServiceTime() {
        return serviceTime;
    }

    /**
     * Define o valor da propriedade serviceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setServiceTime(JAXBElement<Duration> value) {
        this.serviceTime = value;
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
     * Obtém o valor da propriedade stopTotalPlannedFixedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getStopTotalPlannedFixedServiceTime() {
        return stopTotalPlannedFixedServiceTime;
    }

    /**
     * Define o valor da propriedade stopTotalPlannedFixedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setStopTotalPlannedFixedServiceTime(JAXBElement<Duration> value) {
        this.stopTotalPlannedFixedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade stopTotalPlannedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getStopTotalPlannedServiceTime() {
        return stopTotalPlannedServiceTime;
    }

    /**
     * Define o valor da propriedade stopTotalPlannedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setStopTotalPlannedServiceTime(JAXBElement<Duration> value) {
        this.stopTotalPlannedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade stopTotalPlannedVariableServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getStopTotalPlannedVariableServiceTime() {
        return stopTotalPlannedVariableServiceTime;
    }

    /**
     * Define o valor da propriedade stopTotalPlannedVariableServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setStopTotalPlannedVariableServiceTime(JAXBElement<Duration> value) {
        this.stopTotalPlannedVariableServiceTime = value;
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
     * Obtém o valor da propriedade stopType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStopType() {
        return stopType;
    }

    /**
     * Define o valor da propriedade stopType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStopType(JAXBElement<String> value) {
        this.stopType = value;
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
     * Obtém o valor da propriedade templateStopSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTemplateStopSequenceNumber() {
        return templateStopSequenceNumber;
    }

    /**
     * Define o valor da propriedade templateStopSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTemplateStopSequenceNumber(JAXBElement<Integer> value) {
        this.templateStopSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade uploadSelector.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUploadSelector() {
        return uploadSelector;
    }

    /**
     * Define o valor da propriedade uploadSelector.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUploadSelector(JAXBElement<Integer> value) {
        this.uploadSelector = value;
    }

    /**
     * Obtém o valor da propriedade urgency.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUrgency() {
        return urgency;
    }

    /**
     * Define o valor da propriedade urgency.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUrgency(JAXBElement<Integer> value) {
        this.urgency = value;
    }

    /**
     * Obtém o valor da propriedade variableServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getVariableServiceTime() {
        return variableServiceTime;
    }

    /**
     * Define o valor da propriedade variableServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setVariableServiceTime(JAXBElement<Duration> value) {
        this.variableServiceTime = value;
    }

}
