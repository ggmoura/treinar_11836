
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfDomainInstance;


/**
 * <p>Classe Java de MoveToRouteParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MoveToRouteParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Stops" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ArrayOfRouteStopInstances" minOccurs="0"/&gt;
 *         &lt;element name="TemporaryGeocode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UnassignedOrderGroups" type="{http://roadnet.com/apex/DataContracts/}ArrayOfDomainInstance" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveToRouteParameters", propOrder = {
    "stops",
    "temporaryGeocode",
    "unassignedOrderGroups"
})
public class MoveToRouteParameters {

    @XmlElementRef(name = "Stops", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteStopInstances> stops;
    @XmlElement(name = "TemporaryGeocode")
    protected Boolean temporaryGeocode;
    @XmlElementRef(name = "UnassignedOrderGroups", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDomainInstance> unassignedOrderGroups;

    /**
     * Obtém o valor da propriedade stops.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteStopInstances }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteStopInstances> getStops() {
        return stops;
    }

    /**
     * Define o valor da propriedade stops.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteStopInstances }{@code >}
     *     
     */
    public void setStops(JAXBElement<ArrayOfRouteStopInstances> value) {
        this.stops = value;
    }

    /**
     * Obtém o valor da propriedade temporaryGeocode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTemporaryGeocode() {
        return temporaryGeocode;
    }

    /**
     * Define o valor da propriedade temporaryGeocode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTemporaryGeocode(Boolean value) {
        this.temporaryGeocode = value;
    }

    /**
     * Obtém o valor da propriedade unassignedOrderGroups.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDomainInstance> getUnassignedOrderGroups() {
        return unassignedOrderGroups;
    }

    /**
     * Define o valor da propriedade unassignedOrderGroups.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}
     *     
     */
    public void setUnassignedOrderGroups(JAXBElement<ArrayOfDomainInstance> value) {
        this.unassignedOrderGroups = value;
    }

}
