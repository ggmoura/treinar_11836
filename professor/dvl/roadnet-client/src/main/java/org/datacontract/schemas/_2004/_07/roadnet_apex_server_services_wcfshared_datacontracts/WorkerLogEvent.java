
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.Coordinate;
import com.roadnet.apex.datacontracts.Distance;
import com.roadnet.apex.datacontracts.RegionBasedAggregateRootEntity;


/**
 * <p>Classe Java de WorkerLogEvent complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WorkerLogEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Coordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="DeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EditTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EventDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="IsCurrent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Odometer" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SensorFailure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="WorkerLogCreationMethod_CreationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerLogEventType_EventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XrsRecordSid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkerLogEvent", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", propOrder = {
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
public class WorkerLogEvent
    extends RegionBasedAggregateRootEntity
{

    @XmlElementRef(name = "Coordinate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinate;
    @XmlElementRef(name = "DeviceEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> deviceEntityKey;
    @XmlElementRef(name = "EditTimestamp", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> editTimestamp;
    @XmlElement(name = "EventDuration")
    protected Duration eventDuration;
    @XmlElement(name = "IsCurrent")
    protected Boolean isCurrent;
    @XmlElementRef(name = "LocationDetail", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationDetail;
    @XmlElementRef(name = "Odometer", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> odometer;
    @XmlElementRef(name = "Remark", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remark;
    @XmlElement(name = "SensorFailure")
    protected Boolean sensorFailure;
    @XmlElement(name = "Sequence")
    protected Integer sequence;
    @XmlElement(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "WorkerEntityKey")
    protected Long workerEntityKey;
    @XmlElementRef(name = "WorkerLogCreationMethod_CreationMethod", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerLogCreationMethodCreationMethod;
    @XmlElementRef(name = "WorkerLogEventType_EventType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.HOS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerLogEventTypeEventType;
    @XmlElement(name = "XrsRecordSid")
    protected Long xrsRecordSid;

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
     * Obtém o valor da propriedade deviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDeviceEntityKey() {
        return deviceEntityKey;
    }

    /**
     * Define o valor da propriedade deviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDeviceEntityKey(JAXBElement<Long> value) {
        this.deviceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade editTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEditTimestamp() {
        return editTimestamp;
    }

    /**
     * Define o valor da propriedade editTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEditTimestamp(JAXBElement<XMLGregorianCalendar> value) {
        this.editTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade eventDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEventDuration() {
        return eventDuration;
    }

    /**
     * Define o valor da propriedade eventDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEventDuration(Duration value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationDetail() {
        return locationDetail;
    }

    /**
     * Define o valor da propriedade locationDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationDetail(JAXBElement<String> value) {
        this.locationDetail = value;
    }

    /**
     * Obtém o valor da propriedade odometer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getOdometer() {
        return odometer;
    }

    /**
     * Define o valor da propriedade odometer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setOdometer(JAXBElement<Distance> value) {
        this.odometer = value;
    }

    /**
     * Obtém o valor da propriedade remark.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemark() {
        return remark;
    }

    /**
     * Define o valor da propriedade remark.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemark(JAXBElement<String> value) {
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
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Define o valor da propriedade sequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(Integer value) {
        this.sequence = value;
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

    /**
     * Obtém o valor da propriedade workerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkerEntityKey() {
        return workerEntityKey;
    }

    /**
     * Define o valor da propriedade workerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkerEntityKey(Long value) {
        this.workerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade workerLogCreationMethodCreationMethod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerLogCreationMethodCreationMethod() {
        return workerLogCreationMethodCreationMethod;
    }

    /**
     * Define o valor da propriedade workerLogCreationMethodCreationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerLogCreationMethodCreationMethod(JAXBElement<String> value) {
        this.workerLogCreationMethodCreationMethod = value;
    }

    /**
     * Obtém o valor da propriedade workerLogEventTypeEventType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerLogEventTypeEventType() {
        return workerLogEventTypeEventType;
    }

    /**
     * Define o valor da propriedade workerLogEventTypeEventType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerLogEventTypeEventType(JAXBElement<String> value) {
        this.workerLogEventTypeEventType = value;
    }

    /**
     * Obtém o valor da propriedade xrsRecordSid.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getXrsRecordSid() {
        return xrsRecordSid;
    }

    /**
     * Define o valor da propriedade xrsRecordSid.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setXrsRecordSid(Long value) {
        this.xrsRecordSid = value;
    }

}
