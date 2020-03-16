
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de Depot complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Depot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}Location"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalFixedTravelTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="Color" type="{http://roadnet.com/apex/DataContracts/}Color" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseTimes" type="{http://roadnet.com/apex/DataContracts/}ArrayOfDepotOpenCloseDetail" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTimes" type="{http://roadnet.com/apex/DataContracts/}ArrayOfDepotServiceTimeDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Depot", propOrder = {
    "additionalFixedTravelTime",
    "color",
    "openCloseTimes",
    "serviceTimes"
})
public class Depot
    extends Location
{

    @XmlElement(name = "AdditionalFixedTravelTime")
    protected Duration additionalFixedTravelTime;
    @XmlElementRef(name = "Color", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Color> color;
    @XmlElementRef(name = "OpenCloseTimes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDepotOpenCloseDetail> openCloseTimes;
    @XmlElementRef(name = "ServiceTimes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDepotServiceTimeDetail> serviceTimes;

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
     * Obtém o valor da propriedade openCloseTimes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDepotOpenCloseDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDepotOpenCloseDetail> getOpenCloseTimes() {
        return openCloseTimes;
    }

    /**
     * Define o valor da propriedade openCloseTimes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDepotOpenCloseDetail }{@code >}
     *     
     */
    public void setOpenCloseTimes(JAXBElement<ArrayOfDepotOpenCloseDetail> value) {
        this.openCloseTimes = value;
    }

    /**
     * Obtém o valor da propriedade serviceTimes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDepotServiceTimeDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDepotServiceTimeDetail> getServiceTimes() {
        return serviceTimes;
    }

    /**
     * Define o valor da propriedade serviceTimes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDepotServiceTimeDetail }{@code >}
     *     
     */
    public void setServiceTimes(JAXBElement<ArrayOfDepotServiceTimeDetail> value) {
        this.serviceTimes = value;
    }

}
