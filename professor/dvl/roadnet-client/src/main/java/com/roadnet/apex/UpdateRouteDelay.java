
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.DomainInstance;
import com.roadnet.apex.datacontracts.RegionContext;
import com.roadnet.apex.datacontracts.SaveRouteDelayArgs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ArrayOfRouteRetrievalOptions;


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
 *         &lt;element name="routeDelayArgs" type="{http://roadnet.com/apex/DataContracts/}SaveRouteDelayArgs" minOccurs="0"/&gt;
 *         &lt;element name="owningRouteInstance" type="{http://roadnet.com/apex/DataContracts/}DomainInstance" minOccurs="0"/&gt;
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
    "routeDelayArgs",
    "owningRouteInstance",
    "retrievalOptions"
})
@XmlRootElement(name = "UpdateRouteDelay")
public class UpdateRouteDelay {

    @XmlElementRef(name = "context", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionContext> context;
    @XmlElementRef(name = "routeDelayArgs", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<SaveRouteDelayArgs> routeDelayArgs;
    @XmlElementRef(name = "owningRouteInstance", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<DomainInstance> owningRouteInstance;
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
     * Obtém o valor da propriedade routeDelayArgs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SaveRouteDelayArgs }{@code >}
     *     
     */
    public JAXBElement<SaveRouteDelayArgs> getRouteDelayArgs() {
        return routeDelayArgs;
    }

    /**
     * Define o valor da propriedade routeDelayArgs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SaveRouteDelayArgs }{@code >}
     *     
     */
    public void setRouteDelayArgs(JAXBElement<SaveRouteDelayArgs> value) {
        this.routeDelayArgs = value;
    }

    /**
     * Obtém o valor da propriedade owningRouteInstance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}
     *     
     */
    public JAXBElement<DomainInstance> getOwningRouteInstance() {
        return owningRouteInstance;
    }

    /**
     * Define o valor da propriedade owningRouteInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}
     *     
     */
    public void setOwningRouteInstance(JAXBElement<DomainInstance> value) {
        this.owningRouteInstance = value;
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
