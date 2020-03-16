
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
 *         &lt;element name="CopyRouteToSessionResult" type="{http://roadnet.com/apex/DataContracts/}Route" minOccurs="0"/&gt;
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
    "copyRouteToSessionResult"
})
@XmlRootElement(name = "CopyRouteToSessionResponse")
public class CopyRouteToSessionResponse {

    @XmlElementRef(name = "CopyRouteToSessionResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<Route> copyRouteToSessionResult;

    /**
     * Obtém o valor da propriedade copyRouteToSessionResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Route }{@code >}
     *     
     */
    public JAXBElement<Route> getCopyRouteToSessionResult() {
        return copyRouteToSessionResult;
    }

    /**
     * Define o valor da propriedade copyRouteToSessionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Route }{@code >}
     *     
     */
    public void setCopyRouteToSessionResult(JAXBElement<Route> value) {
        this.copyRouteToSessionResult = value;
    }

}
