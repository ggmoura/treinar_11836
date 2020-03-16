
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
 *         &lt;element name="destinationRouteTemplateInstance" type="{http://roadnet.com/apex/DataContracts/}DomainInstance" minOccurs="0"/&gt;
 *         &lt;element name="routeTemplateInstances" type="{http://roadnet.com/apex/DataContracts/}ArrayOfDomainInstance" minOccurs="0"/&gt;
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
    "destinationRouteTemplateInstance",
    "routeTemplateInstances"
})
@XmlRootElement(name = "CombineRouteTemplates")
public class CombineRouteTemplates {

    @XmlElementRef(name = "context", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionContext> context;
    @XmlElementRef(name = "destinationRouteTemplateInstance", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<DomainInstance> destinationRouteTemplateInstance;
    @XmlElementRef(name = "routeTemplateInstances", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDomainInstance> routeTemplateInstances;

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
     * Obtém o valor da propriedade destinationRouteTemplateInstance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}
     *     
     */
    public JAXBElement<DomainInstance> getDestinationRouteTemplateInstance() {
        return destinationRouteTemplateInstance;
    }

    /**
     * Define o valor da propriedade destinationRouteTemplateInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}
     *     
     */
    public void setDestinationRouteTemplateInstance(JAXBElement<DomainInstance> value) {
        this.destinationRouteTemplateInstance = value;
    }

    /**
     * Obtém o valor da propriedade routeTemplateInstances.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDomainInstance> getRouteTemplateInstances() {
        return routeTemplateInstances;
    }

    /**
     * Define o valor da propriedade routeTemplateInstances.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}
     *     
     */
    public void setRouteTemplateInstances(JAXBElement<ArrayOfDomainInstance> value) {
        this.routeTemplateInstances = value;
    }

}
