
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de DataWarehouseKpiMeasureBase complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseKpiMeasureBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomMeasureAverageEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CustomMeasureEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseKpiMeasure_MeasureAverageSetting_AverageSetting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseKpiMeasure_MeasureCompareSetting_CompareSetting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DimensionFilters" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}ArrayOfDimensionFilter" minOccurs="0"/&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Guid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Measure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Settings" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="StringifiedFilters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseKpiMeasureBase", propOrder = {
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
    DataWarehouseScorecardKpiMeasure.class,
    DataWarehouseKpiMeasure.class
})
public class DataWarehouseKpiMeasureBase
    extends DomainEntity
{

    @XmlElementRef(name = "CustomMeasureAverageEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> customMeasureAverageEntityKey;
    @XmlElementRef(name = "CustomMeasureEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> customMeasureEntityKey;
    @XmlElementRef(name = "DataWarehouseKpiMeasure_MeasureAverageSetting_AverageSetting", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseKpiMeasureMeasureAverageSettingAverageSetting;
    @XmlElementRef(name = "DataWarehouseKpiMeasure_MeasureCompareSetting_CompareSetting", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseKpiMeasureMeasureCompareSettingCompareSetting;
    @XmlElementRef(name = "DimensionFilters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDimensionFilter> dimensionFilters;
    @XmlElementRef(name = "DisplayName", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayName;
    @XmlElement(name = "Guid")
    protected String guid;
    @XmlElement(name = "Index")
    protected Integer index;
    @XmlElementRef(name = "Measure", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> measure;
    @XmlElementRef(name = "Settings", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> settings;
    @XmlElementRef(name = "StringifiedFilters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stringifiedFilters;

    /**
     * Obtém o valor da propriedade customMeasureAverageEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCustomMeasureAverageEntityKey() {
        return customMeasureAverageEntityKey;
    }

    /**
     * Define o valor da propriedade customMeasureAverageEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCustomMeasureAverageEntityKey(JAXBElement<Long> value) {
        this.customMeasureAverageEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade customMeasureEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCustomMeasureEntityKey() {
        return customMeasureEntityKey;
    }

    /**
     * Define o valor da propriedade customMeasureEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCustomMeasureEntityKey(JAXBElement<Long> value) {
        this.customMeasureEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseKpiMeasureMeasureAverageSettingAverageSetting.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseKpiMeasureMeasureAverageSettingAverageSetting() {
        return dataWarehouseKpiMeasureMeasureAverageSettingAverageSetting;
    }

    /**
     * Define o valor da propriedade dataWarehouseKpiMeasureMeasureAverageSettingAverageSetting.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseKpiMeasureMeasureAverageSettingAverageSetting(JAXBElement<String> value) {
        this.dataWarehouseKpiMeasureMeasureAverageSettingAverageSetting = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseKpiMeasureMeasureCompareSettingCompareSetting.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseKpiMeasureMeasureCompareSettingCompareSetting() {
        return dataWarehouseKpiMeasureMeasureCompareSettingCompareSetting;
    }

    /**
     * Define o valor da propriedade dataWarehouseKpiMeasureMeasureCompareSettingCompareSetting.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseKpiMeasureMeasureCompareSettingCompareSetting(JAXBElement<String> value) {
        this.dataWarehouseKpiMeasureMeasureCompareSettingCompareSetting = value;
    }

    /**
     * Obtém o valor da propriedade dimensionFilters.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDimensionFilter }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDimensionFilter> getDimensionFilters() {
        return dimensionFilters;
    }

    /**
     * Define o valor da propriedade dimensionFilters.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDimensionFilter }{@code >}
     *     
     */
    public void setDimensionFilters(JAXBElement<ArrayOfDimensionFilter> value) {
        this.dimensionFilters = value;
    }

    /**
     * Obtém o valor da propriedade displayName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayName() {
        return displayName;
    }

    /**
     * Define o valor da propriedade displayName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayName(JAXBElement<String> value) {
        this.displayName = value;
    }

    /**
     * Obtém o valor da propriedade guid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Define o valor da propriedade guid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Obtém o valor da propriedade index.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * Define o valor da propriedade index.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

    /**
     * Obtém o valor da propriedade measure.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMeasure() {
        return measure;
    }

    /**
     * Define o valor da propriedade measure.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMeasure(JAXBElement<String> value) {
        this.measure = value;
    }

    /**
     * Obtém o valor da propriedade settings.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getSettings() {
        return settings;
    }

    /**
     * Define o valor da propriedade settings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setSettings(JAXBElement<byte[]> value) {
        this.settings = value;
    }

    /**
     * Obtém o valor da propriedade stringifiedFilters.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStringifiedFilters() {
        return stringifiedFilters;
    }

    /**
     * Define o valor da propriedade stringifiedFilters.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStringifiedFilters(JAXBElement<String> value) {
        this.stringifiedFilters = value;
    }

}
