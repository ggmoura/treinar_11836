
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;


/**
 * <p>Classe Java de SaveTerritoryArgs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SaveTerritoryArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AsssignDaysPassEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Color" type="{http://roadnet.com/apex/DataContracts/}Color" minOccurs="0"/&gt;
 *         &lt;element name="CreateTerritoriesPassEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CustomProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Equipment" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTerritoryEquipmentBase" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Instance" type="{http://roadnet.com/apex/DataContracts/}DomainInstance" minOccurs="0"/&gt;
 *         &lt;element name="OriginDepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TeamSplit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Workers" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTerritoryWorker" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveTerritoryArgs", propOrder = {
    "asssignDaysPassEntityKey",
    "color",
    "createTerritoriesPassEntityKey",
    "customProperties",
    "description",
    "equipment",
    "identifier",
    "instance",
    "originDepotEntityKey",
    "sessionEntityKey",
    "teamSplit",
    "workers"
})
public class SaveTerritoryArgs {

    @XmlElementRef(name = "AsssignDaysPassEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> asssignDaysPassEntityKey;
    @XmlElementRef(name = "Color", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Color> color;
    @XmlElement(name = "CreateTerritoriesPassEntityKey")
    protected Long createTerritoriesPassEntityKey;
    @XmlElementRef(name = "CustomProperties", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> customProperties;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Equipment", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTerritoryEquipmentBase> equipment;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "Instance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<DomainInstance> instance;
    @XmlElement(name = "OriginDepotEntityKey")
    protected Long originDepotEntityKey;
    @XmlElement(name = "SessionEntityKey")
    protected Long sessionEntityKey;
    @XmlElement(name = "TeamSplit")
    protected Boolean teamSplit;
    @XmlElementRef(name = "Workers", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTerritoryWorker> workers;

    /**
     * Obtém o valor da propriedade asssignDaysPassEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAsssignDaysPassEntityKey() {
        return asssignDaysPassEntityKey;
    }

    /**
     * Define o valor da propriedade asssignDaysPassEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAsssignDaysPassEntityKey(JAXBElement<Long> value) {
        this.asssignDaysPassEntityKey = value;
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
     * Obtém o valor da propriedade customProperties.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringanyType> getCustomProperties() {
        return customProperties;
    }

    /**
     * Define o valor da propriedade customProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public void setCustomProperties(JAXBElement<ArrayOfKeyValueOfstringanyType> value) {
        this.customProperties = value;
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
     * Obtém o valor da propriedade instance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}
     *     
     */
    public JAXBElement<DomainInstance> getInstance() {
        return instance;
    }

    /**
     * Define o valor da propriedade instance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}
     *     
     */
    public void setInstance(JAXBElement<DomainInstance> value) {
        this.instance = value;
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
