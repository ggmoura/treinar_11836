
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PerformanceMonitoringDataPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PerformanceMonitoringDataPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CruiseControlDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CruiseControlFuelUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CruiseControlTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DriveFuelUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DriveTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EndCoordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EndTimestamp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EngineRunTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExcessiveOverSpeedFuelUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExcessiveOverSpeedTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FuelUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IdleFuelUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IdleTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MovingFuelUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MovingTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverSpeedFuelUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverSpeedTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ParkFuelUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ParkTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PtoFuelUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PtoTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SpeedRpmMatrix" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartCoordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartTimestamp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TopGearTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceMonitoringDataPropertyOptions", propOrder = {
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
public class PerformanceMonitoringDataPropertyOptions
    extends RegionBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "CruiseControlDistance")
    protected Boolean cruiseControlDistance;
    @XmlElement(name = "CruiseControlFuelUsed")
    protected Boolean cruiseControlFuelUsed;
    @XmlElement(name = "CruiseControlTime")
    protected Boolean cruiseControlTime;
    @XmlElement(name = "Distance")
    protected Boolean distance;
    @XmlElement(name = "DriveFuelUsed")
    protected Boolean driveFuelUsed;
    @XmlElement(name = "DriveTime")
    protected Boolean driveTime;
    @XmlElement(name = "EndCoordinate")
    protected Boolean endCoordinate;
    @XmlElement(name = "EndTimestamp")
    protected Boolean endTimestamp;
    @XmlElement(name = "EngineRunTime")
    protected Boolean engineRunTime;
    @XmlElement(name = "EquipmentEntityKey")
    protected Boolean equipmentEntityKey;
    @XmlElement(name = "ExcessiveOverSpeedFuelUsed")
    protected Boolean excessiveOverSpeedFuelUsed;
    @XmlElement(name = "ExcessiveOverSpeedTime")
    protected Boolean excessiveOverSpeedTime;
    @XmlElement(name = "FuelUsed")
    protected Boolean fuelUsed;
    @XmlElement(name = "IdleFuelUsed")
    protected Boolean idleFuelUsed;
    @XmlElement(name = "IdleTime")
    protected Boolean idleTime;
    @XmlElement(name = "MovingFuelUsed")
    protected Boolean movingFuelUsed;
    @XmlElement(name = "MovingTime")
    protected Boolean movingTime;
    @XmlElement(name = "OverSpeedFuelUsed")
    protected Boolean overSpeedFuelUsed;
    @XmlElement(name = "OverSpeedTime")
    protected Boolean overSpeedTime;
    @XmlElement(name = "ParkFuelUsed")
    protected Boolean parkFuelUsed;
    @XmlElement(name = "ParkTime")
    protected Boolean parkTime;
    @XmlElement(name = "PtoFuelUsed")
    protected Boolean ptoFuelUsed;
    @XmlElement(name = "PtoTime")
    protected Boolean ptoTime;
    @XmlElement(name = "SpeedRpmMatrix")
    protected Boolean speedRpmMatrix;
    @XmlElement(name = "StartCoordinate")
    protected Boolean startCoordinate;
    @XmlElement(name = "StartTimestamp")
    protected Boolean startTimestamp;
    @XmlElement(name = "TelematicsDeviceEntityKey")
    protected Boolean telematicsDeviceEntityKey;
    @XmlElement(name = "TopGearTime")
    protected Boolean topGearTime;
    @XmlElement(name = "WorkerEntityKey")
    protected Boolean workerEntityKey;

    /**
     * Obtém o valor da propriedade cruiseControlDistance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCruiseControlDistance() {
        return cruiseControlDistance;
    }

    /**
     * Define o valor da propriedade cruiseControlDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCruiseControlDistance(Boolean value) {
        this.cruiseControlDistance = value;
    }

    /**
     * Obtém o valor da propriedade cruiseControlFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCruiseControlFuelUsed() {
        return cruiseControlFuelUsed;
    }

    /**
     * Define o valor da propriedade cruiseControlFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCruiseControlFuelUsed(Boolean value) {
        this.cruiseControlFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade cruiseControlTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCruiseControlTime() {
        return cruiseControlTime;
    }

    /**
     * Define o valor da propriedade cruiseControlTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCruiseControlTime(Boolean value) {
        this.cruiseControlTime = value;
    }

    /**
     * Obtém o valor da propriedade distance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistance() {
        return distance;
    }

    /**
     * Define o valor da propriedade distance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistance(Boolean value) {
        this.distance = value;
    }

    /**
     * Obtém o valor da propriedade driveFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDriveFuelUsed() {
        return driveFuelUsed;
    }

    /**
     * Define o valor da propriedade driveFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDriveFuelUsed(Boolean value) {
        this.driveFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade driveTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDriveTime() {
        return driveTime;
    }

    /**
     * Define o valor da propriedade driveTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDriveTime(Boolean value) {
        this.driveTime = value;
    }

    /**
     * Obtém o valor da propriedade endCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndCoordinate() {
        return endCoordinate;
    }

    /**
     * Define o valor da propriedade endCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndCoordinate(Boolean value) {
        this.endCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade endTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndTimestamp() {
        return endTimestamp;
    }

    /**
     * Define o valor da propriedade endTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndTimestamp(Boolean value) {
        this.endTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade engineRunTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEngineRunTime() {
        return engineRunTime;
    }

    /**
     * Define o valor da propriedade engineRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEngineRunTime(Boolean value) {
        this.engineRunTime = value;
    }

    /**
     * Obtém o valor da propriedade equipmentEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentEntityKey() {
        return equipmentEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentEntityKey(Boolean value) {
        this.equipmentEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade excessiveOverSpeedFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcessiveOverSpeedFuelUsed() {
        return excessiveOverSpeedFuelUsed;
    }

    /**
     * Define o valor da propriedade excessiveOverSpeedFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcessiveOverSpeedFuelUsed(Boolean value) {
        this.excessiveOverSpeedFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade excessiveOverSpeedTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcessiveOverSpeedTime() {
        return excessiveOverSpeedTime;
    }

    /**
     * Define o valor da propriedade excessiveOverSpeedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcessiveOverSpeedTime(Boolean value) {
        this.excessiveOverSpeedTime = value;
    }

    /**
     * Obtém o valor da propriedade fuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFuelUsed() {
        return fuelUsed;
    }

    /**
     * Define o valor da propriedade fuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFuelUsed(Boolean value) {
        this.fuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade idleFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdleFuelUsed() {
        return idleFuelUsed;
    }

    /**
     * Define o valor da propriedade idleFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdleFuelUsed(Boolean value) {
        this.idleFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade idleTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdleTime() {
        return idleTime;
    }

    /**
     * Define o valor da propriedade idleTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdleTime(Boolean value) {
        this.idleTime = value;
    }

    /**
     * Obtém o valor da propriedade movingFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMovingFuelUsed() {
        return movingFuelUsed;
    }

    /**
     * Define o valor da propriedade movingFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMovingFuelUsed(Boolean value) {
        this.movingFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade movingTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMovingTime() {
        return movingTime;
    }

    /**
     * Define o valor da propriedade movingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMovingTime(Boolean value) {
        this.movingTime = value;
    }

    /**
     * Obtém o valor da propriedade overSpeedFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverSpeedFuelUsed() {
        return overSpeedFuelUsed;
    }

    /**
     * Define o valor da propriedade overSpeedFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverSpeedFuelUsed(Boolean value) {
        this.overSpeedFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade overSpeedTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverSpeedTime() {
        return overSpeedTime;
    }

    /**
     * Define o valor da propriedade overSpeedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverSpeedTime(Boolean value) {
        this.overSpeedTime = value;
    }

    /**
     * Obtém o valor da propriedade parkFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParkFuelUsed() {
        return parkFuelUsed;
    }

    /**
     * Define o valor da propriedade parkFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParkFuelUsed(Boolean value) {
        this.parkFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade parkTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParkTime() {
        return parkTime;
    }

    /**
     * Define o valor da propriedade parkTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParkTime(Boolean value) {
        this.parkTime = value;
    }

    /**
     * Obtém o valor da propriedade ptoFuelUsed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPtoFuelUsed() {
        return ptoFuelUsed;
    }

    /**
     * Define o valor da propriedade ptoFuelUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPtoFuelUsed(Boolean value) {
        this.ptoFuelUsed = value;
    }

    /**
     * Obtém o valor da propriedade ptoTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPtoTime() {
        return ptoTime;
    }

    /**
     * Define o valor da propriedade ptoTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPtoTime(Boolean value) {
        this.ptoTime = value;
    }

    /**
     * Obtém o valor da propriedade speedRpmMatrix.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpeedRpmMatrix() {
        return speedRpmMatrix;
    }

    /**
     * Define o valor da propriedade speedRpmMatrix.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpeedRpmMatrix(Boolean value) {
        this.speedRpmMatrix = value;
    }

    /**
     * Obtém o valor da propriedade startCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartCoordinate() {
        return startCoordinate;
    }

    /**
     * Define o valor da propriedade startCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartCoordinate(Boolean value) {
        this.startCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade startTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartTimestamp() {
        return startTimestamp;
    }

    /**
     * Define o valor da propriedade startTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartTimestamp(Boolean value) {
        this.startTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelematicsDeviceEntityKey() {
        return telematicsDeviceEntityKey;
    }

    /**
     * Define o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelematicsDeviceEntityKey(Boolean value) {
        this.telematicsDeviceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade topGearTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTopGearTime() {
        return topGearTime;
    }

    /**
     * Define o valor da propriedade topGearTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTopGearTime(Boolean value) {
        this.topGearTime = value;
    }

    /**
     * Obtém o valor da propriedade workerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkerEntityKey() {
        return workerEntityKey;
    }

    /**
     * Define o valor da propriedade workerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkerEntityKey(Boolean value) {
        this.workerEntityKey = value;
    }

}
