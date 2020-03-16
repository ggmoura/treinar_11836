
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de NetworkPenalizedTurn complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkPenalizedTurn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderedArcIDs" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNetworkID" minOccurs="0"/&gt;
 *         &lt;element name="TurnPenaltyPoint" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="TurnRules" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNetworkTurnRule" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkPenalizedTurn", propOrder = {
    "orderedArcIDs",
    "turnPenaltyPoint",
    "turnRules"
})
public class NetworkPenalizedTurn
    extends DataTransferObject
{

    @XmlElementRef(name = "OrderedArcIDs", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkID> orderedArcIDs;
    @XmlElementRef(name = "TurnPenaltyPoint", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> turnPenaltyPoint;
    @XmlElementRef(name = "TurnRules", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkTurnRule> turnRules;

    /**
     * Obtém o valor da propriedade orderedArcIDs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkID }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkID> getOrderedArcIDs() {
        return orderedArcIDs;
    }

    /**
     * Define o valor da propriedade orderedArcIDs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkID }{@code >}
     *     
     */
    public void setOrderedArcIDs(JAXBElement<ArrayOfNetworkID> value) {
        this.orderedArcIDs = value;
    }

    /**
     * Obtém o valor da propriedade turnPenaltyPoint.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getTurnPenaltyPoint() {
        return turnPenaltyPoint;
    }

    /**
     * Define o valor da propriedade turnPenaltyPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setTurnPenaltyPoint(JAXBElement<Coordinate> value) {
        this.turnPenaltyPoint = value;
    }

    /**
     * Obtém o valor da propriedade turnRules.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkTurnRule }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkTurnRule> getTurnRules() {
        return turnRules;
    }

    /**
     * Define o valor da propriedade turnRules.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkTurnRule }{@code >}
     *     
     */
    public void setTurnRules(JAXBElement<ArrayOfNetworkTurnRule> value) {
        this.turnRules = value;
    }

}
