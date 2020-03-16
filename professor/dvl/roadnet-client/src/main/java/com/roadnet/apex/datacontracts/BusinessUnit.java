
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BusinessUnit complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BusinessUnit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveAlert" type="{http://roadnet.com/apex/DataContracts/}BusinessUnit.ActiveAlertSettings" minOccurs="0"/&gt;
 *         &lt;element name="AlgoPerformanceStopLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CalculateOptimalRouteMetrics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Category1Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Category2Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Category3Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataFeedSettings" type="{http://roadnet.com/apex/DataContracts/}BusinessUnit.ExternalDataFeedSettings" minOccurs="0"/&gt;
 *         &lt;element name="Defaults" type="{http://roadnet.com/apex/DataContracts/}BusinessUnit.DefaultSettings" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayInternationalTimeZones" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HarshDrivingThresholds" type="{http://roadnet.com/apex/DataContracts/}ArrayOfHarshDrivingThreshold" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreSkuServiceTimeForBulkService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MeasurementOptions" type="{http://roadnet.com/apex/DataContracts/}MeasurementOptions" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOne" type="{http://roadnet.com/apex/DataContracts/}BusinessUnit.OmnitracsOneSettings" minOccurs="0"/&gt;
 *         &lt;element name="Quantities_Field_EquivalencyDestinationSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantities_Field_EquivalencySourceSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantities_Field_UnitOfBulkService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantities_Field_UnitOfCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantities_Field_UnitOfService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantities_Field_UnitOfWorkerActuals" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuantityPrecision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Size1Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Size2Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Size3Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "BusinessUnit", propOrder = {
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
public class BusinessUnit
    extends AggregateRootEntity
{

    @XmlElementRef(name = "ActiveAlert", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<BusinessUnitActiveAlertSettings> activeAlert;
    @XmlElementRef(name = "AlgoPerformanceStopLimit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> algoPerformanceStopLimit;
    @XmlElement(name = "CalculateOptimalRouteMetrics")
    protected Boolean calculateOptimalRouteMetrics;
    @XmlElementRef(name = "Category1Alias", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> category1Alias;
    @XmlElementRef(name = "Category2Alias", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> category2Alias;
    @XmlElementRef(name = "Category3Alias", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> category3Alias;
    @XmlElementRef(name = "DataFeedSettings", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<BusinessUnitExternalDataFeedSettings> dataFeedSettings;
    @XmlElementRef(name = "Defaults", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<BusinessUnitDefaultSettings> defaults;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "DisplayInternationalTimeZones")
    protected Boolean displayInternationalTimeZones;
    @XmlElementRef(name = "HarshDrivingThresholds", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHarshDrivingThreshold> harshDrivingThresholds;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "IgnoreSkuServiceTimeForBulkService")
    protected Boolean ignoreSkuServiceTimeForBulkService;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElementRef(name = "MeasurementOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<MeasurementOptions> measurementOptions;
    @XmlElementRef(name = "OmnitracsOne", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<BusinessUnitOmnitracsOneSettings> omnitracsOne;
    @XmlElementRef(name = "Quantities_Field_EquivalencyDestinationSize", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quantitiesFieldEquivalencyDestinationSize;
    @XmlElementRef(name = "Quantities_Field_EquivalencySourceSize", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quantitiesFieldEquivalencySourceSize;
    @XmlElementRef(name = "Quantities_Field_UnitOfBulkService", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quantitiesFieldUnitOfBulkService;
    @XmlElementRef(name = "Quantities_Field_UnitOfCost", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quantitiesFieldUnitOfCost;
    @XmlElementRef(name = "Quantities_Field_UnitOfService", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quantitiesFieldUnitOfService;
    @XmlElementRef(name = "Quantities_Field_UnitOfWorkerActuals", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quantitiesFieldUnitOfWorkerActuals;
    @XmlElement(name = "QuantityPrecision")
    protected Integer quantityPrecision;
    @XmlElementRef(name = "Size1Alias", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> size1Alias;
    @XmlElementRef(name = "Size2Alias", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> size2Alias;
    @XmlElementRef(name = "Size3Alias", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> size3Alias;
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
     *     {@link JAXBElement }{@code <}{@link BusinessUnitActiveAlertSettings }{@code >}
     *     
     */
    public JAXBElement<BusinessUnitActiveAlertSettings> getActiveAlert() {
        return activeAlert;
    }

    /**
     * Define o valor da propriedade activeAlert.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BusinessUnitActiveAlertSettings }{@code >}
     *     
     */
    public void setActiveAlert(JAXBElement<BusinessUnitActiveAlertSettings> value) {
        this.activeAlert = value;
    }

    /**
     * Obtém o valor da propriedade algoPerformanceStopLimit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAlgoPerformanceStopLimit() {
        return algoPerformanceStopLimit;
    }

    /**
     * Define o valor da propriedade algoPerformanceStopLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAlgoPerformanceStopLimit(JAXBElement<Integer> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategory1Alias() {
        return category1Alias;
    }

    /**
     * Define o valor da propriedade category1Alias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategory1Alias(JAXBElement<String> value) {
        this.category1Alias = value;
    }

    /**
     * Obtém o valor da propriedade category2Alias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategory2Alias() {
        return category2Alias;
    }

    /**
     * Define o valor da propriedade category2Alias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategory2Alias(JAXBElement<String> value) {
        this.category2Alias = value;
    }

    /**
     * Obtém o valor da propriedade category3Alias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategory3Alias() {
        return category3Alias;
    }

    /**
     * Define o valor da propriedade category3Alias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategory3Alias(JAXBElement<String> value) {
        this.category3Alias = value;
    }

    /**
     * Obtém o valor da propriedade dataFeedSettings.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BusinessUnitExternalDataFeedSettings }{@code >}
     *     
     */
    public JAXBElement<BusinessUnitExternalDataFeedSettings> getDataFeedSettings() {
        return dataFeedSettings;
    }

    /**
     * Define o valor da propriedade dataFeedSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BusinessUnitExternalDataFeedSettings }{@code >}
     *     
     */
    public void setDataFeedSettings(JAXBElement<BusinessUnitExternalDataFeedSettings> value) {
        this.dataFeedSettings = value;
    }

    /**
     * Obtém o valor da propriedade defaults.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BusinessUnitDefaultSettings }{@code >}
     *     
     */
    public JAXBElement<BusinessUnitDefaultSettings> getDefaults() {
        return defaults;
    }

    /**
     * Define o valor da propriedade defaults.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BusinessUnitDefaultSettings }{@code >}
     *     
     */
    public void setDefaults(JAXBElement<BusinessUnitDefaultSettings> value) {
        this.defaults = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfHarshDrivingThreshold }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHarshDrivingThreshold> getHarshDrivingThresholds() {
        return harshDrivingThresholds;
    }

    /**
     * Define o valor da propriedade harshDrivingThresholds.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHarshDrivingThreshold }{@code >}
     *     
     */
    public void setHarshDrivingThresholds(JAXBElement<ArrayOfHarshDrivingThreshold> value) {
        this.harshDrivingThresholds = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link MeasurementOptions }{@code >}
     *     
     */
    public JAXBElement<MeasurementOptions> getMeasurementOptions() {
        return measurementOptions;
    }

    /**
     * Define o valor da propriedade measurementOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeasurementOptions }{@code >}
     *     
     */
    public void setMeasurementOptions(JAXBElement<MeasurementOptions> value) {
        this.measurementOptions = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsOne.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BusinessUnitOmnitracsOneSettings }{@code >}
     *     
     */
    public JAXBElement<BusinessUnitOmnitracsOneSettings> getOmnitracsOne() {
        return omnitracsOne;
    }

    /**
     * Define o valor da propriedade omnitracsOne.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BusinessUnitOmnitracsOneSettings }{@code >}
     *     
     */
    public void setOmnitracsOne(JAXBElement<BusinessUnitOmnitracsOneSettings> value) {
        this.omnitracsOne = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesFieldEquivalencyDestinationSize.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantitiesFieldEquivalencyDestinationSize() {
        return quantitiesFieldEquivalencyDestinationSize;
    }

    /**
     * Define o valor da propriedade quantitiesFieldEquivalencyDestinationSize.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantitiesFieldEquivalencyDestinationSize(JAXBElement<String> value) {
        this.quantitiesFieldEquivalencyDestinationSize = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesFieldEquivalencySourceSize.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantitiesFieldEquivalencySourceSize() {
        return quantitiesFieldEquivalencySourceSize;
    }

    /**
     * Define o valor da propriedade quantitiesFieldEquivalencySourceSize.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantitiesFieldEquivalencySourceSize(JAXBElement<String> value) {
        this.quantitiesFieldEquivalencySourceSize = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesFieldUnitOfBulkService.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantitiesFieldUnitOfBulkService() {
        return quantitiesFieldUnitOfBulkService;
    }

    /**
     * Define o valor da propriedade quantitiesFieldUnitOfBulkService.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantitiesFieldUnitOfBulkService(JAXBElement<String> value) {
        this.quantitiesFieldUnitOfBulkService = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesFieldUnitOfCost.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantitiesFieldUnitOfCost() {
        return quantitiesFieldUnitOfCost;
    }

    /**
     * Define o valor da propriedade quantitiesFieldUnitOfCost.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantitiesFieldUnitOfCost(JAXBElement<String> value) {
        this.quantitiesFieldUnitOfCost = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesFieldUnitOfService.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantitiesFieldUnitOfService() {
        return quantitiesFieldUnitOfService;
    }

    /**
     * Define o valor da propriedade quantitiesFieldUnitOfService.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantitiesFieldUnitOfService(JAXBElement<String> value) {
        this.quantitiesFieldUnitOfService = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesFieldUnitOfWorkerActuals.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantitiesFieldUnitOfWorkerActuals() {
        return quantitiesFieldUnitOfWorkerActuals;
    }

    /**
     * Define o valor da propriedade quantitiesFieldUnitOfWorkerActuals.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantitiesFieldUnitOfWorkerActuals(JAXBElement<String> value) {
        this.quantitiesFieldUnitOfWorkerActuals = value;
    }

    /**
     * Obtém o valor da propriedade quantityPrecision.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityPrecision() {
        return quantityPrecision;
    }

    /**
     * Define o valor da propriedade quantityPrecision.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityPrecision(Integer value) {
        this.quantityPrecision = value;
    }

    /**
     * Obtém o valor da propriedade size1Alias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSize1Alias() {
        return size1Alias;
    }

    /**
     * Define o valor da propriedade size1Alias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSize1Alias(JAXBElement<String> value) {
        this.size1Alias = value;
    }

    /**
     * Obtém o valor da propriedade size2Alias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSize2Alias() {
        return size2Alias;
    }

    /**
     * Define o valor da propriedade size2Alias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSize2Alias(JAXBElement<String> value) {
        this.size2Alias = value;
    }

    /**
     * Obtém o valor da propriedade size3Alias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSize3Alias() {
        return size3Alias;
    }

    /**
     * Define o valor da propriedade size3Alias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSize3Alias(JAXBElement<String> value) {
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
