
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import com.roadnet.apex.datacontracts.Report;


/**
 * <p>Classe Java de UploadCustomReportParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UploadCustomReportParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessUnitEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="CustomerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Report" type="{http://roadnet.com/apex/DataContracts/}Report" minOccurs="0"/&gt;
 *         &lt;element name="ReportFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StoredProcedureScriptFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadCustomReportParameters", propOrder = {
    "businessUnitEntityKeys",
    "customerEntityKey",
    "report",
    "reportFileName",
    "storedProcedureScriptFileName"
})
public class UploadCustomReportParameters {

    @XmlElementRef(name = "BusinessUnitEntityKeys", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> businessUnitEntityKeys;
    @XmlElement(name = "CustomerEntityKey")
    protected Long customerEntityKey;
    @XmlElementRef(name = "Report", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Report> report;
    @XmlElementRef(name = "ReportFileName", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportFileName;
    @XmlElementRef(name = "StoredProcedureScriptFileName", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> storedProcedureScriptFileName;

    /**
     * Obtém o valor da propriedade businessUnitEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getBusinessUnitEntityKeys() {
        return businessUnitEntityKeys;
    }

    /**
     * Define o valor da propriedade businessUnitEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setBusinessUnitEntityKeys(JAXBElement<ArrayOflong> value) {
        this.businessUnitEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade customerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerEntityKey() {
        return customerEntityKey;
    }

    /**
     * Define o valor da propriedade customerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerEntityKey(Long value) {
        this.customerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade report.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Report }{@code >}
     *     
     */
    public JAXBElement<Report> getReport() {
        return report;
    }

    /**
     * Define o valor da propriedade report.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Report }{@code >}
     *     
     */
    public void setReport(JAXBElement<Report> value) {
        this.report = value;
    }

    /**
     * Obtém o valor da propriedade reportFileName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportFileName() {
        return reportFileName;
    }

    /**
     * Define o valor da propriedade reportFileName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportFileName(JAXBElement<String> value) {
        this.reportFileName = value;
    }

    /**
     * Obtém o valor da propriedade storedProcedureScriptFileName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStoredProcedureScriptFileName() {
        return storedProcedureScriptFileName;
    }

    /**
     * Define o valor da propriedade storedProcedureScriptFileName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStoredProcedureScriptFileName(JAXBElement<String> value) {
        this.storedProcedureScriptFileName = value;
    }

}
