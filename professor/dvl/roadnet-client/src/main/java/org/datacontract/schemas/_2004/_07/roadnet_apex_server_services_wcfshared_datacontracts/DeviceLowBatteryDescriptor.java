
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.BatteryState;


/**
 * <p>Classe Java de DeviceLowBatteryDescriptor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DeviceLowBatteryDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions}ResourceExceptionSpecialDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BatteryState" type="{http://roadnet.com/apex/DataContracts/}BatteryState" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceLowBatteryDescriptor", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", propOrder = {
    "batteryState"
})
public class DeviceLowBatteryDescriptor
    extends ResourceExceptionSpecialDescriptor
{

    @XmlElementRef(name = "BatteryState", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<BatteryState> batteryState;

    /**
     * Obtém o valor da propriedade batteryState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BatteryState }{@code >}
     *     
     */
    public JAXBElement<BatteryState> getBatteryState() {
        return batteryState;
    }

    /**
     * Define o valor da propriedade batteryState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BatteryState }{@code >}
     *     
     */
    public void setBatteryState(JAXBElement<BatteryState> value) {
        this.batteryState = value;
    }

}
