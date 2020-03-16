
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.GenerateTravelPathOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.GenerateRouteTemplateTravelPathOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.GenerateRouteTravelPathOptions;


/**
 * <p>Classe Java de TravelPathOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TravelPathOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeasurementOptions" type="{http://roadnet.com/apex/DataContracts/}MeasurementOptions" minOccurs="0"/&gt;
 *         &lt;element name="PropertyOptions" type="{http://roadnet.com/apex/DataContracts/}TravelPathResultPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelPathOptions", propOrder = {
    "measurementOptions",
    "propertyOptions"
})
@XmlSeeAlso({
    GenerateRouteTravelPathOptions.class,
    GenerateRouteTemplateTravelPathOptions.class,
    GenerateTravelPathOptions.class
})
public class TravelPathOptions {

    @XmlElementRef(name = "MeasurementOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<MeasurementOptions> measurementOptions;
    @XmlElementRef(name = "PropertyOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TravelPathResultPropertyOptions> propertyOptions;

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
     *     {@link JAXBElement }{@code <}{@link TravelPathResultPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<TravelPathResultPropertyOptions> getPropertyOptions() {
        return propertyOptions;
    }

    /**
     * Define o valor da propriedade propertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TravelPathResultPropertyOptions }{@code >}
     *     
     */
    public void setPropertyOptions(JAXBElement<TravelPathResultPropertyOptions> value) {
        this.propertyOptions = value;
    }

}
