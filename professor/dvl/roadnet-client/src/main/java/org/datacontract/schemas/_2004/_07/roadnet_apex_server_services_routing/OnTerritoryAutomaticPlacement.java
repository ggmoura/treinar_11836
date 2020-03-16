
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OnTerritoryAutomaticPlacement complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OnTerritoryAutomaticPlacement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}AutomaticPlacement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MoveRecurringOrderOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MoveRecurringOrderOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnTerritoryAutomaticPlacement", propOrder = {
    "moveRecurringOrderOptions"
})
public class OnTerritoryAutomaticPlacement
    extends AutomaticPlacement
{

    @XmlElementRef(name = "MoveRecurringOrderOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<MoveRecurringOrderOptions> moveRecurringOrderOptions;

    /**
     * Obtém o valor da propriedade moveRecurringOrderOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoveRecurringOrderOptions }{@code >}
     *     
     */
    public JAXBElement<MoveRecurringOrderOptions> getMoveRecurringOrderOptions() {
        return moveRecurringOrderOptions;
    }

    /**
     * Define o valor da propriedade moveRecurringOrderOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoveRecurringOrderOptions }{@code >}
     *     
     */
    public void setMoveRecurringOrderOptions(JAXBElement<MoveRecurringOrderOptions> value) {
        this.moveRecurringOrderOptions = value;
    }

}
