
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RegionContext;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SuggestRouteTemplateCandidates;


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
 *         &lt;element name="serviceLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="candidates" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}SuggestRouteTemplateCandidates" minOccurs="0"/&gt;
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
    "serviceLocationEntityKey",
    "candidates"
})
@XmlRootElement(name = "SuggestRouteTemplateForServiceLocation")
public class SuggestRouteTemplateForServiceLocation {

    @XmlElementRef(name = "context", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionContext> context;
    protected Long serviceLocationEntityKey;
    @XmlElementRef(name = "candidates", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<SuggestRouteTemplateCandidates> candidates;

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
     * Obtém o valor da propriedade serviceLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceLocationEntityKey() {
        return serviceLocationEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceLocationEntityKey(Long value) {
        this.serviceLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade candidates.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SuggestRouteTemplateCandidates }{@code >}
     *     
     */
    public JAXBElement<SuggestRouteTemplateCandidates> getCandidates() {
        return candidates;
    }

    /**
     * Define o valor da propriedade candidates.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SuggestRouteTemplateCandidates }{@code >}
     *     
     */
    public void setCandidates(JAXBElement<SuggestRouteTemplateCandidates> value) {
        this.candidates = value;
    }

}
