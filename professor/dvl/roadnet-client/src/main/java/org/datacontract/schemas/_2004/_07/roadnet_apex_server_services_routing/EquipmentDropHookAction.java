
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.EquipmentDescriptor;
import com.roadnet.apex.datacontracts.StopIdentity;


/**
 * <p>Classe Java de EquipmentDropHookAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentDropHookAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MobileDeviceAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Equipment" type="{http://roadnet.com/apex/DataContracts/}EquipmentDescriptor" minOccurs="0"/&gt;
 *         &lt;element name="IsHook" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTrailerEmpty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopKey" type="{http://roadnet.com/apex/DataContracts/}Stop.Identity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentDropHookAction", propOrder = {
    "equipment",
    "isHook",
    "isTrailerEmpty",
    "stopKey"
})
public class EquipmentDropHookAction
    extends MobileDeviceAction
{

    @XmlElementRef(name = "Equipment", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<EquipmentDescriptor> equipment;
    @XmlElement(name = "IsHook")
    protected Boolean isHook;
    @XmlElement(name = "IsTrailerEmpty")
    protected Boolean isTrailerEmpty;
    @XmlElementRef(name = "StopKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<StopIdentity> stopKey;

    /**
     * Obtém o valor da propriedade equipment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EquipmentDescriptor }{@code >}
     *     
     */
    public JAXBElement<EquipmentDescriptor> getEquipment() {
        return equipment;
    }

    /**
     * Define o valor da propriedade equipment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EquipmentDescriptor }{@code >}
     *     
     */
    public void setEquipment(JAXBElement<EquipmentDescriptor> value) {
        this.equipment = value;
    }

    /**
     * Obtém o valor da propriedade isHook.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHook() {
        return isHook;
    }

    /**
     * Define o valor da propriedade isHook.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHook(Boolean value) {
        this.isHook = value;
    }

    /**
     * Obtém o valor da propriedade isTrailerEmpty.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTrailerEmpty() {
        return isTrailerEmpty;
    }

    /**
     * Define o valor da propriedade isTrailerEmpty.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTrailerEmpty(Boolean value) {
        this.isTrailerEmpty = value;
    }

    /**
     * Obtém o valor da propriedade stopKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}
     *     
     */
    public JAXBElement<StopIdentity> getStopKey() {
        return stopKey;
    }

    /**
     * Define o valor da propriedade stopKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}
     *     
     */
    public void setStopKey(JAXBElement<StopIdentity> value) {
        this.stopKey = value;
    }

}
