
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de NetworkArcPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkArcPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdvisoryPostedSpeedLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AdvisoryTruckSpeedLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EndLeftAddressNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EndRightAddressNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EndZLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InstanceID" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsFrontageRoad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsLoadable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTollRoad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LeftLocality" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NetworkArcRenderingCode_RenderingCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NetworkTravelDirection_TravelDirection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NoThruTraffic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NominalSpeed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PostedSpeedLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RightLocality" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShapePoints" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartLeftAddressNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartRightAddressNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartZLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Streets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TravelRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TruckSpeedLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WeeklyTravelSpeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_TimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkArcPropertyOptions", propOrder = {
    "advisoryPostedSpeedLimit",
    "advisoryTruckSpeedLimit",
    "endLeftAddressNumber",
    "endRightAddressNumber",
    "endZLevel",
    "instanceID",
    "isEnabled",
    "isFrontageRoad",
    "isLoadable",
    "isTollRoad",
    "leftLocality",
    "networkArcRenderingCodeRenderingCode",
    "networkTravelDirectionTravelDirection",
    "noThruTraffic",
    "nominalSpeed",
    "postedSpeedLimit",
    "rightLocality",
    "shapePoints",
    "startLeftAddressNumber",
    "startRightAddressNumber",
    "startZLevel",
    "streets",
    "travelRules",
    "truckSpeedLimit",
    "weeklyTravelSpeeds",
    "worldTimeZoneTimeZone"
})
public class NetworkArcPropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "AdvisoryPostedSpeedLimit")
    protected Boolean advisoryPostedSpeedLimit;
    @XmlElement(name = "AdvisoryTruckSpeedLimit")
    protected Boolean advisoryTruckSpeedLimit;
    @XmlElement(name = "EndLeftAddressNumber")
    protected Boolean endLeftAddressNumber;
    @XmlElement(name = "EndRightAddressNumber")
    protected Boolean endRightAddressNumber;
    @XmlElement(name = "EndZLevel")
    protected Boolean endZLevel;
    @XmlElement(name = "InstanceID")
    protected Boolean instanceID;
    @XmlElement(name = "IsEnabled")
    protected Boolean isEnabled;
    @XmlElement(name = "IsFrontageRoad")
    protected Boolean isFrontageRoad;
    @XmlElement(name = "IsLoadable")
    protected Boolean isLoadable;
    @XmlElement(name = "IsTollRoad")
    protected Boolean isTollRoad;
    @XmlElement(name = "LeftLocality")
    protected Boolean leftLocality;
    @XmlElement(name = "NetworkArcRenderingCode_RenderingCode")
    protected Boolean networkArcRenderingCodeRenderingCode;
    @XmlElement(name = "NetworkTravelDirection_TravelDirection")
    protected Boolean networkTravelDirectionTravelDirection;
    @XmlElement(name = "NoThruTraffic")
    protected Boolean noThruTraffic;
    @XmlElement(name = "NominalSpeed")
    protected Boolean nominalSpeed;
    @XmlElement(name = "PostedSpeedLimit")
    protected Boolean postedSpeedLimit;
    @XmlElement(name = "RightLocality")
    protected Boolean rightLocality;
    @XmlElement(name = "ShapePoints")
    protected Boolean shapePoints;
    @XmlElement(name = "StartLeftAddressNumber")
    protected Boolean startLeftAddressNumber;
    @XmlElement(name = "StartRightAddressNumber")
    protected Boolean startRightAddressNumber;
    @XmlElement(name = "StartZLevel")
    protected Boolean startZLevel;
    @XmlElement(name = "Streets")
    protected Boolean streets;
    @XmlElement(name = "TravelRules")
    protected Boolean travelRules;
    @XmlElement(name = "TruckSpeedLimit")
    protected Boolean truckSpeedLimit;
    @XmlElement(name = "WeeklyTravelSpeeds")
    protected Boolean weeklyTravelSpeeds;
    @XmlElement(name = "WorldTimeZone_TimeZone")
    protected Boolean worldTimeZoneTimeZone;

    /**
     * Obtém o valor da propriedade advisoryPostedSpeedLimit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvisoryPostedSpeedLimit() {
        return advisoryPostedSpeedLimit;
    }

    /**
     * Define o valor da propriedade advisoryPostedSpeedLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvisoryPostedSpeedLimit(Boolean value) {
        this.advisoryPostedSpeedLimit = value;
    }

    /**
     * Obtém o valor da propriedade advisoryTruckSpeedLimit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvisoryTruckSpeedLimit() {
        return advisoryTruckSpeedLimit;
    }

    /**
     * Define o valor da propriedade advisoryTruckSpeedLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvisoryTruckSpeedLimit(Boolean value) {
        this.advisoryTruckSpeedLimit = value;
    }

    /**
     * Obtém o valor da propriedade endLeftAddressNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndLeftAddressNumber() {
        return endLeftAddressNumber;
    }

    /**
     * Define o valor da propriedade endLeftAddressNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndLeftAddressNumber(Boolean value) {
        this.endLeftAddressNumber = value;
    }

    /**
     * Obtém o valor da propriedade endRightAddressNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndRightAddressNumber() {
        return endRightAddressNumber;
    }

    /**
     * Define o valor da propriedade endRightAddressNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndRightAddressNumber(Boolean value) {
        this.endRightAddressNumber = value;
    }

    /**
     * Obtém o valor da propriedade endZLevel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndZLevel() {
        return endZLevel;
    }

    /**
     * Define o valor da propriedade endZLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndZLevel(Boolean value) {
        this.endZLevel = value;
    }

    /**
     * Obtém o valor da propriedade instanceID.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstanceID() {
        return instanceID;
    }

    /**
     * Define o valor da propriedade instanceID.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstanceID(Boolean value) {
        this.instanceID = value;
    }

    /**
     * Obtém o valor da propriedade isEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * Define o valor da propriedade isEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabled(Boolean value) {
        this.isEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isFrontageRoad.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFrontageRoad() {
        return isFrontageRoad;
    }

    /**
     * Define o valor da propriedade isFrontageRoad.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFrontageRoad(Boolean value) {
        this.isFrontageRoad = value;
    }

    /**
     * Obtém o valor da propriedade isLoadable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLoadable() {
        return isLoadable;
    }

    /**
     * Define o valor da propriedade isLoadable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLoadable(Boolean value) {
        this.isLoadable = value;
    }

    /**
     * Obtém o valor da propriedade isTollRoad.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTollRoad() {
        return isTollRoad;
    }

    /**
     * Define o valor da propriedade isTollRoad.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTollRoad(Boolean value) {
        this.isTollRoad = value;
    }

    /**
     * Obtém o valor da propriedade leftLocality.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeftLocality() {
        return leftLocality;
    }

    /**
     * Define o valor da propriedade leftLocality.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeftLocality(Boolean value) {
        this.leftLocality = value;
    }

    /**
     * Obtém o valor da propriedade networkArcRenderingCodeRenderingCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetworkArcRenderingCodeRenderingCode() {
        return networkArcRenderingCodeRenderingCode;
    }

    /**
     * Define o valor da propriedade networkArcRenderingCodeRenderingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetworkArcRenderingCodeRenderingCode(Boolean value) {
        this.networkArcRenderingCodeRenderingCode = value;
    }

    /**
     * Obtém o valor da propriedade networkTravelDirectionTravelDirection.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetworkTravelDirectionTravelDirection() {
        return networkTravelDirectionTravelDirection;
    }

    /**
     * Define o valor da propriedade networkTravelDirectionTravelDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetworkTravelDirectionTravelDirection(Boolean value) {
        this.networkTravelDirectionTravelDirection = value;
    }

    /**
     * Obtém o valor da propriedade noThruTraffic.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoThruTraffic() {
        return noThruTraffic;
    }

    /**
     * Define o valor da propriedade noThruTraffic.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoThruTraffic(Boolean value) {
        this.noThruTraffic = value;
    }

    /**
     * Obtém o valor da propriedade nominalSpeed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNominalSpeed() {
        return nominalSpeed;
    }

    /**
     * Define o valor da propriedade nominalSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNominalSpeed(Boolean value) {
        this.nominalSpeed = value;
    }

    /**
     * Obtém o valor da propriedade postedSpeedLimit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostedSpeedLimit() {
        return postedSpeedLimit;
    }

    /**
     * Define o valor da propriedade postedSpeedLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostedSpeedLimit(Boolean value) {
        this.postedSpeedLimit = value;
    }

    /**
     * Obtém o valor da propriedade rightLocality.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRightLocality() {
        return rightLocality;
    }

    /**
     * Define o valor da propriedade rightLocality.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRightLocality(Boolean value) {
        this.rightLocality = value;
    }

    /**
     * Obtém o valor da propriedade shapePoints.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShapePoints() {
        return shapePoints;
    }

    /**
     * Define o valor da propriedade shapePoints.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShapePoints(Boolean value) {
        this.shapePoints = value;
    }

    /**
     * Obtém o valor da propriedade startLeftAddressNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartLeftAddressNumber() {
        return startLeftAddressNumber;
    }

    /**
     * Define o valor da propriedade startLeftAddressNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartLeftAddressNumber(Boolean value) {
        this.startLeftAddressNumber = value;
    }

    /**
     * Obtém o valor da propriedade startRightAddressNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartRightAddressNumber() {
        return startRightAddressNumber;
    }

    /**
     * Define o valor da propriedade startRightAddressNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartRightAddressNumber(Boolean value) {
        this.startRightAddressNumber = value;
    }

    /**
     * Obtém o valor da propriedade startZLevel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartZLevel() {
        return startZLevel;
    }

    /**
     * Define o valor da propriedade startZLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartZLevel(Boolean value) {
        this.startZLevel = value;
    }

    /**
     * Obtém o valor da propriedade streets.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStreets() {
        return streets;
    }

    /**
     * Define o valor da propriedade streets.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStreets(Boolean value) {
        this.streets = value;
    }

    /**
     * Obtém o valor da propriedade travelRules.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTravelRules() {
        return travelRules;
    }

    /**
     * Define o valor da propriedade travelRules.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTravelRules(Boolean value) {
        this.travelRules = value;
    }

    /**
     * Obtém o valor da propriedade truckSpeedLimit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTruckSpeedLimit() {
        return truckSpeedLimit;
    }

    /**
     * Define o valor da propriedade truckSpeedLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTruckSpeedLimit(Boolean value) {
        this.truckSpeedLimit = value;
    }

    /**
     * Obtém o valor da propriedade weeklyTravelSpeeds.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeeklyTravelSpeeds() {
        return weeklyTravelSpeeds;
    }

    /**
     * Define o valor da propriedade weeklyTravelSpeeds.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeeklyTravelSpeeds(Boolean value) {
        this.weeklyTravelSpeeds = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorldTimeZoneTimeZone() {
        return worldTimeZoneTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorldTimeZoneTimeZone(Boolean value) {
        this.worldTimeZoneTimeZone = value;
    }

}
