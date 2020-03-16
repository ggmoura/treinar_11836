
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OverridableRegionProperties.DefaultSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OverridableRegionProperties.DefaultSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BulkThreshold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Depot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HelperWorkerCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderClass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PackageType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCategory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTimeType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeWindowImportance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeWindowType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverridableRegionProperties.DefaultSettings", propOrder = {
    "bulkThreshold",
    "depot",
    "equipmentType",
    "helperWorkerCost",
    "orderClass",
    "packageType",
    "serviceLocationCategory",
    "serviceTimeType",
    "timeWindowImportance",
    "timeWindowType",
    "timeZone",
    "workerCost"
})
public class OverridableRegionPropertiesDefaultSettings
    extends DataTransferObject
{

    @XmlElement(name = "BulkThreshold")
    protected Boolean bulkThreshold;
    @XmlElement(name = "Depot")
    protected Boolean depot;
    @XmlElement(name = "EquipmentType")
    protected Boolean equipmentType;
    @XmlElement(name = "HelperWorkerCost")
    protected Boolean helperWorkerCost;
    @XmlElement(name = "OrderClass")
    protected Boolean orderClass;
    @XmlElement(name = "PackageType")
    protected Boolean packageType;
    @XmlElement(name = "ServiceLocationCategory")
    protected Boolean serviceLocationCategory;
    @XmlElement(name = "ServiceTimeType")
    protected Boolean serviceTimeType;
    @XmlElement(name = "TimeWindowImportance")
    protected Boolean timeWindowImportance;
    @XmlElement(name = "TimeWindowType")
    protected Boolean timeWindowType;
    @XmlElement(name = "TimeZone")
    protected Boolean timeZone;
    @XmlElement(name = "WorkerCost")
    protected Boolean workerCost;

    /**
     * Obtém o valor da propriedade bulkThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBulkThreshold() {
        return bulkThreshold;
    }

    /**
     * Define o valor da propriedade bulkThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBulkThreshold(Boolean value) {
        this.bulkThreshold = value;
    }

    /**
     * Obtém o valor da propriedade depot.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepot() {
        return depot;
    }

    /**
     * Define o valor da propriedade depot.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepot(Boolean value) {
        this.depot = value;
    }

    /**
     * Obtém o valor da propriedade equipmentType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentType() {
        return equipmentType;
    }

    /**
     * Define o valor da propriedade equipmentType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentType(Boolean value) {
        this.equipmentType = value;
    }

    /**
     * Obtém o valor da propriedade helperWorkerCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHelperWorkerCost() {
        return helperWorkerCost;
    }

    /**
     * Define o valor da propriedade helperWorkerCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHelperWorkerCost(Boolean value) {
        this.helperWorkerCost = value;
    }

    /**
     * Obtém o valor da propriedade orderClass.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderClass() {
        return orderClass;
    }

    /**
     * Define o valor da propriedade orderClass.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderClass(Boolean value) {
        this.orderClass = value;
    }

    /**
     * Obtém o valor da propriedade packageType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPackageType() {
        return packageType;
    }

    /**
     * Define o valor da propriedade packageType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPackageType(Boolean value) {
        this.packageType = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCategory.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationCategory() {
        return serviceLocationCategory;
    }

    /**
     * Define o valor da propriedade serviceLocationCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationCategory(Boolean value) {
        this.serviceLocationCategory = value;
    }

    /**
     * Obtém o valor da propriedade serviceTimeType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceTimeType() {
        return serviceTimeType;
    }

    /**
     * Define o valor da propriedade serviceTimeType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceTimeType(Boolean value) {
        this.serviceTimeType = value;
    }

    /**
     * Obtém o valor da propriedade timeWindowImportance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeWindowImportance() {
        return timeWindowImportance;
    }

    /**
     * Define o valor da propriedade timeWindowImportance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeWindowImportance(Boolean value) {
        this.timeWindowImportance = value;
    }

    /**
     * Obtém o valor da propriedade timeWindowType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeWindowType() {
        return timeWindowType;
    }

    /**
     * Define o valor da propriedade timeWindowType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeWindowType(Boolean value) {
        this.timeWindowType = value;
    }

    /**
     * Obtém o valor da propriedade timeZone.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeZone() {
        return timeZone;
    }

    /**
     * Define o valor da propriedade timeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeZone(Boolean value) {
        this.timeZone = value;
    }

    /**
     * Obtém o valor da propriedade workerCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerCost() {
        return workerCost;
    }

    /**
     * Define o valor da propriedade workerCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerCost(Boolean value) {
        this.workerCost = value;
    }

}
