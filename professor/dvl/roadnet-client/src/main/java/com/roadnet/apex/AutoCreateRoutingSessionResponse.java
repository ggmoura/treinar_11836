
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
 *         &lt;element name="AutoCreateRoutingSessionResult" type="{http://roadnet.com/apex/DataContracts/}RoutingSession" minOccurs="0"/&gt;
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
    "autoCreateRoutingSessionResult"
})
@XmlRootElement(name = "AutoCreateRoutingSessionResponse")
public class AutoCreateRoutingSessionResponse {

    @XmlElementRef(name = "AutoCreateRoutingSessionResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutingSession> autoCreateRoutingSessionResult;

    /**
     * Obtém o valor da propriedade autoCreateRoutingSessionResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutingSession }{@code >}
     *     
     */
    public JAXBElement<RoutingSession> getAutoCreateRoutingSessionResult() {
        return autoCreateRoutingSessionResult;
    }

    /**
     * Define o valor da propriedade autoCreateRoutingSessionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutingSession }{@code >}
     *     
     */
    public void setAutoCreateRoutingSessionResult(JAXBElement<RoutingSession> value) {
        this.autoCreateRoutingSessionResult = value;
    }

}
