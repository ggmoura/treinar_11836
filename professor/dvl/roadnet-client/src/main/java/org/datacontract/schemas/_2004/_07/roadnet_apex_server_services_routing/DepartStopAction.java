
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.QualityPairedDateTime;
import com.roadnet.apex.datacontracts.QualityPairedDistance;


/**
 * <p>Classe Java de DepartStopAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DepartStopAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}StopBasedActionDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Consignee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTime" type="{http://roadnet.com/apex/DataContracts/}QualityPairedDateTime" minOccurs="0"/&gt;
 *         &lt;element name="DistanceTo" type="{http://roadnet.com/apex/DataContracts/}QualityPairedDistance" minOccurs="0"/&gt;
 *         &lt;element name="GroupStopDeviceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="IsSuspended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReserviceAsDeviceStopId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ReservicePlacement" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}Placement" minOccurs="0"/&gt;
 *         &lt;element name="UnserviceableReasonCodeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="WasUnserviceable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartStopAction", propOrder = {
    "consignee",
    "departureTime",
    "distanceTo",
    "groupStopDeviceId",
    "isSuspended",
    "reserviceAsDeviceStopId",
    "reservicePlacement",
    "unserviceableReasonCodeEntityKey",
    "wasUnserviceable"
})
public class DepartStopAction
    extends StopBasedActionDto
{

    @XmlElementRef(name = "Consignee", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consignee;
    @XmlElementRef(name = "DepartureTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityPairedDateTime> departureTime;
    @XmlElementRef(name = "DistanceTo", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityPairedDistance> distanceTo;
    @XmlElementRef(name = "GroupStopDeviceId", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> groupStopDeviceId;
    @XmlElement(name = "IsSuspended")
    protected Boolean isSuspended;
    @XmlElementRef(name = "ReserviceAsDeviceStopId", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> reserviceAsDeviceStopId;
    @XmlElementRef(name = "ReservicePlacement", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Placement> reservicePlacement;
    @XmlElementRef(name = "UnserviceableReasonCodeEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> unserviceableReasonCodeEntityKey;
    @XmlElement(name = "WasUnserviceable")
    protected Boolean wasUnserviceable;

    /**
     * Obtém o valor da propriedade consignee.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsignee() {
        return consignee;
    }

    /**
     * Define o valor da propriedade consignee.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsignee(JAXBElement<String> value) {
        this.consignee = value;
    }

    /**
     * Obtém o valor da propriedade departureTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public JAXBElement<QualityPairedDateTime> getDepartureTime() {
        return departureTime;
    }

    /**
     * Define o valor da propriedade departureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public void setDepartureTime(JAXBElement<QualityPairedDateTime> value) {
        this.departureTime = value;
    }

    /**
     * Obtém o valor da propriedade distanceTo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDistance }{@code >}
     *     
     */
    public JAXBElement<QualityPairedDistance> getDistanceTo() {
        return distanceTo;
    }

    /**
     * Define o valor da propriedade distanceTo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDistance }{@code >}
     *     
     */
    public void setDistanceTo(JAXBElement<QualityPairedDistance> value) {
        this.distanceTo = value;
    }

    /**
     * Obtém o valor da propriedade groupStopDeviceId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getGroupStopDeviceId() {
        return groupStopDeviceId;
    }

    /**
     * Define o valor da propriedade groupStopDeviceId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setGroupStopDeviceId(JAXBElement<Long> value) {
        this.groupStopDeviceId = value;
    }

    /**
     * Obtém o valor da propriedade isSuspended.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSuspended() {
        return isSuspended;
    }

    /**
     * Define o valor da propriedade isSuspended.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSuspended(Boolean value) {
        this.isSuspended = value;
    }

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
     * Obtém o valor da propriedade reservicePlacement.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Placement }{@code >}
     *     
     */
    public JAXBElement<Placement> getReservicePlacement() {
        return reservicePlacement;
    }

    /**
     * Define o valor da propriedade reservicePlacement.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Placement }{@code >}
     *     
     */
    public void setReservicePlacement(JAXBElement<Placement> value) {
        this.reservicePlacement = value;
    }

    /**
     * Obtém o valor da propriedade unserviceableReasonCodeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUnserviceableReasonCodeEntityKey() {
        return unserviceableReasonCodeEntityKey;
    }

    /**
     * Define o valor da propriedade unserviceableReasonCodeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUnserviceableReasonCodeEntityKey(JAXBElement<Long> value) {
        this.unserviceableReasonCodeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade wasUnserviceable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWasUnserviceable() {
        return wasUnserviceable;
    }

    /**
     * Define o valor da propriedade wasUnserviceable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWasUnserviceable(Boolean value) {
        this.wasUnserviceable = value;
    }

}
