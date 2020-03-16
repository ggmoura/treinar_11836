
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DataWarehouseKpiSortingOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseKpiSortingOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseDataPointsLimiterSettings_ResultsLimiterMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseKpiMeasure_MeasureCompareSetting_SortMeasureCompareOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseKpiSortingOptions_SortByType_SortBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseKpiSortingOptions_SortOrderType_SortOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResultsLimiter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SortMeasureGuid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseKpiSortingOptions", propOrder = {
    "dataWarehouseDataPointsLimiterSettingsResultsLimiterMode",
    "dataWarehouseKpiMeasureMeasureCompareSettingSortMeasureCompareOption",
    "dataWarehouseKpiSortingOptionsSortByTypeSortBy",
    "dataWarehouseKpiSortingOptionsSortOrderTypeSortOrder",
    "resultsLimiter",
    "sortMeasureGuid"
})
public class DataWarehouseKpiSortingOptions
    extends DataTransferObject
{

    @XmlElementRef(name = "DataWarehouseDataPointsLimiterSettings_ResultsLimiterMode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseDataPointsLimiterSettingsResultsLimiterMode;
    @XmlElementRef(name = "DataWarehouseKpiMeasure_MeasureCompareSetting_SortMeasureCompareOption", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseKpiMeasureMeasureCompareSettingSortMeasureCompareOption;
    @XmlElementRef(name = "DataWarehouseKpiSortingOptions_SortByType_SortBy", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseKpiSortingOptionsSortByTypeSortBy;
    @XmlElementRef(name = "DataWarehouseKpiSortingOptions_SortOrderType_SortOrder", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseKpiSortingOptionsSortOrderTypeSortOrder;
    @XmlElement(name = "ResultsLimiter")
    protected Integer resultsLimiter;
    @XmlElement(name = "SortMeasureGuid")
    protected String sortMeasureGuid;

    /**
     * Obtém o valor da propriedade dataWarehouseDataPointsLimiterSettingsResultsLimiterMode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseDataPointsLimiterSettingsResultsLimiterMode() {
        return dataWarehouseDataPointsLimiterSettingsResultsLimiterMode;
    }

    /**
     * Define o valor da propriedade dataWarehouseDataPointsLimiterSettingsResultsLimiterMode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseDataPointsLimiterSettingsResultsLimiterMode(JAXBElement<String> value) {
        this.dataWarehouseDataPointsLimiterSettingsResultsLimiterMode = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseKpiMeasureMeasureCompareSettingSortMeasureCompareOption.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseKpiMeasureMeasureCompareSettingSortMeasureCompareOption() {
        return dataWarehouseKpiMeasureMeasureCompareSettingSortMeasureCompareOption;
    }

    /**
     * Define o valor da propriedade dataWarehouseKpiMeasureMeasureCompareSettingSortMeasureCompareOption.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseKpiMeasureMeasureCompareSettingSortMeasureCompareOption(JAXBElement<String> value) {
        this.dataWarehouseKpiMeasureMeasureCompareSettingSortMeasureCompareOption = value;
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
     * Obtém o valor da propriedade resultsLimiter.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultsLimiter() {
        return resultsLimiter;
    }

    /**
     * Define o valor da propriedade resultsLimiter.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultsLimiter(Integer value) {
        this.resultsLimiter = value;
    }

    /**
     * Obtém o valor da propriedade sortMeasureGuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortMeasureGuid() {
        return sortMeasureGuid;
    }

    /**
     * Define o valor da propriedade sortMeasureGuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortMeasureGuid(String value) {
        this.sortMeasureGuid = value;
    }

}
