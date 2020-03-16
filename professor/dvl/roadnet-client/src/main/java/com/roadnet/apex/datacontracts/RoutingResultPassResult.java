
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de RoutingResult.PassResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RoutingResult.PassResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepletedResources" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PassEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RouteResults" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRouteResult" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryResults" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTerritoryResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingResult.PassResult", propOrder = {
    "depletedResources",
    "passEntityKey",
    "routeResults",
    "territoryResults"
})
public class RoutingResultPassResult
    extends DataTransferObject
{

    @XmlElement(name = "DepletedResources")
    protected Boolean depletedResources;
    @XmlElement(name = "PassEntityKey")
    protected Long passEntityKey;
    @XmlElementRef(name = "RouteResults", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteResult> routeResults;
    @XmlElementRef(name = "TerritoryResults", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTerritoryResult> territoryResults;

    /**
     * Obtém o valor da propriedade depletedResources.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepletedResources() {
        return depletedResources;
    }

    /**
     * Define o valor da propriedade depletedResources.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepletedResources(Boolean value) {
        this.depletedResources = value;
    }

    /**
     * Obtém o valor da propriedade passEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPassEntityKey() {
        return passEntityKey;
    }

    /**
     * Define o valor da propriedade passEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPassEntityKey(Long value) {
        this.passEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeResults.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteResult> getRouteResults() {
        return routeResults;
    }

    /**
     * Define o valor da propriedade routeResults.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteResult }{@code >}
     *     
     */
    public void setRouteResults(JAXBElement<ArrayOfRouteResult> value) {
        this.routeResults = value;
    }

    /**
     * Obtém o valor da propriedade territoryResults.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTerritoryResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTerritoryResult> getTerritoryResults() {
        return territoryResults;
    }

    /**
     * Define o valor da propriedade territoryResults.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTerritoryResult }{@code >}
     *     
     */
    public void setTerritoryResults(JAXBElement<ArrayOfTerritoryResult> value) {
        this.territoryResults = value;
    }

}
