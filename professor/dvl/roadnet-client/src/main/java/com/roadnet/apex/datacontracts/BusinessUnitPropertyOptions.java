
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de BusinessUnitPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BusinessUnitPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveAlert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AlgoPerformanceStopLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CalculateOptimalRouteMetrics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Category1Alias" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Category2Alias" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Category3Alias" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataFeedSettings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Defaults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisplayInternationalTimeZones" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HarshDrivingThresholds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreSkuServiceTimeForBulkService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MeasurementOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOne" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Quantities_Field_EquivalencyDestinationSize" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Quantities_Field_EquivalencySourceSize" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Quantities_Field_UnitOfBulkService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Quantities_Field_UnitOfCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Quantities_Field_UnitOfService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Quantities_Field_UnitOfWorkerActuals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QuantityPrecision" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Size1Alias" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Size2Alias" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Size3Alias" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseCommunityEdits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseEquivalencies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseLineItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseNavigationPathCalculator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessUnitPropertyOptions", propOrder = {
    "activeAlert",
    "algoPerformanceStopLimit",
    "calculateOptimalRouteMetrics",
    "category1Alias",
    "category2Alias",
    "category3Alias",
    "dataFeedSettings",
    "defaults",
    "description",
    "displayInternationalTimeZones",
    "harshDrivingThresholds",
    "identifier",
    "ignoreSkuServiceTimeForBulkService",
    "isDeleted",
    "measurementOptions",
    "omnitracsOne",
    "quantitiesFieldEquivalencyDestinationSize",
    "quantitiesFieldEquivalencySourceSize",
    "quantitiesFieldUnitOfBulkService",
    "quantitiesFieldUnitOfCost",
    "quantitiesFieldUnitOfService",
    "quantitiesFieldUnitOfWorkerActuals",
    "quantityPrecision",
    "size1Alias",
    "size2Alias",
    "size3Alias",
    "useCommunityEdits",
    "useEquivalencies",
    "useLineItems",
    "useNavigationPathCalculator"
})
public class BusinessUnitPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "ActiveAlert")
    protected Boolean activeAlert;
    @XmlElement(name = "AlgoPerformanceStopLimit")
    protected Boolean algoPerformanceStopLimit;
    @XmlElement(name = "CalculateOptimalRouteMetrics")
    protected Boolean calculateOptimalRouteMetrics;
    @XmlElement(name = "Category1Alias")
    protected Boolean category1Alias;
    @XmlElement(name = "Category2Alias")
    protected Boolean category2Alias;
    @XmlElement(name = "Category3Alias")
    protected Boolean category3Alias;
    @XmlElement(name = "DataFeedSettings")
    protected Boolean dataFeedSettings;
    @XmlElement(name = "Defaults")
    protected Boolean defaults;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "DisplayInternationalTimeZones")
    protected Boolean displayInternationalTimeZones;
    @XmlElement(name = "HarshDrivingThresholds")
    protected Boolean harshDrivingThresholds;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IgnoreSkuServiceTimeForBulkService")
    protected Boolean ignoreSkuServiceTimeForBulkService;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "MeasurementOptions")
    protected Boolean measurementOptions;
    @XmlElement(name = "OmnitracsOne")
    protected Boolean omnitracsOne;
    @XmlElement(name = "Quantities_Field_EquivalencyDestinationSize")
    protected Boolean quantitiesFieldEquivalencyDestinationSize;
    @XmlElement(name = "Quantities_Field_EquivalencySourceSize")
    protected Boolean quantitiesFieldEquivalencySourceSize;
    @XmlElement(name = "Quantities_Field_UnitOfBulkService")
    protected Boolean quantitiesFieldUnitOfBulkService;
    @XmlElement(name = "Quantities_Field_UnitOfCost")
    protected Boolean quantitiesFieldUnitOfCost;
    @XmlElement(name = "Quantities_Field_UnitOfService")
    protected Boolean quantitiesFieldUnitOfService;
    @XmlElement(name = "Quantities_Field_UnitOfWorkerActuals")
    protected Boolean quantitiesFieldUnitOfWorkerActuals;
    @XmlElement(name = "QuantityPrecision")
    protected Boolean quantityPrecision;
    @XmlElement(name = "Size1Alias")
    protected Boolean size1Alias;
    @XmlElement(name = "Size2Alias")
    protected Boolean size2Alias;
    @XmlElement(name = "Size3Alias")
    protected Boolean size3Alias;
    @XmlElement(name = "UseCommunityEdits")
    protected Boolean useCommunityEdits;
    @XmlElement(name = "UseEquivalencies")
    protected Boolean useEquivalencies;
    @XmlElement(name = "UseLineItems")
    protected Boolean useLineItems;
    @XmlElement(name = "UseNavigationPathCalculator")
    protected Boolean useNavigationPathCalculator;

    /**
     * Obtém o valor da propriedade activeAlert.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveAlert() {
        return activeAlert;
    }

    /**
     * Define o valor da propriedade activeAlert.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveAlert(Boolean value) {
        this.activeAlert = value;
    }

    /**
     * Obtém o valor da propriedade algoPerformanceStopLimit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlgoPerformanceStopLimit() {
        return algoPerformanceStopLimit;
    }

    /**
     * Define o valor da propriedade algoPerformanceStopLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlgoPerformanceStopLimit(Boolean value) {
        this.algoPerformanceStopLimit = value;
    }

    /**
     * Obtém o valor da propriedade calculateOptimalRouteMetrics.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateOptimalRouteMetrics() {
        return calculateOptimalRouteMetrics;
    }

    /**
     * Define o valor da propriedade calculateOptimalRouteMetrics.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateOptimalRouteMetrics(Boolean value) {
        this.calculateOptimalRouteMetrics = value;
    }

    /**
     * Obtém o valor da propriedade category1Alias.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCategory1Alias() {
        return category1Alias;
    }

    /**
     * Define o valor da propriedade category1Alias.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategory1Alias(Boolean value) {
        this.category1Alias = value;
    }

    /**
     * Obtém o valor da propriedade category2Alias.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCategory2Alias() {
        return category2Alias;
    }

    /**
     * Define o valor da propriedade category2Alias.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategory2Alias(Boolean value) {
        this.category2Alias = value;
    }

    /**
     * Obtém o valor da propriedade category3Alias.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCategory3Alias() {
        return category3Alias;
    }

    /**
     * Define o valor da propriedade category3Alias.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategory3Alias(Boolean value) {
        this.category3Alias = value;
    }

    /**
     * Obtém o valor da propriedade dataFeedSettings.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataFeedSettings() {
        return dataFeedSettings;
    }

    /**
     * Define o valor da propriedade dataFeedSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataFeedSettings(Boolean value) {
        this.dataFeedSettings = value;
    }

    /**
     * Obtém o valor da propriedade defaults.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaults() {
        return defaults;
    }

    /**
     * Define o valor da propriedade defaults.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaults(Boolean value) {
        this.defaults = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade displayInternationalTimeZones.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayInternationalTimeZones() {
        return displayInternationalTimeZones;
    }

    /**
     * Define o valor da propriedade displayInternationalTimeZones.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayInternationalTimeZones(Boolean value) {
        this.displayInternationalTimeZones = value;
    }

    /**
     * Obtém o valor da propriedade harshDrivingThresholds.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHarshDrivingThresholds() {
        return harshDrivingThresholds;
    }

    /**
     * Define o valor da propriedade harshDrivingThresholds.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHarshDrivingThresholds(Boolean value) {
        this.harshDrivingThresholds = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifier(Boolean value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade ignoreSkuServiceTimeForBulkService.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreSkuServiceTimeForBulkService() {
        return ignoreSkuServiceTimeForBulkService;
    }

    /**
     * Define o valor da propriedade ignoreSkuServiceTimeForBulkService.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreSkuServiceTimeForBulkService(Boolean value) {
        this.ignoreSkuServiceTimeForBulkService = value;
    }

    /**
     * Obtém o valor da propriedade isDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Define o valor da propriedade isDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Obtém o valor da propriedade measurementOptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeasurementOptions() {
        return measurementOptions;
    }

    /**
     * Define o valor da propriedade measurementOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeasurementOptions(Boolean value) {
        this.measurementOptions = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsOne.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOmnitracsOne() {
        return omnitracsOne;
    }

    /**
     * Define o valor da propriedade omnitracsOne.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOmnitracsOne(Boolean value) {
        this.omnitracsOne = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesFieldEquivalencyDestinationSize.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantitiesFieldEquivalencyDestinationSize() {
        return quantitiesFieldEquivalencyDestinationSize;
    }

    /**
     * Define o valor da propriedade quantitiesFieldEquivalencyDestinationSize.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantitiesFieldEquivalencyDestinationSize(Boolean value) {
        this.quantitiesFieldEquivalencyDestinationSize = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesFieldEquivalencySourceSize.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantitiesFieldEquivalencySourceSize() {
        return quantitiesFieldEquivalencySourceSize;
    }

    /**
     * Define o valor da propriedade quantitiesFieldEquivalencySourceSize.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantitiesFieldEquivalencySourceSize(Boolean value) {
        this.quantitiesFieldEquivalencySourceSize = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesFieldUnitOfBulkService.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantitiesFieldUnitOfBulkService() {
        return quantitiesFieldUnitOfBulkService;
    }

    /**
     * Define o valor da propriedade quantitiesFieldUnitOfBulkService.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantitiesFieldUnitOfBulkService(Boolean value) {
        this.quantitiesFieldUnitOfBulkService = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesFieldUnitOfCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantitiesFieldUnitOfCost() {
        return quantitiesFieldUnitOfCost;
    }

    /**
     * Define o valor da propriedade quantitiesFieldUnitOfCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantitiesFieldUnitOfCost(Boolean value) {
        this.quantitiesFieldUnitOfCost = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesFieldUnitOfService.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantitiesFieldUnitOfService() {
        return quantitiesFieldUnitOfService;
    }

    /**
     * Define o valor da propriedade quantitiesFieldUnitOfService.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantitiesFieldUnitOfService(Boolean value) {
        this.quantitiesFieldUnitOfService = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesFieldUnitOfWorkerActuals.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantitiesFieldUnitOfWorkerActuals() {
        return quantitiesFieldUnitOfWorkerActuals;
    }

    /**
     * Define o valor da propriedade quantitiesFieldUnitOfWorkerActuals.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantitiesFieldUnitOfWorkerActuals(Boolean value) {
        this.quantitiesFieldUnitOfWorkerActuals = value;
    }

    /**
     * Obtém o valor da propriedade quantityPrecision.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantityPrecision() {
        return quantityPrecision;
    }

    /**
     * Define o valor da propriedade quantityPrecision.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantityPrecision(Boolean value) {
        this.quantityPrecision = value;
    }

    /**
     * Obtém o valor da propriedade size1Alias.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSize1Alias() {
        return size1Alias;
    }

    /**
     * Define o valor da propriedade size1Alias.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSize1Alias(Boolean value) {
        this.size1Alias = value;
    }

    /**
     * Obtém o valor da propriedade size2Alias.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSize2Alias() {
        return size2Alias;
    }

    /**
     * Define o valor da propriedade size2Alias.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSize2Alias(Boolean value) {
        this.size2Alias = value;
    }

    /**
     * Obtém o valor da propriedade size3Alias.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSize3Alias() {
        return size3Alias;
    }

    /**
     * Define o valor da propriedade size3Alias.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSize3Alias(Boolean value) {
        this.size3Alias = value;
    }

    /**
     * Obtém o valor da propriedade useCommunityEdits.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCommunityEdits() {
        return useCommunityEdits;
    }

    /**
     * Define o valor da propriedade useCommunityEdits.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCommunityEdits(Boolean value) {
        this.useCommunityEdits = value;
    }

    /**
     * Obtém o valor da propriedade useEquivalencies.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseEquivalencies() {
        return useEquivalencies;
    }

    /**
     * Define o valor da propriedade useEquivalencies.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseEquivalencies(Boolean value) {
        this.useEquivalencies = value;
    }

    /**
     * Obtém o valor da propriedade useLineItems.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseLineItems() {
        return useLineItems;
    }

    /**
     * Define o valor da propriedade useLineItems.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLineItems(Boolean value) {
        this.useLineItems = value;
    }

    /**
     * Obtém o valor da propriedade useNavigationPathCalculator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseNavigationPathCalculator() {
        return useNavigationPathCalculator;
    }

    /**
     * Define o valor da propriedade useNavigationPathCalculator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseNavigationPathCalculator(Boolean value) {
        this.useNavigationPathCalculator = value;
    }

}
