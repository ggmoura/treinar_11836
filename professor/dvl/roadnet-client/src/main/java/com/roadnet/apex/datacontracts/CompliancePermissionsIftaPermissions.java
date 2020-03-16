
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de CompliancePermissions.IftaPermissions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CompliancePermissions.IftaPermissions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ifta" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaAssignPurchasedFuel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaAssignPurchasedFuelAccept" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaAssignPurchasedFuelDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaAssignPurchasedFuelEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaDistanceByJurisdictionReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaDistanceDiscrepancyReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaFleetReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaFuelByJurisdictionReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaFuelDetailReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaFuelEfficiencyReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaFuelFileTrackingReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaJurisdictionCrossingReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaManageFuelReceipts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaManageFuelReceiptsAdd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaManageFuelReceiptsDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaManageFuelReceiptsEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaManageFuelReceiptsExportFuelReceipts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaManageFuelReceiptsImportFuelFile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaManageManualDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaManageManualDistanceAdd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaManageManualDistanceEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaOfficialReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaReconciliationReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IftaTools" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompliancePermissions.IftaPermissions", propOrder = {
    "ifta",
    "iftaAssignPurchasedFuel",
    "iftaAssignPurchasedFuelAccept",
    "iftaAssignPurchasedFuelDelete",
    "iftaAssignPurchasedFuelEdit",
    "iftaDistanceByJurisdictionReport",
    "iftaDistanceDiscrepancyReport",
    "iftaFleetReport",
    "iftaFuelByJurisdictionReport",
    "iftaFuelDetailReport",
    "iftaFuelEfficiencyReport",
    "iftaFuelFileTrackingReport",
    "iftaJurisdictionCrossingReport",
    "iftaManageFuelReceipts",
    "iftaManageFuelReceiptsAdd",
    "iftaManageFuelReceiptsDelete",
    "iftaManageFuelReceiptsEdit",
    "iftaManageFuelReceiptsExportFuelReceipts",
    "iftaManageFuelReceiptsImportFuelFile",
    "iftaManageManualDistance",
    "iftaManageManualDistanceAdd",
    "iftaManageManualDistanceEdit",
    "iftaOfficialReports",
    "iftaReconciliationReport",
    "iftaTools"
})
public class CompliancePermissionsIftaPermissions
    extends DataTransferObject
{

    @XmlElement(name = "Ifta")
    protected Boolean ifta;
    @XmlElement(name = "IftaAssignPurchasedFuel")
    protected Boolean iftaAssignPurchasedFuel;
    @XmlElement(name = "IftaAssignPurchasedFuelAccept")
    protected Boolean iftaAssignPurchasedFuelAccept;
    @XmlElement(name = "IftaAssignPurchasedFuelDelete")
    protected Boolean iftaAssignPurchasedFuelDelete;
    @XmlElement(name = "IftaAssignPurchasedFuelEdit")
    protected Boolean iftaAssignPurchasedFuelEdit;
    @XmlElement(name = "IftaDistanceByJurisdictionReport")
    protected Boolean iftaDistanceByJurisdictionReport;
    @XmlElement(name = "IftaDistanceDiscrepancyReport")
    protected Boolean iftaDistanceDiscrepancyReport;
    @XmlElement(name = "IftaFleetReport")
    protected Boolean iftaFleetReport;
    @XmlElement(name = "IftaFuelByJurisdictionReport")
    protected Boolean iftaFuelByJurisdictionReport;
    @XmlElement(name = "IftaFuelDetailReport")
    protected Boolean iftaFuelDetailReport;
    @XmlElement(name = "IftaFuelEfficiencyReport")
    protected Boolean iftaFuelEfficiencyReport;
    @XmlElement(name = "IftaFuelFileTrackingReport")
    protected Boolean iftaFuelFileTrackingReport;
    @XmlElement(name = "IftaJurisdictionCrossingReport")
    protected Boolean iftaJurisdictionCrossingReport;
    @XmlElement(name = "IftaManageFuelReceipts")
    protected Boolean iftaManageFuelReceipts;
    @XmlElement(name = "IftaManageFuelReceiptsAdd")
    protected Boolean iftaManageFuelReceiptsAdd;
    @XmlElement(name = "IftaManageFuelReceiptsDelete")
    protected Boolean iftaManageFuelReceiptsDelete;
    @XmlElement(name = "IftaManageFuelReceiptsEdit")
    protected Boolean iftaManageFuelReceiptsEdit;
    @XmlElement(name = "IftaManageFuelReceiptsExportFuelReceipts")
    protected Boolean iftaManageFuelReceiptsExportFuelReceipts;
    @XmlElement(name = "IftaManageFuelReceiptsImportFuelFile")
    protected Boolean iftaManageFuelReceiptsImportFuelFile;
    @XmlElement(name = "IftaManageManualDistance")
    protected Boolean iftaManageManualDistance;
    @XmlElement(name = "IftaManageManualDistanceAdd")
    protected Boolean iftaManageManualDistanceAdd;
    @XmlElement(name = "IftaManageManualDistanceEdit")
    protected Boolean iftaManageManualDistanceEdit;
    @XmlElement(name = "IftaOfficialReports")
    protected Boolean iftaOfficialReports;
    @XmlElement(name = "IftaReconciliationReport")
    protected Boolean iftaReconciliationReport;
    @XmlElement(name = "IftaTools")
    protected Boolean iftaTools;

    /**
     * Obtém o valor da propriedade ifta.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIfta() {
        return ifta;
    }

    /**
     * Define o valor da propriedade ifta.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIfta(Boolean value) {
        this.ifta = value;
    }

    /**
     * Obtém o valor da propriedade iftaAssignPurchasedFuel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaAssignPurchasedFuel() {
        return iftaAssignPurchasedFuel;
    }

    /**
     * Define o valor da propriedade iftaAssignPurchasedFuel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaAssignPurchasedFuel(Boolean value) {
        this.iftaAssignPurchasedFuel = value;
    }

    /**
     * Obtém o valor da propriedade iftaAssignPurchasedFuelAccept.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaAssignPurchasedFuelAccept() {
        return iftaAssignPurchasedFuelAccept;
    }

    /**
     * Define o valor da propriedade iftaAssignPurchasedFuelAccept.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaAssignPurchasedFuelAccept(Boolean value) {
        this.iftaAssignPurchasedFuelAccept = value;
    }

    /**
     * Obtém o valor da propriedade iftaAssignPurchasedFuelDelete.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaAssignPurchasedFuelDelete() {
        return iftaAssignPurchasedFuelDelete;
    }

    /**
     * Define o valor da propriedade iftaAssignPurchasedFuelDelete.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaAssignPurchasedFuelDelete(Boolean value) {
        this.iftaAssignPurchasedFuelDelete = value;
    }

    /**
     * Obtém o valor da propriedade iftaAssignPurchasedFuelEdit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaAssignPurchasedFuelEdit() {
        return iftaAssignPurchasedFuelEdit;
    }

    /**
     * Define o valor da propriedade iftaAssignPurchasedFuelEdit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaAssignPurchasedFuelEdit(Boolean value) {
        this.iftaAssignPurchasedFuelEdit = value;
    }

    /**
     * Obtém o valor da propriedade iftaDistanceByJurisdictionReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaDistanceByJurisdictionReport() {
        return iftaDistanceByJurisdictionReport;
    }

    /**
     * Define o valor da propriedade iftaDistanceByJurisdictionReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaDistanceByJurisdictionReport(Boolean value) {
        this.iftaDistanceByJurisdictionReport = value;
    }

    /**
     * Obtém o valor da propriedade iftaDistanceDiscrepancyReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaDistanceDiscrepancyReport() {
        return iftaDistanceDiscrepancyReport;
    }

    /**
     * Define o valor da propriedade iftaDistanceDiscrepancyReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaDistanceDiscrepancyReport(Boolean value) {
        this.iftaDistanceDiscrepancyReport = value;
    }

    /**
     * Obtém o valor da propriedade iftaFleetReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaFleetReport() {
        return iftaFleetReport;
    }

    /**
     * Define o valor da propriedade iftaFleetReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaFleetReport(Boolean value) {
        this.iftaFleetReport = value;
    }

    /**
     * Obtém o valor da propriedade iftaFuelByJurisdictionReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaFuelByJurisdictionReport() {
        return iftaFuelByJurisdictionReport;
    }

    /**
     * Define o valor da propriedade iftaFuelByJurisdictionReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaFuelByJurisdictionReport(Boolean value) {
        this.iftaFuelByJurisdictionReport = value;
    }

    /**
     * Obtém o valor da propriedade iftaFuelDetailReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaFuelDetailReport() {
        return iftaFuelDetailReport;
    }

    /**
     * Define o valor da propriedade iftaFuelDetailReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaFuelDetailReport(Boolean value) {
        this.iftaFuelDetailReport = value;
    }

    /**
     * Obtém o valor da propriedade iftaFuelEfficiencyReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaFuelEfficiencyReport() {
        return iftaFuelEfficiencyReport;
    }

    /**
     * Define o valor da propriedade iftaFuelEfficiencyReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaFuelEfficiencyReport(Boolean value) {
        this.iftaFuelEfficiencyReport = value;
    }

    /**
     * Obtém o valor da propriedade iftaFuelFileTrackingReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaFuelFileTrackingReport() {
        return iftaFuelFileTrackingReport;
    }

    /**
     * Define o valor da propriedade iftaFuelFileTrackingReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaFuelFileTrackingReport(Boolean value) {
        this.iftaFuelFileTrackingReport = value;
    }

    /**
     * Obtém o valor da propriedade iftaJurisdictionCrossingReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaJurisdictionCrossingReport() {
        return iftaJurisdictionCrossingReport;
    }

    /**
     * Define o valor da propriedade iftaJurisdictionCrossingReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaJurisdictionCrossingReport(Boolean value) {
        this.iftaJurisdictionCrossingReport = value;
    }

    /**
     * Obtém o valor da propriedade iftaManageFuelReceipts.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaManageFuelReceipts() {
        return iftaManageFuelReceipts;
    }

    /**
     * Define o valor da propriedade iftaManageFuelReceipts.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaManageFuelReceipts(Boolean value) {
        this.iftaManageFuelReceipts = value;
    }

    /**
     * Obtém o valor da propriedade iftaManageFuelReceiptsAdd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaManageFuelReceiptsAdd() {
        return iftaManageFuelReceiptsAdd;
    }

    /**
     * Define o valor da propriedade iftaManageFuelReceiptsAdd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaManageFuelReceiptsAdd(Boolean value) {
        this.iftaManageFuelReceiptsAdd = value;
    }

    /**
     * Obtém o valor da propriedade iftaManageFuelReceiptsDelete.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaManageFuelReceiptsDelete() {
        return iftaManageFuelReceiptsDelete;
    }

    /**
     * Define o valor da propriedade iftaManageFuelReceiptsDelete.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaManageFuelReceiptsDelete(Boolean value) {
        this.iftaManageFuelReceiptsDelete = value;
    }

    /**
     * Obtém o valor da propriedade iftaManageFuelReceiptsEdit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaManageFuelReceiptsEdit() {
        return iftaManageFuelReceiptsEdit;
    }

    /**
     * Define o valor da propriedade iftaManageFuelReceiptsEdit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaManageFuelReceiptsEdit(Boolean value) {
        this.iftaManageFuelReceiptsEdit = value;
    }

    /**
     * Obtém o valor da propriedade iftaManageFuelReceiptsExportFuelReceipts.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaManageFuelReceiptsExportFuelReceipts() {
        return iftaManageFuelReceiptsExportFuelReceipts;
    }

    /**
     * Define o valor da propriedade iftaManageFuelReceiptsExportFuelReceipts.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaManageFuelReceiptsExportFuelReceipts(Boolean value) {
        this.iftaManageFuelReceiptsExportFuelReceipts = value;
    }

    /**
     * Obtém o valor da propriedade iftaManageFuelReceiptsImportFuelFile.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaManageFuelReceiptsImportFuelFile() {
        return iftaManageFuelReceiptsImportFuelFile;
    }

    /**
     * Define o valor da propriedade iftaManageFuelReceiptsImportFuelFile.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaManageFuelReceiptsImportFuelFile(Boolean value) {
        this.iftaManageFuelReceiptsImportFuelFile = value;
    }

    /**
     * Obtém o valor da propriedade iftaManageManualDistance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaManageManualDistance() {
        return iftaManageManualDistance;
    }

    /**
     * Define o valor da propriedade iftaManageManualDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaManageManualDistance(Boolean value) {
        this.iftaManageManualDistance = value;
    }

    /**
     * Obtém o valor da propriedade iftaManageManualDistanceAdd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaManageManualDistanceAdd() {
        return iftaManageManualDistanceAdd;
    }

    /**
     * Define o valor da propriedade iftaManageManualDistanceAdd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaManageManualDistanceAdd(Boolean value) {
        this.iftaManageManualDistanceAdd = value;
    }

    /**
     * Obtém o valor da propriedade iftaManageManualDistanceEdit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaManageManualDistanceEdit() {
        return iftaManageManualDistanceEdit;
    }

    /**
     * Define o valor da propriedade iftaManageManualDistanceEdit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaManageManualDistanceEdit(Boolean value) {
        this.iftaManageManualDistanceEdit = value;
    }

    /**
     * Obtém o valor da propriedade iftaOfficialReports.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaOfficialReports() {
        return iftaOfficialReports;
    }

    /**
     * Define o valor da propriedade iftaOfficialReports.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaOfficialReports(Boolean value) {
        this.iftaOfficialReports = value;
    }

    /**
     * Obtém o valor da propriedade iftaReconciliationReport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaReconciliationReport() {
        return iftaReconciliationReport;
    }

    /**
     * Define o valor da propriedade iftaReconciliationReport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaReconciliationReport(Boolean value) {
        this.iftaReconciliationReport = value;
    }

    /**
     * Obtém o valor da propriedade iftaTools.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIftaTools() {
        return iftaTools;
    }

    /**
     * Define o valor da propriedade iftaTools.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIftaTools(Boolean value) {
        this.iftaTools = value;
    }

}
