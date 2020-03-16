
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ResourceExceptionRuleFunction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResourceExceptionRuleFunction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceExceptionRuleFunction", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions")
@XmlSeeAlso({
    NavClientRoutePathDeviationFunction.class,
    NavClientSpeedViolationFunction.class,
    DiagnosticTroubleCodeFunction.class,
    DoorStateFunction.class,
    RemoteVehicleShutdownFunction.class,
    SeatBeltViolatioFunction.class,
    TemperatureFunction.class,
    HOSOnDutyWithoutActivityFunction.class,
    PanicButtonFunction.class,
    PotentialHOSDriveTimeViolationFunction.class,
    PotentialHOSDutyTimeViolationFunction.class,
    DeviceLowBatteryFunction.class,
    ExcessiveIdlingFunction.class,
    HarshAccelerationFunction.class,
    HarshBrakingFunction.class,
    HarshCorneringFunction.class,
    ProjectedServiceWindowDeviationFunction.class,
    RestrictedEquipmentHoursFunction.class,
    RestrictedLocationFunction.class,
    ServiceableStopServiceTimeDeviationFunction.class,
    GpsDistanceToLocationFunction.class,
    GpsGapFunction.class,
    NoGpsFunction.class,
    OutOfContactFunction.class,
    OffPlannedCompleteTimeFunction.class,
    OutOfBoundsArriveDepartFunction.class,
    RouteNetworkSpeedViolationFunction.class,
    RoutePathDeviationFunction.class,
    StaticSpeedViolationFunction.class,
    UnplannedStopDistanceToLocationFunction.class,
    StationaryResourceFunction.class
})
public class ResourceExceptionRuleFunction
    extends DataTransferObject
{


}
