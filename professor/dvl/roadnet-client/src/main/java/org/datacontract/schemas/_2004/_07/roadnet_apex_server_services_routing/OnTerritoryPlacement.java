
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OnTerritoryPlacement complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OnTerritoryPlacement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}Placement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MoveRecurringOrderOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MoveRecurringOrderOptions" minOccurs="0"/&gt;
 *         &lt;element name="Position_PositionOnRoutes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnTerritoryPlacement", propOrder = {
    "moveRecurringOrderOptions",
    "positionPositionOnRoutes"
})
public class OnTerritoryPlacement
    extends Placement
{

    @XmlElementRef(name = "MoveRecurringOrderOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<MoveRecurringOrderOptions> moveRecurringOrderOptions;
    @XmlElementRef(name = "Position_PositionOnRoutes", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> positionPositionOnRoutes;

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

    /**
     * Obtém o valor da propriedade positionPositionOnRoutes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPositionPositionOnRoutes() {
        return positionPositionOnRoutes;
    }

    /**
     * Define o valor da propriedade positionPositionOnRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPositionPositionOnRoutes(JAXBElement<String> value) {
        this.positionPositionOnRoutes = value;
    }

}
