
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de RouteWorkerPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteWorkerPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileApplicationType_WorkerMobileApplicationType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerContactNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEnableAutoArriveDepart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerHosStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerMobileCredentials" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerXrsDriverId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerXrsDriverSid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteWorkerPropertyOptions", propOrder = {
    "index",
    "mobileApplicationTypeWorkerMobileApplicationType",
    "workerContactNumber",
    "workerEnableAutoArriveDepart",
    "workerEntityKey",
    "workerHosStatus",
    "workerIdentifier",
    "workerMobileCredentials",
    "workerName",
    "workerXrsDriverId",
    "workerXrsDriverSid"
})
public class RouteWorkerPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "Index")
    protected Boolean index;
    @XmlElement(name = "MobileApplicationType_WorkerMobileApplicationType")
    protected Boolean mobileApplicationTypeWorkerMobileApplicationType;
    @XmlElement(name = "WorkerContactNumber")
    protected Boolean workerContactNumber;
    @XmlElement(name = "WorkerEnableAutoArriveDepart")
    protected Boolean workerEnableAutoArriveDepart;
    @XmlElement(name = "WorkerEntityKey")
    protected Boolean workerEntityKey;
    @XmlElement(name = "WorkerHosStatus")
    protected Boolean workerHosStatus;
    @XmlElement(name = "WorkerIdentifier")
    protected Boolean workerIdentifier;
    @XmlElement(name = "WorkerMobileCredentials")
    protected Boolean workerMobileCredentials;
    @XmlElement(name = "WorkerName")
    protected Boolean workerName;
    @XmlElement(name = "WorkerXrsDriverId")
    protected Boolean workerXrsDriverId;
    @XmlElement(name = "WorkerXrsDriverSid")
    protected Boolean workerXrsDriverSid;

    /**
     * Obtém o valor da propriedade index.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndex() {
        return index;
    }

    /**
     * Define o valor da propriedade index.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndex(Boolean value) {
        this.index = value;
    }

    /**
     * Obtém o valor da propriedade mobileApplicationTypeWorkerMobileApplicationType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileApplicationTypeWorkerMobileApplicationType() {
        return mobileApplicationTypeWorkerMobileApplicationType;
    }

    /**
     * Define o valor da propriedade mobileApplicationTypeWorkerMobileApplicationType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileApplicationTypeWorkerMobileApplicationType(Boolean value) {
        this.mobileApplicationTypeWorkerMobileApplicationType = value;
    }

    /**
     * Obtém o valor da propriedade workerContactNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerContactNumber() {
        return workerContactNumber;
    }

    /**
     * Define o valor da propriedade workerContactNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerContactNumber(Boolean value) {
        this.workerContactNumber = value;
    }

    /**
     * Obtém o valor da propriedade workerEnableAutoArriveDepart.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerEnableAutoArriveDepart() {
        return workerEnableAutoArriveDepart;
    }

    /**
     * Define o valor da propriedade workerEnableAutoArriveDepart.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerEnableAutoArriveDepart(Boolean value) {
        this.workerEnableAutoArriveDepart = value;
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
     * Obtém o valor da propriedade workerHosStatus.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerHosStatus() {
        return workerHosStatus;
    }

    /**
     * Define o valor da propriedade workerHosStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerHosStatus(Boolean value) {
        this.workerHosStatus = value;
    }

    /**
     * Obtém o valor da propriedade workerIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerIdentifier() {
        return workerIdentifier;
    }

    /**
     * Define o valor da propriedade workerIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerIdentifier(Boolean value) {
        this.workerIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade workerMobileCredentials.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerMobileCredentials() {
        return workerMobileCredentials;
    }

    /**
     * Define o valor da propriedade workerMobileCredentials.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerMobileCredentials(Boolean value) {
        this.workerMobileCredentials = value;
    }

    /**
     * Obtém o valor da propriedade workerName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerName() {
        return workerName;
    }

    /**
     * Define o valor da propriedade workerName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerName(Boolean value) {
        this.workerName = value;
    }

    /**
     * Obtém o valor da propriedade workerXrsDriverId.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerXrsDriverId() {
        return workerXrsDriverId;
    }

    /**
     * Define o valor da propriedade workerXrsDriverId.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerXrsDriverId(Boolean value) {
        this.workerXrsDriverId = value;
    }

    /**
     * Obtém o valor da propriedade workerXrsDriverSid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerXrsDriverSid() {
        return workerXrsDriverSid;
    }

    /**
     * Define o valor da propriedade workerXrsDriverSid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerXrsDriverSid(Boolean value) {
        this.workerXrsDriverSid = value;
    }

}
