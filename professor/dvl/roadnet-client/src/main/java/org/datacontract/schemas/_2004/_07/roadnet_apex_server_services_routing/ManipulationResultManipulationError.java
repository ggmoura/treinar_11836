
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import com.roadnet.apex.datacontracts.TransferErrorCode;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ManipulationResult.ManipulationError complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ManipulationResult.ManipulationError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MatchingPatternEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="OrderEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Reason" type="{http://roadnet.com/apex/DataContracts/}TransferErrorCode" minOccurs="0"/&gt;
 *         &lt;element name="RouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="StopEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManipulationResult.ManipulationError", propOrder = {
    "locationEntityKey",
    "matchingPatternEntityKeys",
    "orderEntityKey",
    "reason",
    "routeEntityKey",
    "stopEntityKey"
})
public class ManipulationResultManipulationError
    extends DataTransferObject
{

    @XmlElement(name = "LocationEntityKey")
    protected Long locationEntityKey;
    @XmlElementRef(name = "MatchingPatternEntityKeys", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> matchingPatternEntityKeys;
    @XmlElementRef(name = "OrderEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> orderEntityKey;
    @XmlElementRef(name = "Reason", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<TransferErrorCode> reason;
    @XmlElement(name = "RouteEntityKey")
    protected Long routeEntityKey;
    @XmlElementRef(name = "StopEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> stopEntityKey;

    /**
     * Obtém o valor da propriedade locationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocationEntityKey() {
        return locationEntityKey;
    }

    /**
     * Define o valor da propriedade locationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocationEntityKey(Long value) {
        this.locationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade matchingPatternEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getMatchingPatternEntityKeys() {
        return matchingPatternEntityKeys;
    }

    /**
     * Define o valor da propriedade matchingPatternEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setMatchingPatternEntityKeys(JAXBElement<ArrayOflong> value) {
        this.matchingPatternEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade orderEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOrderEntityKey() {
        return orderEntityKey;
    }

    /**
     * Define o valor da propriedade orderEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOrderEntityKey(JAXBElement<Long> value) {
        this.orderEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade reason.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransferErrorCode }{@code >}
     *     
     */
    public JAXBElement<TransferErrorCode> getReason() {
        return reason;
    }

    /**
     * Define o valor da propriedade reason.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransferErrorCode }{@code >}
     *     
     */
    public void setReason(JAXBElement<TransferErrorCode> value) {
        this.reason = value;
    }

    /**
     * Obtém o valor da propriedade routeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRouteEntityKey() {
        return routeEntityKey;
    }

    /**
     * Define o valor da propriedade routeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRouteEntityKey(Long value) {
        this.routeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade stopEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getStopEntityKey() {
        return stopEntityKey;
    }

    /**
     * Define o valor da propriedade stopEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setStopEntityKey(JAXBElement<Long> value) {
        this.stopEntityKey = value;
    }

}
