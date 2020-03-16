
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.roadnet.apex.datacontracts.Coordinate;
import com.roadnet.apex.datacontracts.Distance;
import com.roadnet.apex.datacontracts.PersonName;
import com.roadnet.apex.datacontracts.Quantities;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DataWarehouseStagedRouteEquipment_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehouseStagedRouteEquipment");
    private final static QName _DataWarehouseStagedStopQuantity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehouseStagedStopQuantity");
    private final static QName _DataWarehouseActualStagedStopQuantity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehouseActualStagedStopQuantity");
    private final static QName _DataWarehousePlannedStagedStopQuantity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehousePlannedStagedStopQuantity");
    private final static QName _DataWarehouseStagedOrder_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehouseStagedOrder");
    private final static QName _DataWarehouseStagedStop_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehouseStagedStop");
    private final static QName _DataWarehouseActualStagedStop_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehouseActualStagedStop");
    private final static QName _DataWarehousePlannedStagedStop_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehousePlannedStagedStop");
    private final static QName _DataWarehouseStagedStopQuantityServiceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehouseStagedStopQuantityServiceType");
    private final static QName _DataWarehouseStagedRouteAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehouseStagedRouteAction");
    private final static QName _DataWarehouseStagedStopType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehouseStagedStopType");
    private final static QName _DataWarehouseStagedRoute_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehouseStagedRoute");
    private final static QName _DataWarehouseActualStagedRoute_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehouseActualStagedRoute");
    private final static QName _DataWarehousePlannedStagedRoute_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehousePlannedStagedRoute");
    private final static QName _StagedRouteEquipmentPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "StagedRouteEquipmentPropertyOptions");
    private final static QName _StagedStopQuantityPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "StagedStopQuantityPropertyOptions");
    private final static QName _StagedOrderPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "StagedOrderPropertyOptions");
    private final static QName _StagedRoutePropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "StagedRoutePropertyOptions");
    private final static QName _StagedStopPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "StagedStopPropertyOptions");
    private final static QName _DataWarehouseStagedRouteCost_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehouseStagedRouteCost");
    private final static QName _DataWarehouseActualStagedRouteCost_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehouseActualStagedRouteCost");
    private final static QName _DataWarehousePlannedStagedRouteCost_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehousePlannedStagedRouteCost");
    private final static QName _ArrayOfDataWarehouseStagedRouteCost_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "ArrayOfDataWarehouseStagedRouteCost");
    private final static QName _ArrayOfDataWarehouseStagedRouteEquipment_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "ArrayOfDataWarehouseStagedRouteEquipment");
    private final static QName _ArrayOfDataWarehouseStagedStop_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "ArrayOfDataWarehouseStagedStop");
    private final static QName _ArrayOfDataWarehouseStagedOrder_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "ArrayOfDataWarehouseStagedOrder");
    private final static QName _ArrayOfDataWarehouseStagedStopQuantity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "ArrayOfDataWarehouseStagedStopQuantity");
    private final static QName _ArrayOfDataWarehouseStagedRoute_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "ArrayOfDataWarehouseStagedRoute");
    private final static QName _OperationsUnitParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "OperationsUnitParameters");
    private final static QName _ArrayOfOperationsUnitParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "ArrayOfOperationsUnitParameters");
    private final static QName _OperationsUnitParametersDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "Description");
    private final static QName _OperationsUnitParametersIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "Identifier");
    private final static QName _DataWarehouseStagedRouteCostDataWarehouseCostTypeCostType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehouseCostType_CostType");
    private final static QName _StagedRoutePropertyOptionsSize1Alias_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "Size1Alias");
    private final static QName _StagedRoutePropertyOptionsSize2Alias_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "Size2Alias");
    private final static QName _StagedRoutePropertyOptionsSize3Alias_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "Size3Alias");
    private final static QName _StagedRoutePropertyOptionsWorkerTypeDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "WorkerTypeDescription");
    private final static QName _StagedRoutePropertyOptionsWorkerTypeIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "WorkerTypeIdentifier");
    private final static QName _DataWarehouseStagedRouteDataWarehouseStagedRouteActionStagedRouteAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehouseStagedRouteAction_StagedRouteAction");
    private final static QName _DataWarehouseStagedRouteDestinationCoordinate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DestinationCoordinate");
    private final static QName _DataWarehouseStagedRouteDestinationCreatedInRegionIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DestinationCreatedInRegionIdentifier");
    private final static QName _DataWarehouseStagedRouteDestinationCreatedInRegionPkey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DestinationCreatedInRegionPkey");
    private final static QName _DataWarehouseStagedRouteDestinationDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DestinationDescription");
    private final static QName _DataWarehouseStagedRouteDestinationIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DestinationIdentifier");
    private final static QName _DataWarehouseStagedRouteDestinationPkey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DestinationPkey");
    private final static QName _DataWarehouseStagedRouteDestinationRegionIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DestinationRegionIdentifier");
    private final static QName _DataWarehouseStagedRouteDestinationRegionPkey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DestinationRegionPkey");
    private final static QName _DataWarehouseStagedRouteEquipmentCreatedInRegionIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "EquipmentCreatedInRegionIdentifier");
    private final static QName _DataWarehouseStagedRouteEquipmentDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "EquipmentDescription");
    private final static QName _DataWarehouseStagedRouteEquipmentIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "EquipmentIdentifier");
    private final static QName _DataWarehouseStagedRouteEquipmentTypeCreatedInRegionIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "EquipmentTypeCreatedInRegionIdentifier");
    private final static QName _DataWarehouseStagedRouteEquipmentTypeDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "EquipmentTypeDescription");
    private final static QName _DataWarehouseStagedRouteEquipmentTypeIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "EquipmentTypeIdentifier");
    private final static QName _DataWarehouseStagedRouteOriginBusinessUnitIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "OriginBusinessUnitIdentifier");
    private final static QName _DataWarehouseStagedRouteOriginBusinessUnitPkey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "OriginBusinessUnitPkey");
    private final static QName _DataWarehouseStagedRouteOriginCoordinate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "OriginCoordinate");
    private final static QName _DataWarehouseStagedRouteOriginCreatedInRegionIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "OriginCreatedInRegionIdentifier");
    private final static QName _DataWarehouseStagedRouteOriginCreatedInRegionPkey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "OriginCreatedInRegionPkey");
    private final static QName _DataWarehouseStagedRouteOriginDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "OriginDescription");
    private final static QName _DataWarehouseStagedRouteOriginIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "OriginIdentifier");
    private final static QName _DataWarehouseStagedRouteOriginPkey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "OriginPkey");
    private final static QName _DataWarehouseStagedRouteOriginRegionIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "OriginRegionIdentifier");
    private final static QName _DataWarehouseStagedRouteOriginRegionPkey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "OriginRegionPkey");
    private final static QName _DataWarehouseStagedRoutePlannedArrivalTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "PlannedArrivalTime");
    private final static QName _DataWarehouseStagedRoutePlannedCompleteTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "PlannedCompleteTime");
    private final static QName _DataWarehouseStagedRoutePlannedDepartureTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "PlannedDepartureTime");
    private final static QName _DataWarehouseStagedRoutePlannedDistanceToDestination_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "PlannedDistanceToDestination");
    private final static QName _DataWarehouseStagedRoutePlannedGoalDistance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "PlannedGoalDistance");
    private final static QName _DataWarehouseStagedRoutePlannedOvertimeCost_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "PlannedOvertimeCost");
    private final static QName _DataWarehouseStagedRoutePlannedOvertimeTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "PlannedOvertimeTime");
    private final static QName _DataWarehouseStagedRoutePlannedRunningQuantityAfterOrigin_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "PlannedRunningQuantityAfterOrigin");
    private final static QName _DataWarehouseStagedRoutePlannedStartTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "PlannedStartTime");
    private final static QName _DataWarehouseStagedRouteRegionIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "RegionIdentifier");
    private final static QName _DataWarehouseStagedRouteRegionPkey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "RegionPkey");
    private final static QName _DataWarehouseStagedRouteRouteDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "RouteDate");
    private final static QName _DataWarehouseStagedRouteRouteIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "RouteIdentifier");
    private final static QName _DataWarehouseStagedRouteScenarioIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "ScenarioIdentifier");
    private final static QName _DataWarehouseStagedRouteSessionDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "SessionDescription");
    private final static QName _DataWarehouseStagedRouteSource_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "Source");
    private final static QName _DataWarehouseStagedRouteSourceVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "SourceVersion");
    private final static QName _DataWarehouseStagedRouteStagedRouteCosts_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "StagedRouteCosts");
    private final static QName _DataWarehouseStagedRouteStagedRouteEquipments_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "StagedRouteEquipments");
    private final static QName _DataWarehouseStagedRouteStagedStops_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "StagedStops");
    private final static QName _DataWarehouseStagedRouteWorkerCreatedInRegionIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "WorkerCreatedInRegionIdentifier");
    private final static QName _DataWarehouseStagedRouteWorkerCreatedInRegionPkey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "WorkerCreatedInRegionPkey");
    private final static QName _DataWarehouseStagedRouteWorkerIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "WorkerIdentifier");
    private final static QName _DataWarehouseStagedRouteWorkerName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "WorkerName");
    private final static QName _DataWarehouseStagedRouteWorkerTypeCreatedInRegionIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "WorkerTypeCreatedInRegionIdentifier");
    private final static QName _DataWarehouseStagedRouteWorkerTypeCreatedInRegionPkey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "WorkerTypeCreatedInRegionPkey");
    private final static QName _DataWarehouseStagedRouteWorldTimeZoneOriginTimeZone_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "WorldTimeZone_OriginTimeZone");
    private final static QName _DataWarehouseActualStagedRouteActualArrivalTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "ActualArrivalTime");
    private final static QName _DataWarehouseActualStagedRouteActualCompleteTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "ActualCompleteTime");
    private final static QName _DataWarehouseActualStagedRouteActualDepartureTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "ActualDepartureTime");
    private final static QName _DataWarehouseActualStagedRouteDistanceToDestination_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DistanceToDestination");
    private final static QName _DataWarehouseActualStagedRouteDistanceToDestinationGps_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DistanceToDestinationGps");
    private final static QName _DataWarehouseActualStagedRouteDistanceToDestinationOdometer_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DistanceToDestinationOdometer");
    private final static QName _DataWarehouseActualStagedRouteRunningQuantityAfterOrigin_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "RunningQuantityAfterOrigin");
    private final static QName _DataWarehouseStagedStopAccountDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "AccountDescription");
    private final static QName _DataWarehouseStagedStopAccountIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "AccountIdentifier");
    private final static QName _DataWarehouseStagedStopCoordinate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "Coordinate");
    private final static QName _DataWarehouseStagedStopDataWarehouseStagedStopTypeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehouseStagedStopType_Type");
    private final static QName _DataWarehouseStagedStopLocationCreatedInRegionIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "LocationCreatedInRegionIdentifier");
    private final static QName _DataWarehouseStagedStopLocationCreatedInRegionPkey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "LocationCreatedInRegionPkey");
    private final static QName _DataWarehouseStagedStopLocationDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "LocationDescription");
    private final static QName _DataWarehouseStagedStopLocationIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "LocationIdentifier");
    private final static QName _DataWarehouseStagedStopLocationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "LocationType");
    private final static QName _DataWarehouseStagedStopPlannedArrival_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "PlannedArrival");
    private final static QName _DataWarehouseStagedStopPlannedDeparture_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "PlannedDeparture");
    private final static QName _DataWarehouseStagedStopPlannedDistanceTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "PlannedDistanceTo");
    private final static QName _DataWarehouseStagedStopPlannedIndex_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "PlannedIndex");
    private final static QName _DataWarehouseStagedStopPlannedSequenceNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "PlannedSequenceNumber");
    private final static QName _DataWarehouseStagedStopServiceLocationCategoryDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "ServiceLocationCategoryDescription");
    private final static QName _DataWarehouseStagedStopServiceLocationCategoryIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "ServiceLocationCategoryIdentifier");
    private final static QName _DataWarehouseStagedStopStagedOrders_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "StagedOrders");
    private final static QName _DataWarehouseStagedStopStagedStopQuantities_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "StagedStopQuantities");
    private final static QName _DataWarehouseActualStagedStopActualArrival_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "ActualArrival");
    private final static QName _DataWarehouseActualStagedStopActualDeparture_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "ActualDeparture");
    private final static QName _DataWarehouseActualStagedStopActualSequenceNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "ActualSequenceNumber");
    private final static QName _DataWarehouseActualStagedStopDistanceTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DistanceTo");
    private final static QName _DataWarehouseActualStagedStopDistanceToGps_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DistanceToGps");
    private final static QName _DataWarehouseActualStagedStopDistanceToOdometer_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DistanceToOdometer");
    private final static QName _DataWarehouseActualStagedStopEngineIdleTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "EngineIdleTime");
    private final static QName _DataWarehouseStagedStopQuantityDataWarehouseStagedStopQuantityServiceTypeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "DataWarehouseStagedStopQuantityServiceType_Type");
    private final static QName _DataWarehouseStagedStopQuantityUnitType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "UnitType");
    private final static QName _DataWarehouseStagedRouteEquipmentEquipmentCreatedInRegionPkey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "EquipmentCreatedInRegionPkey");
    private final static QName _DataWarehouseStagedRouteEquipmentEquipmentTypeCreatedInRegionPkey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", "EquipmentTypeCreatedInRegionPkey");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfDataWarehouseStagedRoute }
     * 
     */
    public ArrayOfDataWarehouseStagedRoute createArrayOfDataWarehouseStagedRoute() {
        return new ArrayOfDataWarehouseStagedRoute();
    }

    /**
     * Create an instance of {@link DataWarehouseStagedRouteEquipment }
     * 
     */
    public DataWarehouseStagedRouteEquipment createDataWarehouseStagedRouteEquipment() {
        return new DataWarehouseStagedRouteEquipment();
    }

    /**
     * Create an instance of {@link DataWarehouseStagedStopQuantity }
     * 
     */
    public DataWarehouseStagedStopQuantity createDataWarehouseStagedStopQuantity() {
        return new DataWarehouseStagedStopQuantity();
    }

    /**
     * Create an instance of {@link DataWarehouseActualStagedStopQuantity }
     * 
     */
    public DataWarehouseActualStagedStopQuantity createDataWarehouseActualStagedStopQuantity() {
        return new DataWarehouseActualStagedStopQuantity();
    }

    /**
     * Create an instance of {@link DataWarehousePlannedStagedStopQuantity }
     * 
     */
    public DataWarehousePlannedStagedStopQuantity createDataWarehousePlannedStagedStopQuantity() {
        return new DataWarehousePlannedStagedStopQuantity();
    }

    /**
     * Create an instance of {@link DataWarehouseStagedOrder }
     * 
     */
    public DataWarehouseStagedOrder createDataWarehouseStagedOrder() {
        return new DataWarehouseStagedOrder();
    }

    /**
     * Create an instance of {@link DataWarehouseStagedStop }
     * 
     */
    public DataWarehouseStagedStop createDataWarehouseStagedStop() {
        return new DataWarehouseStagedStop();
    }

    /**
     * Create an instance of {@link DataWarehouseActualStagedStop }
     * 
     */
    public DataWarehouseActualStagedStop createDataWarehouseActualStagedStop() {
        return new DataWarehouseActualStagedStop();
    }

    /**
     * Create an instance of {@link DataWarehousePlannedStagedStop }
     * 
     */
    public DataWarehousePlannedStagedStop createDataWarehousePlannedStagedStop() {
        return new DataWarehousePlannedStagedStop();
    }

    /**
     * Create an instance of {@link DataWarehouseStagedRoute }
     * 
     */
    public DataWarehouseStagedRoute createDataWarehouseStagedRoute() {
        return new DataWarehouseStagedRoute();
    }

    /**
     * Create an instance of {@link DataWarehouseActualStagedRoute }
     * 
     */
    public DataWarehouseActualStagedRoute createDataWarehouseActualStagedRoute() {
        return new DataWarehouseActualStagedRoute();
    }

    /**
     * Create an instance of {@link DataWarehousePlannedStagedRoute }
     * 
     */
    public DataWarehousePlannedStagedRoute createDataWarehousePlannedStagedRoute() {
        return new DataWarehousePlannedStagedRoute();
    }

    /**
     * Create an instance of {@link StagedRouteEquipmentPropertyOptions }
     * 
     */
    public StagedRouteEquipmentPropertyOptions createStagedRouteEquipmentPropertyOptions() {
        return new StagedRouteEquipmentPropertyOptions();
    }

    /**
     * Create an instance of {@link StagedStopQuantityPropertyOptions }
     * 
     */
    public StagedStopQuantityPropertyOptions createStagedStopQuantityPropertyOptions() {
        return new StagedStopQuantityPropertyOptions();
    }

    /**
     * Create an instance of {@link StagedOrderPropertyOptions }
     * 
     */
    public StagedOrderPropertyOptions createStagedOrderPropertyOptions() {
        return new StagedOrderPropertyOptions();
    }

    /**
     * Create an instance of {@link StagedRoutePropertyOptions }
     * 
     */
    public StagedRoutePropertyOptions createStagedRoutePropertyOptions() {
        return new StagedRoutePropertyOptions();
    }

    /**
     * Create an instance of {@link StagedStopPropertyOptions }
     * 
     */
    public StagedStopPropertyOptions createStagedStopPropertyOptions() {
        return new StagedStopPropertyOptions();
    }

    /**
     * Create an instance of {@link DataWarehouseStagedRouteCost }
     * 
     */
    public DataWarehouseStagedRouteCost createDataWarehouseStagedRouteCost() {
        return new DataWarehouseStagedRouteCost();
    }

    /**
     * Create an instance of {@link DataWarehouseActualStagedRouteCost }
     * 
     */
    public DataWarehouseActualStagedRouteCost createDataWarehouseActualStagedRouteCost() {
        return new DataWarehouseActualStagedRouteCost();
    }

    /**
     * Create an instance of {@link DataWarehousePlannedStagedRouteCost }
     * 
     */
    public DataWarehousePlannedStagedRouteCost createDataWarehousePlannedStagedRouteCost() {
        return new DataWarehousePlannedStagedRouteCost();
    }

    /**
     * Create an instance of {@link ArrayOfDataWarehouseStagedRouteCost }
     * 
     */
    public ArrayOfDataWarehouseStagedRouteCost createArrayOfDataWarehouseStagedRouteCost() {
        return new ArrayOfDataWarehouseStagedRouteCost();
    }

    /**
     * Create an instance of {@link ArrayOfDataWarehouseStagedRouteEquipment }
     * 
     */
    public ArrayOfDataWarehouseStagedRouteEquipment createArrayOfDataWarehouseStagedRouteEquipment() {
        return new ArrayOfDataWarehouseStagedRouteEquipment();
    }

    /**
     * Create an instance of {@link ArrayOfDataWarehouseStagedStop }
     * 
     */
    public ArrayOfDataWarehouseStagedStop createArrayOfDataWarehouseStagedStop() {
        return new ArrayOfDataWarehouseStagedStop();
    }

    /**
     * Create an instance of {@link ArrayOfDataWarehouseStagedOrder }
     * 
     */
    public ArrayOfDataWarehouseStagedOrder createArrayOfDataWarehouseStagedOrder() {
        return new ArrayOfDataWarehouseStagedOrder();
    }

    /**
     * Create an instance of {@link ArrayOfDataWarehouseStagedStopQuantity }
     * 
     */
    public ArrayOfDataWarehouseStagedStopQuantity createArrayOfDataWarehouseStagedStopQuantity() {
        return new ArrayOfDataWarehouseStagedStopQuantity();
    }

    /**
     * Create an instance of {@link OperationsUnitParameters }
     * 
     */
    public OperationsUnitParameters createOperationsUnitParameters() {
        return new OperationsUnitParameters();
    }

    /**
     * Create an instance of {@link ArrayOfOperationsUnitParameters }
     * 
     */
    public ArrayOfOperationsUnitParameters createArrayOfOperationsUnitParameters() {
        return new ArrayOfOperationsUnitParameters();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseStagedRouteEquipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehouseStagedRouteEquipment")
    public JAXBElement<DataWarehouseStagedRouteEquipment> createDataWarehouseStagedRouteEquipment(DataWarehouseStagedRouteEquipment value) {
        return new JAXBElement<DataWarehouseStagedRouteEquipment>(_DataWarehouseStagedRouteEquipment_QNAME, DataWarehouseStagedRouteEquipment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseStagedStopQuantity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehouseStagedStopQuantity")
    public JAXBElement<DataWarehouseStagedStopQuantity> createDataWarehouseStagedStopQuantity(DataWarehouseStagedStopQuantity value) {
        return new JAXBElement<DataWarehouseStagedStopQuantity>(_DataWarehouseStagedStopQuantity_QNAME, DataWarehouseStagedStopQuantity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseActualStagedStopQuantity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehouseActualStagedStopQuantity")
    public JAXBElement<DataWarehouseActualStagedStopQuantity> createDataWarehouseActualStagedStopQuantity(DataWarehouseActualStagedStopQuantity value) {
        return new JAXBElement<DataWarehouseActualStagedStopQuantity>(_DataWarehouseActualStagedStopQuantity_QNAME, DataWarehouseActualStagedStopQuantity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehousePlannedStagedStopQuantity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehousePlannedStagedStopQuantity")
    public JAXBElement<DataWarehousePlannedStagedStopQuantity> createDataWarehousePlannedStagedStopQuantity(DataWarehousePlannedStagedStopQuantity value) {
        return new JAXBElement<DataWarehousePlannedStagedStopQuantity>(_DataWarehousePlannedStagedStopQuantity_QNAME, DataWarehousePlannedStagedStopQuantity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseStagedOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehouseStagedOrder")
    public JAXBElement<DataWarehouseStagedOrder> createDataWarehouseStagedOrder(DataWarehouseStagedOrder value) {
        return new JAXBElement<DataWarehouseStagedOrder>(_DataWarehouseStagedOrder_QNAME, DataWarehouseStagedOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseStagedStop }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehouseStagedStop")
    public JAXBElement<DataWarehouseStagedStop> createDataWarehouseStagedStop(DataWarehouseStagedStop value) {
        return new JAXBElement<DataWarehouseStagedStop>(_DataWarehouseStagedStop_QNAME, DataWarehouseStagedStop.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseActualStagedStop }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehouseActualStagedStop")
    public JAXBElement<DataWarehouseActualStagedStop> createDataWarehouseActualStagedStop(DataWarehouseActualStagedStop value) {
        return new JAXBElement<DataWarehouseActualStagedStop>(_DataWarehouseActualStagedStop_QNAME, DataWarehouseActualStagedStop.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehousePlannedStagedStop }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehousePlannedStagedStop")
    public JAXBElement<DataWarehousePlannedStagedStop> createDataWarehousePlannedStagedStop(DataWarehousePlannedStagedStop value) {
        return new JAXBElement<DataWarehousePlannedStagedStop>(_DataWarehousePlannedStagedStop_QNAME, DataWarehousePlannedStagedStop.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseStagedStopQuantityServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehouseStagedStopQuantityServiceType")
    public JAXBElement<DataWarehouseStagedStopQuantityServiceType> createDataWarehouseStagedStopQuantityServiceType(DataWarehouseStagedStopQuantityServiceType value) {
        return new JAXBElement<DataWarehouseStagedStopQuantityServiceType>(_DataWarehouseStagedStopQuantityServiceType_QNAME, DataWarehouseStagedStopQuantityServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseStagedRouteAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehouseStagedRouteAction")
    public JAXBElement<DataWarehouseStagedRouteAction> createDataWarehouseStagedRouteAction(DataWarehouseStagedRouteAction value) {
        return new JAXBElement<DataWarehouseStagedRouteAction>(_DataWarehouseStagedRouteAction_QNAME, DataWarehouseStagedRouteAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseStagedStopType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehouseStagedStopType")
    public JAXBElement<DataWarehouseStagedStopType> createDataWarehouseStagedStopType(DataWarehouseStagedStopType value) {
        return new JAXBElement<DataWarehouseStagedStopType>(_DataWarehouseStagedStopType_QNAME, DataWarehouseStagedStopType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseStagedRoute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehouseStagedRoute")
    public JAXBElement<DataWarehouseStagedRoute> createDataWarehouseStagedRoute(DataWarehouseStagedRoute value) {
        return new JAXBElement<DataWarehouseStagedRoute>(_DataWarehouseStagedRoute_QNAME, DataWarehouseStagedRoute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseActualStagedRoute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehouseActualStagedRoute")
    public JAXBElement<DataWarehouseActualStagedRoute> createDataWarehouseActualStagedRoute(DataWarehouseActualStagedRoute value) {
        return new JAXBElement<DataWarehouseActualStagedRoute>(_DataWarehouseActualStagedRoute_QNAME, DataWarehouseActualStagedRoute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehousePlannedStagedRoute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehousePlannedStagedRoute")
    public JAXBElement<DataWarehousePlannedStagedRoute> createDataWarehousePlannedStagedRoute(DataWarehousePlannedStagedRoute value) {
        return new JAXBElement<DataWarehousePlannedStagedRoute>(_DataWarehousePlannedStagedRoute_QNAME, DataWarehousePlannedStagedRoute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StagedRouteEquipmentPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "StagedRouteEquipmentPropertyOptions")
    public JAXBElement<StagedRouteEquipmentPropertyOptions> createStagedRouteEquipmentPropertyOptions(StagedRouteEquipmentPropertyOptions value) {
        return new JAXBElement<StagedRouteEquipmentPropertyOptions>(_StagedRouteEquipmentPropertyOptions_QNAME, StagedRouteEquipmentPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StagedStopQuantityPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "StagedStopQuantityPropertyOptions")
    public JAXBElement<StagedStopQuantityPropertyOptions> createStagedStopQuantityPropertyOptions(StagedStopQuantityPropertyOptions value) {
        return new JAXBElement<StagedStopQuantityPropertyOptions>(_StagedStopQuantityPropertyOptions_QNAME, StagedStopQuantityPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StagedOrderPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "StagedOrderPropertyOptions")
    public JAXBElement<StagedOrderPropertyOptions> createStagedOrderPropertyOptions(StagedOrderPropertyOptions value) {
        return new JAXBElement<StagedOrderPropertyOptions>(_StagedOrderPropertyOptions_QNAME, StagedOrderPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StagedRoutePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "StagedRoutePropertyOptions")
    public JAXBElement<StagedRoutePropertyOptions> createStagedRoutePropertyOptions(StagedRoutePropertyOptions value) {
        return new JAXBElement<StagedRoutePropertyOptions>(_StagedRoutePropertyOptions_QNAME, StagedRoutePropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StagedStopPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "StagedStopPropertyOptions")
    public JAXBElement<StagedStopPropertyOptions> createStagedStopPropertyOptions(StagedStopPropertyOptions value) {
        return new JAXBElement<StagedStopPropertyOptions>(_StagedStopPropertyOptions_QNAME, StagedStopPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseStagedRouteCost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehouseStagedRouteCost")
    public JAXBElement<DataWarehouseStagedRouteCost> createDataWarehouseStagedRouteCost(DataWarehouseStagedRouteCost value) {
        return new JAXBElement<DataWarehouseStagedRouteCost>(_DataWarehouseStagedRouteCost_QNAME, DataWarehouseStagedRouteCost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehouseActualStagedRouteCost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehouseActualStagedRouteCost")
    public JAXBElement<DataWarehouseActualStagedRouteCost> createDataWarehouseActualStagedRouteCost(DataWarehouseActualStagedRouteCost value) {
        return new JAXBElement<DataWarehouseActualStagedRouteCost>(_DataWarehouseActualStagedRouteCost_QNAME, DataWarehouseActualStagedRouteCost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWarehousePlannedStagedRouteCost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehousePlannedStagedRouteCost")
    public JAXBElement<DataWarehousePlannedStagedRouteCost> createDataWarehousePlannedStagedRouteCost(DataWarehousePlannedStagedRouteCost value) {
        return new JAXBElement<DataWarehousePlannedStagedRouteCost>(_DataWarehousePlannedStagedRouteCost_QNAME, DataWarehousePlannedStagedRouteCost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedRouteCost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "ArrayOfDataWarehouseStagedRouteCost")
    public JAXBElement<ArrayOfDataWarehouseStagedRouteCost> createArrayOfDataWarehouseStagedRouteCost(ArrayOfDataWarehouseStagedRouteCost value) {
        return new JAXBElement<ArrayOfDataWarehouseStagedRouteCost>(_ArrayOfDataWarehouseStagedRouteCost_QNAME, ArrayOfDataWarehouseStagedRouteCost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedRouteEquipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "ArrayOfDataWarehouseStagedRouteEquipment")
    public JAXBElement<ArrayOfDataWarehouseStagedRouteEquipment> createArrayOfDataWarehouseStagedRouteEquipment(ArrayOfDataWarehouseStagedRouteEquipment value) {
        return new JAXBElement<ArrayOfDataWarehouseStagedRouteEquipment>(_ArrayOfDataWarehouseStagedRouteEquipment_QNAME, ArrayOfDataWarehouseStagedRouteEquipment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedStop }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "ArrayOfDataWarehouseStagedStop")
    public JAXBElement<ArrayOfDataWarehouseStagedStop> createArrayOfDataWarehouseStagedStop(ArrayOfDataWarehouseStagedStop value) {
        return new JAXBElement<ArrayOfDataWarehouseStagedStop>(_ArrayOfDataWarehouseStagedStop_QNAME, ArrayOfDataWarehouseStagedStop.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "ArrayOfDataWarehouseStagedOrder")
    public JAXBElement<ArrayOfDataWarehouseStagedOrder> createArrayOfDataWarehouseStagedOrder(ArrayOfDataWarehouseStagedOrder value) {
        return new JAXBElement<ArrayOfDataWarehouseStagedOrder>(_ArrayOfDataWarehouseStagedOrder_QNAME, ArrayOfDataWarehouseStagedOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedStopQuantity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "ArrayOfDataWarehouseStagedStopQuantity")
    public JAXBElement<ArrayOfDataWarehouseStagedStopQuantity> createArrayOfDataWarehouseStagedStopQuantity(ArrayOfDataWarehouseStagedStopQuantity value) {
        return new JAXBElement<ArrayOfDataWarehouseStagedStopQuantity>(_ArrayOfDataWarehouseStagedStopQuantity_QNAME, ArrayOfDataWarehouseStagedStopQuantity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedRoute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "ArrayOfDataWarehouseStagedRoute")
    public JAXBElement<ArrayOfDataWarehouseStagedRoute> createArrayOfDataWarehouseStagedRoute(ArrayOfDataWarehouseStagedRoute value) {
        return new JAXBElement<ArrayOfDataWarehouseStagedRoute>(_ArrayOfDataWarehouseStagedRoute_QNAME, ArrayOfDataWarehouseStagedRoute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationsUnitParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "OperationsUnitParameters")
    public JAXBElement<OperationsUnitParameters> createOperationsUnitParameters(OperationsUnitParameters value) {
        return new JAXBElement<OperationsUnitParameters>(_OperationsUnitParameters_QNAME, OperationsUnitParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationsUnitParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "ArrayOfOperationsUnitParameters")
    public JAXBElement<ArrayOfOperationsUnitParameters> createArrayOfOperationsUnitParameters(ArrayOfOperationsUnitParameters value) {
        return new JAXBElement<ArrayOfOperationsUnitParameters>(_ArrayOfOperationsUnitParameters_QNAME, ArrayOfOperationsUnitParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "Description", scope = OperationsUnitParameters.class)
    public JAXBElement<String> createOperationsUnitParametersDescription(String value) {
        return new JAXBElement<String>(_OperationsUnitParametersDescription_QNAME, String.class, OperationsUnitParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "Identifier", scope = OperationsUnitParameters.class)
    public JAXBElement<String> createOperationsUnitParametersIdentifier(String value) {
        return new JAXBElement<String>(_OperationsUnitParametersIdentifier_QNAME, String.class, OperationsUnitParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehouseCostType_CostType", scope = DataWarehouseStagedRouteCost.class)
    public JAXBElement<String> createDataWarehouseStagedRouteCostDataWarehouseCostTypeCostType(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteCostDataWarehouseCostTypeCostType_QNAME, String.class, DataWarehouseStagedRouteCost.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "Size1Alias", scope = StagedRoutePropertyOptions.class)
    public JAXBElement<String> createStagedRoutePropertyOptionsSize1Alias(String value) {
        return new JAXBElement<String>(_StagedRoutePropertyOptionsSize1Alias_QNAME, String.class, StagedRoutePropertyOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "Size2Alias", scope = StagedRoutePropertyOptions.class)
    public JAXBElement<String> createStagedRoutePropertyOptionsSize2Alias(String value) {
        return new JAXBElement<String>(_StagedRoutePropertyOptionsSize2Alias_QNAME, String.class, StagedRoutePropertyOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "Size3Alias", scope = StagedRoutePropertyOptions.class)
    public JAXBElement<String> createStagedRoutePropertyOptionsSize3Alias(String value) {
        return new JAXBElement<String>(_StagedRoutePropertyOptionsSize3Alias_QNAME, String.class, StagedRoutePropertyOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "WorkerTypeDescription", scope = StagedRoutePropertyOptions.class)
    public JAXBElement<String> createStagedRoutePropertyOptionsWorkerTypeDescription(String value) {
        return new JAXBElement<String>(_StagedRoutePropertyOptionsWorkerTypeDescription_QNAME, String.class, StagedRoutePropertyOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "WorkerTypeIdentifier", scope = StagedRoutePropertyOptions.class)
    public JAXBElement<String> createStagedRoutePropertyOptionsWorkerTypeIdentifier(String value) {
        return new JAXBElement<String>(_StagedRoutePropertyOptionsWorkerTypeIdentifier_QNAME, String.class, StagedRoutePropertyOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehouseStagedRouteAction_StagedRouteAction", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteDataWarehouseStagedRouteActionStagedRouteAction(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteDataWarehouseStagedRouteActionStagedRouteAction_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "Description", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteDescription(String value) {
        return new JAXBElement<String>(_OperationsUnitParametersDescription_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DestinationCoordinate", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<Coordinate> createDataWarehouseStagedRouteDestinationCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_DataWarehouseStagedRouteDestinationCoordinate_QNAME, Coordinate.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DestinationCreatedInRegionIdentifier", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteDestinationCreatedInRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteDestinationCreatedInRegionIdentifier_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DestinationCreatedInRegionPkey", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<Long> createDataWarehouseStagedRouteDestinationCreatedInRegionPkey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseStagedRouteDestinationCreatedInRegionPkey_QNAME, Long.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DestinationDescription", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteDestinationDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteDestinationDescription_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DestinationIdentifier", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteDestinationIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteDestinationIdentifier_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DestinationPkey", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<Long> createDataWarehouseStagedRouteDestinationPkey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseStagedRouteDestinationPkey_QNAME, Long.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DestinationRegionIdentifier", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteDestinationRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteDestinationRegionIdentifier_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DestinationRegionPkey", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<Long> createDataWarehouseStagedRouteDestinationRegionPkey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseStagedRouteDestinationRegionPkey_QNAME, Long.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "EquipmentCreatedInRegionIdentifier", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteEquipmentCreatedInRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteEquipmentCreatedInRegionIdentifier_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "EquipmentDescription", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteEquipmentDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteEquipmentDescription_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "EquipmentIdentifier", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteEquipmentIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteEquipmentIdentifier_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "EquipmentTypeCreatedInRegionIdentifier", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteEquipmentTypeCreatedInRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteEquipmentTypeCreatedInRegionIdentifier_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "EquipmentTypeDescription", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteEquipmentTypeDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteEquipmentTypeDescription_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "EquipmentTypeIdentifier", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteEquipmentTypeIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteEquipmentTypeIdentifier_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "OriginBusinessUnitIdentifier", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteOriginBusinessUnitIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteOriginBusinessUnitIdentifier_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "OriginBusinessUnitPkey", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<Long> createDataWarehouseStagedRouteOriginBusinessUnitPkey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseStagedRouteOriginBusinessUnitPkey_QNAME, Long.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "OriginCoordinate", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<Coordinate> createDataWarehouseStagedRouteOriginCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_DataWarehouseStagedRouteOriginCoordinate_QNAME, Coordinate.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "OriginCreatedInRegionIdentifier", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteOriginCreatedInRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteOriginCreatedInRegionIdentifier_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "OriginCreatedInRegionPkey", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<Long> createDataWarehouseStagedRouteOriginCreatedInRegionPkey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseStagedRouteOriginCreatedInRegionPkey_QNAME, Long.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "OriginDescription", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteOriginDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteOriginDescription_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "OriginIdentifier", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteOriginIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteOriginIdentifier_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "OriginPkey", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<Long> createDataWarehouseStagedRouteOriginPkey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseStagedRouteOriginPkey_QNAME, Long.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "OriginRegionIdentifier", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteOriginRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteOriginRegionIdentifier_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "OriginRegionPkey", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<Long> createDataWarehouseStagedRouteOriginRegionPkey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseStagedRouteOriginRegionPkey_QNAME, Long.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "PlannedArrivalTime", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseStagedRoutePlannedArrivalTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseStagedRoutePlannedArrivalTime_QNAME, XMLGregorianCalendar.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "PlannedCompleteTime", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseStagedRoutePlannedCompleteTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseStagedRoutePlannedCompleteTime_QNAME, XMLGregorianCalendar.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "PlannedDepartureTime", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseStagedRoutePlannedDepartureTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseStagedRoutePlannedDepartureTime_QNAME, XMLGregorianCalendar.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "PlannedDistanceToDestination", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<Distance> createDataWarehouseStagedRoutePlannedDistanceToDestination(Distance value) {
        return new JAXBElement<Distance>(_DataWarehouseStagedRoutePlannedDistanceToDestination_QNAME, Distance.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "PlannedGoalDistance", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<Distance> createDataWarehouseStagedRoutePlannedGoalDistance(Distance value) {
        return new JAXBElement<Distance>(_DataWarehouseStagedRoutePlannedGoalDistance_QNAME, Distance.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "PlannedOvertimeCost", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<Double> createDataWarehouseStagedRoutePlannedOvertimeCost(Double value) {
        return new JAXBElement<Double>(_DataWarehouseStagedRoutePlannedOvertimeCost_QNAME, Double.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "PlannedOvertimeTime", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<Duration> createDataWarehouseStagedRoutePlannedOvertimeTime(Duration value) {
        return new JAXBElement<Duration>(_DataWarehouseStagedRoutePlannedOvertimeTime_QNAME, Duration.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "PlannedRunningQuantityAfterOrigin", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<Quantities> createDataWarehouseStagedRoutePlannedRunningQuantityAfterOrigin(Quantities value) {
        return new JAXBElement<Quantities>(_DataWarehouseStagedRoutePlannedRunningQuantityAfterOrigin_QNAME, Quantities.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "PlannedStartTime", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseStagedRoutePlannedStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseStagedRoutePlannedStartTime_QNAME, XMLGregorianCalendar.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "RegionIdentifier", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteRegionIdentifier_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "RegionPkey", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<Long> createDataWarehouseStagedRouteRegionPkey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseStagedRouteRegionPkey_QNAME, Long.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "RouteDate", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseStagedRouteRouteDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseStagedRouteRouteDate_QNAME, XMLGregorianCalendar.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "RouteIdentifier", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteRouteIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteRouteIdentifier_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "ScenarioIdentifier", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteScenarioIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteScenarioIdentifier_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "SessionDescription", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteSessionDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteSessionDescription_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "Size1Alias", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteSize1Alias(String value) {
        return new JAXBElement<String>(_StagedRoutePropertyOptionsSize1Alias_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "Size2Alias", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteSize2Alias(String value) {
        return new JAXBElement<String>(_StagedRoutePropertyOptionsSize2Alias_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "Size3Alias", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteSize3Alias(String value) {
        return new JAXBElement<String>(_StagedRoutePropertyOptionsSize3Alias_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "Source", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteSource(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteSource_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "SourceVersion", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteSourceVersion(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteSourceVersion_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedRouteCost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "StagedRouteCosts", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<ArrayOfDataWarehouseStagedRouteCost> createDataWarehouseStagedRouteStagedRouteCosts(ArrayOfDataWarehouseStagedRouteCost value) {
        return new JAXBElement<ArrayOfDataWarehouseStagedRouteCost>(_DataWarehouseStagedRouteStagedRouteCosts_QNAME, ArrayOfDataWarehouseStagedRouteCost.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedRouteEquipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "StagedRouteEquipments", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<ArrayOfDataWarehouseStagedRouteEquipment> createDataWarehouseStagedRouteStagedRouteEquipments(ArrayOfDataWarehouseStagedRouteEquipment value) {
        return new JAXBElement<ArrayOfDataWarehouseStagedRouteEquipment>(_DataWarehouseStagedRouteStagedRouteEquipments_QNAME, ArrayOfDataWarehouseStagedRouteEquipment.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedStop }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "StagedStops", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<ArrayOfDataWarehouseStagedStop> createDataWarehouseStagedRouteStagedStops(ArrayOfDataWarehouseStagedStop value) {
        return new JAXBElement<ArrayOfDataWarehouseStagedStop>(_DataWarehouseStagedRouteStagedStops_QNAME, ArrayOfDataWarehouseStagedStop.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "WorkerCreatedInRegionIdentifier", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteWorkerCreatedInRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteWorkerCreatedInRegionIdentifier_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "WorkerCreatedInRegionPkey", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<Long> createDataWarehouseStagedRouteWorkerCreatedInRegionPkey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseStagedRouteWorkerCreatedInRegionPkey_QNAME, Long.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "WorkerIdentifier", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteWorkerIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteWorkerIdentifier_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "WorkerName", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<PersonName> createDataWarehouseStagedRouteWorkerName(PersonName value) {
        return new JAXBElement<PersonName>(_DataWarehouseStagedRouteWorkerName_QNAME, PersonName.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "WorkerTypeCreatedInRegionIdentifier", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteWorkerTypeCreatedInRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteWorkerTypeCreatedInRegionIdentifier_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "WorkerTypeCreatedInRegionPkey", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<Long> createDataWarehouseStagedRouteWorkerTypeCreatedInRegionPkey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseStagedRouteWorkerTypeCreatedInRegionPkey_QNAME, Long.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "WorkerTypeDescription", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteWorkerTypeDescription(String value) {
        return new JAXBElement<String>(_StagedRoutePropertyOptionsWorkerTypeDescription_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "WorkerTypeIdentifier", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteWorkerTypeIdentifier(String value) {
        return new JAXBElement<String>(_StagedRoutePropertyOptionsWorkerTypeIdentifier_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "WorldTimeZone_OriginTimeZone", scope = DataWarehouseStagedRoute.class)
    public JAXBElement<String> createDataWarehouseStagedRouteWorldTimeZoneOriginTimeZone(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteWorldTimeZoneOriginTimeZone_QNAME, String.class, DataWarehouseStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "ActualArrivalTime", scope = DataWarehouseActualStagedRoute.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseActualStagedRouteActualArrivalTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseActualStagedRouteActualArrivalTime_QNAME, XMLGregorianCalendar.class, DataWarehouseActualStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "ActualCompleteTime", scope = DataWarehouseActualStagedRoute.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseActualStagedRouteActualCompleteTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseActualStagedRouteActualCompleteTime_QNAME, XMLGregorianCalendar.class, DataWarehouseActualStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "ActualDepartureTime", scope = DataWarehouseActualStagedRoute.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseActualStagedRouteActualDepartureTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseActualStagedRouteActualDepartureTime_QNAME, XMLGregorianCalendar.class, DataWarehouseActualStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DistanceToDestination", scope = DataWarehouseActualStagedRoute.class)
    public JAXBElement<Distance> createDataWarehouseActualStagedRouteDistanceToDestination(Distance value) {
        return new JAXBElement<Distance>(_DataWarehouseActualStagedRouteDistanceToDestination_QNAME, Distance.class, DataWarehouseActualStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DistanceToDestinationGps", scope = DataWarehouseActualStagedRoute.class)
    public JAXBElement<Distance> createDataWarehouseActualStagedRouteDistanceToDestinationGps(Distance value) {
        return new JAXBElement<Distance>(_DataWarehouseActualStagedRouteDistanceToDestinationGps_QNAME, Distance.class, DataWarehouseActualStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DistanceToDestinationOdometer", scope = DataWarehouseActualStagedRoute.class)
    public JAXBElement<Distance> createDataWarehouseActualStagedRouteDistanceToDestinationOdometer(Distance value) {
        return new JAXBElement<Distance>(_DataWarehouseActualStagedRouteDistanceToDestinationOdometer_QNAME, Distance.class, DataWarehouseActualStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "RunningQuantityAfterOrigin", scope = DataWarehouseActualStagedRoute.class)
    public JAXBElement<Quantities> createDataWarehouseActualStagedRouteRunningQuantityAfterOrigin(Quantities value) {
        return new JAXBElement<Quantities>(_DataWarehouseActualStagedRouteRunningQuantityAfterOrigin_QNAME, Quantities.class, DataWarehouseActualStagedRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "AccountDescription", scope = DataWarehouseStagedStop.class)
    public JAXBElement<String> createDataWarehouseStagedStopAccountDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedStopAccountDescription_QNAME, String.class, DataWarehouseStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "AccountIdentifier", scope = DataWarehouseStagedStop.class)
    public JAXBElement<String> createDataWarehouseStagedStopAccountIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedStopAccountIdentifier_QNAME, String.class, DataWarehouseStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "Coordinate", scope = DataWarehouseStagedStop.class)
    public JAXBElement<Coordinate> createDataWarehouseStagedStopCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_DataWarehouseStagedStopCoordinate_QNAME, Coordinate.class, DataWarehouseStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehouseStagedStopType_Type", scope = DataWarehouseStagedStop.class)
    public JAXBElement<String> createDataWarehouseStagedStopDataWarehouseStagedStopTypeType(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedStopDataWarehouseStagedStopTypeType_QNAME, String.class, DataWarehouseStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "LocationCreatedInRegionIdentifier", scope = DataWarehouseStagedStop.class)
    public JAXBElement<String> createDataWarehouseStagedStopLocationCreatedInRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedStopLocationCreatedInRegionIdentifier_QNAME, String.class, DataWarehouseStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "LocationCreatedInRegionPkey", scope = DataWarehouseStagedStop.class)
    public JAXBElement<Long> createDataWarehouseStagedStopLocationCreatedInRegionPkey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseStagedStopLocationCreatedInRegionPkey_QNAME, Long.class, DataWarehouseStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "LocationDescription", scope = DataWarehouseStagedStop.class)
    public JAXBElement<String> createDataWarehouseStagedStopLocationDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedStopLocationDescription_QNAME, String.class, DataWarehouseStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "LocationIdentifier", scope = DataWarehouseStagedStop.class)
    public JAXBElement<String> createDataWarehouseStagedStopLocationIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedStopLocationIdentifier_QNAME, String.class, DataWarehouseStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "LocationType", scope = DataWarehouseStagedStop.class)
    public JAXBElement<String> createDataWarehouseStagedStopLocationType(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedStopLocationType_QNAME, String.class, DataWarehouseStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "PlannedArrival", scope = DataWarehouseStagedStop.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseStagedStopPlannedArrival(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseStagedStopPlannedArrival_QNAME, XMLGregorianCalendar.class, DataWarehouseStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "PlannedDeparture", scope = DataWarehouseStagedStop.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseStagedStopPlannedDeparture(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseStagedStopPlannedDeparture_QNAME, XMLGregorianCalendar.class, DataWarehouseStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "PlannedDistanceTo", scope = DataWarehouseStagedStop.class)
    public JAXBElement<Distance> createDataWarehouseStagedStopPlannedDistanceTo(Distance value) {
        return new JAXBElement<Distance>(_DataWarehouseStagedStopPlannedDistanceTo_QNAME, Distance.class, DataWarehouseStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "PlannedIndex", scope = DataWarehouseStagedStop.class)
    public JAXBElement<Integer> createDataWarehouseStagedStopPlannedIndex(Integer value) {
        return new JAXBElement<Integer>(_DataWarehouseStagedStopPlannedIndex_QNAME, Integer.class, DataWarehouseStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "PlannedSequenceNumber", scope = DataWarehouseStagedStop.class)
    public JAXBElement<Integer> createDataWarehouseStagedStopPlannedSequenceNumber(Integer value) {
        return new JAXBElement<Integer>(_DataWarehouseStagedStopPlannedSequenceNumber_QNAME, Integer.class, DataWarehouseStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "ServiceLocationCategoryDescription", scope = DataWarehouseStagedStop.class)
    public JAXBElement<String> createDataWarehouseStagedStopServiceLocationCategoryDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedStopServiceLocationCategoryDescription_QNAME, String.class, DataWarehouseStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "ServiceLocationCategoryIdentifier", scope = DataWarehouseStagedStop.class)
    public JAXBElement<String> createDataWarehouseStagedStopServiceLocationCategoryIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedStopServiceLocationCategoryIdentifier_QNAME, String.class, DataWarehouseStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "StagedOrders", scope = DataWarehouseStagedStop.class)
    public JAXBElement<ArrayOfDataWarehouseStagedOrder> createDataWarehouseStagedStopStagedOrders(ArrayOfDataWarehouseStagedOrder value) {
        return new JAXBElement<ArrayOfDataWarehouseStagedOrder>(_DataWarehouseStagedStopStagedOrders_QNAME, ArrayOfDataWarehouseStagedOrder.class, DataWarehouseStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedStopQuantity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "StagedStopQuantities", scope = DataWarehouseStagedStop.class)
    public JAXBElement<ArrayOfDataWarehouseStagedStopQuantity> createDataWarehouseStagedStopStagedStopQuantities(ArrayOfDataWarehouseStagedStopQuantity value) {
        return new JAXBElement<ArrayOfDataWarehouseStagedStopQuantity>(_DataWarehouseStagedStopStagedStopQuantities_QNAME, ArrayOfDataWarehouseStagedStopQuantity.class, DataWarehouseStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "ActualArrival", scope = DataWarehouseActualStagedStop.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseActualStagedStopActualArrival(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseActualStagedStopActualArrival_QNAME, XMLGregorianCalendar.class, DataWarehouseActualStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "ActualDeparture", scope = DataWarehouseActualStagedStop.class)
    public JAXBElement<XMLGregorianCalendar> createDataWarehouseActualStagedStopActualDeparture(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWarehouseActualStagedStopActualDeparture_QNAME, XMLGregorianCalendar.class, DataWarehouseActualStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "ActualSequenceNumber", scope = DataWarehouseActualStagedStop.class)
    public JAXBElement<Integer> createDataWarehouseActualStagedStopActualSequenceNumber(Integer value) {
        return new JAXBElement<Integer>(_DataWarehouseActualStagedStopActualSequenceNumber_QNAME, Integer.class, DataWarehouseActualStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DistanceTo", scope = DataWarehouseActualStagedStop.class)
    public JAXBElement<Distance> createDataWarehouseActualStagedStopDistanceTo(Distance value) {
        return new JAXBElement<Distance>(_DataWarehouseActualStagedStopDistanceTo_QNAME, Distance.class, DataWarehouseActualStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DistanceToGps", scope = DataWarehouseActualStagedStop.class)
    public JAXBElement<Distance> createDataWarehouseActualStagedStopDistanceToGps(Distance value) {
        return new JAXBElement<Distance>(_DataWarehouseActualStagedStopDistanceToGps_QNAME, Distance.class, DataWarehouseActualStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DistanceToOdometer", scope = DataWarehouseActualStagedStop.class)
    public JAXBElement<Distance> createDataWarehouseActualStagedStopDistanceToOdometer(Distance value) {
        return new JAXBElement<Distance>(_DataWarehouseActualStagedStopDistanceToOdometer_QNAME, Distance.class, DataWarehouseActualStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "EngineIdleTime", scope = DataWarehouseActualStagedStop.class)
    public JAXBElement<Duration> createDataWarehouseActualStagedStopEngineIdleTime(Duration value) {
        return new JAXBElement<Duration>(_DataWarehouseActualStagedStopEngineIdleTime_QNAME, Duration.class, DataWarehouseActualStagedStop.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "DataWarehouseStagedStopQuantityServiceType_Type", scope = DataWarehouseStagedStopQuantity.class)
    public JAXBElement<String> createDataWarehouseStagedStopQuantityDataWarehouseStagedStopQuantityServiceTypeType(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedStopQuantityDataWarehouseStagedStopQuantityServiceTypeType_QNAME, String.class, DataWarehouseStagedStopQuantity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "UnitType", scope = DataWarehouseStagedStopQuantity.class)
    public JAXBElement<String> createDataWarehouseStagedStopQuantityUnitType(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedStopQuantityUnitType_QNAME, String.class, DataWarehouseStagedStopQuantity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "EquipmentCreatedInRegionIdentifier", scope = DataWarehouseStagedRouteEquipment.class)
    public JAXBElement<String> createDataWarehouseStagedRouteEquipmentEquipmentCreatedInRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteEquipmentCreatedInRegionIdentifier_QNAME, String.class, DataWarehouseStagedRouteEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "EquipmentCreatedInRegionPkey", scope = DataWarehouseStagedRouteEquipment.class)
    public JAXBElement<Long> createDataWarehouseStagedRouteEquipmentEquipmentCreatedInRegionPkey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseStagedRouteEquipmentEquipmentCreatedInRegionPkey_QNAME, Long.class, DataWarehouseStagedRouteEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "EquipmentDescription", scope = DataWarehouseStagedRouteEquipment.class)
    public JAXBElement<String> createDataWarehouseStagedRouteEquipmentEquipmentDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteEquipmentDescription_QNAME, String.class, DataWarehouseStagedRouteEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "EquipmentIdentifier", scope = DataWarehouseStagedRouteEquipment.class)
    public JAXBElement<String> createDataWarehouseStagedRouteEquipmentEquipmentIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteEquipmentIdentifier_QNAME, String.class, DataWarehouseStagedRouteEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "EquipmentTypeCreatedInRegionIdentifier", scope = DataWarehouseStagedRouteEquipment.class)
    public JAXBElement<String> createDataWarehouseStagedRouteEquipmentEquipmentTypeCreatedInRegionIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteEquipmentTypeCreatedInRegionIdentifier_QNAME, String.class, DataWarehouseStagedRouteEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "EquipmentTypeCreatedInRegionPkey", scope = DataWarehouseStagedRouteEquipment.class)
    public JAXBElement<Long> createDataWarehouseStagedRouteEquipmentEquipmentTypeCreatedInRegionPkey(Long value) {
        return new JAXBElement<Long>(_DataWarehouseStagedRouteEquipmentEquipmentTypeCreatedInRegionPkey_QNAME, Long.class, DataWarehouseStagedRouteEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "EquipmentTypeDescription", scope = DataWarehouseStagedRouteEquipment.class)
    public JAXBElement<String> createDataWarehouseStagedRouteEquipmentEquipmentTypeDescription(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteEquipmentTypeDescription_QNAME, String.class, DataWarehouseStagedRouteEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", name = "EquipmentTypeIdentifier", scope = DataWarehouseStagedRouteEquipment.class)
    public JAXBElement<String> createDataWarehouseStagedRouteEquipmentEquipmentTypeIdentifier(String value) {
        return new JAXBElement<String>(_DataWarehouseStagedRouteEquipmentTypeIdentifier_QNAME, String.class, DataWarehouseStagedRouteEquipment.class, value);
    }

}
