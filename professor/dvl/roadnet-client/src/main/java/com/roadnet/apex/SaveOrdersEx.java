
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfOrderBaseSpec;
import com.roadnet.apex.datacontracts.RegionContext;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SaveOrderOptions;


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
 *         &lt;element name="regionContext" type="{http://roadnet.com/apex/DataContracts/}RegionContext" minOccurs="0"/&gt;
 *         &lt;element name="orderSpecDtos" type="{http://roadnet.com/apex/DataContracts/}ArrayOfOrderBaseSpec" minOccurs="0"/&gt;
 *         &lt;element name="options" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}SaveOrderOptions" minOccurs="0"/&gt;
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
    "regionContext",
    "orderSpecDtos",
    "options"
})
@XmlRootElement(name = "SaveOrdersEx")
public class SaveOrdersEx {

    @XmlElementRef(name = "regionContext", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionContext> regionContext;
    @XmlElementRef(name = "orderSpecDtos", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderBaseSpec> orderSpecDtos;
    @XmlElementRef(name = "options", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<SaveOrderOptions> options;

    /**
     * Obtém o valor da propriedade regionContext.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionContext }{@code >}
     *     
     */
    public JAXBElement<RegionContext> getRegionContext() {
        return regionContext;
    }

    /**
     * Define o valor da propriedade regionContext.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionContext }{@code >}
     *     
     */
    public void setRegionContext(JAXBElement<RegionContext> value) {
        this.regionContext = value;
    }

    /**
     * Obtém o valor da propriedade orderSpecDtos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderBaseSpec }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderBaseSpec> getOrderSpecDtos() {
        return orderSpecDtos;
    }

    /**
     * Define o valor da propriedade orderSpecDtos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderBaseSpec }{@code >}
     *     
     */
    public void setOrderSpecDtos(JAXBElement<ArrayOfOrderBaseSpec> value) {
        this.orderSpecDtos = value;
    }

    /**
     * Obtém o valor da propriedade options.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SaveOrderOptions }{@code >}
     *     
     */
    public JAXBElement<SaveOrderOptions> getOptions() {
        return options;
    }

    /**
     * Define o valor da propriedade options.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SaveOrderOptions }{@code >}
     *     
     */
    public void setOptions(JAXBElement<SaveOrderOptions> value) {
        this.options = value;
    }

}
