
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.AggregateRootEntity;


/**
 * <p>Classe Java de DataWarehouseEquipmentDimension complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseEquipmentDimension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreatedInRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentManufacturer" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseEquipmentManufacturerDimension" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentType" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseEquipmentTypeDimension" minOccurs="0"/&gt;
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModelYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseEquipmentDimension", propOrder = {
    "createdInRegionIdentifier",
    "description",
    "equipmentIdentifier",
    "equipmentManufacturer",
    "equipmentType",
    "model",
    "modelYear"
})
public class DataWarehouseEquipmentDimension
    extends AggregateRootEntity
{

    @XmlElementRef(name = "CreatedInRegionIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdInRegionIdentifier;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "EquipmentIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentIdentifier;
    @XmlElementRef(name = "EquipmentManufacturer", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<DataWarehouseEquipmentManufacturerDimension> equipmentManufacturer;
    @XmlElementRef(name = "EquipmentType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<DataWarehouseEquipmentTypeDimension> equipmentType;
    @XmlElementRef(name = "Model", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> model;
    @XmlElementRef(name = "ModelYear", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modelYear;

    /**
     * Obtém o valor da propriedade createdInRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedInRegionIdentifier() {
        return createdInRegionIdentifier;
    }

    /**
     * Define o valor da propriedade createdInRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedInRegionIdentifier(JAXBElement<String> value) {
        this.createdInRegionIdentifier = value;
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
     * Obtém o valor da propriedade equipmentIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentIdentifier() {
        return equipmentIdentifier;
    }

    /**
     * Define o valor da propriedade equipmentIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentIdentifier(JAXBElement<String> value) {
        this.equipmentIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade equipmentManufacturer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseEquipmentManufacturerDimension }{@code >}
     *     
     */
    public JAXBElement<DataWarehouseEquipmentManufacturerDimension> getEquipmentManufacturer() {
        return equipmentManufacturer;
    }

    /**
     * Define o valor da propriedade equipmentManufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseEquipmentManufacturerDimension }{@code >}
     *     
     */
    public void setEquipmentManufacturer(JAXBElement<DataWarehouseEquipmentManufacturerDimension> value) {
        this.equipmentManufacturer = value;
    }

    /**
     * Obtém o valor da propriedade equipmentType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseEquipmentTypeDimension }{@code >}
     *     
     */
    public JAXBElement<DataWarehouseEquipmentTypeDimension> getEquipmentType() {
        return equipmentType;
    }

    /**
     * Define o valor da propriedade equipmentType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseEquipmentTypeDimension }{@code >}
     *     
     */
    public void setEquipmentType(JAXBElement<DataWarehouseEquipmentTypeDimension> value) {
        this.equipmentType = value;
    }

    /**
     * Obtém o valor da propriedade model.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModel() {
        return model;
    }

    /**
     * Define o valor da propriedade model.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModel(JAXBElement<String> value) {
        this.model = value;
    }

    /**
     * Obtém o valor da propriedade modelYear.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModelYear() {
        return modelYear;
    }

    /**
     * Define o valor da propriedade modelYear.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModelYear(JAXBElement<String> value) {
        this.modelYear = value;
    }

}
