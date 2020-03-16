
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.DomainInstance;
import com.roadnet.apex.datacontracts.RoutePathOptions;


/**
 * <p>Classe Java de GenerateRoutePathOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GenerateRoutePathOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RoutePathOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExcludeDestinationStem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExcludeOriginStem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteInstance" type="{http://roadnet.com/apex/DataContracts/}DomainInstance" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateRoutePathOptions", propOrder = {
    "excludeDestinationStem",
    "excludeOriginStem",
    "routeInstance"
})
public class GenerateRoutePathOptions
    extends RoutePathOptions
{

    @XmlElement(name = "ExcludeDestinationStem")
    protected Boolean excludeDestinationStem;
    @XmlElement(name = "ExcludeOriginStem")
    protected Boolean excludeOriginStem;
    @XmlElementRef(name = "RouteInstance", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<DomainInstance> routeInstance;

    /**
     * Obtém o valor da propriedade excludeDestinationStem.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeDestinationStem() {
        return excludeDestinationStem;
    }

    /**
     * Define o valor da propriedade excludeDestinationStem.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeDestinationStem(Boolean value) {
        this.excludeDestinationStem = value;
    }

    /**
     * Obtém o valor da propriedade excludeOriginStem.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeOriginStem() {
        return excludeOriginStem;
    }

    /**
     * Define o valor da propriedade excludeOriginStem.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeOriginStem(Boolean value) {
        this.excludeOriginStem = value;
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

}
