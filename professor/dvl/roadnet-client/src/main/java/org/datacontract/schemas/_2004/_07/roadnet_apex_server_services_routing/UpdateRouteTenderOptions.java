
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_core.RouteTenderRouteTenderState;


/**
 * <p>Classe Java de UpdateRouteTenderOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateRouteTenderOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RouteTenderReasonCodeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RouteTenderState" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Core.Domain}RouteTender.RouteTenderState" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateRouteTenderOptions", propOrder = {
    "routeEntityKey",
    "routeTenderReasonCodeEntityKey",
    "routeTenderState",
    "workerEntityKey"
})
public class UpdateRouteTenderOptions {

    @XmlElement(name = "RouteEntityKey")
    protected Long routeEntityKey;
    @XmlElementRef(name = "RouteTenderReasonCodeEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> routeTenderReasonCodeEntityKey;
    @XmlElement(name = "RouteTenderState")
    @XmlSchemaType(name = "string")
    protected RouteTenderRouteTenderState routeTenderState;
    @XmlElement(name = "WorkerEntityKey")
    protected Long workerEntityKey;

    /**
     * Obtém o valor da propriedade routeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRouteEntityKey() {
        return routeEntityKey;
    }

    /**
     * Define o valor da propriedade routeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRouteEntityKey(Long value) {
        this.routeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeTenderReasonCodeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRouteTenderReasonCodeEntityKey() {
        return routeTenderReasonCodeEntityKey;
    }

    /**
     * Define o valor da propriedade routeTenderReasonCodeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRouteTenderReasonCodeEntityKey(JAXBElement<Long> value) {
        this.routeTenderReasonCodeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeTenderState.
     * 
     * @return
     *     possible object is
     *     {@link RouteTenderRouteTenderState }
     *     
     */
    public RouteTenderRouteTenderState getRouteTenderState() {
        return routeTenderState;
    }

    /**
     * Define o valor da propriedade routeTenderState.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteTenderRouteTenderState }
     *     
     */
    public void setRouteTenderState(RouteTenderRouteTenderState value) {
        this.routeTenderState = value;
    }

    /**
     * Obtém o valor da propriedade workerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkerEntityKey() {
        return workerEntityKey;
    }

    /**
     * Define o valor da propriedade workerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkerEntityKey(Long value) {
        this.workerEntityKey = value;
    }

}
