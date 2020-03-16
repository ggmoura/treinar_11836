
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de CompartmentContents complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CompartmentContents"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BulkheadPosition" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeCompartment" type="{http://roadnet.com/apex/DataContracts/}EquipmentTypeCompartment" minOccurs="0"/&gt;
 *         &lt;element name="LineItemCompartmentQuantities" type="{http://roadnet.com/apex/DataContracts/}ArrayOfLineItemCompartmentQuantity" minOccurs="0"/&gt;
 *         &lt;element name="MaxBulkheadPosition" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MaxQuantityLoaded" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompartmentContents", propOrder = {
    "bulkheadPosition",
    "equipmentTypeCompartment",
    "lineItemCompartmentQuantities",
    "maxBulkheadPosition",
    "maxQuantityLoaded",
    "segmentNumber"
})
public class CompartmentContents
    extends DomainEntity
{

    @XmlElement(name = "BulkheadPosition")
    protected Double bulkheadPosition;
    @XmlElementRef(name = "EquipmentTypeCompartment", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<EquipmentTypeCompartment> equipmentTypeCompartment;
    @XmlElementRef(name = "LineItemCompartmentQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLineItemCompartmentQuantity> lineItemCompartmentQuantities;
    @XmlElement(name = "MaxBulkheadPosition")
    protected Double maxBulkheadPosition;
    @XmlElementRef(name = "MaxQuantityLoaded", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> maxQuantityLoaded;
    @XmlElement(name = "SegmentNumber")
    protected Integer segmentNumber;

    /**
     * Obtém o valor da propriedade bulkheadPosition.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBulkheadPosition() {
        return bulkheadPosition;
    }

    /**
     * Define o valor da propriedade bulkheadPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBulkheadPosition(Double value) {
        this.bulkheadPosition = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeCompartment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EquipmentTypeCompartment }{@code >}
     *     
     */
    public JAXBElement<EquipmentTypeCompartment> getEquipmentTypeCompartment() {
        return equipmentTypeCompartment;
    }

    /**
     * Define o valor da propriedade equipmentTypeCompartment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EquipmentTypeCompartment }{@code >}
     *     
     */
    public void setEquipmentTypeCompartment(JAXBElement<EquipmentTypeCompartment> value) {
        this.equipmentTypeCompartment = value;
    }

    /**
     * Obtém o valor da propriedade lineItemCompartmentQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLineItemCompartmentQuantity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLineItemCompartmentQuantity> getLineItemCompartmentQuantities() {
        return lineItemCompartmentQuantities;
    }

    /**
     * Define o valor da propriedade lineItemCompartmentQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLineItemCompartmentQuantity }{@code >}
     *     
     */
    public void setLineItemCompartmentQuantities(JAXBElement<ArrayOfLineItemCompartmentQuantity> value) {
        this.lineItemCompartmentQuantities = value;
    }

    /**
     * Obtém o valor da propriedade maxBulkheadPosition.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxBulkheadPosition() {
        return maxBulkheadPosition;
    }

    /**
     * Define o valor da propriedade maxBulkheadPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxBulkheadPosition(Double value) {
        this.maxBulkheadPosition = value;
    }

    /**
     * Obtém o valor da propriedade maxQuantityLoaded.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getMaxQuantityLoaded() {
        return maxQuantityLoaded;
    }

    /**
     * Define o valor da propriedade maxQuantityLoaded.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setMaxQuantityLoaded(JAXBElement<Quantities> value) {
        this.maxQuantityLoaded = value;
    }

    /**
     * Obtém o valor da propriedade segmentNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmentNumber() {
        return segmentNumber;
    }

    /**
     * Define o valor da propriedade segmentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegmentNumber(Integer value) {
        this.segmentNumber = value;
    }

}
