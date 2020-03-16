
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.AggregateRootEntity;
import com.roadnet.apex.datacontracts.PersonName;


/**
 * <p>Classe Java de DataWarehouseKpiBase complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseKpiBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseKpi_KpiGroupByType_GroupByType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseSecondaryDimensionType_GroupBySecondaryDimension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DimensionFilters" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}ArrayOfDimensionFilter" minOccurs="0"/&gt;
 *         &lt;element name="EndDateTimeFilter" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="GroupBySecondaryDimensionAttribute" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DimensionDescriber" minOccurs="0"/&gt;
 *         &lt;element name="Groupings" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}ArrayOfDimensionDescriber" minOccurs="0"/&gt;
 *         &lt;element name="IsOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsShared" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="KpiFolder" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseKpiFolder" minOccurs="0"/&gt;
 *         &lt;element name="KpiFolderEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="KpiSettings" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseKpiSettings" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfTimeUnitsToFilter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OperationsUnitDimensionFilterEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OperationsUnitDimensionsFilter" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseKpiOperationsUnitDimensionsFilter" minOccurs="0"/&gt;
 *         &lt;element name="OperationsUnitGranularity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OwnerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OwnerName" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="RulesSet" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseKpiRulesSet" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryGroupByTimeUnitSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Settings" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ShareableEntityAccessPermission_Permission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SortingOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseKpiSortingOptions" minOccurs="0"/&gt;
 *         &lt;element name="StartDateTimeFilter" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="StringifiedFilters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeUnit_GroupByTimeUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeUnit_SecondaryGroupByTimeUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeUnit_TimeUnitFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseKpiBase", propOrder = {
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
    "timeUnitTimeUnitFilter"
})
@XmlSeeAlso({
    DataWarehouseScorecardKpi.class,
    DataWarehouseKpi.class
})
public class DataWarehouseKpiBase
    extends AggregateRootEntity
{

    @XmlElementRef(name = "DataWarehouseKpi_KpiGroupByType_GroupByType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseKpiKpiGroupByTypeGroupByType;
    @XmlElementRef(name = "DataWarehouseSecondaryDimensionType_GroupBySecondaryDimension", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseSecondaryDimensionTypeGroupBySecondaryDimension;
    @XmlElementRef(name = "DimensionFilters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDimensionFilter> dimensionFilters;
    @XmlElementRef(name = "EndDateTimeFilter", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endDateTimeFilter;
    @XmlElementRef(name = "GroupBySecondaryDimensionAttribute", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<DimensionDescriber> groupBySecondaryDimensionAttribute;
    @XmlElementRef(name = "Groupings", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDimensionDescriber> groupings;
    @XmlElement(name = "IsOwner")
    protected Boolean isOwner;
    @XmlElement(name = "IsShared")
    protected Boolean isShared;
    @XmlElementRef(name = "KpiFolder", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<DataWarehouseKpiFolder> kpiFolder;
    @XmlElement(name = "KpiFolderEntityKey")
    protected Long kpiFolderEntityKey;
    @XmlElementRef(name = "KpiSettings", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<DataWarehouseKpiSettings> kpiSettings;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "NumberOfTimeUnitsToFilter")
    protected Integer numberOfTimeUnitsToFilter;
    @XmlElementRef(name = "OperationsUnitDimensionFilterEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> operationsUnitDimensionFilterEntityKey;
    @XmlElementRef(name = "OperationsUnitDimensionsFilter", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<DataWarehouseKpiOperationsUnitDimensionsFilter> operationsUnitDimensionsFilter;
    @XmlElement(name = "OperationsUnitGranularity")
    protected Integer operationsUnitGranularity;
    @XmlElement(name = "OwnerEntityKey")
    protected Long ownerEntityKey;
    @XmlElementRef(name = "OwnerName", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> ownerName;
    @XmlElementRef(name = "RulesSet", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<DataWarehouseKpiRulesSet> rulesSet;
    @XmlElement(name = "SecondaryGroupByTimeUnitSpecified")
    protected Boolean secondaryGroupByTimeUnitSpecified;
    @XmlElementRef(name = "Settings", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> settings;
    @XmlElementRef(name = "ShareableEntityAccessPermission_Permission", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shareableEntityAccessPermissionPermission;
    @XmlElementRef(name = "SortingOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<DataWarehouseKpiSortingOptions> sortingOptions;
    @XmlElementRef(name = "StartDateTimeFilter", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startDateTimeFilter;
    @XmlElementRef(name = "StringifiedFilters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stringifiedFilters;
    @XmlElementRef(name = "TimeUnit_GroupByTimeUnit", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeUnitGroupByTimeUnit;
    @XmlElementRef(name = "TimeUnit_SecondaryGroupByTimeUnit", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeUnitSecondaryGroupByTimeUnit;
    @XmlElementRef(name = "TimeUnit_TimeUnitFilter", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeUnitTimeUnitFilter;

    /**
     * Obtém o valor da propriedade dataWarehouseKpiKpiGroupByTypeGroupByType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseKpiKpiGroupByTypeGroupByType() {
        return dataWarehouseKpiKpiGroupByTypeGroupByType;
    }

    /**
     * Define o valor da propriedade dataWarehouseKpiKpiGroupByTypeGroupByType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseKpiKpiGroupByTypeGroupByType(JAXBElement<String> value) {
        this.dataWarehouseKpiKpiGroupByTypeGroupByType = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseSecondaryDimensionTypeGroupBySecondaryDimension.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseSecondaryDimensionTypeGroupBySecondaryDimension() {
        return dataWarehouseSecondaryDimensionTypeGroupBySecondaryDimension;
    }

    /**
     * Define o valor da propriedade dataWarehouseSecondaryDimensionTypeGroupBySecondaryDimension.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseSecondaryDimensionTypeGroupBySecondaryDimension(JAXBElement<String> value) {
        this.dataWarehouseSecondaryDimensionTypeGroupBySecondaryDimension = value;
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
     * Obtém o valor da propriedade endDateTimeFilter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDateTimeFilter() {
        return endDateTimeFilter;
    }

    /**
     * Define o valor da propriedade endDateTimeFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDateTimeFilter(JAXBElement<XMLGregorianCalendar> value) {
        this.endDateTimeFilter = value;
    }

    /**
     * Obtém o valor da propriedade groupBySecondaryDimensionAttribute.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DimensionDescriber }{@code >}
     *     
     */
    public JAXBElement<DimensionDescriber> getGroupBySecondaryDimensionAttribute() {
        return groupBySecondaryDimensionAttribute;
    }

    /**
     * Define o valor da propriedade groupBySecondaryDimensionAttribute.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DimensionDescriber }{@code >}
     *     
     */
    public void setGroupBySecondaryDimensionAttribute(JAXBElement<DimensionDescriber> value) {
        this.groupBySecondaryDimensionAttribute = value;
    }

    /**
     * Obtém o valor da propriedade groupings.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDimensionDescriber }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDimensionDescriber> getGroupings() {
        return groupings;
    }

    /**
     * Define o valor da propriedade groupings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDimensionDescriber }{@code >}
     *     
     */
    public void setGroupings(JAXBElement<ArrayOfDimensionDescriber> value) {
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
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiFolder }{@code >}
     *     
     */
    public JAXBElement<DataWarehouseKpiFolder> getKpiFolder() {
        return kpiFolder;
    }

    /**
     * Define o valor da propriedade kpiFolder.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiFolder }{@code >}
     *     
     */
    public void setKpiFolder(JAXBElement<DataWarehouseKpiFolder> value) {
        this.kpiFolder = value;
    }

    /**
     * Obtém o valor da propriedade kpiFolderEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKpiFolderEntityKey() {
        return kpiFolderEntityKey;
    }

    /**
     * Define o valor da propriedade kpiFolderEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKpiFolderEntityKey(Long value) {
        this.kpiFolderEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade kpiSettings.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiSettings }{@code >}
     *     
     */
    public JAXBElement<DataWarehouseKpiSettings> getKpiSettings() {
        return kpiSettings;
    }

    /**
     * Define o valor da propriedade kpiSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiSettings }{@code >}
     *     
     */
    public void setKpiSettings(JAXBElement<DataWarehouseKpiSettings> value) {
        this.kpiSettings = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade numberOfTimeUnitsToFilter.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfTimeUnitsToFilter() {
        return numberOfTimeUnitsToFilter;
    }

    /**
     * Define o valor da propriedade numberOfTimeUnitsToFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfTimeUnitsToFilter(Integer value) {
        this.numberOfTimeUnitsToFilter = value;
    }

    /**
     * Obtém o valor da propriedade operationsUnitDimensionFilterEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOperationsUnitDimensionFilterEntityKey() {
        return operationsUnitDimensionFilterEntityKey;
    }

    /**
     * Define o valor da propriedade operationsUnitDimensionFilterEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOperationsUnitDimensionFilterEntityKey(JAXBElement<Long> value) {
        this.operationsUnitDimensionFilterEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade operationsUnitDimensionsFilter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiOperationsUnitDimensionsFilter }{@code >}
     *     
     */
    public JAXBElement<DataWarehouseKpiOperationsUnitDimensionsFilter> getOperationsUnitDimensionsFilter() {
        return operationsUnitDimensionsFilter;
    }

    /**
     * Define o valor da propriedade operationsUnitDimensionsFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiOperationsUnitDimensionsFilter }{@code >}
     *     
     */
    public void setOperationsUnitDimensionsFilter(JAXBElement<DataWarehouseKpiOperationsUnitDimensionsFilter> value) {
        this.operationsUnitDimensionsFilter = value;
    }

    /**
     * Obtém o valor da propriedade operationsUnitGranularity.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperationsUnitGranularity() {
        return operationsUnitGranularity;
    }

    /**
     * Define o valor da propriedade operationsUnitGranularity.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperationsUnitGranularity(Integer value) {
        this.operationsUnitGranularity = value;
    }

    /**
     * Obtém o valor da propriedade ownerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOwnerEntityKey() {
        return ownerEntityKey;
    }

    /**
     * Define o valor da propriedade ownerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOwnerEntityKey(Long value) {
        this.ownerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade ownerName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getOwnerName() {
        return ownerName;
    }

    /**
     * Define o valor da propriedade ownerName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setOwnerName(JAXBElement<PersonName> value) {
        this.ownerName = value;
    }

    /**
     * Obtém o valor da propriedade rulesSet.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiRulesSet }{@code >}
     *     
     */
    public JAXBElement<DataWarehouseKpiRulesSet> getRulesSet() {
        return rulesSet;
    }

    /**
     * Define o valor da propriedade rulesSet.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiRulesSet }{@code >}
     *     
     */
    public void setRulesSet(JAXBElement<DataWarehouseKpiRulesSet> value) {
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
     * Obtém o valor da propriedade shareableEntityAccessPermissionPermission.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShareableEntityAccessPermissionPermission() {
        return shareableEntityAccessPermissionPermission;
    }

    /**
     * Define o valor da propriedade shareableEntityAccessPermissionPermission.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShareableEntityAccessPermissionPermission(JAXBElement<String> value) {
        this.shareableEntityAccessPermissionPermission = value;
    }

    /**
     * Obtém o valor da propriedade sortingOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiSortingOptions }{@code >}
     *     
     */
    public JAXBElement<DataWarehouseKpiSortingOptions> getSortingOptions() {
        return sortingOptions;
    }

    /**
     * Define o valor da propriedade sortingOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiSortingOptions }{@code >}
     *     
     */
    public void setSortingOptions(JAXBElement<DataWarehouseKpiSortingOptions> value) {
        this.sortingOptions = value;
    }

    /**
     * Obtém o valor da propriedade startDateTimeFilter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDateTimeFilter() {
        return startDateTimeFilter;
    }

    /**
     * Define o valor da propriedade startDateTimeFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDateTimeFilter(JAXBElement<XMLGregorianCalendar> value) {
        this.startDateTimeFilter = value;
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

    /**
     * Obtém o valor da propriedade timeUnitGroupByTimeUnit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeUnitGroupByTimeUnit() {
        return timeUnitGroupByTimeUnit;
    }

    /**
     * Define o valor da propriedade timeUnitGroupByTimeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeUnitGroupByTimeUnit(JAXBElement<String> value) {
        this.timeUnitGroupByTimeUnit = value;
    }

    /**
     * Obtém o valor da propriedade timeUnitSecondaryGroupByTimeUnit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeUnitSecondaryGroupByTimeUnit() {
        return timeUnitSecondaryGroupByTimeUnit;
    }

    /**
     * Define o valor da propriedade timeUnitSecondaryGroupByTimeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeUnitSecondaryGroupByTimeUnit(JAXBElement<String> value) {
        this.timeUnitSecondaryGroupByTimeUnit = value;
    }

    /**
     * Obtém o valor da propriedade timeUnitTimeUnitFilter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeUnitTimeUnitFilter() {
        return timeUnitTimeUnitFilter;
    }

    /**
     * Define o valor da propriedade timeUnitTimeUnitFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeUnitTimeUnitFilter(JAXBElement<String> value) {
        this.timeUnitTimeUnitFilter = value;
    }

}
