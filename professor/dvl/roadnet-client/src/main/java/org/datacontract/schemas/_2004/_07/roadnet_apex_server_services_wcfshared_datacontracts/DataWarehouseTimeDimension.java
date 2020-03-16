
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.AggregateRootEntity;


/**
 * <p>Classe Java de DataWarehouseTimeDimension complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseTimeDimension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DayOfWeek_DayOfWeekLimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstDateInTimePeriod" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Granularity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastDateInTimePeriod" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="MonthLimiter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QuarterLimiter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WeekLimiter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseTimeDimension", propOrder = {
    "dayOfWeekDayOfWeekLimiter",
    "firstDateInTimePeriod",
    "granularity",
    "lastDateInTimePeriod",
    "monthLimiter",
    "quarterLimiter",
    "weekLimiter",
    "year"
})
public class DataWarehouseTimeDimension
    extends AggregateRootEntity
{

    @XmlElementRef(name = "DayOfWeek_DayOfWeekLimiter", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dayOfWeekDayOfWeekLimiter;
    @XmlElementRef(name = "FirstDateInTimePeriod", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> firstDateInTimePeriod;
    @XmlElementRef(name = "Granularity", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> granularity;
    @XmlElementRef(name = "LastDateInTimePeriod", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastDateInTimePeriod;
    @XmlElementRef(name = "MonthLimiter", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> monthLimiter;
    @XmlElementRef(name = "QuarterLimiter", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> quarterLimiter;
    @XmlElementRef(name = "WeekLimiter", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> weekLimiter;
    @XmlElementRef(name = "Year", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> year;

    /**
     * Obtém o valor da propriedade dayOfWeekDayOfWeekLimiter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDayOfWeekDayOfWeekLimiter() {
        return dayOfWeekDayOfWeekLimiter;
    }

    /**
     * Define o valor da propriedade dayOfWeekDayOfWeekLimiter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDayOfWeekDayOfWeekLimiter(JAXBElement<String> value) {
        this.dayOfWeekDayOfWeekLimiter = value;
    }

    /**
     * Obtém o valor da propriedade firstDateInTimePeriod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirstDateInTimePeriod() {
        return firstDateInTimePeriod;
    }

    /**
     * Define o valor da propriedade firstDateInTimePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirstDateInTimePeriod(JAXBElement<XMLGregorianCalendar> value) {
        this.firstDateInTimePeriod = value;
    }

    /**
     * Obtém o valor da propriedade granularity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGranularity() {
        return granularity;
    }

    /**
     * Define o valor da propriedade granularity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGranularity(JAXBElement<String> value) {
        this.granularity = value;
    }

    /**
     * Obtém o valor da propriedade lastDateInTimePeriod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastDateInTimePeriod() {
        return lastDateInTimePeriod;
    }

    /**
     * Define o valor da propriedade lastDateInTimePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastDateInTimePeriod(JAXBElement<XMLGregorianCalendar> value) {
        this.lastDateInTimePeriod = value;
    }

    /**
     * Obtém o valor da propriedade monthLimiter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMonthLimiter() {
        return monthLimiter;
    }

    /**
     * Define o valor da propriedade monthLimiter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMonthLimiter(JAXBElement<Integer> value) {
        this.monthLimiter = value;
    }

    /**
     * Obtém o valor da propriedade quarterLimiter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQuarterLimiter() {
        return quarterLimiter;
    }

    /**
     * Define o valor da propriedade quarterLimiter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQuarterLimiter(JAXBElement<Integer> value) {
        this.quarterLimiter = value;
    }

    /**
     * Obtém o valor da propriedade weekLimiter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWeekLimiter() {
        return weekLimiter;
    }

    /**
     * Define o valor da propriedade weekLimiter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWeekLimiter(JAXBElement<Integer> value) {
        this.weekLimiter = value;
    }

    /**
     * Obtém o valor da propriedade year.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getYear() {
        return year;
    }

    /**
     * Define o valor da propriedade year.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setYear(JAXBElement<Integer> value) {
        this.year = value;
    }

}
