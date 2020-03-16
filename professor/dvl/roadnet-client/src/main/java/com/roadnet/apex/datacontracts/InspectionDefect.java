
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
 * <p>Classe Java de InspectionDefect complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="InspectionDefect"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApproverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CertifiedStatus_CertifiedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefectSeverity_Severity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DriverComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentInspection" type="{http://roadnet.com/apex/DataContracts/}EquipmentInspection" minOccurs="0"/&gt;
 *         &lt;element name="InspectionDriverIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InspectionVehicleIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MarkForDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RepairCertified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RepairCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RepairDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RepairOrderBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkPerformed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkPerformedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InspectionDefect", propOrder = {
    "approverName",
    "certifiedDate",
    "certifiedStatusCertifiedStatus",
    "defectName",
    "defectSeveritySeverity",
    "driverComment",
    "equipmentInspection",
    "inspectionDriverIdentity",
    "inspectionVehicleIdentity",
    "markForDelete",
    "modifiedBy",
    "modifiedDate",
    "repairCertified",
    "repairCompleted",
    "repairDate",
    "repairOrderBy",
    "workPerformed",
    "workPerformedBy"
})
public class InspectionDefect
    extends DataTransferObject
{

    @XmlElementRef(name = "ApproverName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> approverName;
    @XmlElement(name = "CertifiedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar certifiedDate;
    @XmlElementRef(name = "CertifiedStatus_CertifiedStatus", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certifiedStatusCertifiedStatus;
    @XmlElementRef(name = "DefectName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defectName;
    @XmlElementRef(name = "DefectSeverity_Severity", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defectSeveritySeverity;
    @XmlElementRef(name = "DriverComment", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> driverComment;
    @XmlElementRef(name = "EquipmentInspection", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<EquipmentInspection> equipmentInspection;
    @XmlElementRef(name = "InspectionDriverIdentity", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inspectionDriverIdentity;
    @XmlElementRef(name = "InspectionVehicleIdentity", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inspectionVehicleIdentity;
    @XmlElement(name = "MarkForDelete")
    protected Boolean markForDelete;
    @XmlElement(name = "ModifiedBy")
    protected Long modifiedBy;
    @XmlElement(name = "ModifiedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDate;
    @XmlElementRef(name = "RepairCertified", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> repairCertified;
    @XmlElement(name = "RepairCompleted")
    protected Boolean repairCompleted;
    @XmlElement(name = "RepairDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar repairDate;
    @XmlElementRef(name = "RepairOrderBy", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> repairOrderBy;
    @XmlElementRef(name = "WorkPerformed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workPerformed;
    @XmlElementRef(name = "WorkPerformedBy", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workPerformedBy;

    /**
     * Obtém o valor da propriedade approverName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApproverName() {
        return approverName;
    }

    /**
     * Define o valor da propriedade approverName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApproverName(JAXBElement<String> value) {
        this.approverName = value;
    }

    /**
     * Obtém o valor da propriedade certifiedDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCertifiedDate() {
        return certifiedDate;
    }

    /**
     * Define o valor da propriedade certifiedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCertifiedDate(XMLGregorianCalendar value) {
        this.certifiedDate = value;
    }

    /**
     * Obtém o valor da propriedade certifiedStatusCertifiedStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCertifiedStatusCertifiedStatus() {
        return certifiedStatusCertifiedStatus;
    }

    /**
     * Define o valor da propriedade certifiedStatusCertifiedStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCertifiedStatusCertifiedStatus(JAXBElement<String> value) {
        this.certifiedStatusCertifiedStatus = value;
    }

    /**
     * Obtém o valor da propriedade defectName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefectName() {
        return defectName;
    }

    /**
     * Define o valor da propriedade defectName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefectName(JAXBElement<String> value) {
        this.defectName = value;
    }

    /**
     * Obtém o valor da propriedade defectSeveritySeverity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefectSeveritySeverity() {
        return defectSeveritySeverity;
    }

    /**
     * Define o valor da propriedade defectSeveritySeverity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefectSeveritySeverity(JAXBElement<String> value) {
        this.defectSeveritySeverity = value;
    }

    /**
     * Obtém o valor da propriedade driverComment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDriverComment() {
        return driverComment;
    }

    /**
     * Define o valor da propriedade driverComment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDriverComment(JAXBElement<String> value) {
        this.driverComment = value;
    }

    /**
     * Obtém o valor da propriedade equipmentInspection.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EquipmentInspection }{@code >}
     *     
     */
    public JAXBElement<EquipmentInspection> getEquipmentInspection() {
        return equipmentInspection;
    }

    /**
     * Define o valor da propriedade equipmentInspection.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EquipmentInspection }{@code >}
     *     
     */
    public void setEquipmentInspection(JAXBElement<EquipmentInspection> value) {
        this.equipmentInspection = value;
    }

    /**
     * Obtém o valor da propriedade inspectionDriverIdentity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInspectionDriverIdentity() {
        return inspectionDriverIdentity;
    }

    /**
     * Define o valor da propriedade inspectionDriverIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInspectionDriverIdentity(JAXBElement<String> value) {
        this.inspectionDriverIdentity = value;
    }

    /**
     * Obtém o valor da propriedade inspectionVehicleIdentity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInspectionVehicleIdentity() {
        return inspectionVehicleIdentity;
    }

    /**
     * Define o valor da propriedade inspectionVehicleIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInspectionVehicleIdentity(JAXBElement<String> value) {
        this.inspectionVehicleIdentity = value;
    }

    /**
     * Obtém o valor da propriedade markForDelete.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarkForDelete() {
        return markForDelete;
    }

    /**
     * Define o valor da propriedade markForDelete.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkForDelete(Boolean value) {
        this.markForDelete = value;
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
     * Obtém o valor da propriedade repairCertified.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRepairCertified() {
        return repairCertified;
    }

    /**
     * Define o valor da propriedade repairCertified.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRepairCertified(JAXBElement<Boolean> value) {
        this.repairCertified = value;
    }

    /**
     * Obtém o valor da propriedade repairCompleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRepairCompleted() {
        return repairCompleted;
    }

    /**
     * Define o valor da propriedade repairCompleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepairCompleted(Boolean value) {
        this.repairCompleted = value;
    }

    /**
     * Obtém o valor da propriedade repairDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRepairDate() {
        return repairDate;
    }

    /**
     * Define o valor da propriedade repairDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRepairDate(XMLGregorianCalendar value) {
        this.repairDate = value;
    }

    /**
     * Obtém o valor da propriedade repairOrderBy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRepairOrderBy() {
        return repairOrderBy;
    }

    /**
     * Define o valor da propriedade repairOrderBy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRepairOrderBy(JAXBElement<String> value) {
        this.repairOrderBy = value;
    }

    /**
     * Obtém o valor da propriedade workPerformed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkPerformed() {
        return workPerformed;
    }

    /**
     * Define o valor da propriedade workPerformed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkPerformed(JAXBElement<String> value) {
        this.workPerformed = value;
    }

    /**
     * Obtém o valor da propriedade workPerformedBy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkPerformedBy() {
        return workPerformedBy;
    }

    /**
     * Define o valor da propriedade workPerformedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkPerformedBy(JAXBElement<String> value) {
        this.workPerformedBy = value;
    }

}
