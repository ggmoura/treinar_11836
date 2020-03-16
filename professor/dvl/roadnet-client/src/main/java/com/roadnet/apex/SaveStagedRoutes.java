
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.SaveOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts.ArrayOfDataWarehouseStagedRoute;


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
 *         &lt;element name="stagedRouteDtos" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse}ArrayOfDataWarehouseStagedRoute" minOccurs="0"/&gt;
 *         &lt;element name="options" type="{http://roadnet.com/apex/DataContracts/}SaveOptions" minOccurs="0"/&gt;
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
    "stagedRouteDtos",
    "options"
})
@XmlRootElement(name = "SaveStagedRoutes")
public class SaveStagedRoutes {

    @XmlElementRef(name = "stagedRouteDtos", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDataWarehouseStagedRoute> stagedRouteDtos;
    @XmlElementRef(name = "options", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<SaveOptions> options;

    /**
     * Obtém o valor da propriedade stagedRouteDtos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedRoute }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDataWarehouseStagedRoute> getStagedRouteDtos() {
        return stagedRouteDtos;
    }

    /**
     * Define o valor da propriedade stagedRouteDtos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedRoute }{@code >}
     *     
     */
    public void setStagedRouteDtos(JAXBElement<ArrayOfDataWarehouseStagedRoute> value) {
        this.stagedRouteDtos = value;
    }

    /**
     * Obtém o valor da propriedade options.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SaveOptions }{@code >}
     *     
     */
    public JAXBElement<SaveOptions> getOptions() {
        return options;
    }

    /**
     * Define o valor da propriedade options.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SaveOptions }{@code >}
     *     
     */
    public void setOptions(JAXBElement<SaveOptions> value) {
        this.options = value;
    }

}
