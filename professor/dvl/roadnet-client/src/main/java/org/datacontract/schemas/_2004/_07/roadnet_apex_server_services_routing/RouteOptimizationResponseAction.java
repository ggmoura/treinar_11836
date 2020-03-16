
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de RouteOptimizationResponseAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteOptimizationResponseAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MobileDeviceAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RejectionReasonCodeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ResponseTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RouteOptimizationSuggestionKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RouteSuggestionStatus_SuggestionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteOptimizationResponseAction", propOrder = {
    "rejectionReasonCodeEntityKey",
    "responseTime",
    "routeOptimizationSuggestionKey",
    "routeSuggestionStatusSuggestionStatus"
})
public class RouteOptimizationResponseAction
    extends MobileDeviceAction
{

    @XmlElementRef(name = "RejectionReasonCodeEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> rejectionReasonCodeEntityKey;
    @XmlElement(name = "ResponseTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseTime;
    @XmlElement(name = "RouteOptimizationSuggestionKey")
    protected Long routeOptimizationSuggestionKey;
    @XmlElementRef(name = "RouteSuggestionStatus_SuggestionStatus", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeSuggestionStatusSuggestionStatus;

    /**
     * Obtém o valor da propriedade rejectionReasonCodeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRejectionReasonCodeEntityKey() {
        return rejectionReasonCodeEntityKey;
    }

    /**
     * Define o valor da propriedade rejectionReasonCodeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRejectionReasonCodeEntityKey(JAXBElement<Long> value) {
        this.rejectionReasonCodeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade responseTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseTime() {
        return responseTime;
    }

    /**
     * Define o valor da propriedade responseTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseTime(XMLGregorianCalendar value) {
        this.responseTime = value;
    }

    /**
     * Obtém o valor da propriedade routeOptimizationSuggestionKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRouteOptimizationSuggestionKey() {
        return routeOptimizationSuggestionKey;
    }

    /**
     * Define o valor da propriedade routeOptimizationSuggestionKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRouteOptimizationSuggestionKey(Long value) {
        this.routeOptimizationSuggestionKey = value;
    }

    /**
     * Obtém o valor da propriedade routeSuggestionStatusSuggestionStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteSuggestionStatusSuggestionStatus() {
        return routeSuggestionStatusSuggestionStatus;
    }

    /**
     * Define o valor da propriedade routeSuggestionStatusSuggestionStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteSuggestionStatusSuggestionStatus(JAXBElement<String> value) {
        this.routeSuggestionStatusSuggestionStatus = value;
    }

}
