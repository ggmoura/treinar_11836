
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de DiagnosticTroubleCodeEvent complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticTroubleCodeEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CoolantTemperatureValue" type="{http://roadnet.com/apex/DataContracts/}Temperature" minOccurs="0"/&gt;
 *         &lt;element name="Coordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="CoordinateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndOdometer" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndTotalEngineHours" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="EngineRPM" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EngineTemperatureValue" type="{http://roadnet.com/apex/DataContracts/}Temperature" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="GearState" type="{http://roadnet.com/apex/DataContracts/}TransmissionGearState" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartOdometer" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="StartTotalEngineHours" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticTroubleCodeEvent", propOrder = {
    "code",
    "coolantTemperatureValue",
    "coordinate",
    "coordinateTime",
    "description",
    "endOdometer",
    "endTime",
    "endTotalEngineHours",
    "engineRPM",
    "engineTemperatureValue",
    "equipmentEntityKey",
    "gearState",
    "isActive",
    "startOdometer",
    "startTime",
    "startTotalEngineHours"
})
@XmlSeeAlso({
    J1587TroubleCodeEvent.class,
    J1939TroubleCodeEvent.class,
    OBD2TroubleCodeEvent.class
})
public class DiagnosticTroubleCodeEvent
    extends VisibleInMultipleRegionsAggregateRootEntity
{

    @XmlElementRef(name = "Code", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> code;
    @XmlElementRef(name = "CoolantTemperatureValue", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Temperature> coolantTemperatureValue;
    @XmlElementRef(name = "Coordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinate;
    @XmlElementRef(name = "CoordinateTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> coordinateTime;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "EndOdometer", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> endOdometer;
    @XmlElementRef(name = "EndTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endTime;
    @XmlElementRef(name = "EndTotalEngineHours", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> endTotalEngineHours;
    @XmlElementRef(name = "EngineRPM", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> engineRPM;
    @XmlElementRef(name = "EngineTemperatureValue", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Temperature> engineTemperatureValue;
    @XmlElement(name = "EquipmentEntityKey")
    protected Long equipmentEntityKey;
    @XmlElementRef(name = "GearState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TransmissionGearState> gearState;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElementRef(name = "StartOdometer", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> startOdometer;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElementRef(name = "StartTotalEngineHours", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> startTotalEngineHours;

    /**
     * Obtém o valor da propriedade code.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCode() {
        return code;
    }

    /**
     * Define o valor da propriedade code.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCode(JAXBElement<String> value) {
        this.code = value;
    }

    /**
     * Obtém o valor da propriedade coolantTemperatureValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Temperature }{@code >}
     *     
     */
    public JAXBElement<Temperature> getCoolantTemperatureValue() {
        return coolantTemperatureValue;
    }

    /**
     * Define o valor da propriedade coolantTemperatureValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Temperature }{@code >}
     *     
     */
    public void setCoolantTemperatureValue(JAXBElement<Temperature> value) {
        this.coolantTemperatureValue = value;
    }

    /**
     * Obtém o valor da propriedade coordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getCoordinate() {
        return coordinate;
    }

    /**
     * Define o valor da propriedade coordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setCoordinate(JAXBElement<Coordinate> value) {
        this.coordinate = value;
    }

    /**
     * Obtém o valor da propriedade coordinateTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCoordinateTime() {
        return coordinateTime;
    }

    /**
     * Define o valor da propriedade coordinateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCoordinateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.coordinateTime = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade endOdometer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getEndOdometer() {
        return endOdometer;
    }

    /**
     * Define o valor da propriedade endOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setEndOdometer(JAXBElement<Distance> value) {
        this.endOdometer = value;
    }

    /**
     * Obtém o valor da propriedade endTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndTime() {
        return endTime;
    }

    /**
     * Define o valor da propriedade endTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndTime(JAXBElement<XMLGregorianCalendar> value) {
        this.endTime = value;
    }

    /**
     * Obtém o valor da propriedade endTotalEngineHours.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getEndTotalEngineHours() {
        return endTotalEngineHours;
    }

    /**
     * Define o valor da propriedade endTotalEngineHours.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setEndTotalEngineHours(JAXBElement<Duration> value) {
        this.endTotalEngineHours = value;
    }

    /**
     * Obtém o valor da propriedade engineRPM.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEngineRPM() {
        return engineRPM;
    }

    /**
     * Define o valor da propriedade engineRPM.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEngineRPM(JAXBElement<Integer> value) {
        this.engineRPM = value;
    }

    /**
     * Obtém o valor da propriedade engineTemperatureValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Temperature }{@code >}
     *     
     */
    public JAXBElement<Temperature> getEngineTemperatureValue() {
        return engineTemperatureValue;
    }

    /**
     * Define o valor da propriedade engineTemperatureValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Temperature }{@code >}
     *     
     */
    public void setEngineTemperatureValue(JAXBElement<Temperature> value) {
        this.engineTemperatureValue = value;
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
     * Obtém o valor da propriedade gearState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransmissionGearState }{@code >}
     *     
     */
    public JAXBElement<TransmissionGearState> getGearState() {
        return gearState;
    }

    /**
     * Define o valor da propriedade gearState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransmissionGearState }{@code >}
     *     
     */
    public void setGearState(JAXBElement<TransmissionGearState> value) {
        this.gearState = value;
    }

    /**
     * Obtém o valor da propriedade isActive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Define o valor da propriedade isActive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Obtém o valor da propriedade startOdometer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getStartOdometer() {
        return startOdometer;
    }

    /**
     * Define o valor da propriedade startOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setStartOdometer(JAXBElement<Distance> value) {
        this.startOdometer = value;
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
     * Obtém o valor da propriedade startTotalEngineHours.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getStartTotalEngineHours() {
        return startTotalEngineHours;
    }

    /**
     * Define o valor da propriedade startTotalEngineHours.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setStartTotalEngineHours(JAXBElement<Duration> value) {
        this.startTotalEngineHours = value;
    }

}
