
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de Region.DefaultSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Region.DefaultSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BulkThreshold" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="DepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="HelperWorkerCost" type="{http://roadnet.com/apex/DataContracts/}WorkerCosts" minOccurs="0"/&gt;
 *         &lt;element name="OrderClassEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PackageTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PackageTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCategoryEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTimeTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TimeWindowImportance_TimeWindowImportance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeWindowTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="WorkerCost" type="{http://roadnet.com/apex/DataContracts/}WorkerCosts" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Region.DefaultSettings", propOrder = {
    "bulkThreshold",
    "depotEntityKey",
    "equipmentTypeEntityKey",
    "helperWorkerCost",
    "orderClassEntityKey",
    "packageTypeDescription",
    "packageTypeEntityKey",
    "packageTypeIdentifier",
    "serviceLocationCategoryEntityKey",
    "serviceTimeTypeEntityKey",
    "timeWindowImportanceTimeWindowImportance",
    "timeWindowTypeEntityKey",
    "workerCost",
    "worldTimeZoneTimeZone"
})
public class RegionDefaultSettings
    extends DataTransferObject
{

    @XmlElementRef(name = "BulkThreshold", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> bulkThreshold;
    @XmlElementRef(name = "DepotEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> depotEntityKey;
    @XmlElementRef(name = "EquipmentTypeEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> equipmentTypeEntityKey;
    @XmlElementRef(name = "HelperWorkerCost", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<WorkerCosts> helperWorkerCost;
    @XmlElementRef(name = "OrderClassEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> orderClassEntityKey;
    @XmlElementRef(name = "PackageTypeDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> packageTypeDescription;
    @XmlElementRef(name = "PackageTypeEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> packageTypeEntityKey;
    @XmlElementRef(name = "PackageTypeIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> packageTypeIdentifier;
    @XmlElementRef(name = "ServiceLocationCategoryEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> serviceLocationCategoryEntityKey;
    @XmlElementRef(name = "ServiceTimeTypeEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> serviceTimeTypeEntityKey;
    @XmlElementRef(name = "TimeWindowImportance_TimeWindowImportance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeWindowImportanceTimeWindowImportance;
    @XmlElementRef(name = "TimeWindowTypeEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> timeWindowTypeEntityKey;
    @XmlElementRef(name = "WorkerCost", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<WorkerCosts> workerCost;
    @XmlElementRef(name = "WorldTimeZone_TimeZone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worldTimeZoneTimeZone;

    /**
     * Obtém o valor da propriedade bulkThreshold.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getBulkThreshold() {
        return bulkThreshold;
    }

    /**
     * Define o valor da propriedade bulkThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setBulkThreshold(JAXBElement<Quantities> value) {
        this.bulkThreshold = value;
    }

    /**
     * Obtém o valor da propriedade depotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDepotEntityKey() {
        return depotEntityKey;
    }

    /**
     * Define o valor da propriedade depotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDepotEntityKey(JAXBElement<Long> value) {
        this.depotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEquipmentTypeEntityKey() {
        return equipmentTypeEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEquipmentTypeEntityKey(JAXBElement<Long> value) {
        this.equipmentTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade helperWorkerCost.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WorkerCosts }{@code >}
     *     
     */
    public JAXBElement<WorkerCosts> getHelperWorkerCost() {
        return helperWorkerCost;
    }

    /**
     * Define o valor da propriedade helperWorkerCost.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WorkerCosts }{@code >}
     *     
     */
    public void setHelperWorkerCost(JAXBElement<WorkerCosts> value) {
        this.helperWorkerCost = value;
    }

    /**
     * Obtém o valor da propriedade orderClassEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOrderClassEntityKey() {
        return orderClassEntityKey;
    }

    /**
     * Define o valor da propriedade orderClassEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOrderClassEntityKey(JAXBElement<Long> value) {
        this.orderClassEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade packageTypeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPackageTypeDescription() {
        return packageTypeDescription;
    }

    /**
     * Define o valor da propriedade packageTypeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPackageTypeDescription(JAXBElement<String> value) {
        this.packageTypeDescription = value;
    }

    /**
     * Obtém o valor da propriedade packageTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPackageTypeEntityKey() {
        return packageTypeEntityKey;
    }

    /**
     * Define o valor da propriedade packageTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPackageTypeEntityKey(JAXBElement<Long> value) {
        this.packageTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade packageTypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPackageTypeIdentifier() {
        return packageTypeIdentifier;
    }

    /**
     * Define o valor da propriedade packageTypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPackageTypeIdentifier(JAXBElement<String> value) {
        this.packageTypeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCategoryEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServiceLocationCategoryEntityKey() {
        return serviceLocationCategoryEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationCategoryEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServiceLocationCategoryEntityKey(JAXBElement<Long> value) {
        this.serviceLocationCategoryEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceTimeTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServiceTimeTypeEntityKey() {
        return serviceTimeTypeEntityKey;
    }

    /**
     * Define o valor da propriedade serviceTimeTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServiceTimeTypeEntityKey(JAXBElement<Long> value) {
        this.serviceTimeTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade timeWindowImportanceTimeWindowImportance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeWindowImportanceTimeWindowImportance() {
        return timeWindowImportanceTimeWindowImportance;
    }

    /**
     * Define o valor da propriedade timeWindowImportanceTimeWindowImportance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeWindowImportanceTimeWindowImportance(JAXBElement<String> value) {
        this.timeWindowImportanceTimeWindowImportance = value;
    }

    /**
     * Obtém o valor da propriedade timeWindowTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTimeWindowTypeEntityKey() {
        return timeWindowTypeEntityKey;
    }

    /**
     * Define o valor da propriedade timeWindowTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTimeWindowTypeEntityKey(JAXBElement<Long> value) {
        this.timeWindowTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade workerCost.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WorkerCosts }{@code >}
     *     
     */
    public JAXBElement<WorkerCosts> getWorkerCost() {
        return workerCost;
    }

    /**
     * Define o valor da propriedade workerCost.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WorkerCosts }{@code >}
     *     
     */
    public void setWorkerCost(JAXBElement<WorkerCosts> value) {
        this.workerCost = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorldTimeZoneTimeZone() {
        return worldTimeZoneTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorldTimeZoneTimeZone(JAXBElement<String> value) {
        this.worldTimeZoneTimeZone = value;
    }

}
