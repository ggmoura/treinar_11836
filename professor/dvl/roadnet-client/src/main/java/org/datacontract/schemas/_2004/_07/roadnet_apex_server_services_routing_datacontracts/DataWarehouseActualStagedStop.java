
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.Distance;


/**
 * <p>Classe Java de DataWarehouseActualStagedStop complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseActualStagedStop"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse}DataWarehouseStagedStop"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualArrival" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActualCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ActualDeparture" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActualIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActualSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActualTimeWindowVariance" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="DistanceTo" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="DistanceToGps" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="DistanceToOdometer" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="EngineIdleTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="IsCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseActualStagedStop", propOrder = {
    "actualArrival",
    "actualCost",
    "actualDeparture",
    "actualIndex",
    "actualSequenceNumber",
    "actualTimeWindowVariance",
    "distanceTo",
    "distanceToGps",
    "distanceToOdometer",
    "engineIdleTime",
    "isCancelled"
})
public class DataWarehouseActualStagedStop
    extends DataWarehouseStagedStop
{

    @XmlElementRef(name = "ActualArrival", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualArrival;
    @XmlElement(name = "ActualCost")
    protected Double actualCost;
    @XmlElementRef(name = "ActualDeparture", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualDeparture;
    @XmlElement(name = "ActualIndex")
    protected Integer actualIndex;
    @XmlElementRef(name = "ActualSequenceNumber", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> actualSequenceNumber;
    @XmlElement(name = "ActualTimeWindowVariance")
    protected Duration actualTimeWindowVariance;
    @XmlElementRef(name = "DistanceTo", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> distanceTo;
    @XmlElementRef(name = "DistanceToGps", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> distanceToGps;
    @XmlElementRef(name = "DistanceToOdometer", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> distanceToOdometer;
    @XmlElementRef(name = "EngineIdleTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> engineIdleTime;
    @XmlElement(name = "IsCancelled")
    protected Boolean isCancelled;

    /**
     * Obtém o valor da propriedade actualArrival.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualArrival() {
        return actualArrival;
    }

    /**
     * Define o valor da propriedade actualArrival.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualArrival(JAXBElement<XMLGregorianCalendar> value) {
        this.actualArrival = value;
    }

    /**
     * Obtém o valor da propriedade actualCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualCost() {
        return actualCost;
    }

    /**
     * Define o valor da propriedade actualCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualCost(Double value) {
        this.actualCost = value;
    }

    /**
     * Obtém o valor da propriedade actualDeparture.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualDeparture() {
        return actualDeparture;
    }

    /**
     * Define o valor da propriedade actualDeparture.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualDeparture(JAXBElement<XMLGregorianCalendar> value) {
        this.actualDeparture = value;
    }

    /**
     * Obtém o valor da propriedade actualIndex.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActualIndex() {
        return actualIndex;
    }

    /**
     * Define o valor da propriedade actualIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActualIndex(Integer value) {
        this.actualIndex = value;
    }

    /**
     * Obtém o valor da propriedade actualSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getActualSequenceNumber() {
        return actualSequenceNumber;
    }

    /**
     * Define o valor da propriedade actualSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setActualSequenceNumber(JAXBElement<Integer> value) {
        this.actualSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade actualTimeWindowVariance.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getActualTimeWindowVariance() {
        return actualTimeWindowVariance;
    }

    /**
     * Define o valor da propriedade actualTimeWindowVariance.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setActualTimeWindowVariance(Duration value) {
        this.actualTimeWindowVariance = value;
    }

    /**
     * Obtém o valor da propriedade distanceTo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDistanceTo() {
        return distanceTo;
    }

    /**
     * Define o valor da propriedade distanceTo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDistanceTo(JAXBElement<Distance> value) {
        this.distanceTo = value;
    }

    /**
     * Obtém o valor da propriedade distanceToGps.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDistanceToGps() {
        return distanceToGps;
    }

    /**
     * Define o valor da propriedade distanceToGps.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDistanceToGps(JAXBElement<Distance> value) {
        this.distanceToGps = value;
    }

    /**
     * Obtém o valor da propriedade distanceToOdometer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDistanceToOdometer() {
        return distanceToOdometer;
    }

    /**
     * Define o valor da propriedade distanceToOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDistanceToOdometer(JAXBElement<Distance> value) {
        this.distanceToOdometer = value;
    }

    /**
     * Obtém o valor da propriedade engineIdleTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getEngineIdleTime() {
        return engineIdleTime;
    }

    /**
     * Define o valor da propriedade engineIdleTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setEngineIdleTime(JAXBElement<Duration> value) {
        this.engineIdleTime = value;
    }

    /**
     * Obtém o valor da propriedade isCancelled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCancelled() {
        return isCancelled;
    }

    /**
     * Define o valor da propriedade isCancelled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCancelled(Boolean value) {
        this.isCancelled = value;
    }

}
