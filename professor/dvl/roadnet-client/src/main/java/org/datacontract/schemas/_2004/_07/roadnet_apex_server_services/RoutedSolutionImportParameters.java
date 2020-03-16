
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de RoutedSolutionImportParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RoutedSolutionImportParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import}ImportParameters"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CoordinateFormat" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import}CoordinateFormat" minOccurs="0"/&gt;
 *         &lt;element name="ImportRoutesInPlanPhase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumRuntime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MaximumTravelTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRuntime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutedSolutionImportParameters", propOrder = {
    "coordinateFormat",
    "importRoutesInPlanPhase",
    "maximumRuntime",
    "maximumTravelTime",
    "preferredRuntime",
    "routingSessionDescription",
    "routingSessionEntityKey"
})
public class RoutedSolutionImportParameters
    extends ImportParameters
{

    @XmlElement(name = "CoordinateFormat")
    @XmlSchemaType(name = "string")
    protected CoordinateFormat coordinateFormat;
    @XmlElement(name = "ImportRoutesInPlanPhase")
    protected Boolean importRoutesInPlanPhase;
    @XmlElementRef(name = "MaximumRuntime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> maximumRuntime;
    @XmlElementRef(name = "MaximumTravelTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> maximumTravelTime;
    @XmlElementRef(name = "PreferredRuntime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> preferredRuntime;
    @XmlElementRef(name = "RoutingSessionDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routingSessionDescription;
    @XmlElementRef(name = "RoutingSessionEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> routingSessionEntityKey;

    /**
     * Obtém o valor da propriedade coordinateFormat.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateFormat }
     *     
     */
    public CoordinateFormat getCoordinateFormat() {
        return coordinateFormat;
    }

    /**
     * Define o valor da propriedade coordinateFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateFormat }
     *     
     */
    public void setCoordinateFormat(CoordinateFormat value) {
        this.coordinateFormat = value;
    }

    /**
     * Obtém o valor da propriedade importRoutesInPlanPhase.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImportRoutesInPlanPhase() {
        return importRoutesInPlanPhase;
    }

    /**
     * Define o valor da propriedade importRoutesInPlanPhase.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportRoutesInPlanPhase(Boolean value) {
        this.importRoutesInPlanPhase = value;
    }

    /**
     * Obtém o valor da propriedade maximumRuntime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getMaximumRuntime() {
        return maximumRuntime;
    }

    /**
     * Define o valor da propriedade maximumRuntime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setMaximumRuntime(JAXBElement<Duration> value) {
        this.maximumRuntime = value;
    }

    /**
     * Obtém o valor da propriedade maximumTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getMaximumTravelTime() {
        return maximumTravelTime;
    }

    /**
     * Define o valor da propriedade maximumTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setMaximumTravelTime(JAXBElement<Duration> value) {
        this.maximumTravelTime = value;
    }

    /**
     * Obtém o valor da propriedade preferredRuntime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPreferredRuntime() {
        return preferredRuntime;
    }

    /**
     * Define o valor da propriedade preferredRuntime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPreferredRuntime(JAXBElement<Duration> value) {
        this.preferredRuntime = value;
    }

    /**
     * Obtém o valor da propriedade routingSessionDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoutingSessionDescription() {
        return routingSessionDescription;
    }

    /**
     * Define o valor da propriedade routingSessionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoutingSessionDescription(JAXBElement<String> value) {
        this.routingSessionDescription = value;
    }

    /**
     * Obtém o valor da propriedade routingSessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRoutingSessionEntityKey() {
        return routingSessionEntityKey;
    }

    /**
     * Define o valor da propriedade routingSessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRoutingSessionEntityKey(JAXBElement<Long> value) {
        this.routingSessionEntityKey = value;
    }

}
