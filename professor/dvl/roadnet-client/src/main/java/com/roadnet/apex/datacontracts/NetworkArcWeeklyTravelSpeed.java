
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.ImmutableObject;


/**
 * <p>Classe Java de NetworkArcWeeklyTravelSpeed complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkArcWeeklyTravelSpeed"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}ImmutableObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsProvided" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Speed" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="TimePeriod" type="{http://roadnet.com/apex/DataContracts/}DailyTimePeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkArcWeeklyTravelSpeed", propOrder = {
    "isProvided",
    "speed",
    "timePeriod"
})
public class NetworkArcWeeklyTravelSpeed
    extends ImmutableObject
{

    @XmlElement(name = "IsProvided")
    protected Boolean isProvided;
    @XmlElementRef(name = "Speed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> speed;
    @XmlElementRef(name = "TimePeriod", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<DailyTimePeriod> timePeriod;

    /**
     * Obtém o valor da propriedade isProvided.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProvided() {
        return isProvided;
    }

    /**
     * Define o valor da propriedade isProvided.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProvided(Boolean value) {
        this.isProvided = value;
    }

    /**
     * Obtém o valor da propriedade speed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getSpeed() {
        return speed;
    }

    /**
     * Define o valor da propriedade speed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setSpeed(JAXBElement<Speed> value) {
        this.speed = value;
    }

    /**
     * Obtém o valor da propriedade timePeriod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DailyTimePeriod }{@code >}
     *     
     */
    public JAXBElement<DailyTimePeriod> getTimePeriod() {
        return timePeriod;
    }

    /**
     * Define o valor da propriedade timePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DailyTimePeriod }{@code >}
     *     
     */
    public void setTimePeriod(JAXBElement<DailyTimePeriod> value) {
        this.timePeriod = value;
    }

}
