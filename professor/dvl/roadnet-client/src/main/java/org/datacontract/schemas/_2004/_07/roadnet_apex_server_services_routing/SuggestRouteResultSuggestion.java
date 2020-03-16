
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RouteResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de SuggestRouteResult.Suggestion complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SuggestRouteResult.Suggestion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Impact" type="{http://roadnet.com/apex/DataContracts/}RouteResult" minOccurs="0"/&gt;
 *         &lt;element name="Placement" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}Placement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestRouteResult.Suggestion", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", propOrder = {
    "impact",
    "placement"
})
public class SuggestRouteResultSuggestion
    extends DataTransferObject
{

    @XmlElementRef(name = "Impact", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteResult> impact;
    @XmlElementRef(name = "Placement", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", type = JAXBElement.class, required = false)
    protected JAXBElement<Placement> placement;

    /**
     * Obtém o valor da propriedade impact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteResult }{@code >}
     *     
     */
    public JAXBElement<RouteResult> getImpact() {
        return impact;
    }

    /**
     * Define o valor da propriedade impact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteResult }{@code >}
     *     
     */
    public void setImpact(JAXBElement<RouteResult> value) {
        this.impact = value;
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

}
