
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de CompliancePermissions.HosPermissions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CompliancePermissions.HosPermissions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosAvailableTimeReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosDiagnosticAndMalfunctionDetail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosDiagnosticAndMalfunctionSummary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosDriverDetailLogEditor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosDriverDetailLogEditorEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosDriverLogEditDetailsReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosDriverLogEditSummaryReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosDriverLogEditor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosDriverLogReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosDriverLogSummaryReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosDriverPayrollSummaryReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosEldErodsExtract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosPaperLogModeReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosPendingEditsDetailReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosPendingEditsSummaryReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosPersonalConveyanceDetailReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosPersonalConveyanceSummaryReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosRejectedEditsDetailReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosRejectedEditsSummaryReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosSensorFailureReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosSpecialDrivingConditionsReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosTools" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosUnassignedVehicleActivity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosUnassignedVehicleActivityEditor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosUnassignedVehicleActivityReclassify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosViolationsDetailReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosViolationsSummaryByDriverReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosViolationsSummaryReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompliancePermissions.HosPermissions", propOrder = {
    "hos",
    "hosAvailableTimeReport",
    "hosDiagnosticAndMalfunctionDetail",
    "hosDiagnosticAndMalfunctionSummary",
    "hosDriverDetailLogEditor",
    "hosDriverDetailLogEditorEdit",
    "hosDriverLogEditDetailsReport",
    "hosDriverLogEditSummaryReport",
    "hosDriverLogEditor",
    "hosDriverLogReport",
    "hosDriverLogSummaryReport",
    "hosDriverPayrollSummaryReport",
    "hosEldErodsExtract",
    "hosPaperLogModeReport",
    "hosPendingEditsDetailReport",
    "hosPendingEditsSummaryReport",
    "hosPersonalConveyanceDetailReport",
    "hosPersonalConveyanceSummaryReport",
    "hosRejectedEditsDetailReport",
    "hosRejectedEditsSummaryReport",
    "hosSensorFailureReports",
    "hosSpecialDrivingConditionsReport",
    "hosTools",
    "hosUnassignedVehicleActivity",
    "hosUnassignedVehicleActivityEditor",
    "hosUnassignedVehicleActivityReclassify",
    "hosViolationsDetailReport",
    "hosViolationsSummaryByDriverReport",
    "hosViolationsSummaryReport"
})
public class CompliancePermissionsHosPermissions
    extends DataTransferObject
{

    @XmlElement(name = "Hos")
    protected Boolean hos;
    @XmlElement(name = "HosAvailableTimeReport")
    protected Boolean hosAvailableTimeReport;
    @XmlElement(name = "HosDiagnosticAndMalfunctionDetail")
    protected Boolean hosDiagnosticAndMalfunctionDetail;
    @XmlElement(name = "HosDiagnosticAndMalfunctionSummary")
    protected Boolean hosDiagnosticAndMalfunctionSummary;
    @XmlElement(name = "HosDriverDetailLogEditor")
    protected Boolean hosDriverDetailLogEditor;
    @XmlElement(name = "HosDriverDetailLogEditorEdit")
    protected Boolean hosDriverDetailLogEditorEdit;
    @XmlElement(name = "HosDriverLogEditDetailsReport")
    protected Boolean hosDriverLogEditDetailsReport;
    @XmlElement(name = "HosDriverLogEditSummaryReport")
    protected Boolean hosDriverLogEditSummaryReport;
    @XmlElement(name = "HosDriverLogEditor")
    protected Boolean hosDriverLogEditor;
    @XmlElement(name = "HosDriverLogReport")
    protected Boolean hosDriverLogReport;
    @XmlElement(name = "HosDriverLogSummaryReport")
    protected Boolean hosDriverLogSummaryReport;
    @XmlElement(name = "HosDriverPayrollSummaryReport")
    protected Boolean hosDriverPayrollSummaryReport;
    @XmlElement(name = "HosEldErodsExtract")
    protected Boolean hosEldErodsExtract;
    @XmlElement(name = "HosPaperLogModeReport")
    protected Boolean hosPaperLogModeReport;
    @XmlElement(name = "HosPendingEditsDetailReport")
    protected Boolean hosPendingEditsDetailReport;
    @XmlElement(name = "HosPendingEditsSummaryReport")
    protected Boolean hosPendingEditsSummaryReport;
    @XmlElement(name = "HosPersonalConveyanceDetailReport")
    protected Boolean hosPersonalConveyanceDetailReport;
    @XmlElement(name = "HosPersonalConveyanceSummaryReport")
    protected Boolean hosPersonalConveyanceSummaryReport;
    @XmlElement(name = "HosRejectedEditsDetailReport")
    protected Boolean hosRejectedEditsDetailReport;
    @XmlElement(name = "HosRejectedEditsSummaryReport")
    protected Boolean hosRejectedEditsSummaryReport;
    @XmlElement(name = "HosSensorFailureReports")
    protected Boolean hosSensorFailureReports;
    @XmlElement(name = "HosSpecialDrivingConditionsReport")
    protected Boolean hosSpecialDrivingConditionsReport;
    @XmlElement(name = "HosTools")
    protected Boolean hosTools;
    @XmlElement(name = "HosUnassignedVehicleActivity")
    protected Boolean hosUnassignedVehicleActivity;
    @XmlElement(name = "HosUnassignedVehicleActivityEditor")
    protected Boolean hosUnassignedVehicleActivityEditor;
    @XmlElement(name = "HosUnassignedVehicleActivityReclassify")
    protected Boolean hosUnassignedVehicleActivityReclassify;
    @XmlElement(name = "HosViolationsDetailReport")
    protected Boolean hosViolationsDetailReport;
    @XmlElement(name = "HosViolationsSummaryByDriverReport")
    protected Boolean hosViolationsSummaryByDriverReport;
    @XmlElement(name = "HosViolationsSummaryReport")
    protected Boolean hosViolationsSummaryReport;

    /**
     * Obtém o valor da propriedade hos.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHos() {
        return hos;
    }

    /**
     * Define o valor da propriedade hos.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHos(Boolean value) {
        this.hos = value;
    }

    /**
     * Obtém o valor da propriedade hosAvailableTimeReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosAvailableTimeReport() {
        return hosAvailableTimeReport;
    }

    /**
     * Define o valor da propriedade hosAvailableTimeReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosAvailableTimeReport(Boolean value) {
        this.hosAvailableTimeReport = value;
    }

    /**
     * Obtém o valor da propriedade hosDiagnosticAndMalfunctionDetail.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosDiagnosticAndMalfunctionDetail() {
        return hosDiagnosticAndMalfunctionDetail;
    }

    /**
     * Define o valor da propriedade hosDiagnosticAndMalfunctionDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosDiagnosticAndMalfunctionDetail(Boolean value) {
        this.hosDiagnosticAndMalfunctionDetail = value;
    }

    /**
     * Obtém o valor da propriedade hosDiagnosticAndMalfunctionSummary.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosDiagnosticAndMalfunctionSummary() {
        return hosDiagnosticAndMalfunctionSummary;
    }

    /**
     * Define o valor da propriedade hosDiagnosticAndMalfunctionSummary.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosDiagnosticAndMalfunctionSummary(Boolean value) {
        this.hosDiagnosticAndMalfunctionSummary = value;
    }

    /**
     * Obtém o valor da propriedade hosDriverDetailLogEditor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosDriverDetailLogEditor() {
        return hosDriverDetailLogEditor;
    }

    /**
     * Define o valor da propriedade hosDriverDetailLogEditor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosDriverDetailLogEditor(Boolean value) {
        this.hosDriverDetailLogEditor = value;
    }

    /**
     * Obtém o valor da propriedade hosDriverDetailLogEditorEdit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosDriverDetailLogEditorEdit() {
        return hosDriverDetailLogEditorEdit;
    }

    /**
     * Define o valor da propriedade hosDriverDetailLogEditorEdit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosDriverDetailLogEditorEdit(Boolean value) {
        this.hosDriverDetailLogEditorEdit = value;
    }

    /**
     * Obtém o valor da propriedade hosDriverLogEditDetailsReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosDriverLogEditDetailsReport() {
        return hosDriverLogEditDetailsReport;
    }

    /**
     * Define o valor da propriedade hosDriverLogEditDetailsReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosDriverLogEditDetailsReport(Boolean value) {
        this.hosDriverLogEditDetailsReport = value;
    }

    /**
     * Obtém o valor da propriedade hosDriverLogEditSummaryReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosDriverLogEditSummaryReport() {
        return hosDriverLogEditSummaryReport;
    }

    /**
     * Define o valor da propriedade hosDriverLogEditSummaryReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosDriverLogEditSummaryReport(Boolean value) {
        this.hosDriverLogEditSummaryReport = value;
    }

    /**
     * Obtém o valor da propriedade hosDriverLogEditor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosDriverLogEditor() {
        return hosDriverLogEditor;
    }

    /**
     * Define o valor da propriedade hosDriverLogEditor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosDriverLogEditor(Boolean value) {
        this.hosDriverLogEditor = value;
    }

    /**
     * Obtém o valor da propriedade hosDriverLogReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosDriverLogReport() {
        return hosDriverLogReport;
    }

    /**
     * Define o valor da propriedade hosDriverLogReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosDriverLogReport(Boolean value) {
        this.hosDriverLogReport = value;
    }

    /**
     * Obtém o valor da propriedade hosDriverLogSummaryReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosDriverLogSummaryReport() {
        return hosDriverLogSummaryReport;
    }

    /**
     * Define o valor da propriedade hosDriverLogSummaryReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosDriverLogSummaryReport(Boolean value) {
        this.hosDriverLogSummaryReport = value;
    }

    /**
     * Obtém o valor da propriedade hosDriverPayrollSummaryReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosDriverPayrollSummaryReport() {
        return hosDriverPayrollSummaryReport;
    }

    /**
     * Define o valor da propriedade hosDriverPayrollSummaryReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosDriverPayrollSummaryReport(Boolean value) {
        this.hosDriverPayrollSummaryReport = value;
    }

    /**
     * Obtém o valor da propriedade hosEldErodsExtract.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosEldErodsExtract() {
        return hosEldErodsExtract;
    }

    /**
     * Define o valor da propriedade hosEldErodsExtract.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosEldErodsExtract(Boolean value) {
        this.hosEldErodsExtract = value;
    }

    /**
     * Obtém o valor da propriedade hosPaperLogModeReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosPaperLogModeReport() {
        return hosPaperLogModeReport;
    }

    /**
     * Define o valor da propriedade hosPaperLogModeReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosPaperLogModeReport(Boolean value) {
        this.hosPaperLogModeReport = value;
    }

    /**
     * Obtém o valor da propriedade hosPendingEditsDetailReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosPendingEditsDetailReport() {
        return hosPendingEditsDetailReport;
    }

    /**
     * Define o valor da propriedade hosPendingEditsDetailReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosPendingEditsDetailReport(Boolean value) {
        this.hosPendingEditsDetailReport = value;
    }

    /**
     * Obtém o valor da propriedade hosPendingEditsSummaryReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosPendingEditsSummaryReport() {
        return hosPendingEditsSummaryReport;
    }

    /**
     * Define o valor da propriedade hosPendingEditsSummaryReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosPendingEditsSummaryReport(Boolean value) {
        this.hosPendingEditsSummaryReport = value;
    }

    /**
     * Obtém o valor da propriedade hosPersonalConveyanceDetailReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosPersonalConveyanceDetailReport() {
        return hosPersonalConveyanceDetailReport;
    }

    /**
     * Define o valor da propriedade hosPersonalConveyanceDetailReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosPersonalConveyanceDetailReport(Boolean value) {
        this.hosPersonalConveyanceDetailReport = value;
    }

    /**
     * Obtém o valor da propriedade hosPersonalConveyanceSummaryReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosPersonalConveyanceSummaryReport() {
        return hosPersonalConveyanceSummaryReport;
    }

    /**
     * Define o valor da propriedade hosPersonalConveyanceSummaryReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosPersonalConveyanceSummaryReport(Boolean value) {
        this.hosPersonalConveyanceSummaryReport = value;
    }

    /**
     * Obtém o valor da propriedade hosRejectedEditsDetailReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosRejectedEditsDetailReport() {
        return hosRejectedEditsDetailReport;
    }

    /**
     * Define o valor da propriedade hosRejectedEditsDetailReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosRejectedEditsDetailReport(Boolean value) {
        this.hosRejectedEditsDetailReport = value;
    }

    /**
     * Obtém o valor da propriedade hosRejectedEditsSummaryReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosRejectedEditsSummaryReport() {
        return hosRejectedEditsSummaryReport;
    }

    /**
     * Define o valor da propriedade hosRejectedEditsSummaryReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosRejectedEditsSummaryReport(Boolean value) {
        this.hosRejectedEditsSummaryReport = value;
    }

    /**
     * Obtém o valor da propriedade hosSensorFailureReports.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosSensorFailureReports() {
        return hosSensorFailureReports;
    }

    /**
     * Define o valor da propriedade hosSensorFailureReports.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosSensorFailureReports(Boolean value) {
        this.hosSensorFailureReports = value;
    }

    /**
     * Obtém o valor da propriedade hosSpecialDrivingConditionsReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosSpecialDrivingConditionsReport() {
        return hosSpecialDrivingConditionsReport;
    }

    /**
     * Define o valor da propriedade hosSpecialDrivingConditionsReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosSpecialDrivingConditionsReport(Boolean value) {
        this.hosSpecialDrivingConditionsReport = value;
    }

    /**
     * Obtém o valor da propriedade hosTools.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosTools() {
        return hosTools;
    }

    /**
     * Define o valor da propriedade hosTools.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosTools(Boolean value) {
        this.hosTools = value;
    }

    /**
     * Obtém o valor da propriedade hosUnassignedVehicleActivity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosUnassignedVehicleActivity() {
        return hosUnassignedVehicleActivity;
    }

    /**
     * Define o valor da propriedade hosUnassignedVehicleActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosUnassignedVehicleActivity(Boolean value) {
        this.hosUnassignedVehicleActivity = value;
    }

    /**
     * Obtém o valor da propriedade hosUnassignedVehicleActivityEditor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosUnassignedVehicleActivityEditor() {
        return hosUnassignedVehicleActivityEditor;
    }

    /**
     * Define o valor da propriedade hosUnassignedVehicleActivityEditor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosUnassignedVehicleActivityEditor(Boolean value) {
        this.hosUnassignedVehicleActivityEditor = value;
    }

    /**
     * Obtém o valor da propriedade hosUnassignedVehicleActivityReclassify.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosUnassignedVehicleActivityReclassify() {
        return hosUnassignedVehicleActivityReclassify;
    }

    /**
     * Define o valor da propriedade hosUnassignedVehicleActivityReclassify.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosUnassignedVehicleActivityReclassify(Boolean value) {
        this.hosUnassignedVehicleActivityReclassify = value;
    }

    /**
     * Obtém o valor da propriedade hosViolationsDetailReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosViolationsDetailReport() {
        return hosViolationsDetailReport;
    }

    /**
     * Define o valor da propriedade hosViolationsDetailReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosViolationsDetailReport(Boolean value) {
        this.hosViolationsDetailReport = value;
    }

    /**
     * Obtém o valor da propriedade hosViolationsSummaryByDriverReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosViolationsSummaryByDriverReport() {
        return hosViolationsSummaryByDriverReport;
    }

    /**
     * Define o valor da propriedade hosViolationsSummaryByDriverReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosViolationsSummaryByDriverReport(Boolean value) {
        this.hosViolationsSummaryByDriverReport = value;
    }

    /**
     * Obtém o valor da propriedade hosViolationsSummaryReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHosViolationsSummaryReport() {
        return hosViolationsSummaryReport;
    }

    /**
     * Define o valor da propriedade hosViolationsSummaryReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHosViolationsSummaryReport(Boolean value) {
        this.hosViolationsSummaryReport = value;
    }

}
