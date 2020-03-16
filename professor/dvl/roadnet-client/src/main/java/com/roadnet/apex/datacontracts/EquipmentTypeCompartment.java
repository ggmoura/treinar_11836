
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de EquipmentTypeCompartment complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentTypeCompartment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Color" type="{http://roadnet.com/apex/DataContracts/}Color" minOccurs="0"/&gt;
 *         &lt;element name="CompartmentTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaximumPercentCapacity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MinimumPercentCapacity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfBulkheads" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentTypeCompartment", propOrder = {
    "color",
    "compartmentTypeEntityKey",
    "identifier",
    "maximumPercentCapacity",
    "minimumPercentCapacity",
    "numberOfBulkheads"
})
public class EquipmentTypeCompartment
    extends DomainEntity
{

    @XmlElementRef(name = "Color", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Color> color;
    @XmlElement(name = "CompartmentTypeEntityKey")
    protected Long compartmentTypeEntityKey;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "MaximumPercentCapacity")
    protected Double maximumPercentCapacity;
    @XmlElement(name = "MinimumPercentCapacity")
    protected Double minimumPercentCapacity;
    @XmlElement(name = "NumberOfBulkheads")
    protected Integer numberOfBulkheads;

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
     * Obtém o valor da propriedade compartmentTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompartmentTypeEntityKey() {
        return compartmentTypeEntityKey;
    }

    /**
     * Define o valor da propriedade compartmentTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompartmentTypeEntityKey(Long value) {
        this.compartmentTypeEntityKey = value;
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
     * Obtém o valor da propriedade maximumPercentCapacity.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumPercentCapacity() {
        return maximumPercentCapacity;
    }

    /**
     * Define o valor da propriedade maximumPercentCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumPercentCapacity(Double value) {
        this.maximumPercentCapacity = value;
    }

    /**
     * Obtém o valor da propriedade minimumPercentCapacity.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumPercentCapacity() {
        return minimumPercentCapacity;
    }

    /**
     * Define o valor da propriedade minimumPercentCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumPercentCapacity(Double value) {
        this.minimumPercentCapacity = value;
    }

    /**
     * Obtém o valor da propriedade numberOfBulkheads.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfBulkheads() {
        return numberOfBulkheads;
    }

    /**
     * Define o valor da propriedade numberOfBulkheads.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfBulkheads(Integer value) {
        this.numberOfBulkheads = value;
    }

}
