
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.Address;
import com.roadnet.apex.datacontracts.AlertParameter;
import com.roadnet.apex.datacontracts.Color;
import com.roadnet.apex.datacontracts.DriverLog;
import com.roadnet.apex.datacontracts.EquipmentPosition;
import com.roadnet.apex.datacontracts.GeocodeResult;
import com.roadnet.apex.datacontracts.ITimePeriod;
import com.roadnet.apex.datacontracts.Locality;
import com.roadnet.apex.datacontracts.LogDetailDto;
import com.roadnet.apex.datacontracts.MapDataInfo;
import com.roadnet.apex.datacontracts.NetworkArcEndpointID;
import com.roadnet.apex.datacontracts.NetworkArcWeeklyTravelSpeed;
import com.roadnet.apex.datacontracts.NetworkID;
import com.roadnet.apex.datacontracts.NetworkInstanceID;
import com.roadnet.apex.datacontracts.NetworkSpeedModifier;
import com.roadnet.apex.datacontracts.PersonName;
import com.roadnet.apex.datacontracts.PointPath;
import com.roadnet.apex.datacontracts.Polygon;
import com.roadnet.apex.datacontracts.QualityPairedDateTime;
import com.roadnet.apex.datacontracts.QualityPairedDistance;
import com.roadnet.apex.datacontracts.ResourceEvent;
import com.roadnet.apex.datacontracts.TimeOfWeek;
import com.roadnet.apex.datacontracts.TravelCost;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.ClosestPointCriteria;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.SimpleExpressionBase;


/**
 * <p>Classe Java de ImmutableObject complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ImmutableObject"&gt;
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
@XmlType(name = "ImmutableObject", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping")
@XmlSeeAlso({
    Color.class,
    Address.class,
    Locality.class,
    AlertParameter.class,
    DriverLog.class,
    LogDetailDto.class,
    EquipmentPosition.class,
    QualityPairedDateTime.class,
    ResourceEvent.class,
    PersonName.class,
    MapDataInfo.class,
    GeocodeResult.class,
    NetworkID.class,
    NetworkArcEndpointID.class,
    NetworkInstanceID.class,
    NetworkSpeedModifier.class,
    QualityPairedDistance.class,
    PointPath.class,
    Polygon.class,
    NetworkArcWeeklyTravelSpeed.class,
    ITimePeriod.class,
    TimeOfWeek.class,
    TravelCost.class,
    SimpleExpressionBase.class,
    ClosestPointCriteria.class
})
public class ImmutableObject
    extends DataTransferObject
{


}
