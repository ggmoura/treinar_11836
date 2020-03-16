
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NetworkTravelPolygonRule complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkTravelPolygonRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}NetworkTravelRule"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetworkArcRenderingCodeFlags_RenderingCodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkTravelPolygonRule", propOrder = {
    "networkArcRenderingCodeFlagsRenderingCodes"
})
public class NetworkTravelPolygonRule
    extends NetworkTravelRule
{

    @XmlElementRef(name = "NetworkArcRenderingCodeFlags_RenderingCodes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkArcRenderingCodeFlagsRenderingCodes;

    /**
     * Obtém o valor da propriedade networkArcRenderingCodeFlagsRenderingCodes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkArcRenderingCodeFlagsRenderingCodes() {
        return networkArcRenderingCodeFlagsRenderingCodes;
    }

    /**
     * Define o valor da propriedade networkArcRenderingCodeFlagsRenderingCodes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkArcRenderingCodeFlagsRenderingCodes(JAXBElement<String> value) {
        this.networkArcRenderingCodeFlagsRenderingCodes = value;
    }

}
