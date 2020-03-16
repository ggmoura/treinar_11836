
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.Coordinate;
import com.roadnet.apex.datacontracts.Distance;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de DataWarehouseStagedStop complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseStagedStop"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Coordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseStagedStopType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HasHelper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsPaid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationCreatedInRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationCreatedInRegionPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlannedArrival" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDeparture" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDistanceTo" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="PlannedIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlannedSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlannedTimeWindowVariance" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCategoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCategoryIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StagedOrders" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse}ArrayOfDataWarehouseStagedOrder" minOccurs="0"/&gt;
 *         &lt;element name="StagedStopQuantities" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse}ArrayOfDataWarehouseStagedStopQuantity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseStagedStop", propOrder = {
    "accountDescription",
    "accountIdentifier",
    "coordinate",
    "dataWarehouseStagedStopTypeType",
    "hasHelper",
    "isPaid",
    "locationCreatedInRegionIdentifier",
    "locationCreatedInRegionPkey",
    "locationDescription",
    "locationIdentifier",
    "locationType",
    "plannedArrival",
    "plannedCost",
    "plannedDeparture",
    "plannedDistanceTo",
    "plannedIndex",
    "plannedSequenceNumber",
    "plannedTimeWindowVariance",
    "serviceLocationCategoryDescription",
    "serviceLocationCategoryIdentifier",
    "stagedOrders",
    "stagedStopQuantities"
})
@XmlSeeAlso({
    DataWarehouseActualStagedStop.class,
    DataWarehousePlannedStagedStop.class
})
public class DataWarehouseStagedStop
    extends DomainEntity
{

    @XmlElementRef(name = "AccountDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountDescription;
    @XmlElementRef(name = "AccountIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountIdentifier;
    @XmlElementRef(name = "Coordinate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinate;
    @XmlElementRef(name = "DataWarehouseStagedStopType_Type", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseStagedStopTypeType;
    @XmlElement(name = "HasHelper")
    protected Boolean hasHelper;
    @XmlElement(name = "IsPaid")
    protected Boolean isPaid;
    @XmlElementRef(name = "LocationCreatedInRegionIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationCreatedInRegionIdentifier;
    @XmlElementRef(name = "LocationCreatedInRegionPkey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> locationCreatedInRegionPkey;
    @XmlElementRef(name = "LocationDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationDescription;
    @XmlElementRef(name = "LocationIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationIdentifier;
    @XmlElementRef(name = "LocationType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationType;
    @XmlElementRef(name = "PlannedArrival", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedArrival;
    @XmlElement(name = "PlannedCost")
    protected Double plannedCost;
    @XmlElementRef(name = "PlannedDeparture", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedDeparture;
    @XmlElementRef(name = "PlannedDistanceTo", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> plannedDistanceTo;
    @XmlElementRef(name = "PlannedIndex", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> plannedIndex;
    @XmlElementRef(name = "PlannedSequenceNumber", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> plannedSequenceNumber;
    @XmlElement(name = "PlannedTimeWindowVariance")
    protected Duration plannedTimeWindowVariance;
    @XmlElementRef(name = "ServiceLocationCategoryDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationCategoryDescription;
    @XmlElementRef(name = "ServiceLocationCategoryIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationCategoryIdentifier;
    @XmlElementRef(name = "StagedOrders", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDataWarehouseStagedOrder> stagedOrders;
    @XmlElementRef(name = "StagedStopQuantities", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDataWarehouseStagedStopQuantity> stagedStopQuantities;

    /**
     * Obtém o valor da propriedade accountDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountDescription() {
        return accountDescription;
    }

    /**
     * Define o valor da propriedade accountDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountDescription(JAXBElement<String> value) {
        this.accountDescription = value;
    }

    /**
     * Obtém o valor da propriedade accountIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountIdentifier() {
        return accountIdentifier;
    }

    /**
     * Define o valor da propriedade accountIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountIdentifier(JAXBElement<String> value) {
        this.accountIdentifier = value;
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
     * Obtém o valor da propriedade dataWarehouseStagedStopTypeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseStagedStopTypeType() {
        return dataWarehouseStagedStopTypeType;
    }

    /**
     * Define o valor da propriedade dataWarehouseStagedStopTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseStagedStopTypeType(JAXBElement<String> value) {
        this.dataWarehouseStagedStopTypeType = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationCreatedInRegionIdentifier() {
        return locationCreatedInRegionIdentifier;
    }

    /**
     * Define o valor da propriedade locationCreatedInRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationCreatedInRegionIdentifier(JAXBElement<String> value) {
        this.locationCreatedInRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade locationCreatedInRegionPkey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLocationCreatedInRegionPkey() {
        return locationCreatedInRegionPkey;
    }

    /**
     * Define o valor da propriedade locationCreatedInRegionPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLocationCreatedInRegionPkey(JAXBElement<Long> value) {
        this.locationCreatedInRegionPkey = value;
    }

    /**
     * Obtém o valor da propriedade locationDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationDescription() {
        return locationDescription;
    }

    /**
     * Define o valor da propriedade locationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationDescription(JAXBElement<String> value) {
        this.locationDescription = value;
    }

    /**
     * Obtém o valor da propriedade locationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationIdentifier() {
        return locationIdentifier;
    }

    /**
     * Define o valor da propriedade locationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationIdentifier(JAXBElement<String> value) {
        this.locationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade locationType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationType() {
        return locationType;
    }

    /**
     * Define o valor da propriedade locationType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationType(JAXBElement<String> value) {
        this.locationType = value;
    }

    /**
     * Obtém o valor da propriedade plannedArrival.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedArrival() {
        return plannedArrival;
    }

    /**
     * Define o valor da propriedade plannedArrival.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedArrival(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedArrival = value;
    }

    /**
     * Obtém o valor da propriedade plannedCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPlannedCost() {
        return plannedCost;
    }

    /**
     * Define o valor da propriedade plannedCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPlannedCost(Double value) {
        this.plannedCost = value;
    }

    /**
     * Obtém o valor da propriedade plannedDeparture.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedDeparture() {
        return plannedDeparture;
    }

    /**
     * Define o valor da propriedade plannedDeparture.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedDeparture(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedDeparture = value;
    }

    /**
     * Obtém o valor da propriedade plannedDistanceTo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getPlannedDistanceTo() {
        return plannedDistanceTo;
    }

    /**
     * Define o valor da propriedade plannedDistanceTo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setPlannedDistanceTo(JAXBElement<Distance> value) {
        this.plannedDistanceTo = value;
    }

    /**
     * Obtém o valor da propriedade plannedIndex.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPlannedIndex() {
        return plannedIndex;
    }

    /**
     * Define o valor da propriedade plannedIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPlannedIndex(JAXBElement<Integer> value) {
        this.plannedIndex = value;
    }

    /**
     * Obtém o valor da propriedade plannedSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPlannedSequenceNumber() {
        return plannedSequenceNumber;
    }

    /**
     * Define o valor da propriedade plannedSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPlannedSequenceNumber(JAXBElement<Integer> value) {
        this.plannedSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade plannedTimeWindowVariance.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPlannedTimeWindowVariance() {
        return plannedTimeWindowVariance;
    }

    /**
     * Define o valor da propriedade plannedTimeWindowVariance.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPlannedTimeWindowVariance(Duration value) {
        this.plannedTimeWindowVariance = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCategoryDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationCategoryDescription() {
        return serviceLocationCategoryDescription;
    }

    /**
     * Define o valor da propriedade serviceLocationCategoryDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationCategoryDescription(JAXBElement<String> value) {
        this.serviceLocationCategoryDescription = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCategoryIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationCategoryIdentifier() {
        return serviceLocationCategoryIdentifier;
    }

    /**
     * Define o valor da propriedade serviceLocationCategoryIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationCategoryIdentifier(JAXBElement<String> value) {
        this.serviceLocationCategoryIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade stagedOrders.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedOrder }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDataWarehouseStagedOrder> getStagedOrders() {
        return stagedOrders;
    }

    /**
     * Define o valor da propriedade stagedOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedOrder }{@code >}
     *     
     */
    public void setStagedOrders(JAXBElement<ArrayOfDataWarehouseStagedOrder> value) {
        this.stagedOrders = value;
    }

    /**
     * Obtém o valor da propriedade stagedStopQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedStopQuantity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDataWarehouseStagedStopQuantity> getStagedStopQuantities() {
        return stagedStopQuantities;
    }

    /**
     * Define o valor da propriedade stagedStopQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseStagedStopQuantity }{@code >}
     *     
     */
    public void setStagedStopQuantities(JAXBElement<ArrayOfDataWarehouseStagedStopQuantity> value) {
        this.stagedStopQuantities = value;
    }

}
