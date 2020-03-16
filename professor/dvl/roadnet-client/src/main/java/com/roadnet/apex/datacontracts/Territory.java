
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de Territory complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Territory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Area" type="{http://roadnet.com/apex/DataContracts/}Polygon" minOccurs="0"/&gt;
 *         &lt;element name="AssignDaysPassEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Color" type="{http://roadnet.com/apex/DataContracts/}Color" minOccurs="0"/&gt;
 *         &lt;element name="CreateTerritoriesPassEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Equipment" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTerritoryEquipmentBase" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedNumberOfStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginDepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TeamSplit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalEstimatedRunTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalEstimatedServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="Workers" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTerritoryWorker" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Territory", propOrder = {
    "area",
    "assignDaysPassEntityKey",
    "color",
    "createTerritoriesPassEntityKey",
    "description",
    "equipment",
    "estimatedNumberOfStops",
    "identifier",
    "originDepotEntityKey",
    "sessionEntityKey",
    "teamSplit",
    "totalEstimatedRunTime",
    "totalEstimatedServiceTime",
    "workers"
})
public class Territory
    extends RegionBasedAggregateRootEntity
{

    @XmlElementRef(name = "Area", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Polygon> area;
    @XmlElementRef(name = "AssignDaysPassEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> assignDaysPassEntityKey;
    @XmlElementRef(name = "Color", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Color> color;
    @XmlElement(name = "CreateTerritoriesPassEntityKey")
    protected Long createTerritoriesPassEntityKey;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Equipment", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTerritoryEquipmentBase> equipment;
    @XmlElement(name = "EstimatedNumberOfStops")
    protected Integer estimatedNumberOfStops;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "OriginDepotEntityKey")
    protected Long originDepotEntityKey;
    @XmlElement(name = "SessionEntityKey")
    protected Long sessionEntityKey;
    @XmlElement(name = "TeamSplit")
    protected Boolean teamSplit;
    @XmlElement(name = "TotalEstimatedRunTime")
    protected Duration totalEstimatedRunTime;
    @XmlElement(name = "TotalEstimatedServiceTime")
    protected Duration totalEstimatedServiceTime;
    @XmlElementRef(name = "Workers", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTerritoryWorker> workers;

    /**
     * Obtém o valor da propriedade area.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Polygon }{@code >}
     *     
     */
    public JAXBElement<Polygon> getArea() {
        return area;
    }

    /**
     * Define o valor da propriedade area.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Polygon }{@code >}
     *     
     */
    public void setArea(JAXBElement<Polygon> value) {
        this.area = value;
    }

    /**
     * Obtém o valor da propriedade assignDaysPassEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAssignDaysPassEntityKey() {
        return assignDaysPassEntityKey;
    }

    /**
     * Define o valor da propriedade assignDaysPassEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAssignDaysPassEntityKey(JAXBElement<Long> value) {
        this.assignDaysPassEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade color.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Color }{@code >}
     *     
     */
    public JAXBElement<Color> getColor() {
        return color;
    }

    /**
     * Define o valor da propriedade color.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Color }{@code >}
     *     
     */
    public void setColor(JAXBElement<Color> value) {
        this.color = value;
    }

    /**
     * Obtém o valor da propriedade createTerritoriesPassEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreateTerritoriesPassEntityKey() {
        return createTerritoriesPassEntityKey;
    }

    /**
     * Define o valor da propriedade createTerritoriesPassEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreateTerritoriesPassEntityKey(Long value) {
        this.createTerritoriesPassEntityKey = value;
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
     * Obtém o valor da propriedade equipment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTerritoryEquipmentBase }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTerritoryEquipmentBase> getEquipment() {
        return equipment;
    }

    /**
     * Define o valor da propriedade equipment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTerritoryEquipmentBase }{@code >}
     *     
     */
    public void setEquipment(JAXBElement<ArrayOfTerritoryEquipmentBase> value) {
        this.equipment = value;
    }

    /**
     * Obtém o valor da propriedade estimatedNumberOfStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstimatedNumberOfStops() {
        return estimatedNumberOfStops;
    }

    /**
     * Define o valor da propriedade estimatedNumberOfStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstimatedNumberOfStops(Integer value) {
        this.estimatedNumberOfStops = value;
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
     * Obtém o valor da propriedade originDepotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginDepotEntityKey() {
        return originDepotEntityKey;
    }

    /**
     * Define o valor da propriedade originDepotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginDepotEntityKey(Long value) {
        this.originDepotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade sessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSessionEntityKey() {
        return sessionEntityKey;
    }

    /**
     * Define o valor da propriedade sessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSessionEntityKey(Long value) {
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
     *     {@link Duration }
     *     
     */
    public Duration getTotalEstimatedRunTime() {
        return totalEstimatedRunTime;
    }

    /**
     * Define o valor da propriedade totalEstimatedRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalEstimatedRunTime(Duration value) {
        this.totalEstimatedRunTime = value;
    }

    /**
     * Obtém o valor da propriedade totalEstimatedServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalEstimatedServiceTime() {
        return totalEstimatedServiceTime;
    }

    /**
     * Define o valor da propriedade totalEstimatedServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalEstimatedServiceTime(Duration value) {
        this.totalEstimatedServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade workers.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTerritoryWorker }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTerritoryWorker> getWorkers() {
        return workers;
    }

    /**
     * Define o valor da propriedade workers.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTerritoryWorker }{@code >}
     *     
     */
    public void setWorkers(JAXBElement<ArrayOfTerritoryWorker> value) {
        this.workers = value;
    }

}
