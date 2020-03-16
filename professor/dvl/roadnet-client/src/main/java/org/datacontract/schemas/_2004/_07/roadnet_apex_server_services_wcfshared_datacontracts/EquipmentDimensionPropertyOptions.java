
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de EquipmentDimensionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentDimensionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreatedInRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentManufacturer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentManufacturerOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}EquipmentManufacturerDimensionPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}EquipmentTypeDimensionPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ModelYear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentDimensionPropertyOptions", propOrder = {
    "createdInRegionIdentifier",
    "description",
    "equipmentIdentifier",
    "equipmentManufacturer",
    "equipmentManufacturerOptions",
    "equipmentType",
    "equipmentTypeOptions",
    "model",
    "modelYear"
})
public class EquipmentDimensionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "CreatedInRegionIdentifier")
    protected Boolean createdInRegionIdentifier;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "EquipmentIdentifier")
    protected Boolean equipmentIdentifier;
    @XmlElement(name = "EquipmentManufacturer")
    protected Boolean equipmentManufacturer;
    @XmlElementRef(name = "EquipmentManufacturerOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<EquipmentManufacturerDimensionPropertyOptions> equipmentManufacturerOptions;
    @XmlElement(name = "EquipmentType")
    protected Boolean equipmentType;
    @XmlElementRef(name = "EquipmentTypeOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<EquipmentTypeDimensionPropertyOptions> equipmentTypeOptions;
    @XmlElement(name = "Model")
    protected Boolean model;
    @XmlElement(name = "ModelYear")
    protected Boolean modelYear;

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
     * Obtém o valor da propriedade equipmentManufacturer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentManufacturer() {
        return equipmentManufacturer;
    }

    /**
     * Define o valor da propriedade equipmentManufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentManufacturer(Boolean value) {
        this.equipmentManufacturer = value;
    }

    /**
     * Obtém o valor da propriedade equipmentManufacturerOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EquipmentManufacturerDimensionPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<EquipmentManufacturerDimensionPropertyOptions> getEquipmentManufacturerOptions() {
        return equipmentManufacturerOptions;
    }

    /**
     * Define o valor da propriedade equipmentManufacturerOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EquipmentManufacturerDimensionPropertyOptions }{@code >}
     *     
     */
    public void setEquipmentManufacturerOptions(JAXBElement<EquipmentManufacturerDimensionPropertyOptions> value) {
        this.equipmentManufacturerOptions = value;
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
     * Obtém o valor da propriedade equipmentTypeOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EquipmentTypeDimensionPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<EquipmentTypeDimensionPropertyOptions> getEquipmentTypeOptions() {
        return equipmentTypeOptions;
    }

    /**
     * Define o valor da propriedade equipmentTypeOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EquipmentTypeDimensionPropertyOptions }{@code >}
     *     
     */
    public void setEquipmentTypeOptions(JAXBElement<EquipmentTypeDimensionPropertyOptions> value) {
        this.equipmentTypeOptions = value;
    }

    /**
     * Obtém o valor da propriedade model.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModel() {
        return model;
    }

    /**
     * Define o valor da propriedade model.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModel(Boolean value) {
        this.model = value;
    }

    /**
     * Obtém o valor da propriedade modelYear.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModelYear() {
        return modelYear;
    }

    /**
     * Define o valor da propriedade modelYear.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModelYear(Boolean value) {
        this.modelYear = value;
    }

}
