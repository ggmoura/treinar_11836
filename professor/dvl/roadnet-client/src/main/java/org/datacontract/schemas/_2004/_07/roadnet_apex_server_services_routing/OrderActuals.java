
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
 * <p>Classe Java de OrderActuals complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderActuals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliveryDamagedQuantities" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryDamagedQuantity" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryOverQuantities" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryOverQuantity" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryQuantities" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryQuantity" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryShortQuantities" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryShortQuantity" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LineItems" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ArrayOfLineItemActuals" minOccurs="0"/&gt;
 *         &lt;element name="PickupDamagedQuantities" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PickupDamagedQuantity" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PickupOverQuantities" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PickupOverQuantity" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PickupQuantities" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PickupQuantity" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PickupShortQuantities" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PickupShortQuantity" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderActuals", propOrder = {
    "deliveryDamagedQuantities",
    "deliveryDamagedQuantity",
    "deliveryOverQuantities",
    "deliveryOverQuantity",
    "deliveryQuantities",
    "deliveryQuantity",
    "deliveryShortQuantities",
    "deliveryShortQuantity",
    "entityKey",
    "lineItems",
    "pickupDamagedQuantities",
    "pickupDamagedQuantity",
    "pickupOverQuantities",
    "pickupOverQuantity",
    "pickupQuantities",
    "pickupQuantity",
    "pickupShortQuantities",
    "pickupShortQuantity"
})
public class OrderActuals
    extends DataTransferObject
{

    @XmlElement(name = "DeliveryDamagedQuantities")
    protected Double deliveryDamagedQuantities;
    @XmlElementRef(name = "DeliveryDamagedQuantity", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> deliveryDamagedQuantity;
    @XmlElement(name = "DeliveryOverQuantities")
    protected Double deliveryOverQuantities;
    @XmlElementRef(name = "DeliveryOverQuantity", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> deliveryOverQuantity;
    @XmlElement(name = "DeliveryQuantities")
    protected Double deliveryQuantities;
    @XmlElementRef(name = "DeliveryQuantity", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> deliveryQuantity;
    @XmlElement(name = "DeliveryShortQuantities")
    protected Double deliveryShortQuantities;
    @XmlElementRef(name = "DeliveryShortQuantity", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> deliveryShortQuantity;
    @XmlElement(name = "EntityKey")
    protected Long entityKey;
    @XmlElementRef(name = "LineItems", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLineItemActuals> lineItems;
    @XmlElement(name = "PickupDamagedQuantities")
    protected Double pickupDamagedQuantities;
    @XmlElementRef(name = "PickupDamagedQuantity", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> pickupDamagedQuantity;
    @XmlElement(name = "PickupOverQuantities")
    protected Double pickupOverQuantities;
    @XmlElementRef(name = "PickupOverQuantity", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> pickupOverQuantity;
    @XmlElement(name = "PickupQuantities")
    protected Double pickupQuantities;
    @XmlElementRef(name = "PickupQuantity", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> pickupQuantity;
    @XmlElement(name = "PickupShortQuantities")
    protected Double pickupShortQuantities;
    @XmlElementRef(name = "PickupShortQuantity", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> pickupShortQuantity;

    /**
     * Obtém o valor da propriedade deliveryDamagedQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeliveryDamagedQuantities() {
        return deliveryDamagedQuantities;
    }

    /**
     * Define o valor da propriedade deliveryDamagedQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeliveryDamagedQuantities(Double value) {
        this.deliveryDamagedQuantities = value;
    }

    /**
     * Obtém o valor da propriedade deliveryDamagedQuantity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getDeliveryDamagedQuantity() {
        return deliveryDamagedQuantity;
    }

    /**
     * Define o valor da propriedade deliveryDamagedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setDeliveryDamagedQuantity(JAXBElement<Quantities> value) {
        this.deliveryDamagedQuantity = value;
    }

    /**
     * Obtém o valor da propriedade deliveryOverQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeliveryOverQuantities() {
        return deliveryOverQuantities;
    }

    /**
     * Define o valor da propriedade deliveryOverQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeliveryOverQuantities(Double value) {
        this.deliveryOverQuantities = value;
    }

    /**
     * Obtém o valor da propriedade deliveryOverQuantity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getDeliveryOverQuantity() {
        return deliveryOverQuantity;
    }

    /**
     * Define o valor da propriedade deliveryOverQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setDeliveryOverQuantity(JAXBElement<Quantities> value) {
        this.deliveryOverQuantity = value;
    }

    /**
     * Obtém o valor da propriedade deliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeliveryQuantities() {
        return deliveryQuantities;
    }

    /**
     * Define o valor da propriedade deliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeliveryQuantities(Double value) {
        this.deliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade deliveryQuantity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getDeliveryQuantity() {
        return deliveryQuantity;
    }

    /**
     * Define o valor da propriedade deliveryQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setDeliveryQuantity(JAXBElement<Quantities> value) {
        this.deliveryQuantity = value;
    }

    /**
     * Obtém o valor da propriedade deliveryShortQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeliveryShortQuantities() {
        return deliveryShortQuantities;
    }

    /**
     * Define o valor da propriedade deliveryShortQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeliveryShortQuantities(Double value) {
        this.deliveryShortQuantities = value;
    }

    /**
     * Obtém o valor da propriedade deliveryShortQuantity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getDeliveryShortQuantity() {
        return deliveryShortQuantity;
    }

    /**
     * Define o valor da propriedade deliveryShortQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setDeliveryShortQuantity(JAXBElement<Quantities> value) {
        this.deliveryShortQuantity = value;
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
     * Obtém o valor da propriedade lineItems.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLineItemActuals }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLineItemActuals> getLineItems() {
        return lineItems;
    }

    /**
     * Define o valor da propriedade lineItems.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLineItemActuals }{@code >}
     *     
     */
    public void setLineItems(JAXBElement<ArrayOfLineItemActuals> value) {
        this.lineItems = value;
    }

    /**
     * Obtém o valor da propriedade pickupDamagedQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPickupDamagedQuantities() {
        return pickupDamagedQuantities;
    }

    /**
     * Define o valor da propriedade pickupDamagedQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPickupDamagedQuantities(Double value) {
        this.pickupDamagedQuantities = value;
    }

    /**
     * Obtém o valor da propriedade pickupDamagedQuantity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPickupDamagedQuantity() {
        return pickupDamagedQuantity;
    }

    /**
     * Define o valor da propriedade pickupDamagedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPickupDamagedQuantity(JAXBElement<Quantities> value) {
        this.pickupDamagedQuantity = value;
    }

    /**
     * Obtém o valor da propriedade pickupOverQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPickupOverQuantities() {
        return pickupOverQuantities;
    }

    /**
     * Define o valor da propriedade pickupOverQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPickupOverQuantities(Double value) {
        this.pickupOverQuantities = value;
    }

    /**
     * Obtém o valor da propriedade pickupOverQuantity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPickupOverQuantity() {
        return pickupOverQuantity;
    }

    /**
     * Define o valor da propriedade pickupOverQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPickupOverQuantity(JAXBElement<Quantities> value) {
        this.pickupOverQuantity = value;
    }

    /**
     * Obtém o valor da propriedade pickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPickupQuantities() {
        return pickupQuantities;
    }

    /**
     * Define o valor da propriedade pickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPickupQuantities(Double value) {
        this.pickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade pickupQuantity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPickupQuantity() {
        return pickupQuantity;
    }

    /**
     * Define o valor da propriedade pickupQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPickupQuantity(JAXBElement<Quantities> value) {
        this.pickupQuantity = value;
    }

    /**
     * Obtém o valor da propriedade pickupShortQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPickupShortQuantities() {
        return pickupShortQuantities;
    }

    /**
     * Define o valor da propriedade pickupShortQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPickupShortQuantities(Double value) {
        this.pickupShortQuantities = value;
    }

    /**
     * Obtém o valor da propriedade pickupShortQuantity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPickupShortQuantity() {
        return pickupShortQuantity;
    }

    /**
     * Define o valor da propriedade pickupShortQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPickupShortQuantity(JAXBElement<Quantities> value) {
        this.pickupShortQuantity = value;
    }

}
