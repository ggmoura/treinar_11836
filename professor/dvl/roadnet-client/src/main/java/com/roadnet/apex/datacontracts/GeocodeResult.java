
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.ImmutableObject;


/**
 * <p>Classe Java de GeocodeResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GeocodeResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}ImmutableObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeocodeAttentionReason_AttentionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeocodingTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Results" type="{http://roadnet.com/apex/DataContracts/}ArrayOfGeocodeCandidate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocodeResult", propOrder = {
    "geocodeAttentionReasonAttentionReason",
    "geocodingTime",
    "results"
})
public class GeocodeResult
    extends ImmutableObject
{

    @XmlElementRef(name = "GeocodeAttentionReason_AttentionReason", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geocodeAttentionReasonAttentionReason;
    @XmlElement(name = "GeocodingTime")
    protected Double geocodingTime;
    @XmlElementRef(name = "Results", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGeocodeCandidate> results;

    /**
     * Obtém o valor da propriedade geocodeAttentionReasonAttentionReason.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeocodeAttentionReasonAttentionReason() {
        return geocodeAttentionReasonAttentionReason;
    }

    /**
     * Define o valor da propriedade geocodeAttentionReasonAttentionReason.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeocodeAttentionReasonAttentionReason(JAXBElement<String> value) {
        this.geocodeAttentionReasonAttentionReason = value;
    }

    /**
     * Obtém o valor da propriedade geocodingTime.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGeocodingTime() {
        return geocodingTime;
    }

    /**
     * Define o valor da propriedade geocodingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGeocodingTime(Double value) {
        this.geocodingTime = value;
    }

    /**
     * Obtém o valor da propriedade results.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGeocodeCandidate }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGeocodeCandidate> getResults() {
        return results;
    }

    /**
     * Define o valor da propriedade results.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGeocodeCandidate }{@code >}
     *     
     */
    public void setResults(JAXBElement<ArrayOfGeocodeCandidate> value) {
        this.results = value;
    }

}
