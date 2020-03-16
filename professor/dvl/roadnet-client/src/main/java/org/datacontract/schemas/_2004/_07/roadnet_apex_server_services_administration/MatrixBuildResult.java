
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
 * <p>Classe Java de MatrixBuildResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MatrixBuildResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BuildCompleteTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BuildDurationInSeconds" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="BuildMsgSendTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BuildServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BuildStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BuildStatus" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="BuildType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CustomerPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MapDatasetPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MatricesBuilt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NewDepots" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NewLocations" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="QueueDurationInSeconds" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ReasonForFullBuild" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
@XmlType(name = "MatrixBuildResult", propOrder = {
    "buildCompleteTime",
    "buildDurationInSeconds",
    "buildMsgSendTime",
    "buildServerName",
    "buildStartTime",
    "buildStatus",
    "buildType",
    "customerPkey",
    "mapDatasetPkey",
    "matricesBuilt",
    "newDepots",
    "newLocations",
    "queueDurationInSeconds",
    "reasonForFullBuild",
    "regionPkey",
    "requestServerName",
    "totalDepots",
    "totalLocations"
})
public class MatrixBuildResult
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
    @XmlElement(name = "BuildStatus")
    protected Long buildStatus;
    @XmlElementRef(name = "BuildType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> buildType;
    @XmlElement(name = "CustomerPkey")
    protected Long customerPkey;
    @XmlElementRef(name = "MapDatasetPkey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> mapDatasetPkey;
    @XmlElementRef(name = "MatricesBuilt", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> matricesBuilt;
    @XmlElementRef(name = "NewDepots", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> newDepots;
    @XmlElementRef(name = "NewLocations", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> newLocations;
    @XmlElementRef(name = "QueueDurationInSeconds", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> queueDurationInSeconds;
    @XmlElementRef(name = "ReasonForFullBuild", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> reasonForFullBuild;
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
     *     {@link Long }
     *     
     */
    public Long getBuildStatus() {
        return buildStatus;
    }

    /**
     * Define o valor da propriedade buildStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBuildStatus(Long value) {
        this.buildStatus = value;
    }

    /**
     * Obtém o valor da propriedade buildType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBuildType() {
        return buildType;
    }

    /**
     * Define o valor da propriedade buildType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBuildType(JAXBElement<Long> value) {
        this.buildType = value;
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
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getReasonForFullBuild() {
        return reasonForFullBuild;
    }

    /**
     * Define o valor da propriedade reasonForFullBuild.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setReasonForFullBuild(JAXBElement<Long> value) {
        this.reasonForFullBuild = value;
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
