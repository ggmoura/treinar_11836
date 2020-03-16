
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RouteTemplate;


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
 *         &lt;element name="CombineRouteTemplatesResult" type="{http://roadnet.com/apex/DataContracts/}RouteTemplate" minOccurs="0"/&gt;
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
    "combineRouteTemplatesResult"
})
@XmlRootElement(name = "CombineRouteTemplatesResponse")
public class CombineRouteTemplatesResponse {

    @XmlElementRef(name = "CombineRouteTemplatesResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteTemplate> combineRouteTemplatesResult;

    /**
     * Obtém o valor da propriedade combineRouteTemplatesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteTemplate }{@code >}
     *     
     */
    public JAXBElement<RouteTemplate> getCombineRouteTemplatesResult() {
        return combineRouteTemplatesResult;
    }

    /**
     * Define o valor da propriedade combineRouteTemplatesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteTemplate }{@code >}
     *     
     */
    public void setCombineRouteTemplatesResult(JAXBElement<RouteTemplate> value) {
        this.combineRouteTemplatesResult = value;
    }

}
