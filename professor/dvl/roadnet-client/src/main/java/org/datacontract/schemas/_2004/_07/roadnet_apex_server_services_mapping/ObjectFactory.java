
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.roadnet.apex.datacontracts.ArrayOfCoordinate;
import com.roadnet.apex.datacontracts.ArrayOfNamedPlace;
import com.roadnet.apex.datacontracts.ArrayOfNetworkArc;
import com.roadnet.apex.datacontracts.ArrayOfNetworkInstanceID;
import com.roadnet.apex.datacontracts.ArrayOfNetworkPenalizedTurn;
import com.roadnet.apex.datacontracts.ArrayOfNetworkRestrictedPath;
import com.roadnet.apex.datacontracts.ArrayOfNetworkTravelPolygon;
import com.roadnet.apex.datacontracts.ArrayOfValidationFailure;
import com.roadnet.apex.datacontracts.ArrayOfViewport;
import com.roadnet.apex.datacontracts.Coordinate;
import com.roadnet.apex.datacontracts.Distance;
import com.roadnet.apex.datacontracts.INetworkSpatial;
import com.roadnet.apex.datacontracts.Jurisdiction;
import com.roadnet.apex.datacontracts.Locality;
import com.roadnet.apex.datacontracts.MeasurementOptions;
import com.roadnet.apex.datacontracts.NamedPlace;
import com.roadnet.apex.datacontracts.NetworkArc;
import com.roadnet.apex.datacontracts.NetworkArcCandidatePropertyOptions;
import com.roadnet.apex.datacontracts.NetworkArcPropertyOptions;
import com.roadnet.apex.datacontracts.NetworkEditOperationPropertyOptions;
import com.roadnet.apex.datacontracts.NetworkInstanceID;
import com.roadnet.apex.datacontracts.NetworkPOI;
import com.roadnet.apex.datacontracts.NetworkPOICandidatePropertyOptions;
import com.roadnet.apex.datacontracts.NetworkPointAddressCandidatePropertyOptions;
import com.roadnet.apex.datacontracts.NetworkRestrictedPath;
import com.roadnet.apex.datacontracts.NetworkRestrictedPathPropertyOptions;
import com.roadnet.apex.datacontracts.NetworkStreet;
import com.roadnet.apex.datacontracts.NetworkTravelModel;
import com.roadnet.apex.datacontracts.NetworkTravelPolygon;
import com.roadnet.apex.datacontracts.NetworkTravelPolygonPropertyOptions;
import com.roadnet.apex.datacontracts.PointPath;
import com.roadnet.apex.datacontracts.TravelPathCalculatorOptions;
import com.roadnet.apex.datacontracts.Viewport;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping package. 
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

    private final static QName _ClosestPointCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ClosestPointCriteria");
    private final static QName _MapNodeTypeFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapNodeTypeFlags");
    private final static QName _MapSyncEditType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapSyncEditType");
    private final static QName _MapSyncRoadClassMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapSyncRoadClassMode");
    private final static QName _MapSyncRoadClassOperation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapSyncRoadClassOperation");
    private final static QName _MapSyncRoadClassLevel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapSyncRoadClassLevel");
    private final static QName _NetworkArcPropertyFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkArcPropertyFlags");
    private final static QName _NetworkEditAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkEditAction");
    private final static QName _NetworkEditOperationStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkEditOperationStatus");
    private final static QName _NetworkEditOperationStatusFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkEditOperationStatusFlags");
    private final static QName _NetworkEditOperationSource_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkEditOperationSource");
    private final static QName _NetworkSpatialItemType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkSpatialItemType");
    private final static QName _MapNode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapNode");
    private final static QName _ImpasseNode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ImpasseNode");
    private final static QName _IntersectionNode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "IntersectionNode");
    private final static QName _AddressCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "AddressCriteria");
    private final static QName _CalculateDistanceByJurisdictionResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "CalculateDistanceByJurisdictionResult");
    private final static QName _ArrayOfJurisdictionDistance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ArrayOfJurisdictionDistance");
    private final static QName _JurisdictionDistance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "JurisdictionDistance");
    private final static QName _GeocodeOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "GeocodeOptions");
    private final static QName _CalculateDistanceByJurisdictionResultPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "CalculateDistanceByJurisdictionResultPropertyOptions");
    private final static QName _JurisdictionDistancePropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "JurisdictionDistancePropertyOptions");
    private final static QName _MapLocalSearchResultDataPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapLocalSearchResultDataPropertyOptions");
    private final static QName _MapNodePropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapNodePropertyOptions");
    private final static QName _IntersectionNodePropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "IntersectionNodePropertyOptions");
    private final static QName _MapLocalSearchCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapLocalSearchCriteria");
    private final static QName _MapLocalSearchResultData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapLocalSearchResultData");
    private final static QName _NetworkChangedAreas_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkChangedAreas");
    private final static QName _NetworkSplitArcInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkSplitArcInfo");
    private final static QName _RetrieveArcsCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveArcsCriteria");
    private final static QName _SpatialCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "SpatialCriteria");
    private final static QName _RetrieveDeltaMapEditsResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveDeltaMapEditsResult");
    private final static QName _RetrieveEditOperationsCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveEditOperationsCriteria");
    private final static QName _RetrieveFullMapEditsResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveFullMapEditsResult");
    private final static QName _RetrieveGeocodeCandidateOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveGeocodeCandidateOptions");
    private final static QName _RetrieveNodesCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveNodesCriteria");
    private final static QName _RetrieveTravelPathsAndPolygonsCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveTravelPathsAndPolygonsCriteria");
    private final static QName _RouteShield_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RouteShield");
    private final static QName _NetworkEditOperation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkEditOperation");
    private final static QName _ArrayOfNetworkEditRecord_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ArrayOfNetworkEditRecord");
    private final static QName _NetworkEditRecord_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkEditRecord");
    private final static QName _RetrieveEditOperationsOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveEditOperationsOptions");
    private final static QName _RetrieveEditOperationsResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveEditOperationsResult");
    private final static QName _MappingErrorInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MappingErrorInfo");
    private final static QName _ArrayOfNetworkEditOperation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ArrayOfNetworkEditOperation");
    private final static QName _ProcessCommunityEditRequestArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ProcessCommunityEditRequestArgs");
    private final static QName _ProcessCommunityEditRequestResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ProcessCommunityEditRequestResult");
    private final static QName _RetrieveMapInfoResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveMapInfoResult");
    private final static QName _RetrieveNodesDetailCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveNodesDetailCriteria");
    private final static QName _ArrayOfMapNode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ArrayOfMapNode");
    private final static QName _RetrieveNodesDetailOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveNodesDetailOptions");
    private final static QName _ImpasseNodePropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ImpasseNodePropertyOptions");
    private final static QName _RetrieveNodesDetailResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveNodesDetailResults");
    private final static QName _ArrayOfRetrieveNodesDetailResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ArrayOfRetrieveNodesDetailResult");
    private final static QName _RetrieveNodesDetailResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveNodesDetailResult");
    private final static QName _UpdateArcsOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "UpdateArcsOptions");
    private final static QName _UpdateArcsResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "UpdateArcsResults");
    private final static QName _ArrayOfUpdateArcResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ArrayOfUpdateArcResult");
    private final static QName _UpdateArcResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "UpdateArcResult");
    private final static QName _ArrayOfNetworkSplitArcInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ArrayOfNetworkSplitArcInfo");
    private final static QName _UpdateNodeCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "UpdateNodeCriteria");
    private final static QName _ArrayOfMapRegionInfoDto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ArrayOfMapRegionInfoDto");
    private final static QName _MapRegionInfoDto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapRegionInfoDto");
    private final static QName _ArrayOfMapBucketInfoDto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ArrayOfMapBucketInfoDto");
    private final static QName _MapBucketInfoDto_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapBucketInfoDto");
    private final static QName _RetrieveArcsOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveArcsOptions");
    private final static QName _RetrieveArcsResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveArcsResults");
    private final static QName _PopulateArcsOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "PopulateArcsOptions");
    private final static QName _ArrayOfPopulateArcResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ArrayOfPopulateArcResult");
    private final static QName _PopulateArcResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "PopulateArcResult");
    private final static QName _RetrieveMapChangedAreasOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveMapChangedAreasOptions");
    private final static QName _RetrieveMapChangedAreasResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveMapChangedAreasResults");
    private final static QName _RetrieveNodesOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveNodesOptions");
    private final static QName _RetrieveNodesResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveNodesResults");
    private final static QName _ApplyArcUpdatesCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ApplyArcUpdatesCriteria");
    private final static QName _ApplyArcUpdatesOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ApplyArcUpdatesOptions");
    private final static QName _ApplyArcUpdatesResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ApplyArcUpdatesResult");
    private final static QName _GeocodeCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "GeocodeCriteria");
    private final static QName _GenerateTravelPathOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "GenerateTravelPathOptions");
    private final static QName _ArrayOfRouteShield_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ArrayOfRouteShield");
    private final static QName _CalculateDistanceByJurisdictionOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "CalculateDistanceByJurisdictionOptions");
    private final static QName _RetrieveTravelModelResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveTravelModelResults");
    private final static QName _RetrieveRestrictedPathsAndPolygonsOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveRestrictedPathsAndPolygonsOptions");
    private final static QName _RetrieveRestrictedPathsAndPolygonsResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RetrieveRestrictedPathsAndPolygonsResults");
    private final static QName _UpdateRestrictedPathOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "UpdateRestrictedPathOptions");
    private final static QName _UpdateRestrictedPathResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "UpdateRestrictedPathResult");
    private final static QName _UpdateTravelPolygonOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "UpdateTravelPolygonOptions");
    private final static QName _UpdateTravelPolygonResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "UpdateTravelPolygonResult");
    private final static QName _MapLocalSearchOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapLocalSearchOptions");
    private final static QName _MapLocalSearchResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapLocalSearchResult");
    private final static QName _MapLocalSearchResultErrorCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapLocalSearchResult.ErrorCode");
    private final static QName _ArrayOfMapLocalSearchResultData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ArrayOfMapLocalSearchResultData");
    private final static QName _MapSyncCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapSyncCriteria");
    private final static QName _MapSyncOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapSyncOptions");
    private final static QName _PopulateArcResultNetworkArc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkArc");
    private final static QName _MapBucketInfoDtoFilename_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "Filename");
    private final static QName _MapRegionInfoDtoDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "Description");
    private final static QName _MapRegionInfoDtoMapBuckets_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapBuckets");
    private final static QName _UpdateArcResultErrorInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ErrorInfo");
    private final static QName _UpdateArcResultSplitArcsInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "SplitArcsInfo");
    private final static QName _UpdateArcResultUpdatedNetworkArc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "UpdatedNetworkArc");
    private final static QName _RetrieveNodesDetailResultMapNode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "mapNode");
    private final static QName _MapNodePropertyOptionsAttachedArcsOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "AttachedArcsOptions");
    private final static QName _MappingErrorInfoValidationFailures_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ValidationFailures");
    private final static QName _NetworkEditOperationComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "Comment");
    private final static QName _NetworkEditOperationEditRecords_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "EditRecords");
    private final static QName _NetworkEditOperationNetworkArcPropertyFlagsChangedProperties_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkArcPropertyFlags_ChangedProperties");
    private final static QName _NetworkEditOperationNetworkEditOperationStatusStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkEditOperationStatus_Status");
    private final static QName _RouteShieldCountryISO3Abbr_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "CountryISO3Abbr");
    private final static QName _RouteShieldGuiBitmap_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "GuiBitmap");
    private final static QName _RouteShieldRegionName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RegionName");
    private final static QName _SpatialCriteriaViewport_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "Viewport");
    private final static QName _NetworkSplitArcInfoOldInstanceID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "OldInstanceID");
    private final static QName _NetworkSplitArcInfoSplitArc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "SplitArc");
    private final static QName _NetworkChangedAreasChangedAreas_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ChangedAreas");
    private final static QName _NetworkChangedAreasLastChangedAreaEditTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "LastChangedAreaEditTime");
    private final static QName _MapLocalSearchResultDataAddressFormatted_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "AddressFormatted");
    private final static QName _MapLocalSearchResultDataCandidate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "Candidate");
    private final static QName _MapLocalSearchResultDataGeocodeAccuracyQuality_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "GeocodeAccuracy_Quality");
    private final static QName _MapLocalSearchResultDataLocation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "Location");
    private final static QName _MapLocalSearchResultDataPhoneNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "PhoneNumber");
    private final static QName _CalculateDistanceByJurisdictionResultPropertyOptionsJurisdictionDistancesOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "JurisdictionDistancesOptions");
    private final static QName _JurisdictionDistanceDistance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "Distance");
    private final static QName _JurisdictionDistanceFromCoordinate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "FromCoordinate");
    private final static QName _JurisdictionDistanceJurisdiction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "Jurisdiction");
    private final static QName _JurisdictionDistancePath_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "Path");
    private final static QName _JurisdictionDistanceToCoordinate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ToCoordinate");
    private final static QName _AddressCriteriaHouseNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "HouseNumber");
    private final static QName _AddressCriteriaLocality_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "Locality");
    private final static QName _AddressCriteriaStreet_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "Street");
    private final static QName _MapNodeAttachedArcs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "AttachedArcs");
    private final static QName _MapNodePoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "Point");
    private final static QName _IntersectionNodePenalizedTurns_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "PenalizedTurns");
    private final static QName _ClosestPointCriteriaClosePoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ClosePoint");
    private final static QName _ClosestPointCriteriaMaxSearchRadius_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MaxSearchRadius");
    private final static QName _MapSyncCriteriaImpassePoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ImpassePoint");
    private final static QName _MapSyncCriteriaMapCountryAbbreviations_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapCountryAbbreviations");
    private final static QName _MapSyncCriteriaMapVendorName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapVendorName");
    private final static QName _MapSyncCriteriaMapVendorVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapVendorVersion");
    private final static QName _MapSyncCriteriaNewArc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NewArc");
    private final static QName _MapSyncCriteriaNewPOI_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NewPOI");
    private final static QName _MapSyncCriteriaOldArc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "OldArc");
    private final static QName _MapSyncCriteriaOldPOI_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "OldPOI");
    private final static QName _MapSyncCriteriaRoadClassCountryCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RoadClassCountryCode");
    private final static QName _MapSyncCriteriaRoadClassLowerLeftCorner_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RoadClassLowerLeftCorner");
    private final static QName _MapSyncCriteriaRoadClassStateName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RoadClassStateName");
    private final static QName _MapSyncCriteriaRoadClassUpperRightCorner_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "RoadClassUpperRightCorner");
    private final static QName _MapSyncCriteriaTurnPenaltyIncomingArc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "TurnPenaltyIncomingArc");
    private final static QName _MapSyncCriteriaTurnPenaltyNodePoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "TurnPenaltyNodePoint");
    private final static QName _MapSyncCriteriaTurnPenaltyOutgoingArc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "TurnPenaltyOutgoingArc");
    private final static QName _MapSyncCriteriaUserID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "UserID");
    private final static QName _MapLocalSearchResultResultsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ResultsData");
    private final static QName _MapLocalSearchOptionsPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "PropertyOptions");
    private final static QName _MapLocalSearchCriteriaLocalityToSearch_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "LocalityToSearch");
    private final static QName _MapLocalSearchCriteriaPlaceToSearch_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "PlaceToSearch");
    private final static QName _MapLocalSearchCriteriaPointToBeginSearch_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "PointToBeginSearch");
    private final static QName _UpdateTravelPolygonResultUpdatedTravelPolygon_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "UpdatedTravelPolygon");
    private final static QName _UpdateRestrictedPathResultUpdatedTravelPath_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "UpdatedTravelPath");
    private final static QName _RetrieveRestrictedPathsAndPolygonsResultsTravelPaths_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "TravelPaths");
    private final static QName _RetrieveRestrictedPathsAndPolygonsResultsTravelPolygons_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "TravelPolygons");
    private final static QName _RetrieveRestrictedPathsAndPolygonsOptionsTravelPathPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "TravelPathPropertyOptions");
    private final static QName _RetrieveRestrictedPathsAndPolygonsOptionsTravelPolygonPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "TravelPolygonPropertyOptions");
    private final static QName _RetrieveTravelModelResultsTravelModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "TravelModel");
    private final static QName _CalculateDistanceByJurisdictionResultJurisdictionDistances_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "JurisdictionDistances");
    private final static QName _CalculateDistanceByJurisdictionResultTravelPathErrorCodeDestinationPathError_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "TravelPathErrorCode_DestinationPathError");
    private final static QName _CalculateDistanceByJurisdictionOptionsCalculatorOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "CalculatorOptions");
    private final static QName _CalculateDistanceByJurisdictionOptionsMeasurementOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MeasurementOptions");
    private final static QName _GenerateTravelPathOptionsCoordinates_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "Coordinates");
    private final static QName _RetrieveGeocodeCandidateOptionsGeocodingOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "GeocodingOptions");
    private final static QName _GeocodeOptionsNetworkArcCandidatePropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkArcCandidatePropertyOptions");
    private final static QName _GeocodeOptionsNetworkPOICandidatePropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkPOICandidatePropertyOptions");
    private final static QName _GeocodeOptionsNetworkPointAddressCandidatePropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkPointAddressCandidatePropertyOptions");
    private final static QName _GeocodeCriteriaNamedPlaces_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NamedPlaces");
    private final static QName _ApplyArcUpdatesOptionsReturnArcsPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ReturnArcsPropertyOptions");
    private final static QName _ApplyArcUpdatesCriteriaArcsToUpdate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "ArcsToUpdate");
    private final static QName _ApplyArcUpdatesCriteriaTemplateUpdateArc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "TemplateUpdateArc");
    private final static QName _RetrieveNodesResultsNodes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "Nodes");
    private final static QName _RetrieveNodesCriteriaMapNodeTypeFlagsNodeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapNodeTypeFlags_NodeType");
    private final static QName _RetrieveArcsResultsNetworkArcs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkArcs");
    private final static QName _UpdateNodeCriteriaNode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "Node");
    private final static QName _UpdateArcsResultsUpdatedArcsResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "UpdatedArcsResults");
    private final static QName _UpdateArcsOptionsSplitArcsPropertyOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "SplitArcsPropertyOptions");
    private final static QName _RetrieveNodesDetailResultsDetailResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "DetailResults");
    private final static QName _RetrieveFullMapEditsResultData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "Data");
    private final static QName _RetrieveMapInfoResultMapSchemaVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapSchemaVersion");
    private final static QName _RetrieveMapInfoResultMapVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "MapVersion");
    private final static QName _ProcessCommunityEditRequestResultEditRequestOperation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "EditRequestOperation");
    private final static QName _RetrieveEditOperationsResultOperations_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "Operations");
    private final static QName _RetrieveEditOperationsCriteriaBeginDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "BeginDate");
    private final static QName _RetrieveEditOperationsCriteriaEndDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "EndDate");
    private final static QName _RetrieveEditOperationsCriteriaNetworkEditOperationSourceSource_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkEditOperationSource_Source");
    private final static QName _RetrieveEditOperationsCriteriaNetworkEditOperationStatusFlagsStatusTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkEditOperationStatusFlags_StatusTypes");
    private final static QName _NetworkEditRecordEditorID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "EditorID");
    private final static QName _NetworkEditRecordNetworkEditActionEditAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkEditAction_EditAction");
    private final static QName _NetworkEditRecordNetworkSpatialItemTypeItemType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NetworkSpatialItemType_ItemType");
    private final static QName _NetworkEditRecordNewSpatialItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "NewSpatialItem");
    private final static QName _NetworkEditRecordOldSpatialItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", "OldSpatialItem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NetworkEditRecord }
     * 
     */
    public NetworkEditRecord createNetworkEditRecord() {
        return new NetworkEditRecord();
    }

    /**
     * Create an instance of {@link RetrieveEditOperationsCriteria }
     * 
     */
    public RetrieveEditOperationsCriteria createRetrieveEditOperationsCriteria() {
        return new RetrieveEditOperationsCriteria();
    }

    /**
     * Create an instance of {@link RetrieveEditOperationsOptions }
     * 
     */
    public RetrieveEditOperationsOptions createRetrieveEditOperationsOptions() {
        return new RetrieveEditOperationsOptions();
    }

    /**
     * Create an instance of {@link RetrieveEditOperationsResult }
     * 
     */
    public RetrieveEditOperationsResult createRetrieveEditOperationsResult() {
        return new RetrieveEditOperationsResult();
    }

    /**
     * Create an instance of {@link ProcessCommunityEditRequestArgs }
     * 
     */
    public ProcessCommunityEditRequestArgs createProcessCommunityEditRequestArgs() {
        return new ProcessCommunityEditRequestArgs();
    }

    /**
     * Create an instance of {@link ProcessCommunityEditRequestResult }
     * 
     */
    public ProcessCommunityEditRequestResult createProcessCommunityEditRequestResult() {
        return new ProcessCommunityEditRequestResult();
    }

    /**
     * Create an instance of {@link RetrieveMapInfoResult }
     * 
     */
    public RetrieveMapInfoResult createRetrieveMapInfoResult() {
        return new RetrieveMapInfoResult();
    }

    /**
     * Create an instance of {@link RetrieveDeltaMapEditsResult }
     * 
     */
    public RetrieveDeltaMapEditsResult createRetrieveDeltaMapEditsResult() {
        return new RetrieveDeltaMapEditsResult();
    }

    /**
     * Create an instance of {@link RetrieveFullMapEditsResult }
     * 
     */
    public RetrieveFullMapEditsResult createRetrieveFullMapEditsResult() {
        return new RetrieveFullMapEditsResult();
    }

    /**
     * Create an instance of {@link RetrieveNodesDetailCriteria }
     * 
     */
    public RetrieveNodesDetailCriteria createRetrieveNodesDetailCriteria() {
        return new RetrieveNodesDetailCriteria();
    }

    /**
     * Create an instance of {@link RetrieveNodesDetailOptions }
     * 
     */
    public RetrieveNodesDetailOptions createRetrieveNodesDetailOptions() {
        return new RetrieveNodesDetailOptions();
    }

    /**
     * Create an instance of {@link RetrieveNodesDetailResults }
     * 
     */
    public RetrieveNodesDetailResults createRetrieveNodesDetailResults() {
        return new RetrieveNodesDetailResults();
    }

    /**
     * Create an instance of {@link UpdateArcsOptions }
     * 
     */
    public UpdateArcsOptions createUpdateArcsOptions() {
        return new UpdateArcsOptions();
    }

    /**
     * Create an instance of {@link UpdateArcsResults }
     * 
     */
    public UpdateArcsResults createUpdateArcsResults() {
        return new UpdateArcsResults();
    }

    /**
     * Create an instance of {@link UpdateNodeCriteria }
     * 
     */
    public UpdateNodeCriteria createUpdateNodeCriteria() {
        return new UpdateNodeCriteria();
    }

    /**
     * Create an instance of {@link ImpasseNode }
     * 
     */
    public ImpasseNode createImpasseNode() {
        return new ImpasseNode();
    }

    /**
     * Create an instance of {@link ArrayOfMapRegionInfoDto }
     * 
     */
    public ArrayOfMapRegionInfoDto createArrayOfMapRegionInfoDto() {
        return new ArrayOfMapRegionInfoDto();
    }

    /**
     * Create an instance of {@link RetrieveArcsCriteria }
     * 
     */
    public RetrieveArcsCriteria createRetrieveArcsCriteria() {
        return new RetrieveArcsCriteria();
    }

    /**
     * Create an instance of {@link RetrieveArcsOptions }
     * 
     */
    public RetrieveArcsOptions createRetrieveArcsOptions() {
        return new RetrieveArcsOptions();
    }

    /**
     * Create an instance of {@link RetrieveArcsResults }
     * 
     */
    public RetrieveArcsResults createRetrieveArcsResults() {
        return new RetrieveArcsResults();
    }

    /**
     * Create an instance of {@link PopulateArcsOptions }
     * 
     */
    public PopulateArcsOptions createPopulateArcsOptions() {
        return new PopulateArcsOptions();
    }

    /**
     * Create an instance of {@link ArrayOfPopulateArcResult }
     * 
     */
    public ArrayOfPopulateArcResult createArrayOfPopulateArcResult() {
        return new ArrayOfPopulateArcResult();
    }

    /**
     * Create an instance of {@link RetrieveMapChangedAreasOptions }
     * 
     */
    public RetrieveMapChangedAreasOptions createRetrieveMapChangedAreasOptions() {
        return new RetrieveMapChangedAreasOptions();
    }

    /**
     * Create an instance of {@link RetrieveMapChangedAreasResults }
     * 
     */
    public RetrieveMapChangedAreasResults createRetrieveMapChangedAreasResults() {
        return new RetrieveMapChangedAreasResults();
    }

    /**
     * Create an instance of {@link RetrieveNodesCriteria }
     * 
     */
    public RetrieveNodesCriteria createRetrieveNodesCriteria() {
        return new RetrieveNodesCriteria();
    }

    /**
     * Create an instance of {@link RetrieveNodesOptions }
     * 
     */
    public RetrieveNodesOptions createRetrieveNodesOptions() {
        return new RetrieveNodesOptions();
    }

    /**
     * Create an instance of {@link RetrieveNodesResults }
     * 
     */
    public RetrieveNodesResults createRetrieveNodesResults() {
        return new RetrieveNodesResults();
    }

    /**
     * Create an instance of {@link ApplyArcUpdatesCriteria }
     * 
     */
    public ApplyArcUpdatesCriteria createApplyArcUpdatesCriteria() {
        return new ApplyArcUpdatesCriteria();
    }

    /**
     * Create an instance of {@link ApplyArcUpdatesOptions }
     * 
     */
    public ApplyArcUpdatesOptions createApplyArcUpdatesOptions() {
        return new ApplyArcUpdatesOptions();
    }

    /**
     * Create an instance of {@link ApplyArcUpdatesResult }
     * 
     */
    public ApplyArcUpdatesResult createApplyArcUpdatesResult() {
        return new ApplyArcUpdatesResult();
    }

    /**
     * Create an instance of {@link GeocodeCriteria }
     * 
     */
    public GeocodeCriteria createGeocodeCriteria() {
        return new GeocodeCriteria();
    }

    /**
     * Create an instance of {@link GeocodeOptions }
     * 
     */
    public GeocodeOptions createGeocodeOptions() {
        return new GeocodeOptions();
    }

    /**
     * Create an instance of {@link RetrieveGeocodeCandidateOptions }
     * 
     */
    public RetrieveGeocodeCandidateOptions createRetrieveGeocodeCandidateOptions() {
        return new RetrieveGeocodeCandidateOptions();
    }

    /**
     * Create an instance of {@link GenerateTravelPathOptions }
     * 
     */
    public GenerateTravelPathOptions createGenerateTravelPathOptions() {
        return new GenerateTravelPathOptions();
    }

    /**
     * Create an instance of {@link ArrayOfRouteShield }
     * 
     */
    public ArrayOfRouteShield createArrayOfRouteShield() {
        return new ArrayOfRouteShield();
    }

    /**
     * Create an instance of {@link CalculateDistanceByJurisdictionOptions }
     * 
     */
    public CalculateDistanceByJurisdictionOptions createCalculateDistanceByJurisdictionOptions() {
        return new CalculateDistanceByJurisdictionOptions();
    }

    /**
     * Create an instance of {@link CalculateDistanceByJurisdictionResult }
     * 
     */
    public CalculateDistanceByJurisdictionResult createCalculateDistanceByJurisdictionResult() {
        return new CalculateDistanceByJurisdictionResult();
    }

    /**
     * Create an instance of {@link RetrieveTravelModelResults }
     * 
     */
    public RetrieveTravelModelResults createRetrieveTravelModelResults() {
        return new RetrieveTravelModelResults();
    }

    /**
     * Create an instance of {@link RetrieveTravelPathsAndPolygonsCriteria }
     * 
     */
    public RetrieveTravelPathsAndPolygonsCriteria createRetrieveTravelPathsAndPolygonsCriteria() {
        return new RetrieveTravelPathsAndPolygonsCriteria();
    }

    /**
     * Create an instance of {@link RetrieveRestrictedPathsAndPolygonsOptions }
     * 
     */
    public RetrieveRestrictedPathsAndPolygonsOptions createRetrieveRestrictedPathsAndPolygonsOptions() {
        return new RetrieveRestrictedPathsAndPolygonsOptions();
    }

    /**
     * Create an instance of {@link RetrieveRestrictedPathsAndPolygonsResults }
     * 
     */
    public RetrieveRestrictedPathsAndPolygonsResults createRetrieveRestrictedPathsAndPolygonsResults() {
        return new RetrieveRestrictedPathsAndPolygonsResults();
    }

    /**
     * Create an instance of {@link UpdateRestrictedPathOptions }
     * 
     */
    public UpdateRestrictedPathOptions createUpdateRestrictedPathOptions() {
        return new UpdateRestrictedPathOptions();
    }

    /**
     * Create an instance of {@link UpdateRestrictedPathResult }
     * 
     */
    public UpdateRestrictedPathResult createUpdateRestrictedPathResult() {
        return new UpdateRestrictedPathResult();
    }

    /**
     * Create an instance of {@link UpdateTravelPolygonOptions }
     * 
     */
    public UpdateTravelPolygonOptions createUpdateTravelPolygonOptions() {
        return new UpdateTravelPolygonOptions();
    }

    /**
     * Create an instance of {@link UpdateTravelPolygonResult }
     * 
     */
    public UpdateTravelPolygonResult createUpdateTravelPolygonResult() {
        return new UpdateTravelPolygonResult();
    }

    /**
     * Create an instance of {@link MapLocalSearchCriteria }
     * 
     */
    public MapLocalSearchCriteria createMapLocalSearchCriteria() {
        return new MapLocalSearchCriteria();
    }

    /**
     * Create an instance of {@link MapLocalSearchOptions }
     * 
     */
    public MapLocalSearchOptions createMapLocalSearchOptions() {
        return new MapLocalSearchOptions();
    }

    /**
     * Create an instance of {@link MapLocalSearchResult }
     * 
     */
    public MapLocalSearchResult createMapLocalSearchResult() {
        return new MapLocalSearchResult();
    }

    /**
     * Create an instance of {@link MapSyncCriteria }
     * 
     */
    public MapSyncCriteria createMapSyncCriteria() {
        return new MapSyncCriteria();
    }

    /**
     * Create an instance of {@link MapSyncOptions }
     * 
     */
    public MapSyncOptions createMapSyncOptions() {
        return new MapSyncOptions();
    }

    /**
     * Create an instance of {@link ClosestPointCriteria }
     * 
     */
    public ClosestPointCriteria createClosestPointCriteria() {
        return new ClosestPointCriteria();
    }

    /**
     * Create an instance of {@link MapNode }
     * 
     */
    public MapNode createMapNode() {
        return new MapNode();
    }

    /**
     * Create an instance of {@link IntersectionNode }
     * 
     */
    public IntersectionNode createIntersectionNode() {
        return new IntersectionNode();
    }

    /**
     * Create an instance of {@link AddressCriteria }
     * 
     */
    public AddressCriteria createAddressCriteria() {
        return new AddressCriteria();
    }

    /**
     * Create an instance of {@link ArrayOfJurisdictionDistance }
     * 
     */
    public ArrayOfJurisdictionDistance createArrayOfJurisdictionDistance() {
        return new ArrayOfJurisdictionDistance();
    }

    /**
     * Create an instance of {@link JurisdictionDistance }
     * 
     */
    public JurisdictionDistance createJurisdictionDistance() {
        return new JurisdictionDistance();
    }

    /**
     * Create an instance of {@link CalculateDistanceByJurisdictionResultPropertyOptions }
     * 
     */
    public CalculateDistanceByJurisdictionResultPropertyOptions createCalculateDistanceByJurisdictionResultPropertyOptions() {
        return new CalculateDistanceByJurisdictionResultPropertyOptions();
    }

    /**
     * Create an instance of {@link JurisdictionDistancePropertyOptions }
     * 
     */
    public JurisdictionDistancePropertyOptions createJurisdictionDistancePropertyOptions() {
        return new JurisdictionDistancePropertyOptions();
    }

    /**
     * Create an instance of {@link MapLocalSearchResultDataPropertyOptions }
     * 
     */
    public MapLocalSearchResultDataPropertyOptions createMapLocalSearchResultDataPropertyOptions() {
        return new MapLocalSearchResultDataPropertyOptions();
    }

    /**
     * Create an instance of {@link MapNodePropertyOptions }
     * 
     */
    public MapNodePropertyOptions createMapNodePropertyOptions() {
        return new MapNodePropertyOptions();
    }

    /**
     * Create an instance of {@link IntersectionNodePropertyOptions }
     * 
     */
    public IntersectionNodePropertyOptions createIntersectionNodePropertyOptions() {
        return new IntersectionNodePropertyOptions();
    }

    /**
     * Create an instance of {@link MapLocalSearchResultData }
     * 
     */
    public MapLocalSearchResultData createMapLocalSearchResultData() {
        return new MapLocalSearchResultData();
    }

    /**
     * Create an instance of {@link NetworkChangedAreas }
     * 
     */
    public NetworkChangedAreas createNetworkChangedAreas() {
        return new NetworkChangedAreas();
    }

    /**
     * Create an instance of {@link NetworkSplitArcInfo }
     * 
     */
    public NetworkSplitArcInfo createNetworkSplitArcInfo() {
        return new NetworkSplitArcInfo();
    }

    /**
     * Create an instance of {@link SpatialCriteria }
     * 
     */
    public SpatialCriteria createSpatialCriteria() {
        return new SpatialCriteria();
    }

    /**
     * Create an instance of {@link RouteShield }
     * 
     */
    public RouteShield createRouteShield() {
        return new RouteShield();
    }

    /**
     * Create an instance of {@link NetworkEditOperation }
     * 
     */
    public NetworkEditOperation createNetworkEditOperation() {
        return new NetworkEditOperation();
    }

    /**
     * Create an instance of {@link ArrayOfNetworkEditRecord }
     * 
     */
    public ArrayOfNetworkEditRecord createArrayOfNetworkEditRecord() {
        return new ArrayOfNetworkEditRecord();
    }

    /**
     * Create an instance of {@link MappingErrorInfo }
     * 
     */
    public MappingErrorInfo createMappingErrorInfo() {
        return new MappingErrorInfo();
    }

    /**
     * Create an instance of {@link ArrayOfNetworkEditOperation }
     * 
     */
    public ArrayOfNetworkEditOperation createArrayOfNetworkEditOperation() {
        return new ArrayOfNetworkEditOperation();
    }

    /**
     * Create an instance of {@link ArrayOfMapNode }
     * 
     */
    public ArrayOfMapNode createArrayOfMapNode() {
        return new ArrayOfMapNode();
    }

    /**
     * Create an instance of {@link ImpasseNodePropertyOptions }
     * 
     */
    public ImpasseNodePropertyOptions createImpasseNodePropertyOptions() {
        return new ImpasseNodePropertyOptions();
    }

    /**
     * Create an instance of {@link ArrayOfRetrieveNodesDetailResult }
     * 
     */
    public ArrayOfRetrieveNodesDetailResult createArrayOfRetrieveNodesDetailResult() {
        return new ArrayOfRetrieveNodesDetailResult();
    }

    /**
     * Create an instance of {@link RetrieveNodesDetailResult }
     * 
     */
    public RetrieveNodesDetailResult createRetrieveNodesDetailResult() {
        return new RetrieveNodesDetailResult();
    }

    /**
     * Create an instance of {@link ArrayOfUpdateArcResult }
     * 
     */
    public ArrayOfUpdateArcResult createArrayOfUpdateArcResult() {
        return new ArrayOfUpdateArcResult();
    }

    /**
     * Create an instance of {@link UpdateArcResult }
     * 
     */
    public UpdateArcResult createUpdateArcResult() {
        return new UpdateArcResult();
    }

    /**
     * Create an instance of {@link ArrayOfNetworkSplitArcInfo }
     * 
     */
    public ArrayOfNetworkSplitArcInfo createArrayOfNetworkSplitArcInfo() {
        return new ArrayOfNetworkSplitArcInfo();
    }

    /**
     * Create an instance of {@link MapRegionInfoDto }
     * 
     */
    public MapRegionInfoDto createMapRegionInfoDto() {
        return new MapRegionInfoDto();
    }

    /**
     * Create an instance of {@link ArrayOfMapBucketInfoDto }
     * 
     */
    public ArrayOfMapBucketInfoDto createArrayOfMapBucketInfoDto() {
        return new ArrayOfMapBucketInfoDto();
    }

    /**
     * Create an instance of {@link MapBucketInfoDto }
     * 
     */
    public MapBucketInfoDto createMapBucketInfoDto() {
        return new MapBucketInfoDto();
    }

    /**
     * Create an instance of {@link PopulateArcResult }
     * 
     */
    public PopulateArcResult createPopulateArcResult() {
        return new PopulateArcResult();
    }

    /**
     * Create an instance of {@link ArrayOfMapLocalSearchResultData }
     * 
     */
    public ArrayOfMapLocalSearchResultData createArrayOfMapLocalSearchResultData() {
        return new ArrayOfMapLocalSearchResultData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClosestPointCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ClosestPointCriteria")
    public JAXBElement<ClosestPointCriteria> createClosestPointCriteria(ClosestPointCriteria value) {
        return new JAXBElement<ClosestPointCriteria>(_ClosestPointCriteria_QNAME, ClosestPointCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapNodeTypeFlags")
    public JAXBElement<List<String>> createMapNodeTypeFlags(List<String> value) {
        return new JAXBElement<List<String>>(_MapNodeTypeFlags_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapSyncEditType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapSyncEditType")
    public JAXBElement<MapSyncEditType> createMapSyncEditType(MapSyncEditType value) {
        return new JAXBElement<MapSyncEditType>(_MapSyncEditType_QNAME, MapSyncEditType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapSyncRoadClassMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapSyncRoadClassMode")
    public JAXBElement<MapSyncRoadClassMode> createMapSyncRoadClassMode(MapSyncRoadClassMode value) {
        return new JAXBElement<MapSyncRoadClassMode>(_MapSyncRoadClassMode_QNAME, MapSyncRoadClassMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapSyncRoadClassOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapSyncRoadClassOperation")
    public JAXBElement<MapSyncRoadClassOperation> createMapSyncRoadClassOperation(MapSyncRoadClassOperation value) {
        return new JAXBElement<MapSyncRoadClassOperation>(_MapSyncRoadClassOperation_QNAME, MapSyncRoadClassOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapSyncRoadClassLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapSyncRoadClassLevel")
    public JAXBElement<MapSyncRoadClassLevel> createMapSyncRoadClassLevel(MapSyncRoadClassLevel value) {
        return new JAXBElement<MapSyncRoadClassLevel>(_MapSyncRoadClassLevel_QNAME, MapSyncRoadClassLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkArcPropertyFlags")
    public JAXBElement<List<String>> createNetworkArcPropertyFlags(List<String> value) {
        return new JAXBElement<List<String>>(_NetworkArcPropertyFlags_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkEditAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkEditAction")
    public JAXBElement<NetworkEditAction> createNetworkEditAction(NetworkEditAction value) {
        return new JAXBElement<NetworkEditAction>(_NetworkEditAction_QNAME, NetworkEditAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkEditOperationStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkEditOperationStatus")
    public JAXBElement<NetworkEditOperationStatus> createNetworkEditOperationStatus(NetworkEditOperationStatus value) {
        return new JAXBElement<NetworkEditOperationStatus>(_NetworkEditOperationStatus_QNAME, NetworkEditOperationStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkEditOperationStatusFlags")
    public JAXBElement<List<String>> createNetworkEditOperationStatusFlags(List<String> value) {
        return new JAXBElement<List<String>>(_NetworkEditOperationStatusFlags_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkEditOperationSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkEditOperationSource")
    public JAXBElement<NetworkEditOperationSource> createNetworkEditOperationSource(NetworkEditOperationSource value) {
        return new JAXBElement<NetworkEditOperationSource>(_NetworkEditOperationSource_QNAME, NetworkEditOperationSource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkSpatialItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkSpatialItemType")
    public JAXBElement<NetworkSpatialItemType> createNetworkSpatialItemType(NetworkSpatialItemType value) {
        return new JAXBElement<NetworkSpatialItemType>(_NetworkSpatialItemType_QNAME, NetworkSpatialItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapNode")
    public JAXBElement<MapNode> createMapNode(MapNode value) {
        return new JAXBElement<MapNode>(_MapNode_QNAME, MapNode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImpasseNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ImpasseNode")
    public JAXBElement<ImpasseNode> createImpasseNode(ImpasseNode value) {
        return new JAXBElement<ImpasseNode>(_ImpasseNode_QNAME, ImpasseNode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntersectionNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "IntersectionNode")
    public JAXBElement<IntersectionNode> createIntersectionNode(IntersectionNode value) {
        return new JAXBElement<IntersectionNode>(_IntersectionNode_QNAME, IntersectionNode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "AddressCriteria")
    public JAXBElement<AddressCriteria> createAddressCriteria(AddressCriteria value) {
        return new JAXBElement<AddressCriteria>(_AddressCriteria_QNAME, AddressCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateDistanceByJurisdictionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "CalculateDistanceByJurisdictionResult")
    public JAXBElement<CalculateDistanceByJurisdictionResult> createCalculateDistanceByJurisdictionResult(CalculateDistanceByJurisdictionResult value) {
        return new JAXBElement<CalculateDistanceByJurisdictionResult>(_CalculateDistanceByJurisdictionResult_QNAME, CalculateDistanceByJurisdictionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfJurisdictionDistance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ArrayOfJurisdictionDistance")
    public JAXBElement<ArrayOfJurisdictionDistance> createArrayOfJurisdictionDistance(ArrayOfJurisdictionDistance value) {
        return new JAXBElement<ArrayOfJurisdictionDistance>(_ArrayOfJurisdictionDistance_QNAME, ArrayOfJurisdictionDistance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JurisdictionDistance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "JurisdictionDistance")
    public JAXBElement<JurisdictionDistance> createJurisdictionDistance(JurisdictionDistance value) {
        return new JAXBElement<JurisdictionDistance>(_JurisdictionDistance_QNAME, JurisdictionDistance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodeOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "GeocodeOptions")
    public JAXBElement<GeocodeOptions> createGeocodeOptions(GeocodeOptions value) {
        return new JAXBElement<GeocodeOptions>(_GeocodeOptions_QNAME, GeocodeOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateDistanceByJurisdictionResultPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "CalculateDistanceByJurisdictionResultPropertyOptions")
    public JAXBElement<CalculateDistanceByJurisdictionResultPropertyOptions> createCalculateDistanceByJurisdictionResultPropertyOptions(CalculateDistanceByJurisdictionResultPropertyOptions value) {
        return new JAXBElement<CalculateDistanceByJurisdictionResultPropertyOptions>(_CalculateDistanceByJurisdictionResultPropertyOptions_QNAME, CalculateDistanceByJurisdictionResultPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JurisdictionDistancePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "JurisdictionDistancePropertyOptions")
    public JAXBElement<JurisdictionDistancePropertyOptions> createJurisdictionDistancePropertyOptions(JurisdictionDistancePropertyOptions value) {
        return new JAXBElement<JurisdictionDistancePropertyOptions>(_JurisdictionDistancePropertyOptions_QNAME, JurisdictionDistancePropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapLocalSearchResultDataPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapLocalSearchResultDataPropertyOptions")
    public JAXBElement<MapLocalSearchResultDataPropertyOptions> createMapLocalSearchResultDataPropertyOptions(MapLocalSearchResultDataPropertyOptions value) {
        return new JAXBElement<MapLocalSearchResultDataPropertyOptions>(_MapLocalSearchResultDataPropertyOptions_QNAME, MapLocalSearchResultDataPropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapNodePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapNodePropertyOptions")
    public JAXBElement<MapNodePropertyOptions> createMapNodePropertyOptions(MapNodePropertyOptions value) {
        return new JAXBElement<MapNodePropertyOptions>(_MapNodePropertyOptions_QNAME, MapNodePropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntersectionNodePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "IntersectionNodePropertyOptions")
    public JAXBElement<IntersectionNodePropertyOptions> createIntersectionNodePropertyOptions(IntersectionNodePropertyOptions value) {
        return new JAXBElement<IntersectionNodePropertyOptions>(_IntersectionNodePropertyOptions_QNAME, IntersectionNodePropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapLocalSearchCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapLocalSearchCriteria")
    public JAXBElement<MapLocalSearchCriteria> createMapLocalSearchCriteria(MapLocalSearchCriteria value) {
        return new JAXBElement<MapLocalSearchCriteria>(_MapLocalSearchCriteria_QNAME, MapLocalSearchCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapLocalSearchResultData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapLocalSearchResultData")
    public JAXBElement<MapLocalSearchResultData> createMapLocalSearchResultData(MapLocalSearchResultData value) {
        return new JAXBElement<MapLocalSearchResultData>(_MapLocalSearchResultData_QNAME, MapLocalSearchResultData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkChangedAreas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkChangedAreas")
    public JAXBElement<NetworkChangedAreas> createNetworkChangedAreas(NetworkChangedAreas value) {
        return new JAXBElement<NetworkChangedAreas>(_NetworkChangedAreas_QNAME, NetworkChangedAreas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkSplitArcInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkSplitArcInfo")
    public JAXBElement<NetworkSplitArcInfo> createNetworkSplitArcInfo(NetworkSplitArcInfo value) {
        return new JAXBElement<NetworkSplitArcInfo>(_NetworkSplitArcInfo_QNAME, NetworkSplitArcInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveArcsCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveArcsCriteria")
    public JAXBElement<RetrieveArcsCriteria> createRetrieveArcsCriteria(RetrieveArcsCriteria value) {
        return new JAXBElement<RetrieveArcsCriteria>(_RetrieveArcsCriteria_QNAME, RetrieveArcsCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpatialCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "SpatialCriteria")
    public JAXBElement<SpatialCriteria> createSpatialCriteria(SpatialCriteria value) {
        return new JAXBElement<SpatialCriteria>(_SpatialCriteria_QNAME, SpatialCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDeltaMapEditsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveDeltaMapEditsResult")
    public JAXBElement<RetrieveDeltaMapEditsResult> createRetrieveDeltaMapEditsResult(RetrieveDeltaMapEditsResult value) {
        return new JAXBElement<RetrieveDeltaMapEditsResult>(_RetrieveDeltaMapEditsResult_QNAME, RetrieveDeltaMapEditsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEditOperationsCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveEditOperationsCriteria")
    public JAXBElement<RetrieveEditOperationsCriteria> createRetrieveEditOperationsCriteria(RetrieveEditOperationsCriteria value) {
        return new JAXBElement<RetrieveEditOperationsCriteria>(_RetrieveEditOperationsCriteria_QNAME, RetrieveEditOperationsCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveFullMapEditsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveFullMapEditsResult")
    public JAXBElement<RetrieveFullMapEditsResult> createRetrieveFullMapEditsResult(RetrieveFullMapEditsResult value) {
        return new JAXBElement<RetrieveFullMapEditsResult>(_RetrieveFullMapEditsResult_QNAME, RetrieveFullMapEditsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveGeocodeCandidateOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveGeocodeCandidateOptions")
    public JAXBElement<RetrieveGeocodeCandidateOptions> createRetrieveGeocodeCandidateOptions(RetrieveGeocodeCandidateOptions value) {
        return new JAXBElement<RetrieveGeocodeCandidateOptions>(_RetrieveGeocodeCandidateOptions_QNAME, RetrieveGeocodeCandidateOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveNodesCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveNodesCriteria")
    public JAXBElement<RetrieveNodesCriteria> createRetrieveNodesCriteria(RetrieveNodesCriteria value) {
        return new JAXBElement<RetrieveNodesCriteria>(_RetrieveNodesCriteria_QNAME, RetrieveNodesCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveTravelPathsAndPolygonsCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveTravelPathsAndPolygonsCriteria")
    public JAXBElement<RetrieveTravelPathsAndPolygonsCriteria> createRetrieveTravelPathsAndPolygonsCriteria(RetrieveTravelPathsAndPolygonsCriteria value) {
        return new JAXBElement<RetrieveTravelPathsAndPolygonsCriteria>(_RetrieveTravelPathsAndPolygonsCriteria_QNAME, RetrieveTravelPathsAndPolygonsCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteShield }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RouteShield")
    public JAXBElement<RouteShield> createRouteShield(RouteShield value) {
        return new JAXBElement<RouteShield>(_RouteShield_QNAME, RouteShield.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkEditOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkEditOperation")
    public JAXBElement<NetworkEditOperation> createNetworkEditOperation(NetworkEditOperation value) {
        return new JAXBElement<NetworkEditOperation>(_NetworkEditOperation_QNAME, NetworkEditOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNetworkEditRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ArrayOfNetworkEditRecord")
    public JAXBElement<ArrayOfNetworkEditRecord> createArrayOfNetworkEditRecord(ArrayOfNetworkEditRecord value) {
        return new JAXBElement<ArrayOfNetworkEditRecord>(_ArrayOfNetworkEditRecord_QNAME, ArrayOfNetworkEditRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkEditRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkEditRecord")
    public JAXBElement<NetworkEditRecord> createNetworkEditRecord(NetworkEditRecord value) {
        return new JAXBElement<NetworkEditRecord>(_NetworkEditRecord_QNAME, NetworkEditRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEditOperationsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveEditOperationsOptions")
    public JAXBElement<RetrieveEditOperationsOptions> createRetrieveEditOperationsOptions(RetrieveEditOperationsOptions value) {
        return new JAXBElement<RetrieveEditOperationsOptions>(_RetrieveEditOperationsOptions_QNAME, RetrieveEditOperationsOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEditOperationsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveEditOperationsResult")
    public JAXBElement<RetrieveEditOperationsResult> createRetrieveEditOperationsResult(RetrieveEditOperationsResult value) {
        return new JAXBElement<RetrieveEditOperationsResult>(_RetrieveEditOperationsResult_QNAME, RetrieveEditOperationsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MappingErrorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MappingErrorInfo")
    public JAXBElement<MappingErrorInfo> createMappingErrorInfo(MappingErrorInfo value) {
        return new JAXBElement<MappingErrorInfo>(_MappingErrorInfo_QNAME, MappingErrorInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNetworkEditOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ArrayOfNetworkEditOperation")
    public JAXBElement<ArrayOfNetworkEditOperation> createArrayOfNetworkEditOperation(ArrayOfNetworkEditOperation value) {
        return new JAXBElement<ArrayOfNetworkEditOperation>(_ArrayOfNetworkEditOperation_QNAME, ArrayOfNetworkEditOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessCommunityEditRequestArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ProcessCommunityEditRequestArgs")
    public JAXBElement<ProcessCommunityEditRequestArgs> createProcessCommunityEditRequestArgs(ProcessCommunityEditRequestArgs value) {
        return new JAXBElement<ProcessCommunityEditRequestArgs>(_ProcessCommunityEditRequestArgs_QNAME, ProcessCommunityEditRequestArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessCommunityEditRequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ProcessCommunityEditRequestResult")
    public JAXBElement<ProcessCommunityEditRequestResult> createProcessCommunityEditRequestResult(ProcessCommunityEditRequestResult value) {
        return new JAXBElement<ProcessCommunityEditRequestResult>(_ProcessCommunityEditRequestResult_QNAME, ProcessCommunityEditRequestResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMapInfoResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveMapInfoResult")
    public JAXBElement<RetrieveMapInfoResult> createRetrieveMapInfoResult(RetrieveMapInfoResult value) {
        return new JAXBElement<RetrieveMapInfoResult>(_RetrieveMapInfoResult_QNAME, RetrieveMapInfoResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveNodesDetailCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveNodesDetailCriteria")
    public JAXBElement<RetrieveNodesDetailCriteria> createRetrieveNodesDetailCriteria(RetrieveNodesDetailCriteria value) {
        return new JAXBElement<RetrieveNodesDetailCriteria>(_RetrieveNodesDetailCriteria_QNAME, RetrieveNodesDetailCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMapNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ArrayOfMapNode")
    public JAXBElement<ArrayOfMapNode> createArrayOfMapNode(ArrayOfMapNode value) {
        return new JAXBElement<ArrayOfMapNode>(_ArrayOfMapNode_QNAME, ArrayOfMapNode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveNodesDetailOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveNodesDetailOptions")
    public JAXBElement<RetrieveNodesDetailOptions> createRetrieveNodesDetailOptions(RetrieveNodesDetailOptions value) {
        return new JAXBElement<RetrieveNodesDetailOptions>(_RetrieveNodesDetailOptions_QNAME, RetrieveNodesDetailOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImpasseNodePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ImpasseNodePropertyOptions")
    public JAXBElement<ImpasseNodePropertyOptions> createImpasseNodePropertyOptions(ImpasseNodePropertyOptions value) {
        return new JAXBElement<ImpasseNodePropertyOptions>(_ImpasseNodePropertyOptions_QNAME, ImpasseNodePropertyOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveNodesDetailResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveNodesDetailResults")
    public JAXBElement<RetrieveNodesDetailResults> createRetrieveNodesDetailResults(RetrieveNodesDetailResults value) {
        return new JAXBElement<RetrieveNodesDetailResults>(_RetrieveNodesDetailResults_QNAME, RetrieveNodesDetailResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRetrieveNodesDetailResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ArrayOfRetrieveNodesDetailResult")
    public JAXBElement<ArrayOfRetrieveNodesDetailResult> createArrayOfRetrieveNodesDetailResult(ArrayOfRetrieveNodesDetailResult value) {
        return new JAXBElement<ArrayOfRetrieveNodesDetailResult>(_ArrayOfRetrieveNodesDetailResult_QNAME, ArrayOfRetrieveNodesDetailResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveNodesDetailResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveNodesDetailResult")
    public JAXBElement<RetrieveNodesDetailResult> createRetrieveNodesDetailResult(RetrieveNodesDetailResult value) {
        return new JAXBElement<RetrieveNodesDetailResult>(_RetrieveNodesDetailResult_QNAME, RetrieveNodesDetailResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateArcsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "UpdateArcsOptions")
    public JAXBElement<UpdateArcsOptions> createUpdateArcsOptions(UpdateArcsOptions value) {
        return new JAXBElement<UpdateArcsOptions>(_UpdateArcsOptions_QNAME, UpdateArcsOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateArcsResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "UpdateArcsResults")
    public JAXBElement<UpdateArcsResults> createUpdateArcsResults(UpdateArcsResults value) {
        return new JAXBElement<UpdateArcsResults>(_UpdateArcsResults_QNAME, UpdateArcsResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUpdateArcResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ArrayOfUpdateArcResult")
    public JAXBElement<ArrayOfUpdateArcResult> createArrayOfUpdateArcResult(ArrayOfUpdateArcResult value) {
        return new JAXBElement<ArrayOfUpdateArcResult>(_ArrayOfUpdateArcResult_QNAME, ArrayOfUpdateArcResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateArcResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "UpdateArcResult")
    public JAXBElement<UpdateArcResult> createUpdateArcResult(UpdateArcResult value) {
        return new JAXBElement<UpdateArcResult>(_UpdateArcResult_QNAME, UpdateArcResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNetworkSplitArcInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ArrayOfNetworkSplitArcInfo")
    public JAXBElement<ArrayOfNetworkSplitArcInfo> createArrayOfNetworkSplitArcInfo(ArrayOfNetworkSplitArcInfo value) {
        return new JAXBElement<ArrayOfNetworkSplitArcInfo>(_ArrayOfNetworkSplitArcInfo_QNAME, ArrayOfNetworkSplitArcInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNodeCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "UpdateNodeCriteria")
    public JAXBElement<UpdateNodeCriteria> createUpdateNodeCriteria(UpdateNodeCriteria value) {
        return new JAXBElement<UpdateNodeCriteria>(_UpdateNodeCriteria_QNAME, UpdateNodeCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMapRegionInfoDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ArrayOfMapRegionInfoDto")
    public JAXBElement<ArrayOfMapRegionInfoDto> createArrayOfMapRegionInfoDto(ArrayOfMapRegionInfoDto value) {
        return new JAXBElement<ArrayOfMapRegionInfoDto>(_ArrayOfMapRegionInfoDto_QNAME, ArrayOfMapRegionInfoDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapRegionInfoDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapRegionInfoDto")
    public JAXBElement<MapRegionInfoDto> createMapRegionInfoDto(MapRegionInfoDto value) {
        return new JAXBElement<MapRegionInfoDto>(_MapRegionInfoDto_QNAME, MapRegionInfoDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMapBucketInfoDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ArrayOfMapBucketInfoDto")
    public JAXBElement<ArrayOfMapBucketInfoDto> createArrayOfMapBucketInfoDto(ArrayOfMapBucketInfoDto value) {
        return new JAXBElement<ArrayOfMapBucketInfoDto>(_ArrayOfMapBucketInfoDto_QNAME, ArrayOfMapBucketInfoDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapBucketInfoDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapBucketInfoDto")
    public JAXBElement<MapBucketInfoDto> createMapBucketInfoDto(MapBucketInfoDto value) {
        return new JAXBElement<MapBucketInfoDto>(_MapBucketInfoDto_QNAME, MapBucketInfoDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveArcsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveArcsOptions")
    public JAXBElement<RetrieveArcsOptions> createRetrieveArcsOptions(RetrieveArcsOptions value) {
        return new JAXBElement<RetrieveArcsOptions>(_RetrieveArcsOptions_QNAME, RetrieveArcsOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveArcsResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveArcsResults")
    public JAXBElement<RetrieveArcsResults> createRetrieveArcsResults(RetrieveArcsResults value) {
        return new JAXBElement<RetrieveArcsResults>(_RetrieveArcsResults_QNAME, RetrieveArcsResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PopulateArcsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "PopulateArcsOptions")
    public JAXBElement<PopulateArcsOptions> createPopulateArcsOptions(PopulateArcsOptions value) {
        return new JAXBElement<PopulateArcsOptions>(_PopulateArcsOptions_QNAME, PopulateArcsOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPopulateArcResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ArrayOfPopulateArcResult")
    public JAXBElement<ArrayOfPopulateArcResult> createArrayOfPopulateArcResult(ArrayOfPopulateArcResult value) {
        return new JAXBElement<ArrayOfPopulateArcResult>(_ArrayOfPopulateArcResult_QNAME, ArrayOfPopulateArcResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PopulateArcResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "PopulateArcResult")
    public JAXBElement<PopulateArcResult> createPopulateArcResult(PopulateArcResult value) {
        return new JAXBElement<PopulateArcResult>(_PopulateArcResult_QNAME, PopulateArcResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMapChangedAreasOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveMapChangedAreasOptions")
    public JAXBElement<RetrieveMapChangedAreasOptions> createRetrieveMapChangedAreasOptions(RetrieveMapChangedAreasOptions value) {
        return new JAXBElement<RetrieveMapChangedAreasOptions>(_RetrieveMapChangedAreasOptions_QNAME, RetrieveMapChangedAreasOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveMapChangedAreasResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveMapChangedAreasResults")
    public JAXBElement<RetrieveMapChangedAreasResults> createRetrieveMapChangedAreasResults(RetrieveMapChangedAreasResults value) {
        return new JAXBElement<RetrieveMapChangedAreasResults>(_RetrieveMapChangedAreasResults_QNAME, RetrieveMapChangedAreasResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveNodesOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveNodesOptions")
    public JAXBElement<RetrieveNodesOptions> createRetrieveNodesOptions(RetrieveNodesOptions value) {
        return new JAXBElement<RetrieveNodesOptions>(_RetrieveNodesOptions_QNAME, RetrieveNodesOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveNodesResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveNodesResults")
    public JAXBElement<RetrieveNodesResults> createRetrieveNodesResults(RetrieveNodesResults value) {
        return new JAXBElement<RetrieveNodesResults>(_RetrieveNodesResults_QNAME, RetrieveNodesResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplyArcUpdatesCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ApplyArcUpdatesCriteria")
    public JAXBElement<ApplyArcUpdatesCriteria> createApplyArcUpdatesCriteria(ApplyArcUpdatesCriteria value) {
        return new JAXBElement<ApplyArcUpdatesCriteria>(_ApplyArcUpdatesCriteria_QNAME, ApplyArcUpdatesCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplyArcUpdatesOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ApplyArcUpdatesOptions")
    public JAXBElement<ApplyArcUpdatesOptions> createApplyArcUpdatesOptions(ApplyArcUpdatesOptions value) {
        return new JAXBElement<ApplyArcUpdatesOptions>(_ApplyArcUpdatesOptions_QNAME, ApplyArcUpdatesOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplyArcUpdatesResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ApplyArcUpdatesResult")
    public JAXBElement<ApplyArcUpdatesResult> createApplyArcUpdatesResult(ApplyArcUpdatesResult value) {
        return new JAXBElement<ApplyArcUpdatesResult>(_ApplyArcUpdatesResult_QNAME, ApplyArcUpdatesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodeCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "GeocodeCriteria")
    public JAXBElement<GeocodeCriteria> createGeocodeCriteria(GeocodeCriteria value) {
        return new JAXBElement<GeocodeCriteria>(_GeocodeCriteria_QNAME, GeocodeCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateTravelPathOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "GenerateTravelPathOptions")
    public JAXBElement<GenerateTravelPathOptions> createGenerateTravelPathOptions(GenerateTravelPathOptions value) {
        return new JAXBElement<GenerateTravelPathOptions>(_GenerateTravelPathOptions_QNAME, GenerateTravelPathOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteShield }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ArrayOfRouteShield")
    public JAXBElement<ArrayOfRouteShield> createArrayOfRouteShield(ArrayOfRouteShield value) {
        return new JAXBElement<ArrayOfRouteShield>(_ArrayOfRouteShield_QNAME, ArrayOfRouteShield.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateDistanceByJurisdictionOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "CalculateDistanceByJurisdictionOptions")
    public JAXBElement<CalculateDistanceByJurisdictionOptions> createCalculateDistanceByJurisdictionOptions(CalculateDistanceByJurisdictionOptions value) {
        return new JAXBElement<CalculateDistanceByJurisdictionOptions>(_CalculateDistanceByJurisdictionOptions_QNAME, CalculateDistanceByJurisdictionOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveTravelModelResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveTravelModelResults")
    public JAXBElement<RetrieveTravelModelResults> createRetrieveTravelModelResults(RetrieveTravelModelResults value) {
        return new JAXBElement<RetrieveTravelModelResults>(_RetrieveTravelModelResults_QNAME, RetrieveTravelModelResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveRestrictedPathsAndPolygonsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveRestrictedPathsAndPolygonsOptions")
    public JAXBElement<RetrieveRestrictedPathsAndPolygonsOptions> createRetrieveRestrictedPathsAndPolygonsOptions(RetrieveRestrictedPathsAndPolygonsOptions value) {
        return new JAXBElement<RetrieveRestrictedPathsAndPolygonsOptions>(_RetrieveRestrictedPathsAndPolygonsOptions_QNAME, RetrieveRestrictedPathsAndPolygonsOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveRestrictedPathsAndPolygonsResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RetrieveRestrictedPathsAndPolygonsResults")
    public JAXBElement<RetrieveRestrictedPathsAndPolygonsResults> createRetrieveRestrictedPathsAndPolygonsResults(RetrieveRestrictedPathsAndPolygonsResults value) {
        return new JAXBElement<RetrieveRestrictedPathsAndPolygonsResults>(_RetrieveRestrictedPathsAndPolygonsResults_QNAME, RetrieveRestrictedPathsAndPolygonsResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRestrictedPathOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "UpdateRestrictedPathOptions")
    public JAXBElement<UpdateRestrictedPathOptions> createUpdateRestrictedPathOptions(UpdateRestrictedPathOptions value) {
        return new JAXBElement<UpdateRestrictedPathOptions>(_UpdateRestrictedPathOptions_QNAME, UpdateRestrictedPathOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRestrictedPathResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "UpdateRestrictedPathResult")
    public JAXBElement<UpdateRestrictedPathResult> createUpdateRestrictedPathResult(UpdateRestrictedPathResult value) {
        return new JAXBElement<UpdateRestrictedPathResult>(_UpdateRestrictedPathResult_QNAME, UpdateRestrictedPathResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTravelPolygonOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "UpdateTravelPolygonOptions")
    public JAXBElement<UpdateTravelPolygonOptions> createUpdateTravelPolygonOptions(UpdateTravelPolygonOptions value) {
        return new JAXBElement<UpdateTravelPolygonOptions>(_UpdateTravelPolygonOptions_QNAME, UpdateTravelPolygonOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTravelPolygonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "UpdateTravelPolygonResult")
    public JAXBElement<UpdateTravelPolygonResult> createUpdateTravelPolygonResult(UpdateTravelPolygonResult value) {
        return new JAXBElement<UpdateTravelPolygonResult>(_UpdateTravelPolygonResult_QNAME, UpdateTravelPolygonResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapLocalSearchOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapLocalSearchOptions")
    public JAXBElement<MapLocalSearchOptions> createMapLocalSearchOptions(MapLocalSearchOptions value) {
        return new JAXBElement<MapLocalSearchOptions>(_MapLocalSearchOptions_QNAME, MapLocalSearchOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapLocalSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapLocalSearchResult")
    public JAXBElement<MapLocalSearchResult> createMapLocalSearchResult(MapLocalSearchResult value) {
        return new JAXBElement<MapLocalSearchResult>(_MapLocalSearchResult_QNAME, MapLocalSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapLocalSearchResultErrorCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapLocalSearchResult.ErrorCode")
    public JAXBElement<MapLocalSearchResultErrorCode> createMapLocalSearchResultErrorCode(MapLocalSearchResultErrorCode value) {
        return new JAXBElement<MapLocalSearchResultErrorCode>(_MapLocalSearchResultErrorCode_QNAME, MapLocalSearchResultErrorCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMapLocalSearchResultData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ArrayOfMapLocalSearchResultData")
    public JAXBElement<ArrayOfMapLocalSearchResultData> createArrayOfMapLocalSearchResultData(ArrayOfMapLocalSearchResultData value) {
        return new JAXBElement<ArrayOfMapLocalSearchResultData>(_ArrayOfMapLocalSearchResultData_QNAME, ArrayOfMapLocalSearchResultData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapSyncCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapSyncCriteria")
    public JAXBElement<MapSyncCriteria> createMapSyncCriteria(MapSyncCriteria value) {
        return new JAXBElement<MapSyncCriteria>(_MapSyncCriteria_QNAME, MapSyncCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapSyncOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapSyncOptions")
    public JAXBElement<MapSyncOptions> createMapSyncOptions(MapSyncOptions value) {
        return new JAXBElement<MapSyncOptions>(_MapSyncOptions_QNAME, MapSyncOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkArc", scope = PopulateArcResult.class)
    public JAXBElement<NetworkArc> createPopulateArcResultNetworkArc(NetworkArc value) {
        return new JAXBElement<NetworkArc>(_PopulateArcResultNetworkArc_QNAME, NetworkArc.class, PopulateArcResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Filename", scope = MapBucketInfoDto.class)
    public JAXBElement<String> createMapBucketInfoDtoFilename(String value) {
        return new JAXBElement<String>(_MapBucketInfoDtoFilename_QNAME, String.class, MapBucketInfoDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Description", scope = MapRegionInfoDto.class)
    public JAXBElement<String> createMapRegionInfoDtoDescription(String value) {
        return new JAXBElement<String>(_MapRegionInfoDtoDescription_QNAME, String.class, MapRegionInfoDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMapBucketInfoDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapBuckets", scope = MapRegionInfoDto.class)
    public JAXBElement<ArrayOfMapBucketInfoDto> createMapRegionInfoDtoMapBuckets(ArrayOfMapBucketInfoDto value) {
        return new JAXBElement<ArrayOfMapBucketInfoDto>(_MapRegionInfoDtoMapBuckets_QNAME, ArrayOfMapBucketInfoDto.class, MapRegionInfoDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MappingErrorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ErrorInfo", scope = UpdateArcResult.class)
    public JAXBElement<MappingErrorInfo> createUpdateArcResultErrorInfo(MappingErrorInfo value) {
        return new JAXBElement<MappingErrorInfo>(_UpdateArcResultErrorInfo_QNAME, MappingErrorInfo.class, UpdateArcResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNetworkSplitArcInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "SplitArcsInfo", scope = UpdateArcResult.class)
    public JAXBElement<ArrayOfNetworkSplitArcInfo> createUpdateArcResultSplitArcsInfo(ArrayOfNetworkSplitArcInfo value) {
        return new JAXBElement<ArrayOfNetworkSplitArcInfo>(_UpdateArcResultSplitArcsInfo_QNAME, ArrayOfNetworkSplitArcInfo.class, UpdateArcResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "UpdatedNetworkArc", scope = UpdateArcResult.class)
    public JAXBElement<NetworkArc> createUpdateArcResultUpdatedNetworkArc(NetworkArc value) {
        return new JAXBElement<NetworkArc>(_UpdateArcResultUpdatedNetworkArc_QNAME, NetworkArc.class, UpdateArcResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "mapNode", scope = RetrieveNodesDetailResult.class)
    public JAXBElement<MapNode> createRetrieveNodesDetailResultMapNode(MapNode value) {
        return new JAXBElement<MapNode>(_RetrieveNodesDetailResultMapNode_QNAME, MapNode.class, RetrieveNodesDetailResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkArcPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "AttachedArcsOptions", scope = MapNodePropertyOptions.class)
    public JAXBElement<NetworkArcPropertyOptions> createMapNodePropertyOptionsAttachedArcsOptions(NetworkArcPropertyOptions value) {
        return new JAXBElement<NetworkArcPropertyOptions>(_MapNodePropertyOptionsAttachedArcsOptions_QNAME, NetworkArcPropertyOptions.class, MapNodePropertyOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfValidationFailure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ValidationFailures", scope = MappingErrorInfo.class)
    public JAXBElement<ArrayOfValidationFailure> createMappingErrorInfoValidationFailures(ArrayOfValidationFailure value) {
        return new JAXBElement<ArrayOfValidationFailure>(_MappingErrorInfoValidationFailures_QNAME, ArrayOfValidationFailure.class, MappingErrorInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Comment", scope = NetworkEditOperation.class)
    public JAXBElement<String> createNetworkEditOperationComment(String value) {
        return new JAXBElement<String>(_NetworkEditOperationComment_QNAME, String.class, NetworkEditOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNetworkEditRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "EditRecords", scope = NetworkEditOperation.class)
    public JAXBElement<ArrayOfNetworkEditRecord> createNetworkEditOperationEditRecords(ArrayOfNetworkEditRecord value) {
        return new JAXBElement<ArrayOfNetworkEditRecord>(_NetworkEditOperationEditRecords_QNAME, ArrayOfNetworkEditRecord.class, NetworkEditOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkArcPropertyFlags_ChangedProperties", scope = NetworkEditOperation.class)
    public JAXBElement<String> createNetworkEditOperationNetworkArcPropertyFlagsChangedProperties(String value) {
        return new JAXBElement<String>(_NetworkEditOperationNetworkArcPropertyFlagsChangedProperties_QNAME, String.class, NetworkEditOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkEditOperationStatus_Status", scope = NetworkEditOperation.class)
    public JAXBElement<String> createNetworkEditOperationNetworkEditOperationStatusStatus(String value) {
        return new JAXBElement<String>(_NetworkEditOperationNetworkEditOperationStatusStatus_QNAME, String.class, NetworkEditOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "CountryISO3Abbr", scope = RouteShield.class)
    public JAXBElement<String> createRouteShieldCountryISO3Abbr(String value) {
        return new JAXBElement<String>(_RouteShieldCountryISO3Abbr_QNAME, String.class, RouteShield.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Description", scope = RouteShield.class)
    public JAXBElement<String> createRouteShieldDescription(String value) {
        return new JAXBElement<String>(_MapRegionInfoDtoDescription_QNAME, String.class, RouteShield.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "GuiBitmap", scope = RouteShield.class)
    public JAXBElement<byte[]> createRouteShieldGuiBitmap(byte[] value) {
        return new JAXBElement<byte[]>(_RouteShieldGuiBitmap_QNAME, byte[].class, RouteShield.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RegionName", scope = RouteShield.class)
    public JAXBElement<String> createRouteShieldRegionName(String value) {
        return new JAXBElement<String>(_RouteShieldRegionName_QNAME, String.class, RouteShield.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClosestPointCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ClosestPointCriteria", scope = SpatialCriteria.class)
    public JAXBElement<ClosestPointCriteria> createSpatialCriteriaClosestPointCriteria(ClosestPointCriteria value) {
        return new JAXBElement<ClosestPointCriteria>(_ClosestPointCriteria_QNAME, ClosestPointCriteria.class, SpatialCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Viewport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Viewport", scope = SpatialCriteria.class)
    public JAXBElement<Viewport> createSpatialCriteriaViewport(Viewport value) {
        return new JAXBElement<Viewport>(_SpatialCriteriaViewport_QNAME, Viewport.class, SpatialCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkInstanceID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "OldInstanceID", scope = NetworkSplitArcInfo.class)
    public JAXBElement<NetworkInstanceID> createNetworkSplitArcInfoOldInstanceID(NetworkInstanceID value) {
        return new JAXBElement<NetworkInstanceID>(_NetworkSplitArcInfoOldInstanceID_QNAME, NetworkInstanceID.class, NetworkSplitArcInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "SplitArc", scope = NetworkSplitArcInfo.class)
    public JAXBElement<NetworkArc> createNetworkSplitArcInfoSplitArc(NetworkArc value) {
        return new JAXBElement<NetworkArc>(_NetworkSplitArcInfoSplitArc_QNAME, NetworkArc.class, NetworkSplitArcInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfViewport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ChangedAreas", scope = NetworkChangedAreas.class)
    public JAXBElement<ArrayOfViewport> createNetworkChangedAreasChangedAreas(ArrayOfViewport value) {
        return new JAXBElement<ArrayOfViewport>(_NetworkChangedAreasChangedAreas_QNAME, ArrayOfViewport.class, NetworkChangedAreas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "LastChangedAreaEditTime", scope = NetworkChangedAreas.class)
    public JAXBElement<XMLGregorianCalendar> createNetworkChangedAreasLastChangedAreaEditTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NetworkChangedAreasLastChangedAreaEditTime_QNAME, XMLGregorianCalendar.class, NetworkChangedAreas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "AddressFormatted", scope = MapLocalSearchResultData.class)
    public JAXBElement<String> createMapLocalSearchResultDataAddressFormatted(String value) {
        return new JAXBElement<String>(_MapLocalSearchResultDataAddressFormatted_QNAME, String.class, MapLocalSearchResultData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Candidate", scope = MapLocalSearchResultData.class)
    public JAXBElement<NamedPlace> createMapLocalSearchResultDataCandidate(NamedPlace value) {
        return new JAXBElement<NamedPlace>(_MapLocalSearchResultDataCandidate_QNAME, NamedPlace.class, MapLocalSearchResultData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Description", scope = MapLocalSearchResultData.class)
    public JAXBElement<String> createMapLocalSearchResultDataDescription(String value) {
        return new JAXBElement<String>(_MapRegionInfoDtoDescription_QNAME, String.class, MapLocalSearchResultData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "GeocodeAccuracy_Quality", scope = MapLocalSearchResultData.class)
    public JAXBElement<String> createMapLocalSearchResultDataGeocodeAccuracyQuality(String value) {
        return new JAXBElement<String>(_MapLocalSearchResultDataGeocodeAccuracyQuality_QNAME, String.class, MapLocalSearchResultData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Location", scope = MapLocalSearchResultData.class)
    public JAXBElement<Coordinate> createMapLocalSearchResultDataLocation(Coordinate value) {
        return new JAXBElement<Coordinate>(_MapLocalSearchResultDataLocation_QNAME, Coordinate.class, MapLocalSearchResultData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "PhoneNumber", scope = MapLocalSearchResultData.class)
    public JAXBElement<String> createMapLocalSearchResultDataPhoneNumber(String value) {
        return new JAXBElement<String>(_MapLocalSearchResultDataPhoneNumber_QNAME, String.class, MapLocalSearchResultData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JurisdictionDistancePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "JurisdictionDistancesOptions", scope = CalculateDistanceByJurisdictionResultPropertyOptions.class)
    public JAXBElement<JurisdictionDistancePropertyOptions> createCalculateDistanceByJurisdictionResultPropertyOptionsJurisdictionDistancesOptions(JurisdictionDistancePropertyOptions value) {
        return new JAXBElement<JurisdictionDistancePropertyOptions>(_CalculateDistanceByJurisdictionResultPropertyOptionsJurisdictionDistancesOptions_QNAME, JurisdictionDistancePropertyOptions.class, CalculateDistanceByJurisdictionResultPropertyOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Distance", scope = JurisdictionDistance.class)
    public JAXBElement<Distance> createJurisdictionDistanceDistance(Distance value) {
        return new JAXBElement<Distance>(_JurisdictionDistanceDistance_QNAME, Distance.class, JurisdictionDistance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "FromCoordinate", scope = JurisdictionDistance.class)
    public JAXBElement<Coordinate> createJurisdictionDistanceFromCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_JurisdictionDistanceFromCoordinate_QNAME, Coordinate.class, JurisdictionDistance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Jurisdiction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Jurisdiction", scope = JurisdictionDistance.class)
    public JAXBElement<Jurisdiction> createJurisdictionDistanceJurisdiction(Jurisdiction value) {
        return new JAXBElement<Jurisdiction>(_JurisdictionDistanceJurisdiction_QNAME, Jurisdiction.class, JurisdictionDistance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointPath }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Path", scope = JurisdictionDistance.class)
    public JAXBElement<PointPath> createJurisdictionDistancePath(PointPath value) {
        return new JAXBElement<PointPath>(_JurisdictionDistancePath_QNAME, PointPath.class, JurisdictionDistance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ToCoordinate", scope = JurisdictionDistance.class)
    public JAXBElement<Coordinate> createJurisdictionDistanceToCoordinate(Coordinate value) {
        return new JAXBElement<Coordinate>(_JurisdictionDistanceToCoordinate_QNAME, Coordinate.class, JurisdictionDistance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "HouseNumber", scope = AddressCriteria.class)
    public JAXBElement<String> createAddressCriteriaHouseNumber(String value) {
        return new JAXBElement<String>(_AddressCriteriaHouseNumber_QNAME, String.class, AddressCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Locality }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Locality", scope = AddressCriteria.class)
    public JAXBElement<Locality> createAddressCriteriaLocality(Locality value) {
        return new JAXBElement<Locality>(_AddressCriteriaLocality_QNAME, Locality.class, AddressCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkStreet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Street", scope = AddressCriteria.class)
    public JAXBElement<NetworkStreet> createAddressCriteriaStreet(NetworkStreet value) {
        return new JAXBElement<NetworkStreet>(_AddressCriteriaStreet_QNAME, NetworkStreet.class, AddressCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNetworkArc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "AttachedArcs", scope = MapNode.class)
    public JAXBElement<ArrayOfNetworkArc> createMapNodeAttachedArcs(ArrayOfNetworkArc value) {
        return new JAXBElement<ArrayOfNetworkArc>(_MapNodeAttachedArcs_QNAME, ArrayOfNetworkArc.class, MapNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Point", scope = MapNode.class)
    public JAXBElement<Coordinate> createMapNodePoint(Coordinate value) {
        return new JAXBElement<Coordinate>(_MapNodePoint_QNAME, Coordinate.class, MapNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNetworkPenalizedTurn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "PenalizedTurns", scope = IntersectionNode.class)
    public JAXBElement<ArrayOfNetworkPenalizedTurn> createIntersectionNodePenalizedTurns(ArrayOfNetworkPenalizedTurn value) {
        return new JAXBElement<ArrayOfNetworkPenalizedTurn>(_IntersectionNodePenalizedTurns_QNAME, ArrayOfNetworkPenalizedTurn.class, IntersectionNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ClosePoint", scope = ClosestPointCriteria.class)
    public JAXBElement<Coordinate> createClosestPointCriteriaClosePoint(Coordinate value) {
        return new JAXBElement<Coordinate>(_ClosestPointCriteriaClosePoint_QNAME, Coordinate.class, ClosestPointCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MaxSearchRadius", scope = ClosestPointCriteria.class)
    public JAXBElement<Distance> createClosestPointCriteriaMaxSearchRadius(Distance value) {
        return new JAXBElement<Distance>(_ClosestPointCriteriaMaxSearchRadius_QNAME, Distance.class, ClosestPointCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ImpassePoint", scope = MapSyncCriteria.class)
    public JAXBElement<Coordinate> createMapSyncCriteriaImpassePoint(Coordinate value) {
        return new JAXBElement<Coordinate>(_MapSyncCriteriaImpassePoint_QNAME, Coordinate.class, MapSyncCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapCountryAbbreviations", scope = MapSyncCriteria.class)
    public JAXBElement<String> createMapSyncCriteriaMapCountryAbbreviations(String value) {
        return new JAXBElement<String>(_MapSyncCriteriaMapCountryAbbreviations_QNAME, String.class, MapSyncCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapVendorName", scope = MapSyncCriteria.class)
    public JAXBElement<String> createMapSyncCriteriaMapVendorName(String value) {
        return new JAXBElement<String>(_MapSyncCriteriaMapVendorName_QNAME, String.class, MapSyncCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapVendorVersion", scope = MapSyncCriteria.class)
    public JAXBElement<String> createMapSyncCriteriaMapVendorVersion(String value) {
        return new JAXBElement<String>(_MapSyncCriteriaMapVendorVersion_QNAME, String.class, MapSyncCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NewArc", scope = MapSyncCriteria.class)
    public JAXBElement<NetworkArc> createMapSyncCriteriaNewArc(NetworkArc value) {
        return new JAXBElement<NetworkArc>(_MapSyncCriteriaNewArc_QNAME, NetworkArc.class, MapSyncCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkPOI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NewPOI", scope = MapSyncCriteria.class)
    public JAXBElement<NetworkPOI> createMapSyncCriteriaNewPOI(NetworkPOI value) {
        return new JAXBElement<NetworkPOI>(_MapSyncCriteriaNewPOI_QNAME, NetworkPOI.class, MapSyncCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "OldArc", scope = MapSyncCriteria.class)
    public JAXBElement<NetworkArc> createMapSyncCriteriaOldArc(NetworkArc value) {
        return new JAXBElement<NetworkArc>(_MapSyncCriteriaOldArc_QNAME, NetworkArc.class, MapSyncCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkPOI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "OldPOI", scope = MapSyncCriteria.class)
    public JAXBElement<NetworkPOI> createMapSyncCriteriaOldPOI(NetworkPOI value) {
        return new JAXBElement<NetworkPOI>(_MapSyncCriteriaOldPOI_QNAME, NetworkPOI.class, MapSyncCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RoadClassCountryCode", scope = MapSyncCriteria.class)
    public JAXBElement<String> createMapSyncCriteriaRoadClassCountryCode(String value) {
        return new JAXBElement<String>(_MapSyncCriteriaRoadClassCountryCode_QNAME, String.class, MapSyncCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RoadClassLowerLeftCorner", scope = MapSyncCriteria.class)
    public JAXBElement<Coordinate> createMapSyncCriteriaRoadClassLowerLeftCorner(Coordinate value) {
        return new JAXBElement<Coordinate>(_MapSyncCriteriaRoadClassLowerLeftCorner_QNAME, Coordinate.class, MapSyncCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RoadClassStateName", scope = MapSyncCriteria.class)
    public JAXBElement<String> createMapSyncCriteriaRoadClassStateName(String value) {
        return new JAXBElement<String>(_MapSyncCriteriaRoadClassStateName_QNAME, String.class, MapSyncCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "RoadClassUpperRightCorner", scope = MapSyncCriteria.class)
    public JAXBElement<Coordinate> createMapSyncCriteriaRoadClassUpperRightCorner(Coordinate value) {
        return new JAXBElement<Coordinate>(_MapSyncCriteriaRoadClassUpperRightCorner_QNAME, Coordinate.class, MapSyncCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "TurnPenaltyIncomingArc", scope = MapSyncCriteria.class)
    public JAXBElement<NetworkArc> createMapSyncCriteriaTurnPenaltyIncomingArc(NetworkArc value) {
        return new JAXBElement<NetworkArc>(_MapSyncCriteriaTurnPenaltyIncomingArc_QNAME, NetworkArc.class, MapSyncCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "TurnPenaltyNodePoint", scope = MapSyncCriteria.class)
    public JAXBElement<Coordinate> createMapSyncCriteriaTurnPenaltyNodePoint(Coordinate value) {
        return new JAXBElement<Coordinate>(_MapSyncCriteriaTurnPenaltyNodePoint_QNAME, Coordinate.class, MapSyncCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "TurnPenaltyOutgoingArc", scope = MapSyncCriteria.class)
    public JAXBElement<NetworkArc> createMapSyncCriteriaTurnPenaltyOutgoingArc(NetworkArc value) {
        return new JAXBElement<NetworkArc>(_MapSyncCriteriaTurnPenaltyOutgoingArc_QNAME, NetworkArc.class, MapSyncCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "UserID", scope = MapSyncCriteria.class)
    public JAXBElement<String> createMapSyncCriteriaUserID(String value) {
        return new JAXBElement<String>(_MapSyncCriteriaUserID_QNAME, String.class, MapSyncCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMapLocalSearchResultData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ResultsData", scope = MapLocalSearchResult.class)
    public JAXBElement<ArrayOfMapLocalSearchResultData> createMapLocalSearchResultResultsData(ArrayOfMapLocalSearchResultData value) {
        return new JAXBElement<ArrayOfMapLocalSearchResultData>(_MapLocalSearchResultResultsData_QNAME, ArrayOfMapLocalSearchResultData.class, MapLocalSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfValidationFailure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ValidationFailures", scope = MapLocalSearchResult.class)
    public JAXBElement<ArrayOfValidationFailure> createMapLocalSearchResultValidationFailures(ArrayOfValidationFailure value) {
        return new JAXBElement<ArrayOfValidationFailure>(_MappingErrorInfoValidationFailures_QNAME, ArrayOfValidationFailure.class, MapLocalSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapLocalSearchResultDataPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "PropertyOptions", scope = MapLocalSearchOptions.class)
    public JAXBElement<MapLocalSearchResultDataPropertyOptions> createMapLocalSearchOptionsPropertyOptions(MapLocalSearchResultDataPropertyOptions value) {
        return new JAXBElement<MapLocalSearchResultDataPropertyOptions>(_MapLocalSearchOptionsPropertyOptions_QNAME, MapLocalSearchResultDataPropertyOptions.class, MapLocalSearchOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "LocalityToSearch", scope = MapLocalSearchCriteria.class)
    public JAXBElement<String> createMapLocalSearchCriteriaLocalityToSearch(String value) {
        return new JAXBElement<String>(_MapLocalSearchCriteriaLocalityToSearch_QNAME, String.class, MapLocalSearchCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "PlaceToSearch", scope = MapLocalSearchCriteria.class)
    public JAXBElement<String> createMapLocalSearchCriteriaPlaceToSearch(String value) {
        return new JAXBElement<String>(_MapLocalSearchCriteriaPlaceToSearch_QNAME, String.class, MapLocalSearchCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "PointToBeginSearch", scope = MapLocalSearchCriteria.class)
    public JAXBElement<Coordinate> createMapLocalSearchCriteriaPointToBeginSearch(Coordinate value) {
        return new JAXBElement<Coordinate>(_MapLocalSearchCriteriaPointToBeginSearch_QNAME, Coordinate.class, MapLocalSearchCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkTravelPolygon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "UpdatedTravelPolygon", scope = UpdateTravelPolygonResult.class)
    public JAXBElement<NetworkTravelPolygon> createUpdateTravelPolygonResultUpdatedTravelPolygon(NetworkTravelPolygon value) {
        return new JAXBElement<NetworkTravelPolygon>(_UpdateTravelPolygonResultUpdatedTravelPolygon_QNAME, NetworkTravelPolygon.class, UpdateTravelPolygonResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkTravelPolygonPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "PropertyOptions", scope = UpdateTravelPolygonOptions.class)
    public JAXBElement<NetworkTravelPolygonPropertyOptions> createUpdateTravelPolygonOptionsPropertyOptions(NetworkTravelPolygonPropertyOptions value) {
        return new JAXBElement<NetworkTravelPolygonPropertyOptions>(_MapLocalSearchOptionsPropertyOptions_QNAME, NetworkTravelPolygonPropertyOptions.class, UpdateTravelPolygonOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkRestrictedPath }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "UpdatedTravelPath", scope = UpdateRestrictedPathResult.class)
    public JAXBElement<NetworkRestrictedPath> createUpdateRestrictedPathResultUpdatedTravelPath(NetworkRestrictedPath value) {
        return new JAXBElement<NetworkRestrictedPath>(_UpdateRestrictedPathResultUpdatedTravelPath_QNAME, NetworkRestrictedPath.class, UpdateRestrictedPathResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkRestrictedPathPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "PropertyOptions", scope = UpdateRestrictedPathOptions.class)
    public JAXBElement<NetworkRestrictedPathPropertyOptions> createUpdateRestrictedPathOptionsPropertyOptions(NetworkRestrictedPathPropertyOptions value) {
        return new JAXBElement<NetworkRestrictedPathPropertyOptions>(_MapLocalSearchOptionsPropertyOptions_QNAME, NetworkRestrictedPathPropertyOptions.class, UpdateRestrictedPathOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNetworkRestrictedPath }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "TravelPaths", scope = RetrieveRestrictedPathsAndPolygonsResults.class)
    public JAXBElement<ArrayOfNetworkRestrictedPath> createRetrieveRestrictedPathsAndPolygonsResultsTravelPaths(ArrayOfNetworkRestrictedPath value) {
        return new JAXBElement<ArrayOfNetworkRestrictedPath>(_RetrieveRestrictedPathsAndPolygonsResultsTravelPaths_QNAME, ArrayOfNetworkRestrictedPath.class, RetrieveRestrictedPathsAndPolygonsResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNetworkTravelPolygon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "TravelPolygons", scope = RetrieveRestrictedPathsAndPolygonsResults.class)
    public JAXBElement<ArrayOfNetworkTravelPolygon> createRetrieveRestrictedPathsAndPolygonsResultsTravelPolygons(ArrayOfNetworkTravelPolygon value) {
        return new JAXBElement<ArrayOfNetworkTravelPolygon>(_RetrieveRestrictedPathsAndPolygonsResultsTravelPolygons_QNAME, ArrayOfNetworkTravelPolygon.class, RetrieveRestrictedPathsAndPolygonsResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkRestrictedPathPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "TravelPathPropertyOptions", scope = RetrieveRestrictedPathsAndPolygonsOptions.class)
    public JAXBElement<NetworkRestrictedPathPropertyOptions> createRetrieveRestrictedPathsAndPolygonsOptionsTravelPathPropertyOptions(NetworkRestrictedPathPropertyOptions value) {
        return new JAXBElement<NetworkRestrictedPathPropertyOptions>(_RetrieveRestrictedPathsAndPolygonsOptionsTravelPathPropertyOptions_QNAME, NetworkRestrictedPathPropertyOptions.class, RetrieveRestrictedPathsAndPolygonsOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkTravelPolygonPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "TravelPolygonPropertyOptions", scope = RetrieveRestrictedPathsAndPolygonsOptions.class)
    public JAXBElement<NetworkTravelPolygonPropertyOptions> createRetrieveRestrictedPathsAndPolygonsOptionsTravelPolygonPropertyOptions(NetworkTravelPolygonPropertyOptions value) {
        return new JAXBElement<NetworkTravelPolygonPropertyOptions>(_RetrieveRestrictedPathsAndPolygonsOptionsTravelPolygonPropertyOptions_QNAME, NetworkTravelPolygonPropertyOptions.class, RetrieveRestrictedPathsAndPolygonsOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClosestPointCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ClosestPointCriteria", scope = RetrieveTravelPathsAndPolygonsCriteria.class)
    public JAXBElement<ClosestPointCriteria> createRetrieveTravelPathsAndPolygonsCriteriaClosestPointCriteria(ClosestPointCriteria value) {
        return new JAXBElement<ClosestPointCriteria>(_ClosestPointCriteria_QNAME, ClosestPointCriteria.class, RetrieveTravelPathsAndPolygonsCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Viewport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Viewport", scope = RetrieveTravelPathsAndPolygonsCriteria.class)
    public JAXBElement<Viewport> createRetrieveTravelPathsAndPolygonsCriteriaViewport(Viewport value) {
        return new JAXBElement<Viewport>(_SpatialCriteriaViewport_QNAME, Viewport.class, RetrieveTravelPathsAndPolygonsCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkTravelModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "TravelModel", scope = RetrieveTravelModelResults.class)
    public JAXBElement<NetworkTravelModel> createRetrieveTravelModelResultsTravelModel(NetworkTravelModel value) {
        return new JAXBElement<NetworkTravelModel>(_RetrieveTravelModelResultsTravelModel_QNAME, NetworkTravelModel.class, RetrieveTravelModelResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfJurisdictionDistance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "JurisdictionDistances", scope = CalculateDistanceByJurisdictionResult.class)
    public JAXBElement<ArrayOfJurisdictionDistance> createCalculateDistanceByJurisdictionResultJurisdictionDistances(ArrayOfJurisdictionDistance value) {
        return new JAXBElement<ArrayOfJurisdictionDistance>(_CalculateDistanceByJurisdictionResultJurisdictionDistances_QNAME, ArrayOfJurisdictionDistance.class, CalculateDistanceByJurisdictionResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "TravelPathErrorCode_DestinationPathError", scope = CalculateDistanceByJurisdictionResult.class)
    public JAXBElement<String> createCalculateDistanceByJurisdictionResultTravelPathErrorCodeDestinationPathError(String value) {
        return new JAXBElement<String>(_CalculateDistanceByJurisdictionResultTravelPathErrorCodeDestinationPathError_QNAME, String.class, CalculateDistanceByJurisdictionResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelPathCalculatorOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "CalculatorOptions", scope = CalculateDistanceByJurisdictionOptions.class)
    public JAXBElement<TravelPathCalculatorOptions> createCalculateDistanceByJurisdictionOptionsCalculatorOptions(TravelPathCalculatorOptions value) {
        return new JAXBElement<TravelPathCalculatorOptions>(_CalculateDistanceByJurisdictionOptionsCalculatorOptions_QNAME, TravelPathCalculatorOptions.class, CalculateDistanceByJurisdictionOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MeasurementOptions", scope = CalculateDistanceByJurisdictionOptions.class)
    public JAXBElement<MeasurementOptions> createCalculateDistanceByJurisdictionOptionsMeasurementOptions(MeasurementOptions value) {
        return new JAXBElement<MeasurementOptions>(_CalculateDistanceByJurisdictionOptionsMeasurementOptions_QNAME, MeasurementOptions.class, CalculateDistanceByJurisdictionOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateDistanceByJurisdictionResultPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "PropertyOptions", scope = CalculateDistanceByJurisdictionOptions.class)
    public JAXBElement<CalculateDistanceByJurisdictionResultPropertyOptions> createCalculateDistanceByJurisdictionOptionsPropertyOptions(CalculateDistanceByJurisdictionResultPropertyOptions value) {
        return new JAXBElement<CalculateDistanceByJurisdictionResultPropertyOptions>(_MapLocalSearchOptionsPropertyOptions_QNAME, CalculateDistanceByJurisdictionResultPropertyOptions.class, CalculateDistanceByJurisdictionOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelPathCalculatorOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "CalculatorOptions", scope = GenerateTravelPathOptions.class)
    public JAXBElement<TravelPathCalculatorOptions> createGenerateTravelPathOptionsCalculatorOptions(TravelPathCalculatorOptions value) {
        return new JAXBElement<TravelPathCalculatorOptions>(_CalculateDistanceByJurisdictionOptionsCalculatorOptions_QNAME, TravelPathCalculatorOptions.class, GenerateTravelPathOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCoordinate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Coordinates", scope = GenerateTravelPathOptions.class)
    public JAXBElement<ArrayOfCoordinate> createGenerateTravelPathOptionsCoordinates(ArrayOfCoordinate value) {
        return new JAXBElement<ArrayOfCoordinate>(_GenerateTravelPathOptionsCoordinates_QNAME, ArrayOfCoordinate.class, GenerateTravelPathOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodeOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "GeocodingOptions", scope = RetrieveGeocodeCandidateOptions.class)
    public JAXBElement<GeocodeOptions> createRetrieveGeocodeCandidateOptionsGeocodingOptions(GeocodeOptions value) {
        return new JAXBElement<GeocodeOptions>(_RetrieveGeocodeCandidateOptionsGeocodingOptions_QNAME, GeocodeOptions.class, RetrieveGeocodeCandidateOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkArcCandidatePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkArcCandidatePropertyOptions", scope = GeocodeOptions.class)
    public JAXBElement<NetworkArcCandidatePropertyOptions> createGeocodeOptionsNetworkArcCandidatePropertyOptions(NetworkArcCandidatePropertyOptions value) {
        return new JAXBElement<NetworkArcCandidatePropertyOptions>(_GeocodeOptionsNetworkArcCandidatePropertyOptions_QNAME, NetworkArcCandidatePropertyOptions.class, GeocodeOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkPOICandidatePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkPOICandidatePropertyOptions", scope = GeocodeOptions.class)
    public JAXBElement<NetworkPOICandidatePropertyOptions> createGeocodeOptionsNetworkPOICandidatePropertyOptions(NetworkPOICandidatePropertyOptions value) {
        return new JAXBElement<NetworkPOICandidatePropertyOptions>(_GeocodeOptionsNetworkPOICandidatePropertyOptions_QNAME, NetworkPOICandidatePropertyOptions.class, GeocodeOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkPointAddressCandidatePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkPointAddressCandidatePropertyOptions", scope = GeocodeOptions.class)
    public JAXBElement<NetworkPointAddressCandidatePropertyOptions> createGeocodeOptionsNetworkPointAddressCandidatePropertyOptions(NetworkPointAddressCandidatePropertyOptions value) {
        return new JAXBElement<NetworkPointAddressCandidatePropertyOptions>(_GeocodeOptionsNetworkPointAddressCandidatePropertyOptions_QNAME, NetworkPointAddressCandidatePropertyOptions.class, GeocodeOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNamedPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NamedPlaces", scope = GeocodeCriteria.class)
    public JAXBElement<ArrayOfNamedPlace> createGeocodeCriteriaNamedPlaces(ArrayOfNamedPlace value) {
        return new JAXBElement<ArrayOfNamedPlace>(_GeocodeCriteriaNamedPlaces_QNAME, ArrayOfNamedPlace.class, GeocodeCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUpdateArcResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "UpdateArcsResults", scope = ApplyArcUpdatesResult.class)
    public JAXBElement<ArrayOfUpdateArcResult> createApplyArcUpdatesResultUpdateArcsResults(ArrayOfUpdateArcResult value) {
        return new JAXBElement<ArrayOfUpdateArcResult>(_UpdateArcsResults_QNAME, ArrayOfUpdateArcResult.class, ApplyArcUpdatesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkArcPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "PropertyOptions", scope = ApplyArcUpdatesOptions.class)
    public JAXBElement<NetworkArcPropertyOptions> createApplyArcUpdatesOptionsPropertyOptions(NetworkArcPropertyOptions value) {
        return new JAXBElement<NetworkArcPropertyOptions>(_MapLocalSearchOptionsPropertyOptions_QNAME, NetworkArcPropertyOptions.class, ApplyArcUpdatesOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkArcPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ReturnArcsPropertyOptions", scope = ApplyArcUpdatesOptions.class)
    public JAXBElement<NetworkArcPropertyOptions> createApplyArcUpdatesOptionsReturnArcsPropertyOptions(NetworkArcPropertyOptions value) {
        return new JAXBElement<NetworkArcPropertyOptions>(_ApplyArcUpdatesOptionsReturnArcsPropertyOptions_QNAME, NetworkArcPropertyOptions.class, ApplyArcUpdatesOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNetworkInstanceID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ArcsToUpdate", scope = ApplyArcUpdatesCriteria.class)
    public JAXBElement<ArrayOfNetworkInstanceID> createApplyArcUpdatesCriteriaArcsToUpdate(ArrayOfNetworkInstanceID value) {
        return new JAXBElement<ArrayOfNetworkInstanceID>(_ApplyArcUpdatesCriteriaArcsToUpdate_QNAME, ArrayOfNetworkInstanceID.class, ApplyArcUpdatesCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "TemplateUpdateArc", scope = ApplyArcUpdatesCriteria.class)
    public JAXBElement<NetworkArc> createApplyArcUpdatesCriteriaTemplateUpdateArc(NetworkArc value) {
        return new JAXBElement<NetworkArc>(_ApplyArcUpdatesCriteriaTemplateUpdateArc_QNAME, NetworkArc.class, ApplyArcUpdatesCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMapNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Nodes", scope = RetrieveNodesResults.class)
    public JAXBElement<ArrayOfMapNode> createRetrieveNodesResultsNodes(ArrayOfMapNode value) {
        return new JAXBElement<ArrayOfMapNode>(_RetrieveNodesResultsNodes_QNAME, ArrayOfMapNode.class, RetrieveNodesResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImpasseNodePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ImpasseNodePropertyOptions", scope = RetrieveNodesOptions.class)
    public JAXBElement<ImpasseNodePropertyOptions> createRetrieveNodesOptionsImpasseNodePropertyOptions(ImpasseNodePropertyOptions value) {
        return new JAXBElement<ImpasseNodePropertyOptions>(_ImpasseNodePropertyOptions_QNAME, ImpasseNodePropertyOptions.class, RetrieveNodesOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntersectionNodePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "IntersectionNodePropertyOptions", scope = RetrieveNodesOptions.class)
    public JAXBElement<IntersectionNodePropertyOptions> createRetrieveNodesOptionsIntersectionNodePropertyOptions(IntersectionNodePropertyOptions value) {
        return new JAXBElement<IntersectionNodePropertyOptions>(_IntersectionNodePropertyOptions_QNAME, IntersectionNodePropertyOptions.class, RetrieveNodesOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapNodeTypeFlags_NodeType", scope = RetrieveNodesCriteria.class)
    public JAXBElement<String> createRetrieveNodesCriteriaMapNodeTypeFlagsNodeType(String value) {
        return new JAXBElement<String>(_RetrieveNodesCriteriaMapNodeTypeFlagsNodeType_QNAME, String.class, RetrieveNodesCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Viewport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Viewport", scope = RetrieveNodesCriteria.class)
    public JAXBElement<Viewport> createRetrieveNodesCriteriaViewport(Viewport value) {
        return new JAXBElement<Viewport>(_SpatialCriteriaViewport_QNAME, Viewport.class, RetrieveNodesCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkChangedAreas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkChangedAreas", scope = RetrieveMapChangedAreasResults.class)
    public JAXBElement<NetworkChangedAreas> createRetrieveMapChangedAreasResultsNetworkChangedAreas(NetworkChangedAreas value) {
        return new JAXBElement<NetworkChangedAreas>(_NetworkChangedAreas_QNAME, NetworkChangedAreas.class, RetrieveMapChangedAreasResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkArcPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "PropertyOptions", scope = RetrieveMapChangedAreasOptions.class)
    public JAXBElement<NetworkArcPropertyOptions> createRetrieveMapChangedAreasOptionsPropertyOptions(NetworkArcPropertyOptions value) {
        return new JAXBElement<NetworkArcPropertyOptions>(_MapLocalSearchOptionsPropertyOptions_QNAME, NetworkArcPropertyOptions.class, RetrieveMapChangedAreasOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkArcPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "PropertyOptions", scope = PopulateArcsOptions.class)
    public JAXBElement<NetworkArcPropertyOptions> createPopulateArcsOptionsPropertyOptions(NetworkArcPropertyOptions value) {
        return new JAXBElement<NetworkArcPropertyOptions>(_MapLocalSearchOptionsPropertyOptions_QNAME, NetworkArcPropertyOptions.class, PopulateArcsOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MappingErrorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ErrorInfo", scope = RetrieveArcsResults.class)
    public JAXBElement<MappingErrorInfo> createRetrieveArcsResultsErrorInfo(MappingErrorInfo value) {
        return new JAXBElement<MappingErrorInfo>(_UpdateArcResultErrorInfo_QNAME, MappingErrorInfo.class, RetrieveArcsResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNetworkArc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkArcs", scope = RetrieveArcsResults.class)
    public JAXBElement<ArrayOfNetworkArc> createRetrieveArcsResultsNetworkArcs(ArrayOfNetworkArc value) {
        return new JAXBElement<ArrayOfNetworkArc>(_RetrieveArcsResultsNetworkArcs_QNAME, ArrayOfNetworkArc.class, RetrieveArcsResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkArcPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "PropertyOptions", scope = RetrieveArcsOptions.class)
    public JAXBElement<NetworkArcPropertyOptions> createRetrieveArcsOptionsPropertyOptions(NetworkArcPropertyOptions value) {
        return new JAXBElement<NetworkArcPropertyOptions>(_MapLocalSearchOptionsPropertyOptions_QNAME, NetworkArcPropertyOptions.class, RetrieveArcsOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "AddressCriteria", scope = RetrieveArcsCriteria.class)
    public JAXBElement<AddressCriteria> createRetrieveArcsCriteriaAddressCriteria(AddressCriteria value) {
        return new JAXBElement<AddressCriteria>(_AddressCriteria_QNAME, AddressCriteria.class, RetrieveArcsCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpatialCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "SpatialCriteria", scope = RetrieveArcsCriteria.class)
    public JAXBElement<SpatialCriteria> createRetrieveArcsCriteriaSpatialCriteria(SpatialCriteria value) {
        return new JAXBElement<SpatialCriteria>(_SpatialCriteria_QNAME, SpatialCriteria.class, RetrieveArcsCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntersectionNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Node", scope = UpdateNodeCriteria.class)
    public JAXBElement<IntersectionNode> createUpdateNodeCriteriaNode(IntersectionNode value) {
        return new JAXBElement<IntersectionNode>(_UpdateNodeCriteriaNode_QNAME, IntersectionNode.class, UpdateNodeCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUpdateArcResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "UpdatedArcsResults", scope = UpdateArcsResults.class)
    public JAXBElement<ArrayOfUpdateArcResult> createUpdateArcsResultsUpdatedArcsResults(ArrayOfUpdateArcResult value) {
        return new JAXBElement<ArrayOfUpdateArcResult>(_UpdateArcsResultsUpdatedArcsResults_QNAME, ArrayOfUpdateArcResult.class, UpdateArcsResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkArcPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "PropertyOptions", scope = UpdateArcsOptions.class)
    public JAXBElement<NetworkArcPropertyOptions> createUpdateArcsOptionsPropertyOptions(NetworkArcPropertyOptions value) {
        return new JAXBElement<NetworkArcPropertyOptions>(_MapLocalSearchOptionsPropertyOptions_QNAME, NetworkArcPropertyOptions.class, UpdateArcsOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkArcPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ReturnArcsPropertyOptions", scope = UpdateArcsOptions.class)
    public JAXBElement<NetworkArcPropertyOptions> createUpdateArcsOptionsReturnArcsPropertyOptions(NetworkArcPropertyOptions value) {
        return new JAXBElement<NetworkArcPropertyOptions>(_ApplyArcUpdatesOptionsReturnArcsPropertyOptions_QNAME, NetworkArcPropertyOptions.class, UpdateArcsOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkArcPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "SplitArcsPropertyOptions", scope = UpdateArcsOptions.class)
    public JAXBElement<NetworkArcPropertyOptions> createUpdateArcsOptionsSplitArcsPropertyOptions(NetworkArcPropertyOptions value) {
        return new JAXBElement<NetworkArcPropertyOptions>(_UpdateArcsOptionsSplitArcsPropertyOptions_QNAME, NetworkArcPropertyOptions.class, UpdateArcsOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRetrieveNodesDetailResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "DetailResults", scope = RetrieveNodesDetailResults.class)
    public JAXBElement<ArrayOfRetrieveNodesDetailResult> createRetrieveNodesDetailResultsDetailResults(ArrayOfRetrieveNodesDetailResult value) {
        return new JAXBElement<ArrayOfRetrieveNodesDetailResult>(_RetrieveNodesDetailResultsDetailResults_QNAME, ArrayOfRetrieveNodesDetailResult.class, RetrieveNodesDetailResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImpasseNodePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ImpasseNodePropertyOptions", scope = RetrieveNodesDetailOptions.class)
    public JAXBElement<ImpasseNodePropertyOptions> createRetrieveNodesDetailOptionsImpasseNodePropertyOptions(ImpasseNodePropertyOptions value) {
        return new JAXBElement<ImpasseNodePropertyOptions>(_ImpasseNodePropertyOptions_QNAME, ImpasseNodePropertyOptions.class, RetrieveNodesDetailOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntersectionNodePropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "IntersectionNodePropertyOptions", scope = RetrieveNodesDetailOptions.class)
    public JAXBElement<IntersectionNodePropertyOptions> createRetrieveNodesDetailOptionsIntersectionNodePropertyOptions(IntersectionNodePropertyOptions value) {
        return new JAXBElement<IntersectionNodePropertyOptions>(_IntersectionNodePropertyOptions_QNAME, IntersectionNodePropertyOptions.class, RetrieveNodesDetailOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMapNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Nodes", scope = RetrieveNodesDetailCriteria.class)
    public JAXBElement<ArrayOfMapNode> createRetrieveNodesDetailCriteriaNodes(ArrayOfMapNode value) {
        return new JAXBElement<ArrayOfMapNode>(_RetrieveNodesResultsNodes_QNAME, ArrayOfMapNode.class, RetrieveNodesDetailCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Data", scope = RetrieveFullMapEditsResult.class)
    public JAXBElement<byte[]> createRetrieveFullMapEditsResultData(byte[] value) {
        return new JAXBElement<byte[]>(_RetrieveFullMapEditsResultData_QNAME, byte[].class, RetrieveFullMapEditsResult.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Data", scope = RetrieveDeltaMapEditsResult.class)
    public JAXBElement<byte[]> createRetrieveDeltaMapEditsResultData(byte[] value) {
        return new JAXBElement<byte[]>(_RetrieveFullMapEditsResultData_QNAME, byte[].class, RetrieveDeltaMapEditsResult.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapSchemaVersion", scope = RetrieveMapInfoResult.class)
    public JAXBElement<String> createRetrieveMapInfoResultMapSchemaVersion(String value) {
        return new JAXBElement<String>(_RetrieveMapInfoResultMapSchemaVersion_QNAME, String.class, RetrieveMapInfoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "MapVersion", scope = RetrieveMapInfoResult.class)
    public JAXBElement<String> createRetrieveMapInfoResultMapVersion(String value) {
        return new JAXBElement<String>(_RetrieveMapInfoResultMapVersion_QNAME, String.class, RetrieveMapInfoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkEditOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "EditRequestOperation", scope = ProcessCommunityEditRequestResult.class)
    public JAXBElement<NetworkEditOperation> createProcessCommunityEditRequestResultEditRequestOperation(NetworkEditOperation value) {
        return new JAXBElement<NetworkEditOperation>(_ProcessCommunityEditRequestResultEditRequestOperation_QNAME, NetworkEditOperation.class, ProcessCommunityEditRequestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MappingErrorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ErrorInfo", scope = ProcessCommunityEditRequestResult.class)
    public JAXBElement<MappingErrorInfo> createProcessCommunityEditRequestResultErrorInfo(MappingErrorInfo value) {
        return new JAXBElement<MappingErrorInfo>(_UpdateArcResultErrorInfo_QNAME, MappingErrorInfo.class, ProcessCommunityEditRequestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Comment", scope = ProcessCommunityEditRequestArgs.class)
    public JAXBElement<String> createProcessCommunityEditRequestArgsComment(String value) {
        return new JAXBElement<String>(_NetworkEditOperationComment_QNAME, String.class, ProcessCommunityEditRequestArgs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MappingErrorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "ErrorInfo", scope = RetrieveEditOperationsResult.class)
    public JAXBElement<MappingErrorInfo> createRetrieveEditOperationsResultErrorInfo(MappingErrorInfo value) {
        return new JAXBElement<MappingErrorInfo>(_UpdateArcResultErrorInfo_QNAME, MappingErrorInfo.class, RetrieveEditOperationsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNetworkEditOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "Operations", scope = RetrieveEditOperationsResult.class)
    public JAXBElement<ArrayOfNetworkEditOperation> createRetrieveEditOperationsResultOperations(ArrayOfNetworkEditOperation value) {
        return new JAXBElement<ArrayOfNetworkEditOperation>(_RetrieveEditOperationsResultOperations_QNAME, ArrayOfNetworkEditOperation.class, RetrieveEditOperationsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkEditOperationPropertyOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "PropertyOptions", scope = RetrieveEditOperationsOptions.class)
    public JAXBElement<NetworkEditOperationPropertyOptions> createRetrieveEditOperationsOptionsPropertyOptions(NetworkEditOperationPropertyOptions value) {
        return new JAXBElement<NetworkEditOperationPropertyOptions>(_MapLocalSearchOptionsPropertyOptions_QNAME, NetworkEditOperationPropertyOptions.class, RetrieveEditOperationsOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "BeginDate", scope = RetrieveEditOperationsCriteria.class)
    public JAXBElement<XMLGregorianCalendar> createRetrieveEditOperationsCriteriaBeginDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RetrieveEditOperationsCriteriaBeginDate_QNAME, XMLGregorianCalendar.class, RetrieveEditOperationsCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "EndDate", scope = RetrieveEditOperationsCriteria.class)
    public JAXBElement<XMLGregorianCalendar> createRetrieveEditOperationsCriteriaEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RetrieveEditOperationsCriteriaEndDate_QNAME, XMLGregorianCalendar.class, RetrieveEditOperationsCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkEditOperationSource_Source", scope = RetrieveEditOperationsCriteria.class)
    public JAXBElement<String> createRetrieveEditOperationsCriteriaNetworkEditOperationSourceSource(String value) {
        return new JAXBElement<String>(_RetrieveEditOperationsCriteriaNetworkEditOperationSourceSource_QNAME, String.class, RetrieveEditOperationsCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkEditOperationStatusFlags_StatusTypes", scope = RetrieveEditOperationsCriteria.class)
    public JAXBElement<String> createRetrieveEditOperationsCriteriaNetworkEditOperationStatusFlagsStatusTypes(String value) {
        return new JAXBElement<String>(_RetrieveEditOperationsCriteriaNetworkEditOperationStatusFlagsStatusTypes_QNAME, String.class, RetrieveEditOperationsCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpatialCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "SpatialCriteria", scope = RetrieveEditOperationsCriteria.class)
    public JAXBElement<SpatialCriteria> createRetrieveEditOperationsCriteriaSpatialCriteria(SpatialCriteria value) {
        return new JAXBElement<SpatialCriteria>(_SpatialCriteria_QNAME, SpatialCriteria.class, RetrieveEditOperationsCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "EditorID", scope = NetworkEditRecord.class)
    public JAXBElement<String> createNetworkEditRecordEditorID(String value) {
        return new JAXBElement<String>(_NetworkEditRecordEditorID_QNAME, String.class, NetworkEditRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkEditAction_EditAction", scope = NetworkEditRecord.class)
    public JAXBElement<String> createNetworkEditRecordNetworkEditActionEditAction(String value) {
        return new JAXBElement<String>(_NetworkEditRecordNetworkEditActionEditAction_QNAME, String.class, NetworkEditRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NetworkSpatialItemType_ItemType", scope = NetworkEditRecord.class)
    public JAXBElement<String> createNetworkEditRecordNetworkSpatialItemTypeItemType(String value) {
        return new JAXBElement<String>(_NetworkEditRecordNetworkSpatialItemTypeItemType_QNAME, String.class, NetworkEditRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INetworkSpatial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "NewSpatialItem", scope = NetworkEditRecord.class)
    public JAXBElement<INetworkSpatial> createNetworkEditRecordNewSpatialItem(INetworkSpatial value) {
        return new JAXBElement<INetworkSpatial>(_NetworkEditRecordNewSpatialItem_QNAME, INetworkSpatial.class, NetworkEditRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INetworkSpatial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", name = "OldSpatialItem", scope = NetworkEditRecord.class)
    public JAXBElement<INetworkSpatial> createNetworkEditRecordOldSpatialItem(INetworkSpatial value) {
        return new JAXBElement<INetworkSpatial>(_NetworkEditRecordOldSpatialItem_QNAME, INetworkSpatial.class, NetworkEditRecord.class, value);
    }

}
