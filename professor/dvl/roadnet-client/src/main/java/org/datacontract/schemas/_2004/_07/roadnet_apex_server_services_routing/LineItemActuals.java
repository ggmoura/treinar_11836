
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.Quantities;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de LineItemActuals complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LineItemActuals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DamagedQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="DamagedQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemActuals", propOrder = {
    "damagedQuantities",
    "damagedQuantity",
    "entityKey",
    "overQuantities",
    "overQuantity",
    "quantities",
    "quantity",
    "shortQuantities",
    "shortQuantity"
})
public class LineItemActuals
    extends DataTransferObject
{

    @XmlElementRef(name = "DamagedQuantities", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> damagedQuantities;
    @XmlElement(name = "DamagedQuantity")
    protected Double damagedQuantity;
    @XmlElement(name = "EntityKey")
    protected Long entityKey;
    @XmlElementRef(name = "OverQuantities", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> overQuantities;
    @XmlElement(name = "OverQuantity")
    protected Double overQuantity;
    @XmlElementRef(name = "Quantities", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> quantities;
    @XmlElement(name = "Quantity")
    protected Double quantity;
    @XmlElementRef(name = "ShortQuantities", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> shortQuantities;
    @XmlElement(name = "ShortQuantity")
    protected Double shortQuantity;

    /**
     * Obtém o valor da propriedade damagedQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getDamagedQuantities() {
        return damagedQuantities;
    }

    /**
     * Define o valor da propriedade damagedQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setDamagedQuantities(JAXBElement<Quantities> value) {
        this.damagedQuantities = value;
    }

    /**
     * Obtém o valor da propriedade damagedQuantity.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDamagedQuantity() {
        return damagedQuantity;
    }

    /**
     * Define o valor da propriedade damagedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDamagedQuantity(Double value) {
        this.damagedQuantity = value;
    }

    /**
     * Obtém o valor da propriedade entityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntityKey() {
        return entityKey;
    }

    /**
     * Define o valor da propriedade entityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntityKey(Long value) {
        this.entityKey = value;
    }

    /**
     * Obtém o valor da propriedade overQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getOverQuantities() {
        return overQuantities;
    }

    /**
     * Define o valor da propriedade overQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setOverQuantities(JAXBElement<Quantities> value) {
        this.overQuantities = value;
    }

    /**
     * Obtém o valor da propriedade overQuantity.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverQuantity() {
        return overQuantity;
    }

    /**
     * Define o valor da propriedade overQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverQuantity(Double value) {
        this.overQuantity = value;
    }

    /**
     * Obtém o valor da propriedade quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getQuantities() {
        return quantities;
    }

    /**
     * Define o valor da propriedade quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setQuantities(JAXBElement<Quantities> value) {
        this.quantities = value;
    }

    /**
     * Obtém o valor da propriedade quantity.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * Define o valor da propriedade quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity(Double value) {
        this.quantity = value;
    }

    /**
     * Obtém o valor da propriedade shortQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getShortQuantities() {
        return shortQuantities;
    }

    /**
     * Define o valor da propriedade shortQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setShortQuantities(JAXBElement<Quantities> value) {
        this.shortQuantities = value;
    }

    /**
     * Obtém o valor da propriedade shortQuantity.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShortQuantity() {
        return shortQuantity;
    }

    /**
     * Define o valor da propriedade shortQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShortQuantity(Double value) {
        this.shortQuantity = value;
    }

}
