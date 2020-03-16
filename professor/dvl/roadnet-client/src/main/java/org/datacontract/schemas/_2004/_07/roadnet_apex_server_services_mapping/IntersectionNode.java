
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfNetworkPenalizedTurn;


/**
 * <p>Classe Java de IntersectionNode complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IntersectionNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}MapNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HasPenalizedTurns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PenalizedTurns" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNetworkPenalizedTurn" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntersectionNode", propOrder = {
    "hasPenalizedTurns",
    "penalizedTurns"
})
public class IntersectionNode
    extends MapNode
{

    @XmlElement(name = "HasPenalizedTurns")
    protected Boolean hasPenalizedTurns;
    @XmlElementRef(name = "PenalizedTurns", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkPenalizedTurn> penalizedTurns;

    /**
     * Obtém o valor da propriedade hasPenalizedTurns.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPenalizedTurns() {
        return hasPenalizedTurns;
    }

    /**
     * Define o valor da propriedade hasPenalizedTurns.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPenalizedTurns(Boolean value) {
        this.hasPenalizedTurns = value;
    }

    /**
     * Obtém o valor da propriedade penalizedTurns.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkPenalizedTurn }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkPenalizedTurn> getPenalizedTurns() {
        return penalizedTurns;
    }

    /**
     * Define o valor da propriedade penalizedTurns.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkPenalizedTurn }{@code >}
     *     
     */
    public void setPenalizedTurns(JAXBElement<ArrayOfNetworkPenalizedTurn> value) {
        this.penalizedTurns = value;
    }

}
