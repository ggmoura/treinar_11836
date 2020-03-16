
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DayOfWeekServicePattern complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DayOfWeekServicePattern"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}ServicePattern"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DayOfWeekFlags_DaysOfWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfWeeksInPattern" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayOfWeekServicePattern", propOrder = {
    "dayOfWeekFlagsDaysOfWeek",
    "numberOfWeeksInPattern"
})
public class DayOfWeekServicePattern
    extends ServicePattern
{

    @XmlElementRef(name = "DayOfWeekFlags_DaysOfWeek", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dayOfWeekFlagsDaysOfWeek;
    @XmlElement(name = "NumberOfWeeksInPattern")
    protected Integer numberOfWeeksInPattern;

    /**
     * Obtém o valor da propriedade dayOfWeekFlagsDaysOfWeek.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDayOfWeekFlagsDaysOfWeek() {
        return dayOfWeekFlagsDaysOfWeek;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsDaysOfWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDayOfWeekFlagsDaysOfWeek(JAXBElement<String> value) {
        this.dayOfWeekFlagsDaysOfWeek = value;
    }

    /**
     * Obtém o valor da propriedade numberOfWeeksInPattern.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfWeeksInPattern() {
        return numberOfWeeksInPattern;
    }

    /**
     * Define o valor da propriedade numberOfWeeksInPattern.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfWeeksInPattern(Integer value) {
        this.numberOfWeeksInPattern = value;
    }

}
