
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de CreateRouteArgs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CreateRouteArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FailIfRouteExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PropertyOptions" type="{http://roadnet.com/apex/DataContracts/}RoutePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="RouteArgs" type="{http://roadnet.com/apex/DataContracts/}SaveRouteArgs" minOccurs="0"/&gt;
 *         &lt;element name="Stops" type="{http://roadnet.com/apex/DataContracts/}ArrayOfSaveStopArgs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateRouteArgs", propOrder = {
    "failIfRouteExists",
    "propertyOptions",
    "routeArgs",
    "stops"
})
public class CreateRouteArgs
    extends DataTransferObject
{

    @XmlElement(name = "FailIfRouteExists")
    protected Boolean failIfRouteExists;
    @XmlElementRef(name = "PropertyOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutePropertyOptions> propertyOptions;
    @XmlElementRef(name = "RouteArgs", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<SaveRouteArgs> routeArgs;
    @XmlElementRef(name = "Stops", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSaveStopArgs> stops;

    /**
     * Obtém o valor da propriedade failIfRouteExists.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailIfRouteExists() {
        return failIfRouteExists;
    }

    /**
     * Define o valor da propriedade failIfRouteExists.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailIfRouteExists(Boolean value) {
        this.failIfRouteExists = value;
    }

    /**
     * Obtém o valor da propriedade propertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<RoutePropertyOptions> getPropertyOptions() {
        return propertyOptions;
    }

    /**
     * Define o valor da propriedade propertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePropertyOptions }{@code >}
     *     
     */
    public void setPropertyOptions(JAXBElement<RoutePropertyOptions> value) {
        this.propertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade routeArgs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SaveRouteArgs }{@code >}
     *     
     */
    public JAXBElement<SaveRouteArgs> getRouteArgs() {
        return routeArgs;
    }

    /**
     * Define o valor da propriedade routeArgs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SaveRouteArgs }{@code >}
     *     
     */
    public void setRouteArgs(JAXBElement<SaveRouteArgs> value) {
        this.routeArgs = value;
    }

    /**
     * Obtém o valor da propriedade stops.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaveStopArgs }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSaveStopArgs> getStops() {
        return stops;
    }

    /**
     * Define o valor da propriedade stops.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaveStopArgs }{@code >}
     *     
     */
    public void setStops(JAXBElement<ArrayOfSaveStopArgs> value) {
        this.stops = value;
    }

}
