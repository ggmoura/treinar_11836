
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DeliveryDetailsUpdateAction.OrderDetailItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DeliveryDetailsUpdateAction.OrderDetailItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}DetailItem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliveryQuantities" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}DeliveryDetailsUpdateAction.DetailItemQuantities" minOccurs="0"/&gt;
 *         &lt;element name="PickupQuantities" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}DeliveryDetailsUpdateAction.DetailItemQuantities" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryDetailsUpdateAction.OrderDetailItem", propOrder = {
    "deliveryQuantities",
    "pickupQuantities"
})
public class DeliveryDetailsUpdateActionOrderDetailItem
    extends DetailItem
{

    @XmlElementRef(name = "DeliveryQuantities", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<DeliveryDetailsUpdateActionDetailItemQuantities> deliveryQuantities;
    @XmlElementRef(name = "PickupQuantities", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<DeliveryDetailsUpdateActionDetailItemQuantities> pickupQuantities;

    /**
     * Obtém o valor da propriedade deliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeliveryDetailsUpdateActionDetailItemQuantities }{@code >}
     *     
     */
    public JAXBElement<DeliveryDetailsUpdateActionDetailItemQuantities> getDeliveryQuantities() {
        return deliveryQuantities;
    }

    /**
     * Define o valor da propriedade deliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeliveryDetailsUpdateActionDetailItemQuantities }{@code >}
     *     
     */
    public void setDeliveryQuantities(JAXBElement<DeliveryDetailsUpdateActionDetailItemQuantities> value) {
        this.deliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade pickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeliveryDetailsUpdateActionDetailItemQuantities }{@code >}
     *     
     */
    public JAXBElement<DeliveryDetailsUpdateActionDetailItemQuantities> getPickupQuantities() {
        return pickupQuantities;
    }

    /**
     * Define o valor da propriedade pickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeliveryDetailsUpdateActionDetailItemQuantities }{@code >}
     *     
     */
    public void setPickupQuantities(JAXBElement<DeliveryDetailsUpdateActionDetailItemQuantities> value) {
        this.pickupQuantities = value;
    }

}
