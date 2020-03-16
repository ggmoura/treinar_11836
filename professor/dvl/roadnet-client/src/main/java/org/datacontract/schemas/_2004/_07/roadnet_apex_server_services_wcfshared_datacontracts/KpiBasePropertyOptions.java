
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de KpiBasePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="KpiBasePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseKpi_KpiGroupByType_GroupByType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseSecondaryDimensionType_GroupBySecondaryDimension" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DimensionFilters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EndDateTimeFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GroupBySecondaryDimensionAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Groupings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsShared" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="KpiFolder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="KpiFolderEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="KpiFolderOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}KpiFolderPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="KpiSettings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfTimeUnitsToFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OperationsUnitDimensionFilterEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OperationsUnitDimensionsFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OperationsUnitGranularity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OwnerEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OwnerName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RulesSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryGroupByTimeUnitSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Settings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShareableEntityAccessPermission_Permission" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SortingOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartDateTimeFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StringifiedFilters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeUnit_GroupByTimeUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeUnit_SecondaryGroupByTimeUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeUnit_TimeUnitFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KpiBasePropertyOptions", propOrder = {
    "dataWarehouseKpiKpiGroupByTypeGroupByType",
    "dataWarehouseSecondaryDimensionTypeGroupBySecondaryDimension",
    "dimensionFilters",
    "endDateTimeFilter",
    "groupBySecondaryDimensionAttribute",
    "groupings",
    "isOwner",
    "isShared",
    "kpiFolder",
    "kpiFolderEntityKey",
    "kpiFolderOptions",
    "kpiSettings",
    "name",
    "numberOfTimeUnitsToFilter",
    "operationsUnitDimensionFilterEntityKey",
    "operationsUnitDimensionsFilter",
    "operationsUnitGranularity",
    "ownerEntityKey",
    "ownerName",
    "rulesSet",
    "secondaryGroupByTimeUnitSpecified",
    "settings",
    "shareableEntityAccessPermissionPermission",
    "sortingOptions",
    "startDateTimeFilter",
    "stringifiedFilters",
    "timeUnitGroupByTimeUnit",
    "timeUnitSecondaryGroupByTimeUnit",
    "timeUnitTimeUnitFilter",
    "user"
})
@XmlSeeAlso({
    ScorecardKpiPropertyOptions.class,
    KpiPropertyOptions.class
})
public class KpiBasePropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "DataWarehouseKpi_KpiGroupByType_GroupByType")
    protected Boolean dataWarehouseKpiKpiGroupByTypeGroupByType;
    @XmlElement(name = "DataWarehouseSecondaryDimensionType_GroupBySecondaryDimension")
    protected Boolean dataWarehouseSecondaryDimensionTypeGroupBySecondaryDimension;
    @XmlElement(name = "DimensionFilters")
    protected Boolean dimensionFilters;
    @XmlElement(name = "EndDateTimeFilter")
    protected Boolean endDateTimeFilter;
    @XmlElement(name = "GroupBySecondaryDimensionAttribute")
    protected Boolean groupBySecondaryDimensionAttribute;
    @XmlElement(name = "Groupings")
    protected Boolean groupings;
    @XmlElement(name = "IsOwner")
    protected Boolean isOwner;
    @XmlElement(name = "IsShared")
    protected Boolean isShared;
    @XmlElement(name = "KpiFolder")
    protected Boolean kpiFolder;
    @XmlElement(name = "KpiFolderEntityKey")
    protected Boolean kpiFolderEntityKey;
    @XmlElementRef(name = "KpiFolderOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<KpiFolderPropertyOptions> kpiFolderOptions;
    @XmlElement(name = "KpiSettings")
    protected Boolean kpiSettings;
    @XmlElement(name = "Name")
    protected Boolean name;
    @XmlElement(name = "NumberOfTimeUnitsToFilter")
    protected Boolean numberOfTimeUnitsToFilter;
    @XmlElement(name = "OperationsUnitDimensionFilterEntityKey")
    protected Boolean operationsUnitDimensionFilterEntityKey;
    @XmlElement(name = "OperationsUnitDimensionsFilter")
    protected Boolean operationsUnitDimensionsFilter;
    @XmlElement(name = "OperationsUnitGranularity")
    protected Boolean operationsUnitGranularity;
    @XmlElement(name = "OwnerEntityKey")
    protected Boolean ownerEntityKey;
    @XmlElement(name = "OwnerName")
    protected Boolean ownerName;
    @XmlElement(name = "RulesSet")
    protected Boolean rulesSet;
    @XmlElement(name = "SecondaryGroupByTimeUnitSpecified")
    protected Boolean secondaryGroupByTimeUnitSpecified;
    @XmlElement(name = "Settings")
    protected Boolean settings;
    @XmlElement(name = "ShareableEntityAccessPermission_Permission")
    protected Boolean shareableEntityAccessPermissionPermission;
    @XmlElement(name = "SortingOptions")
    protected Boolean sortingOptions;
    @XmlElement(name = "StartDateTimeFilter")
    protected Boolean startDateTimeFilter;
    @XmlElement(name = "StringifiedFilters")
    protected Boolean stringifiedFilters;
    @XmlElement(name = "TimeUnit_GroupByTimeUnit")
    protected Boolean timeUnitGroupByTimeUnit;
    @XmlElement(name = "TimeUnit_SecondaryGroupByTimeUnit")
    protected Boolean timeUnitSecondaryGroupByTimeUnit;
    @XmlElement(name = "TimeUnit_TimeUnitFilter")
    protected Boolean timeUnitTimeUnitFilter;
    @XmlElement(name = "User")
    protected Boolean user;

    /**
     * Obtém o valor da propriedade dataWarehouseKpiKpiGroupByTypeGroupByType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseKpiKpiGroupByTypeGroupByType() {
        return dataWarehouseKpiKpiGroupByTypeGroupByType;
    }

    /**
     * Define o valor da propriedade dataWarehouseKpiKpiGroupByTypeGroupByType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseKpiKpiGroupByTypeGroupByType(Boolean value) {
        this.dataWarehouseKpiKpiGroupByTypeGroupByType = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseSecondaryDimensionTypeGroupBySecondaryDimension.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseSecondaryDimensionTypeGroupBySecondaryDimension() {
        return dataWarehouseSecondaryDimensionTypeGroupBySecondaryDimension;
    }

    /**
     * Define o valor da propriedade dataWarehouseSecondaryDimensionTypeGroupBySecondaryDimension.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseSecondaryDimensionTypeGroupBySecondaryDimension(Boolean value) {
        this.dataWarehouseSecondaryDimensionTypeGroupBySecondaryDimension = value;
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
     * Obtém o valor da propriedade endDateTimeFilter.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndDateTimeFilter() {
        return endDateTimeFilter;
    }

    /**
     * Define o valor da propriedade endDateTimeFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndDateTimeFilter(Boolean value) {
        this.endDateTimeFilter = value;
    }

    /**
     * Obtém o valor da propriedade groupBySecondaryDimensionAttribute.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupBySecondaryDimensionAttribute() {
        return groupBySecondaryDimensionAttribute;
    }

    /**
     * Define o valor da propriedade groupBySecondaryDimensionAttribute.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupBySecondaryDimensionAttribute(Boolean value) {
        this.groupBySecondaryDimensionAttribute = value;
    }

    /**
     * Obtém o valor da propriedade groupings.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupings() {
        return groupings;
    }

    /**
     * Define o valor da propriedade groupings.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupings(Boolean value) {
        this.groupings = value;
    }

    /**
     * Obtém o valor da propriedade isOwner.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOwner() {
        return isOwner;
    }

    /**
     * Define o valor da propriedade isOwner.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOwner(Boolean value) {
        this.isOwner = value;
    }

    /**
     * Obtém o valor da propriedade isShared.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShared() {
        return isShared;
    }

    /**
     * Define o valor da propriedade isShared.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShared(Boolean value) {
        this.isShared = value;
    }

    /**
     * Obtém o valor da propriedade kpiFolder.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKpiFolder() {
        return kpiFolder;
    }

    /**
     * Define o valor da propriedade kpiFolder.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKpiFolder(Boolean value) {
        this.kpiFolder = value;
    }

    /**
     * Obtém o valor da propriedade kpiFolderEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKpiFolderEntityKey() {
        return kpiFolderEntityKey;
    }

    /**
     * Define o valor da propriedade kpiFolderEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKpiFolderEntityKey(Boolean value) {
        this.kpiFolderEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade kpiFolderOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KpiFolderPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<KpiFolderPropertyOptions> getKpiFolderOptions() {
        return kpiFolderOptions;
    }

    /**
     * Define o valor da propriedade kpiFolderOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KpiFolderPropertyOptions }{@code >}
     *     
     */
    public void setKpiFolderOptions(JAXBElement<KpiFolderPropertyOptions> value) {
        this.kpiFolderOptions = value;
    }

    /**
     * Obtém o valor da propriedade kpiSettings.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKpiSettings() {
        return kpiSettings;
    }

    /**
     * Define o valor da propriedade kpiSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKpiSettings(Boolean value) {
        this.kpiSettings = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setName(Boolean value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade numberOfTimeUnitsToFilter.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfTimeUnitsToFilter() {
        return numberOfTimeUnitsToFilter;
    }

    /**
     * Define o valor da propriedade numberOfTimeUnitsToFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfTimeUnitsToFilter(Boolean value) {
        this.numberOfTimeUnitsToFilter = value;
    }

    /**
     * Obtém o valor da propriedade operationsUnitDimensionFilterEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOperationsUnitDimensionFilterEntityKey() {
        return operationsUnitDimensionFilterEntityKey;
    }

    /**
     * Define o valor da propriedade operationsUnitDimensionFilterEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOperationsUnitDimensionFilterEntityKey(Boolean value) {
        this.operationsUnitDimensionFilterEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade operationsUnitDimensionsFilter.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOperationsUnitDimensionsFilter() {
        return operationsUnitDimensionsFilter;
    }

    /**
     * Define o valor da propriedade operationsUnitDimensionsFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOperationsUnitDimensionsFilter(Boolean value) {
        this.operationsUnitDimensionsFilter = value;
    }

    /**
     * Obtém o valor da propriedade operationsUnitGranularity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOperationsUnitGranularity() {
        return operationsUnitGranularity;
    }

    /**
     * Define o valor da propriedade operationsUnitGranularity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOperationsUnitGranularity(Boolean value) {
        this.operationsUnitGranularity = value;
    }

    /**
     * Obtém o valor da propriedade ownerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOwnerEntityKey() {
        return ownerEntityKey;
    }

    /**
     * Define o valor da propriedade ownerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwnerEntityKey(Boolean value) {
        this.ownerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade ownerName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOwnerName() {
        return ownerName;
    }

    /**
     * Define o valor da propriedade ownerName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwnerName(Boolean value) {
        this.ownerName = value;
    }

    /**
     * Obtém o valor da propriedade rulesSet.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRulesSet() {
        return rulesSet;
    }

    /**
     * Define o valor da propriedade rulesSet.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRulesSet(Boolean value) {
        this.rulesSet = value;
    }

    /**
     * Obtém o valor da propriedade secondaryGroupByTimeUnitSpecified.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecondaryGroupByTimeUnitSpecified() {
        return secondaryGroupByTimeUnitSpecified;
    }

    /**
     * Define o valor da propriedade secondaryGroupByTimeUnitSpecified.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecondaryGroupByTimeUnitSpecified(Boolean value) {
        this.secondaryGroupByTimeUnitSpecified = value;
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
     * Obtém o valor da propriedade shareableEntityAccessPermissionPermission.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShareableEntityAccessPermissionPermission() {
        return shareableEntityAccessPermissionPermission;
    }

    /**
     * Define o valor da propriedade shareableEntityAccessPermissionPermission.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShareableEntityAccessPermissionPermission(Boolean value) {
        this.shareableEntityAccessPermissionPermission = value;
    }

    /**
     * Obtém o valor da propriedade sortingOptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSortingOptions() {
        return sortingOptions;
    }

    /**
     * Define o valor da propriedade sortingOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSortingOptions(Boolean value) {
        this.sortingOptions = value;
    }

    /**
     * Obtém o valor da propriedade startDateTimeFilter.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartDateTimeFilter() {
        return startDateTimeFilter;
    }

    /**
     * Define o valor da propriedade startDateTimeFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartDateTimeFilter(Boolean value) {
        this.startDateTimeFilter = value;
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

    /**
     * Obtém o valor da propriedade timeUnitGroupByTimeUnit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeUnitGroupByTimeUnit() {
        return timeUnitGroupByTimeUnit;
    }

    /**
     * Define o valor da propriedade timeUnitGroupByTimeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeUnitGroupByTimeUnit(Boolean value) {
        this.timeUnitGroupByTimeUnit = value;
    }

    /**
     * Obtém o valor da propriedade timeUnitSecondaryGroupByTimeUnit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeUnitSecondaryGroupByTimeUnit() {
        return timeUnitSecondaryGroupByTimeUnit;
    }

    /**
     * Define o valor da propriedade timeUnitSecondaryGroupByTimeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeUnitSecondaryGroupByTimeUnit(Boolean value) {
        this.timeUnitSecondaryGroupByTimeUnit = value;
    }

    /**
     * Obtém o valor da propriedade timeUnitTimeUnitFilter.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeUnitTimeUnitFilter() {
        return timeUnitTimeUnitFilter;
    }

    /**
     * Define o valor da propriedade timeUnitTimeUnitFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeUnitTimeUnitFilter(Boolean value) {
        this.timeUnitTimeUnitFilter = value;
    }

    /**
     * Obtém o valor da propriedade user.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUser() {
        return user;
    }

    /**
     * Define o valor da propriedade user.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUser(Boolean value) {
        this.user = value;
    }

}
