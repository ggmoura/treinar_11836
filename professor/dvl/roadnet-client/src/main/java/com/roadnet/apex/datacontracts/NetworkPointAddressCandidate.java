
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NetworkPointAddressCandidate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkPointAddressCandidate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}GeocodeCandidate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetPointAddress" type="{http://roadnet.com/apex/DataContracts/}NetworkPointAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkPointAddressCandidate", propOrder = {
    "netPointAddress"
})
public class NetworkPointAddressCandidate
    extends GeocodeCandidate
{

    @XmlElementRef(name = "NetPointAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkPointAddress> netPointAddress;

    /**
     * Obtém o valor da propriedade netPointAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkPointAddress }{@code >}
     *     
     */
    public JAXBElement<NetworkPointAddress> getNetPointAddress() {
        return netPointAddress;
    }

    /**
     * Define o valor da propriedade netPointAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkPointAddress }{@code >}
     *     
     */
    public void setNetPointAddress(JAXBElement<NetworkPointAddress> value) {
        this.netPointAddress = value;
    }

}
