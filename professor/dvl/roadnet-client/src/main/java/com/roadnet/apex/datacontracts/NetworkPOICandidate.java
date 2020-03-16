
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NetworkPOICandidate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkPOICandidate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}GeocodeCandidate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetPOI" type="{http://roadnet.com/apex/DataContracts/}NetworkPOI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkPOICandidate", propOrder = {
    "netPOI"
})
public class NetworkPOICandidate
    extends GeocodeCandidate
{

    @XmlElementRef(name = "NetPOI", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkPOI> netPOI;

    /**
     * Obtém o valor da propriedade netPOI.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkPOI }{@code >}
     *     
     */
    public JAXBElement<NetworkPOI> getNetPOI() {
        return netPOI;
    }

    /**
     * Define o valor da propriedade netPOI.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkPOI }{@code >}
     *     
     */
    public void setNetPOI(JAXBElement<NetworkPOI> value) {
        this.netPOI = value;
    }

}
