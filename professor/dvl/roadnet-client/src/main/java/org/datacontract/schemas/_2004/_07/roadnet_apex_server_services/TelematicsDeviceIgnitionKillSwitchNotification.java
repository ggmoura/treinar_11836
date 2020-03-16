
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.Notification;


/**
 * <p>Classe Java de TelematicsDeviceIgnitionKillSwitchNotification complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TelematicsDeviceIgnitionKillSwitchNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}Notification"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IgnitionKillSwitchEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelematicsDeviceIgnitionKillSwitchNotification", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", propOrder = {
    "ignitionKillSwitchEnabled"
})
public class TelematicsDeviceIgnitionKillSwitchNotification
    extends Notification
{

    @XmlElement(name = "IgnitionKillSwitchEnabled")
    protected Boolean ignitionKillSwitchEnabled;

    /**
     * Obtém o valor da propriedade ignitionKillSwitchEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnitionKillSwitchEnabled() {
        return ignitionKillSwitchEnabled;
    }

    /**
     * Define o valor da propriedade ignitionKillSwitchEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnitionKillSwitchEnabled(Boolean value) {
        this.ignitionKillSwitchEnabled = value;
    }

}
