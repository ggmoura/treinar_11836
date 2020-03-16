
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import com.roadnet.apex.datacontracts.EntityExportTemplate;
import com.roadnet.apex.datacontracts.StrategicRoutingSession;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.CoordinateFormat;


/**
 * <p>Classe Java de ExportPlanningSolutionJobParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ExportPlanningSolutionJobParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveDaysOfWeek" type="{http://roadnet.com/apex/DataContracts/}DayOfWeekFlags" minOccurs="0"/&gt;
 *         &lt;element name="ActiveWeeks" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="ExportPlanningSolutionDaysOutputFormat_DaysOutputFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExportPlanningSolutionTimeZoneOption_TimeZoneOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExportPlanningSolutionWeeksOutputFormat_WeeksOutputFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncludeOriginalOrderRecordsInOutput" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IncludeRecurringOrdersThatWereNotImported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IncludeUnassigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IncludeUnrouted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LatLongFormat" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import}CoordinateFormat" minOccurs="0"/&gt;
 *         &lt;element name="LatLongPercision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlanningSession" type="{http://roadnet.com/apex/DataContracts/}StrategicRoutingSession" minOccurs="0"/&gt;
 *         &lt;element name="StopNumberFormat_AssignStopNumbersBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Template" type="{http://roadnet.com/apex/DataContracts/}EntityExportTemplate" minOccurs="0"/&gt;
 *         &lt;element name="Territories" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="UseLatLongSuffix" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VariableServiceTimeFormat_ServiceTimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportPlanningSolutionJobParameters", propOrder = {
    "activeDaysOfWeek",
    "activeWeeks",
    "exportPlanningSolutionDaysOutputFormatDaysOutputFormat",
    "exportPlanningSolutionTimeZoneOptionTimeZoneOption",
    "exportPlanningSolutionWeeksOutputFormatWeeksOutputFormat",
    "includeOriginalOrderRecordsInOutput",
    "includeRecurringOrdersThatWereNotImported",
    "includeUnassigned",
    "includeUnrouted",
    "latLongFormat",
    "latLongPercision",
    "planningSession",
    "stopNumberFormatAssignStopNumbersBy",
    "template",
    "territories",
    "useLatLongSuffix",
    "variableServiceTimeFormatServiceTimeFormat",
    "worldTimeZoneTimeZone"
})
public class ExportPlanningSolutionJobParameters {

    @XmlList
    @XmlElement(name = "ActiveDaysOfWeek")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> activeDaysOfWeek;
    @XmlElementRef(name = "ActiveWeeks", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> activeWeeks;
    @XmlElementRef(name = "ExportPlanningSolutionDaysOutputFormat_DaysOutputFormat", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exportPlanningSolutionDaysOutputFormatDaysOutputFormat;
    @XmlElementRef(name = "ExportPlanningSolutionTimeZoneOption_TimeZoneOption", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exportPlanningSolutionTimeZoneOptionTimeZoneOption;
    @XmlElementRef(name = "ExportPlanningSolutionWeeksOutputFormat_WeeksOutputFormat", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exportPlanningSolutionWeeksOutputFormatWeeksOutputFormat;
    @XmlElement(name = "IncludeOriginalOrderRecordsInOutput")
    protected Boolean includeOriginalOrderRecordsInOutput;
    @XmlElement(name = "IncludeRecurringOrdersThatWereNotImported")
    protected Boolean includeRecurringOrdersThatWereNotImported;
    @XmlElement(name = "IncludeUnassigned")
    protected Boolean includeUnassigned;
    @XmlElement(name = "IncludeUnrouted")
    protected Boolean includeUnrouted;
    @XmlElement(name = "LatLongFormat")
    @XmlSchemaType(name = "string")
    protected CoordinateFormat latLongFormat;
    @XmlElementRef(name = "LatLongPercision", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> latLongPercision;
    @XmlElementRef(name = "PlanningSession", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<StrategicRoutingSession> planningSession;
    @XmlElementRef(name = "StopNumberFormat_AssignStopNumbersBy", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stopNumberFormatAssignStopNumbersBy;
    @XmlElementRef(name = "Template", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityExportTemplate> template;
    @XmlElementRef(name = "Territories", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> territories;
    @XmlElement(name = "UseLatLongSuffix")
    protected Boolean useLatLongSuffix;
    @XmlElementRef(name = "VariableServiceTimeFormat_ServiceTimeFormat", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> variableServiceTimeFormatServiceTimeFormat;
    @XmlElementRef(name = "WorldTimeZone_TimeZone", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worldTimeZoneTimeZone;

    /**
     * Gets the value of the activeDaysOfWeek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activeDaysOfWeek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActiveDaysOfWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getActiveDaysOfWeek() {
        if (activeDaysOfWeek == null) {
            activeDaysOfWeek = new ArrayList<String>();
        }
        return this.activeDaysOfWeek;
    }

    /**
     * Obtém o valor da propriedade activeWeeks.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getActiveWeeks() {
        return activeWeeks;
    }

    /**
     * Define o valor da propriedade activeWeeks.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setActiveWeeks(JAXBElement<ArrayOfint> value) {
        this.activeWeeks = value;
    }

    /**
     * Obtém o valor da propriedade exportPlanningSolutionDaysOutputFormatDaysOutputFormat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExportPlanningSolutionDaysOutputFormatDaysOutputFormat() {
        return exportPlanningSolutionDaysOutputFormatDaysOutputFormat;
    }

    /**
     * Define o valor da propriedade exportPlanningSolutionDaysOutputFormatDaysOutputFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExportPlanningSolutionDaysOutputFormatDaysOutputFormat(JAXBElement<String> value) {
        this.exportPlanningSolutionDaysOutputFormatDaysOutputFormat = value;
    }

    /**
     * Obtém o valor da propriedade exportPlanningSolutionTimeZoneOptionTimeZoneOption.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExportPlanningSolutionTimeZoneOptionTimeZoneOption() {
        return exportPlanningSolutionTimeZoneOptionTimeZoneOption;
    }

    /**
     * Define o valor da propriedade exportPlanningSolutionTimeZoneOptionTimeZoneOption.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExportPlanningSolutionTimeZoneOptionTimeZoneOption(JAXBElement<String> value) {
        this.exportPlanningSolutionTimeZoneOptionTimeZoneOption = value;
    }

    /**
     * Obtém o valor da propriedade exportPlanningSolutionWeeksOutputFormatWeeksOutputFormat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExportPlanningSolutionWeeksOutputFormatWeeksOutputFormat() {
        return exportPlanningSolutionWeeksOutputFormatWeeksOutputFormat;
    }

    /**
     * Define o valor da propriedade exportPlanningSolutionWeeksOutputFormatWeeksOutputFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExportPlanningSolutionWeeksOutputFormatWeeksOutputFormat(JAXBElement<String> value) {
        this.exportPlanningSolutionWeeksOutputFormatWeeksOutputFormat = value;
    }

    /**
     * Obtém o valor da propriedade includeOriginalOrderRecordsInOutput.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeOriginalOrderRecordsInOutput() {
        return includeOriginalOrderRecordsInOutput;
    }

    /**
     * Define o valor da propriedade includeOriginalOrderRecordsInOutput.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeOriginalOrderRecordsInOutput(Boolean value) {
        this.includeOriginalOrderRecordsInOutput = value;
    }

    /**
     * Obtém o valor da propriedade includeRecurringOrdersThatWereNotImported.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeRecurringOrdersThatWereNotImported() {
        return includeRecurringOrdersThatWereNotImported;
    }

    /**
     * Define o valor da propriedade includeRecurringOrdersThatWereNotImported.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeRecurringOrdersThatWereNotImported(Boolean value) {
        this.includeRecurringOrdersThatWereNotImported = value;
    }

    /**
     * Obtém o valor da propriedade includeUnassigned.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeUnassigned() {
        return includeUnassigned;
    }

    /**
     * Define o valor da propriedade includeUnassigned.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeUnassigned(Boolean value) {
        this.includeUnassigned = value;
    }

    /**
     * Obtém o valor da propriedade includeUnrouted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeUnrouted() {
        return includeUnrouted;
    }

    /**
     * Define o valor da propriedade includeUnrouted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeUnrouted(Boolean value) {
        this.includeUnrouted = value;
    }

    /**
     * Obtém o valor da propriedade latLongFormat.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateFormat }
     *     
     */
    public CoordinateFormat getLatLongFormat() {
        return latLongFormat;
    }

    /**
     * Define o valor da propriedade latLongFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateFormat }
     *     
     */
    public void setLatLongFormat(CoordinateFormat value) {
        this.latLongFormat = value;
    }

    /**
     * Obtém o valor da propriedade latLongPercision.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLatLongPercision() {
        return latLongPercision;
    }

    /**
     * Define o valor da propriedade latLongPercision.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLatLongPercision(JAXBElement<Integer> value) {
        this.latLongPercision = value;
    }

    /**
     * Obtém o valor da propriedade planningSession.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StrategicRoutingSession }{@code >}
     *     
     */
    public JAXBElement<StrategicRoutingSession> getPlanningSession() {
        return planningSession;
    }

    /**
     * Define o valor da propriedade planningSession.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StrategicRoutingSession }{@code >}
     *     
     */
    public void setPlanningSession(JAXBElement<StrategicRoutingSession> value) {
        this.planningSession = value;
    }

    /**
     * Obtém o valor da propriedade stopNumberFormatAssignStopNumbersBy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStopNumberFormatAssignStopNumbersBy() {
        return stopNumberFormatAssignStopNumbersBy;
    }

    /**
     * Define o valor da propriedade stopNumberFormatAssignStopNumbersBy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStopNumberFormatAssignStopNumbersBy(JAXBElement<String> value) {
        this.stopNumberFormatAssignStopNumbersBy = value;
    }

    /**
     * Obtém o valor da propriedade template.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityExportTemplate }{@code >}
     *     
     */
    public JAXBElement<EntityExportTemplate> getTemplate() {
        return template;
    }

    /**
     * Define o valor da propriedade template.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityExportTemplate }{@code >}
     *     
     */
    public void setTemplate(JAXBElement<EntityExportTemplate> value) {
        this.template = value;
    }

    /**
     * Obtém o valor da propriedade territories.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getTerritories() {
        return territories;
    }

    /**
     * Define o valor da propriedade territories.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setTerritories(JAXBElement<ArrayOflong> value) {
        this.territories = value;
    }

    /**
     * Obtém o valor da propriedade useLatLongSuffix.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseLatLongSuffix() {
        return useLatLongSuffix;
    }

    /**
     * Define o valor da propriedade useLatLongSuffix.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLatLongSuffix(Boolean value) {
        this.useLatLongSuffix = value;
    }

    /**
     * Obtém o valor da propriedade variableServiceTimeFormatServiceTimeFormat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVariableServiceTimeFormatServiceTimeFormat() {
        return variableServiceTimeFormatServiceTimeFormat;
    }

    /**
     * Define o valor da propriedade variableServiceTimeFormatServiceTimeFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVariableServiceTimeFormatServiceTimeFormat(JAXBElement<String> value) {
        this.variableServiceTimeFormatServiceTimeFormat = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorldTimeZoneTimeZone() {
        return worldTimeZoneTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorldTimeZoneTimeZone(JAXBElement<String> value) {
        this.worldTimeZoneTimeZone = value;
    }

}
