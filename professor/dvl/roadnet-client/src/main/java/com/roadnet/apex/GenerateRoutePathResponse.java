
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RoutePathResult;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GenerateRoutePathResult" type="{http://roadnet.com/apex/DataContracts/}RoutePathResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "generateRoutePathResult"
})
@XmlRootElement(name = "GenerateRoutePathResponse")
public class GenerateRoutePathResponse {

    @XmlElementRef(name = "GenerateRoutePathResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutePathResult> generateRoutePathResult;

    /**
     * Obtém o valor da propriedade generateRoutePathResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutePathResult }{@code >}
     *     
     */
    public JAXBElement<RoutePathResult> getGenerateRoutePathResult() {
        return generateRoutePathResult;
    }

    /**
     * Define o valor da propriedade generateRoutePathResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePathResult }{@code >}
     *     
     */
    public void setGenerateRoutePathResult(JAXBElement<RoutePathResult> value) {
        this.generateRoutePathResult = value;
    }

}
