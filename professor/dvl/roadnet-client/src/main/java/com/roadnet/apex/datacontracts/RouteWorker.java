
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de RouteWorker complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteWorker"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MobileApplicationType_WorkerMobileApplicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerContactNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEnableAutoArriveDepart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="WorkerHosStatus" type="{http://roadnet.com/apex/DataContracts/}WorkerHosStatus" minOccurs="0"/&gt;
 *         &lt;element name="WorkerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerMobileCredentials" type="{http://roadnet.com/apex/DataContracts/}WorkerMobileCredentials" minOccurs="0"/&gt;
 *         &lt;element name="WorkerName" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="WorkerXrsDriverId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerXrsDriverSid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteWorker", propOrder = {
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
public class RouteWorker
    extends DomainEntity
{

    @XmlElement(name = "Index")
    protected Integer index;
    @XmlElementRef(name = "MobileApplicationType_WorkerMobileApplicationType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileApplicationTypeWorkerMobileApplicationType;
    @XmlElementRef(name = "WorkerContactNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerContactNumber;
    @XmlElement(name = "WorkerEnableAutoArriveDepart")
    protected Boolean workerEnableAutoArriveDepart;
    @XmlElement(name = "WorkerEntityKey")
    protected Long workerEntityKey;
    @XmlElementRef(name = "WorkerHosStatus", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<WorkerHosStatus> workerHosStatus;
    @XmlElementRef(name = "WorkerIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerIdentifier;
    @XmlElementRef(name = "WorkerMobileCredentials", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<WorkerMobileCredentials> workerMobileCredentials;
    @XmlElementRef(name = "WorkerName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> workerName;
    @XmlElementRef(name = "WorkerXrsDriverId", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerXrsDriverId;
    @XmlElementRef(name = "WorkerXrsDriverSid", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> workerXrsDriverSid;

    /**
     * Obtém o valor da propriedade index.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * Define o valor da propriedade index.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

    /**
     * Obtém o valor da propriedade mobileApplicationTypeWorkerMobileApplicationType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileApplicationTypeWorkerMobileApplicationType() {
        return mobileApplicationTypeWorkerMobileApplicationType;
    }

    /**
     * Define o valor da propriedade mobileApplicationTypeWorkerMobileApplicationType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileApplicationTypeWorkerMobileApplicationType(JAXBElement<String> value) {
        this.mobileApplicationTypeWorkerMobileApplicationType = value;
    }

    /**
     * Obtém o valor da propriedade workerContactNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerContactNumber() {
        return workerContactNumber;
    }

    /**
     * Define o valor da propriedade workerContactNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerContactNumber(JAXBElement<String> value) {
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
     * Obtém o valor da propriedade workerHosStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WorkerHosStatus }{@code >}
     *     
     */
    public JAXBElement<WorkerHosStatus> getWorkerHosStatus() {
        return workerHosStatus;
    }

    /**
     * Define o valor da propriedade workerHosStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WorkerHosStatus }{@code >}
     *     
     */
    public void setWorkerHosStatus(JAXBElement<WorkerHosStatus> value) {
        this.workerHosStatus = value;
    }

    /**
     * Obtém o valor da propriedade workerIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerIdentifier() {
        return workerIdentifier;
    }

    /**
     * Define o valor da propriedade workerIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerIdentifier(JAXBElement<String> value) {
        this.workerIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade workerMobileCredentials.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WorkerMobileCredentials }{@code >}
     *     
     */
    public JAXBElement<WorkerMobileCredentials> getWorkerMobileCredentials() {
        return workerMobileCredentials;
    }

    /**
     * Define o valor da propriedade workerMobileCredentials.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WorkerMobileCredentials }{@code >}
     *     
     */
    public void setWorkerMobileCredentials(JAXBElement<WorkerMobileCredentials> value) {
        this.workerMobileCredentials = value;
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

    /**
     * Obtém o valor da propriedade workerXrsDriverId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerXrsDriverId() {
        return workerXrsDriverId;
    }

    /**
     * Define o valor da propriedade workerXrsDriverId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerXrsDriverId(JAXBElement<String> value) {
        this.workerXrsDriverId = value;
    }

    /**
     * Obtém o valor da propriedade workerXrsDriverSid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getWorkerXrsDriverSid() {
        return workerXrsDriverSid;
    }

    /**
     * Define o valor da propriedade workerXrsDriverSid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setWorkerXrsDriverSid(JAXBElement<Long> value) {
        this.workerXrsDriverSid = value;
    }

}
