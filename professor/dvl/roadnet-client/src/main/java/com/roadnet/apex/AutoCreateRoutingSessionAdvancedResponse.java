
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RoutingSession;


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
 *         &lt;element name="AutoCreateRoutingSessionAdvancedResult" type="{http://roadnet.com/apex/DataContracts/}RoutingSession" minOccurs="0"/&gt;
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
    "autoCreateRoutingSessionAdvancedResult"
})
@XmlRootElement(name = "AutoCreateRoutingSessionAdvancedResponse")
public class AutoCreateRoutingSessionAdvancedResponse {

    @XmlElementRef(name = "AutoCreateRoutingSessionAdvancedResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutingSession> autoCreateRoutingSessionAdvancedResult;

    /**
     * Obtém o valor da propriedade autoCreateRoutingSessionAdvancedResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutingSession }{@code >}
     *     
     */
    public JAXBElement<RoutingSession> getAutoCreateRoutingSessionAdvancedResult() {
        return autoCreateRoutingSessionAdvancedResult;
    }

    /**
     * Define o valor da propriedade autoCreateRoutingSessionAdvancedResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutingSession }{@code >}
     *     
     */
    public void setAutoCreateRoutingSessionAdvancedResult(JAXBElement<RoutingSession> value) {
        this.autoCreateRoutingSessionAdvancedResult = value;
    }

}
