
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CrossStreetCandidate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CrossStreetCandidate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}GeocodeCandidate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrossArcs" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNetworkArc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossStreetCandidate", propOrder = {
    "crossArcs"
})
public class CrossStreetCandidate
    extends GeocodeCandidate
{

    @XmlElementRef(name = "CrossArcs", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkArc> crossArcs;

    /**
     * Obtém o valor da propriedade crossArcs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkArc }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkArc> getCrossArcs() {
        return crossArcs;
    }

    /**
     * Define o valor da propriedade crossArcs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkArc }{@code >}
     *     
     */
    public void setCrossArcs(JAXBElement<ArrayOfNetworkArc> value) {
        this.crossArcs = value;
    }

}
