
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RegionContext;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SaveRouteTemplateFromRouteArgs;


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
 *         &lt;element name="saveArgs" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}SaveRouteTemplateFromRouteArgs" minOccurs="0"/&gt;
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
    "saveArgs"
})
@XmlRootElement(name = "SaveRouteTemplateFromRoute")
public class SaveRouteTemplateFromRoute {

    @XmlElementRef(name = "context", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionContext> context;
    @XmlElementRef(name = "saveArgs", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<SaveRouteTemplateFromRouteArgs> saveArgs;

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
     * Obtém o valor da propriedade saveArgs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SaveRouteTemplateFromRouteArgs }{@code >}
     *     
     */
    public JAXBElement<SaveRouteTemplateFromRouteArgs> getSaveArgs() {
        return saveArgs;
    }

    /**
     * Define o valor da propriedade saveArgs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SaveRouteTemplateFromRouteArgs }{@code >}
     *     
     */
    public void setSaveArgs(JAXBElement<SaveRouteTemplateFromRouteArgs> value) {
        this.saveArgs = value;
    }

}
