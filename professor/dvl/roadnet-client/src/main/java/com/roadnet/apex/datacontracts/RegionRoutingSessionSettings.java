
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de Region.RoutingSessionSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Region.RoutingSessionSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutoCreateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AutoCreateSession" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessionDay_Day" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Region.RoutingSessionSettings", propOrder = {
    "autoCreateDescription",
    "autoCreateSession",
    "routingSessionDayDay"
})
public class RegionRoutingSessionSettings
    extends DataTransferObject
{

    @XmlElementRef(name = "AutoCreateDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> autoCreateDescription;
    @XmlElement(name = "AutoCreateSession")
    protected Boolean autoCreateSession;
    @XmlElementRef(name = "RoutingSessionDay_Day", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routingSessionDayDay;

    /**
     * Obtém o valor da propriedade autoCreateDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAutoCreateDescription() {
        return autoCreateDescription;
    }

    /**
     * Define o valor da propriedade autoCreateDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAutoCreateDescription(JAXBElement<String> value) {
        this.autoCreateDescription = value;
    }

    /**
     * Obtém o valor da propriedade autoCreateSession.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoCreateSession() {
        return autoCreateSession;
    }

    /**
     * Define o valor da propriedade autoCreateSession.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCreateSession(Boolean value) {
        this.autoCreateSession = value;
    }

    /**
     * Obtém o valor da propriedade routingSessionDayDay.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoutingSessionDayDay() {
        return routingSessionDayDay;
    }

    /**
     * Define o valor da propriedade routingSessionDayDay.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoutingSessionDayDay(JAXBElement<String> value) {
        this.routingSessionDayDay = value;
    }

}
