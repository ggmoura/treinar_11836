
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AutoCompleteRouteOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AutoCompleteRouteOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RemoveStopOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}RemoveStopOptions" minOccurs="0"/&gt;
 *         &lt;element name="StopOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}AutoCompleteRouteStopOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoCompleteRouteOptions", propOrder = {
    "removeStopOptions",
    "stopOptions"
})
public class AutoCompleteRouteOptions {

    @XmlElementRef(name = "RemoveStopOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<RemoveStopOptions> removeStopOptions;
    @XmlElement(name = "StopOptions")
    @XmlSchemaType(name = "string")
    protected AutoCompleteRouteStopOptions stopOptions;

    /**
     * Obtém o valor da propriedade removeStopOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemoveStopOptions }{@code >}
     *     
     */
    public JAXBElement<RemoveStopOptions> getRemoveStopOptions() {
        return removeStopOptions;
    }

    /**
     * Define o valor da propriedade removeStopOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemoveStopOptions }{@code >}
     *     
     */
    public void setRemoveStopOptions(JAXBElement<RemoveStopOptions> value) {
        this.removeStopOptions = value;
    }

    /**
     * Obtém o valor da propriedade stopOptions.
     * 
     * @return
     *     possible object is
     *     {@link AutoCompleteRouteStopOptions }
     *     
     */
    public AutoCompleteRouteStopOptions getStopOptions() {
        return stopOptions;
    }

    /**
     * Define o valor da propriedade stopOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoCompleteRouteStopOptions }
     *     
     */
    public void setStopOptions(AutoCompleteRouteStopOptions value) {
        this.stopOptions = value;
    }

}
