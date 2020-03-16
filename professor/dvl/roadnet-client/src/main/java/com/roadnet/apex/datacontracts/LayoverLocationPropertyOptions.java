
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LayoverLocationPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LayoverLocationPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}LocationPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalFixedTravelTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeRestriction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeRestrictionOptions" type="{http://roadnet.com/apex/DataContracts/}EquipmentTypeRestrictionPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseTimes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseTimesOptions" type="{http://roadnet.com/apex/DataContracts/}OpenCloseDetailPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayoverLocationPropertyOptions", propOrder = {
    "additionalFixedTravelTime",
    "color",
    "equipmentTypeRestriction",
    "equipmentTypeRestrictionOptions",
    "openCloseTimes",
    "openCloseTimesOptions"
})
public class LayoverLocationPropertyOptions
    extends LocationPropertyOptions
{

    @XmlElement(name = "AdditionalFixedTravelTime")
    protected Boolean additionalFixedTravelTime;
    @XmlElement(name = "Color")
    protected Boolean color;
    @XmlElement(name = "EquipmentTypeRestriction")
    protected Boolean equipmentTypeRestriction;
    @XmlElementRef(name = "EquipmentTypeRestrictionOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<EquipmentTypeRestrictionPropertyOptions> equipmentTypeRestrictionOptions;
    @XmlElement(name = "OpenCloseTimes")
    protected Boolean openCloseTimes;
    @XmlElementRef(name = "OpenCloseTimesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenCloseDetailPropertyOptions> openCloseTimesOptions;

    /**
     * Obtém o valor da propriedade additionalFixedTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalFixedTravelTime() {
        return additionalFixedTravelTime;
    }

    /**
     * Define o valor da propriedade additionalFixedTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalFixedTravelTime(Boolean value) {
        this.additionalFixedTravelTime = value;
    }

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
     * Obtém o valor da propriedade equipmentTypeRestriction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentTypeRestriction() {
        return equipmentTypeRestriction;
    }

    /**
     * Define o valor da propriedade equipmentTypeRestriction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentTypeRestriction(Boolean value) {
        this.equipmentTypeRestriction = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeRestrictionOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EquipmentTypeRestrictionPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<EquipmentTypeRestrictionPropertyOptions> getEquipmentTypeRestrictionOptions() {
        return equipmentTypeRestrictionOptions;
    }

    /**
     * Define o valor da propriedade equipmentTypeRestrictionOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EquipmentTypeRestrictionPropertyOptions }{@code >}
     *     
     */
    public void setEquipmentTypeRestrictionOptions(JAXBElement<EquipmentTypeRestrictionPropertyOptions> value) {
        this.equipmentTypeRestrictionOptions = value;
    }

    /**
     * Obtém o valor da propriedade openCloseTimes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenCloseTimes() {
        return openCloseTimes;
    }

    /**
     * Define o valor da propriedade openCloseTimes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenCloseTimes(Boolean value) {
        this.openCloseTimes = value;
    }

    /**
     * Obtém o valor da propriedade openCloseTimesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OpenCloseDetailPropertyOptions> getOpenCloseTimesOptions() {
        return openCloseTimesOptions;
    }

    /**
     * Define o valor da propriedade openCloseTimesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public void setOpenCloseTimesOptions(JAXBElement<OpenCloseDetailPropertyOptions> value) {
        this.openCloseTimesOptions = value;
    }

}
