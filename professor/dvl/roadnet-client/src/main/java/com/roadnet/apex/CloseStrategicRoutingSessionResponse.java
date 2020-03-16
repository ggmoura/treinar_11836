
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.StrategicRoutingSession;


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
 *         &lt;element name="CloseStrategicRoutingSessionResult" type="{http://roadnet.com/apex/DataContracts/}StrategicRoutingSession" minOccurs="0"/&gt;
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
    "closeStrategicRoutingSessionResult"
})
@XmlRootElement(name = "CloseStrategicRoutingSessionResponse")
public class CloseStrategicRoutingSessionResponse {

    @XmlElementRef(name = "CloseStrategicRoutingSessionResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<StrategicRoutingSession> closeStrategicRoutingSessionResult;

    /**
     * Obtém o valor da propriedade closeStrategicRoutingSessionResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StrategicRoutingSession }{@code >}
     *     
     */
    public JAXBElement<StrategicRoutingSession> getCloseStrategicRoutingSessionResult() {
        return closeStrategicRoutingSessionResult;
    }

    /**
     * Define o valor da propriedade closeStrategicRoutingSessionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StrategicRoutingSession }{@code >}
     *     
     */
    public void setCloseStrategicRoutingSessionResult(JAXBElement<StrategicRoutingSession> value) {
        this.closeStrategicRoutingSessionResult = value;
    }

}
