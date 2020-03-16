
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de LayoverLocation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LayoverLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}Location"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalFixedTravelTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="Color" type="{http://roadnet.com/apex/DataContracts/}Color" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeRestriction" type="{http://roadnet.com/apex/DataContracts/}EquipmentTypeRestriction" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseTimes" type="{http://roadnet.com/apex/DataContracts/}ArrayOfLayoverLocationOpenCloseDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayoverLocation", propOrder = {
    "additionalFixedTravelTime",
    "color",
    "equipmentTypeRestriction",
    "openCloseTimes"
})
public class LayoverLocation
    extends Location
{

    @XmlElement(name = "AdditionalFixedTravelTime")
    protected Duration additionalFixedTravelTime;
    @XmlElementRef(name = "Color", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Color> color;
    @XmlElementRef(name = "EquipmentTypeRestriction", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<EquipmentTypeRestriction> equipmentTypeRestriction;
    @XmlElementRef(name = "OpenCloseTimes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLayoverLocationOpenCloseDetail> openCloseTimes;

    /**
     * Obtém o valor da propriedade additionalFixedTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAdditionalFixedTravelTime() {
        return additionalFixedTravelTime;
    }

    /**
     * Define o valor da propriedade additionalFixedTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAdditionalFixedTravelTime(Duration value) {
        this.additionalFixedTravelTime = value;
    }

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
     * Obtém o valor da propriedade equipmentTypeRestriction.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EquipmentTypeRestriction }{@code >}
     *     
     */
    public JAXBElement<EquipmentTypeRestriction> getEquipmentTypeRestriction() {
        return equipmentTypeRestriction;
    }

    /**
     * Define o valor da propriedade equipmentTypeRestriction.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EquipmentTypeRestriction }{@code >}
     *     
     */
    public void setEquipmentTypeRestriction(JAXBElement<EquipmentTypeRestriction> value) {
        this.equipmentTypeRestriction = value;
    }

    /**
     * Obtém o valor da propriedade openCloseTimes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLayoverLocationOpenCloseDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLayoverLocationOpenCloseDetail> getOpenCloseTimes() {
        return openCloseTimes;
    }

    /**
     * Define o valor da propriedade openCloseTimes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLayoverLocationOpenCloseDetail }{@code >}
     *     
     */
    public void setOpenCloseTimes(JAXBElement<ArrayOfLayoverLocationOpenCloseDetail> value) {
        this.openCloseTimes = value;
    }

}
