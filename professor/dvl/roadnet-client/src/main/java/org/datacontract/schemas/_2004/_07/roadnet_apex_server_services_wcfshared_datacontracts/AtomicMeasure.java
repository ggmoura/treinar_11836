
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AtomicMeasure complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AtomicMeasure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}IMeasure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConversionFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseAtomicMeasureType_MeasureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehousePlannedActualType_PlannedOrActual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DimensionFilters" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}ArrayOfDimensionFilter" minOccurs="0"/&gt;
 *         &lt;element name="Filters" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}Filters" minOccurs="0"/&gt;
 *         &lt;element name="IncludeAllDataForMatchingRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtomicMeasure", propOrder = {
    "conversionFactor",
    "dataWarehouseAtomicMeasureTypeMeasureType",
    "dataWarehousePlannedActualTypePlannedOrActual",
    "dimensionFilters",
    "filters",
    "includeAllDataForMatchingRoutes"
})
public class AtomicMeasure
    extends IMeasure
{

    @XmlElementRef(name = "ConversionFactor", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> conversionFactor;
    @XmlElementRef(name = "DataWarehouseAtomicMeasureType_MeasureType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseAtomicMeasureTypeMeasureType;
    @XmlElementRef(name = "DataWarehousePlannedActualType_PlannedOrActual", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehousePlannedActualTypePlannedOrActual;
    @XmlElementRef(name = "DimensionFilters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDimensionFilter> dimensionFilters;
    @XmlElementRef(name = "Filters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Filters> filters;
    @XmlElement(name = "IncludeAllDataForMatchingRoutes")
    protected Boolean includeAllDataForMatchingRoutes;

    /**
     * Obtém o valor da propriedade conversionFactor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getConversionFactor() {
        return conversionFactor;
    }

    /**
     * Define o valor da propriedade conversionFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setConversionFactor(JAXBElement<Double> value) {
        this.conversionFactor = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseAtomicMeasureTypeMeasureType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseAtomicMeasureTypeMeasureType() {
        return dataWarehouseAtomicMeasureTypeMeasureType;
    }

    /**
     * Define o valor da propriedade dataWarehouseAtomicMeasureTypeMeasureType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseAtomicMeasureTypeMeasureType(JAXBElement<String> value) {
        this.dataWarehouseAtomicMeasureTypeMeasureType = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehousePlannedActualTypePlannedOrActual.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehousePlannedActualTypePlannedOrActual() {
        return dataWarehousePlannedActualTypePlannedOrActual;
    }

    /**
     * Define o valor da propriedade dataWarehousePlannedActualTypePlannedOrActual.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehousePlannedActualTypePlannedOrActual(JAXBElement<String> value) {
        this.dataWarehousePlannedActualTypePlannedOrActual = value;
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
     * Obtém o valor da propriedade filters.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Filters }{@code >}
     *     
     */
    public JAXBElement<Filters> getFilters() {
        return filters;
    }

    /**
     * Define o valor da propriedade filters.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Filters }{@code >}
     *     
     */
    public void setFilters(JAXBElement<Filters> value) {
        this.filters = value;
    }

    /**
     * Obtém o valor da propriedade includeAllDataForMatchingRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAllDataForMatchingRoutes() {
        return includeAllDataForMatchingRoutes;
    }

    /**
     * Define o valor da propriedade includeAllDataForMatchingRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAllDataForMatchingRoutes(Boolean value) {
        this.includeAllDataForMatchingRoutes = value;
    }

}
