
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.ArrayOfStopIdentity;


/**
 * <p>Classe Java de CancelStopsAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CancelStopsAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MobileDeviceAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancelTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RemoveStopOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}RemoveStopOptions" minOccurs="0"/&gt;
 *         &lt;element name="StopKeys" type="{http://roadnet.com/apex/DataContracts/}ArrayOfStop.Identity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelStopsAction", propOrder = {
    "cancelTime",
    "removeStopOptions",
    "stopKeys"
})
public class CancelStopsAction
    extends MobileDeviceAction
{

    @XmlElementRef(name = "CancelTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> cancelTime;
    @XmlElementRef(name = "RemoveStopOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<RemoveStopOptions> removeStopOptions;
    @XmlElementRef(name = "StopKeys", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStopIdentity> stopKeys;

    /**
     * Obtém o valor da propriedade cancelTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCancelTime() {
        return cancelTime;
    }

    /**
     * Define o valor da propriedade cancelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCancelTime(JAXBElement<XMLGregorianCalendar> value) {
        this.cancelTime = value;
    }

    /**
     * Obtém o valor da propriedade removeStopOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemoveStopOptions }{@code >}
     *     
     */
    public JAXBElement<RemoveStopOptions> getRemoveStopOptions() {
        return removeStopOptions;
    }

    /**
     * Define o valor da propriedade removeStopOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemoveStopOptions }{@code >}
     *     
     */
    public void setRemoveStopOptions(JAXBElement<RemoveStopOptions> value) {
        this.removeStopOptions = value;
    }

    /**
     * Obtém o valor da propriedade stopKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStopIdentity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStopIdentity> getStopKeys() {
        return stopKeys;
    }

    /**
     * Define o valor da propriedade stopKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStopIdentity }{@code >}
     *     
     */
    public void setStopKeys(JAXBElement<ArrayOfStopIdentity> value) {
        this.stopKeys = value;
    }

}
