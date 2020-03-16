
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RegionBasedAggregateRootEntityPropertyOptions;


/**
 * <p>Classe Java de WorkerLogEventPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WorkerLogEventPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Coordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EditTimestamp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EventDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCurrent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationDetail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Odometer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SensorFailure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerLogCreationMethod_CreationMethod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerLogEventType_EventType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsRecordSid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkerLogEventPropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", propOrder = {
    "coordinate",
    "deviceEntityKey",
    "editTimestamp",
    "eventDuration",
    "isCurrent",
    "locationDetail",
    "odometer",
    "remark",
    "sensorFailure",
    "sequence",
    "timestamp",
    "workerEntityKey",
    "workerLogCreationMethodCreationMethod",
    "workerLogEventTypeEventType",
    "xrsRecordSid"
})
public class WorkerLogEventPropertyOptions
    extends RegionBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "Coordinate")
    protected Boolean coordinate;
    @XmlElement(name = "DeviceEntityKey")
    protected Boolean deviceEntityKey;
    @XmlElement(name = "EditTimestamp")
    protected Boolean editTimestamp;
    @XmlElement(name = "EventDuration")
    protected Boolean eventDuration;
    @XmlElement(name = "IsCurrent")
    protected Boolean isCurrent;
    @XmlElement(name = "LocationDetail")
    protected Boolean locationDetail;
    @XmlElement(name = "Odometer")
    protected Boolean odometer;
    @XmlElement(name = "Remark")
    protected Boolean remark;
    @XmlElement(name = "SensorFailure")
    protected Boolean sensorFailure;
    @XmlElement(name = "Sequence")
    protected Boolean sequence;
    @XmlElement(name = "Timestamp")
    protected Boolean timestamp;
    @XmlElement(name = "WorkerEntityKey")
    protected Boolean workerEntityKey;
    @XmlElement(name = "WorkerLogCreationMethod_CreationMethod")
    protected Boolean workerLogCreationMethodCreationMethod;
    @XmlElement(name = "WorkerLogEventType_EventType")
    protected Boolean workerLogEventTypeEventType;
    @XmlElement(name = "XrsRecordSid")
    protected Boolean xrsRecordSid;

    /**
     * Obtém o valor da propriedade coordinate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoordinate() {
        return coordinate;
    }

    /**
     * Define o valor da propriedade coordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoordinate(Boolean value) {
        this.coordinate = value;
    }

    /**
     * Obtém o valor da propriedade deviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeviceEntityKey() {
        return deviceEntityKey;
    }

    /**
     * Define o valor da propriedade deviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeviceEntityKey(Boolean value) {
        this.deviceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade editTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEditTimestamp() {
        return editTimestamp;
    }

    /**
     * Define o valor da propriedade editTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEditTimestamp(Boolean value) {
        this.editTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade eventDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEventDuration() {
        return eventDuration;
    }

    /**
     * Define o valor da propriedade eventDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEventDuration(Boolean value) {
        this.eventDuration = value;
    }

    /**
     * Obtém o valor da propriedade isCurrent.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCurrent() {
        return isCurrent;
    }

    /**
     * Define o valor da propriedade isCurrent.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCurrent(Boolean value) {
        this.isCurrent = value;
    }

    /**
     * Obtém o valor da propriedade locationDetail.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationDetail() {
        return locationDetail;
    }

    /**
     * Define o valor da propriedade locationDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationDetail(Boolean value) {
        this.locationDetail = value;
    }

    /**
     * Obtém o valor da propriedade odometer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOdometer() {
        return odometer;
    }

    /**
     * Define o valor da propriedade odometer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOdometer(Boolean value) {
        this.odometer = value;
    }

    /**
     * Obtém o valor da propriedade remark.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemark() {
        return remark;
    }

    /**
     * Define o valor da propriedade remark.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemark(Boolean value) {
        this.remark = value;
    }

    /**
     * Obtém o valor da propriedade sensorFailure.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSensorFailure() {
        return sensorFailure;
    }

    /**
     * Define o valor da propriedade sensorFailure.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSensorFailure(Boolean value) {
        this.sensorFailure = value;
    }

    /**
     * Obtém o valor da propriedade sequence.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSequence() {
        return sequence;
    }

    /**
     * Define o valor da propriedade sequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSequence(Boolean value) {
        this.sequence = value;
    }

    /**
     * Obtém o valor da propriedade timestamp.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimestamp() {
        return timestamp;
    }

    /**
     * Define o valor da propriedade timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimestamp(Boolean value) {
        this.timestamp = value;
    }

    /**
     * Obtém o valor da propriedade workerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerEntityKey() {
        return workerEntityKey;
    }

    /**
     * Define o valor da propriedade workerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerEntityKey(Boolean value) {
        this.workerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade workerLogCreationMethodCreationMethod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerLogCreationMethodCreationMethod() {
        return workerLogCreationMethodCreationMethod;
    }

    /**
     * Define o valor da propriedade workerLogCreationMethodCreationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerLogCreationMethodCreationMethod(Boolean value) {
        this.workerLogCreationMethodCreationMethod = value;
    }

    /**
     * Obtém o valor da propriedade workerLogEventTypeEventType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerLogEventTypeEventType() {
        return workerLogEventTypeEventType;
    }

    /**
     * Define o valor da propriedade workerLogEventTypeEventType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerLogEventTypeEventType(Boolean value) {
        this.workerLogEventTypeEventType = value;
    }

    /**
     * Obtém o valor da propriedade xrsRecordSid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXrsRecordSid() {
        return xrsRecordSid;
    }

    /**
     * Define o valor da propriedade xrsRecordSid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXrsRecordSid(Boolean value) {
        this.xrsRecordSid = value;
    }

}
