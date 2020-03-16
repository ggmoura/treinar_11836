
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.DomainInstance;
import com.roadnet.apex.datacontracts.TravelPathOptions;


/**
 * <p>Classe Java de GenerateRouteTemplateTravelPathOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GenerateRouteTemplateTravelPathOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}TravelPathOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteTemplateInstance" type="{http://roadnet.com/apex/DataContracts/}DomainInstance" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateRouteTemplateTravelPathOptions", propOrder = {
    "routeTemplateInstance"
})
public class GenerateRouteTemplateTravelPathOptions
    extends TravelPathOptions
{

    @XmlElementRef(name = "RouteTemplateInstance", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<DomainInstance> routeTemplateInstance;

    /**
     * Obtém o valor da propriedade routeTemplateInstance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}
     *     
     */
    public JAXBElement<DomainInstance> getRouteTemplateInstance() {
        return routeTemplateInstance;
    }

    /**
     * Define o valor da propriedade routeTemplateInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}
     *     
     */
    public void setRouteTemplateInstance(JAXBElement<DomainInstance> value) {
        this.routeTemplateInstance = value;
    }

}
