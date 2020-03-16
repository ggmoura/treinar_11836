
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RegionContext;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.RecurringOrderPlacement;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SwitchRecurringOrderServicePatternParameters;


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
 *         &lt;element name="switchRecurringOrderServicePatternParameters" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}SwitchRecurringOrderServicePatternParameters" minOccurs="0"/&gt;
 *         &lt;element name="placement" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}RecurringOrderPlacement" minOccurs="0"/&gt;
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
    "switchRecurringOrderServicePatternParameters",
    "placement"
})
@XmlRootElement(name = "SwitchRecurringOrderServicePattern")
public class SwitchRecurringOrderServicePattern {

    @XmlElementRef(name = "context", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionContext> context;
    @XmlElementRef(name = "switchRecurringOrderServicePatternParameters", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<SwitchRecurringOrderServicePatternParameters> switchRecurringOrderServicePatternParameters;
    @XmlElementRef(name = "placement", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RecurringOrderPlacement> placement;

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
     * Obtém o valor da propriedade switchRecurringOrderServicePatternParameters.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SwitchRecurringOrderServicePatternParameters }{@code >}
     *     
     */
    public JAXBElement<SwitchRecurringOrderServicePatternParameters> getSwitchRecurringOrderServicePatternParameters() {
        return switchRecurringOrderServicePatternParameters;
    }

    /**
     * Define o valor da propriedade switchRecurringOrderServicePatternParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SwitchRecurringOrderServicePatternParameters }{@code >}
     *     
     */
    public void setSwitchRecurringOrderServicePatternParameters(JAXBElement<SwitchRecurringOrderServicePatternParameters> value) {
        this.switchRecurringOrderServicePatternParameters = value;
    }

    /**
     * Obtém o valor da propriedade placement.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RecurringOrderPlacement }{@code >}
     *     
     */
    public JAXBElement<RecurringOrderPlacement> getPlacement() {
        return placement;
    }

    /**
     * Define o valor da propriedade placement.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RecurringOrderPlacement }{@code >}
     *     
     */
    public void setPlacement(JAXBElement<RecurringOrderPlacement> value) {
        this.placement = value;
    }

}
