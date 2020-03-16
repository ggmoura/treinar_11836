
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de RouteTender complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteTender"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RouteTenderReasonCode" type="{http://roadnet.com/apex/DataContracts/}RouteTenderReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="RouteTenderState_TenderState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteTender", propOrder = {
    "routeEntityKey",
    "routeTenderReasonCode",
    "routeTenderStateTenderState",
    "workerEntityKey"
})
public class RouteTender
    extends DomainEntity
{

    @XmlElement(name = "RouteEntityKey")
    protected Long routeEntityKey;
    @XmlElementRef(name = "RouteTenderReasonCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteTenderReasonCode> routeTenderReasonCode;
    @XmlElementRef(name = "RouteTenderState_TenderState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeTenderStateTenderState;
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
     * Obtém o valor da propriedade routeTenderReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteTenderReasonCode }{@code >}
     *     
     */
    public JAXBElement<RouteTenderReasonCode> getRouteTenderReasonCode() {
        return routeTenderReasonCode;
    }

    /**
     * Define o valor da propriedade routeTenderReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteTenderReasonCode }{@code >}
     *     
     */
    public void setRouteTenderReasonCode(JAXBElement<RouteTenderReasonCode> value) {
        this.routeTenderReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade routeTenderStateTenderState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteTenderStateTenderState() {
        return routeTenderStateTenderState;
    }

    /**
     * Define o valor da propriedade routeTenderStateTenderState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteTenderStateTenderState(JAXBElement<String> value) {
        this.routeTenderStateTenderState = value;
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
