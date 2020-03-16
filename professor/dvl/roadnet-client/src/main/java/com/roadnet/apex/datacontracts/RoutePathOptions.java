
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.GenerateRoutePathOptions;


/**
 * <p>Classe Java de RoutePathOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RoutePathOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeasurementOptions" type="{http://roadnet.com/apex/DataContracts/}MeasurementOptions" minOccurs="0"/&gt;
 *         &lt;element name="PropertyOptions" type="{http://roadnet.com/apex/DataContracts/}RoutePathResultPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePathOptions", propOrder = {
    "measurementOptions",
    "propertyOptions"
})
@XmlSeeAlso({
    GenerateRoutePathOptions.class
})
public class RoutePathOptions {

    @XmlElementRef(name = "MeasurementOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<MeasurementOptions> measurementOptions;
    @XmlElementRef(name = "PropertyOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutePathResultPropertyOptions> propertyOptions;

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
     *     {@link JAXBElement }{@code <}{@link RoutePathResultPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<RoutePathResultPropertyOptions> getPropertyOptions() {
        return propertyOptions;
    }

    /**
     * Define o valor da propriedade propertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePathResultPropertyOptions }{@code >}
     *     
     */
    public void setPropertyOptions(JAXBElement<RoutePathResultPropertyOptions> value) {
        this.propertyOptions = value;
    }

}
