
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NetworkRestrictedPathRule complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkRestrictedPathRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}NetworkTravelRule"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetworkTravelDirection_TravelDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkRestrictedPathRule", propOrder = {
    "networkTravelDirectionTravelDirection"
})
public class NetworkRestrictedPathRule
    extends NetworkTravelRule
{

    @XmlElementRef(name = "NetworkTravelDirection_TravelDirection", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkTravelDirectionTravelDirection;

    /**
     * Obtém o valor da propriedade networkTravelDirectionTravelDirection.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkTravelDirectionTravelDirection() {
        return networkTravelDirectionTravelDirection;
    }

    /**
     * Define o valor da propriedade networkTravelDirectionTravelDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkTravelDirectionTravelDirection(JAXBElement<String> value) {
        this.networkTravelDirectionTravelDirection = value;
    }

}
