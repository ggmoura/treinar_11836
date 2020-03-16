
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de MobileDeviceAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MobileDeviceAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataCommunicationsType_DataCommunicationsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileDeviceAction", propOrder = {
    "dataCommunicationsTypeDataCommunicationsType",
    "messageId",
    "timestamp"
})
@XmlSeeAlso({
    RemoveStopsAction.class,
    DiagnosticTroubleCodeUpdateAction.class,
    LogOffAction.class,
    LogOnAction.class,
    ReportClientApplicationInfoAction.class,
    GroupStopBasedAction.class,
    RouteOptimizationResponseAction.class,
    SendCompressedDataSetAction.class,
    StationaryEndAction.class,
    StationaryStartAction.class,
    EquipmentDropHookAction.class,
    TelematicsDeviceCommsStatusUpdateAction.class,
    TelematicsDeviceIgnitionKillSwitchResponseAction.class,
    TelematicsDeviceOutputChangeResponseAction.class,
    ServiceConfirmationAction.class,
    VehicleBusInfoUpdateAction.class,
    ActiveTroubleCodesUpdateAction.class,
    AddNonServiceableStopAction.class,
    AssociateStationaryEventAction.class,
    LineItemAddOrUpdateAction.class,
    LocationCommentsDeleteAction.class,
    LocationCommentsSaveAction.class,
    NavClientAction.class,
    TelematicsDeviceInputChangedAction.class,
    PanicButtonTriggeredAction.class,
    WorkerStatusUpdateAction.class,
    CustomFormResponseAction.class,
    LineItemUpdateAction.class,
    OrderUpdateAction.class,
    StopBasedActionDto.class,
    IgnitionStateChangedAction.class,
    VehicleStatusUpdateAction.class,
    TelematicsDeviceDiagnosticsUpdateAction.class,
    HarshDrivingAction.class,
    AddServiceableStopAction.class,
    EndBreakAction.class,
    EndWorkAction.class,
    ResequencePendingStopsAction.class,
    StartBreakAction.class,
    StartWorkAction.class,
    BatteryDiagnosticsUpdateAction.class,
    PositionUpdateAction.class,
    UpdateNonServiceableStopAction.class,
    ArriveDestinationAction.class,
    CancelStopsAction.class,
    CompleteRouteAction.class,
    DepartOriginAction.class,
    ResequenceStopAction.class,
    SendNoteAction.class,
    StartRouteAction.class,
    DeliveryDetailsUpdateAction.class
})
public class MobileDeviceAction
    extends DataTransferObject
{

    @XmlElementRef(name = "DataCommunicationsType_DataCommunicationsType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataCommunicationsTypeDataCommunicationsType;
    @XmlElementRef(name = "MessageId", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> messageId;
    @XmlElement(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

    /**
     * Obtém o valor da propriedade dataCommunicationsTypeDataCommunicationsType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataCommunicationsTypeDataCommunicationsType() {
        return dataCommunicationsTypeDataCommunicationsType;
    }

    /**
     * Define o valor da propriedade dataCommunicationsTypeDataCommunicationsType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataCommunicationsTypeDataCommunicationsType(JAXBElement<String> value) {
        this.dataCommunicationsTypeDataCommunicationsType = value;
    }

    /**
     * Obtém o valor da propriedade messageId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMessageId() {
        return messageId;
    }

    /**
     * Define o valor da propriedade messageId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMessageId(JAXBElement<Integer> value) {
        this.messageId = value;
    }

    /**
     * Obtém o valor da propriedade timestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Define o valor da propriedade timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

}
