
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DVIRResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DVIRResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssetType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ClientComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Coordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="Defects" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefectsCorrected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DistanceUnit_DistanceUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FailedInspection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InspectionDefects" type="{http://roadnet.com/apex/DataContracts/}ArrayOfInspectionDefect" minOccurs="0"/&gt;
 *         &lt;element name="InspectionType_DVIRInspectionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsSafeToOperate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastInspectionAcknowledgement_LastAcknowledgement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicensePlateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Odometer" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="OtherDefects" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecordTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerName" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVIRResult", propOrder = {
    "assetType",
    "clientComment",
    "comment",
    "coordinate",
    "defects",
    "defectsCorrected",
    "distanceUnitDistanceUnit",
    "equipmentIdentifier",
    "failedInspection",
    "inspectionDefects",
    "inspectionTypeDVIRInspectionType",
    "isSafeToOperate",
    "lastInspectionAcknowledgementLastAcknowledgement",
    "licensePlateNumber",
    "locationName",
    "mode",
    "modifiedBy",
    "modifiedDate",
    "odometer",
    "otherDefects",
    "recordTime",
    "remark",
    "vehicleIdentificationNumber",
    "workerID",
    "workerName"
})
public class DVIRResult
    extends DataTransferObject
{

    @XmlElement(name = "AssetType")
    protected Integer assetType;
    @XmlElementRef(name = "ClientComment", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientComment;
    @XmlElementRef(name = "Comment", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "Coordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinate;
    @XmlElementRef(name = "Defects", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defects;
    @XmlElement(name = "DefectsCorrected")
    protected Boolean defectsCorrected;
    @XmlElementRef(name = "DistanceUnit_DistanceUnit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distanceUnitDistanceUnit;
    @XmlElementRef(name = "EquipmentIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentIdentifier;
    @XmlElement(name = "FailedInspection")
    protected Boolean failedInspection;
    @XmlElementRef(name = "InspectionDefects", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInspectionDefect> inspectionDefects;
    @XmlElementRef(name = "InspectionType_DVIRInspectionType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inspectionTypeDVIRInspectionType;
    @XmlElement(name = "IsSafeToOperate")
    protected Boolean isSafeToOperate;
    @XmlElementRef(name = "LastInspectionAcknowledgement_LastAcknowledgement", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastInspectionAcknowledgementLastAcknowledgement;
    @XmlElementRef(name = "LicensePlateNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> licensePlateNumber;
    @XmlElementRef(name = "LocationName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationName;
    @XmlElement(name = "Mode")
    protected Integer mode;
    @XmlElement(name = "ModifiedBy")
    protected Long modifiedBy;
    @XmlElement(name = "ModifiedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDate;
    @XmlElement(name = "Odometer")
    protected Double odometer;
    @XmlElementRef(name = "OtherDefects", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otherDefects;
    @XmlElement(name = "RecordTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recordTime;
    @XmlElementRef(name = "Remark", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remark;
    @XmlElementRef(name = "VehicleIdentificationNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleIdentificationNumber;
    @XmlElementRef(name = "WorkerID", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerID;
    @XmlElementRef(name = "WorkerName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> workerName;

    /**
     * Obtém o valor da propriedade assetType.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAssetType() {
        return assetType;
    }

    /**
     * Define o valor da propriedade assetType.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAssetType(Integer value) {
        this.assetType = value;
    }

    /**
     * Obtém o valor da propriedade clientComment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientComment() {
        return clientComment;
    }

    /**
     * Define o valor da propriedade clientComment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientComment(JAXBElement<String> value) {
        this.clientComment = value;
    }

    /**
     * Obtém o valor da propriedade comment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Define o valor da propriedade comment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = value;
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
     * Obtém o valor da propriedade defects.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefects() {
        return defects;
    }

    /**
     * Define o valor da propriedade defects.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefects(JAXBElement<String> value) {
        this.defects = value;
    }

    /**
     * Obtém o valor da propriedade defectsCorrected.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefectsCorrected() {
        return defectsCorrected;
    }

    /**
     * Define o valor da propriedade defectsCorrected.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefectsCorrected(Boolean value) {
        this.defectsCorrected = value;
    }

    /**
     * Obtém o valor da propriedade distanceUnitDistanceUnit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistanceUnitDistanceUnit() {
        return distanceUnitDistanceUnit;
    }

    /**
     * Define o valor da propriedade distanceUnitDistanceUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistanceUnitDistanceUnit(JAXBElement<String> value) {
        this.distanceUnitDistanceUnit = value;
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
     * Obtém o valor da propriedade failedInspection.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailedInspection() {
        return failedInspection;
    }

    /**
     * Define o valor da propriedade failedInspection.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailedInspection(Boolean value) {
        this.failedInspection = value;
    }

    /**
     * Obtém o valor da propriedade inspectionDefects.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInspectionDefect }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInspectionDefect> getInspectionDefects() {
        return inspectionDefects;
    }

    /**
     * Define o valor da propriedade inspectionDefects.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInspectionDefect }{@code >}
     *     
     */
    public void setInspectionDefects(JAXBElement<ArrayOfInspectionDefect> value) {
        this.inspectionDefects = value;
    }

    /**
     * Obtém o valor da propriedade inspectionTypeDVIRInspectionType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInspectionTypeDVIRInspectionType() {
        return inspectionTypeDVIRInspectionType;
    }

    /**
     * Define o valor da propriedade inspectionTypeDVIRInspectionType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInspectionTypeDVIRInspectionType(JAXBElement<String> value) {
        this.inspectionTypeDVIRInspectionType = value;
    }

    /**
     * Obtém o valor da propriedade isSafeToOperate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSafeToOperate() {
        return isSafeToOperate;
    }

    /**
     * Define o valor da propriedade isSafeToOperate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSafeToOperate(Boolean value) {
        this.isSafeToOperate = value;
    }

    /**
     * Obtém o valor da propriedade lastInspectionAcknowledgementLastAcknowledgement.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastInspectionAcknowledgementLastAcknowledgement() {
        return lastInspectionAcknowledgementLastAcknowledgement;
    }

    /**
     * Define o valor da propriedade lastInspectionAcknowledgementLastAcknowledgement.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastInspectionAcknowledgementLastAcknowledgement(JAXBElement<String> value) {
        this.lastInspectionAcknowledgementLastAcknowledgement = value;
    }

    /**
     * Obtém o valor da propriedade licensePlateNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLicensePlateNumber() {
        return licensePlateNumber;
    }

    /**
     * Define o valor da propriedade licensePlateNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLicensePlateNumber(JAXBElement<String> value) {
        this.licensePlateNumber = value;
    }

    /**
     * Obtém o valor da propriedade locationName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationName() {
        return locationName;
    }

    /**
     * Define o valor da propriedade locationName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationName(JAXBElement<String> value) {
        this.locationName = value;
    }

    /**
     * Obtém o valor da propriedade mode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMode() {
        return mode;
    }

    /**
     * Define o valor da propriedade mode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMode(Integer value) {
        this.mode = value;
    }

    /**
     * Obtém o valor da propriedade modifiedBy.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Define o valor da propriedade modifiedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setModifiedBy(Long value) {
        this.modifiedBy = value;
    }

    /**
     * Obtém o valor da propriedade modifiedDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Define o valor da propriedade modifiedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDate(XMLGregorianCalendar value) {
        this.modifiedDate = value;
    }

    /**
     * Obtém o valor da propriedade odometer.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOdometer() {
        return odometer;
    }

    /**
     * Define o valor da propriedade odometer.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOdometer(Double value) {
        this.odometer = value;
    }

    /**
     * Obtém o valor da propriedade otherDefects.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtherDefects() {
        return otherDefects;
    }

    /**
     * Define o valor da propriedade otherDefects.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtherDefects(JAXBElement<String> value) {
        this.otherDefects = value;
    }

    /**
     * Obtém o valor da propriedade recordTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecordTime() {
        return recordTime;
    }

    /**
     * Define o valor da propriedade recordTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecordTime(XMLGregorianCalendar value) {
        this.recordTime = value;
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
     * Obtém o valor da propriedade vehicleIdentificationNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }

    /**
     * Define o valor da propriedade vehicleIdentificationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleIdentificationNumber(JAXBElement<String> value) {
        this.vehicleIdentificationNumber = value;
    }

    /**
     * Obtém o valor da propriedade workerID.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerID() {
        return workerID;
    }

    /**
     * Define o valor da propriedade workerID.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerID(JAXBElement<String> value) {
        this.workerID = value;
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

}
