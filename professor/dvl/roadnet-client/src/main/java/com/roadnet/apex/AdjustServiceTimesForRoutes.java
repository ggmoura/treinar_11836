
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfDomainInstance;
import com.roadnet.apex.datacontracts.RegionContext;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ArrayOfRouteRetrievalOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ServiceTimeAdjustmentOptions;


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
 *         &lt;element name="routeInstances" type="{http://roadnet.com/apex/DataContracts/}ArrayOfDomainInstance" minOccurs="0"/&gt;
 *         &lt;element name="adjustFixedServiceTimeOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ServiceTimeAdjustmentOptions" minOccurs="0"/&gt;
 *         &lt;element name="adjustPerUnitServiceTimeOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ServiceTimeAdjustmentOptions" minOccurs="0"/&gt;
 *         &lt;element name="retrievalOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options}ArrayOfRouteRetrievalOptions" minOccurs="0"/&gt;
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
    "routeInstances",
    "adjustFixedServiceTimeOptions",
    "adjustPerUnitServiceTimeOptions",
    "retrievalOptions"
})
@XmlRootElement(name = "AdjustServiceTimesForRoutes")
public class AdjustServiceTimesForRoutes {

    @XmlElementRef(name = "context", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionContext> context;
    @XmlElementRef(name = "routeInstances", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDomainInstance> routeInstances;
    @XmlElementRef(name = "adjustFixedServiceTimeOptions", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceTimeAdjustmentOptions> adjustFixedServiceTimeOptions;
    @XmlElementRef(name = "adjustPerUnitServiceTimeOptions", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceTimeAdjustmentOptions> adjustPerUnitServiceTimeOptions;
    @XmlElementRef(name = "retrievalOptions", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteRetrievalOptions> retrievalOptions;

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
     * Obtém o valor da propriedade routeInstances.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDomainInstance> getRouteInstances() {
        return routeInstances;
    }

    /**
     * Define o valor da propriedade routeInstances.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}
     *     
     */
    public void setRouteInstances(JAXBElement<ArrayOfDomainInstance> value) {
        this.routeInstances = value;
    }

    /**
     * Obtém o valor da propriedade adjustFixedServiceTimeOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceTimeAdjustmentOptions }{@code >}
     *     
     */
    public JAXBElement<ServiceTimeAdjustmentOptions> getAdjustFixedServiceTimeOptions() {
        return adjustFixedServiceTimeOptions;
    }

    /**
     * Define o valor da propriedade adjustFixedServiceTimeOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceTimeAdjustmentOptions }{@code >}
     *     
     */
    public void setAdjustFixedServiceTimeOptions(JAXBElement<ServiceTimeAdjustmentOptions> value) {
        this.adjustFixedServiceTimeOptions = value;
    }

    /**
     * Obtém o valor da propriedade adjustPerUnitServiceTimeOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceTimeAdjustmentOptions }{@code >}
     *     
     */
    public JAXBElement<ServiceTimeAdjustmentOptions> getAdjustPerUnitServiceTimeOptions() {
        return adjustPerUnitServiceTimeOptions;
    }

    /**
     * Define o valor da propriedade adjustPerUnitServiceTimeOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceTimeAdjustmentOptions }{@code >}
     *     
     */
    public void setAdjustPerUnitServiceTimeOptions(JAXBElement<ServiceTimeAdjustmentOptions> value) {
        this.adjustPerUnitServiceTimeOptions = value;
    }

    /**
     * Obtém o valor da propriedade retrievalOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteRetrievalOptions> getRetrievalOptions() {
        return retrievalOptions;
    }

    /**
     * Define o valor da propriedade retrievalOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteRetrievalOptions }{@code >}
     *     
     */
    public void setRetrievalOptions(JAXBElement<ArrayOfRouteRetrievalOptions> value) {
        this.retrievalOptions = value;
    }

}
