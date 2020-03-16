
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de CreateRoutesResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CreateRoutesResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteResults" type="{http://roadnet.com/apex/DataContracts/}ArrayOfCreateRoutesResult.CreateRouteResult" minOccurs="0"/&gt;
 *         &lt;element name="RoutesCreated" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RoutesFailed" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RoutesSubmitted" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateRoutesResult", propOrder = {
    "routeResults",
    "routesCreated",
    "routesFailed",
    "routesSubmitted"
})
public class CreateRoutesResult
    extends DataTransferObject
{

    @XmlElementRef(name = "RouteResults", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCreateRoutesResultCreateRouteResult> routeResults;
    @XmlElement(name = "RoutesCreated")
    protected Long routesCreated;
    @XmlElement(name = "RoutesFailed")
    protected Long routesFailed;
    @XmlElement(name = "RoutesSubmitted")
    protected Long routesSubmitted;

    /**
     * Obtém o valor da propriedade routeResults.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCreateRoutesResultCreateRouteResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCreateRoutesResultCreateRouteResult> getRouteResults() {
        return routeResults;
    }

    /**
     * Define o valor da propriedade routeResults.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCreateRoutesResultCreateRouteResult }{@code >}
     *     
     */
    public void setRouteResults(JAXBElement<ArrayOfCreateRoutesResultCreateRouteResult> value) {
        this.routeResults = value;
    }

    /**
     * Obtém o valor da propriedade routesCreated.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRoutesCreated() {
        return routesCreated;
    }

    /**
     * Define o valor da propriedade routesCreated.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRoutesCreated(Long value) {
        this.routesCreated = value;
    }

    /**
     * Obtém o valor da propriedade routesFailed.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRoutesFailed() {
        return routesFailed;
    }

    /**
     * Define o valor da propriedade routesFailed.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRoutesFailed(Long value) {
        this.routesFailed = value;
    }

    /**
     * Obtém o valor da propriedade routesSubmitted.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRoutesSubmitted() {
        return routesSubmitted;
    }

    /**
     * Define o valor da propriedade routesSubmitted.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRoutesSubmitted(Long value) {
        this.routesSubmitted = value;
    }

}
