
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de EquipmentInspection complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentInspection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DistanceUnit_DistanceUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentDefects" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentInspectionAssetType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FailedInspection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HazardousMaterials" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InspectionType_InspectionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsSafeToOperate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastInspectionAcknowledgement_LastAcknowledgement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManualEnterLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Odometer" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="OtherDefects" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProcessDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentInspection", propOrder = {
    "clientComment",
    "distanceUnitDistanceUnit",
    "equipmentDefects",
    "equipmentInspectionAssetTypeType",
    "failedInspection",
    "hazardousMaterials",
    "inspectionTypeInspectionType",
    "isSafeToOperate",
    "lastInspectionAcknowledgementLastAcknowledgement",
    "manualEnterLocationName",
    "odometer",
    "otherDefects",
    "processDuration"
})
public class EquipmentInspection
    extends DataTransferObject
{

    @XmlElementRef(name = "ClientComment", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientComment;
    @XmlElementRef(name = "DistanceUnit_DistanceUnit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distanceUnitDistanceUnit;
    @XmlElementRef(name = "EquipmentDefects", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentDefects;
    @XmlElementRef(name = "EquipmentInspectionAssetType_Type", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentInspectionAssetTypeType;
    @XmlElement(name = "FailedInspection")
    protected Boolean failedInspection;
    @XmlElement(name = "HazardousMaterials")
    protected Boolean hazardousMaterials;
    @XmlElementRef(name = "InspectionType_InspectionType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inspectionTypeInspectionType;
    @XmlElement(name = "IsSafeToOperate")
    protected Boolean isSafeToOperate;
    @XmlElementRef(name = "LastInspectionAcknowledgement_LastAcknowledgement", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastInspectionAcknowledgementLastAcknowledgement;
    @XmlElementRef(name = "ManualEnterLocationName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manualEnterLocationName;
    @XmlElement(name = "Odometer")
    protected Float odometer;
    @XmlElementRef(name = "OtherDefects", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otherDefects;
    @XmlElement(name = "ProcessDuration")
    protected Integer processDuration;

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
     * Obtém o valor da propriedade equipmentDefects.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentDefects() {
        return equipmentDefects;
    }

    /**
     * Define o valor da propriedade equipmentDefects.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentDefects(JAXBElement<String> value) {
        this.equipmentDefects = value;
    }

    /**
     * Obtém o valor da propriedade equipmentInspectionAssetTypeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentInspectionAssetTypeType() {
        return equipmentInspectionAssetTypeType;
    }

    /**
     * Define o valor da propriedade equipmentInspectionAssetTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentInspectionAssetTypeType(JAXBElement<String> value) {
        this.equipmentInspectionAssetTypeType = value;
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
     * Obtém o valor da propriedade hazardousMaterials.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHazardousMaterials() {
        return hazardousMaterials;
    }

    /**
     * Define o valor da propriedade hazardousMaterials.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHazardousMaterials(Boolean value) {
        this.hazardousMaterials = value;
    }

    /**
     * Obtém o valor da propriedade inspectionTypeInspectionType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInspectionTypeInspectionType() {
        return inspectionTypeInspectionType;
    }

    /**
     * Define o valor da propriedade inspectionTypeInspectionType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInspectionTypeInspectionType(JAXBElement<String> value) {
        this.inspectionTypeInspectionType = value;
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
     * Obtém o valor da propriedade manualEnterLocationName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManualEnterLocationName() {
        return manualEnterLocationName;
    }

    /**
     * Define o valor da propriedade manualEnterLocationName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManualEnterLocationName(JAXBElement<String> value) {
        this.manualEnterLocationName = value;
    }

    /**
     * Obtém o valor da propriedade odometer.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOdometer() {
        return odometer;
    }

    /**
     * Define o valor da propriedade odometer.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOdometer(Float value) {
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
     * Obtém o valor da propriedade processDuration.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProcessDuration() {
        return processDuration;
    }

    /**
     * Define o valor da propriedade processDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProcessDuration(Integer value) {
        this.processDuration = value;
    }

}
