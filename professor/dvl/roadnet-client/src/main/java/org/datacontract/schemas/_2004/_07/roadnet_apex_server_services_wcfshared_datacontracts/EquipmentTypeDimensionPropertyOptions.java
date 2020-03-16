
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de EquipmentTypeDimensionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentTypeDimensionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreatedInRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentClass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentClassOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}EquipmentClassDimensionPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentTypeDimensionPropertyOptions", propOrder = {
    "createdInRegionIdentifier",
    "description",
    "equipmentClass",
    "equipmentClassOptions",
    "equipmentTypeIdentifier"
})
public class EquipmentTypeDimensionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "CreatedInRegionIdentifier")
    protected Boolean createdInRegionIdentifier;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "EquipmentClass")
    protected Boolean equipmentClass;
    @XmlElementRef(name = "EquipmentClassOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<EquipmentClassDimensionPropertyOptions> equipmentClassOptions;
    @XmlElement(name = "EquipmentTypeIdentifier")
    protected Boolean equipmentTypeIdentifier;

    /**
     * Obtém o valor da propriedade createdInRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreatedInRegionIdentifier() {
        return createdInRegionIdentifier;
    }

    /**
     * Define o valor da propriedade createdInRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreatedInRegionIdentifier(Boolean value) {
        this.createdInRegionIdentifier = value;
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
     * Obtém o valor da propriedade equipmentClass.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentClass() {
        return equipmentClass;
    }

    /**
     * Define o valor da propriedade equipmentClass.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentClass(Boolean value) {
        this.equipmentClass = value;
    }

    /**
     * Obtém o valor da propriedade equipmentClassOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EquipmentClassDimensionPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<EquipmentClassDimensionPropertyOptions> getEquipmentClassOptions() {
        return equipmentClassOptions;
    }

    /**
     * Define o valor da propriedade equipmentClassOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EquipmentClassDimensionPropertyOptions }{@code >}
     *     
     */
    public void setEquipmentClassOptions(JAXBElement<EquipmentClassDimensionPropertyOptions> value) {
        this.equipmentClassOptions = value;
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

}
