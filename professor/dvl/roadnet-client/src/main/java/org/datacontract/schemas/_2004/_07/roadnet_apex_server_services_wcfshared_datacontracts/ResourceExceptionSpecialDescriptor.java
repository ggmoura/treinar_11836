
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ResourceExceptionSpecialDescriptor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResourceExceptionSpecialDescriptor"&gt;
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
@XmlType(name = "ResourceExceptionSpecialDescriptor", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions")
@XmlSeeAlso({
    NavClientRoutePathDeviationDescriptor.class,
    DiagnosticTroubleCodeDescriptor.class,
    DoorStateDescriptor.class,
    NavClientSpeedViolationDescriptor.class,
    RemoteVehicleShutdownDescriptor.class,
    SeatBeltViolationDescriptor.class,
    TemperatureDescriptor.class,
    HOSOnDutyWithoutActivityDescriptor.class,
    PanicButtonDescriptor.class,
    PotentialHOSDriveTimeViolationDescriptor.class,
    PotentialHOSDutyTimeViolationDescriptor.class,
    RestrictedEquipmentHoursDescriptor.class,
    RestrictedLocationDescriptor.class,
    DeviceLowBatteryDescriptor.class,
    ExcessiveIdlingDescriptor.class,
    ProjectedServiceWindowDeviationDescriptor.class,
    ServiceableStopServiceTimeDeviationDescriptor.class,
    GpsDistanceToLocationDescriptor.class,
    GpsGapDescriptor.class,
    OffPlannedCompleteTimeDescriptor.class,
    OutOfBoundsArriveDepartDescriptor.class,
    OutOfContactDescriptor.class,
    RoutePathDeviationDescriptor.class,
    SpeedViolationDescriptor.class,
    StationaryResourceDescriptor.class,
    UnplannedStopDistanceToLocationDescriptor.class,
    HarshDrivingingDescriptor.class
})
public class ResourceExceptionSpecialDescriptor
    extends DataTransferObject
{


}
