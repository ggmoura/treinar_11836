
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de EquipmentStatusWorkerDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentStatusWorkerDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HosStatus" type="{http://roadnet.com/apex/DataContracts/}WorkerHosStatus" minOccurs="0"/&gt;
 *         &lt;element name="MobileApplicationType_WorkerMobileApplicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerContactNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="WorkerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerName" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="XrsDriverId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XrsDriverSid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentStatusWorkerDetail", propOrder = {
    "hosStatus",
    "mobileApplicationTypeWorkerMobileApplicationType",
    "workerContactNumber",
    "workerEntityKey",
    "workerIdentifier",
    "workerName",
    "xrsDriverId",
    "xrsDriverSid"
})
public class EquipmentStatusWorkerDetail
    extends DataTransferObject
{

    @XmlElementRef(name = "HosStatus", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<WorkerHosStatus> hosStatus;
    @XmlElementRef(name = "MobileApplicationType_WorkerMobileApplicationType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileApplicationTypeWorkerMobileApplicationType;
    @XmlElementRef(name = "WorkerContactNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerContactNumber;
    @XmlElement(name = "WorkerEntityKey")
    protected Long workerEntityKey;
    @XmlElementRef(name = "WorkerIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerIdentifier;
    @XmlElementRef(name = "WorkerName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> workerName;
    @XmlElementRef(name = "XrsDriverId", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xrsDriverId;
    @XmlElementRef(name = "XrsDriverSid", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> xrsDriverSid;

    /**
     * Obtém o valor da propriedade hosStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WorkerHosStatus }{@code >}
     *     
     */
    public JAXBElement<WorkerHosStatus> getHosStatus() {
        return hosStatus;
    }

    /**
     * Define o valor da propriedade hosStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WorkerHosStatus }{@code >}
     *     
     */
    public void setHosStatus(JAXBElement<WorkerHosStatus> value) {
        this.hosStatus = value;
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
     * Obtém o valor da propriedade xrsDriverId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXrsDriverId() {
        return xrsDriverId;
    }

    /**
     * Define o valor da propriedade xrsDriverId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXrsDriverId(JAXBElement<String> value) {
        this.xrsDriverId = value;
    }

    /**
     * Obtém o valor da propriedade xrsDriverSid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getXrsDriverSid() {
        return xrsDriverSid;
    }

    /**
     * Define o valor da propriedade xrsDriverSid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setXrsDriverSid(JAXBElement<Long> value) {
        this.xrsDriverSid = value;
    }

}
