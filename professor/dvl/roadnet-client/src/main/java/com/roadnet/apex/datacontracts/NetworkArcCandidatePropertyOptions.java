
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NetworkArcCandidatePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkArcCandidatePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}GeocodeCandidateResultsPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetArc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NetArcOptions" type="{http://roadnet.com/apex/DataContracts/}NetworkArcPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkArcCandidatePropertyOptions", propOrder = {
    "netArc",
    "netArcOptions"
})
public class NetworkArcCandidatePropertyOptions
    extends GeocodeCandidateResultsPropertyOptions
{

    @XmlElement(name = "NetArc")
    protected Boolean netArc;
    @XmlElementRef(name = "NetArcOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkArcPropertyOptions> netArcOptions;

    /**
     * Obtém o valor da propriedade netArc.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetArc() {
        return netArc;
    }

    /**
     * Define o valor da propriedade netArc.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetArc(Boolean value) {
        this.netArc = value;
    }

    /**
     * Obtém o valor da propriedade netArcOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkArcPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<NetworkArcPropertyOptions> getNetArcOptions() {
        return netArcOptions;
    }

    /**
     * Define o valor da propriedade netArcOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkArcPropertyOptions }{@code >}
     *     
     */
    public void setNetArcOptions(JAXBElement<NetworkArcPropertyOptions> value) {
        this.netArcOptions = value;
    }

}
