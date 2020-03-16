
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de RouteTenderPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteTenderPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteTenderReasonCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteTenderReasonCodeOptions" type="{http://roadnet.com/apex/DataContracts/}RouteTenderReasonCodePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="RouteTenderState_TenderState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteTenderPropertyOptions", propOrder = {
    "routeEntityKey",
    "routeTenderReasonCode",
    "routeTenderReasonCodeOptions",
    "routeTenderStateTenderState",
    "workerEntityKey"
})
public class RouteTenderPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "RouteEntityKey")
    protected Boolean routeEntityKey;
    @XmlElement(name = "RouteTenderReasonCode")
    protected Boolean routeTenderReasonCode;
    @XmlElementRef(name = "RouteTenderReasonCodeOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteTenderReasonCodePropertyOptions> routeTenderReasonCodeOptions;
    @XmlElement(name = "RouteTenderState_TenderState")
    protected Boolean routeTenderStateTenderState;
    @XmlElement(name = "WorkerEntityKey")
    protected Boolean workerEntityKey;

    /**
     * Obtém o valor da propriedade routeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteEntityKey() {
        return routeEntityKey;
    }

    /**
     * Define o valor da propriedade routeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteEntityKey(Boolean value) {
        this.routeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeTenderReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteTenderReasonCode() {
        return routeTenderReasonCode;
    }

    /**
     * Define o valor da propriedade routeTenderReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteTenderReasonCode(Boolean value) {
        this.routeTenderReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade routeTenderReasonCodeOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteTenderReasonCodePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<RouteTenderReasonCodePropertyOptions> getRouteTenderReasonCodeOptions() {
        return routeTenderReasonCodeOptions;
    }

    /**
     * Define o valor da propriedade routeTenderReasonCodeOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteTenderReasonCodePropertyOptions }{@code >}
     *     
     */
    public void setRouteTenderReasonCodeOptions(JAXBElement<RouteTenderReasonCodePropertyOptions> value) {
        this.routeTenderReasonCodeOptions = value;
    }

    /**
     * Obtém o valor da propriedade routeTenderStateTenderState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteTenderStateTenderState() {
        return routeTenderStateTenderState;
    }

    /**
     * Define o valor da propriedade routeTenderStateTenderState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteTenderStateTenderState(Boolean value) {
        this.routeTenderStateTenderState = value;
    }

    /**
     * Obtém o valor da propriedade workerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerEntityKey() {
        return workerEntityKey;
    }

    /**
     * Define o valor da propriedade workerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerEntityKey(Boolean value) {
        this.workerEntityKey = value;
    }

}
