
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de PositionDataPoint complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PositionDataPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Coordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="GPSSpeed" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="HACC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="HDOP" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Heading" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfSatellites" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReceivedTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RelativePositionDetails" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRelativePositionDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionDataPoint", propOrder = {
    "coordinate",
    "gpsSpeed",
    "hacc",
    "hdop",
    "heading",
    "numberOfSatellites",
    "receivedTimestamp",
    "relativePositionDetails"
})
public class PositionDataPoint
    extends DataTransferObject
{

    @XmlElementRef(name = "Coordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinate;
    @XmlElementRef(name = "GPSSpeed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> gpsSpeed;
    @XmlElementRef(name = "HACC", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> hacc;
    @XmlElementRef(name = "HDOP", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> hdop;
    @XmlElementRef(name = "Heading", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> heading;
    @XmlElementRef(name = "NumberOfSatellites", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfSatellites;
    @XmlElementRef(name = "ReceivedTimestamp", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> receivedTimestamp;
    @XmlElementRef(name = "RelativePositionDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRelativePositionDetail> relativePositionDetails;

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
     * Obtém o valor da propriedade gpsSpeed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getGPSSpeed() {
        return gpsSpeed;
    }

    /**
     * Define o valor da propriedade gpsSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setGPSSpeed(JAXBElement<Speed> value) {
        this.gpsSpeed = value;
    }

    /**
     * Obtém o valor da propriedade hacc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHACC() {
        return hacc;
    }

    /**
     * Define o valor da propriedade hacc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHACC(JAXBElement<Double> value) {
        this.hacc = value;
    }

    /**
     * Obtém o valor da propriedade hdop.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHDOP() {
        return hdop;
    }

    /**
     * Define o valor da propriedade hdop.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHDOP(JAXBElement<Double> value) {
        this.hdop = value;
    }

    /**
     * Obtém o valor da propriedade heading.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHeading() {
        return heading;
    }

    /**
     * Define o valor da propriedade heading.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHeading(JAXBElement<Integer> value) {
        this.heading = value;
    }

    /**
     * Obtém o valor da propriedade numberOfSatellites.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfSatellites() {
        return numberOfSatellites;
    }

    /**
     * Define o valor da propriedade numberOfSatellites.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfSatellites(JAXBElement<Integer> value) {
        this.numberOfSatellites = value;
    }

    /**
     * Obtém o valor da propriedade receivedTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReceivedTimestamp() {
        return receivedTimestamp;
    }

    /**
     * Define o valor da propriedade receivedTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReceivedTimestamp(JAXBElement<XMLGregorianCalendar> value) {
        this.receivedTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade relativePositionDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRelativePositionDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRelativePositionDetail> getRelativePositionDetails() {
        return relativePositionDetails;
    }

    /**
     * Define o valor da propriedade relativePositionDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRelativePositionDetail }{@code >}
     *     
     */
    public void setRelativePositionDetails(JAXBElement<ArrayOfRelativePositionDetail> value) {
        this.relativePositionDetails = value;
    }

}
