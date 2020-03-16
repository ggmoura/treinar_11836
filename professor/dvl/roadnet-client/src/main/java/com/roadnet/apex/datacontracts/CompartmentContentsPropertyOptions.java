
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de CompartmentContentsPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CompartmentContentsPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BulkheadPosition" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeCompartment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeCompartmentOptions" type="{http://roadnet.com/apex/DataContracts/}EquipmentTypeCompartmentPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="LineItemCompartmentQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxBulkheadPosition" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxQuantityLoaded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SegmentNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompartmentContentsPropertyOptions", propOrder = {
    "bulkheadPosition",
    "equipmentTypeCompartment",
    "equipmentTypeCompartmentOptions",
    "lineItemCompartmentQuantities",
    "maxBulkheadPosition",
    "maxQuantityLoaded",
    "segmentNumber"
})
public class CompartmentContentsPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "BulkheadPosition")
    protected Boolean bulkheadPosition;
    @XmlElement(name = "EquipmentTypeCompartment")
    protected Boolean equipmentTypeCompartment;
    @XmlElementRef(name = "EquipmentTypeCompartmentOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<EquipmentTypeCompartmentPropertyOptions> equipmentTypeCompartmentOptions;
    @XmlElement(name = "LineItemCompartmentQuantities")
    protected Boolean lineItemCompartmentQuantities;
    @XmlElement(name = "MaxBulkheadPosition")
    protected Boolean maxBulkheadPosition;
    @XmlElement(name = "MaxQuantityLoaded")
    protected Boolean maxQuantityLoaded;
    @XmlElement(name = "SegmentNumber")
    protected Boolean segmentNumber;

    /**
     * Obtém o valor da propriedade bulkheadPosition.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBulkheadPosition() {
        return bulkheadPosition;
    }

    /**
     * Define o valor da propriedade bulkheadPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBulkheadPosition(Boolean value) {
        this.bulkheadPosition = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeCompartment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentTypeCompartment() {
        return equipmentTypeCompartment;
    }

    /**
     * Define o valor da propriedade equipmentTypeCompartment.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentTypeCompartment(Boolean value) {
        this.equipmentTypeCompartment = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeCompartmentOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EquipmentTypeCompartmentPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<EquipmentTypeCompartmentPropertyOptions> getEquipmentTypeCompartmentOptions() {
        return equipmentTypeCompartmentOptions;
    }

    /**
     * Define o valor da propriedade equipmentTypeCompartmentOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EquipmentTypeCompartmentPropertyOptions }{@code >}
     *     
     */
    public void setEquipmentTypeCompartmentOptions(JAXBElement<EquipmentTypeCompartmentPropertyOptions> value) {
        this.equipmentTypeCompartmentOptions = value;
    }

    /**
     * Obtém o valor da propriedade lineItemCompartmentQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLineItemCompartmentQuantities() {
        return lineItemCompartmentQuantities;
    }

    /**
     * Define o valor da propriedade lineItemCompartmentQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineItemCompartmentQuantities(Boolean value) {
        this.lineItemCompartmentQuantities = value;
    }

    /**
     * Obtém o valor da propriedade maxBulkheadPosition.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxBulkheadPosition() {
        return maxBulkheadPosition;
    }

    /**
     * Define o valor da propriedade maxBulkheadPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxBulkheadPosition(Boolean value) {
        this.maxBulkheadPosition = value;
    }

    /**
     * Obtém o valor da propriedade maxQuantityLoaded.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxQuantityLoaded() {
        return maxQuantityLoaded;
    }

    /**
     * Define o valor da propriedade maxQuantityLoaded.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxQuantityLoaded(Boolean value) {
        this.maxQuantityLoaded = value;
    }

    /**
     * Obtém o valor da propriedade segmentNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSegmentNumber() {
        return segmentNumber;
    }

    /**
     * Define o valor da propriedade segmentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSegmentNumber(Boolean value) {
        this.segmentNumber = value;
    }

}
