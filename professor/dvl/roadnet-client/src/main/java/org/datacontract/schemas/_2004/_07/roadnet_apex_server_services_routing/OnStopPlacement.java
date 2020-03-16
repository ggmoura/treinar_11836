
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OnStopPlacement complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OnStopPlacement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}Placement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CombineIfAbleStopEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Position_Place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StopEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="StopPlacementInfo" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}OnStopPlacementInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnStopPlacement", propOrder = {
    "combineIfAbleStopEntityKey",
    "positionPlace",
    "stopEntityKey",
    "stopPlacementInfo"
})
public class OnStopPlacement
    extends Placement
{

    @XmlElement(name = "CombineIfAbleStopEntityKey")
    protected Long combineIfAbleStopEntityKey;
    @XmlElementRef(name = "Position_Place", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> positionPlace;
    @XmlElement(name = "StopEntityKey")
    protected Long stopEntityKey;
    @XmlElementRef(name = "StopPlacementInfo", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<OnStopPlacementInfo> stopPlacementInfo;

    /**
     * Obtém o valor da propriedade combineIfAbleStopEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCombineIfAbleStopEntityKey() {
        return combineIfAbleStopEntityKey;
    }

    /**
     * Define o valor da propriedade combineIfAbleStopEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCombineIfAbleStopEntityKey(Long value) {
        this.combineIfAbleStopEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade positionPlace.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPositionPlace() {
        return positionPlace;
    }

    /**
     * Define o valor da propriedade positionPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPositionPlace(JAXBElement<String> value) {
        this.positionPlace = value;
    }

    /**
     * Obtém o valor da propriedade stopEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStopEntityKey() {
        return stopEntityKey;
    }

    /**
     * Define o valor da propriedade stopEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStopEntityKey(Long value) {
        this.stopEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade stopPlacementInfo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OnStopPlacementInfo }{@code >}
     *     
     */
    public JAXBElement<OnStopPlacementInfo> getStopPlacementInfo() {
        return stopPlacementInfo;
    }

    /**
     * Define o valor da propriedade stopPlacementInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OnStopPlacementInfo }{@code >}
     *     
     */
    public void setStopPlacementInfo(JAXBElement<OnStopPlacementInfo> value) {
        this.stopPlacementInfo = value;
    }

}
