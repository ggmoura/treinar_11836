
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de StagedStopPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StagedStopPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Coordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasHelper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsPaid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationCreatedInRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedArrival" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDeparture" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDistanceTo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedIndex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PlannedSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StagedOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StagedStopQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeWindowVariance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StagedStopPropertyOptions", propOrder = {
    "coordinate",
    "hasHelper",
    "isPaid",
    "locationCreatedInRegionIdentifier",
    "locationDescription",
    "locationIdentifier",
    "locationType",
    "plannedArrival",
    "plannedCost",
    "plannedDeparture",
    "plannedDistanceTo",
    "plannedIndex",
    "plannedSequenceNumber",
    "stagedOrders",
    "stagedStopQuantities",
    "timeWindowVariance",
    "type"
})
public class StagedStopPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "Coordinate")
    protected Boolean coordinate;
    @XmlElement(name = "HasHelper")
    protected Boolean hasHelper;
    @XmlElement(name = "IsPaid")
    protected Boolean isPaid;
    @XmlElement(name = "LocationCreatedInRegionIdentifier")
    protected Boolean locationCreatedInRegionIdentifier;
    @XmlElement(name = "LocationDescription")
    protected Boolean locationDescription;
    @XmlElement(name = "LocationIdentifier")
    protected Boolean locationIdentifier;
    @XmlElement(name = "LocationType")
    protected Boolean locationType;
    @XmlElement(name = "PlannedArrival")
    protected Boolean plannedArrival;
    @XmlElement(name = "PlannedCost")
    protected Boolean plannedCost;
    @XmlElement(name = "PlannedDeparture")
    protected Boolean plannedDeparture;
    @XmlElement(name = "PlannedDistanceTo")
    protected Boolean plannedDistanceTo;
    @XmlElement(name = "PlannedIndex")
    protected Boolean plannedIndex;
    @XmlElement(name = "PlannedSequenceNumber")
    protected Boolean plannedSequenceNumber;
    @XmlElement(name = "StagedOrders")
    protected Boolean stagedOrders;
    @XmlElement(name = "StagedStopQuantities")
    protected Boolean stagedStopQuantities;
    @XmlElement(name = "TimeWindowVariance")
    protected Boolean timeWindowVariance;
    @XmlElement(name = "Type")
    protected Boolean type;

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
     * Obtém o valor da propriedade hasHelper.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasHelper() {
        return hasHelper;
    }

    /**
     * Define o valor da propriedade hasHelper.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasHelper(Boolean value) {
        this.hasHelper = value;
    }

    /**
     * Obtém o valor da propriedade isPaid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPaid() {
        return isPaid;
    }

    /**
     * Define o valor da propriedade isPaid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPaid(Boolean value) {
        this.isPaid = value;
    }

    /**
     * Obtém o valor da propriedade locationCreatedInRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationCreatedInRegionIdentifier() {
        return locationCreatedInRegionIdentifier;
    }

    /**
     * Define o valor da propriedade locationCreatedInRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationCreatedInRegionIdentifier(Boolean value) {
        this.locationCreatedInRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade locationDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationDescription() {
        return locationDescription;
    }

    /**
     * Define o valor da propriedade locationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationDescription(Boolean value) {
        this.locationDescription = value;
    }

    /**
     * Obtém o valor da propriedade locationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationIdentifier() {
        return locationIdentifier;
    }

    /**
     * Define o valor da propriedade locationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationIdentifier(Boolean value) {
        this.locationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade locationType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationType() {
        return locationType;
    }

    /**
     * Define o valor da propriedade locationType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationType(Boolean value) {
        this.locationType = value;
    }

    /**
     * Obtém o valor da propriedade plannedArrival.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedArrival() {
        return plannedArrival;
    }

    /**
     * Define o valor da propriedade plannedArrival.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedArrival(Boolean value) {
        this.plannedArrival = value;
    }

    /**
     * Obtém o valor da propriedade plannedCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedCost() {
        return plannedCost;
    }

    /**
     * Define o valor da propriedade plannedCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedCost(Boolean value) {
        this.plannedCost = value;
    }

    /**
     * Obtém o valor da propriedade plannedDeparture.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedDeparture() {
        return plannedDeparture;
    }

    /**
     * Define o valor da propriedade plannedDeparture.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedDeparture(Boolean value) {
        this.plannedDeparture = value;
    }

    /**
     * Obtém o valor da propriedade plannedDistanceTo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedDistanceTo() {
        return plannedDistanceTo;
    }

    /**
     * Define o valor da propriedade plannedDistanceTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedDistanceTo(Boolean value) {
        this.plannedDistanceTo = value;
    }

    /**
     * Obtém o valor da propriedade plannedIndex.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedIndex() {
        return plannedIndex;
    }

    /**
     * Define o valor da propriedade plannedIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedIndex(Boolean value) {
        this.plannedIndex = value;
    }

    /**
     * Obtém o valor da propriedade plannedSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedSequenceNumber() {
        return plannedSequenceNumber;
    }

    /**
     * Define o valor da propriedade plannedSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedSequenceNumber(Boolean value) {
        this.plannedSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade stagedOrders.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStagedOrders() {
        return stagedOrders;
    }

    /**
     * Define o valor da propriedade stagedOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStagedOrders(Boolean value) {
        this.stagedOrders = value;
    }

    /**
     * Obtém o valor da propriedade stagedStopQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStagedStopQuantities() {
        return stagedStopQuantities;
    }

    /**
     * Define o valor da propriedade stagedStopQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStagedStopQuantities(Boolean value) {
        this.stagedStopQuantities = value;
    }

    /**
     * Obtém o valor da propriedade timeWindowVariance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeWindowVariance() {
        return timeWindowVariance;
    }

    /**
     * Define o valor da propriedade timeWindowVariance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeWindowVariance(Boolean value) {
        this.timeWindowVariance = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setType(Boolean value) {
        this.type = value;
    }

}
