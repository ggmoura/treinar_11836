
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
 * <p>Classe Java de NavRoutePathDeviationResourceEvent complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NavRoutePathDeviationResourceEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}ResourceEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Coordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="DeviationDistanceThreshold" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="EndDeviationPoint" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="EndDeviationTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MaxDeviatedDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="TimeInDeviation" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavRoutePathDeviationResourceEvent", propOrder = {
    "coordinate",
    "deviationDistanceThreshold",
    "endDeviationPoint",
    "endDeviationTimestamp",
    "maxDeviatedDistance",
    "timeInDeviation"
})
public class NavRoutePathDeviationResourceEvent
    extends ResourceEvent
{

    @XmlElementRef(name = "Coordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinate;
    @XmlElementRef(name = "DeviationDistanceThreshold", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> deviationDistanceThreshold;
    @XmlElementRef(name = "EndDeviationPoint", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> endDeviationPoint;
    @XmlElement(name = "EndDeviationTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDeviationTimestamp;
    @XmlElementRef(name = "MaxDeviatedDistance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> maxDeviatedDistance;
    @XmlElementRef(name = "TimeInDeviation", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> timeInDeviation;

    /**
     * Obtém o valor da propriedade coordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getCoordinate() {
        return coordinate;
    }

    /**
     * Define o valor da propriedade coordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setCoordinate(JAXBElement<Coordinate> value) {
        this.coordinate = value;
    }

    /**
     * Obtém o valor da propriedade deviationDistanceThreshold.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDeviationDistanceThreshold() {
        return deviationDistanceThreshold;
    }

    /**
     * Define o valor da propriedade deviationDistanceThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDeviationDistanceThreshold(JAXBElement<Distance> value) {
        this.deviationDistanceThreshold = value;
    }

    /**
     * Obtém o valor da propriedade endDeviationPoint.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getEndDeviationPoint() {
        return endDeviationPoint;
    }

    /**
     * Define o valor da propriedade endDeviationPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setEndDeviationPoint(JAXBElement<Coordinate> value) {
        this.endDeviationPoint = value;
    }

    /**
     * Obtém o valor da propriedade endDeviationTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDeviationTimestamp() {
        return endDeviationTimestamp;
    }

    /**
     * Define o valor da propriedade endDeviationTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDeviationTimestamp(XMLGregorianCalendar value) {
        this.endDeviationTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade maxDeviatedDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getMaxDeviatedDistance() {
        return maxDeviatedDistance;
    }

    /**
     * Define o valor da propriedade maxDeviatedDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setMaxDeviatedDistance(JAXBElement<Distance> value) {
        this.maxDeviatedDistance = value;
    }

    /**
     * Obtém o valor da propriedade timeInDeviation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTimeInDeviation() {
        return timeInDeviation;
    }

    /**
     * Define o valor da propriedade timeInDeviation.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTimeInDeviation(JAXBElement<Duration> value) {
        this.timeInDeviation = value;
    }

}
