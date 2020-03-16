
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de TimeDimensionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TimeDimensionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DayOfWeek_DayOfWeekLimiter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FirstDateInTimePeriod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Granularity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastDateInTimePeriod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MonthLimiter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QuarterLimiter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WeekLimiter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeDimensionPropertyOptions", propOrder = {
    "dayOfWeekDayOfWeekLimiter",
    "firstDateInTimePeriod",
    "granularity",
    "lastDateInTimePeriod",
    "monthLimiter",
    "quarterLimiter",
    "weekLimiter",
    "year"
})
public class TimeDimensionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "DayOfWeek_DayOfWeekLimiter")
    protected Boolean dayOfWeekDayOfWeekLimiter;
    @XmlElement(name = "FirstDateInTimePeriod")
    protected Boolean firstDateInTimePeriod;
    @XmlElement(name = "Granularity")
    protected Boolean granularity;
    @XmlElement(name = "LastDateInTimePeriod")
    protected Boolean lastDateInTimePeriod;
    @XmlElement(name = "MonthLimiter")
    protected Boolean monthLimiter;
    @XmlElement(name = "QuarterLimiter")
    protected Boolean quarterLimiter;
    @XmlElement(name = "WeekLimiter")
    protected Boolean weekLimiter;
    @XmlElement(name = "Year")
    protected Boolean year;

    /**
     * Obtém o valor da propriedade dayOfWeekDayOfWeekLimiter.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDayOfWeekDayOfWeekLimiter() {
        return dayOfWeekDayOfWeekLimiter;
    }

    /**
     * Define o valor da propriedade dayOfWeekDayOfWeekLimiter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDayOfWeekDayOfWeekLimiter(Boolean value) {
        this.dayOfWeekDayOfWeekLimiter = value;
    }

    /**
     * Obtém o valor da propriedade firstDateInTimePeriod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirstDateInTimePeriod() {
        return firstDateInTimePeriod;
    }

    /**
     * Define o valor da propriedade firstDateInTimePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirstDateInTimePeriod(Boolean value) {
        this.firstDateInTimePeriod = value;
    }

    /**
     * Obtém o valor da propriedade granularity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGranularity() {
        return granularity;
    }

    /**
     * Define o valor da propriedade granularity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGranularity(Boolean value) {
        this.granularity = value;
    }

    /**
     * Obtém o valor da propriedade lastDateInTimePeriod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastDateInTimePeriod() {
        return lastDateInTimePeriod;
    }

    /**
     * Define o valor da propriedade lastDateInTimePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastDateInTimePeriod(Boolean value) {
        this.lastDateInTimePeriod = value;
    }

    /**
     * Obtém o valor da propriedade monthLimiter.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonthLimiter() {
        return monthLimiter;
    }

    /**
     * Define o valor da propriedade monthLimiter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonthLimiter(Boolean value) {
        this.monthLimiter = value;
    }

    /**
     * Obtém o valor da propriedade quarterLimiter.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuarterLimiter() {
        return quarterLimiter;
    }

    /**
     * Define o valor da propriedade quarterLimiter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuarterLimiter(Boolean value) {
        this.quarterLimiter = value;
    }

    /**
     * Obtém o valor da propriedade weekLimiter.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeekLimiter() {
        return weekLimiter;
    }

    /**
     * Define o valor da propriedade weekLimiter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeekLimiter(Boolean value) {
        this.weekLimiter = value;
    }

    /**
     * Obtém o valor da propriedade year.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isYear() {
        return year;
    }

    /**
     * Define o valor da propriedade year.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setYear(Boolean value) {
        this.year = value;
    }

}
