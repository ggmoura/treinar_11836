
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
 *         &lt;element name="UpdateRouteFromPointsResult" type="{http://roadnet.com/apex/DataContracts/}Route" minOccurs="0"/&gt;
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
    "updateRouteFromPointsResult"
})
@XmlRootElement(name = "UpdateRouteFromPointsResponse")
public class UpdateRouteFromPointsResponse {

    @XmlElementRef(name = "UpdateRouteFromPointsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<Route> updateRouteFromPointsResult;

    /**
     * Obtém o valor da propriedade updateRouteFromPointsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Route }{@code >}
     *     
     */
    public JAXBElement<Route> getUpdateRouteFromPointsResult() {
        return updateRouteFromPointsResult;
    }

    /**
     * Define o valor da propriedade updateRouteFromPointsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Route }{@code >}
     *     
     */
    public void setUpdateRouteFromPointsResult(JAXBElement<Route> value) {
        this.updateRouteFromPointsResult = value;
    }

}
