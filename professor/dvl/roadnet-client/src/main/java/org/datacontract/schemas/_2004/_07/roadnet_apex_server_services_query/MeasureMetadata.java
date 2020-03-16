
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.ArrayOfDataWarehouseSecondaryDimensionType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseAtomicMeasureType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseTransactionType;


/**
 * <p>Classe Java de MeasureMetadata complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MeasureMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseMeasureUsageOptions_Options" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HasActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasOptimal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasPlanned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsConfidential" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDemoOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDispatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsNavigation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsPerformanceData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsPermitted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRouting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTelematics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Measure" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseAtomicMeasureType" minOccurs="0"/&gt;
 *         &lt;element name="MeasureTypeMetadata" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}MeasureTypeMetadata" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryDimensions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}ArrayOfDataWarehouseSecondaryDimensionType" minOccurs="0"/&gt;
 *         &lt;element name="TransactionType" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseTransactionType" minOccurs="0"/&gt;
 *         &lt;element name="UnitType" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}MeasureUnitType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureMetadata", propOrder = {
    "dataWarehouseMeasureUsageOptionsOptions",
    "hasActual",
    "hasOptimal",
    "hasPlanned",
    "isConfidential",
    "isDemoOnly",
    "isDispatch",
    "isNavigation",
    "isPerformanceData",
    "isPermitted",
    "isRouting",
    "isTelematics",
    "measure",
    "measureTypeMetadata",
    "secondaryDimensions",
    "transactionType",
    "unitType"
})
public class MeasureMetadata {

    @XmlElementRef(name = "DataWarehouseMeasureUsageOptions_Options", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseMeasureUsageOptionsOptions;
    @XmlElement(name = "HasActual")
    protected Boolean hasActual;
    @XmlElement(name = "HasOptimal")
    protected Boolean hasOptimal;
    @XmlElement(name = "HasPlanned")
    protected Boolean hasPlanned;
    @XmlElement(name = "IsConfidential")
    protected Boolean isConfidential;
    @XmlElement(name = "IsDemoOnly")
    protected Boolean isDemoOnly;
    @XmlElement(name = "IsDispatch")
    protected Boolean isDispatch;
    @XmlElement(name = "IsNavigation")
    protected Boolean isNavigation;
    @XmlElement(name = "IsPerformanceData")
    protected Boolean isPerformanceData;
    @XmlElement(name = "IsPermitted")
    protected Boolean isPermitted;
    @XmlElement(name = "IsRouting")
    protected Boolean isRouting;
    @XmlElement(name = "IsTelematics")
    protected Boolean isTelematics;
    @XmlElement(name = "Measure")
    @XmlSchemaType(name = "string")
    protected DataWarehouseAtomicMeasureType measure;
    @XmlElementRef(name = "MeasureTypeMetadata", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<MeasureTypeMetadata> measureTypeMetadata;
    @XmlElementRef(name = "SecondaryDimensions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDataWarehouseSecondaryDimensionType> secondaryDimensions;
    @XmlElement(name = "TransactionType")
    @XmlSchemaType(name = "string")
    protected DataWarehouseTransactionType transactionType;
    @XmlElement(name = "UnitType")
    @XmlSchemaType(name = "string")
    protected MeasureUnitType unitType;

    /**
     * Obtém o valor da propriedade dataWarehouseMeasureUsageOptionsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseMeasureUsageOptionsOptions() {
        return dataWarehouseMeasureUsageOptionsOptions;
    }

    /**
     * Define o valor da propriedade dataWarehouseMeasureUsageOptionsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseMeasureUsageOptionsOptions(JAXBElement<String> value) {
        this.dataWarehouseMeasureUsageOptionsOptions = value;
    }

    /**
     * Obtém o valor da propriedade hasActual.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasActual() {
        return hasActual;
    }

    /**
     * Define o valor da propriedade hasActual.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasActual(Boolean value) {
        this.hasActual = value;
    }

    /**
     * Obtém o valor da propriedade hasOptimal.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasOptimal() {
        return hasOptimal;
    }

    /**
     * Define o valor da propriedade hasOptimal.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasOptimal(Boolean value) {
        this.hasOptimal = value;
    }

    /**
     * Obtém o valor da propriedade hasPlanned.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPlanned() {
        return hasPlanned;
    }

    /**
     * Define o valor da propriedade hasPlanned.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPlanned(Boolean value) {
        this.hasPlanned = value;
    }

    /**
     * Obtém o valor da propriedade isConfidential.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConfidential() {
        return isConfidential;
    }

    /**
     * Define o valor da propriedade isConfidential.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConfidential(Boolean value) {
        this.isConfidential = value;
    }

    /**
     * Obtém o valor da propriedade isDemoOnly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDemoOnly() {
        return isDemoOnly;
    }

    /**
     * Define o valor da propriedade isDemoOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDemoOnly(Boolean value) {
        this.isDemoOnly = value;
    }

    /**
     * Obtém o valor da propriedade isDispatch.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDispatch() {
        return isDispatch;
    }

    /**
     * Define o valor da propriedade isDispatch.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDispatch(Boolean value) {
        this.isDispatch = value;
    }

    /**
     * Obtém o valor da propriedade isNavigation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNavigation() {
        return isNavigation;
    }

    /**
     * Define o valor da propriedade isNavigation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNavigation(Boolean value) {
        this.isNavigation = value;
    }

    /**
     * Obtém o valor da propriedade isPerformanceData.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPerformanceData() {
        return isPerformanceData;
    }

    /**
     * Define o valor da propriedade isPerformanceData.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPerformanceData(Boolean value) {
        this.isPerformanceData = value;
    }

    /**
     * Obtém o valor da propriedade isPermitted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPermitted() {
        return isPermitted;
    }

    /**
     * Define o valor da propriedade isPermitted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPermitted(Boolean value) {
        this.isPermitted = value;
    }

    /**
     * Obtém o valor da propriedade isRouting.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRouting() {
        return isRouting;
    }

    /**
     * Define o valor da propriedade isRouting.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRouting(Boolean value) {
        this.isRouting = value;
    }

    /**
     * Obtém o valor da propriedade isTelematics.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTelematics() {
        return isTelematics;
    }

    /**
     * Define o valor da propriedade isTelematics.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTelematics(Boolean value) {
        this.isTelematics = value;
    }

    /**
     * Obtém o valor da propriedade measure.
     * 
     * @return
     *     possible object is
     *     {@link DataWarehouseAtomicMeasureType }
     *     
     */
    public DataWarehouseAtomicMeasureType getMeasure() {
        return measure;
    }

    /**
     * Define o valor da propriedade measure.
     * 
     * @param value
     *     allowed object is
     *     {@link DataWarehouseAtomicMeasureType }
     *     
     */
    public void setMeasure(DataWarehouseAtomicMeasureType value) {
        this.measure = value;
    }

    /**
     * Obtém o valor da propriedade measureTypeMetadata.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeasureTypeMetadata }{@code >}
     *     
     */
    public JAXBElement<MeasureTypeMetadata> getMeasureTypeMetadata() {
        return measureTypeMetadata;
    }

    /**
     * Define o valor da propriedade measureTypeMetadata.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeasureTypeMetadata }{@code >}
     *     
     */
    public void setMeasureTypeMetadata(JAXBElement<MeasureTypeMetadata> value) {
        this.measureTypeMetadata = value;
    }

    /**
     * Obtém o valor da propriedade secondaryDimensions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseSecondaryDimensionType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDataWarehouseSecondaryDimensionType> getSecondaryDimensions() {
        return secondaryDimensions;
    }

    /**
     * Define o valor da propriedade secondaryDimensions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseSecondaryDimensionType }{@code >}
     *     
     */
    public void setSecondaryDimensions(JAXBElement<ArrayOfDataWarehouseSecondaryDimensionType> value) {
        this.secondaryDimensions = value;
    }

    /**
     * Obtém o valor da propriedade transactionType.
     * 
     * @return
     *     possible object is
     *     {@link DataWarehouseTransactionType }
     *     
     */
    public DataWarehouseTransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Define o valor da propriedade transactionType.
     * 
     * @param value
     *     allowed object is
     *     {@link DataWarehouseTransactionType }
     *     
     */
    public void setTransactionType(DataWarehouseTransactionType value) {
        this.transactionType = value;
    }

    /**
     * Obtém o valor da propriedade unitType.
     * 
     * @return
     *     possible object is
     *     {@link MeasureUnitType }
     *     
     */
    public MeasureUnitType getUnitType() {
        return unitType;
    }

    /**
     * Define o valor da propriedade unitType.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureUnitType }
     *     
     */
    public void setUnitType(MeasureUnitType value) {
        this.unitType = value;
    }

}
