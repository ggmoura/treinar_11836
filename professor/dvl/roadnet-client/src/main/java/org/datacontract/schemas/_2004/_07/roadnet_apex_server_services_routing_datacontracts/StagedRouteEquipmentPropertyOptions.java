
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de StagedRouteEquipmentPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StagedRouteEquipmentPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CapacitySpecified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentCreatedInRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeCreatedInRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PowerUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceInstalled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StagedRouteEquipmentPropertyOptions", propOrder = {
    "capacitySpecified",
    "equipmentCreatedInRegionIdentifier",
    "equipmentDescription",
    "equipmentIdentifier",
    "equipmentTypeCreatedInRegionIdentifier",
    "equipmentTypeDescription",
    "equipmentTypeIdentifier",
    "powerUnit",
    "telematicsDeviceInstalled"
})
public class StagedRouteEquipmentPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "CapacitySpecified")
    protected Boolean capacitySpecified;
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
    @XmlElement(name = "PowerUnit")
    protected Boolean powerUnit;
    @XmlElement(name = "TelematicsDeviceInstalled")
    protected Boolean telematicsDeviceInstalled;

    /**
     * Obtém o valor da propriedade capacitySpecified.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCapacitySpecified() {
        return capacitySpecified;
    }

    /**
     * Define o valor da propriedade capacitySpecified.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCapacitySpecified(Boolean value) {
        this.capacitySpecified = value;
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
     * Obtém o valor da propriedade powerUnit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPowerUnit() {
        return powerUnit;
    }

    /**
     * Define o valor da propriedade powerUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPowerUnit(Boolean value) {
        this.powerUnit = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceInstalled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelematicsDeviceInstalled() {
        return telematicsDeviceInstalled;
    }

    /**
     * Define o valor da propriedade telematicsDeviceInstalled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelematicsDeviceInstalled(Boolean value) {
        this.telematicsDeviceInstalled = value;
    }

}
