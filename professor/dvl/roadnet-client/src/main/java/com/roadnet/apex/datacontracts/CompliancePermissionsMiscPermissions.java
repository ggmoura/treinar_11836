
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de CompliancePermissions.MiscPermissions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CompliancePermissions.MiscPermissions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CameraStatusReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Performance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PerformanceAlertReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PerformanceBlackBoxReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PerformanceFaultCodeReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PerformanceIdleReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PerformanceOperationProfileAnalysis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RelayInventoryStatusReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompliancePermissions.MiscPermissions", propOrder = {
    "cameraStatusReport",
    "performance",
    "performanceAlertReport",
    "performanceBlackBoxReport",
    "performanceFaultCodeReport",
    "performanceIdleReport",
    "performanceOperationProfileAnalysis",
    "relayInventoryStatusReport"
})
public class CompliancePermissionsMiscPermissions
    extends DataTransferObject
{

    @XmlElement(name = "CameraStatusReport")
    protected Boolean cameraStatusReport;
    @XmlElement(name = "Performance")
    protected Boolean performance;
    @XmlElement(name = "PerformanceAlertReport")
    protected Boolean performanceAlertReport;
    @XmlElement(name = "PerformanceBlackBoxReport")
    protected Boolean performanceBlackBoxReport;
    @XmlElement(name = "PerformanceFaultCodeReport")
    protected Boolean performanceFaultCodeReport;
    @XmlElement(name = "PerformanceIdleReport")
    protected Boolean performanceIdleReport;
    @XmlElement(name = "PerformanceOperationProfileAnalysis")
    protected Boolean performanceOperationProfileAnalysis;
    @XmlElement(name = "RelayInventoryStatusReport")
    protected Boolean relayInventoryStatusReport;

    /**
     * Obtém o valor da propriedade cameraStatusReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCameraStatusReport() {
        return cameraStatusReport;
    }

    /**
     * Define o valor da propriedade cameraStatusReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCameraStatusReport(Boolean value) {
        this.cameraStatusReport = value;
    }

    /**
     * Obtém o valor da propriedade performance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerformance() {
        return performance;
    }

    /**
     * Define o valor da propriedade performance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerformance(Boolean value) {
        this.performance = value;
    }

    /**
     * Obtém o valor da propriedade performanceAlertReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerformanceAlertReport() {
        return performanceAlertReport;
    }

    /**
     * Define o valor da propriedade performanceAlertReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerformanceAlertReport(Boolean value) {
        this.performanceAlertReport = value;
    }

    /**
     * Obtém o valor da propriedade performanceBlackBoxReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerformanceBlackBoxReport() {
        return performanceBlackBoxReport;
    }

    /**
     * Define o valor da propriedade performanceBlackBoxReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerformanceBlackBoxReport(Boolean value) {
        this.performanceBlackBoxReport = value;
    }

    /**
     * Obtém o valor da propriedade performanceFaultCodeReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerformanceFaultCodeReport() {
        return performanceFaultCodeReport;
    }

    /**
     * Define o valor da propriedade performanceFaultCodeReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerformanceFaultCodeReport(Boolean value) {
        this.performanceFaultCodeReport = value;
    }

    /**
     * Obtém o valor da propriedade performanceIdleReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerformanceIdleReport() {
        return performanceIdleReport;
    }

    /**
     * Define o valor da propriedade performanceIdleReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerformanceIdleReport(Boolean value) {
        this.performanceIdleReport = value;
    }

    /**
     * Obtém o valor da propriedade performanceOperationProfileAnalysis.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerformanceOperationProfileAnalysis() {
        return performanceOperationProfileAnalysis;
    }

    /**
     * Define o valor da propriedade performanceOperationProfileAnalysis.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerformanceOperationProfileAnalysis(Boolean value) {
        this.performanceOperationProfileAnalysis = value;
    }

    /**
     * Obtém o valor da propriedade relayInventoryStatusReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelayInventoryStatusReport() {
        return relayInventoryStatusReport;
    }

    /**
     * Define o valor da propriedade relayInventoryStatusReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelayInventoryStatusReport(Boolean value) {
        this.relayInventoryStatusReport = value;
    }

}
