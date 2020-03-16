
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpgradeRoadnetTelematicsDeviceConfigurationInfo" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}UpgradeRoadnetTelematicsDeviceConfigurationInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo", propOrder = {
    "upgradeRoadnetTelematicsDeviceConfigurationInfo"
})
public class ArrayOfUpgradeRoadnetTelematicsDeviceConfigurationInfo {

    @XmlElement(name = "UpgradeRoadnetTelematicsDeviceConfigurationInfo", nillable = true)
    protected List<UpgradeRoadnetTelematicsDeviceConfigurationInfo> upgradeRoadnetTelematicsDeviceConfigurationInfo;

    /**
     * Gets the value of the upgradeRoadnetTelematicsDeviceConfigurationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the upgradeRoadnetTelematicsDeviceConfigurationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpgradeRoadnetTelematicsDeviceConfigurationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpgradeRoadnetTelematicsDeviceConfigurationInfo }
     * 
     * 
     */
    public List<UpgradeRoadnetTelematicsDeviceConfigurationInfo> getUpgradeRoadnetTelematicsDeviceConfigurationInfo() {
        if (upgradeRoadnetTelematicsDeviceConfigurationInfo == null) {
            upgradeRoadnetTelematicsDeviceConfigurationInfo = new ArrayList<UpgradeRoadnetTelematicsDeviceConfigurationInfo>();
        }
        return this.upgradeRoadnetTelematicsDeviceConfigurationInfo;
    }

}
