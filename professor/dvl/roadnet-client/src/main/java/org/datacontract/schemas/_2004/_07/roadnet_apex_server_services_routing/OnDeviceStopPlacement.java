
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OnDeviceStopPlacement complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OnDeviceStopPlacement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}Placement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeviceStopId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OnStopPlacement_Position_Place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnDeviceStopPlacement", propOrder = {
    "deviceStopId",
    "onStopPlacementPositionPlace"
})
public class OnDeviceStopPlacement
    extends Placement
{

    @XmlElement(name = "DeviceStopId")
    protected Long deviceStopId;
    @XmlElementRef(name = "OnStopPlacement_Position_Place", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> onStopPlacementPositionPlace;

    /**
     * Obtém o valor da propriedade deviceStopId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeviceStopId() {
        return deviceStopId;
    }

    /**
     * Define o valor da propriedade deviceStopId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeviceStopId(Long value) {
        this.deviceStopId = value;
    }

    /**
     * Obtém o valor da propriedade onStopPlacementPositionPlace.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOnStopPlacementPositionPlace() {
        return onStopPlacementPositionPlace;
    }

    /**
     * Define o valor da propriedade onStopPlacementPositionPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOnStopPlacementPositionPlace(JAXBElement<String> value) {
        this.onStopPlacementPositionPlace = value;
    }

}
