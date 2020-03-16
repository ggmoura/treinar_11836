
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RegionContext;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SaveMidRouteDepotStopTemplateArgs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.TemplatePlacement;


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
 *         &lt;element name="midRouteDepotStopArgs" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}SaveMidRouteDepotStopTemplateArgs" minOccurs="0"/&gt;
 *         &lt;element name="placement" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}TemplatePlacement" minOccurs="0"/&gt;
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
    "midRouteDepotStopArgs",
    "placement"
})
@XmlRootElement(name = "InsertMidRouteDepotStopTemplate")
public class InsertMidRouteDepotStopTemplate {

    @XmlElementRef(name = "context", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionContext> context;
    @XmlElementRef(name = "midRouteDepotStopArgs", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<SaveMidRouteDepotStopTemplateArgs> midRouteDepotStopArgs;
    @XmlElementRef(name = "placement", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<TemplatePlacement> placement;

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
     * Obtém o valor da propriedade midRouteDepotStopArgs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SaveMidRouteDepotStopTemplateArgs }{@code >}
     *     
     */
    public JAXBElement<SaveMidRouteDepotStopTemplateArgs> getMidRouteDepotStopArgs() {
        return midRouteDepotStopArgs;
    }

    /**
     * Define o valor da propriedade midRouteDepotStopArgs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SaveMidRouteDepotStopTemplateArgs }{@code >}
     *     
     */
    public void setMidRouteDepotStopArgs(JAXBElement<SaveMidRouteDepotStopTemplateArgs> value) {
        this.midRouteDepotStopArgs = value;
    }

    /**
     * Obtém o valor da propriedade placement.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TemplatePlacement }{@code >}
     *     
     */
    public JAXBElement<TemplatePlacement> getPlacement() {
        return placement;
    }

    /**
     * Define o valor da propriedade placement.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TemplatePlacement }{@code >}
     *     
     */
    public void setPlacement(JAXBElement<TemplatePlacement> value) {
        this.placement = value;
    }

}
