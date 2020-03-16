
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfNetworkArc;
import com.roadnet.apex.datacontracts.RegionContext;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.UpdateArcsOptions;


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
 *         &lt;element name="arcsToUpdate" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNetworkArc" minOccurs="0"/&gt;
 *         &lt;element name="options" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}UpdateArcsOptions" minOccurs="0"/&gt;
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
    "arcsToUpdate",
    "options"
})
@XmlRootElement(name = "UpdateArcs")
public class UpdateArcs {

    @XmlElementRef(name = "regionContext", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionContext> regionContext;
    @XmlElementRef(name = "arcsToUpdate", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkArc> arcsToUpdate;
    @XmlElementRef(name = "options", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateArcsOptions> options;

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
     * Obtém o valor da propriedade arcsToUpdate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkArc }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkArc> getArcsToUpdate() {
        return arcsToUpdate;
    }

    /**
     * Define o valor da propriedade arcsToUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkArc }{@code >}
     *     
     */
    public void setArcsToUpdate(JAXBElement<ArrayOfNetworkArc> value) {
        this.arcsToUpdate = value;
    }

    /**
     * Obtém o valor da propriedade options.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateArcsOptions }{@code >}
     *     
     */
    public JAXBElement<UpdateArcsOptions> getOptions() {
        return options;
    }

    /**
     * Define o valor da propriedade options.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateArcsOptions }{@code >}
     *     
     */
    public void setOptions(JAXBElement<UpdateArcsOptions> value) {
        this.options = value;
    }

}
