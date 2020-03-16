
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de KpiMeasureBasePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="KpiMeasureBasePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomMeasureAverageEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomMeasureEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseKpiMeasure_MeasureAverageSetting_AverageSetting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseKpiMeasure_MeasureCompareSetting_CompareSetting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DimensionFilters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Guid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Measure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Settings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StringifiedFilters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KpiMeasureBasePropertyOptions", propOrder = {
    "customMeasureAverageEntityKey",
    "customMeasureEntityKey",
    "dataWarehouseKpiMeasureMeasureAverageSettingAverageSetting",
    "dataWarehouseKpiMeasureMeasureCompareSettingCompareSetting",
    "dimensionFilters",
    "displayName",
    "guid",
    "index",
    "measure",
    "settings",
    "stringifiedFilters"
})
@XmlSeeAlso({
    ScorecardKpiMeasurePropertyOptions.class,
    KpiMeasurePropertyOptions.class
})
public class KpiMeasureBasePropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "CustomMeasureAverageEntityKey")
    protected Boolean customMeasureAverageEntityKey;
    @XmlElement(name = "CustomMeasureEntityKey")
    protected Boolean customMeasureEntityKey;
    @XmlElement(name = "DataWarehouseKpiMeasure_MeasureAverageSetting_AverageSetting")
    protected Boolean dataWarehouseKpiMeasureMeasureAverageSettingAverageSetting;
    @XmlElement(name = "DataWarehouseKpiMeasure_MeasureCompareSetting_CompareSetting")
    protected Boolean dataWarehouseKpiMeasureMeasureCompareSettingCompareSetting;
    @XmlElement(name = "DimensionFilters")
    protected Boolean dimensionFilters;
    @XmlElement(name = "DisplayName")
    protected Boolean displayName;
    @XmlElement(name = "Guid")
    protected Boolean guid;
    @XmlElement(name = "Index")
    protected Boolean index;
    @XmlElement(name = "Measure")
    protected Boolean measure;
    @XmlElement(name = "Settings")
    protected Boolean settings;
    @XmlElement(name = "StringifiedFilters")
    protected Boolean stringifiedFilters;

    /**
     * Obtém o valor da propriedade customMeasureAverageEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomMeasureAverageEntityKey() {
        return customMeasureAverageEntityKey;
    }

    /**
     * Define o valor da propriedade customMeasureAverageEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomMeasureAverageEntityKey(Boolean value) {
        this.customMeasureAverageEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade customMeasureEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomMeasureEntityKey() {
        return customMeasureEntityKey;
    }

    /**
     * Define o valor da propriedade customMeasureEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomMeasureEntityKey(Boolean value) {
        this.customMeasureEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseKpiMeasureMeasureAverageSettingAverageSetting.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseKpiMeasureMeasureAverageSettingAverageSetting() {
        return dataWarehouseKpiMeasureMeasureAverageSettingAverageSetting;
    }

    /**
     * Define o valor da propriedade dataWarehouseKpiMeasureMeasureAverageSettingAverageSetting.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseKpiMeasureMeasureAverageSettingAverageSetting(Boolean value) {
        this.dataWarehouseKpiMeasureMeasureAverageSettingAverageSetting = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseKpiMeasureMeasureCompareSettingCompareSetting.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseKpiMeasureMeasureCompareSettingCompareSetting() {
        return dataWarehouseKpiMeasureMeasureCompareSettingCompareSetting;
    }

    /**
     * Define o valor da propriedade dataWarehouseKpiMeasureMeasureCompareSettingCompareSetting.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseKpiMeasureMeasureCompareSettingCompareSetting(Boolean value) {
        this.dataWarehouseKpiMeasureMeasureCompareSettingCompareSetting = value;
    }

    /**
     * Obtém o valor da propriedade dimensionFilters.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDimensionFilters() {
        return dimensionFilters;
    }

    /**
     * Define o valor da propriedade dimensionFilters.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDimensionFilters(Boolean value) {
        this.dimensionFilters = value;
    }

    /**
     * Obtém o valor da propriedade displayName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayName() {
        return displayName;
    }

    /**
     * Define o valor da propriedade displayName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayName(Boolean value) {
        this.displayName = value;
    }

    /**
     * Obtém o valor da propriedade guid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuid() {
        return guid;
    }

    /**
     * Define o valor da propriedade guid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuid(Boolean value) {
        this.guid = value;
    }

    /**
     * Obtém o valor da propriedade index.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndex() {
        return index;
    }

    /**
     * Define o valor da propriedade index.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndex(Boolean value) {
        this.index = value;
    }

    /**
     * Obtém o valor da propriedade measure.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeasure() {
        return measure;
    }

    /**
     * Define o valor da propriedade measure.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeasure(Boolean value) {
        this.measure = value;
    }

    /**
     * Obtém o valor da propriedade settings.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSettings() {
        return settings;
    }

    /**
     * Define o valor da propriedade settings.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSettings(Boolean value) {
        this.settings = value;
    }

    /**
     * Obtém o valor da propriedade stringifiedFilters.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStringifiedFilters() {
        return stringifiedFilters;
    }

    /**
     * Define o valor da propriedade stringifiedFilters.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStringifiedFilters(Boolean value) {
        this.stringifiedFilters = value;
    }

}
