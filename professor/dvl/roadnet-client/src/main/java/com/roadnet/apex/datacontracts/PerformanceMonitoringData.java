
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
 * <p>Classe Java de PerformanceMonitoringData complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PerformanceMonitoringData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CruiseControlDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="CruiseControlFuelUsed" type="{http://roadnet.com/apex/DataContracts/}LiquidVolume" minOccurs="0"/&gt;
 *         &lt;element name="CruiseControlTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="Distance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="DriveFuelUsed" type="{http://roadnet.com/apex/DataContracts/}LiquidVolume" minOccurs="0"/&gt;
 *         &lt;element name="DriveTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="EndCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="EndTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EngineRunTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ExcessiveOverSpeedFuelUsed" type="{http://roadnet.com/apex/DataContracts/}LiquidVolume" minOccurs="0"/&gt;
 *         &lt;element name="ExcessiveOverSpeedTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="FuelUsed" type="{http://roadnet.com/apex/DataContracts/}LiquidVolume" minOccurs="0"/&gt;
 *         &lt;element name="IdleFuelUsed" type="{http://roadnet.com/apex/DataContracts/}LiquidVolume" minOccurs="0"/&gt;
 *         &lt;element name="IdleTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MovingFuelUsed" type="{http://roadnet.com/apex/DataContracts/}LiquidVolume" minOccurs="0"/&gt;
 *         &lt;element name="MovingTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="OverSpeedFuelUsed" type="{http://roadnet.com/apex/DataContracts/}LiquidVolume" minOccurs="0"/&gt;
 *         &lt;element name="OverSpeedTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="ParkFuelUsed" type="{http://roadnet.com/apex/DataContracts/}LiquidVolume" minOccurs="0"/&gt;
 *         &lt;element name="ParkTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PtoFuelUsed" type="{http://roadnet.com/apex/DataContracts/}LiquidVolume" minOccurs="0"/&gt;
 *         &lt;element name="PtoTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="SpeedRpmMatrix" type="{http://roadnet.com/apex/DataContracts/}SpeedRpmMatrix" minOccurs="0"/&gt;
 *         &lt;element name="StartCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="StartTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TopGearTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceMonitoringData", propOrder = {
    "cruiseControlDistance",
    "cruiseControlFuelUsed",
    "cruiseControlTime",
    "distance",
    "driveFuelUsed",
    "driveTime",
    "endCoordinate",
    "endTimestamp",
    "engineRunTime",
    "equipmentEntityKey",
    "excessiveOverSpeedFuelUsed",
    "excessiveOverSpeedTime",
    "fuelUsed",
    "idleFuelUsed",
    "idleTime",
    "movingFuelUsed",
    "movingTime",
    "overSpeedFuelUsed",
    "overSpeedTime",
    "parkFuelUsed",
    "parkTime",
    "ptoFuelUsed",
    "ptoTime",
    "speedRpmMatrix",
    "startCoordinate",
    "startTimestamp",
    "telematicsDeviceEntityKey",
    "topGearTime",
    "workerEntityKey"
})
public class PerformanceMonitoringData
    extends RegionBasedAggregateRootEntity
{

    @XmlElementRef(name = "CruiseControlDistance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> cruiseControlDistance;
    @XmlElementRef(name = "CruiseControlFuelUsed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidVolume> cruiseControlFuelUsed;
    @XmlElementRef(name = "CruiseControlTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> cruiseControlTime;
    @XmlElementRef(name = "Distance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> distance;
    @XmlElementRef(name = "DriveFuelUsed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidVolume> driveFuelUsed;
    @XmlElementRef(name = "DriveTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> driveTime;
    @XmlElementRef(name = "EndCoordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> endCoordinate;
    @XmlElement(name = "EndTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTimestamp;
    @XmlElementRef(name = "EngineRunTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> engineRunTime;
    @XmlElement(name = "EquipmentEntityKey")
    protected Long equipmentEntityKey;
    @XmlElementRef(name = "ExcessiveOverSpeedFuelUsed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidVolume> excessiveOverSpeedFuelUsed;
    @XmlElementRef(name = "ExcessiveOverSpeedTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> excessiveOverSpeedTime;
    @XmlElementRef(name = "FuelUsed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidVolume> fuelUsed;
    @XmlElementRef(name = "IdleFuelUsed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidVolume> idleFuelUsed;
    @XmlElementRef(name = "IdleTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> idleTime;
    @XmlElementRef(name = "MovingFuelUsed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidVolume> movingFuelUsed;
    @XmlElementRef(name = "MovingTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> movingTime;
    @XmlElementRef(name = "OverSpeedFuelUsed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidVolume> overSpeedFuelUsed;
    @XmlElementRef(name = "OverSpeedTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> overSpeedTime;
    @XmlElementRef(name = "ParkFuelUsed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidVolume> parkFuelUsed;
    @XmlElementRef(name = "ParkTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> parkTime;
    @XmlElementRef(name = "PtoFuelUsed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidVolume> ptoFuelUsed;
    @XmlElementRef(name = "PtoTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> ptoTime;
    @XmlElementRef(name = "SpeedRpmMatrix", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<SpeedRpmMatrix> speedRpmMatrix;
    @XmlElementRef(name = "StartCoordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> startCoordinate;
    @XmlElement(name = "StartTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTimestamp;
    @XmlElement(name = "TelematicsDeviceEntityKey")
    protected Long telematicsDeviceEntityKey;
    @XmlElementRef(name = "TopGearTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> topGearTime;
    @XmlElement(name = "WorkerEntityKey")
    protected Long workerEntityKey;

    /**
     * Obtém o valor da propriedade cruiseControlDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getCruiseControlDistance() {
        return cruiseControlDistance;
    }

    /**
     * Define o valor da propriedade cruiseControlDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setCruiseControlDistance(JAXBElement<Distance> value) {
        this.cruiseControlDistance = value;
    }

    /**
     * Obtém o valor da propriedade cruiseControlFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public JAXBElement<LiquidVolume> getCruiseControlFuelUsed() {
        return cruiseControlFuelUsed;
    }

    /**
     * Define o valor da propriedade cruiseControlFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public void setCruiseControlFuelUsed(JAXBElement<LiquidVolume> value) {
        this.cruiseControlFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade cruiseControlTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getCruiseControlTime() {
        return cruiseControlTime;
    }

    /**
     * Define o valor da propriedade cruiseControlTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setCruiseControlTime(JAXBElement<Duration> value) {
        this.cruiseControlTime = value;
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
     * Obtém o valor da propriedade driveFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public JAXBElement<LiquidVolume> getDriveFuelUsed() {
        return driveFuelUsed;
    }

    /**
     * Define o valor da propriedade driveFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public void setDriveFuelUsed(JAXBElement<LiquidVolume> value) {
        this.driveFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade driveTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getDriveTime() {
        return driveTime;
    }

    /**
     * Define o valor da propriedade driveTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setDriveTime(JAXBElement<Duration> value) {
        this.driveTime = value;
    }

    /**
     * Obtém o valor da propriedade endCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getEndCoordinate() {
        return endCoordinate;
    }

    /**
     * Define o valor da propriedade endCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setEndCoordinate(JAXBElement<Coordinate> value) {
        this.endCoordinate = value;
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
     * Obtém o valor da propriedade equipmentEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEquipmentEntityKey() {
        return equipmentEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEquipmentEntityKey(Long value) {
        this.equipmentEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade excessiveOverSpeedFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public JAXBElement<LiquidVolume> getExcessiveOverSpeedFuelUsed() {
        return excessiveOverSpeedFuelUsed;
    }

    /**
     * Define o valor da propriedade excessiveOverSpeedFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public void setExcessiveOverSpeedFuelUsed(JAXBElement<LiquidVolume> value) {
        this.excessiveOverSpeedFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade excessiveOverSpeedTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getExcessiveOverSpeedTime() {
        return excessiveOverSpeedTime;
    }

    /**
     * Define o valor da propriedade excessiveOverSpeedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setExcessiveOverSpeedTime(JAXBElement<Duration> value) {
        this.excessiveOverSpeedTime = value;
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
     * Obtém o valor da propriedade idleFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public JAXBElement<LiquidVolume> getIdleFuelUsed() {
        return idleFuelUsed;
    }

    /**
     * Define o valor da propriedade idleFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public void setIdleFuelUsed(JAXBElement<LiquidVolume> value) {
        this.idleFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade idleTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getIdleTime() {
        return idleTime;
    }

    /**
     * Define o valor da propriedade idleTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setIdleTime(JAXBElement<Duration> value) {
        this.idleTime = value;
    }

    /**
     * Obtém o valor da propriedade movingFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public JAXBElement<LiquidVolume> getMovingFuelUsed() {
        return movingFuelUsed;
    }

    /**
     * Define o valor da propriedade movingFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public void setMovingFuelUsed(JAXBElement<LiquidVolume> value) {
        this.movingFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade movingTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getMovingTime() {
        return movingTime;
    }

    /**
     * Define o valor da propriedade movingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setMovingTime(JAXBElement<Duration> value) {
        this.movingTime = value;
    }

    /**
     * Obtém o valor da propriedade overSpeedFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public JAXBElement<LiquidVolume> getOverSpeedFuelUsed() {
        return overSpeedFuelUsed;
    }

    /**
     * Define o valor da propriedade overSpeedFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public void setOverSpeedFuelUsed(JAXBElement<LiquidVolume> value) {
        this.overSpeedFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade overSpeedTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getOverSpeedTime() {
        return overSpeedTime;
    }

    /**
     * Define o valor da propriedade overSpeedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setOverSpeedTime(JAXBElement<Duration> value) {
        this.overSpeedTime = value;
    }

    /**
     * Obtém o valor da propriedade parkFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public JAXBElement<LiquidVolume> getParkFuelUsed() {
        return parkFuelUsed;
    }

    /**
     * Define o valor da propriedade parkFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public void setParkFuelUsed(JAXBElement<LiquidVolume> value) {
        this.parkFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade parkTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getParkTime() {
        return parkTime;
    }

    /**
     * Define o valor da propriedade parkTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setParkTime(JAXBElement<Duration> value) {
        this.parkTime = value;
    }

    /**
     * Obtém o valor da propriedade ptoFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public JAXBElement<LiquidVolume> getPtoFuelUsed() {
        return ptoFuelUsed;
    }

    /**
     * Define o valor da propriedade ptoFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public void setPtoFuelUsed(JAXBElement<LiquidVolume> value) {
        this.ptoFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade ptoTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getPtoTime() {
        return ptoTime;
    }

    /**
     * Define o valor da propriedade ptoTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setPtoTime(JAXBElement<Duration> value) {
        this.ptoTime = value;
    }

    /**
     * Obtém o valor da propriedade speedRpmMatrix.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SpeedRpmMatrix }{@code >}
     *     
     */
    public JAXBElement<SpeedRpmMatrix> getSpeedRpmMatrix() {
        return speedRpmMatrix;
    }

    /**
     * Define o valor da propriedade speedRpmMatrix.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SpeedRpmMatrix }{@code >}
     *     
     */
    public void setSpeedRpmMatrix(JAXBElement<SpeedRpmMatrix> value) {
        this.speedRpmMatrix = value;
    }

    /**
     * Obtém o valor da propriedade startCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getStartCoordinate() {
        return startCoordinate;
    }

    /**
     * Define o valor da propriedade startCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setStartCoordinate(JAXBElement<Coordinate> value) {
        this.startCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade startTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * Define o valor da propriedade startTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTimestamp(XMLGregorianCalendar value) {
        this.startTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTelematicsDeviceEntityKey() {
        return telematicsDeviceEntityKey;
    }

    /**
     * Define o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTelematicsDeviceEntityKey(Long value) {
        this.telematicsDeviceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade topGearTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTopGearTime() {
        return topGearTime;
    }

    /**
     * Define o valor da propriedade topGearTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTopGearTime(JAXBElement<Duration> value) {
        this.topGearTime = value;
    }

    /**
     * Obtém o valor da propriedade workerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkerEntityKey() {
        return workerEntityKey;
    }

    /**
     * Define o valor da propriedade workerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkerEntityKey(Long value) {
        this.workerEntityKey = value;
    }

}
