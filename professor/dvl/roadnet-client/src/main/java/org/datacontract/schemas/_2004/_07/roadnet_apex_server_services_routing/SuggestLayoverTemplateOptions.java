
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import com.roadnet.apex.datacontracts.LayoverDeparture;


/**
 * <p>Classe Java de SuggestLayoverTemplateOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SuggestLayoverTemplateOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalLayoverLocationEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="DepartureType" type="{http://roadnet.com/apex/DataContracts/}LayoverDeparture" minOccurs="0"/&gt;
 *         &lt;element name="NumToSuggest" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Placement" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}TemplatePlacement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestLayoverTemplateOptions", propOrder = {
    "additionalLayoverLocationEntityKeys",
    "departureType",
    "numToSuggest",
    "placement"
})
public class SuggestLayoverTemplateOptions {

    @XmlElementRef(name = "AdditionalLayoverLocationEntityKeys", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> additionalLayoverLocationEntityKeys;
    @XmlElementRef(name = "DepartureType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<LayoverDeparture> departureType;
    @XmlElement(name = "NumToSuggest")
    protected Integer numToSuggest;
    @XmlElementRef(name = "Placement", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<TemplatePlacement> placement;

    /**
     * Obtém o valor da propriedade additionalLayoverLocationEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getAdditionalLayoverLocationEntityKeys() {
        return additionalLayoverLocationEntityKeys;
    }

    /**
     * Define o valor da propriedade additionalLayoverLocationEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setAdditionalLayoverLocationEntityKeys(JAXBElement<ArrayOflong> value) {
        this.additionalLayoverLocationEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade departureType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LayoverDeparture }{@code >}
     *     
     */
    public JAXBElement<LayoverDeparture> getDepartureType() {
        return departureType;
    }

    /**
     * Define o valor da propriedade departureType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LayoverDeparture }{@code >}
     *     
     */
    public void setDepartureType(JAXBElement<LayoverDeparture> value) {
        this.departureType = value;
    }

    /**
     * Obtém o valor da propriedade numToSuggest.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumToSuggest() {
        return numToSuggest;
    }

    /**
     * Define o valor da propriedade numToSuggest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumToSuggest(Integer value) {
        this.numToSuggest = value;
    }

    /**
     * Obtém o valor da propriedade placement.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TemplatePlacement }{@code >}
     *     
     */
    public JAXBElement<TemplatePlacement> getPlacement() {
        return placement;
    }

    /**
     * Define o valor da propriedade placement.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TemplatePlacement }{@code >}
     *     
     */
    public void setPlacement(JAXBElement<TemplatePlacement> value) {
        this.placement = value;
    }

}
