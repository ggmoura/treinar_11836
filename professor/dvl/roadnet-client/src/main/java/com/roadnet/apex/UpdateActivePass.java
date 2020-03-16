
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfDailyRoutingSession;


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
 *         &lt;element name="passTemplateEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="routingSessions" type="{http://roadnet.com/apex/DataContracts/}ArrayOfDailyRoutingSession" minOccurs="0"/&gt;
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
    "passTemplateEntityKey",
    "routingSessions"
})
@XmlRootElement(name = "UpdateActivePass")
public class UpdateActivePass {

    protected Long passTemplateEntityKey;
    @XmlElementRef(name = "routingSessions", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDailyRoutingSession> routingSessions;

    /**
     * Obtém o valor da propriedade passTemplateEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPassTemplateEntityKey() {
        return passTemplateEntityKey;
    }

    /**
     * Define o valor da propriedade passTemplateEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPassTemplateEntityKey(Long value) {
        this.passTemplateEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routingSessions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDailyRoutingSession }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDailyRoutingSession> getRoutingSessions() {
        return routingSessions;
    }

    /**
     * Define o valor da propriedade routingSessions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDailyRoutingSession }{@code >}
     *     
     */
    public void setRoutingSessions(JAXBElement<ArrayOfDailyRoutingSession> value) {
        this.routingSessions = value;
    }

}
