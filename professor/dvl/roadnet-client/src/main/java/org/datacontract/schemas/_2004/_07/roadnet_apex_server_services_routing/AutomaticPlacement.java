
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.DomainInstance;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de AutomaticPlacement complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AutomaticPlacement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutomaticPlacementGoal_Goal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreFlags_RouteExceptionsToIgnore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteInstance" type="{http://roadnet.com/apex/DataContracts/}DomainInstance" minOccurs="0"/&gt;
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
@XmlType(name = "AutomaticPlacement", propOrder = {
    "automaticPlacementGoalGoal",
    "ignoreFlagsRouteExceptionsToIgnore",
    "routeInstance",
    "shouldForcePlacement"
})
@XmlSeeAlso({
    OnTerritoryAutomaticPlacement.class,
    OnRouteAutomaticPlacement.class
})
public class AutomaticPlacement
    extends DataTransferObject
{

    @XmlElementRef(name = "AutomaticPlacementGoal_Goal", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> automaticPlacementGoalGoal;
    @XmlElementRef(name = "IgnoreFlags_RouteExceptionsToIgnore", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ignoreFlagsRouteExceptionsToIgnore;
    @XmlElementRef(name = "RouteInstance", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<DomainInstance> routeInstance;
    @XmlElement(name = "ShouldForcePlacement")
    protected Boolean shouldForcePlacement;

    /**
     * Obtém o valor da propriedade automaticPlacementGoalGoal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAutomaticPlacementGoalGoal() {
        return automaticPlacementGoalGoal;
    }

    /**
     * Define o valor da propriedade automaticPlacementGoalGoal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAutomaticPlacementGoalGoal(JAXBElement<String> value) {
        this.automaticPlacementGoalGoal = value;
    }

    /**
     * Obtém o valor da propriedade ignoreFlagsRouteExceptionsToIgnore.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIgnoreFlagsRouteExceptionsToIgnore() {
        return ignoreFlagsRouteExceptionsToIgnore;
    }

    /**
     * Define o valor da propriedade ignoreFlagsRouteExceptionsToIgnore.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIgnoreFlagsRouteExceptionsToIgnore(JAXBElement<String> value) {
        this.ignoreFlagsRouteExceptionsToIgnore = value;
    }

    /**
     * Obtém o valor da propriedade routeInstance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}
     *     
     */
    public JAXBElement<DomainInstance> getRouteInstance() {
        return routeInstance;
    }

    /**
     * Define o valor da propriedade routeInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}
     *     
     */
    public void setRouteInstance(JAXBElement<DomainInstance> value) {
        this.routeInstance = value;
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
