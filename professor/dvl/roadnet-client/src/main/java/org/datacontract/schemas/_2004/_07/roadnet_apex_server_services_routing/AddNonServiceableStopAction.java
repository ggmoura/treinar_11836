
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.SaveNonServiceableStopArgs;
import com.roadnet.apex.datacontracts.StopIdentity;


/**
 * <p>Classe Java de AddNonServiceableStopAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AddNonServiceableStopAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MobileDeviceAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsLayover" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NonServiceableStopArgs" type="{http://roadnet.com/apex/DataContracts/}SaveNonServiceableStopArgs" minOccurs="0"/&gt;
 *         &lt;element name="Placement" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}Placement" minOccurs="0"/&gt;
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
@XmlType(name = "AddNonServiceableStopAction", propOrder = {
    "isLayover",
    "nonServiceableStopArgs",
    "placement",
    "stopKey"
})
public class AddNonServiceableStopAction
    extends MobileDeviceAction
{

    @XmlElement(name = "IsLayover")
    protected Boolean isLayover;
    @XmlElementRef(name = "NonServiceableStopArgs", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<SaveNonServiceableStopArgs> nonServiceableStopArgs;
    @XmlElementRef(name = "Placement", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Placement> placement;
    @XmlElementRef(name = "StopKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<StopIdentity> stopKey;

    /**
     * Obtém o valor da propriedade isLayover.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLayover() {
        return isLayover;
    }

    /**
     * Define o valor da propriedade isLayover.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLayover(Boolean value) {
        this.isLayover = value;
    }

    /**
     * Obtém o valor da propriedade nonServiceableStopArgs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SaveNonServiceableStopArgs }{@code >}
     *     
     */
    public JAXBElement<SaveNonServiceableStopArgs> getNonServiceableStopArgs() {
        return nonServiceableStopArgs;
    }

    /**
     * Define o valor da propriedade nonServiceableStopArgs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SaveNonServiceableStopArgs }{@code >}
     *     
     */
    public void setNonServiceableStopArgs(JAXBElement<SaveNonServiceableStopArgs> value) {
        this.nonServiceableStopArgs = value;
    }

    /**
     * Obtém o valor da propriedade placement.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Placement }{@code >}
     *     
     */
    public JAXBElement<Placement> getPlacement() {
        return placement;
    }

    /**
     * Define o valor da propriedade placement.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Placement }{@code >}
     *     
     */
    public void setPlacement(JAXBElement<Placement> value) {
        this.placement = value;
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
