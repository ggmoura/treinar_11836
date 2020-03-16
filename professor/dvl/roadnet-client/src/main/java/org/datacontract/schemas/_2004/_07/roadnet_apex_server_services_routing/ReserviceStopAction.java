
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ReserviceStopAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReserviceStopAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}StopBasedActionDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReserviceAsDeviceStopId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="StopIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReserviceStopAction", propOrder = {
    "reserviceAsDeviceStopId",
    "stopIndex"
})
public class ReserviceStopAction
    extends StopBasedActionDto
{

    @XmlElementRef(name = "ReserviceAsDeviceStopId", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> reserviceAsDeviceStopId;
    @XmlElementRef(name = "StopIndex", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stopIndex;

    /**
     * Obtém o valor da propriedade reserviceAsDeviceStopId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getReserviceAsDeviceStopId() {
        return reserviceAsDeviceStopId;
    }

    /**
     * Define o valor da propriedade reserviceAsDeviceStopId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setReserviceAsDeviceStopId(JAXBElement<Long> value) {
        this.reserviceAsDeviceStopId = value;
    }

    /**
     * Obtém o valor da propriedade stopIndex.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStopIndex() {
        return stopIndex;
    }

    /**
     * Define o valor da propriedade stopIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStopIndex(JAXBElement<Integer> value) {
        this.stopIndex = value;
    }

}
