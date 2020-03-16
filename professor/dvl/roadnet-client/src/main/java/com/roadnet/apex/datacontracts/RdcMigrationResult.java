
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de RdcMigrationResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RdcMigrationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RdcEquipmentMigrationResult" type="{http://roadnet.com/apex/DataContracts/}RdcEntityMigrationResult" minOccurs="0"/&gt;
 *         &lt;element name="RdcMigrationSucceeded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RdcMobileDeviceMigrationResult" type="{http://roadnet.com/apex/DataContracts/}RdcMobileDeviceMigrationResult" minOccurs="0"/&gt;
 *         &lt;element name="RdcRegionMigrationResult" type="{http://roadnet.com/apex/DataContracts/}RdcEntityMigrationResult" minOccurs="0"/&gt;
 *         &lt;element name="RdcUserMigrationResult" type="{http://roadnet.com/apex/DataContracts/}RdcEntityMigrationResult" minOccurs="0"/&gt;
 *         &lt;element name="RdcWorkerMigrationResult" type="{http://roadnet.com/apex/DataContracts/}RdcEntityMigrationResult" minOccurs="0"/&gt;
 *         &lt;element name="ResultWorkbook" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RdcMigrationResult", propOrder = {
    "errorMessage",
    "rdcEquipmentMigrationResult",
    "rdcMigrationSucceeded",
    "rdcMobileDeviceMigrationResult",
    "rdcRegionMigrationResult",
    "rdcUserMigrationResult",
    "rdcWorkerMigrationResult",
    "resultWorkbook"
})
public class RdcMigrationResult
    extends DataTransferObject
{

    @XmlElementRef(name = "ErrorMessage", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorMessage;
    @XmlElementRef(name = "RdcEquipmentMigrationResult", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RdcEntityMigrationResult> rdcEquipmentMigrationResult;
    @XmlElement(name = "RdcMigrationSucceeded")
    protected Boolean rdcMigrationSucceeded;
    @XmlElementRef(name = "RdcMobileDeviceMigrationResult", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RdcMobileDeviceMigrationResult> rdcMobileDeviceMigrationResult;
    @XmlElementRef(name = "RdcRegionMigrationResult", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RdcEntityMigrationResult> rdcRegionMigrationResult;
    @XmlElementRef(name = "RdcUserMigrationResult", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RdcEntityMigrationResult> rdcUserMigrationResult;
    @XmlElementRef(name = "RdcWorkerMigrationResult", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RdcEntityMigrationResult> rdcWorkerMigrationResult;
    @XmlElementRef(name = "ResultWorkbook", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> resultWorkbook;

    /**
     * Obtém o valor da propriedade errorMessage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorMessage() {
        return errorMessage;
    }

    /**
     * Define o valor da propriedade errorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorMessage(JAXBElement<String> value) {
        this.errorMessage = value;
    }

    /**
     * Obtém o valor da propriedade rdcEquipmentMigrationResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RdcEntityMigrationResult }{@code >}
     *     
     */
    public JAXBElement<RdcEntityMigrationResult> getRdcEquipmentMigrationResult() {
        return rdcEquipmentMigrationResult;
    }

    /**
     * Define o valor da propriedade rdcEquipmentMigrationResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RdcEntityMigrationResult }{@code >}
     *     
     */
    public void setRdcEquipmentMigrationResult(JAXBElement<RdcEntityMigrationResult> value) {
        this.rdcEquipmentMigrationResult = value;
    }

    /**
     * Obtém o valor da propriedade rdcMigrationSucceeded.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRdcMigrationSucceeded() {
        return rdcMigrationSucceeded;
    }

    /**
     * Define o valor da propriedade rdcMigrationSucceeded.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRdcMigrationSucceeded(Boolean value) {
        this.rdcMigrationSucceeded = value;
    }

    /**
     * Obtém o valor da propriedade rdcMobileDeviceMigrationResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RdcMobileDeviceMigrationResult }{@code >}
     *     
     */
    public JAXBElement<RdcMobileDeviceMigrationResult> getRdcMobileDeviceMigrationResult() {
        return rdcMobileDeviceMigrationResult;
    }

    /**
     * Define o valor da propriedade rdcMobileDeviceMigrationResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RdcMobileDeviceMigrationResult }{@code >}
     *     
     */
    public void setRdcMobileDeviceMigrationResult(JAXBElement<RdcMobileDeviceMigrationResult> value) {
        this.rdcMobileDeviceMigrationResult = value;
    }

    /**
     * Obtém o valor da propriedade rdcRegionMigrationResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RdcEntityMigrationResult }{@code >}
     *     
     */
    public JAXBElement<RdcEntityMigrationResult> getRdcRegionMigrationResult() {
        return rdcRegionMigrationResult;
    }

    /**
     * Define o valor da propriedade rdcRegionMigrationResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RdcEntityMigrationResult }{@code >}
     *     
     */
    public void setRdcRegionMigrationResult(JAXBElement<RdcEntityMigrationResult> value) {
        this.rdcRegionMigrationResult = value;
    }

    /**
     * Obtém o valor da propriedade rdcUserMigrationResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RdcEntityMigrationResult }{@code >}
     *     
     */
    public JAXBElement<RdcEntityMigrationResult> getRdcUserMigrationResult() {
        return rdcUserMigrationResult;
    }

    /**
     * Define o valor da propriedade rdcUserMigrationResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RdcEntityMigrationResult }{@code >}
     *     
     */
    public void setRdcUserMigrationResult(JAXBElement<RdcEntityMigrationResult> value) {
        this.rdcUserMigrationResult = value;
    }

    /**
     * Obtém o valor da propriedade rdcWorkerMigrationResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RdcEntityMigrationResult }{@code >}
     *     
     */
    public JAXBElement<RdcEntityMigrationResult> getRdcWorkerMigrationResult() {
        return rdcWorkerMigrationResult;
    }

    /**
     * Define o valor da propriedade rdcWorkerMigrationResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RdcEntityMigrationResult }{@code >}
     *     
     */
    public void setRdcWorkerMigrationResult(JAXBElement<RdcEntityMigrationResult> value) {
        this.rdcWorkerMigrationResult = value;
    }

    /**
     * Obtém o valor da propriedade resultWorkbook.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getResultWorkbook() {
        return resultWorkbook;
    }

    /**
     * Define o valor da propriedade resultWorkbook.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setResultWorkbook(JAXBElement<byte[]> value) {
        this.resultWorkbook = value;
    }

}
