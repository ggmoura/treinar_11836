
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de EquipmentTypeCompartmentPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentTypeCompartmentPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CompartmentTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumPercentCapacity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumPercentCapacity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfBulkheads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentTypeCompartmentPropertyOptions", propOrder = {
    "color",
    "compartmentTypeEntityKey",
    "identifier",
    "maximumPercentCapacity",
    "minimumPercentCapacity",
    "numberOfBulkheads"
})
public class EquipmentTypeCompartmentPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "Color")
    protected Boolean color;
    @XmlElement(name = "CompartmentTypeEntityKey")
    protected Boolean compartmentTypeEntityKey;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "MaximumPercentCapacity")
    protected Boolean maximumPercentCapacity;
    @XmlElement(name = "MinimumPercentCapacity")
    protected Boolean minimumPercentCapacity;
    @XmlElement(name = "NumberOfBulkheads")
    protected Boolean numberOfBulkheads;

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
     * Obtém o valor da propriedade compartmentTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompartmentTypeEntityKey() {
        return compartmentTypeEntityKey;
    }

    /**
     * Define o valor da propriedade compartmentTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompartmentTypeEntityKey(Boolean value) {
        this.compartmentTypeEntityKey = value;
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
     * Obtém o valor da propriedade maximumPercentCapacity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPercentCapacity() {
        return maximumPercentCapacity;
    }

    /**
     * Define o valor da propriedade maximumPercentCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPercentCapacity(Boolean value) {
        this.maximumPercentCapacity = value;
    }

    /**
     * Obtém o valor da propriedade minimumPercentCapacity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumPercentCapacity() {
        return minimumPercentCapacity;
    }

    /**
     * Define o valor da propriedade minimumPercentCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumPercentCapacity(Boolean value) {
        this.minimumPercentCapacity = value;
    }

    /**
     * Obtém o valor da propriedade numberOfBulkheads.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumberOfBulkheads() {
        return numberOfBulkheads;
    }

    /**
     * Define o valor da propriedade numberOfBulkheads.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberOfBulkheads(Boolean value) {
        this.numberOfBulkheads = value;
    }

}
