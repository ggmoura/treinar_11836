
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.GroupStopIdentity;


/**
 * <p>Classe Java de GroupStopBasedAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GroupStopBasedAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MobileDeviceAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupStopKey" type="{http://roadnet.com/apex/DataContracts/}GroupStop.Identity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupStopBasedAction", propOrder = {
    "groupStopKey"
})
@XmlSeeAlso({
    ArriveGroupStopAction.class,
    DepartGroupStopAction.class
})
public class GroupStopBasedAction
    extends MobileDeviceAction
{

    @XmlElementRef(name = "GroupStopKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<GroupStopIdentity> groupStopKey;

    /**
     * Obtém o valor da propriedade groupStopKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GroupStopIdentity }{@code >}
     *     
     */
    public JAXBElement<GroupStopIdentity> getGroupStopKey() {
        return groupStopKey;
    }

    /**
     * Define o valor da propriedade groupStopKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GroupStopIdentity }{@code >}
     *     
     */
    public void setGroupStopKey(JAXBElement<GroupStopIdentity> value) {
        this.groupStopKey = value;
    }

}
