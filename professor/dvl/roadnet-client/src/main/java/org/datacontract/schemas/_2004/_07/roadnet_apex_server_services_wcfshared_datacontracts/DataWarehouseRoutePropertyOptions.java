
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de DataWarehouseRoutePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseRoutePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseRouteInternalKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentClasses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentDescriptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentIds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeDescriptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeIds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScenarioIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerIds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerNames" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerTypeDescriptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerTypeIds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseRoutePropertyOptions", propOrder = {
    "dataWarehouseRouteInternalKey",
    "description",
    "equipmentClasses",
    "equipmentDescriptions",
    "equipmentIds",
    "equipmentTypeDescriptions",
    "equipmentTypeIds",
    "regionIdentifier",
    "routeDate",
    "routeIdentifier",
    "scenarioIdentifier",
    "startTime",
    "workerIds",
    "workerNames",
    "workerTypeDescriptions",
    "workerTypeIds"
})
public class DataWarehouseRoutePropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "DataWarehouseRouteInternalKey")
    protected Boolean dataWarehouseRouteInternalKey;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "EquipmentClasses")
    protected Boolean equipmentClasses;
    @XmlElement(name = "EquipmentDescriptions")
    protected Boolean equipmentDescriptions;
    @XmlElement(name = "EquipmentIds")
    protected Boolean equipmentIds;
    @XmlElement(name = "EquipmentTypeDescriptions")
    protected Boolean equipmentTypeDescriptions;
    @XmlElement(name = "EquipmentTypeIds")
    protected Boolean equipmentTypeIds;
    @XmlElement(name = "RegionIdentifier")
    protected Boolean regionIdentifier;
    @XmlElement(name = "RouteDate")
    protected Boolean routeDate;
    @XmlElement(name = "RouteIdentifier")
    protected Boolean routeIdentifier;
    @XmlElement(name = "ScenarioIdentifier")
    protected Boolean scenarioIdentifier;
    @XmlElement(name = "StartTime")
    protected Boolean startTime;
    @XmlElement(name = "WorkerIds")
    protected Boolean workerIds;
    @XmlElement(name = "WorkerNames")
    protected Boolean workerNames;
    @XmlElement(name = "WorkerTypeDescriptions")
    protected Boolean workerTypeDescriptions;
    @XmlElement(name = "WorkerTypeIds")
    protected Boolean workerTypeIds;

    /**
     * Obtém o valor da propriedade dataWarehouseRouteInternalKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseRouteInternalKey() {
        return dataWarehouseRouteInternalKey;
    }

    /**
     * Define o valor da propriedade dataWarehouseRouteInternalKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseRouteInternalKey(Boolean value) {
        this.dataWarehouseRouteInternalKey = value;
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
     * Obtém o valor da propriedade equipmentClasses.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentClasses() {
        return equipmentClasses;
    }

    /**
     * Define o valor da propriedade equipmentClasses.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentClasses(Boolean value) {
        this.equipmentClasses = value;
    }

    /**
     * Obtém o valor da propriedade equipmentDescriptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentDescriptions() {
        return equipmentDescriptions;
    }

    /**
     * Define o valor da propriedade equipmentDescriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentDescriptions(Boolean value) {
        this.equipmentDescriptions = value;
    }

    /**
     * Obtém o valor da propriedade equipmentIds.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentIds() {
        return equipmentIds;
    }

    /**
     * Define o valor da propriedade equipmentIds.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentIds(Boolean value) {
        this.equipmentIds = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeDescriptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentTypeDescriptions() {
        return equipmentTypeDescriptions;
    }

    /**
     * Define o valor da propriedade equipmentTypeDescriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentTypeDescriptions(Boolean value) {
        this.equipmentTypeDescriptions = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeIds.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentTypeIds() {
        return equipmentTypeIds;
    }

    /**
     * Define o valor da propriedade equipmentTypeIds.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentTypeIds(Boolean value) {
        this.equipmentTypeIds = value;
    }

    /**
     * Obtém o valor da propriedade regionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegionIdentifier() {
        return regionIdentifier;
    }

    /**
     * Define o valor da propriedade regionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegionIdentifier(Boolean value) {
        this.regionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade routeDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteDate() {
        return routeDate;
    }

    /**
     * Define o valor da propriedade routeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteDate(Boolean value) {
        this.routeDate = value;
    }

    /**
     * Obtém o valor da propriedade routeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteIdentifier() {
        return routeIdentifier;
    }

    /**
     * Define o valor da propriedade routeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteIdentifier(Boolean value) {
        this.routeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade scenarioIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScenarioIdentifier() {
        return scenarioIdentifier;
    }

    /**
     * Define o valor da propriedade scenarioIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScenarioIdentifier(Boolean value) {
        this.scenarioIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade startTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartTime() {
        return startTime;
    }

    /**
     * Define o valor da propriedade startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartTime(Boolean value) {
        this.startTime = value;
    }

    /**
     * Obtém o valor da propriedade workerIds.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerIds() {
        return workerIds;
    }

    /**
     * Define o valor da propriedade workerIds.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerIds(Boolean value) {
        this.workerIds = value;
    }

    /**
     * Obtém o valor da propriedade workerNames.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerNames() {
        return workerNames;
    }

    /**
     * Define o valor da propriedade workerNames.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerNames(Boolean value) {
        this.workerNames = value;
    }

    /**
     * Obtém o valor da propriedade workerTypeDescriptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerTypeDescriptions() {
        return workerTypeDescriptions;
    }

    /**
     * Define o valor da propriedade workerTypeDescriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerTypeDescriptions(Boolean value) {
        this.workerTypeDescriptions = value;
    }

    /**
     * Obtém o valor da propriedade workerTypeIds.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerTypeIds() {
        return workerTypeIds;
    }

    /**
     * Define o valor da propriedade workerTypeIds.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerTypeIds(Boolean value) {
        this.workerTypeIds = value;
    }

}
