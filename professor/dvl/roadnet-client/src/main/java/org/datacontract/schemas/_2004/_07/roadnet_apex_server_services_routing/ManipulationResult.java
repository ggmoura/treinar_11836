
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfRoute;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ManipulationResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ManipulationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Errors" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ArrayOfManipulationResult.ManipulationError" minOccurs="0"/&gt;
 *         &lt;element name="RouteConstraintFlags_ConstraintsEncountered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Routes" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRoute" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManipulationResult", propOrder = {
    "errors",
    "routeConstraintFlagsConstraintsEncountered",
    "routes"
})
@XmlSeeAlso({
    RecurringOrderManipulationResult.class
})
public class ManipulationResult
    extends DataTransferObject
{

    @XmlElementRef(name = "Errors", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfManipulationResultManipulationError> errors;
    @XmlElementRef(name = "RouteConstraintFlags_ConstraintsEncountered", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeConstraintFlagsConstraintsEncountered;
    @XmlElementRef(name = "Routes", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRoute> routes;

    /**
     * Obtém o valor da propriedade errors.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfManipulationResultManipulationError }{@code >}
     *     
     */
    public JAXBElement<ArrayOfManipulationResultManipulationError> getErrors() {
        return errors;
    }

    /**
     * Define o valor da propriedade errors.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfManipulationResultManipulationError }{@code >}
     *     
     */
    public void setErrors(JAXBElement<ArrayOfManipulationResultManipulationError> value) {
        this.errors = value;
    }

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
     * Obtém o valor da propriedade routes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoute }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRoute> getRoutes() {
        return routes;
    }

    /**
     * Define o valor da propriedade routes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoute }{@code >}
     *     
     */
    public void setRoutes(JAXBElement<ArrayOfRoute> value) {
        this.routes = value;
    }

}
