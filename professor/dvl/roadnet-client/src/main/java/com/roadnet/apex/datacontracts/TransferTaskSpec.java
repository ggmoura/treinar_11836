
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de TransferTaskSpec complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TransferTaskSpec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}TaskSpec"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliveryAdditionalServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryCoordinateOverride" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryOpenCloseOverrides" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTaskOpenCloseOverrideDetail" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryServiceWindowOverrides" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTaskServiceWindowOverrideDetail" minOccurs="0"/&gt;
 *         &lt;element name="IncreaseQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="PickupAdditionalServiceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PickupCoordinateOverride" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="PickupLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PickupOpenCloseOverrides" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTaskOpenCloseOverrideDetail" minOccurs="0"/&gt;
 *         &lt;element name="PickupServiceWindowOverrides" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTaskServiceWindowOverrideDetail" minOccurs="0"/&gt;
 *         &lt;element name="Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="RequiredDestinationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RequiredOriginEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferTaskSpec", propOrder = {
    "deliveryAdditionalServiceTime",
    "deliveryCoordinateOverride",
    "deliveryLocationEntityKey",
    "deliveryOpenCloseOverrides",
    "deliveryServiceWindowOverrides",
    "increaseQuantities",
    "pickupAdditionalServiceTime",
    "pickupCoordinateOverride",
    "pickupLocationEntityKey",
    "pickupOpenCloseOverrides",
    "pickupServiceWindowOverrides",
    "quantities",
    "requiredDestinationEntityKey",
    "requiredOriginEntityKey"
})
public class TransferTaskSpec
    extends TaskSpec
{

    @XmlElement(name = "DeliveryAdditionalServiceTime")
    protected Duration deliveryAdditionalServiceTime;
    @XmlElementRef(name = "DeliveryCoordinateOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> deliveryCoordinateOverride;
    @XmlElement(name = "DeliveryLocationEntityKey")
    protected Long deliveryLocationEntityKey;
    @XmlElementRef(name = "DeliveryOpenCloseOverrides", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTaskOpenCloseOverrideDetail> deliveryOpenCloseOverrides;
    @XmlElementRef(name = "DeliveryServiceWindowOverrides", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTaskServiceWindowOverrideDetail> deliveryServiceWindowOverrides;
    @XmlElementRef(name = "IncreaseQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> increaseQuantities;
    @XmlElement(name = "PickupAdditionalServiceTime")
    protected Duration pickupAdditionalServiceTime;
    @XmlElementRef(name = "PickupCoordinateOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> pickupCoordinateOverride;
    @XmlElement(name = "PickupLocationEntityKey")
    protected Long pickupLocationEntityKey;
    @XmlElementRef(name = "PickupOpenCloseOverrides", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTaskOpenCloseOverrideDetail> pickupOpenCloseOverrides;
    @XmlElementRef(name = "PickupServiceWindowOverrides", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTaskServiceWindowOverrideDetail> pickupServiceWindowOverrides;
    @XmlElementRef(name = "Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> quantities;
    @XmlElementRef(name = "RequiredDestinationEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> requiredDestinationEntityKey;
    @XmlElementRef(name = "RequiredOriginEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> requiredOriginEntityKey;

    /**
     * Obtém o valor da propriedade deliveryAdditionalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDeliveryAdditionalServiceTime() {
        return deliveryAdditionalServiceTime;
    }

    /**
     * Define o valor da propriedade deliveryAdditionalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDeliveryAdditionalServiceTime(Duration value) {
        this.deliveryAdditionalServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade deliveryCoordinateOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getDeliveryCoordinateOverride() {
        return deliveryCoordinateOverride;
    }

    /**
     * Define o valor da propriedade deliveryCoordinateOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setDeliveryCoordinateOverride(JAXBElement<Coordinate> value) {
        this.deliveryCoordinateOverride = value;
    }

    /**
     * Obtém o valor da propriedade deliveryLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeliveryLocationEntityKey() {
        return deliveryLocationEntityKey;
    }

    /**
     * Define o valor da propriedade deliveryLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeliveryLocationEntityKey(Long value) {
        this.deliveryLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade deliveryOpenCloseOverrides.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaskOpenCloseOverrideDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTaskOpenCloseOverrideDetail> getDeliveryOpenCloseOverrides() {
        return deliveryOpenCloseOverrides;
    }

    /**
     * Define o valor da propriedade deliveryOpenCloseOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaskOpenCloseOverrideDetail }{@code >}
     *     
     */
    public void setDeliveryOpenCloseOverrides(JAXBElement<ArrayOfTaskOpenCloseOverrideDetail> value) {
        this.deliveryOpenCloseOverrides = value;
    }

    /**
     * Obtém o valor da propriedade deliveryServiceWindowOverrides.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaskServiceWindowOverrideDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTaskServiceWindowOverrideDetail> getDeliveryServiceWindowOverrides() {
        return deliveryServiceWindowOverrides;
    }

    /**
     * Define o valor da propriedade deliveryServiceWindowOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaskServiceWindowOverrideDetail }{@code >}
     *     
     */
    public void setDeliveryServiceWindowOverrides(JAXBElement<ArrayOfTaskServiceWindowOverrideDetail> value) {
        this.deliveryServiceWindowOverrides = value;
    }

    /**
     * Obtém o valor da propriedade increaseQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getIncreaseQuantities() {
        return increaseQuantities;
    }

    /**
     * Define o valor da propriedade increaseQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setIncreaseQuantities(JAXBElement<Quantities> value) {
        this.increaseQuantities = value;
    }

    /**
     * Obtém o valor da propriedade pickupAdditionalServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPickupAdditionalServiceTime() {
        return pickupAdditionalServiceTime;
    }

    /**
     * Define o valor da propriedade pickupAdditionalServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPickupAdditionalServiceTime(Duration value) {
        this.pickupAdditionalServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade pickupCoordinateOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getPickupCoordinateOverride() {
        return pickupCoordinateOverride;
    }

    /**
     * Define o valor da propriedade pickupCoordinateOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setPickupCoordinateOverride(JAXBElement<Coordinate> value) {
        this.pickupCoordinateOverride = value;
    }

    /**
     * Obtém o valor da propriedade pickupLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPickupLocationEntityKey() {
        return pickupLocationEntityKey;
    }

    /**
     * Define o valor da propriedade pickupLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPickupLocationEntityKey(Long value) {
        this.pickupLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade pickupOpenCloseOverrides.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaskOpenCloseOverrideDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTaskOpenCloseOverrideDetail> getPickupOpenCloseOverrides() {
        return pickupOpenCloseOverrides;
    }

    /**
     * Define o valor da propriedade pickupOpenCloseOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaskOpenCloseOverrideDetail }{@code >}
     *     
     */
    public void setPickupOpenCloseOverrides(JAXBElement<ArrayOfTaskOpenCloseOverrideDetail> value) {
        this.pickupOpenCloseOverrides = value;
    }

    /**
     * Obtém o valor da propriedade pickupServiceWindowOverrides.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaskServiceWindowOverrideDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTaskServiceWindowOverrideDetail> getPickupServiceWindowOverrides() {
        return pickupServiceWindowOverrides;
    }

    /**
     * Define o valor da propriedade pickupServiceWindowOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaskServiceWindowOverrideDetail }{@code >}
     *     
     */
    public void setPickupServiceWindowOverrides(JAXBElement<ArrayOfTaskServiceWindowOverrideDetail> value) {
        this.pickupServiceWindowOverrides = value;
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
     * Obtém o valor da propriedade requiredDestinationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRequiredDestinationEntityKey() {
        return requiredDestinationEntityKey;
    }

    /**
     * Define o valor da propriedade requiredDestinationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRequiredDestinationEntityKey(JAXBElement<Long> value) {
        this.requiredDestinationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade requiredOriginEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRequiredOriginEntityKey() {
        return requiredOriginEntityKey;
    }

    /**
     * Define o valor da propriedade requiredOriginEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRequiredOriginEntityKey(JAXBElement<Long> value) {
        this.requiredOriginEntityKey = value;
    }

}
