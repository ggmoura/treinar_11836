
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NetworkArc complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkArc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}INetworkSpatial"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdvisoryPostedSpeedLimit" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="AdvisoryTruckSpeedLimit" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="EndLeftAddressNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndRightAddressNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndZLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InstanceID" type="{http://roadnet.com/apex/DataContracts/}NetworkInstanceID" minOccurs="0"/&gt;
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsFrontageRoad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsLoadable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTollRoad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LeftLocality" type="{http://roadnet.com/apex/DataContracts/}Locality" minOccurs="0"/&gt;
 *         &lt;element name="NetworkArcRenderingCode_RenderingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetworkTravelDirection_TravelDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoThruTraffic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NominalSpeed" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="PostedSpeedLimit" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="RenderingCodeSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RightLocality" type="{http://roadnet.com/apex/DataContracts/}Locality" minOccurs="0"/&gt;
 *         &lt;element name="SchemaVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ShapePoints" type="{http://roadnet.com/apex/DataContracts/}PointPath" minOccurs="0"/&gt;
 *         &lt;element name="StartLeftAddressNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartRightAddressNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartZLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Streets" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNetworkStreet" minOccurs="0"/&gt;
 *         &lt;element name="TimeZoneSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TravelDirectionSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TravelRules" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNetworkTravelRule" minOccurs="0"/&gt;
 *         &lt;element name="TruckSpeedLimit" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="WeeklyTravelSpeeds" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNetworkArcWeeklyTravelSpeed" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkArc", propOrder = {
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
    "renderingCodeSpecified",
    "rightLocality",
    "schemaVersion",
    "shapePoints",
    "startLeftAddressNumber",
    "startRightAddressNumber",
    "startZLevel",
    "streets",
    "timeZoneSpecified",
    "travelDirectionSpecified",
    "travelRules",
    "truckSpeedLimit",
    "weeklyTravelSpeeds",
    "worldTimeZoneTimeZone"
})
public class NetworkArc
    extends INetworkSpatial
{

    @XmlElementRef(name = "AdvisoryPostedSpeedLimit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> advisoryPostedSpeedLimit;
    @XmlElementRef(name = "AdvisoryTruckSpeedLimit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> advisoryTruckSpeedLimit;
    @XmlElementRef(name = "EndLeftAddressNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endLeftAddressNumber;
    @XmlElementRef(name = "EndRightAddressNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endRightAddressNumber;
    @XmlElementRef(name = "EndZLevel", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> endZLevel;
    @XmlElementRef(name = "InstanceID", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkInstanceID> instanceID;
    @XmlElementRef(name = "IsEnabled", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isEnabled;
    @XmlElementRef(name = "IsFrontageRoad", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isFrontageRoad;
    @XmlElementRef(name = "IsLoadable", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isLoadable;
    @XmlElementRef(name = "IsTollRoad", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isTollRoad;
    @XmlElementRef(name = "LeftLocality", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Locality> leftLocality;
    @XmlElementRef(name = "NetworkArcRenderingCode_RenderingCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkArcRenderingCodeRenderingCode;
    @XmlElementRef(name = "NetworkTravelDirection_TravelDirection", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkTravelDirectionTravelDirection;
    @XmlElementRef(name = "NoThruTraffic", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> noThruTraffic;
    @XmlElementRef(name = "NominalSpeed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> nominalSpeed;
    @XmlElementRef(name = "PostedSpeedLimit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> postedSpeedLimit;
    @XmlElement(name = "RenderingCodeSpecified")
    protected Boolean renderingCodeSpecified;
    @XmlElementRef(name = "RightLocality", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Locality> rightLocality;
    @XmlElement(name = "SchemaVersion")
    protected Integer schemaVersion;
    @XmlElementRef(name = "ShapePoints", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPath> shapePoints;
    @XmlElementRef(name = "StartLeftAddressNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startLeftAddressNumber;
    @XmlElementRef(name = "StartRightAddressNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startRightAddressNumber;
    @XmlElementRef(name = "StartZLevel", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> startZLevel;
    @XmlElementRef(name = "Streets", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkStreet> streets;
    @XmlElement(name = "TimeZoneSpecified")
    protected Boolean timeZoneSpecified;
    @XmlElement(name = "TravelDirectionSpecified")
    protected Boolean travelDirectionSpecified;
    @XmlElementRef(name = "TravelRules", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkTravelRule> travelRules;
    @XmlElementRef(name = "TruckSpeedLimit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> truckSpeedLimit;
    @XmlElementRef(name = "WeeklyTravelSpeeds", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkArcWeeklyTravelSpeed> weeklyTravelSpeeds;
    @XmlElementRef(name = "WorldTimeZone_TimeZone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worldTimeZoneTimeZone;

    /**
     * Obtém o valor da propriedade advisoryPostedSpeedLimit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getAdvisoryPostedSpeedLimit() {
        return advisoryPostedSpeedLimit;
    }

    /**
     * Define o valor da propriedade advisoryPostedSpeedLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setAdvisoryPostedSpeedLimit(JAXBElement<Speed> value) {
        this.advisoryPostedSpeedLimit = value;
    }

    /**
     * Obtém o valor da propriedade advisoryTruckSpeedLimit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getAdvisoryTruckSpeedLimit() {
        return advisoryTruckSpeedLimit;
    }

    /**
     * Define o valor da propriedade advisoryTruckSpeedLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setAdvisoryTruckSpeedLimit(JAXBElement<Speed> value) {
        this.advisoryTruckSpeedLimit = value;
    }

    /**
     * Obtém o valor da propriedade endLeftAddressNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndLeftAddressNumber() {
        return endLeftAddressNumber;
    }

    /**
     * Define o valor da propriedade endLeftAddressNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndLeftAddressNumber(JAXBElement<String> value) {
        this.endLeftAddressNumber = value;
    }

    /**
     * Obtém o valor da propriedade endRightAddressNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndRightAddressNumber() {
        return endRightAddressNumber;
    }

    /**
     * Define o valor da propriedade endRightAddressNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndRightAddressNumber(JAXBElement<String> value) {
        this.endRightAddressNumber = value;
    }

    /**
     * Obtém o valor da propriedade endZLevel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEndZLevel() {
        return endZLevel;
    }

    /**
     * Define o valor da propriedade endZLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEndZLevel(JAXBElement<Integer> value) {
        this.endZLevel = value;
    }

    /**
     * Obtém o valor da propriedade instanceID.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkInstanceID }{@code >}
     *     
     */
    public JAXBElement<NetworkInstanceID> getInstanceID() {
        return instanceID;
    }

    /**
     * Define o valor da propriedade instanceID.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkInstanceID }{@code >}
     *     
     */
    public void setInstanceID(JAXBElement<NetworkInstanceID> value) {
        this.instanceID = value;
    }

    /**
     * Obtém o valor da propriedade isEnabled.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsEnabled() {
        return isEnabled;
    }

    /**
     * Define o valor da propriedade isEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsEnabled(JAXBElement<Boolean> value) {
        this.isEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isFrontageRoad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsFrontageRoad() {
        return isFrontageRoad;
    }

    /**
     * Define o valor da propriedade isFrontageRoad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsFrontageRoad(JAXBElement<Boolean> value) {
        this.isFrontageRoad = value;
    }

    /**
     * Obtém o valor da propriedade isLoadable.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsLoadable() {
        return isLoadable;
    }

    /**
     * Define o valor da propriedade isLoadable.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsLoadable(JAXBElement<Boolean> value) {
        this.isLoadable = value;
    }

    /**
     * Obtém o valor da propriedade isTollRoad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsTollRoad() {
        return isTollRoad;
    }

    /**
     * Define o valor da propriedade isTollRoad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsTollRoad(JAXBElement<Boolean> value) {
        this.isTollRoad = value;
    }

    /**
     * Obtém o valor da propriedade leftLocality.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Locality }{@code >}
     *     
     */
    public JAXBElement<Locality> getLeftLocality() {
        return leftLocality;
    }

    /**
     * Define o valor da propriedade leftLocality.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Locality }{@code >}
     *     
     */
    public void setLeftLocality(JAXBElement<Locality> value) {
        this.leftLocality = value;
    }

    /**
     * Obtém o valor da propriedade networkArcRenderingCodeRenderingCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkArcRenderingCodeRenderingCode() {
        return networkArcRenderingCodeRenderingCode;
    }

    /**
     * Define o valor da propriedade networkArcRenderingCodeRenderingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkArcRenderingCodeRenderingCode(JAXBElement<String> value) {
        this.networkArcRenderingCodeRenderingCode = value;
    }

    /**
     * Obtém o valor da propriedade networkTravelDirectionTravelDirection.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkTravelDirectionTravelDirection() {
        return networkTravelDirectionTravelDirection;
    }

    /**
     * Define o valor da propriedade networkTravelDirectionTravelDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkTravelDirectionTravelDirection(JAXBElement<String> value) {
        this.networkTravelDirectionTravelDirection = value;
    }

    /**
     * Obtém o valor da propriedade noThruTraffic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNoThruTraffic() {
        return noThruTraffic;
    }

    /**
     * Define o valor da propriedade noThruTraffic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNoThruTraffic(JAXBElement<Boolean> value) {
        this.noThruTraffic = value;
    }

    /**
     * Obtém o valor da propriedade nominalSpeed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getNominalSpeed() {
        return nominalSpeed;
    }

    /**
     * Define o valor da propriedade nominalSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setNominalSpeed(JAXBElement<Speed> value) {
        this.nominalSpeed = value;
    }

    /**
     * Obtém o valor da propriedade postedSpeedLimit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getPostedSpeedLimit() {
        return postedSpeedLimit;
    }

    /**
     * Define o valor da propriedade postedSpeedLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setPostedSpeedLimit(JAXBElement<Speed> value) {
        this.postedSpeedLimit = value;
    }

    /**
     * Obtém o valor da propriedade renderingCodeSpecified.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRenderingCodeSpecified() {
        return renderingCodeSpecified;
    }

    /**
     * Define o valor da propriedade renderingCodeSpecified.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRenderingCodeSpecified(Boolean value) {
        this.renderingCodeSpecified = value;
    }

    /**
     * Obtém o valor da propriedade rightLocality.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Locality }{@code >}
     *     
     */
    public JAXBElement<Locality> getRightLocality() {
        return rightLocality;
    }

    /**
     * Define o valor da propriedade rightLocality.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Locality }{@code >}
     *     
     */
    public void setRightLocality(JAXBElement<Locality> value) {
        this.rightLocality = value;
    }

    /**
     * Obtém o valor da propriedade schemaVersion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Define o valor da propriedade schemaVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSchemaVersion(Integer value) {
        this.schemaVersion = value;
    }

    /**
     * Obtém o valor da propriedade shapePoints.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPath }{@code >}
     *     
     */
    public JAXBElement<PointPath> getShapePoints() {
        return shapePoints;
    }

    /**
     * Define o valor da propriedade shapePoints.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPath }{@code >}
     *     
     */
    public void setShapePoints(JAXBElement<PointPath> value) {
        this.shapePoints = value;
    }

    /**
     * Obtém o valor da propriedade startLeftAddressNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartLeftAddressNumber() {
        return startLeftAddressNumber;
    }

    /**
     * Define o valor da propriedade startLeftAddressNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartLeftAddressNumber(JAXBElement<String> value) {
        this.startLeftAddressNumber = value;
    }

    /**
     * Obtém o valor da propriedade startRightAddressNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartRightAddressNumber() {
        return startRightAddressNumber;
    }

    /**
     * Define o valor da propriedade startRightAddressNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartRightAddressNumber(JAXBElement<String> value) {
        this.startRightAddressNumber = value;
    }

    /**
     * Obtém o valor da propriedade startZLevel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStartZLevel() {
        return startZLevel;
    }

    /**
     * Define o valor da propriedade startZLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStartZLevel(JAXBElement<Integer> value) {
        this.startZLevel = value;
    }

    /**
     * Obtém o valor da propriedade streets.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkStreet }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkStreet> getStreets() {
        return streets;
    }

    /**
     * Define o valor da propriedade streets.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkStreet }{@code >}
     *     
     */
    public void setStreets(JAXBElement<ArrayOfNetworkStreet> value) {
        this.streets = value;
    }

    /**
     * Obtém o valor da propriedade timeZoneSpecified.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeZoneSpecified() {
        return timeZoneSpecified;
    }

    /**
     * Define o valor da propriedade timeZoneSpecified.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeZoneSpecified(Boolean value) {
        this.timeZoneSpecified = value;
    }

    /**
     * Obtém o valor da propriedade travelDirectionSpecified.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTravelDirectionSpecified() {
        return travelDirectionSpecified;
    }

    /**
     * Define o valor da propriedade travelDirectionSpecified.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTravelDirectionSpecified(Boolean value) {
        this.travelDirectionSpecified = value;
    }

    /**
     * Obtém o valor da propriedade travelRules.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkTravelRule }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkTravelRule> getTravelRules() {
        return travelRules;
    }

    /**
     * Define o valor da propriedade travelRules.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkTravelRule }{@code >}
     *     
     */
    public void setTravelRules(JAXBElement<ArrayOfNetworkTravelRule> value) {
        this.travelRules = value;
    }

    /**
     * Obtém o valor da propriedade truckSpeedLimit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getTruckSpeedLimit() {
        return truckSpeedLimit;
    }

    /**
     * Define o valor da propriedade truckSpeedLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setTruckSpeedLimit(JAXBElement<Speed> value) {
        this.truckSpeedLimit = value;
    }

    /**
     * Obtém o valor da propriedade weeklyTravelSpeeds.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkArcWeeklyTravelSpeed }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkArcWeeklyTravelSpeed> getWeeklyTravelSpeeds() {
        return weeklyTravelSpeeds;
    }

    /**
     * Define o valor da propriedade weeklyTravelSpeeds.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkArcWeeklyTravelSpeed }{@code >}
     *     
     */
    public void setWeeklyTravelSpeeds(JAXBElement<ArrayOfNetworkArcWeeklyTravelSpeed> value) {
        this.weeklyTravelSpeeds = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorldTimeZoneTimeZone() {
        return worldTimeZoneTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorldTimeZoneTimeZone(JAXBElement<String> value) {
        this.worldTimeZoneTimeZone = value;
    }

}
