
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de Region.StationaryEventSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Region.StationaryEventSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreateIndeterminateStationaryEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumIndeterminateStationaryDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MinimumStationaryDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MinimumTravelSpeed" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="StationaryDistanceThreshold" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Region.StationaryEventSettings", propOrder = {
    "createIndeterminateStationaryEvents",
    "minimumIndeterminateStationaryDuration",
    "minimumStationaryDuration",
    "minimumTravelSpeed",
    "stationaryDistanceThreshold"
})
public class RegionStationaryEventSettings
    extends DataTransferObject
{

    @XmlElement(name = "CreateIndeterminateStationaryEvents")
    protected Boolean createIndeterminateStationaryEvents;
    @XmlElement(name = "MinimumIndeterminateStationaryDuration")
    protected Duration minimumIndeterminateStationaryDuration;
    @XmlElement(name = "MinimumStationaryDuration")
    protected Duration minimumStationaryDuration;
    @XmlElementRef(name = "MinimumTravelSpeed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> minimumTravelSpeed;
    @XmlElementRef(name = "StationaryDistanceThreshold", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> stationaryDistanceThreshold;

    /**
     * Obtém o valor da propriedade createIndeterminateStationaryEvents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateIndeterminateStationaryEvents() {
        return createIndeterminateStationaryEvents;
    }

    /**
     * Define o valor da propriedade createIndeterminateStationaryEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateIndeterminateStationaryEvents(Boolean value) {
        this.createIndeterminateStationaryEvents = value;
    }

    /**
     * Obtém o valor da propriedade minimumIndeterminateStationaryDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumIndeterminateStationaryDuration() {
        return minimumIndeterminateStationaryDuration;
    }

    /**
     * Define o valor da propriedade minimumIndeterminateStationaryDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumIndeterminateStationaryDuration(Duration value) {
        this.minimumIndeterminateStationaryDuration = value;
    }

    /**
     * Obtém o valor da propriedade minimumStationaryDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumStationaryDuration() {
        return minimumStationaryDuration;
    }

    /**
     * Define o valor da propriedade minimumStationaryDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumStationaryDuration(Duration value) {
        this.minimumStationaryDuration = value;
    }

    /**
     * Obtém o valor da propriedade minimumTravelSpeed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getMinimumTravelSpeed() {
        return minimumTravelSpeed;
    }

    /**
     * Define o valor da propriedade minimumTravelSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setMinimumTravelSpeed(JAXBElement<Speed> value) {
        this.minimumTravelSpeed = value;
    }

    /**
     * Obtém o valor da propriedade stationaryDistanceThreshold.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getStationaryDistanceThreshold() {
        return stationaryDistanceThreshold;
    }

    /**
     * Define o valor da propriedade stationaryDistanceThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setStationaryDistanceThreshold(JAXBElement<Distance> value) {
        this.stationaryDistanceThreshold = value;
    }

}
