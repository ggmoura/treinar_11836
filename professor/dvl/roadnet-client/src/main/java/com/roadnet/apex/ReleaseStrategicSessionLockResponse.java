
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
 *         &lt;element name="ReleaseStrategicSessionLockResult" type="{http://roadnet.com/apex/DataContracts/}StrategicRoutingSession" minOccurs="0"/&gt;
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
    "releaseStrategicSessionLockResult"
})
@XmlRootElement(name = "ReleaseStrategicSessionLockResponse")
public class ReleaseStrategicSessionLockResponse {

    @XmlElementRef(name = "ReleaseStrategicSessionLockResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<StrategicRoutingSession> releaseStrategicSessionLockResult;

    /**
     * Obtém o valor da propriedade releaseStrategicSessionLockResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StrategicRoutingSession }{@code >}
     *     
     */
    public JAXBElement<StrategicRoutingSession> getReleaseStrategicSessionLockResult() {
        return releaseStrategicSessionLockResult;
    }

    /**
     * Define o valor da propriedade releaseStrategicSessionLockResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StrategicRoutingSession }{@code >}
     *     
     */
    public void setReleaseStrategicSessionLockResult(JAXBElement<StrategicRoutingSession> value) {
        this.releaseStrategicSessionLockResult = value;
    }

}
