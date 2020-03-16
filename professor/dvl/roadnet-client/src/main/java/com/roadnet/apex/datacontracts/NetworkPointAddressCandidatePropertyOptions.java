
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NetworkPointAddressCandidatePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkPointAddressCandidatePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}GeocodeCandidateResultsPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetPointAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NetPointAddressOptions" type="{http://roadnet.com/apex/DataContracts/}NetworkPointAddressPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkPointAddressCandidatePropertyOptions", propOrder = {
    "netPointAddress",
    "netPointAddressOptions"
})
public class NetworkPointAddressCandidatePropertyOptions
    extends GeocodeCandidateResultsPropertyOptions
{

    @XmlElement(name = "NetPointAddress")
    protected Boolean netPointAddress;
    @XmlElementRef(name = "NetPointAddressOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkPointAddressPropertyOptions> netPointAddressOptions;

    /**
     * Obtém o valor da propriedade netPointAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetPointAddress() {
        return netPointAddress;
    }

    /**
     * Define o valor da propriedade netPointAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetPointAddress(Boolean value) {
        this.netPointAddress = value;
    }

    /**
     * Obtém o valor da propriedade netPointAddressOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkPointAddressPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<NetworkPointAddressPropertyOptions> getNetPointAddressOptions() {
        return netPointAddressOptions;
    }

    /**
     * Define o valor da propriedade netPointAddressOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkPointAddressPropertyOptions }{@code >}
     *     
     */
    public void setNetPointAddressOptions(JAXBElement<NetworkPointAddressPropertyOptions> value) {
        this.netPointAddressOptions = value;
    }

}
