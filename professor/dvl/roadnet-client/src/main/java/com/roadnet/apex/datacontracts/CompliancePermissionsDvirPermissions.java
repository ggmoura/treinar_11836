
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de CompliancePermissions.DvirPermissions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CompliancePermissions.DvirPermissions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dvir" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DvirCertifyRepairs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DvirInspectionDetailReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DvirInspectionFormReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DvirInspectionSummaryReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PerformanceOperationSummaryReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompliancePermissions.DvirPermissions", propOrder = {
    "dvir",
    "dvirCertifyRepairs",
    "dvirInspectionDetailReport",
    "dvirInspectionFormReport",
    "dvirInspectionSummaryReport",
    "performanceOperationSummaryReports"
})
public class CompliancePermissionsDvirPermissions
    extends DataTransferObject
{

    @XmlElement(name = "Dvir")
    protected Boolean dvir;
    @XmlElement(name = "DvirCertifyRepairs")
    protected Boolean dvirCertifyRepairs;
    @XmlElement(name = "DvirInspectionDetailReport")
    protected Boolean dvirInspectionDetailReport;
    @XmlElement(name = "DvirInspectionFormReport")
    protected Boolean dvirInspectionFormReport;
    @XmlElement(name = "DvirInspectionSummaryReport")
    protected Boolean dvirInspectionSummaryReport;
    @XmlElement(name = "PerformanceOperationSummaryReports")
    protected Boolean performanceOperationSummaryReports;

    /**
     * Obtém o valor da propriedade dvir.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDvir() {
        return dvir;
    }

    /**
     * Define o valor da propriedade dvir.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDvir(Boolean value) {
        this.dvir = value;
    }

    /**
     * Obtém o valor da propriedade dvirCertifyRepairs.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDvirCertifyRepairs() {
        return dvirCertifyRepairs;
    }

    /**
     * Define o valor da propriedade dvirCertifyRepairs.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDvirCertifyRepairs(Boolean value) {
        this.dvirCertifyRepairs = value;
    }

    /**
     * Obtém o valor da propriedade dvirInspectionDetailReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDvirInspectionDetailReport() {
        return dvirInspectionDetailReport;
    }

    /**
     * Define o valor da propriedade dvirInspectionDetailReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDvirInspectionDetailReport(Boolean value) {
        this.dvirInspectionDetailReport = value;
    }

    /**
     * Obtém o valor da propriedade dvirInspectionFormReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDvirInspectionFormReport() {
        return dvirInspectionFormReport;
    }

    /**
     * Define o valor da propriedade dvirInspectionFormReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDvirInspectionFormReport(Boolean value) {
        this.dvirInspectionFormReport = value;
    }

    /**
     * Obtém o valor da propriedade dvirInspectionSummaryReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDvirInspectionSummaryReport() {
        return dvirInspectionSummaryReport;
    }

    /**
     * Define o valor da propriedade dvirInspectionSummaryReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDvirInspectionSummaryReport(Boolean value) {
        this.dvirInspectionSummaryReport = value;
    }

    /**
     * Obtém o valor da propriedade performanceOperationSummaryReports.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerformanceOperationSummaryReports() {
        return performanceOperationSummaryReports;
    }

    /**
     * Define o valor da propriedade performanceOperationSummaryReports.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerformanceOperationSummaryReports(Boolean value) {
        this.performanceOperationSummaryReports = value;
    }

}
