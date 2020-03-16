
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de StagedRoutePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StagedRoutePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DestinationCoordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DestinationCreatedInRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DestinationDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DestinationIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DestinationRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentCreatedInRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeCreatedInRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsIntegrated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastStopIsDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OriginBusinessUnitIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OriginCoordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OriginCreatedInRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OriginDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OriginIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OriginRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedArrivalTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedCompleteTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDepartureTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDistanceToDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedGoalDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedOptimalConstrainedDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedOptimalConstrainedRunTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedOptimalDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedOptimalRunTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedOvertimeCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedOvertimeTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedRunningQuantityAfterOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScenarioIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SessionDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Size1Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Size2Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Size3Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SourceVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StagedRouteAction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StagedRouteCosts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StagedRouteEquipments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StagedStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerCreatedInRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerTypeCreatedInRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StagedRoutePropertyOptions", propOrder = {
    "description",
    "destinationCoordinate",
    "destinationCreatedInRegionIdentifier",
    "destinationDescription",
    "destinationIdentifier",
    "destinationRegionIdentifier",
    "equipmentCreatedInRegionIdentifier",
    "equipmentDescription",
    "equipmentIdentifier",
    "equipmentTypeCreatedInRegionIdentifier",
    "equipmentTypeDescription",
    "equipmentTypeIdentifier",
    "isIntegrated",
    "lastStopIsDestination",
    "originBusinessUnitIdentifier",
    "originCoordinate",
    "originCreatedInRegionIdentifier",
    "originDescription",
    "originIdentifier",
    "originRegionIdentifier",
    "plannedArrivalTime",
    "plannedCompleteTime",
    "plannedDepartureTime",
    "plannedDistanceToDestination",
    "plannedGoalDistance",
    "plannedOptimalConstrainedDistance",
    "plannedOptimalConstrainedRunTime",
    "plannedOptimalDistance",
    "plannedOptimalRunTime",
    "plannedOvertimeCost",
    "plannedOvertimeTime",
    "plannedRunningQuantityAfterOrigin",
    "plannedStartTime",
    "regionIdentifier",
    "routeDate",
    "routeIdentifier",
    "scenarioIdentifier",
    "sessionDescription",
    "size1Alias",
    "size2Alias",
    "size3Alias",
    "source",
    "sourceVersion",
    "stagedRouteAction",
    "stagedRouteCosts",
    "stagedRouteEquipments",
    "stagedStops",
    "workerCreatedInRegionIdentifier",
    "workerIdentifier",
    "workerName",
    "workerTypeCreatedInRegionIdentifier",
    "workerTypeDescription",
    "workerTypeIdentifier"
})
public class StagedRoutePropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "DestinationCoordinate")
    protected Boolean destinationCoordinate;
    @XmlElement(name = "DestinationCreatedInRegionIdentifier")
    protected Boolean destinationCreatedInRegionIdentifier;
    @XmlElement(name = "DestinationDescription")
    protected Boolean destinationDescription;
    @XmlElement(name = "DestinationIdentifier")
    protected Boolean destinationIdentifier;
    @XmlElement(name = "DestinationRegionIdentifier")
    protected Boolean destinationRegionIdentifier;
    @XmlElement(name = "EquipmentCreatedInRegionIdentifier")
    protected Boolean equipmentCreatedInRegionIdentifier;
    @XmlElement(name = "EquipmentDescription")
    protected Boolean equipmentDescription;
    @XmlElement(name = "EquipmentIdentifier")
    protected Boolean equipmentIdentifier;
    @XmlElement(name = "EquipmentTypeCreatedInRegionIdentifier")
    protected Boolean equipmentTypeCreatedInRegionIdentifier;
    @XmlElement(name = "EquipmentTypeDescription")
    protected Boolean equipmentTypeDescription;
    @XmlElement(name = "EquipmentTypeIdentifier")
    protected Boolean equipmentTypeIdentifier;
    @XmlElement(name = "IsIntegrated")
    protected Boolean isIntegrated;
    @XmlElement(name = "LastStopIsDestination")
    protected Boolean lastStopIsDestination;
    @XmlElement(name = "OriginBusinessUnitIdentifier")
    protected Boolean originBusinessUnitIdentifier;
    @XmlElement(name = "OriginCoordinate")
    protected Boolean originCoordinate;
    @XmlElement(name = "OriginCreatedInRegionIdentifier")
    protected Boolean originCreatedInRegionIdentifier;
    @XmlElement(name = "OriginDescription")
    protected Boolean originDescription;
    @XmlElement(name = "OriginIdentifier")
    protected Boolean originIdentifier;
    @XmlElement(name = "OriginRegionIdentifier")
    protected Boolean originRegionIdentifier;
    @XmlElement(name = "PlannedArrivalTime")
    protected Boolean plannedArrivalTime;
    @XmlElement(name = "PlannedCompleteTime")
    protected Boolean plannedCompleteTime;
    @XmlElement(name = "PlannedDepartureTime")
    protected Boolean plannedDepartureTime;
    @XmlElement(name = "PlannedDistanceToDestination")
    protected Boolean plannedDistanceToDestination;
    @XmlElement(name = "PlannedGoalDistance")
    protected Boolean plannedGoalDistance;
    @XmlElement(name = "PlannedOptimalConstrainedDistance")
    protected Boolean plannedOptimalConstrainedDistance;
    @XmlElement(name = "PlannedOptimalConstrainedRunTime")
    protected Boolean plannedOptimalConstrainedRunTime;
    @XmlElement(name = "PlannedOptimalDistance")
    protected Boolean plannedOptimalDistance;
    @XmlElement(name = "PlannedOptimalRunTime")
    protected Boolean plannedOptimalRunTime;
    @XmlElement(name = "PlannedOvertimeCost")
    protected Boolean plannedOvertimeCost;
    @XmlElement(name = "PlannedOvertimeTime")
    protected Boolean plannedOvertimeTime;
    @XmlElement(name = "PlannedRunningQuantityAfterOrigin")
    protected Boolean plannedRunningQuantityAfterOrigin;
    @XmlElement(name = "PlannedStartTime")
    protected Boolean plannedStartTime;
    @XmlElement(name = "RegionIdentifier")
    protected Boolean regionIdentifier;
    @XmlElement(name = "RouteDate")
    protected Boolean routeDate;
    @XmlElement(name = "RouteIdentifier")
    protected Boolean routeIdentifier;
    @XmlElement(name = "ScenarioIdentifier")
    protected Boolean scenarioIdentifier;
    @XmlElement(name = "SessionDescription")
    protected Boolean sessionDescription;
    @XmlElementRef(name = "Size1Alias", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> size1Alias;
    @XmlElementRef(name = "Size2Alias", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> size2Alias;
    @XmlElementRef(name = "Size3Alias", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> size3Alias;
    @XmlElement(name = "Source")
    protected Boolean source;
    @XmlElement(name = "SourceVersion")
    protected Boolean sourceVersion;
    @XmlElement(name = "StagedRouteAction")
    protected Boolean stagedRouteAction;
    @XmlElement(name = "StagedRouteCosts")
    protected Boolean stagedRouteCosts;
    @XmlElement(name = "StagedRouteEquipments")
    protected Boolean stagedRouteEquipments;
    @XmlElement(name = "StagedStops")
    protected Boolean stagedStops;
    @XmlElement(name = "WorkerCreatedInRegionIdentifier")
    protected Boolean workerCreatedInRegionIdentifier;
    @XmlElement(name = "WorkerIdentifier")
    protected Boolean workerIdentifier;
    @XmlElement(name = "WorkerName")
    protected Boolean workerName;
    @XmlElement(name = "WorkerTypeCreatedInRegionIdentifier")
    protected Boolean workerTypeCreatedInRegionIdentifier;
    @XmlElementRef(name = "WorkerTypeDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerTypeDescription;
    @XmlElementRef(name = "WorkerTypeIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerTypeIdentifier;

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
     * Obtém o valor da propriedade destinationCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDestinationCoordinate() {
        return destinationCoordinate;
    }

    /**
     * Define o valor da propriedade destinationCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDestinationCoordinate(Boolean value) {
        this.destinationCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade destinationCreatedInRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDestinationCreatedInRegionIdentifier() {
        return destinationCreatedInRegionIdentifier;
    }

    /**
     * Define o valor da propriedade destinationCreatedInRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDestinationCreatedInRegionIdentifier(Boolean value) {
        this.destinationCreatedInRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade destinationDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDestinationDescription() {
        return destinationDescription;
    }

    /**
     * Define o valor da propriedade destinationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDestinationDescription(Boolean value) {
        this.destinationDescription = value;
    }

    /**
     * Obtém o valor da propriedade destinationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDestinationIdentifier() {
        return destinationIdentifier;
    }

    /**
     * Define o valor da propriedade destinationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDestinationIdentifier(Boolean value) {
        this.destinationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade destinationRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDestinationRegionIdentifier() {
        return destinationRegionIdentifier;
    }

    /**
     * Define o valor da propriedade destinationRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDestinationRegionIdentifier(Boolean value) {
        this.destinationRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade equipmentCreatedInRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentCreatedInRegionIdentifier() {
        return equipmentCreatedInRegionIdentifier;
    }

    /**
     * Define o valor da propriedade equipmentCreatedInRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentCreatedInRegionIdentifier(Boolean value) {
        this.equipmentCreatedInRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade equipmentDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentDescription() {
        return equipmentDescription;
    }

    /**
     * Define o valor da propriedade equipmentDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentDescription(Boolean value) {
        this.equipmentDescription = value;
    }

    /**
     * Obtém o valor da propriedade equipmentIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentIdentifier() {
        return equipmentIdentifier;
    }

    /**
     * Define o valor da propriedade equipmentIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentIdentifier(Boolean value) {
        this.equipmentIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeCreatedInRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentTypeCreatedInRegionIdentifier() {
        return equipmentTypeCreatedInRegionIdentifier;
    }

    /**
     * Define o valor da propriedade equipmentTypeCreatedInRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentTypeCreatedInRegionIdentifier(Boolean value) {
        this.equipmentTypeCreatedInRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentTypeDescription() {
        return equipmentTypeDescription;
    }

    /**
     * Define o valor da propriedade equipmentTypeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentTypeDescription(Boolean value) {
        this.equipmentTypeDescription = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentTypeIdentifier() {
        return equipmentTypeIdentifier;
    }

    /**
     * Define o valor da propriedade equipmentTypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentTypeIdentifier(Boolean value) {
        this.equipmentTypeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade isIntegrated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIntegrated() {
        return isIntegrated;
    }

    /**
     * Define o valor da propriedade isIntegrated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIntegrated(Boolean value) {
        this.isIntegrated = value;
    }

    /**
     * Obtém o valor da propriedade lastStopIsDestination.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastStopIsDestination() {
        return lastStopIsDestination;
    }

    /**
     * Define o valor da propriedade lastStopIsDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastStopIsDestination(Boolean value) {
        this.lastStopIsDestination = value;
    }

    /**
     * Obtém o valor da propriedade originBusinessUnitIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginBusinessUnitIdentifier() {
        return originBusinessUnitIdentifier;
    }

    /**
     * Define o valor da propriedade originBusinessUnitIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginBusinessUnitIdentifier(Boolean value) {
        this.originBusinessUnitIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade originCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginCoordinate() {
        return originCoordinate;
    }

    /**
     * Define o valor da propriedade originCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginCoordinate(Boolean value) {
        this.originCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade originCreatedInRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginCreatedInRegionIdentifier() {
        return originCreatedInRegionIdentifier;
    }

    /**
     * Define o valor da propriedade originCreatedInRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginCreatedInRegionIdentifier(Boolean value) {
        this.originCreatedInRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade originDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginDescription() {
        return originDescription;
    }

    /**
     * Define o valor da propriedade originDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginDescription(Boolean value) {
        this.originDescription = value;
    }

    /**
     * Obtém o valor da propriedade originIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginIdentifier() {
        return originIdentifier;
    }

    /**
     * Define o valor da propriedade originIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginIdentifier(Boolean value) {
        this.originIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade originRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginRegionIdentifier() {
        return originRegionIdentifier;
    }

    /**
     * Define o valor da propriedade originRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginRegionIdentifier(Boolean value) {
        this.originRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade plannedArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedArrivalTime() {
        return plannedArrivalTime;
    }

    /**
     * Define o valor da propriedade plannedArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedArrivalTime(Boolean value) {
        this.plannedArrivalTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedCompleteTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedCompleteTime() {
        return plannedCompleteTime;
    }

    /**
     * Define o valor da propriedade plannedCompleteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedCompleteTime(Boolean value) {
        this.plannedCompleteTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedDepartureTime() {
        return plannedDepartureTime;
    }

    /**
     * Define o valor da propriedade plannedDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedDepartureTime(Boolean value) {
        this.plannedDepartureTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedDistanceToDestination.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedDistanceToDestination() {
        return plannedDistanceToDestination;
    }

    /**
     * Define o valor da propriedade plannedDistanceToDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedDistanceToDestination(Boolean value) {
        this.plannedDistanceToDestination = value;
    }

    /**
     * Obtém o valor da propriedade plannedGoalDistance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedGoalDistance() {
        return plannedGoalDistance;
    }

    /**
     * Define o valor da propriedade plannedGoalDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedGoalDistance(Boolean value) {
        this.plannedGoalDistance = value;
    }

    /**
     * Obtém o valor da propriedade plannedOptimalConstrainedDistance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedOptimalConstrainedDistance() {
        return plannedOptimalConstrainedDistance;
    }

    /**
     * Define o valor da propriedade plannedOptimalConstrainedDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedOptimalConstrainedDistance(Boolean value) {
        this.plannedOptimalConstrainedDistance = value;
    }

    /**
     * Obtém o valor da propriedade plannedOptimalConstrainedRunTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedOptimalConstrainedRunTime() {
        return plannedOptimalConstrainedRunTime;
    }

    /**
     * Define o valor da propriedade plannedOptimalConstrainedRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedOptimalConstrainedRunTime(Boolean value) {
        this.plannedOptimalConstrainedRunTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedOptimalDistance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedOptimalDistance() {
        return plannedOptimalDistance;
    }

    /**
     * Define o valor da propriedade plannedOptimalDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedOptimalDistance(Boolean value) {
        this.plannedOptimalDistance = value;
    }

    /**
     * Obtém o valor da propriedade plannedOptimalRunTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedOptimalRunTime() {
        return plannedOptimalRunTime;
    }

    /**
     * Define o valor da propriedade plannedOptimalRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedOptimalRunTime(Boolean value) {
        this.plannedOptimalRunTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedOvertimeCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedOvertimeCost() {
        return plannedOvertimeCost;
    }

    /**
     * Define o valor da propriedade plannedOvertimeCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedOvertimeCost(Boolean value) {
        this.plannedOvertimeCost = value;
    }

    /**
     * Obtém o valor da propriedade plannedOvertimeTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedOvertimeTime() {
        return plannedOvertimeTime;
    }

    /**
     * Define o valor da propriedade plannedOvertimeTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedOvertimeTime(Boolean value) {
        this.plannedOvertimeTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedRunningQuantityAfterOrigin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedRunningQuantityAfterOrigin() {
        return plannedRunningQuantityAfterOrigin;
    }

    /**
     * Define o valor da propriedade plannedRunningQuantityAfterOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedRunningQuantityAfterOrigin(Boolean value) {
        this.plannedRunningQuantityAfterOrigin = value;
    }

    /**
     * Obtém o valor da propriedade plannedStartTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedStartTime() {
        return plannedStartTime;
    }

    /**
     * Define o valor da propriedade plannedStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedStartTime(Boolean value) {
        this.plannedStartTime = value;
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
     * Obtém o valor da propriedade sessionDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSessionDescription() {
        return sessionDescription;
    }

    /**
     * Define o valor da propriedade sessionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSessionDescription(Boolean value) {
        this.sessionDescription = value;
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
     * Obtém o valor da propriedade source.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSource() {
        return source;
    }

    /**
     * Define o valor da propriedade source.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSource(Boolean value) {
        this.source = value;
    }

    /**
     * Obtém o valor da propriedade sourceVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSourceVersion() {
        return sourceVersion;
    }

    /**
     * Define o valor da propriedade sourceVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSourceVersion(Boolean value) {
        this.sourceVersion = value;
    }

    /**
     * Obtém o valor da propriedade stagedRouteAction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStagedRouteAction() {
        return stagedRouteAction;
    }

    /**
     * Define o valor da propriedade stagedRouteAction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStagedRouteAction(Boolean value) {
        this.stagedRouteAction = value;
    }

    /**
     * Obtém o valor da propriedade stagedRouteCosts.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStagedRouteCosts() {
        return stagedRouteCosts;
    }

    /**
     * Define o valor da propriedade stagedRouteCosts.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStagedRouteCosts(Boolean value) {
        this.stagedRouteCosts = value;
    }

    /**
     * Obtém o valor da propriedade stagedRouteEquipments.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStagedRouteEquipments() {
        return stagedRouteEquipments;
    }

    /**
     * Define o valor da propriedade stagedRouteEquipments.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStagedRouteEquipments(Boolean value) {
        this.stagedRouteEquipments = value;
    }

    /**
     * Obtém o valor da propriedade stagedStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStagedStops() {
        return stagedStops;
    }

    /**
     * Define o valor da propriedade stagedStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStagedStops(Boolean value) {
        this.stagedStops = value;
    }

    /**
     * Obtém o valor da propriedade workerCreatedInRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerCreatedInRegionIdentifier() {
        return workerCreatedInRegionIdentifier;
    }

    /**
     * Define o valor da propriedade workerCreatedInRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerCreatedInRegionIdentifier(Boolean value) {
        this.workerCreatedInRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade workerIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerIdentifier() {
        return workerIdentifier;
    }

    /**
     * Define o valor da propriedade workerIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerIdentifier(Boolean value) {
        this.workerIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade workerName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerName() {
        return workerName;
    }

    /**
     * Define o valor da propriedade workerName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerName(Boolean value) {
        this.workerName = value;
    }

    /**
     * Obtém o valor da propriedade workerTypeCreatedInRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerTypeCreatedInRegionIdentifier() {
        return workerTypeCreatedInRegionIdentifier;
    }

    /**
     * Define o valor da propriedade workerTypeCreatedInRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerTypeCreatedInRegionIdentifier(Boolean value) {
        this.workerTypeCreatedInRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade workerTypeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerTypeDescription() {
        return workerTypeDescription;
    }

    /**
     * Define o valor da propriedade workerTypeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerTypeDescription(JAXBElement<String> value) {
        this.workerTypeDescription = value;
    }

    /**
     * Obtém o valor da propriedade workerTypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerTypeIdentifier() {
        return workerTypeIdentifier;
    }

    /**
     * Define o valor da propriedade workerTypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerTypeIdentifier(JAXBElement<String> value) {
        this.workerTypeIdentifier = value;
    }

}
