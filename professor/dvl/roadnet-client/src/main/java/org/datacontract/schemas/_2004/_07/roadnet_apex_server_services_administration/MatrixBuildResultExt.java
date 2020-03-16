
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.AggregateRootEntity;


/**
 * <p>Classe Java de MatrixBuildResultExt complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MatrixBuildResultExt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BuildCompleteTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BuildDurationInSeconds" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="BuildMsgSendTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BuildServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BuildStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BuildStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BuildType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessUnitPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CompletionOrderNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CustomerDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DefaultMapDatasetPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MapDatasetPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MapPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MapPathOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MatricesBuilt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NewDepots" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NewLocations" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NewMapEditsExist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QueueDurationInSeconds" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ReasonForFullBuild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegionPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RequestServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalDepots" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalLocations" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatrixBuildResultExt", propOrder = {
    "buildCompleteTime",
    "buildDurationInSeconds",
    "buildMsgSendTime",
    "buildServerName",
    "buildStartTime",
    "buildStatus",
    "buildType",
    "businessUnitPkey",
    "completionOrderNumber",
    "customerDescription",
    "customerIdentifier",
    "customerPkey",
    "defaultMapDatasetPkey",
    "mapDatasetPkey",
    "mapPath",
    "mapPathOverride",
    "matricesBuilt",
    "newDepots",
    "newLocations",
    "newMapEditsExist",
    "queueDurationInSeconds",
    "reasonForFullBuild",
    "regionDescription",
    "regionIdentifier",
    "regionPkey",
    "requestServerName",
    "totalDepots",
    "totalLocations"
})
public class MatrixBuildResultExt
    extends AggregateRootEntity
{

    @XmlElementRef(name = "BuildCompleteTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> buildCompleteTime;
    @XmlElementRef(name = "BuildDurationInSeconds", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> buildDurationInSeconds;
    @XmlElementRef(name = "BuildMsgSendTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> buildMsgSendTime;
    @XmlElementRef(name = "BuildServerName", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buildServerName;
    @XmlElementRef(name = "BuildStartTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> buildStartTime;
    @XmlElementRef(name = "BuildStatus", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buildStatus;
    @XmlElementRef(name = "BuildType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buildType;
    @XmlElement(name = "BusinessUnitPkey")
    protected Long businessUnitPkey;
    @XmlElement(name = "CompletionOrderNumber")
    protected Long completionOrderNumber;
    @XmlElementRef(name = "CustomerDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerDescription;
    @XmlElementRef(name = "CustomerIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerIdentifier;
    @XmlElement(name = "CustomerPkey")
    protected Long customerPkey;
    @XmlElement(name = "DefaultMapDatasetPkey")
    protected Long defaultMapDatasetPkey;
    @XmlElementRef(name = "MapDatasetPkey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> mapDatasetPkey;
    @XmlElementRef(name = "MapPath", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapPath;
    @XmlElementRef(name = "MapPathOverride", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapPathOverride;
    @XmlElementRef(name = "MatricesBuilt", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> matricesBuilt;
    @XmlElementRef(name = "NewDepots", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> newDepots;
    @XmlElementRef(name = "NewLocations", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> newLocations;
    @XmlElementRef(name = "NewMapEditsExist", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> newMapEditsExist;
    @XmlElementRef(name = "QueueDurationInSeconds", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> queueDurationInSeconds;
    @XmlElementRef(name = "ReasonForFullBuild", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reasonForFullBuild;
    @XmlElementRef(name = "RegionDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionDescription;
    @XmlElementRef(name = "RegionIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionIdentifier;
    @XmlElement(name = "RegionPkey")
    protected Long regionPkey;
    @XmlElementRef(name = "RequestServerName", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestServerName;
    @XmlElementRef(name = "TotalDepots", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalDepots;
    @XmlElementRef(name = "TotalLocations", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalLocations;

    /**
     * Obtém o valor da propriedade buildCompleteTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBuildCompleteTime() {
        return buildCompleteTime;
    }

    /**
     * Define o valor da propriedade buildCompleteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBuildCompleteTime(JAXBElement<XMLGregorianCalendar> value) {
        this.buildCompleteTime = value;
    }

    /**
     * Obtém o valor da propriedade buildDurationInSeconds.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBuildDurationInSeconds() {
        return buildDurationInSeconds;
    }

    /**
     * Define o valor da propriedade buildDurationInSeconds.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBuildDurationInSeconds(JAXBElement<Long> value) {
        this.buildDurationInSeconds = value;
    }

    /**
     * Obtém o valor da propriedade buildMsgSendTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBuildMsgSendTime() {
        return buildMsgSendTime;
    }

    /**
     * Define o valor da propriedade buildMsgSendTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBuildMsgSendTime(JAXBElement<XMLGregorianCalendar> value) {
        this.buildMsgSendTime = value;
    }

    /**
     * Obtém o valor da propriedade buildServerName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuildServerName() {
        return buildServerName;
    }

    /**
     * Define o valor da propriedade buildServerName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuildServerName(JAXBElement<String> value) {
        this.buildServerName = value;
    }

    /**
     * Obtém o valor da propriedade buildStartTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBuildStartTime() {
        return buildStartTime;
    }

    /**
     * Define o valor da propriedade buildStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBuildStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.buildStartTime = value;
    }

    /**
     * Obtém o valor da propriedade buildStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuildStatus() {
        return buildStatus;
    }

    /**
     * Define o valor da propriedade buildStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuildStatus(JAXBElement<String> value) {
        this.buildStatus = value;
    }

    /**
     * Obtém o valor da propriedade buildType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuildType() {
        return buildType;
    }

    /**
     * Define o valor da propriedade buildType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuildType(JAXBElement<String> value) {
        this.buildType = value;
    }

    /**
     * Obtém o valor da propriedade businessUnitPkey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBusinessUnitPkey() {
        return businessUnitPkey;
    }

    /**
     * Define o valor da propriedade businessUnitPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBusinessUnitPkey(Long value) {
        this.businessUnitPkey = value;
    }

    /**
     * Obtém o valor da propriedade completionOrderNumber.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompletionOrderNumber() {
        return completionOrderNumber;
    }

    /**
     * Define o valor da propriedade completionOrderNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompletionOrderNumber(Long value) {
        this.completionOrderNumber = value;
    }

    /**
     * Obtém o valor da propriedade customerDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerDescription() {
        return customerDescription;
    }

    /**
     * Define o valor da propriedade customerDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerDescription(JAXBElement<String> value) {
        this.customerDescription = value;
    }

    /**
     * Obtém o valor da propriedade customerIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * Define o valor da propriedade customerIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerIdentifier(JAXBElement<String> value) {
        this.customerIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade customerPkey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerPkey() {
        return customerPkey;
    }

    /**
     * Define o valor da propriedade customerPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerPkey(Long value) {
        this.customerPkey = value;
    }

    /**
     * Obtém o valor da propriedade defaultMapDatasetPkey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDefaultMapDatasetPkey() {
        return defaultMapDatasetPkey;
    }

    /**
     * Define o valor da propriedade defaultMapDatasetPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDefaultMapDatasetPkey(Long value) {
        this.defaultMapDatasetPkey = value;
    }

    /**
     * Obtém o valor da propriedade mapDatasetPkey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMapDatasetPkey() {
        return mapDatasetPkey;
    }

    /**
     * Define o valor da propriedade mapDatasetPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMapDatasetPkey(JAXBElement<Long> value) {
        this.mapDatasetPkey = value;
    }

    /**
     * Obtém o valor da propriedade mapPath.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMapPath() {
        return mapPath;
    }

    /**
     * Define o valor da propriedade mapPath.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMapPath(JAXBElement<String> value) {
        this.mapPath = value;
    }

    /**
     * Obtém o valor da propriedade mapPathOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMapPathOverride() {
        return mapPathOverride;
    }

    /**
     * Define o valor da propriedade mapPathOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMapPathOverride(JAXBElement<String> value) {
        this.mapPathOverride = value;
    }

    /**
     * Obtém o valor da propriedade matricesBuilt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMatricesBuilt() {
        return matricesBuilt;
    }

    /**
     * Define o valor da propriedade matricesBuilt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMatricesBuilt(JAXBElement<Long> value) {
        this.matricesBuilt = value;
    }

    /**
     * Obtém o valor da propriedade newDepots.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNewDepots() {
        return newDepots;
    }

    /**
     * Define o valor da propriedade newDepots.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNewDepots(JAXBElement<Long> value) {
        this.newDepots = value;
    }

    /**
     * Obtém o valor da propriedade newLocations.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNewLocations() {
        return newLocations;
    }

    /**
     * Define o valor da propriedade newLocations.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNewLocations(JAXBElement<Long> value) {
        this.newLocations = value;
    }

    /**
     * Obtém o valor da propriedade newMapEditsExist.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNewMapEditsExist() {
        return newMapEditsExist;
    }

    /**
     * Define o valor da propriedade newMapEditsExist.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNewMapEditsExist(JAXBElement<Boolean> value) {
        this.newMapEditsExist = value;
    }

    /**
     * Obtém o valor da propriedade queueDurationInSeconds.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getQueueDurationInSeconds() {
        return queueDurationInSeconds;
    }

    /**
     * Define o valor da propriedade queueDurationInSeconds.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setQueueDurationInSeconds(JAXBElement<Long> value) {
        this.queueDurationInSeconds = value;
    }

    /**
     * Obtém o valor da propriedade reasonForFullBuild.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReasonForFullBuild() {
        return reasonForFullBuild;
    }

    /**
     * Define o valor da propriedade reasonForFullBuild.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReasonForFullBuild(JAXBElement<String> value) {
        this.reasonForFullBuild = value;
    }

    /**
     * Obtém o valor da propriedade regionDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegionDescription() {
        return regionDescription;
    }

    /**
     * Define o valor da propriedade regionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegionDescription(JAXBElement<String> value) {
        this.regionDescription = value;
    }

    /**
     * Obtém o valor da propriedade regionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegionIdentifier() {
        return regionIdentifier;
    }

    /**
     * Define o valor da propriedade regionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegionIdentifier(JAXBElement<String> value) {
        this.regionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade regionPkey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegionPkey() {
        return regionPkey;
    }

    /**
     * Define o valor da propriedade regionPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegionPkey(Long value) {
        this.regionPkey = value;
    }

    /**
     * Obtém o valor da propriedade requestServerName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestServerName() {
        return requestServerName;
    }

    /**
     * Define o valor da propriedade requestServerName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestServerName(JAXBElement<String> value) {
        this.requestServerName = value;
    }

    /**
     * Obtém o valor da propriedade totalDepots.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalDepots() {
        return totalDepots;
    }

    /**
     * Define o valor da propriedade totalDepots.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalDepots(JAXBElement<Long> value) {
        this.totalDepots = value;
    }

    /**
     * Obtém o valor da propriedade totalLocations.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalLocations() {
        return totalLocations;
    }

    /**
     * Define o valor da propriedade totalLocations.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalLocations(JAXBElement<Long> value) {
        this.totalLocations = value;
    }

}
