
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfDomainInstance;
import com.roadnet.apex.datacontracts.DomainInstance;
import com.roadnet.apex.datacontracts.RegionContext;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.AutomaticPlacement;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="context" type="{http://roadnet.com/apex/DataContracts/}RegionContext" minOccurs="0"/&gt;
 *         &lt;element name="recurringOrderInstances" type="{http://roadnet.com/apex/DataContracts/}ArrayOfDomainInstance" minOccurs="0"/&gt;
 *         &lt;element name="territoryInstance" type="{http://roadnet.com/apex/DataContracts/}DomainInstance" minOccurs="0"/&gt;
 *         &lt;element name="placementDto" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}AutomaticPlacement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "context",
    "recurringOrderInstances",
    "territoryInstance",
    "placementDto"
})
@XmlRootElement(name = "MoveRecurringOrdersToTerritory")
public class MoveRecurringOrdersToTerritory {

    @XmlElementRef(name = "context", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionContext> context;
    @XmlElementRef(name = "recurringOrderInstances", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDomainInstance> recurringOrderInstances;
    @XmlElementRef(name = "territoryInstance", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<DomainInstance> territoryInstance;
    @XmlElementRef(name = "placementDto", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<AutomaticPlacement> placementDto;

    /**
     * Obtém o valor da propriedade context.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionContext }{@code >}
     *     
     */
    public JAXBElement<RegionContext> getContext() {
        return context;
    }

    /**
     * Define o valor da propriedade context.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionContext }{@code >}
     *     
     */
    public void setContext(JAXBElement<RegionContext> value) {
        this.context = value;
    }

    /**
     * Obtém o valor da propriedade recurringOrderInstances.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDomainInstance> getRecurringOrderInstances() {
        return recurringOrderInstances;
    }

    /**
     * Define o valor da propriedade recurringOrderInstances.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}
     *     
     */
    public void setRecurringOrderInstances(JAXBElement<ArrayOfDomainInstance> value) {
        this.recurringOrderInstances = value;
    }

    /**
     * Obtém o valor da propriedade territoryInstance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}
     *     
     */
    public JAXBElement<DomainInstance> getTerritoryInstance() {
        return territoryInstance;
    }

    /**
     * Define o valor da propriedade territoryInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}
     *     
     */
    public void setTerritoryInstance(JAXBElement<DomainInstance> value) {
        this.territoryInstance = value;
    }

    /**
     * Obtém o valor da propriedade placementDto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AutomaticPlacement }{@code >}
     *     
     */
    public JAXBElement<AutomaticPlacement> getPlacementDto() {
        return placementDto;
    }

    /**
     * Define o valor da propriedade placementDto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AutomaticPlacement }{@code >}
     *     
     */
    public void setPlacementDto(JAXBElement<AutomaticPlacement> value) {
        this.placementDto = value;
    }

}
