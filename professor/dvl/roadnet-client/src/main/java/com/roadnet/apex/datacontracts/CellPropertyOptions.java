
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CellPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CellPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeRestriction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeRestrictionOptions" type="{http://roadnet.com/apex/DataContracts/}EquipmentTypeRestrictionPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxTimeOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxTravelTimeOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Precedence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreferredTimeOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartTimeOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseWorkerEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellPropertyOptions", propOrder = {
    "area",
    "color",
    "description",
    "equipmentEntityKey",
    "equipmentTypeRestriction",
    "equipmentTypeRestrictionOptions",
    "identifier",
    "isDeleted",
    "maxRoutes",
    "maxTimeOverride",
    "maxTravelTimeOverride",
    "precedence",
    "preferredTimeOverride",
    "routeId",
    "startTimeOverride",
    "useWorkerEquipment",
    "workerEntityKey"
})
public class CellPropertyOptions
    extends RegionBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "Area")
    protected Boolean area;
    @XmlElement(name = "Color")
    protected Boolean color;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "EquipmentEntityKey")
    protected Boolean equipmentEntityKey;
    @XmlElement(name = "EquipmentTypeRestriction")
    protected Boolean equipmentTypeRestriction;
    @XmlElementRef(name = "EquipmentTypeRestrictionOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<EquipmentTypeRestrictionPropertyOptions> equipmentTypeRestrictionOptions;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "MaxRoutes")
    protected Boolean maxRoutes;
    @XmlElement(name = "MaxTimeOverride")
    protected Boolean maxTimeOverride;
    @XmlElement(name = "MaxTravelTimeOverride")
    protected Boolean maxTravelTimeOverride;
    @XmlElement(name = "Precedence")
    protected Boolean precedence;
    @XmlElement(name = "PreferredTimeOverride")
    protected Boolean preferredTimeOverride;
    @XmlElement(name = "RouteId")
    protected Boolean routeId;
    @XmlElement(name = "StartTimeOverride")
    protected Boolean startTimeOverride;
    @XmlElement(name = "UseWorkerEquipment")
    protected Boolean useWorkerEquipment;
    @XmlElement(name = "WorkerEntityKey")
    protected Boolean workerEntityKey;

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
     * Obtém o valor da propriedade equipmentEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentEntityKey() {
        return equipmentEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentEntityKey(Boolean value) {
        this.equipmentEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeRestriction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentTypeRestriction() {
        return equipmentTypeRestriction;
    }

    /**
     * Define o valor da propriedade equipmentTypeRestriction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentTypeRestriction(Boolean value) {
        this.equipmentTypeRestriction = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeRestrictionOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EquipmentTypeRestrictionPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<EquipmentTypeRestrictionPropertyOptions> getEquipmentTypeRestrictionOptions() {
        return equipmentTypeRestrictionOptions;
    }

    /**
     * Define o valor da propriedade equipmentTypeRestrictionOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EquipmentTypeRestrictionPropertyOptions }{@code >}
     *     
     */
    public void setEquipmentTypeRestrictionOptions(JAXBElement<EquipmentTypeRestrictionPropertyOptions> value) {
        this.equipmentTypeRestrictionOptions = value;
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
     * Obtém o valor da propriedade isDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Define o valor da propriedade isDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Obtém o valor da propriedade maxRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxRoutes() {
        return maxRoutes;
    }

    /**
     * Define o valor da propriedade maxRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxRoutes(Boolean value) {
        this.maxRoutes = value;
    }

    /**
     * Obtém o valor da propriedade maxTimeOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxTimeOverride() {
        return maxTimeOverride;
    }

    /**
     * Define o valor da propriedade maxTimeOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxTimeOverride(Boolean value) {
        this.maxTimeOverride = value;
    }

    /**
     * Obtém o valor da propriedade maxTravelTimeOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxTravelTimeOverride() {
        return maxTravelTimeOverride;
    }

    /**
     * Define o valor da propriedade maxTravelTimeOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxTravelTimeOverride(Boolean value) {
        this.maxTravelTimeOverride = value;
    }

    /**
     * Obtém o valor da propriedade precedence.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrecedence() {
        return precedence;
    }

    /**
     * Define o valor da propriedade precedence.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrecedence(Boolean value) {
        this.precedence = value;
    }

    /**
     * Obtém o valor da propriedade preferredTimeOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredTimeOverride() {
        return preferredTimeOverride;
    }

    /**
     * Define o valor da propriedade preferredTimeOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredTimeOverride(Boolean value) {
        this.preferredTimeOverride = value;
    }

    /**
     * Obtém o valor da propriedade routeId.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteId() {
        return routeId;
    }

    /**
     * Define o valor da propriedade routeId.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteId(Boolean value) {
        this.routeId = value;
    }

    /**
     * Obtém o valor da propriedade startTimeOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartTimeOverride() {
        return startTimeOverride;
    }

    /**
     * Define o valor da propriedade startTimeOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartTimeOverride(Boolean value) {
        this.startTimeOverride = value;
    }

    /**
     * Obtém o valor da propriedade useWorkerEquipment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseWorkerEquipment() {
        return useWorkerEquipment;
    }

    /**
     * Define o valor da propriedade useWorkerEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseWorkerEquipment(Boolean value) {
        this.useWorkerEquipment = value;
    }

    /**
     * Obtém o valor da propriedade workerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerEntityKey() {
        return workerEntityKey;
    }

    /**
     * Define o valor da propriedade workerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerEntityKey(Boolean value) {
        this.workerEntityKey = value;
    }

}
