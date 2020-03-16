
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NetworkArcCandidate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkArcCandidate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}GeocodeCandidate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetArc" type="{http://roadnet.com/apex/DataContracts/}NetworkArc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkArcCandidate", propOrder = {
    "netArc"
})
public class NetworkArcCandidate
    extends GeocodeCandidate
{

    @XmlElementRef(name = "NetArc", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkArc> netArc;

    /**
     * Obtém o valor da propriedade netArc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}
     *     
     */
    public JAXBElement<NetworkArc> getNetArc() {
        return netArc;
    }

    /**
     * Define o valor da propriedade netArc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}
     *     
     */
    public void setNetArc(JAXBElement<NetworkArc> value) {
        this.netArc = value;
    }

}
