
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de TelematicsDevice.TelematicsDeviceHardware complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TelematicsDevice.TelematicsDeviceHardware"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EngineDeratingDevice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IgnitionKillSwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelematicsDevice.TelematicsDeviceHardware", propOrder = {
    "engineDeratingDevice",
    "ignitionKillSwitch"
})
public class TelematicsDeviceTelematicsDeviceHardware
    extends DataTransferObject
{

    @XmlElement(name = "EngineDeratingDevice")
    protected Boolean engineDeratingDevice;
    @XmlElement(name = "IgnitionKillSwitch")
    protected Boolean ignitionKillSwitch;

    /**
     * Obtém o valor da propriedade engineDeratingDevice.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEngineDeratingDevice() {
        return engineDeratingDevice;
    }

    /**
     * Define o valor da propriedade engineDeratingDevice.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEngineDeratingDevice(Boolean value) {
        this.engineDeratingDevice = value;
    }

    /**
     * Obtém o valor da propriedade ignitionKillSwitch.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnitionKillSwitch() {
        return ignitionKillSwitch;
    }

    /**
     * Define o valor da propriedade ignitionKillSwitch.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnitionKillSwitch(Boolean value) {
        this.ignitionKillSwitch = value;
    }

}
