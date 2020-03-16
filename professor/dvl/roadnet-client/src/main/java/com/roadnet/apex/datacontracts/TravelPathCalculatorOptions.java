
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de TravelPathCalculatorOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TravelPathCalculatorOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvoidDirtRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AvoidLocalRoadShortcuts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AvoidTollways" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AvoidUTurns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreLegalRestrictions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoadEndpointsToLoadableRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoadEndpointsToNodes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NetworkHazmatTypeFlags_HazmatTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreferOmnitracsRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreferTruckingRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TravelPointPenalty" type="{http://roadnet.com/apex/DataContracts/}TravelPointPenalty" minOccurs="0"/&gt;
 *         &lt;element name="TravelVehicle" type="{http://roadnet.com/apex/DataContracts/}TravelVehicle" minOccurs="0"/&gt;
 *         &lt;element name="UseHistoricTravelSpeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseRealTimeTravelSpeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "TravelPathCalculatorOptions", propOrder = {
    "avoidDirtRoads",
    "avoidLocalRoadShortcuts",
    "avoidTollways",
    "avoidUTurns",
    "departureTime",
    "ignoreLegalRestrictions",
    "loadEndpointsToLoadableRoads",
    "loadEndpointsToNodes",
    "networkHazmatTypeFlagsHazmatTypes",
    "preferOmnitracsRoads",
    "preferTruckingRoads",
    "travelPointPenalty",
    "travelVehicle",
    "useHistoricTravelSpeeds",
    "useRealTimeTravelSpeeds",
    "useVehicleHeading",
    "vehicleHeading"
})
public class TravelPathCalculatorOptions
    extends DataTransferObject
{

    @XmlElement(name = "AvoidDirtRoads")
    protected Boolean avoidDirtRoads;
    @XmlElement(name = "AvoidLocalRoadShortcuts")
    protected Boolean avoidLocalRoadShortcuts;
    @XmlElement(name = "AvoidTollways")
    protected Boolean avoidTollways;
    @XmlElement(name = "AvoidUTurns")
    protected Boolean avoidUTurns;
    @XmlElement(name = "DepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureTime;
    @XmlElement(name = "IgnoreLegalRestrictions")
    protected Boolean ignoreLegalRestrictions;
    @XmlElement(name = "LoadEndpointsToLoadableRoads")
    protected Boolean loadEndpointsToLoadableRoads;
    @XmlElement(name = "LoadEndpointsToNodes")
    protected Boolean loadEndpointsToNodes;
    @XmlElementRef(name = "NetworkHazmatTypeFlags_HazmatTypes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkHazmatTypeFlagsHazmatTypes;
    @XmlElement(name = "PreferOmnitracsRoads")
    protected Boolean preferOmnitracsRoads;
    @XmlElement(name = "PreferTruckingRoads")
    protected Boolean preferTruckingRoads;
    @XmlElementRef(name = "TravelPointPenalty", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TravelPointPenalty> travelPointPenalty;
    @XmlElementRef(name = "TravelVehicle", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TravelVehicle> travelVehicle;
    @XmlElement(name = "UseHistoricTravelSpeeds")
    protected Boolean useHistoricTravelSpeeds;
    @XmlElement(name = "UseRealTimeTravelSpeeds")
    protected Boolean useRealTimeTravelSpeeds;
    @XmlElement(name = "UseVehicleHeading")
    protected Boolean useVehicleHeading;
    @XmlElementRef(name = "VehicleHeading", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Angle> vehicleHeading;

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
     * Obtém o valor da propriedade departureTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * Define o valor da propriedade departureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureTime(XMLGregorianCalendar value) {
        this.departureTime = value;
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
     * Obtém o valor da propriedade loadEndpointsToLoadableRoads.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoadEndpointsToLoadableRoads() {
        return loadEndpointsToLoadableRoads;
    }

    /**
     * Define o valor da propriedade loadEndpointsToLoadableRoads.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoadEndpointsToLoadableRoads(Boolean value) {
        this.loadEndpointsToLoadableRoads = value;
    }

    /**
     * Obtém o valor da propriedade loadEndpointsToNodes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoadEndpointsToNodes() {
        return loadEndpointsToNodes;
    }

    /**
     * Define o valor da propriedade loadEndpointsToNodes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoadEndpointsToNodes(Boolean value) {
        this.loadEndpointsToNodes = value;
    }

    /**
     * Obtém o valor da propriedade networkHazmatTypeFlagsHazmatTypes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkHazmatTypeFlagsHazmatTypes() {
        return networkHazmatTypeFlagsHazmatTypes;
    }

    /**
     * Define o valor da propriedade networkHazmatTypeFlagsHazmatTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkHazmatTypeFlagsHazmatTypes(JAXBElement<String> value) {
        this.networkHazmatTypeFlagsHazmatTypes = value;
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
     * Obtém o valor da propriedade travelPointPenalty.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TravelPointPenalty }{@code >}
     *     
     */
    public JAXBElement<TravelPointPenalty> getTravelPointPenalty() {
        return travelPointPenalty;
    }

    /**
     * Define o valor da propriedade travelPointPenalty.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TravelPointPenalty }{@code >}
     *     
     */
    public void setTravelPointPenalty(JAXBElement<TravelPointPenalty> value) {
        this.travelPointPenalty = value;
    }

    /**
     * Obtém o valor da propriedade travelVehicle.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TravelVehicle }{@code >}
     *     
     */
    public JAXBElement<TravelVehicle> getTravelVehicle() {
        return travelVehicle;
    }

    /**
     * Define o valor da propriedade travelVehicle.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TravelVehicle }{@code >}
     *     
     */
    public void setTravelVehicle(JAXBElement<TravelVehicle> value) {
        this.travelVehicle = value;
    }

    /**
     * Obtém o valor da propriedade useHistoricTravelSpeeds.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseHistoricTravelSpeeds() {
        return useHistoricTravelSpeeds;
    }

    /**
     * Define o valor da propriedade useHistoricTravelSpeeds.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseHistoricTravelSpeeds(Boolean value) {
        this.useHistoricTravelSpeeds = value;
    }

    /**
     * Obtém o valor da propriedade useRealTimeTravelSpeeds.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseRealTimeTravelSpeeds() {
        return useRealTimeTravelSpeeds;
    }

    /**
     * Define o valor da propriedade useRealTimeTravelSpeeds.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseRealTimeTravelSpeeds(Boolean value) {
        this.useRealTimeTravelSpeeds = value;
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
