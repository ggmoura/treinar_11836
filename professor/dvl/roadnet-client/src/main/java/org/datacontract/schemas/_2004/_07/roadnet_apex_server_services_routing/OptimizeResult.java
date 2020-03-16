
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfRouteResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OptimizeResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OptimizeResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteConstraintFlags_ConstraintsEncountered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteResults" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRouteResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptimizeResult", propOrder = {
    "routeConstraintFlagsConstraintsEncountered",
    "routeResults"
})
public class OptimizeResult
    extends DataTransferObject
{

    @XmlElementRef(name = "RouteConstraintFlags_ConstraintsEncountered", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeConstraintFlagsConstraintsEncountered;
    @XmlElementRef(name = "RouteResults", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteResult> routeResults;

    /**
     * Obtém o valor da propriedade routeConstraintFlagsConstraintsEncountered.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteConstraintFlagsConstraintsEncountered() {
        return routeConstraintFlagsConstraintsEncountered;
    }

    /**
     * Define o valor da propriedade routeConstraintFlagsConstraintsEncountered.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteConstraintFlagsConstraintsEncountered(JAXBElement<String> value) {
        this.routeConstraintFlagsConstraintsEncountered = value;
    }

    /**
     * Obtém o valor da propriedade routeResults.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteResult> getRouteResults() {
        return routeResults;
    }

    /**
     * Define o valor da propriedade routeResults.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteResult }{@code >}
     *     
     */
    public void setRouteResults(JAXBElement<ArrayOfRouteResult> value) {
        this.routeResults = value;
    }

}
