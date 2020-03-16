
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NetworkPOICandidatePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkPOICandidatePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}GeocodeCandidateResultsPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetPOI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NetPOIOptions" type="{http://roadnet.com/apex/DataContracts/}NetworkPOIPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkPOICandidatePropertyOptions", propOrder = {
    "netPOI",
    "netPOIOptions"
})
public class NetworkPOICandidatePropertyOptions
    extends GeocodeCandidateResultsPropertyOptions
{

    @XmlElement(name = "NetPOI")
    protected Boolean netPOI;
    @XmlElementRef(name = "NetPOIOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkPOIPropertyOptions> netPOIOptions;

    /**
     * Obtém o valor da propriedade netPOI.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetPOI() {
        return netPOI;
    }

    /**
     * Define o valor da propriedade netPOI.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetPOI(Boolean value) {
        this.netPOI = value;
    }

    /**
     * Obtém o valor da propriedade netPOIOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkPOIPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<NetworkPOIPropertyOptions> getNetPOIOptions() {
        return netPOIOptions;
    }

    /**
     * Define o valor da propriedade netPOIOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkPOIPropertyOptions }{@code >}
     *     
     */
    public void setNetPOIOptions(JAXBElement<NetworkPOIPropertyOptions> value) {
        this.netPOIOptions = value;
    }

}
