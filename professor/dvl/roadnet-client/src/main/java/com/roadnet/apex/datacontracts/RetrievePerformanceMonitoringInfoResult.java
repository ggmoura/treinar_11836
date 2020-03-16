
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
 * <p>Classe Java de RetrievePerformanceMonitoringInfoResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrievePerformanceMonitoringInfoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Distance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EngineRunTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="FuelEconomy" type="{http://roadnet.com/apex/DataContracts/}FuelEconomy" minOccurs="0"/&gt;
 *         &lt;element name="FuelUsed" type="{http://roadnet.com/apex/DataContracts/}LiquidVolume" minOccurs="0"/&gt;
 *         &lt;element name="PercentHighSpeedTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PercentIdleTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PercentTimeInCruiseControl" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PercentTimeInTopGear" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="WorkerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerName" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievePerformanceMonitoringInfoResult", propOrder = {
    "distance",
    "endTime",
    "engineRunTime",
    "fuelEconomy",
    "fuelUsed",
    "percentHighSpeedTime",
    "percentIdleTime",
    "percentTimeInCruiseControl",
    "percentTimeInTopGear",
    "startTime",
    "workerIdentifier",
    "workerName"
})
public class RetrievePerformanceMonitoringInfoResult {

    @XmlElementRef(name = "Distance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> distance;
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElementRef(name = "EngineRunTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> engineRunTime;
    @XmlElementRef(name = "FuelEconomy", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<FuelEconomy> fuelEconomy;
    @XmlElementRef(name = "FuelUsed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidVolume> fuelUsed;
    @XmlElementRef(name = "PercentHighSpeedTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> percentHighSpeedTime;
    @XmlElementRef(name = "PercentIdleTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> percentIdleTime;
    @XmlElementRef(name = "PercentTimeInCruiseControl", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> percentTimeInCruiseControl;
    @XmlElementRef(name = "PercentTimeInTopGear", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> percentTimeInTopGear;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElementRef(name = "WorkerIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerIdentifier;
    @XmlElementRef(name = "WorkerName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> workerName;

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
     * Obtém o valor da propriedade endTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Define o valor da propriedade endTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Obtém o valor da propriedade engineRunTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getEngineRunTime() {
        return engineRunTime;
    }

    /**
     * Define o valor da propriedade engineRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setEngineRunTime(JAXBElement<Duration> value) {
        this.engineRunTime = value;
    }

    /**
     * Obtém o valor da propriedade fuelEconomy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FuelEconomy }{@code >}
     *     
     */
    public JAXBElement<FuelEconomy> getFuelEconomy() {
        return fuelEconomy;
    }

    /**
     * Define o valor da propriedade fuelEconomy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FuelEconomy }{@code >}
     *     
     */
    public void setFuelEconomy(JAXBElement<FuelEconomy> value) {
        this.fuelEconomy = value;
    }

    /**
     * Obtém o valor da propriedade fuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public JAXBElement<LiquidVolume> getFuelUsed() {
        return fuelUsed;
    }

    /**
     * Define o valor da propriedade fuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public void setFuelUsed(JAXBElement<LiquidVolume> value) {
        this.fuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade percentHighSpeedTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPercentHighSpeedTime() {
        return percentHighSpeedTime;
    }

    /**
     * Define o valor da propriedade percentHighSpeedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPercentHighSpeedTime(JAXBElement<Double> value) {
        this.percentHighSpeedTime = value;
    }

    /**
     * Obtém o valor da propriedade percentIdleTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPercentIdleTime() {
        return percentIdleTime;
    }

    /**
     * Define o valor da propriedade percentIdleTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPercentIdleTime(JAXBElement<Double> value) {
        this.percentIdleTime = value;
    }

    /**
     * Obtém o valor da propriedade percentTimeInCruiseControl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPercentTimeInCruiseControl() {
        return percentTimeInCruiseControl;
    }

    /**
     * Define o valor da propriedade percentTimeInCruiseControl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPercentTimeInCruiseControl(JAXBElement<Double> value) {
        this.percentTimeInCruiseControl = value;
    }

    /**
     * Obtém o valor da propriedade percentTimeInTopGear.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPercentTimeInTopGear() {
        return percentTimeInTopGear;
    }

    /**
     * Define o valor da propriedade percentTimeInTopGear.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPercentTimeInTopGear(JAXBElement<Double> value) {
        this.percentTimeInTopGear = value;
    }

    /**
     * Obtém o valor da propriedade startTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Define o valor da propriedade startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Obtém o valor da propriedade workerIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerIdentifier() {
        return workerIdentifier;
    }

    /**
     * Define o valor da propriedade workerIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerIdentifier(JAXBElement<String> value) {
        this.workerIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade workerName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getWorkerName() {
        return workerName;
    }

    /**
     * Define o valor da propriedade workerName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setWorkerName(JAXBElement<PersonName> value) {
        this.workerName = value;
    }

}
