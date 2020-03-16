
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SendNoteAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SendNoteAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MobileDeviceAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageArgs" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}SendNoteAction.RouteNoteMessageArgs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendNoteAction", propOrder = {
    "messageArgs"
})
public class SendNoteAction
    extends MobileDeviceAction
{

    @XmlElementRef(name = "MessageArgs", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<SendNoteActionRouteNoteMessageArgs> messageArgs;

    /**
     * Obtém o valor da propriedade messageArgs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SendNoteActionRouteNoteMessageArgs }{@code >}
     *     
     */
    public JAXBElement<SendNoteActionRouteNoteMessageArgs> getMessageArgs() {
        return messageArgs;
    }

    /**
     * Define o valor da propriedade messageArgs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SendNoteActionRouteNoteMessageArgs }{@code >}
     *     
     */
    public void setMessageArgs(JAXBElement<SendNoteActionRouteNoteMessageArgs> value) {
        this.messageArgs = value;
    }

}
