
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
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de NavRecalculationCalculatorOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NavRecalculationCalculatorOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplyToLocalRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AvoidDirtRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AvoidLocalRoadShortcuts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AvoidTollways" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AvoidUTurns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CalculationTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreLegalRestrictions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LeftTurnsExtraTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="LeftTurnsPenalty" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="NetworkHazmatTypeFlags_HazmatTypeFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="PreferOmnitracsRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreferTruckingRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RightTurnsExtraTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="RightTurnsPenalty" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="UseHistoricTrafficSpeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseRealTimeTrafficSpeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseVehicleHeading" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VehicleHeading" type="{http://roadnet.com/apex/DataContracts/}Angle" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavRecalculationCalculatorOptions", propOrder = {
    "applyToLocalRoads",
    "avoidDirtRoads",
    "avoidLocalRoadShortcuts",
    "avoidTollways",
    "avoidUTurns",
    "calculationTimestamp",
    "ignoreLegalRestrictions",
    "leftTurnsExtraTime",
    "leftTurnsPenalty",
    "networkHazmatTypeFlagsHazmatTypeFlags",
    "originCoordinate",
    "preferOmnitracsRoads",
    "preferTruckingRoads",
    "rightTurnsExtraTime",
    "rightTurnsPenalty",
    "useHistoricTrafficSpeeds",
    "useRealTimeTrafficSpeeds",
    "useVehicleHeading",
    "vehicleHeading"
})
public class NavRecalculationCalculatorOptions
    extends DataTransferObject
{

    @XmlElement(name = "ApplyToLocalRoads")
    protected Boolean applyToLocalRoads;
    @XmlElement(name = "AvoidDirtRoads")
    protected Boolean avoidDirtRoads;
    @XmlElement(name = "AvoidLocalRoadShortcuts")
    protected Boolean avoidLocalRoadShortcuts;
    @XmlElement(name = "AvoidTollways")
    protected Boolean avoidTollways;
    @XmlElement(name = "AvoidUTurns")
    protected Boolean avoidUTurns;
    @XmlElement(name = "CalculationTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar calculationTimestamp;
    @XmlElement(name = "IgnoreLegalRestrictions")
    protected Boolean ignoreLegalRestrictions;
    @XmlElementRef(name = "LeftTurnsExtraTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> leftTurnsExtraTime;
    @XmlElementRef(name = "LeftTurnsPenalty", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> leftTurnsPenalty;
    @XmlElementRef(name = "NetworkHazmatTypeFlags_HazmatTypeFlags", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkHazmatTypeFlagsHazmatTypeFlags;
    @XmlElementRef(name = "OriginCoordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> originCoordinate;
    @XmlElement(name = "PreferOmnitracsRoads")
    protected Boolean preferOmnitracsRoads;
    @XmlElement(name = "PreferTruckingRoads")
    protected Boolean preferTruckingRoads;
    @XmlElementRef(name = "RightTurnsExtraTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> rightTurnsExtraTime;
    @XmlElementRef(name = "RightTurnsPenalty", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> rightTurnsPenalty;
    @XmlElement(name = "UseHistoricTrafficSpeeds")
    protected Boolean useHistoricTrafficSpeeds;
    @XmlElement(name = "UseRealTimeTrafficSpeeds")
    protected Boolean useRealTimeTrafficSpeeds;
    @XmlElement(name = "UseVehicleHeading")
    protected Boolean useVehicleHeading;
    @XmlElementRef(name = "VehicleHeading", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Angle> vehicleHeading;

    /**
     * Obtém o valor da propriedade applyToLocalRoads.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyToLocalRoads() {
        return applyToLocalRoads;
    }

    /**
     * Define o valor da propriedade applyToLocalRoads.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyToLocalRoads(Boolean value) {
        this.applyToLocalRoads = value;
    }

    /**
     * Obtém o valor da propriedade avoidDirtRoads.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvoidDirtRoads() {
        return avoidDirtRoads;
    }

    /**
     * Define o valor da propriedade avoidDirtRoads.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvoidDirtRoads(Boolean value) {
        this.avoidDirtRoads = value;
    }

    /**
     * Obtém o valor da propriedade avoidLocalRoadShortcuts.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvoidLocalRoadShortcuts() {
        return avoidLocalRoadShortcuts;
    }

    /**
     * Define o valor da propriedade avoidLocalRoadShortcuts.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvoidLocalRoadShortcuts(Boolean value) {
        this.avoidLocalRoadShortcuts = value;
    }

    /**
     * Obtém o valor da propriedade avoidTollways.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvoidTollways() {
        return avoidTollways;
    }

    /**
     * Define o valor da propriedade avoidTollways.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvoidTollways(Boolean value) {
        this.avoidTollways = value;
    }

    /**
     * Obtém o valor da propriedade avoidUTurns.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvoidUTurns() {
        return avoidUTurns;
    }

    /**
     * Define o valor da propriedade avoidUTurns.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvoidUTurns(Boolean value) {
        this.avoidUTurns = value;
    }

    /**
     * Obtém o valor da propriedade calculationTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalculationTimestamp() {
        return calculationTimestamp;
    }

    /**
     * Define o valor da propriedade calculationTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalculationTimestamp(XMLGregorianCalendar value) {
        this.calculationTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade ignoreLegalRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreLegalRestrictions() {
        return ignoreLegalRestrictions;
    }

    /**
     * Define o valor da propriedade ignoreLegalRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreLegalRestrictions(Boolean value) {
        this.ignoreLegalRestrictions = value;
    }

    /**
     * Obtém o valor da propriedade leftTurnsExtraTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getLeftTurnsExtraTime() {
        return leftTurnsExtraTime;
    }

    /**
     * Define o valor da propriedade leftTurnsExtraTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setLeftTurnsExtraTime(JAXBElement<Duration> value) {
        this.leftTurnsExtraTime = value;
    }

    /**
     * Obtém o valor da propriedade leftTurnsPenalty.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getLeftTurnsPenalty() {
        return leftTurnsPenalty;
    }

    /**
     * Define o valor da propriedade leftTurnsPenalty.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setLeftTurnsPenalty(JAXBElement<Duration> value) {
        this.leftTurnsPenalty = value;
    }

    /**
     * Obtém o valor da propriedade networkHazmatTypeFlagsHazmatTypeFlags.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkHazmatTypeFlagsHazmatTypeFlags() {
        return networkHazmatTypeFlagsHazmatTypeFlags;
    }

    /**
     * Define o valor da propriedade networkHazmatTypeFlagsHazmatTypeFlags.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkHazmatTypeFlagsHazmatTypeFlags(JAXBElement<String> value) {
        this.networkHazmatTypeFlagsHazmatTypeFlags = value;
    }

    /**
     * Obtém o valor da propriedade originCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getOriginCoordinate() {
        return originCoordinate;
    }

    /**
     * Define o valor da propriedade originCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setOriginCoordinate(JAXBElement<Coordinate> value) {
        this.originCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade preferOmnitracsRoads.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferOmnitracsRoads() {
        return preferOmnitracsRoads;
    }

    /**
     * Define o valor da propriedade preferOmnitracsRoads.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferOmnitracsRoads(Boolean value) {
        this.preferOmnitracsRoads = value;
    }

    /**
     * Obtém o valor da propriedade preferTruckingRoads.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferTruckingRoads() {
        return preferTruckingRoads;
    }

    /**
     * Define o valor da propriedade preferTruckingRoads.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferTruckingRoads(Boolean value) {
        this.preferTruckingRoads = value;
    }

    /**
     * Obtém o valor da propriedade rightTurnsExtraTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getRightTurnsExtraTime() {
        return rightTurnsExtraTime;
    }

    /**
     * Define o valor da propriedade rightTurnsExtraTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setRightTurnsExtraTime(JAXBElement<Duration> value) {
        this.rightTurnsExtraTime = value;
    }

    /**
     * Obtém o valor da propriedade rightTurnsPenalty.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getRightTurnsPenalty() {
        return rightTurnsPenalty;
    }

    /**
     * Define o valor da propriedade rightTurnsPenalty.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setRightTurnsPenalty(JAXBElement<Duration> value) {
        this.rightTurnsPenalty = value;
    }

    /**
     * Obtém o valor da propriedade useHistoricTrafficSpeeds.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseHistoricTrafficSpeeds() {
        return useHistoricTrafficSpeeds;
    }

    /**
     * Define o valor da propriedade useHistoricTrafficSpeeds.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseHistoricTrafficSpeeds(Boolean value) {
        this.useHistoricTrafficSpeeds = value;
    }

    /**
     * Obtém o valor da propriedade useRealTimeTrafficSpeeds.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseRealTimeTrafficSpeeds() {
        return useRealTimeTrafficSpeeds;
    }

    /**
     * Define o valor da propriedade useRealTimeTrafficSpeeds.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseRealTimeTrafficSpeeds(Boolean value) {
        this.useRealTimeTrafficSpeeds = value;
    }

    /**
     * Obtém o valor da propriedade useVehicleHeading.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseVehicleHeading() {
        return useVehicleHeading;
    }

    /**
     * Define o valor da propriedade useVehicleHeading.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseVehicleHeading(Boolean value) {
        this.useVehicleHeading = value;
    }

    /**
     * Obtém o valor da propriedade vehicleHeading.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Angle }{@code >}
     *     
     */
    public JAXBElement<Angle> getVehicleHeading() {
        return vehicleHeading;
    }

    /**
     * Define o valor da propriedade vehicleHeading.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Angle }{@code >}
     *     
     */
    public void setVehicleHeading(JAXBElement<Angle> value) {
        this.vehicleHeading = value;
    }

}
