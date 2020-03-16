
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.Distance;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de SuggestLayoverResult.Suggestion complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SuggestLayoverResult.Suggestion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalTravelTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTimeAtNextStop" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LayoverDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_LayoverLocationTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestLayoverResult.Suggestion", propOrder = {
    "additionalCost",
    "additionalDistance",
    "additionalTravelTime",
    "arrivalTimeAtNextStop",
    "layoverDuration",
    "layoverLocationDescription",
    "layoverLocationEntityKey",
    "layoverLocationIdentifier",
    "worldTimeZoneLayoverLocationTimeZone"
})
public class SuggestLayoverResultSuggestion
    extends DataTransferObject
{

    @XmlElement(name = "AdditionalCost")
    protected Double additionalCost;
    @XmlElementRef(name = "AdditionalDistance", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> additionalDistance;
    @XmlElement(name = "AdditionalTravelTime")
    protected Duration additionalTravelTime;
    @XmlElement(name = "ArrivalTimeAtNextStop")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalTimeAtNextStop;
    @XmlElement(name = "LayoverDuration")
    protected Duration layoverDuration;
    @XmlElementRef(name = "LayoverLocationDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> layoverLocationDescription;
    @XmlElement(name = "LayoverLocationEntityKey")
    protected Long layoverLocationEntityKey;
    @XmlElementRef(name = "LayoverLocationIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> layoverLocationIdentifier;
    @XmlElementRef(name = "WorldTimeZone_LayoverLocationTimeZone", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worldTimeZoneLayoverLocationTimeZone;

    /**
     * Obtém o valor da propriedade additionalCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdditionalCost() {
        return additionalCost;
    }

    /**
     * Define o valor da propriedade additionalCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdditionalCost(Double value) {
        this.additionalCost = value;
    }

    /**
     * Obtém o valor da propriedade additionalDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getAdditionalDistance() {
        return additionalDistance;
    }

    /**
     * Define o valor da propriedade additionalDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setAdditionalDistance(JAXBElement<Distance> value) {
        this.additionalDistance = value;
    }

    /**
     * Obtém o valor da propriedade additionalTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAdditionalTravelTime() {
        return additionalTravelTime;
    }

    /**
     * Define o valor da propriedade additionalTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAdditionalTravelTime(Duration value) {
        this.additionalTravelTime = value;
    }

    /**
     * Obtém o valor da propriedade arrivalTimeAtNextStop.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTimeAtNextStop() {
        return arrivalTimeAtNextStop;
    }

    /**
     * Define o valor da propriedade arrivalTimeAtNextStop.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTimeAtNextStop(XMLGregorianCalendar value) {
        this.arrivalTimeAtNextStop = value;
    }

    /**
     * Obtém o valor da propriedade layoverDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getLayoverDuration() {
        return layoverDuration;
    }

    /**
     * Define o valor da propriedade layoverDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setLayoverDuration(Duration value) {
        this.layoverDuration = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLayoverLocationDescription() {
        return layoverLocationDescription;
    }

    /**
     * Define o valor da propriedade layoverLocationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLayoverLocationDescription(JAXBElement<String> value) {
        this.layoverLocationDescription = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLayoverLocationEntityKey() {
        return layoverLocationEntityKey;
    }

    /**
     * Define o valor da propriedade layoverLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLayoverLocationEntityKey(Long value) {
        this.layoverLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLayoverLocationIdentifier() {
        return layoverLocationIdentifier;
    }

    /**
     * Define o valor da propriedade layoverLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLayoverLocationIdentifier(JAXBElement<String> value) {
        this.layoverLocationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneLayoverLocationTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorldTimeZoneLayoverLocationTimeZone() {
        return worldTimeZoneLayoverLocationTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneLayoverLocationTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorldTimeZoneLayoverLocationTimeZone(JAXBElement<String> value) {
        this.worldTimeZoneLayoverLocationTimeZone = value;
    }

}
