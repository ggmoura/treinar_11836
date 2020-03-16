
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de WeeklyTimePeriod complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WeeklyTimePeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}ITimePeriod"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndTime" type="{http://roadnet.com/apex/DataContracts/}TimeOfWeek" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://roadnet.com/apex/DataContracts/}TimeOfWeek" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeeklyTimePeriod", propOrder = {
    "endTime",
    "startTime"
})
public class WeeklyTimePeriod
    extends ITimePeriod
{

    @XmlElementRef(name = "EndTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeOfWeek> endTime;
    @XmlElementRef(name = "StartTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeOfWeek> startTime;

    /**
     * Obtém o valor da propriedade endTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeOfWeek }{@code >}
     *     
     */
    public JAXBElement<TimeOfWeek> getEndTime() {
        return endTime;
    }

    /**
     * Define o valor da propriedade endTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeOfWeek }{@code >}
     *     
     */
    public void setEndTime(JAXBElement<TimeOfWeek> value) {
        this.endTime = value;
    }

    /**
     * Obtém o valor da propriedade startTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeOfWeek }{@code >}
     *     
     */
    public JAXBElement<TimeOfWeek> getStartTime() {
        return startTime;
    }

    /**
     * Define o valor da propriedade startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeOfWeek }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<TimeOfWeek> value) {
        this.startTime = value;
    }

}
