
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfDailyStopPosition;


/**
 * <p>Classe Java de OnTerritoryAndRoutesPlacement complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OnTerritoryAndRoutesPlacement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}Placement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoutePlacements" type="{http://roadnet.com/apex/DataContracts/}ArrayOfDailyStopPosition" minOccurs="0"/&gt;
 *         &lt;element name="ServicePatternEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnTerritoryAndRoutesPlacement", propOrder = {
    "routePlacements",
    "servicePatternEntityKey"
})
public class OnTerritoryAndRoutesPlacement
    extends Placement
{

    @XmlElementRef(name = "RoutePlacements", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDailyStopPosition> routePlacements;
    @XmlElementRef(name = "ServicePatternEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> servicePatternEntityKey;

    /**
     * Obtém o valor da propriedade routePlacements.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDailyStopPosition }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDailyStopPosition> getRoutePlacements() {
        return routePlacements;
    }

    /**
     * Define o valor da propriedade routePlacements.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDailyStopPosition }{@code >}
     *     
     */
    public void setRoutePlacements(JAXBElement<ArrayOfDailyStopPosition> value) {
        this.routePlacements = value;
    }

    /**
     * Obtém o valor da propriedade servicePatternEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServicePatternEntityKey() {
        return servicePatternEntityKey;
    }

    /**
     * Define o valor da propriedade servicePatternEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServicePatternEntityKey(JAXBElement<Long> value) {
        this.servicePatternEntityKey = value;
    }

}
