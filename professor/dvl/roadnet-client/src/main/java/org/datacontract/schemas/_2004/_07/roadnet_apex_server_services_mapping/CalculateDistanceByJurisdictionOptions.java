
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.MeasurementOptions;
import com.roadnet.apex.datacontracts.TravelPathCalculatorOptions;


/**
 * <p>Classe Java de CalculateDistanceByJurisdictionOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CalculateDistanceByJurisdictionOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CalculatorOptions" type="{http://roadnet.com/apex/DataContracts/}TravelPathCalculatorOptions" minOccurs="0"/&gt;
 *         &lt;element name="MeasurementOptions" type="{http://roadnet.com/apex/DataContracts/}MeasurementOptions" minOccurs="0"/&gt;
 *         &lt;element name="PropertyOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}CalculateDistanceByJurisdictionResultPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculateDistanceByJurisdictionOptions", propOrder = {
    "calculatorOptions",
    "measurementOptions",
    "propertyOptions"
})
public class CalculateDistanceByJurisdictionOptions {

    @XmlElementRef(name = "CalculatorOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<TravelPathCalculatorOptions> calculatorOptions;
    @XmlElementRef(name = "MeasurementOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<MeasurementOptions> measurementOptions;
    @XmlElementRef(name = "PropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<CalculateDistanceByJurisdictionResultPropertyOptions> propertyOptions;

    /**
     * Obtém o valor da propriedade calculatorOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TravelPathCalculatorOptions }{@code >}
     *     
     */
    public JAXBElement<TravelPathCalculatorOptions> getCalculatorOptions() {
        return calculatorOptions;
    }

    /**
     * Define o valor da propriedade calculatorOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TravelPathCalculatorOptions }{@code >}
     *     
     */
    public void setCalculatorOptions(JAXBElement<TravelPathCalculatorOptions> value) {
        this.calculatorOptions = value;
    }

    /**
     * Obtém o valor da propriedade measurementOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeasurementOptions }{@code >}
     *     
     */
    public JAXBElement<MeasurementOptions> getMeasurementOptions() {
        return measurementOptions;
    }

    /**
     * Define o valor da propriedade measurementOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeasurementOptions }{@code >}
     *     
     */
    public void setMeasurementOptions(JAXBElement<MeasurementOptions> value) {
        this.measurementOptions = value;
    }

    /**
     * Obtém o valor da propriedade propertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CalculateDistanceByJurisdictionResultPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<CalculateDistanceByJurisdictionResultPropertyOptions> getPropertyOptions() {
        return propertyOptions;
    }

    /**
     * Define o valor da propriedade propertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CalculateDistanceByJurisdictionResultPropertyOptions }{@code >}
     *     
     */
    public void setPropertyOptions(JAXBElement<CalculateDistanceByJurisdictionResultPropertyOptions> value) {
        this.propertyOptions = value;
    }

}
