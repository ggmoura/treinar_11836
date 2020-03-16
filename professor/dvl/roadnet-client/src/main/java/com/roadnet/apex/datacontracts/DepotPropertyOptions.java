
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DepotPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DepotPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}LocationPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalFixedTravelTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseTimes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseTimesOptions" type="{http://roadnet.com/apex/DataContracts/}OpenCloseDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTimes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTimesOptions" type="{http://roadnet.com/apex/DataContracts/}ServiceTimeDetailPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepotPropertyOptions", propOrder = {
    "additionalFixedTravelTime",
    "color",
    "openCloseTimes",
    "openCloseTimesOptions",
    "serviceTimes",
    "serviceTimesOptions"
})
public class DepotPropertyOptions
    extends LocationPropertyOptions
{

    @XmlElement(name = "AdditionalFixedTravelTime")
    protected Boolean additionalFixedTravelTime;
    @XmlElement(name = "Color")
    protected Boolean color;
    @XmlElement(name = "OpenCloseTimes")
    protected Boolean openCloseTimes;
    @XmlElementRef(name = "OpenCloseTimesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenCloseDetailPropertyOptions> openCloseTimesOptions;
    @XmlElement(name = "ServiceTimes")
    protected Boolean serviceTimes;
    @XmlElementRef(name = "ServiceTimesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceTimeDetailPropertyOptions> serviceTimesOptions;

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

    /**
     * Obtém o valor da propriedade serviceTimes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceTimes() {
        return serviceTimes;
    }

    /**
     * Define o valor da propriedade serviceTimes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceTimes(Boolean value) {
        this.serviceTimes = value;
    }

    /**
     * Obtém o valor da propriedade serviceTimesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceTimeDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ServiceTimeDetailPropertyOptions> getServiceTimesOptions() {
        return serviceTimesOptions;
    }

    /**
     * Define o valor da propriedade serviceTimesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceTimeDetailPropertyOptions }{@code >}
     *     
     */
    public void setServiceTimesOptions(JAXBElement<ServiceTimeDetailPropertyOptions> value) {
        this.serviceTimesOptions = value;
    }

}
