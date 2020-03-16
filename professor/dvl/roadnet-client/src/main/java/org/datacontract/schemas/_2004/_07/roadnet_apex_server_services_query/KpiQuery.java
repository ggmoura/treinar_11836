
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.IMeasure;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.MeasureUnitOptions;


/**
 * <p>Classe Java de KpiQuery complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="KpiQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataPointsLimiter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseDataPointsLimiterSettings_DataPointsLimiterSetting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseKpiSortingOptions_SortByType_SortBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseKpiSortingOptions_SortOrderType_SortOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseRuleAction_RuleAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstDateInDateRange" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Groupings" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}Grouping" minOccurs="0"/&gt;
 *         &lt;element name="LastDateInDateRange" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Measure" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}IMeasure" minOccurs="0"/&gt;
 *         &lt;element name="MeasureUnitOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}MeasureUnitOptions" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfTimeUnitsInBeforeTodayRange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OperationsUnitAncestorEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="OperationsUnitExclude" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Rule" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}IMeasureRule" minOccurs="0"/&gt;
 *         &lt;element name="RuleLevel" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}Grouping" minOccurs="0"/&gt;
 *         &lt;element name="TimeRangeType_TimeRangeToUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeUnit_TimeUnitTypeInBeforeTodayRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KpiQuery", propOrder = {
    "dataPointsLimiter",
    "dataWarehouseDataPointsLimiterSettingsDataPointsLimiterSetting",
    "dataWarehouseKpiSortingOptionsSortByTypeSortBy",
    "dataWarehouseKpiSortingOptionsSortOrderTypeSortOrder",
    "dataWarehouseRuleActionRuleAction",
    "firstDateInDateRange",
    "groupings",
    "lastDateInDateRange",
    "measure",
    "measureUnitOptions",
    "numberOfTimeUnitsInBeforeTodayRange",
    "operationsUnitAncestorEntityKeys",
    "operationsUnitExclude",
    "rule",
    "ruleLevel",
    "timeRangeTypeTimeRangeToUse",
    "timeUnitTimeUnitTypeInBeforeTodayRange"
})
public class KpiQuery
    extends DataTransferObject
{

    @XmlElementRef(name = "DataPointsLimiter", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dataPointsLimiter;
    @XmlElementRef(name = "DataWarehouseDataPointsLimiterSettings_DataPointsLimiterSetting", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseDataPointsLimiterSettingsDataPointsLimiterSetting;
    @XmlElementRef(name = "DataWarehouseKpiSortingOptions_SortByType_SortBy", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseKpiSortingOptionsSortByTypeSortBy;
    @XmlElementRef(name = "DataWarehouseKpiSortingOptions_SortOrderType_SortOrder", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseKpiSortingOptionsSortOrderTypeSortOrder;
    @XmlElementRef(name = "DataWarehouseRuleAction_RuleAction", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseRuleActionRuleAction;
    @XmlElementRef(name = "FirstDateInDateRange", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> firstDateInDateRange;
    @XmlElementRef(name = "Groupings", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Grouping> groupings;
    @XmlElementRef(name = "LastDateInDateRange", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastDateInDateRange;
    @XmlElementRef(name = "Measure", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<IMeasure> measure;
    @XmlElementRef(name = "MeasureUnitOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<MeasureUnitOptions> measureUnitOptions;
    @XmlElement(name = "NumberOfTimeUnitsInBeforeTodayRange")
    protected Integer numberOfTimeUnitsInBeforeTodayRange;
    @XmlElementRef(name = "OperationsUnitAncestorEntityKeys", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> operationsUnitAncestorEntityKeys;
    @XmlElement(name = "OperationsUnitExclude")
    protected Boolean operationsUnitExclude;
    @XmlElementRef(name = "Rule", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<IMeasureRule> rule;
    @XmlElementRef(name = "RuleLevel", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Grouping> ruleLevel;
    @XmlElementRef(name = "TimeRangeType_TimeRangeToUse", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeRangeTypeTimeRangeToUse;
    @XmlElementRef(name = "TimeUnit_TimeUnitTypeInBeforeTodayRange", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeUnitTimeUnitTypeInBeforeTodayRange;

    /**
     * Obtém o valor da propriedade dataPointsLimiter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDataPointsLimiter() {
        return dataPointsLimiter;
    }

    /**
     * Define o valor da propriedade dataPointsLimiter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDataPointsLimiter(JAXBElement<Integer> value) {
        this.dataPointsLimiter = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseDataPointsLimiterSettingsDataPointsLimiterSetting.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseDataPointsLimiterSettingsDataPointsLimiterSetting() {
        return dataWarehouseDataPointsLimiterSettingsDataPointsLimiterSetting;
    }

    /**
     * Define o valor da propriedade dataWarehouseDataPointsLimiterSettingsDataPointsLimiterSetting.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseDataPointsLimiterSettingsDataPointsLimiterSetting(JAXBElement<String> value) {
        this.dataWarehouseDataPointsLimiterSettingsDataPointsLimiterSetting = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseKpiSortingOptionsSortByTypeSortBy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseKpiSortingOptionsSortByTypeSortBy() {
        return dataWarehouseKpiSortingOptionsSortByTypeSortBy;
    }

    /**
     * Define o valor da propriedade dataWarehouseKpiSortingOptionsSortByTypeSortBy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseKpiSortingOptionsSortByTypeSortBy(JAXBElement<String> value) {
        this.dataWarehouseKpiSortingOptionsSortByTypeSortBy = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseKpiSortingOptionsSortOrderTypeSortOrder.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseKpiSortingOptionsSortOrderTypeSortOrder() {
        return dataWarehouseKpiSortingOptionsSortOrderTypeSortOrder;
    }

    /**
     * Define o valor da propriedade dataWarehouseKpiSortingOptionsSortOrderTypeSortOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseKpiSortingOptionsSortOrderTypeSortOrder(JAXBElement<String> value) {
        this.dataWarehouseKpiSortingOptionsSortOrderTypeSortOrder = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseRuleActionRuleAction.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseRuleActionRuleAction() {
        return dataWarehouseRuleActionRuleAction;
    }

    /**
     * Define o valor da propriedade dataWarehouseRuleActionRuleAction.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseRuleActionRuleAction(JAXBElement<String> value) {
        this.dataWarehouseRuleActionRuleAction = value;
    }

    /**
     * Obtém o valor da propriedade firstDateInDateRange.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirstDateInDateRange() {
        return firstDateInDateRange;
    }

    /**
     * Define o valor da propriedade firstDateInDateRange.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirstDateInDateRange(JAXBElement<XMLGregorianCalendar> value) {
        this.firstDateInDateRange = value;
    }

    /**
     * Obtém o valor da propriedade groupings.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Grouping }{@code >}
     *     
     */
    public JAXBElement<Grouping> getGroupings() {
        return groupings;
    }

    /**
     * Define o valor da propriedade groupings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Grouping }{@code >}
     *     
     */
    public void setGroupings(JAXBElement<Grouping> value) {
        this.groupings = value;
    }

    /**
     * Obtém o valor da propriedade lastDateInDateRange.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastDateInDateRange() {
        return lastDateInDateRange;
    }

    /**
     * Define o valor da propriedade lastDateInDateRange.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastDateInDateRange(JAXBElement<XMLGregorianCalendar> value) {
        this.lastDateInDateRange = value;
    }

    /**
     * Obtém o valor da propriedade measure.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IMeasure }{@code >}
     *     
     */
    public JAXBElement<IMeasure> getMeasure() {
        return measure;
    }

    /**
     * Define o valor da propriedade measure.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IMeasure }{@code >}
     *     
     */
    public void setMeasure(JAXBElement<IMeasure> value) {
        this.measure = value;
    }

    /**
     * Obtém o valor da propriedade measureUnitOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeasureUnitOptions }{@code >}
     *     
     */
    public JAXBElement<MeasureUnitOptions> getMeasureUnitOptions() {
        return measureUnitOptions;
    }

    /**
     * Define o valor da propriedade measureUnitOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeasureUnitOptions }{@code >}
     *     
     */
    public void setMeasureUnitOptions(JAXBElement<MeasureUnitOptions> value) {
        this.measureUnitOptions = value;
    }

    /**
     * Obtém o valor da propriedade numberOfTimeUnitsInBeforeTodayRange.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfTimeUnitsInBeforeTodayRange() {
        return numberOfTimeUnitsInBeforeTodayRange;
    }

    /**
     * Define o valor da propriedade numberOfTimeUnitsInBeforeTodayRange.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfTimeUnitsInBeforeTodayRange(Integer value) {
        this.numberOfTimeUnitsInBeforeTodayRange = value;
    }

    /**
     * Obtém o valor da propriedade operationsUnitAncestorEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getOperationsUnitAncestorEntityKeys() {
        return operationsUnitAncestorEntityKeys;
    }

    /**
     * Define o valor da propriedade operationsUnitAncestorEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setOperationsUnitAncestorEntityKeys(JAXBElement<ArrayOflong> value) {
        this.operationsUnitAncestorEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade operationsUnitExclude.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOperationsUnitExclude() {
        return operationsUnitExclude;
    }

    /**
     * Define o valor da propriedade operationsUnitExclude.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOperationsUnitExclude(Boolean value) {
        this.operationsUnitExclude = value;
    }

    /**
     * Obtém o valor da propriedade rule.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IMeasureRule }{@code >}
     *     
     */
    public JAXBElement<IMeasureRule> getRule() {
        return rule;
    }

    /**
     * Define o valor da propriedade rule.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IMeasureRule }{@code >}
     *     
     */
    public void setRule(JAXBElement<IMeasureRule> value) {
        this.rule = value;
    }

    /**
     * Obtém o valor da propriedade ruleLevel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Grouping }{@code >}
     *     
     */
    public JAXBElement<Grouping> getRuleLevel() {
        return ruleLevel;
    }

    /**
     * Define o valor da propriedade ruleLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Grouping }{@code >}
     *     
     */
    public void setRuleLevel(JAXBElement<Grouping> value) {
        this.ruleLevel = value;
    }

    /**
     * Obtém o valor da propriedade timeRangeTypeTimeRangeToUse.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeRangeTypeTimeRangeToUse() {
        return timeRangeTypeTimeRangeToUse;
    }

    /**
     * Define o valor da propriedade timeRangeTypeTimeRangeToUse.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeRangeTypeTimeRangeToUse(JAXBElement<String> value) {
        this.timeRangeTypeTimeRangeToUse = value;
    }

    /**
     * Obtém o valor da propriedade timeUnitTimeUnitTypeInBeforeTodayRange.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeUnitTimeUnitTypeInBeforeTodayRange() {
        return timeUnitTimeUnitTypeInBeforeTodayRange;
    }

    /**
     * Define o valor da propriedade timeUnitTimeUnitTypeInBeforeTodayRange.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeUnitTimeUnitTypeInBeforeTodayRange(JAXBElement<String> value) {
        this.timeUnitTimeUnitTypeInBeforeTodayRange = value;
    }

}
