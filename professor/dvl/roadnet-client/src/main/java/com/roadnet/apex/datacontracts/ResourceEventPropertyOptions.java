
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ResourceEventPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResourceEventPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bearing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Complete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Coordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EndTimestamp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ForwardGForce" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GPSSpeed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Incident" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LateralGForce" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Moving" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Speed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartTimestamp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StationaryTriggerType_Trigger" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VerticalGForce" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceEventPropertyOptions", propOrder = {
    "bearing",
    "complete",
    "coordinate",
    "endTimestamp",
    "forwardGForce",
    "gpsSpeed",
    "incident",
    "lateralGForce",
    "moving",
    "speed",
    "startTimestamp",
    "stationaryTriggerTypeTrigger",
    "verticalGForce"
})
public class ResourceEventPropertyOptions
    extends RegionBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "Bearing")
    protected Boolean bearing;
    @XmlElement(name = "Complete")
    protected Boolean complete;
    @XmlElement(name = "Coordinate")
    protected Boolean coordinate;
    @XmlElement(name = "EndTimestamp")
    protected Boolean endTimestamp;
    @XmlElement(name = "ForwardGForce")
    protected Boolean forwardGForce;
    @XmlElement(name = "GPSSpeed")
    protected Boolean gpsSpeed;
    @XmlElement(name = "Incident")
    protected Boolean incident;
    @XmlElement(name = "LateralGForce")
    protected Boolean lateralGForce;
    @XmlElement(name = "Moving")
    protected Boolean moving;
    @XmlElement(name = "Speed")
    protected Boolean speed;
    @XmlElement(name = "StartTimestamp")
    protected Boolean startTimestamp;
    @XmlElement(name = "StationaryTriggerType_Trigger")
    protected Boolean stationaryTriggerTypeTrigger;
    @XmlElement(name = "VerticalGForce")
    protected Boolean verticalGForce;

    /**
     * Obtém o valor da propriedade bearing.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBearing() {
        return bearing;
    }

    /**
     * Define o valor da propriedade bearing.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBearing(Boolean value) {
        this.bearing = value;
    }

    /**
     * Obtém o valor da propriedade complete.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplete() {
        return complete;
    }

    /**
     * Define o valor da propriedade complete.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplete(Boolean value) {
        this.complete = value;
    }

    /**
     * Obtém o valor da propriedade coordinate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoordinate() {
        return coordinate;
    }

    /**
     * Define o valor da propriedade coordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoordinate(Boolean value) {
        this.coordinate = value;
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
     * Obtém o valor da propriedade forwardGForce.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForwardGForce() {
        return forwardGForce;
    }

    /**
     * Define o valor da propriedade forwardGForce.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForwardGForce(Boolean value) {
        this.forwardGForce = value;
    }

    /**
     * Obtém o valor da propriedade gpsSpeed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGPSSpeed() {
        return gpsSpeed;
    }

    /**
     * Define o valor da propriedade gpsSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGPSSpeed(Boolean value) {
        this.gpsSpeed = value;
    }

    /**
     * Obtém o valor da propriedade incident.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncident() {
        return incident;
    }

    /**
     * Define o valor da propriedade incident.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncident(Boolean value) {
        this.incident = value;
    }

    /**
     * Obtém o valor da propriedade lateralGForce.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLateralGForce() {
        return lateralGForce;
    }

    /**
     * Define o valor da propriedade lateralGForce.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLateralGForce(Boolean value) {
        this.lateralGForce = value;
    }

    /**
     * Obtém o valor da propriedade moving.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoving() {
        return moving;
    }

    /**
     * Define o valor da propriedade moving.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoving(Boolean value) {
        this.moving = value;
    }

    /**
     * Obtém o valor da propriedade speed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpeed() {
        return speed;
    }

    /**
     * Define o valor da propriedade speed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpeed(Boolean value) {
        this.speed = value;
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
     * Obtém o valor da propriedade stationaryTriggerTypeTrigger.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStationaryTriggerTypeTrigger() {
        return stationaryTriggerTypeTrigger;
    }

    /**
     * Define o valor da propriedade stationaryTriggerTypeTrigger.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStationaryTriggerTypeTrigger(Boolean value) {
        this.stationaryTriggerTypeTrigger = value;
    }

    /**
     * Obtém o valor da propriedade verticalGForce.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerticalGForce() {
        return verticalGForce;
    }

    /**
     * Define o valor da propriedade verticalGForce.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerticalGForce(Boolean value) {
        this.verticalGForce = value;
    }

}
