
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.AggregateRootEntity;
import com.roadnet.apex.datacontracts.Coordinate;
import com.roadnet.apex.datacontracts.Distance;
import com.roadnet.apex.datacontracts.PersonName;
import com.roadnet.apex.datacontracts.Quantities;


/**
 * <p>Classe Java de DataWarehouseStagedRoute complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseStagedRoute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseStagedRouteAction_StagedRouteAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="DestinationCreatedInRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationCreatedInRegionPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DestinationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DestinationRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationRegionPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentCreatedInRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeCreatedInRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsIntegrated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastStopIsDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OriginBusinessUnitIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginBusinessUnitPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OriginCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="OriginCreatedInRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginCreatedInRegionPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OriginDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OriginRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginRegionPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PlannedArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedCompleteTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDistanceToDestination" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="PlannedGoalDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="PlannedOvertimeCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PlannedOvertimeTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PlannedRunningQuantityAfterOrigin" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PlannedStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegionPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RouteDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RouteDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScenarioIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SessionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Size1Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Size2Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Size3Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StagedRouteCosts" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse}ArrayOfDataWarehouseStagedRouteCost" minOccurs="0"/&gt;
 *         &lt;element name="StagedRouteEquipments" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse}ArrayOfDataWarehouseStagedRouteEquipment" minOccurs="0"/&gt;
 *         &lt;element name="StagedStops" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse}ArrayOfDataWarehouseStagedStop" minOccurs="0"/&gt;
 *         &lt;element name="WorkerCreatedInRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerCreatedInRegionPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="WorkerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerName" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="WorkerTypeCreatedInRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerTypeCreatedInRegionPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="WorkerTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_OriginTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseStagedRoute", propOrder = {
    "dataWarehouseStagedRouteActionStagedRouteAction",
    "description",
    "destinationCoordinate",
    "destinationCreatedInRegionIdentifier",
    "destinationCreatedInRegionPkey",
    "destinationDescription",
    "destinationIdentifier",
    "destinationPkey",
    "destinationRegionIdentifier",
    "destinationRegionPkey",
    "equipmentCreatedInRegionIdentifier",
    "equipmentDescription",
    "equipmentIdentifier",
    "equipmentTypeCreatedInRegionIdentifier",
    "equipmentTypeDescription",
    "equipmentTypeIdentifier",
    "isIntegrated",
    "lastStopIsDestination",
    "originBusinessUnitIdentifier",
    "originBusinessUnitPkey",
    "originCoordinate",
    "originCreatedInRegionIdentifier",
    "originCreatedInRegionPkey",
    "originDescription",
    "originIdentifier",
    "originPkey",
    "originRegionIdentifier",
    "originRegionPkey",
    "plannedArrivalTime",
    "plannedCompleteTime",
    "plannedDepartureTime",
    "plannedDistanceToDestination",
    "plannedGoalDistance",
    "plannedOvertimeCost",
    "plannedOvertimeTime",
    "plannedRunningQuantityAfterOrigin",
    "plannedStartTime",
    "regionIdentifier",
    "regionPkey",
    "routeDate",
    "routeDateTime",
    "routeIdentifier",
    "scenarioIdentifier",
    "sessionDescription",
    "size1Alias",
    "size2Alias",
    "size3Alias",
    "source",
    "sourceVersion",
    "stagedRouteCosts",
    "stagedRouteEquipments",
    "stagedStops",
    "workerCreatedInRegionIdentifier",
    "workerCreatedInRegionPkey",
    "workerIdentifier",
    "workerName",
    "workerTypeCreatedInRegionIdentifier",
    "workerTypeCreatedInRegionPkey",
    "workerTypeDescription",
    "workerTypeIdentifier",
    "worldTimeZoneOriginTimeZone"
})
@XmlSeeAlso({
    DataWarehouseActualStagedRoute.class,
    DataWarehousePlannedStagedRoute.class
})
public class DataWarehouseStagedRoute
    extends AggregateRootEntity
{

    @XmlElementRef(name = "DataWarehouseStagedRouteAction_StagedRouteAction", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseStagedRouteActionStagedRouteAction;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "DestinationCoordinate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> destinationCoordinate;
    @XmlElementRef(name = "DestinationCreatedInRegionIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinationCreatedInRegionIdentifier;
    @XmlElementRef(name = "DestinationCreatedInRegionPkey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> destinationCreatedInRegionPkey;
    @XmlElementRef(name = "DestinationDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinationDescription;
    @XmlElementRef(name = "DestinationIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinationIdentifier;
    @XmlElementRef(name = "DestinationPkey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> destinationPkey;
    @XmlElementRef(name = "DestinationRegionIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinationRegionIdentifier;
    @XmlElementRef(name = "DestinationRegionPkey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> destinationRegionPkey;
    @XmlElementRef(name = "EquipmentCreatedInRegionIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentCreatedInRegionIdentifier;
    @XmlElementRef(name = "EquipmentDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentDescription;
    @XmlElementRef(name = "EquipmentIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentIdentifier;
    @XmlElementRef(name = "EquipmentTypeCreatedInRegionIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentTypeCreatedInRegionIdentifier;
    @XmlElementRef(name = "EquipmentTypeDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentTypeDescription;
    @XmlElementRef(name = "EquipmentTypeIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentTypeIdentifier;
    @XmlElement(name = "IsIntegrated")
    protected Boolean isIntegrated;
    @XmlElement(name = "LastStopIsDestination")
    protected Boolean lastStopIsDestination;
    @XmlElementRef(name = "OriginBusinessUnitIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originBusinessUnitIdentifier;
    @XmlElementRef(name = "OriginBusinessUnitPkey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> originBusinessUnitPkey;
    @XmlElementRef(name = "OriginCoordinate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> originCoordinate;
    @XmlElementRef(name = "OriginCreatedInRegionIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originCreatedInRegionIdentifier;
    @XmlElementRef(name = "OriginCreatedInRegionPkey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> originCreatedInRegionPkey;
    @XmlElementRef(name = "OriginDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originDescription;
    @XmlElementRef(name = "OriginIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originIdentifier;
    @XmlElementRef(name = "OriginPkey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> originPkey;
    @XmlElementRef(name = "OriginRegionIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originRegionIdentifier;
    @XmlElementRef(name = "OriginRegionPkey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> originRegionPkey;
    @XmlElementRef(name = "PlannedArrivalTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedArrivalTime;
    @XmlElementRef(name = "PlannedCompleteTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedCompleteTime;
    @XmlElementRef(name = "PlannedDepartureTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedDepartureTime;
    @XmlElementRef(name = "PlannedDistanceToDestination", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> plannedDistanceToDestination;
    @XmlElementRef(name = "PlannedGoalDistance", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> plannedGoalDistance;
    @XmlElementRef(name = "PlannedOvertimeCost", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> plannedOvertimeCost;
    @XmlElementRef(name = "PlannedOvertimeTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> plannedOvertimeTime;
    @XmlElementRef(name = "PlannedRunningQuantityAfterOrigin", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedRunningQuantityAfterOrigin;
    @XmlElementRef(name = "PlannedStartTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedStartTime;
    @XmlElementRef(name = "RegionIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionIdentifier;
    @XmlElementRef(name = "RegionPkey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> regionPkey;
    @XmlElementRef(name = "RouteDate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> routeDate;
    @XmlElement(name = "RouteDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar routeDateTime;
    @XmlElementRef(name = "RouteIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeIdentifier;
    @XmlElementRef(name = "ScenarioIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scenarioIdentifier;
    @XmlElementRef(name = "SessionDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionDescription;
    @XmlElementRef(name = "Size1Alias", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> size1Alias;
    @XmlElementRef(name = "Size2Alias", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> size2Alias;
    @XmlElementRef(name = "Size3Alias", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> size3Alias;
    @XmlElementRef(name = "Source", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> source;
    @XmlElementRef(name = "SourceVersion", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceVersion;
    @XmlElementRef(name = "StagedRouteCosts", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDataWarehouseStagedRouteCost> stagedRouteCosts;
    @XmlElementRef(name = "StagedRouteEquipments", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDataWarehouseStagedRouteEquipment> stagedRouteEquipments;
    @XmlElementRef(name = "StagedStops", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDataWarehouseStagedStop> stagedStops;
    @XmlElementRef(name = "WorkerCreatedInRegionIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerCreatedInRegionIdentifier;
    @XmlElementRef(name = "WorkerCreatedInRegionPkey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> workerCreatedInRegionPkey;
    @XmlElementRef(name = "WorkerIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerIdentifier;
    @XmlElementRef(name = "WorkerName", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> workerName;
    @XmlElementRef(name = "WorkerTypeCreatedInRegionIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerTypeCreatedInRegionIdentifier;
    @XmlElementRef(name = "WorkerTypeCreatedInRegionPkey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> workerTypeCreatedInRegionPkey;
    @XmlElementRef(name = "WorkerTypeDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerTypeDescription;
    @XmlElementRef(name = "WorkerTypeIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerTypeIdentifier;
    @XmlElementRef(name = "WorldTimeZone_OriginTimeZone", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worldTimeZoneOriginTimeZone;

    /**
     * Obtém o valor da propriedade dataWarehouseStagedRouteActionStagedRouteAction.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseStagedRouteActionStagedRouteAction() {
        return dataWarehouseStagedRouteActionStagedRouteAction;
    }

    /**
     * Define o valor da propriedade dataWarehouseStagedRouteActionStagedRouteAction.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseStagedRouteActionStagedRouteAction(JAXBElement<String> value) {
        this.dataWarehouseStagedRouteActionStagedRouteAction = value;
    }

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
     * Obtém o valor da propriedade destinationCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getDestinationCoordinate() {
        return destinationCoordinate;
    }

    /**
     * Define o valor da propriedade destinationCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setDestinationCoordinate(JAXBElement<Coordinate> value) {
        this.destinationCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade destinationCreatedInRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinationCreatedInRegionIdentifier() {
        return destinationCreatedInRegionIdentifier;
    }

    /**
     * Define o valor da propriedade destinationCreatedInRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinationCreatedInRegionIdentifier(JAXBElement<String> value) {
        this.destinationCreatedInRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade destinationCreatedInRegionPkey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDestinationCreatedInRegionPkey() {
        return destinationCreatedInRegionPkey;
    }

    /**
     * Define o valor da propriedade destinationCreatedInRegionPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDestinationCreatedInRegionPkey(JAXBElement<Long> value) {
        this.destinationCreatedInRegionPkey = value;
    }

    /**
     * Obtém o valor da propriedade destinationDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinationDescription() {
        return destinationDescription;
    }

    /**
     * Define o valor da propriedade destinationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinationDescription(JAXBElement<String> value) {
        this.destinationDescription = value;
    }

    /**
     * Obtém o valor da propriedade destinationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinationIdentifier() {
        return destinationIdentifier;
    }

    /**
     * Define o valor da propriedade destinationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinationIdentifier(JAXBElement<String> value) {
        this.destinationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade destinationPkey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDestinationPkey() {
        return destinationPkey;
    }

    /**
     * Define o valor da propriedade destinationPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDestinationPkey(JAXBElement<Long> value) {
        this.destinationPkey = value;
    }

    /**
     * Obtém o valor da propriedade destinationRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinationRegionIdentifier() {
        return destinationRegionIdentifier;
    }

    /**
     * Define o valor da propriedade destinationRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinationRegionIdentifier(JAXBElement<String> value) {
        this.destinationRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade destinationRegionPkey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDestinationRegionPkey() {
        return destinationRegionPkey;
    }

    /**
     * Define o valor da propriedade destinationRegionPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDestinationRegionPkey(JAXBElement<Long> value) {
        this.destinationRegionPkey = value;
    }

    /**
     * Obtém o valor da propriedade equipmentCreatedInRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentCreatedInRegionIdentifier() {
        return equipmentCreatedInRegionIdentifier;
    }

    /**
     * Define o valor da propriedade equipmentCreatedInRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentCreatedInRegionIdentifier(JAXBElement<String> value) {
        this.equipmentCreatedInRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade equipmentDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentDescription() {
        return equipmentDescription;
    }

    /**
     * Define o valor da propriedade equipmentDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentDescription(JAXBElement<String> value) {
        this.equipmentDescription = value;
    }

    /**
     * Obtém o valor da propriedade equipmentIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentIdentifier() {
        return equipmentIdentifier;
    }

    /**
     * Define o valor da propriedade equipmentIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentIdentifier(JAXBElement<String> value) {
        this.equipmentIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeCreatedInRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentTypeCreatedInRegionIdentifier() {
        return equipmentTypeCreatedInRegionIdentifier;
    }

    /**
     * Define o valor da propriedade equipmentTypeCreatedInRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentTypeCreatedInRegionIdentifier(JAXBElement<String> value) {
        this.equipmentTypeCreatedInRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentTypeDescription() {
        return equipmentTypeDescription;
    }

    /**
     * Define o valor da propriedade equipmentTypeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentTypeDescription(JAXBElement<String> value) {
        this.equipmentTypeDescription = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentTypeIdentifier() {
        return equipmentTypeIdentifier;
    }

    /**
     * Define o valor da propriedade equipmentTypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentTypeIdentifier(JAXBElement<String> value) {
        this.equipmentTypeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade isIntegrated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIntegrated() {
        return isIntegrated;
    }

    /**
     * Define o valor da propriedade isIntegrated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIntegrated(Boolean value) {
        this.isIntegrated = value;
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
     * Obtém o valor da propriedade originBusinessUnitIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginBusinessUnitIdentifier() {
        return originBusinessUnitIdentifier;
    }

    /**
     * Define o valor da propriedade originBusinessUnitIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginBusinessUnitIdentifier(JAXBElement<String> value) {
        this.originBusinessUnitIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade originBusinessUnitPkey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOriginBusinessUnitPkey() {
        return originBusinessUnitPkey;
    }

    /**
     * Define o valor da propriedade originBusinessUnitPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOriginBusinessUnitPkey(JAXBElement<Long> value) {
        this.originBusinessUnitPkey = value;
    }

    /**
     * Obtém o valor da propriedade originCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getOriginCoordinate() {
        return originCoordinate;
    }

    /**
     * Define o valor da propriedade originCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setOriginCoordinate(JAXBElement<Coordinate> value) {
        this.originCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade originCreatedInRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginCreatedInRegionIdentifier() {
        return originCreatedInRegionIdentifier;
    }

    /**
     * Define o valor da propriedade originCreatedInRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginCreatedInRegionIdentifier(JAXBElement<String> value) {
        this.originCreatedInRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade originCreatedInRegionPkey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOriginCreatedInRegionPkey() {
        return originCreatedInRegionPkey;
    }

    /**
     * Define o valor da propriedade originCreatedInRegionPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOriginCreatedInRegionPkey(JAXBElement<Long> value) {
        this.originCreatedInRegionPkey = value;
    }

    /**
     * Obtém o valor da propriedade originDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginDescription() {
        return originDescription;
    }

    /**
     * Define o valor da propriedade originDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginDescription(JAXBElement<String> value) {
        this.originDescription = value;
    }

    /**
     * Obtém o valor da propriedade originIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginIdentifier() {
        return originIdentifier;
    }

    /**
     * Define o valor da propriedade originIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginIdentifier(JAXBElement<String> value) {
        this.originIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade originPkey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOriginPkey() {
        return originPkey;
    }

    /**
     * Define o valor da propriedade originPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOriginPkey(JAXBElement<Long> value) {
        this.originPkey = value;
    }

    /**
     * Obtém o valor da propriedade originRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginRegionIdentifier() {
        return originRegionIdentifier;
    }

    /**
     * Define o valor da propriedade originRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginRegionIdentifier(JAXBElement<String> value) {
        this.originRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade originRegionPkey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOriginRegionPkey() {
        return originRegionPkey;
    }

    /**
     * Define o valor da propriedade originRegionPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOriginRegionPkey(JAXBElement<Long> value) {
        this.originRegionPkey = value;
    }

    /**
     * Obtém o valor da propriedade plannedArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedArrivalTime() {
        return plannedArrivalTime;
    }

    /**
     * Define o valor da propriedade plannedArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedArrivalTime(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedArrivalTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedCompleteTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedCompleteTime() {
        return plannedCompleteTime;
    }

    /**
     * Define o valor da propriedade plannedCompleteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedCompleteTime(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedCompleteTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedDepartureTime() {
        return plannedDepartureTime;
    }

    /**
     * Define o valor da propriedade plannedDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedDepartureTime(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedDepartureTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedDistanceToDestination.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getPlannedDistanceToDestination() {
        return plannedDistanceToDestination;
    }

    /**
     * Define o valor da propriedade plannedDistanceToDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setPlannedDistanceToDestination(JAXBElement<Distance> value) {
        this.plannedDistanceToDestination = value;
    }

    /**
     * Obtém o valor da propriedade plannedGoalDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getPlannedGoalDistance() {
        return plannedGoalDistance;
    }

    /**
     * Define o valor da propriedade plannedGoalDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setPlannedGoalDistance(JAXBElement<Distance> value) {
        this.plannedGoalDistance = value;
    }

    /**
     * Obtém o valor da propriedade plannedOvertimeCost.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPlannedOvertimeCost() {
        return plannedOvertimeCost;
    }

    /**
     * Define o valor da propriedade plannedOvertimeCost.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPlannedOvertimeCost(JAXBElement<Double> value) {
        this.plannedOvertimeCost = value;
    }

    /**
     * Obtém o valor da propriedade plannedOvertimeTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPlannedOvertimeTime() {
        return plannedOvertimeTime;
    }

    /**
     * Define o valor da propriedade plannedOvertimeTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPlannedOvertimeTime(JAXBElement<Duration> value) {
        this.plannedOvertimeTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedRunningQuantityAfterOrigin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedRunningQuantityAfterOrigin() {
        return plannedRunningQuantityAfterOrigin;
    }

    /**
     * Define o valor da propriedade plannedRunningQuantityAfterOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedRunningQuantityAfterOrigin(JAXBElement<Quantities> value) {
        this.plannedRunningQuantityAfterOrigin = value;
    }

    /**
     * Obtém o valor da propriedade plannedStartTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedStartTime() {
        return plannedStartTime;
    }

    /**
     * Define o valor da propriedade plannedStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedStartTime = value;
    }

    /**
     * Obtém o valor da propriedade regionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegionIdentifier() {
        return regionIdentifier;
    }

    /**
     * Define o valor da propriedade regionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegionIdentifier(JAXBElement<String> value) {
        this.regionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade regionPkey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRegionPkey() {
        return regionPkey;
    }

    /**
     * Define o valor da propriedade regionPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRegionPkey(JAXBElement<Long> value) {
        this.regionPkey = value;
    }

    /**
     * Obtém o valor da propriedade routeDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRouteDate() {
        return routeDate;
    }

    /**
     * Define o valor da propriedade routeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRouteDate(JAXBElement<XMLGregorianCalendar> value) {
        this.routeDate = value;
    }

    /**
     * Obtém o valor da propriedade routeDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRouteDateTime() {
        return routeDateTime;
    }

    /**
     * Define o valor da propriedade routeDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRouteDateTime(XMLGregorianCalendar value) {
        this.routeDateTime = value;
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
     * Obtém o valor da propriedade scenarioIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScenarioIdentifier() {
        return scenarioIdentifier;
    }

    /**
     * Define o valor da propriedade scenarioIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScenarioIdentifier(JAXBElement<String> value) {
        this.scenarioIdentifier = value;
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
     * Obtém o valor da propriedade size1Alias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSize1Alias() {
        return size1Alias;
    }

    /**
     * Define o valor da propriedade size1Alias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSize1Alias(JAXBElement<String> value) {
        this.size1Alias = value;
    }

    /**
     * Obtém o valor da propriedade size2Alias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSize2Alias() {
        return size2Alias;
    }

    /**
     * Define o valor da propriedade size2Alias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSize2Alias(JAXBElement<String> value) {
        this.size2Alias = value;
    }

    /**
     * Obtém o valor da propriedade size3Alias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSize3Alias() {
        return size3Alias;
    }

    /**
     * Define o valor da propriedade size3Alias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSize3Alias(JAXBElement<String> value) {
        this.size3Alias = value;
    }

    /**
     * Obtém o valor da propriedade source.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSource() {
        return source;
    }

    /**
     * Define o valor da propriedade source.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSource(JAXBElement<String> value) {
        this.source = value;
    }

    /**
     * Obtém o valor da propriedade sourceVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceVersion() {
        return sourceVersion;
    }

    /**
     * Define o valor da propriedade sourceVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceVersion(JAXBElement<String> value) {
        this.sourceVersion = value;
    }

    /**
     * Obtém o valor da propriedade stagedRouteCosts.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedRouteCost }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDataWarehouseStagedRouteCost> getStagedRouteCosts() {
        return stagedRouteCosts;
    }

    /**
     * Define o valor da propriedade stagedRouteCosts.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedRouteCost }{@code >}
     *     
     */
    public void setStagedRouteCosts(JAXBElement<ArrayOfDataWarehouseStagedRouteCost> value) {
        this.stagedRouteCosts = value;
    }

    /**
     * Obtém o valor da propriedade stagedRouteEquipments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedRouteEquipment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDataWarehouseStagedRouteEquipment> getStagedRouteEquipments() {
        return stagedRouteEquipments;
    }

    /**
     * Define o valor da propriedade stagedRouteEquipments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedRouteEquipment }{@code >}
     *     
     */
    public void setStagedRouteEquipments(JAXBElement<ArrayOfDataWarehouseStagedRouteEquipment> value) {
        this.stagedRouteEquipments = value;
    }

    /**
     * Obtém o valor da propriedade stagedStops.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedStop }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDataWarehouseStagedStop> getStagedStops() {
        return stagedStops;
    }

    /**
     * Define o valor da propriedade stagedStops.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedStop }{@code >}
     *     
     */
    public void setStagedStops(JAXBElement<ArrayOfDataWarehouseStagedStop> value) {
        this.stagedStops = value;
    }

    /**
     * Obtém o valor da propriedade workerCreatedInRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerCreatedInRegionIdentifier() {
        return workerCreatedInRegionIdentifier;
    }

    /**
     * Define o valor da propriedade workerCreatedInRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerCreatedInRegionIdentifier(JAXBElement<String> value) {
        this.workerCreatedInRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade workerCreatedInRegionPkey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getWorkerCreatedInRegionPkey() {
        return workerCreatedInRegionPkey;
    }

    /**
     * Define o valor da propriedade workerCreatedInRegionPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setWorkerCreatedInRegionPkey(JAXBElement<Long> value) {
        this.workerCreatedInRegionPkey = value;
    }

    /**
     * Obtém o valor da propriedade workerIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerIdentifier() {
        return workerIdentifier;
    }

    /**
     * Define o valor da propriedade workerIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerIdentifier(JAXBElement<String> value) {
        this.workerIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade workerName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getWorkerName() {
        return workerName;
    }

    /**
     * Define o valor da propriedade workerName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setWorkerName(JAXBElement<PersonName> value) {
        this.workerName = value;
    }

    /**
     * Obtém o valor da propriedade workerTypeCreatedInRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerTypeCreatedInRegionIdentifier() {
        return workerTypeCreatedInRegionIdentifier;
    }

    /**
     * Define o valor da propriedade workerTypeCreatedInRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerTypeCreatedInRegionIdentifier(JAXBElement<String> value) {
        this.workerTypeCreatedInRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade workerTypeCreatedInRegionPkey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getWorkerTypeCreatedInRegionPkey() {
        return workerTypeCreatedInRegionPkey;
    }

    /**
     * Define o valor da propriedade workerTypeCreatedInRegionPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setWorkerTypeCreatedInRegionPkey(JAXBElement<Long> value) {
        this.workerTypeCreatedInRegionPkey = value;
    }

    /**
     * Obtém o valor da propriedade workerTypeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerTypeDescription() {
        return workerTypeDescription;
    }

    /**
     * Define o valor da propriedade workerTypeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerTypeDescription(JAXBElement<String> value) {
        this.workerTypeDescription = value;
    }

    /**
     * Obtém o valor da propriedade workerTypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerTypeIdentifier() {
        return workerTypeIdentifier;
    }

    /**
     * Define o valor da propriedade workerTypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerTypeIdentifier(JAXBElement<String> value) {
        this.workerTypeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneOriginTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorldTimeZoneOriginTimeZone() {
        return worldTimeZoneOriginTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneOriginTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorldTimeZoneOriginTimeZone(JAXBElement<String> value) {
        this.worldTimeZoneOriginTimeZone = value;
    }

}
