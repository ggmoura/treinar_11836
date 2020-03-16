
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FuelLocationPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FuelLocationPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}LocationPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalFixedTravelTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FuelPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FuelPriceEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FuelLocationPropertyOptions", propOrder = {
    "additionalFixedTravelTime",
    "fuelPrice",
    "fuelPriceEffectiveDate"
})
public class FuelLocationPropertyOptions
    extends LocationPropertyOptions
{

    @XmlElement(name = "AdditionalFixedTravelTime")
    protected Boolean additionalFixedTravelTime;
    @XmlElement(name = "FuelPrice")
    protected Boolean fuelPrice;
    @XmlElement(name = "FuelPriceEffectiveDate")
    protected Boolean fuelPriceEffectiveDate;

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
     * Obtém o valor da propriedade fuelPrice.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFuelPrice() {
        return fuelPrice;
    }

    /**
     * Define o valor da propriedade fuelPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFuelPrice(Boolean value) {
        this.fuelPrice = value;
    }

    /**
     * Obtém o valor da propriedade fuelPriceEffectiveDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFuelPriceEffectiveDate() {
        return fuelPriceEffectiveDate;
    }

    /**
     * Define o valor da propriedade fuelPriceEffectiveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFuelPriceEffectiveDate(Boolean value) {
        this.fuelPriceEffectiveDate = value;
    }

}
