
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.Coordinate;
import com.roadnet.apex.datacontracts.Distance;
import com.roadnet.apex.datacontracts.Speed;


/**
 * <p>Classe Java de NavClientSpeedAlertAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NavClientSpeedAlertAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}NavClientAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualSpeed" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="Distance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="EndTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="OverLimitThreshold" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="PostedSpeed" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavClientSpeedAlertAction", propOrder = {
    "actualSpeed",
    "distance",
    "endTimestamp",
    "lastCoordinate",
    "overLimitThreshold",
    "postedSpeed"
})
public class NavClientSpeedAlertAction
    extends NavClientAction
{

    @XmlElementRef(name = "ActualSpeed", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> actualSpeed;
    @XmlElementRef(name = "Distance", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> distance;
    @XmlElement(name = "EndTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTimestamp;
    @XmlElementRef(name = "LastCoordinate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> lastCoordinate;
    @XmlElementRef(name = "OverLimitThreshold", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> overLimitThreshold;
    @XmlElementRef(name = "PostedSpeed", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> postedSpeed;

    /**
     * Obtém o valor da propriedade actualSpeed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getActualSpeed() {
        return actualSpeed;
    }

    /**
     * Define o valor da propriedade actualSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setActualSpeed(JAXBElement<Speed> value) {
        this.actualSpeed = value;
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
     * Obtém o valor da propriedade lastCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getLastCoordinate() {
        return lastCoordinate;
    }

    /**
     * Define o valor da propriedade lastCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setLastCoordinate(JAXBElement<Coordinate> value) {
        this.lastCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade overLimitThreshold.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getOverLimitThreshold() {
        return overLimitThreshold;
    }

    /**
     * Define o valor da propriedade overLimitThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setOverLimitThreshold(JAXBElement<Speed> value) {
        this.overLimitThreshold = value;
    }

    /**
     * Obtém o valor da propriedade postedSpeed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getPostedSpeed() {
        return postedSpeed;
    }

    /**
     * Define o valor da propriedade postedSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setPostedSpeed(JAXBElement<Speed> value) {
        this.postedSpeed = value;
    }

}
