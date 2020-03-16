
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de MeasurementOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MeasurementOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DistanceUnit_DistanceUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FuelEconomyUnit_FuelEconomyUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LengthUnit_LengthUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LiquidVolumeUnit_LiquidVolumeUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpeedUnit_SpeedUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemperatureUnit_TemperatureUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WeightUnit_WeightUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementOptions", propOrder = {
    "distanceUnitDistanceUnit",
    "fuelEconomyUnitFuelEconomyUnit",
    "lengthUnitLengthUnit",
    "liquidVolumeUnitLiquidVolumeUnit",
    "speedUnitSpeedUnit",
    "temperatureUnitTemperatureUnit",
    "weightUnitWeightUnit"
})
public class MeasurementOptions
    extends DataTransferObject
{

    @XmlElementRef(name = "DistanceUnit_DistanceUnit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distanceUnitDistanceUnit;
    @XmlElementRef(name = "FuelEconomyUnit_FuelEconomyUnit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fuelEconomyUnitFuelEconomyUnit;
    @XmlElementRef(name = "LengthUnit_LengthUnit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lengthUnitLengthUnit;
    @XmlElementRef(name = "LiquidVolumeUnit_LiquidVolumeUnit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> liquidVolumeUnitLiquidVolumeUnit;
    @XmlElementRef(name = "SpeedUnit_SpeedUnit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> speedUnitSpeedUnit;
    @XmlElementRef(name = "TemperatureUnit_TemperatureUnit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> temperatureUnitTemperatureUnit;
    @XmlElementRef(name = "WeightUnit_WeightUnit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> weightUnitWeightUnit;

    /**
     * Obtém o valor da propriedade distanceUnitDistanceUnit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistanceUnitDistanceUnit() {
        return distanceUnitDistanceUnit;
    }

    /**
     * Define o valor da propriedade distanceUnitDistanceUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistanceUnitDistanceUnit(JAXBElement<String> value) {
        this.distanceUnitDistanceUnit = value;
    }

    /**
     * Obtém o valor da propriedade fuelEconomyUnitFuelEconomyUnit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFuelEconomyUnitFuelEconomyUnit() {
        return fuelEconomyUnitFuelEconomyUnit;
    }

    /**
     * Define o valor da propriedade fuelEconomyUnitFuelEconomyUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFuelEconomyUnitFuelEconomyUnit(JAXBElement<String> value) {
        this.fuelEconomyUnitFuelEconomyUnit = value;
    }

    /**
     * Obtém o valor da propriedade lengthUnitLengthUnit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLengthUnitLengthUnit() {
        return lengthUnitLengthUnit;
    }

    /**
     * Define o valor da propriedade lengthUnitLengthUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLengthUnitLengthUnit(JAXBElement<String> value) {
        this.lengthUnitLengthUnit = value;
    }

    /**
     * Obtém o valor da propriedade liquidVolumeUnitLiquidVolumeUnit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLiquidVolumeUnitLiquidVolumeUnit() {
        return liquidVolumeUnitLiquidVolumeUnit;
    }

    /**
     * Define o valor da propriedade liquidVolumeUnitLiquidVolumeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLiquidVolumeUnitLiquidVolumeUnit(JAXBElement<String> value) {
        this.liquidVolumeUnitLiquidVolumeUnit = value;
    }

    /**
     * Obtém o valor da propriedade speedUnitSpeedUnit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpeedUnitSpeedUnit() {
        return speedUnitSpeedUnit;
    }

    /**
     * Define o valor da propriedade speedUnitSpeedUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpeedUnitSpeedUnit(JAXBElement<String> value) {
        this.speedUnitSpeedUnit = value;
    }

    /**
     * Obtém o valor da propriedade temperatureUnitTemperatureUnit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTemperatureUnitTemperatureUnit() {
        return temperatureUnitTemperatureUnit;
    }

    /**
     * Define o valor da propriedade temperatureUnitTemperatureUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTemperatureUnitTemperatureUnit(JAXBElement<String> value) {
        this.temperatureUnitTemperatureUnit = value;
    }

    /**
     * Obtém o valor da propriedade weightUnitWeightUnit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWeightUnitWeightUnit() {
        return weightUnitWeightUnit;
    }

    /**
     * Define o valor da propriedade weightUnitWeightUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWeightUnitWeightUnit(JAXBElement<String> value) {
        this.weightUnitWeightUnit = value;
    }

}
