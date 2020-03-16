
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de FuelLocation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FuelLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}Location"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalFixedTravelTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="FuelPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FuelPriceEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FuelLocation", propOrder = {
    "additionalFixedTravelTime",
    "fuelPrice",
    "fuelPriceEffectiveDate"
})
public class FuelLocation
    extends Location
{

    @XmlElement(name = "AdditionalFixedTravelTime")
    protected Duration additionalFixedTravelTime;
    @XmlElementRef(name = "FuelPrice", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> fuelPrice;
    @XmlElementRef(name = "FuelPriceEffectiveDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fuelPriceEffectiveDate;

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
     * Obtém o valor da propriedade fuelPrice.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getFuelPrice() {
        return fuelPrice;
    }

    /**
     * Define o valor da propriedade fuelPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setFuelPrice(JAXBElement<Double> value) {
        this.fuelPrice = value;
    }

    /**
     * Obtém o valor da propriedade fuelPriceEffectiveDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFuelPriceEffectiveDate() {
        return fuelPriceEffectiveDate;
    }

    /**
     * Define o valor da propriedade fuelPriceEffectiveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFuelPriceEffectiveDate(JAXBElement<XMLGregorianCalendar> value) {
        this.fuelPriceEffectiveDate = value;
    }

}
