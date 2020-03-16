
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.ArrayOfStopIdentity;
import com.roadnet.apex.datacontracts.Coordinate;


/**
 * <p>Classe Java de AssociateStationaryEventAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AssociateStationaryEventAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MobileDeviceAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="EventEndTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EventStartTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Geocode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InProgress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopIdentities" type="{http://roadnet.com/apex/DataContracts/}ArrayOfStop.Identity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociateStationaryEventAction", propOrder = {
    "eventCoordinate",
    "eventEndTimestamp",
    "eventStartTimestamp",
    "geocode",
    "inProgress",
    "stopIdentities"
})
public class AssociateStationaryEventAction
    extends MobileDeviceAction
{

    @XmlElementRef(name = "EventCoordinate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> eventCoordinate;
    @XmlElement(name = "EventEndTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventEndTimestamp;
    @XmlElement(name = "EventStartTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventStartTimestamp;
    @XmlElement(name = "Geocode")
    protected Boolean geocode;
    @XmlElement(name = "InProgress")
    protected Boolean inProgress;
    @XmlElementRef(name = "StopIdentities", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStopIdentity> stopIdentities;

    /**
     * Obtém o valor da propriedade eventCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getEventCoordinate() {
        return eventCoordinate;
    }

    /**
     * Define o valor da propriedade eventCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setEventCoordinate(JAXBElement<Coordinate> value) {
        this.eventCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade eventEndTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventEndTimestamp() {
        return eventEndTimestamp;
    }

    /**
     * Define o valor da propriedade eventEndTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventEndTimestamp(XMLGregorianCalendar value) {
        this.eventEndTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade eventStartTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventStartTimestamp() {
        return eventStartTimestamp;
    }

    /**
     * Define o valor da propriedade eventStartTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventStartTimestamp(XMLGregorianCalendar value) {
        this.eventStartTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade geocode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocode() {
        return geocode;
    }

    /**
     * Define o valor da propriedade geocode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocode(Boolean value) {
        this.geocode = value;
    }

    /**
     * Obtém o valor da propriedade inProgress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInProgress() {
        return inProgress;
    }

    /**
     * Define o valor da propriedade inProgress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInProgress(Boolean value) {
        this.inProgress = value;
    }

    /**
     * Obtém o valor da propriedade stopIdentities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStopIdentity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStopIdentity> getStopIdentities() {
        return stopIdentities;
    }

    /**
     * Define o valor da propriedade stopIdentities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStopIdentity }{@code >}
     *     
     */
    public void setStopIdentities(JAXBElement<ArrayOfStopIdentity> value) {
        this.stopIdentities = value;
    }

}
