
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TimePeriodServicePattern complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TimePeriodServicePattern"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}ServicePattern"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberOfTimeUnitsInPattern" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfVisits" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TimeUnit_TimeUnitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriodServicePattern", propOrder = {
    "numberOfTimeUnitsInPattern",
    "numberOfVisits",
    "timeUnitTimeUnitType"
})
public class TimePeriodServicePattern
    extends ServicePattern
{

    @XmlElement(name = "NumberOfTimeUnitsInPattern")
    protected Integer numberOfTimeUnitsInPattern;
    @XmlElement(name = "NumberOfVisits")
    protected Integer numberOfVisits;
    @XmlElementRef(name = "TimeUnit_TimeUnitType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeUnitTimeUnitType;

    /**
     * Obtém o valor da propriedade numberOfTimeUnitsInPattern.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfTimeUnitsInPattern() {
        return numberOfTimeUnitsInPattern;
    }

    /**
     * Define o valor da propriedade numberOfTimeUnitsInPattern.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfTimeUnitsInPattern(Integer value) {
        this.numberOfTimeUnitsInPattern = value;
    }

    /**
     * Obtém o valor da propriedade numberOfVisits.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfVisits() {
        return numberOfVisits;
    }

    /**
     * Define o valor da propriedade numberOfVisits.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfVisits(Integer value) {
        this.numberOfVisits = value;
    }

    /**
     * Obtém o valor da propriedade timeUnitTimeUnitType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeUnitTimeUnitType() {
        return timeUnitTimeUnitType;
    }

    /**
     * Define o valor da propriedade timeUnitTimeUnitType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeUnitTimeUnitType(JAXBElement<String> value) {
        this.timeUnitTimeUnitType = value;
    }

}
