
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.FindCustomersJobInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.DataWarehouseKpiExecutionJobInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseCleansingJobInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiExportJobInfo;


/**
 * <p>Classe Java de JobInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="JobInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FinishTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="JobFailureReason_FailureReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JobState_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobInfo", propOrder = {
    "finishTime",
    "jobFailureReasonFailureReason",
    "jobStateState",
    "startTime"
})
@XmlSeeAlso({
    DataWarehouseKpiExecutionJobInfo.class,
    DeleteTerritoriesJobInfo.class,
    ExportPlanningSolutionJobInfo.class,
    SameDayMatricesJobInfo.class,
    DeleteStrategicRoutingSessionJobInfo.class,
    DeleteBusinessUnitJobInfo.class,
    ShiftDaysJobInfo.class,
    TransferRecurringOrdersJobInfo.class,
    UpdateStrategicPlanningSessionCacheJobInfo.class,
    SuggestTerritoryJobInfo.class,
    UpdateDailyRoutesJobInfo.class,
    AttachCustomerJobInfo.class,
    CalculateOptimalRouteMetricsJobInfo.class,
    DeleteRoutesJobInfo.class,
    DeleteRegionJobInfo.class,
    CreateTerritoriesJobInfo.class,
    MoveResourcesToRegionJobInfo.class,
    MoveUnassignedOrdersToSessionJobInfo.class,
    OptimizeTerritoriesJobInfo.class,
    RdcMigrationJobInfo.class,
    ComplianceDataRetrievalJobInfo.class,
    XrsMigrationJobInfo.class,
    ImportOBD2DiagnosticCodesJobInfo.class,
    GeocodeLocationsJobInfo.class,
    PrepareForNextDayJobInfo.class,
    StrategicRoutingJobInfo.class,
    GenerateRdcMigrationWorkbookJobInfo.class,
    ServicePatternAnalyzerJobInfo.class,
    SaveSessionAsJobInfo.class,
    UpdateCustomerRegionsJobInfo.class,
    InitializeDataWarehouseJobInfo.class,
    ScorecardJobInfo.class,
    UpdateConvertedCustomerJobInfo.class,
    CreateCustomerJobInfo.class,
    CreateDatabaseJobInfo.class,
    ReportGroupJobInfo.class,
    ReportJobInfo.class,
    ShadowProductionJobInfo.class,
    CreateRoutesJobInfo.class,
    GeocodeJobInfo.class,
    RoutingJobInfo.class,
    UpdateServiceTimeJobInfo.class,
    ImportJobInfo.class,
    DataWarehouseKpiExportJobInfo.class,
    DataWarehouseCleansingJobInfo.class,
    FindCustomersJobInfo.class
})
public class JobInfo
    extends AggregateRootEntity
{

    @XmlElementRef(name = "FinishTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> finishTime;
    @XmlElementRef(name = "JobFailureReason_FailureReason", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobFailureReasonFailureReason;
    @XmlElementRef(name = "JobState_State", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobStateState;
    @XmlElementRef(name = "StartTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startTime;

    /**
     * Obtém o valor da propriedade finishTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFinishTime() {
        return finishTime;
    }

    /**
     * Define o valor da propriedade finishTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFinishTime(JAXBElement<XMLGregorianCalendar> value) {
        this.finishTime = value;
    }

    /**
     * Obtém o valor da propriedade jobFailureReasonFailureReason.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobFailureReasonFailureReason() {
        return jobFailureReasonFailureReason;
    }

    /**
     * Define o valor da propriedade jobFailureReasonFailureReason.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobFailureReasonFailureReason(JAXBElement<String> value) {
        this.jobFailureReasonFailureReason = value;
    }

    /**
     * Obtém o valor da propriedade jobStateState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobStateState() {
        return jobStateState;
    }

    /**
     * Define o valor da propriedade jobStateState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobStateState(JAXBElement<String> value) {
        this.jobStateState = value;
    }

    /**
     * Obtém o valor da propriedade startTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartTime() {
        return startTime;
    }

    /**
     * Define o valor da propriedade startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.startTime = value;
    }

}
