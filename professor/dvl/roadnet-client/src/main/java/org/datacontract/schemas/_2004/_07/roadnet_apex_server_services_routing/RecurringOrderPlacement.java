
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de RecurringOrderPlacement complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RecurringOrderPlacement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutomaticPlacement_IgnoreFlags_RouteExceptionsToIgnore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlacementMethod_RoutePlacementMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShouldForcePlacement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringOrderPlacement", propOrder = {
    "automaticPlacementIgnoreFlagsRouteExceptionsToIgnore",
    "placementMethodRoutePlacementMethod",
    "shouldForcePlacement"
})
@XmlSeeAlso({
    OnManualLoadDistributionPlacement.class,
    OnSwitchServicePatternPlacement.class
})
public class RecurringOrderPlacement
    extends DataTransferObject
{

    @XmlElementRef(name = "AutomaticPlacement_IgnoreFlags_RouteExceptionsToIgnore", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> automaticPlacementIgnoreFlagsRouteExceptionsToIgnore;
    @XmlElementRef(name = "PlacementMethod_RoutePlacementMethod", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> placementMethodRoutePlacementMethod;
    @XmlElement(name = "ShouldForcePlacement")
    protected Boolean shouldForcePlacement;

    /**
     * Obtém o valor da propriedade automaticPlacementIgnoreFlagsRouteExceptionsToIgnore.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAutomaticPlacementIgnoreFlagsRouteExceptionsToIgnore() {
        return automaticPlacementIgnoreFlagsRouteExceptionsToIgnore;
    }

    /**
     * Define o valor da propriedade automaticPlacementIgnoreFlagsRouteExceptionsToIgnore.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAutomaticPlacementIgnoreFlagsRouteExceptionsToIgnore(JAXBElement<String> value) {
        this.automaticPlacementIgnoreFlagsRouteExceptionsToIgnore = value;
    }

    /**
     * Obtém o valor da propriedade placementMethodRoutePlacementMethod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlacementMethodRoutePlacementMethod() {
        return placementMethodRoutePlacementMethod;
    }

    /**
     * Define o valor da propriedade placementMethodRoutePlacementMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlacementMethodRoutePlacementMethod(JAXBElement<String> value) {
        this.placementMethodRoutePlacementMethod = value;
    }

    /**
     * Obtém o valor da propriedade shouldForcePlacement.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldForcePlacement() {
        return shouldForcePlacement;
    }

    /**
     * Define o valor da propriedade shouldForcePlacement.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldForcePlacement(Boolean value) {
        this.shouldForcePlacement = value;
    }

}
