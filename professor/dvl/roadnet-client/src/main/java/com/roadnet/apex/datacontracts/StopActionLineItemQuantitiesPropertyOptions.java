
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de StopActionLineItemQuantitiesPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StopActionLineItemQuantitiesPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DamagedQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemOptions" type="{http://roadnet.com/apex/DataContracts/}LineItemPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopActionLineItemQuantitiesPropertyOptions", propOrder = {
    "damagedQuantities",
    "lineItem",
    "lineItemOptions",
    "overQuantities",
    "plannedQuantities",
    "quantities",
    "shortQuantities"
})
public class StopActionLineItemQuantitiesPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "DamagedQuantities")
    protected Boolean damagedQuantities;
    @XmlElement(name = "LineItem")
    protected Boolean lineItem;
    @XmlElementRef(name = "LineItemOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LineItemPropertyOptions> lineItemOptions;
    @XmlElement(name = "OverQuantities")
    protected Boolean overQuantities;
    @XmlElement(name = "PlannedQuantities")
    protected Boolean plannedQuantities;
    @XmlElement(name = "Quantities")
    protected Boolean quantities;
    @XmlElement(name = "ShortQuantities")
    protected Boolean shortQuantities;

    /**
     * Obtém o valor da propriedade damagedQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDamagedQuantities() {
        return damagedQuantities;
    }

    /**
     * Define o valor da propriedade damagedQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDamagedQuantities(Boolean value) {
        this.damagedQuantities = value;
    }

    /**
     * Obtém o valor da propriedade lineItem.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLineItem() {
        return lineItem;
    }

    /**
     * Define o valor da propriedade lineItem.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineItem(Boolean value) {
        this.lineItem = value;
    }

    /**
     * Obtém o valor da propriedade lineItemOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LineItemPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<LineItemPropertyOptions> getLineItemOptions() {
        return lineItemOptions;
    }

    /**
     * Define o valor da propriedade lineItemOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LineItemPropertyOptions }{@code >}
     *     
     */
    public void setLineItemOptions(JAXBElement<LineItemPropertyOptions> value) {
        this.lineItemOptions = value;
    }

    /**
     * Obtém o valor da propriedade overQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverQuantities() {
        return overQuantities;
    }

    /**
     * Define o valor da propriedade overQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverQuantities(Boolean value) {
        this.overQuantities = value;
    }

    /**
     * Obtém o valor da propriedade plannedQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedQuantities() {
        return plannedQuantities;
    }

    /**
     * Define o valor da propriedade plannedQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedQuantities(Boolean value) {
        this.plannedQuantities = value;
    }

    /**
     * Obtém o valor da propriedade quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantities() {
        return quantities;
    }

    /**
     * Define o valor da propriedade quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantities(Boolean value) {
        this.quantities = value;
    }

    /**
     * Obtém o valor da propriedade shortQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShortQuantities() {
        return shortQuantities;
    }

    /**
     * Define o valor da propriedade shortQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShortQuantities(Boolean value) {
        this.shortQuantities = value;
    }

}
