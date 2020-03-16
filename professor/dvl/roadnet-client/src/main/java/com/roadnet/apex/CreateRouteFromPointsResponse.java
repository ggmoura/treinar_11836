
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.Route;


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
 *         &lt;element name="CreateRouteFromPointsResult" type="{http://roadnet.com/apex/DataContracts/}Route" minOccurs="0"/&gt;
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
    "createRouteFromPointsResult"
})
@XmlRootElement(name = "CreateRouteFromPointsResponse")
public class CreateRouteFromPointsResponse {

    @XmlElementRef(name = "CreateRouteFromPointsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<Route> createRouteFromPointsResult;

    /**
     * Obtém o valor da propriedade createRouteFromPointsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Route }{@code >}
     *     
     */
    public JAXBElement<Route> getCreateRouteFromPointsResult() {
        return createRouteFromPointsResult;
    }

    /**
     * Define o valor da propriedade createRouteFromPointsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Route }{@code >}
     *     
     */
    public void setCreateRouteFromPointsResult(JAXBElement<Route> value) {
        this.createRouteFromPointsResult = value;
    }

}
