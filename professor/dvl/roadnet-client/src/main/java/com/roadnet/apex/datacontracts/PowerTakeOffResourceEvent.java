
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de PowerTakeOffResourceEvent complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PowerTakeOffResourceEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}ResourceEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Complete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Distance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="EndTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="StationaryTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsInputOutputAccessoryEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TravelTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerTakeOffResourceEvent", propOrder = {
    "complete",
    "distance",
    "endTimestamp",
    "stationaryTime",
    "telematicsInputOutputAccessoryEntityKey",
    "travelTime"
})
public class PowerTakeOffResourceEvent
    extends ResourceEvent
{

    @XmlElement(name = "Complete")
    protected Boolean complete;
    @XmlElementRef(name = "Distance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> distance;
    @XmlElement(name = "EndTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTimestamp;
    @XmlElement(name = "StationaryTime")
    protected Duration stationaryTime;
    @XmlElement(name = "TelematicsInputOutputAccessoryEntityKey")
    protected Long telematicsInputOutputAccessoryEntityKey;
    @XmlElement(name = "TravelTime")
    protected Duration travelTime;

    /**
     * Obtém o valor da propriedade complete.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplete() {
        return complete;
    }

    /**
     * Define o valor da propriedade complete.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplete(Boolean value) {
        this.complete = value;
    }

    /**
     * Obtém o valor da propriedade distance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDistance() {
        return distance;
    }

    /**
     * Define o valor da propriedade distance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDistance(JAXBElement<Distance> value) {
        this.distance = value;
    }

    /**
     * Obtém o valor da propriedade endTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTimestamp() {
        return endTimestamp;
    }

    /**
     * Define o valor da propriedade endTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTimestamp(XMLGregorianCalendar value) {
        this.endTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade stationaryTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStationaryTime() {
        return stationaryTime;
    }

    /**
     * Define o valor da propriedade stationaryTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStationaryTime(Duration value) {
        this.stationaryTime = value;
    }

    /**
     * Obtém o valor da propriedade telematicsInputOutputAccessoryEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTelematicsInputOutputAccessoryEntityKey() {
        return telematicsInputOutputAccessoryEntityKey;
    }

    /**
     * Define o valor da propriedade telematicsInputOutputAccessoryEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTelematicsInputOutputAccessoryEntityKey(Long value) {
        this.telematicsInputOutputAccessoryEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade travelTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTravelTime() {
        return travelTime;
    }

    /**
     * Define o valor da propriedade travelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTravelTime(Duration value) {
        this.travelTime = value;
    }

}
