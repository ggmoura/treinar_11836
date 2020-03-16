
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.Address;
import com.roadnet.apex.datacontracts.Angle;
import com.roadnet.apex.datacontracts.Coordinate;
import com.roadnet.apex.datacontracts.Distance;
import com.roadnet.apex.datacontracts.Length;
import com.roadnet.apex.datacontracts.Weight;


/**
 * <p>Classe Java de NavClientRecalculationAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NavClientRecalculationAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}NavClientAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplyToLocalRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AvoidDirtRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AvoidLocalRoadShortcuts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AvoidTollways" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AvoidUTurns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CalculationDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CalculationTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CommercialVehicle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DestinationAddress" type="{http://roadnet.com/apex/DataContracts/}Address" minOccurs="0"/&gt;
 *         &lt;element name="DestinationCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="DetourDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedTimeOfArrival" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="GrossVehicleWeight" type="{http://roadnet.com/apex/DataContracts/}Weight" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreLegalRestrictions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LeftTurnsExtraTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LeftTurnsPenalty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NavClientRecalculationReason_Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetworkHazmatTypeFlags_HazmatTypeFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="PreferOmnitracsRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreferTruckingRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RemainingDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="RemainingDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RightTurnsExtraTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RightTurnsPenalty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UseHistoricTrafficSpeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseRealTimeTrafficSpeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VehicleHeading" type="{http://roadnet.com/apex/DataContracts/}Angle" minOccurs="0"/&gt;
 *         &lt;element name="VehicleHeight" type="{http://roadnet.com/apex/DataContracts/}Length" minOccurs="0"/&gt;
 *         &lt;element name="VehicleLength" type="{http://roadnet.com/apex/DataContracts/}Length" minOccurs="0"/&gt;
 *         &lt;element name="VehicleWidth" type="{http://roadnet.com/apex/DataContracts/}Length" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavClientRecalculationAction", propOrder = {
    "applyToLocalRoads",
    "avoidDirtRoads",
    "avoidLocalRoadShortcuts",
    "avoidTollways",
    "avoidUTurns",
    "calculationDuration",
    "calculationTimestamp",
    "commercialVehicle",
    "destinationAddress",
    "destinationCoordinate",
    "detourDistance",
    "estimatedTimeOfArrival",
    "grossVehicleWeight",
    "ignoreLegalRestrictions",
    "leftTurnsExtraTime",
    "leftTurnsPenalty",
    "navClientRecalculationReasonReason",
    "networkHazmatTypeFlagsHazmatTypeFlags",
    "originCoordinate",
    "preferOmnitracsRoads",
    "preferTruckingRoads",
    "remainingDistance",
    "remainingDuration",
    "rightTurnsExtraTime",
    "rightTurnsPenalty",
    "useHistoricTrafficSpeeds",
    "useRealTimeTrafficSpeeds",
    "vehicleHeading",
    "vehicleHeight",
    "vehicleLength",
    "vehicleWidth"
})
public class NavClientRecalculationAction
    extends NavClientAction
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
    @XmlElementRef(name = "CalculationDuration", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> calculationDuration;
    @XmlElement(name = "CalculationTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar calculationTimestamp;
    @XmlElement(name = "CommercialVehicle")
    protected Boolean commercialVehicle;
    @XmlElementRef(name = "DestinationAddress", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> destinationAddress;
    @XmlElementRef(name = "DestinationCoordinate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> destinationCoordinate;
    @XmlElementRef(name = "DetourDistance", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> detourDistance;
    @XmlElement(name = "EstimatedTimeOfArrival")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedTimeOfArrival;
    @XmlElementRef(name = "GrossVehicleWeight", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Weight> grossVehicleWeight;
    @XmlElement(name = "IgnoreLegalRestrictions")
    protected Boolean ignoreLegalRestrictions;
    @XmlElementRef(name = "LeftTurnsExtraTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> leftTurnsExtraTime;
    @XmlElementRef(name = "LeftTurnsPenalty", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> leftTurnsPenalty;
    @XmlElementRef(name = "NavClientRecalculationReason_Reason", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> navClientRecalculationReasonReason;
    @XmlElementRef(name = "NetworkHazmatTypeFlags_HazmatTypeFlags", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkHazmatTypeFlagsHazmatTypeFlags;
    @XmlElementRef(name = "OriginCoordinate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> originCoordinate;
    @XmlElement(name = "PreferOmnitracsRoads")
    protected Boolean preferOmnitracsRoads;
    @XmlElement(name = "PreferTruckingRoads")
    protected Boolean preferTruckingRoads;
    @XmlElementRef(name = "RemainingDistance", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> remainingDistance;
    @XmlElementRef(name = "RemainingDuration", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remainingDuration;
    @XmlElementRef(name = "RightTurnsExtraTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rightTurnsExtraTime;
    @XmlElementRef(name = "RightTurnsPenalty", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rightTurnsPenalty;
    @XmlElement(name = "UseHistoricTrafficSpeeds")
    protected Boolean useHistoricTrafficSpeeds;
    @XmlElement(name = "UseRealTimeTrafficSpeeds")
    protected Boolean useRealTimeTrafficSpeeds;
    @XmlElementRef(name = "VehicleHeading", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Angle> vehicleHeading;
    @XmlElementRef(name = "VehicleHeight", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Length> vehicleHeight;
    @XmlElementRef(name = "VehicleLength", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Length> vehicleLength;
    @XmlElementRef(name = "VehicleWidth", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Length> vehicleWidth;

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
     * Obtém o valor da propriedade calculationDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalculationDuration() {
        return calculationDuration;
    }

    /**
     * Define o valor da propriedade calculationDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalculationDuration(JAXBElement<String> value) {
        this.calculationDuration = value;
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
     * Obtém o valor da propriedade commercialVehicle.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommercialVehicle() {
        return commercialVehicle;
    }

    /**
     * Define o valor da propriedade commercialVehicle.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommercialVehicle(Boolean value) {
        this.commercialVehicle = value;
    }

    /**
     * Obtém o valor da propriedade destinationAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * Define o valor da propriedade destinationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setDestinationAddress(JAXBElement<Address> value) {
        this.destinationAddress = value;
    }

    /**
     * Obtém o valor da propriedade destinationCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getDestinationCoordinate() {
        return destinationCoordinate;
    }

    /**
     * Define o valor da propriedade destinationCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setDestinationCoordinate(JAXBElement<Coordinate> value) {
        this.destinationCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade detourDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDetourDistance() {
        return detourDistance;
    }

    /**
     * Define o valor da propriedade detourDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDetourDistance(JAXBElement<Distance> value) {
        this.detourDistance = value;
    }

    /**
     * Obtém o valor da propriedade estimatedTimeOfArrival.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedTimeOfArrival() {
        return estimatedTimeOfArrival;
    }

    /**
     * Define o valor da propriedade estimatedTimeOfArrival.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedTimeOfArrival(XMLGregorianCalendar value) {
        this.estimatedTimeOfArrival = value;
    }

    /**
     * Obtém o valor da propriedade grossVehicleWeight.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Weight }{@code >}
     *     
     */
    public JAXBElement<Weight> getGrossVehicleWeight() {
        return grossVehicleWeight;
    }

    /**
     * Define o valor da propriedade grossVehicleWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Weight }{@code >}
     *     
     */
    public void setGrossVehicleWeight(JAXBElement<Weight> value) {
        this.grossVehicleWeight = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLeftTurnsExtraTime() {
        return leftTurnsExtraTime;
    }

    /**
     * Define o valor da propriedade leftTurnsExtraTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLeftTurnsExtraTime(JAXBElement<String> value) {
        this.leftTurnsExtraTime = value;
    }

    /**
     * Obtém o valor da propriedade leftTurnsPenalty.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLeftTurnsPenalty() {
        return leftTurnsPenalty;
    }

    /**
     * Define o valor da propriedade leftTurnsPenalty.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLeftTurnsPenalty(JAXBElement<String> value) {
        this.leftTurnsPenalty = value;
    }

    /**
     * Obtém o valor da propriedade navClientRecalculationReasonReason.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNavClientRecalculationReasonReason() {
        return navClientRecalculationReasonReason;
    }

    /**
     * Define o valor da propriedade navClientRecalculationReasonReason.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNavClientRecalculationReasonReason(JAXBElement<String> value) {
        this.navClientRecalculationReasonReason = value;
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
     * Obtém o valor da propriedade remainingDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getRemainingDistance() {
        return remainingDistance;
    }

    /**
     * Define o valor da propriedade remainingDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setRemainingDistance(JAXBElement<Distance> value) {
        this.remainingDistance = value;
    }

    /**
     * Obtém o valor da propriedade remainingDuration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemainingDuration() {
        return remainingDuration;
    }

    /**
     * Define o valor da propriedade remainingDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemainingDuration(JAXBElement<String> value) {
        this.remainingDuration = value;
    }

    /**
     * Obtém o valor da propriedade rightTurnsExtraTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRightTurnsExtraTime() {
        return rightTurnsExtraTime;
    }

    /**
     * Define o valor da propriedade rightTurnsExtraTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRightTurnsExtraTime(JAXBElement<String> value) {
        this.rightTurnsExtraTime = value;
    }

    /**
     * Obtém o valor da propriedade rightTurnsPenalty.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRightTurnsPenalty() {
        return rightTurnsPenalty;
    }

    /**
     * Define o valor da propriedade rightTurnsPenalty.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRightTurnsPenalty(JAXBElement<String> value) {
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

    /**
     * Obtém o valor da propriedade vehicleHeight.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public JAXBElement<Length> getVehicleHeight() {
        return vehicleHeight;
    }

    /**
     * Define o valor da propriedade vehicleHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public void setVehicleHeight(JAXBElement<Length> value) {
        this.vehicleHeight = value;
    }

    /**
     * Obtém o valor da propriedade vehicleLength.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public JAXBElement<Length> getVehicleLength() {
        return vehicleLength;
    }

    /**
     * Define o valor da propriedade vehicleLength.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public void setVehicleLength(JAXBElement<Length> value) {
        this.vehicleLength = value;
    }

    /**
     * Obtém o valor da propriedade vehicleWidth.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public JAXBElement<Length> getVehicleWidth() {
        return vehicleWidth;
    }

    /**
     * Define o valor da propriedade vehicleWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public void setVehicleWidth(JAXBElement<Length> value) {
        this.vehicleWidth = value;
    }

}
