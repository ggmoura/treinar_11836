
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de RetrieveGeocodeCandidateOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveGeocodeCandidateOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeocodingOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}GeocodeOptions" minOccurs="0"/&gt;
 *         &lt;element name="MaxArcCandidates" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxPOICandidates" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveGeocodeCandidateOptions", propOrder = {
    "geocodingOptions",
    "maxArcCandidates",
    "maxPOICandidates"
})
public class RetrieveGeocodeCandidateOptions
    extends DataTransferObject
{

    @XmlElementRef(name = "GeocodingOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<GeocodeOptions> geocodingOptions;
    @XmlElement(name = "MaxArcCandidates")
    protected Integer maxArcCandidates;
    @XmlElement(name = "MaxPOICandidates")
    protected Integer maxPOICandidates;

    /**
     * Obtém o valor da propriedade geocodingOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeocodeOptions }{@code >}
     *     
     */
    public JAXBElement<GeocodeOptions> getGeocodingOptions() {
        return geocodingOptions;
    }

    /**
     * Define o valor da propriedade geocodingOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeocodeOptions }{@code >}
     *     
     */
    public void setGeocodingOptions(JAXBElement<GeocodeOptions> value) {
        this.geocodingOptions = value;
    }

    /**
     * Obtém o valor da propriedade maxArcCandidates.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxArcCandidates() {
        return maxArcCandidates;
    }

    /**
     * Define o valor da propriedade maxArcCandidates.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxArcCandidates(Integer value) {
        this.maxArcCandidates = value;
    }

    /**
     * Obtém o valor da propriedade maxPOICandidates.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPOICandidates() {
        return maxPOICandidates;
    }

    /**
     * Define o valor da propriedade maxPOICandidates.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPOICandidates(Integer value) {
        this.maxPOICandidates = value;
    }

}
