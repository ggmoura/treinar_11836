
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de NavRecalculationResourceEvent complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NavRecalculationResourceEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}ResourceEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CalculationDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="CalculatorOptions" type="{http://roadnet.com/apex/DataContracts/}NavRecalculationCalculatorOptions" minOccurs="0"/&gt;
 *         &lt;element name="Coordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="DestinationCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="DetourDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="NavRecalculationReason_NavRecalculationReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemainingDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="RemainingDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="VehicleOptions" type="{http://roadnet.com/apex/DataContracts/}NavRecalculationVehicleOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavRecalculationResourceEvent", propOrder = {
    "calculationDuration",
    "calculatorOptions",
    "coordinate",
    "destinationCoordinate",
    "detourDistance",
    "navRecalculationReasonNavRecalculationReason",
    "remainingDistance",
    "remainingDuration",
    "vehicleOptions"
})
public class NavRecalculationResourceEvent
    extends ResourceEvent
{

    @XmlElementRef(name = "CalculationDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> calculationDuration;
    @XmlElementRef(name = "CalculatorOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<NavRecalculationCalculatorOptions> calculatorOptions;
    @XmlElementRef(name = "Coordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinate;
    @XmlElementRef(name = "DestinationCoordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> destinationCoordinate;
    @XmlElementRef(name = "DetourDistance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> detourDistance;
    @XmlElementRef(name = "NavRecalculationReason_NavRecalculationReason", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> navRecalculationReasonNavRecalculationReason;
    @XmlElementRef(name = "RemainingDistance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> remainingDistance;
    @XmlElementRef(name = "RemainingDuration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> remainingDuration;
    @XmlElementRef(name = "VehicleOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<NavRecalculationVehicleOptions> vehicleOptions;

    /**
     * Obtém o valor da propriedade calculationDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getCalculationDuration() {
        return calculationDuration;
    }

    /**
     * Define o valor da propriedade calculationDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setCalculationDuration(JAXBElement<Duration> value) {
        this.calculationDuration = value;
    }

    /**
     * Obtém o valor da propriedade calculatorOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavRecalculationCalculatorOptions }{@code >}
     *     
     */
    public JAXBElement<NavRecalculationCalculatorOptions> getCalculatorOptions() {
        return calculatorOptions;
    }

    /**
     * Define o valor da propriedade calculatorOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavRecalculationCalculatorOptions }{@code >}
     *     
     */
    public void setCalculatorOptions(JAXBElement<NavRecalculationCalculatorOptions> value) {
        this.calculatorOptions = value;
    }

    /**
     * Obtém o valor da propriedade coordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getCoordinate() {
        return coordinate;
    }

    /**
     * Define o valor da propriedade coordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setCoordinate(JAXBElement<Coordinate> value) {
        this.coordinate = value;
    }

    /**
     * Obtém o valor da propriedade destinationCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getDestinationCoordinate() {
        return destinationCoordinate;
    }

    /**
     * Define o valor da propriedade destinationCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setDestinationCoordinate(JAXBElement<Coordinate> value) {
        this.destinationCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade detourDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDetourDistance() {
        return detourDistance;
    }

    /**
     * Define o valor da propriedade detourDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDetourDistance(JAXBElement<Distance> value) {
        this.detourDistance = value;
    }

    /**
     * Obtém o valor da propriedade navRecalculationReasonNavRecalculationReason.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNavRecalculationReasonNavRecalculationReason() {
        return navRecalculationReasonNavRecalculationReason;
    }

    /**
     * Define o valor da propriedade navRecalculationReasonNavRecalculationReason.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNavRecalculationReasonNavRecalculationReason(JAXBElement<String> value) {
        this.navRecalculationReasonNavRecalculationReason = value;
    }

    /**
     * Obtém o valor da propriedade remainingDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getRemainingDistance() {
        return remainingDistance;
    }

    /**
     * Define o valor da propriedade remainingDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setRemainingDistance(JAXBElement<Distance> value) {
        this.remainingDistance = value;
    }

    /**
     * Obtém o valor da propriedade remainingDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getRemainingDuration() {
        return remainingDuration;
    }

    /**
     * Define o valor da propriedade remainingDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setRemainingDuration(JAXBElement<Duration> value) {
        this.remainingDuration = value;
    }

    /**
     * Obtém o valor da propriedade vehicleOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavRecalculationVehicleOptions }{@code >}
     *     
     */
    public JAXBElement<NavRecalculationVehicleOptions> getVehicleOptions() {
        return vehicleOptions;
    }

    /**
     * Define o valor da propriedade vehicleOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavRecalculationVehicleOptions }{@code >}
     *     
     */
    public void setVehicleOptions(JAXBElement<NavRecalculationVehicleOptions> value) {
        this.vehicleOptions = value;
    }

}
