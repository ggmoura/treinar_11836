
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfRecurringOrder;
import com.roadnet.apex.datacontracts.ArrayOfTerritory;


/**
 * <p>Classe Java de RecurringOrderManipulationResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RecurringOrderManipulationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ManipulationResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecurringOrders" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRecurringOrder" minOccurs="0"/&gt;
 *         &lt;element name="Territories" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTerritory" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringOrderManipulationResult", propOrder = {
    "recurringOrders",
    "territories"
})
public class RecurringOrderManipulationResult
    extends ManipulationResult
{

    @XmlElementRef(name = "RecurringOrders", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRecurringOrder> recurringOrders;
    @XmlElementRef(name = "Territories", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTerritory> territories;

    /**
     * Obtém o valor da propriedade recurringOrders.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRecurringOrder }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRecurringOrder> getRecurringOrders() {
        return recurringOrders;
    }

    /**
     * Define o valor da propriedade recurringOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRecurringOrder }{@code >}
     *     
     */
    public void setRecurringOrders(JAXBElement<ArrayOfRecurringOrder> value) {
        this.recurringOrders = value;
    }

    /**
     * Obtém o valor da propriedade territories.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTerritory }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTerritory> getTerritories() {
        return territories;
    }

    /**
     * Define o valor da propriedade territories.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTerritory }{@code >}
     *     
     */
    public void setTerritories(JAXBElement<ArrayOfTerritory> value) {
        this.territories = value;
    }

}
