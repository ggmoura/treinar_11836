
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de RoutingResult.NotRoutedOrderResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RoutingResult.NotRoutedOrderResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotRoutedOrderReason_ReasonNotOnNearbyRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotRoutedOrderReason_ReasonNotOnNewRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderClassEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OrderEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OrderIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderLocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderType_OrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TargetRouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TargetRouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingResult.NotRoutedOrderResult", propOrder = {
    "notRoutedOrderReasonReasonNotOnNearbyRoute",
    "notRoutedOrderReasonReasonNotOnNewRoute",
    "orderClassEntityKey",
    "orderEntityKey",
    "orderIdentifier",
    "orderLocationDescription",
    "orderLocationIdentifier",
    "orderTypeOrderType",
    "targetRouteEntityKey",
    "targetRouteIdentifier"
})
public class RoutingResultNotRoutedOrderResult
    extends DataTransferObject
{

    @XmlElementRef(name = "NotRoutedOrderReason_ReasonNotOnNearbyRoute", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notRoutedOrderReasonReasonNotOnNearbyRoute;
    @XmlElementRef(name = "NotRoutedOrderReason_ReasonNotOnNewRoute", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notRoutedOrderReasonReasonNotOnNewRoute;
    @XmlElement(name = "OrderClassEntityKey")
    protected Long orderClassEntityKey;
    @XmlElement(name = "OrderEntityKey")
    protected Long orderEntityKey;
    @XmlElementRef(name = "OrderIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderIdentifier;
    @XmlElementRef(name = "OrderLocationDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderLocationDescription;
    @XmlElementRef(name = "OrderLocationIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderLocationIdentifier;
    @XmlElementRef(name = "OrderType_OrderType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderTypeOrderType;
    @XmlElementRef(name = "TargetRouteEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> targetRouteEntityKey;
    @XmlElementRef(name = "TargetRouteIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> targetRouteIdentifier;

    /**
     * Obtém o valor da propriedade notRoutedOrderReasonReasonNotOnNearbyRoute.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotRoutedOrderReasonReasonNotOnNearbyRoute() {
        return notRoutedOrderReasonReasonNotOnNearbyRoute;
    }

    /**
     * Define o valor da propriedade notRoutedOrderReasonReasonNotOnNearbyRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotRoutedOrderReasonReasonNotOnNearbyRoute(JAXBElement<String> value) {
        this.notRoutedOrderReasonReasonNotOnNearbyRoute = value;
    }

    /**
     * Obtém o valor da propriedade notRoutedOrderReasonReasonNotOnNewRoute.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotRoutedOrderReasonReasonNotOnNewRoute() {
        return notRoutedOrderReasonReasonNotOnNewRoute;
    }

    /**
     * Define o valor da propriedade notRoutedOrderReasonReasonNotOnNewRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotRoutedOrderReasonReasonNotOnNewRoute(JAXBElement<String> value) {
        this.notRoutedOrderReasonReasonNotOnNewRoute = value;
    }

    /**
     * Obtém o valor da propriedade orderClassEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderClassEntityKey() {
        return orderClassEntityKey;
    }

    /**
     * Define o valor da propriedade orderClassEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderClassEntityKey(Long value) {
        this.orderClassEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderEntityKey() {
        return orderEntityKey;
    }

    /**
     * Define o valor da propriedade orderEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderEntityKey(Long value) {
        this.orderEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderIdentifier() {
        return orderIdentifier;
    }

    /**
     * Define o valor da propriedade orderIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderIdentifier(JAXBElement<String> value) {
        this.orderIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade orderLocationDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderLocationDescription() {
        return orderLocationDescription;
    }

    /**
     * Define o valor da propriedade orderLocationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderLocationDescription(JAXBElement<String> value) {
        this.orderLocationDescription = value;
    }

    /**
     * Obtém o valor da propriedade orderLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderLocationIdentifier() {
        return orderLocationIdentifier;
    }

    /**
     * Define o valor da propriedade orderLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderLocationIdentifier(JAXBElement<String> value) {
        this.orderLocationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade orderTypeOrderType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderTypeOrderType() {
        return orderTypeOrderType;
    }

    /**
     * Define o valor da propriedade orderTypeOrderType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderTypeOrderType(JAXBElement<String> value) {
        this.orderTypeOrderType = value;
    }

    /**
     * Obtém o valor da propriedade targetRouteEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTargetRouteEntityKey() {
        return targetRouteEntityKey;
    }

    /**
     * Define o valor da propriedade targetRouteEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTargetRouteEntityKey(JAXBElement<Long> value) {
        this.targetRouteEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade targetRouteIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTargetRouteIdentifier() {
        return targetRouteIdentifier;
    }

    /**
     * Define o valor da propriedade targetRouteIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTargetRouteIdentifier(JAXBElement<String> value) {
        this.targetRouteIdentifier = value;
    }

}
