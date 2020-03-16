
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.SessionHeader;


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
 *         &lt;element name="sessionHeader" type="{http://roadnet.com/apex/DataContracts/}SessionHeader" minOccurs="0"/&gt;
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
    "sessionHeader"
})
@XmlRootElement(name = "Logout")
public class Logout {

    @XmlElementRef(name = "sessionHeader", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<SessionHeader> sessionHeader;

    /**
     * Obtém o valor da propriedade sessionHeader.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SessionHeader }{@code >}
     *     
     */
    public JAXBElement<SessionHeader> getSessionHeader() {
        return sessionHeader;
    }

    /**
     * Define o valor da propriedade sessionHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SessionHeader }{@code >}
     *     
     */
    public void setSessionHeader(JAXBElement<SessionHeader> value) {
        this.sessionHeader = value;
    }

}
