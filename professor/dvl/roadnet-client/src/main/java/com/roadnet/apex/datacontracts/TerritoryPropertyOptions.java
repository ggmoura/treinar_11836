
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TerritoryPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TerritoryPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AssignDaysPassEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CreateTerritoriesPassEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Equipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentPropertyOptions" type="{http://roadnet.com/apex/DataContracts/}TerritoryEquipmentPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedNumberOfStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OriginDepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TeamSplit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalEstimatedRunTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalEstimatedServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Workers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkersPropertyOptions" type="{http://roadnet.com/apex/DataContracts/}TerritoryWorkerPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerritoryPropertyOptions", propOrder = {
    "area",
    "assignDaysPassEntityKey",
    "color",
    "createTerritoriesPassEntityKey",
    "description",
    "equipment",
    "equipmentPropertyOptions",
    "estimatedNumberOfStops",
    "identifier",
    "originDepotEntityKey",
    "sessionEntityKey",
    "teamSplit",
    "totalEstimatedRunTime",
    "totalEstimatedServiceTime",
    "workers",
    "workersPropertyOptions"
})
public class TerritoryPropertyOptions
    extends RegionBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "Area")
    protected Boolean area;
    @XmlElement(name = "AssignDaysPassEntityKey")
    protected Boolean assignDaysPassEntityKey;
    @XmlElement(name = "Color")
    protected Boolean color;
    @XmlElement(name = "CreateTerritoriesPassEntityKey")
    protected Boolean createTerritoriesPassEntityKey;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "Equipment")
    protected Boolean equipment;
    @XmlElementRef(name = "EquipmentPropertyOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TerritoryEquipmentPropertyOptions> equipmentPropertyOptions;
    @XmlElement(name = "EstimatedNumberOfStops")
    protected Boolean estimatedNumberOfStops;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "OriginDepotEntityKey")
    protected Boolean originDepotEntityKey;
    @XmlElement(name = "SessionEntityKey")
    protected Boolean sessionEntityKey;
    @XmlElement(name = "TeamSplit")
    protected Boolean teamSplit;
    @XmlElement(name = "TotalEstimatedRunTime")
    protected Boolean totalEstimatedRunTime;
    @XmlElement(name = "TotalEstimatedServiceTime")
    protected Boolean totalEstimatedServiceTime;
    @XmlElement(name = "Workers")
    protected Boolean workers;
    @XmlElementRef(name = "WorkersPropertyOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TerritoryWorkerPropertyOptions> workersPropertyOptions;

    /**
     * Obtém o valor da propriedade area.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArea() {
        return area;
    }

    /**
     * Define o valor da propriedade area.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArea(Boolean value) {
        this.area = value;
    }

    /**
     * Obtém o valor da propriedade assignDaysPassEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssignDaysPassEntityKey() {
        return assignDaysPassEntityKey;
    }

    /**
     * Define o valor da propriedade assignDaysPassEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignDaysPassEntityKey(Boolean value) {
        this.assignDaysPassEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade color.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColor() {
        return color;
    }

    /**
     * Define o valor da propriedade color.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColor(Boolean value) {
        this.color = value;
    }

    /**
     * Obtém o valor da propriedade createTerritoriesPassEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateTerritoriesPassEntityKey() {
        return createTerritoriesPassEntityKey;
    }

    /**
     * Define o valor da propriedade createTerritoriesPassEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateTerritoriesPassEntityKey(Boolean value) {
        this.createTerritoriesPassEntityKey = value;
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
     * Obtém o valor da propriedade equipment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipment() {
        return equipment;
    }

    /**
     * Define o valor da propriedade equipment.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipment(Boolean value) {
        this.equipment = value;
    }

    /**
     * Obtém o valor da propriedade equipmentPropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TerritoryEquipmentPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<TerritoryEquipmentPropertyOptions> getEquipmentPropertyOptions() {
        return equipmentPropertyOptions;
    }

    /**
     * Define o valor da propriedade equipmentPropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TerritoryEquipmentPropertyOptions }{@code >}
     *     
     */
    public void setEquipmentPropertyOptions(JAXBElement<TerritoryEquipmentPropertyOptions> value) {
        this.equipmentPropertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade estimatedNumberOfStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEstimatedNumberOfStops() {
        return estimatedNumberOfStops;
    }

    /**
     * Define o valor da propriedade estimatedNumberOfStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEstimatedNumberOfStops(Boolean value) {
        this.estimatedNumberOfStops = value;
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
     * Obtém o valor da propriedade originDepotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginDepotEntityKey() {
        return originDepotEntityKey;
    }

    /**
     * Define o valor da propriedade originDepotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginDepotEntityKey(Boolean value) {
        this.originDepotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade sessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSessionEntityKey() {
        return sessionEntityKey;
    }

    /**
     * Define o valor da propriedade sessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSessionEntityKey(Boolean value) {
        this.sessionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade teamSplit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTeamSplit() {
        return teamSplit;
    }

    /**
     * Define o valor da propriedade teamSplit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTeamSplit(Boolean value) {
        this.teamSplit = value;
    }

    /**
     * Obtém o valor da propriedade totalEstimatedRunTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalEstimatedRunTime() {
        return totalEstimatedRunTime;
    }

    /**
     * Define o valor da propriedade totalEstimatedRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalEstimatedRunTime(Boolean value) {
        this.totalEstimatedRunTime = value;
    }

    /**
     * Obtém o valor da propriedade totalEstimatedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalEstimatedServiceTime() {
        return totalEstimatedServiceTime;
    }

    /**
     * Define o valor da propriedade totalEstimatedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalEstimatedServiceTime(Boolean value) {
        this.totalEstimatedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade workers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkers() {
        return workers;
    }

    /**
     * Define o valor da propriedade workers.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkers(Boolean value) {
        this.workers = value;
    }

    /**
     * Obtém o valor da propriedade workersPropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TerritoryWorkerPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<TerritoryWorkerPropertyOptions> getWorkersPropertyOptions() {
        return workersPropertyOptions;
    }

    /**
     * Define o valor da propriedade workersPropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TerritoryWorkerPropertyOptions }{@code >}
     *     
     */
    public void setWorkersPropertyOptions(JAXBElement<TerritoryWorkerPropertyOptions> value) {
        this.workersPropertyOptions = value;
    }

}
