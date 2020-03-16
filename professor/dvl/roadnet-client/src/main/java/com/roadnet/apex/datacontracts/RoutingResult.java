
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de RoutingResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RoutingResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LongestRunTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="NotRoutedOrderResults" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRoutingResult.NotRoutedOrderResult" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfOrdersNotRouted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfOrdersRouted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfRoutesCouldNotModify" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfRoutesCreated" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfRoutesDeleted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfRoutesModified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfTerritoriesCreated" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfTerritoriesDeleted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfTerritoriesModified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PassResults" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRoutingResult.PassResult" minOccurs="0"/&gt;
 *         &lt;element name="RouteConstraintFlags_ConstraintsEncountered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShortestRunTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="TotalMissedTimeWindowDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalNumberOfMissedTimeWindows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalRunTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingResult", propOrder = {
    "longestRunTime",
    "notRoutedOrderResults",
    "numberOfOrdersNotRouted",
    "numberOfOrdersRouted",
    "numberOfRoutesCouldNotModify",
    "numberOfRoutesCreated",
    "numberOfRoutesDeleted",
    "numberOfRoutesModified",
    "numberOfTerritoriesCreated",
    "numberOfTerritoriesDeleted",
    "numberOfTerritoriesModified",
    "passResults",
    "routeConstraintFlagsConstraintsEncountered",
    "shortestRunTime",
    "totalCost",
    "totalDistance",
    "totalMissedTimeWindowDuration",
    "totalNumberOfMissedTimeWindows",
    "totalRunTime"
})
public class RoutingResult
    extends DataTransferObject
{

    @XmlElement(name = "LongestRunTime")
    protected Duration longestRunTime;
    @XmlElementRef(name = "NotRoutedOrderResults", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRoutingResultNotRoutedOrderResult> notRoutedOrderResults;
    @XmlElement(name = "NumberOfOrdersNotRouted")
    protected Integer numberOfOrdersNotRouted;
    @XmlElement(name = "NumberOfOrdersRouted")
    protected Integer numberOfOrdersRouted;
    @XmlElement(name = "NumberOfRoutesCouldNotModify")
    protected Integer numberOfRoutesCouldNotModify;
    @XmlElement(name = "NumberOfRoutesCreated")
    protected Integer numberOfRoutesCreated;
    @XmlElement(name = "NumberOfRoutesDeleted")
    protected Integer numberOfRoutesDeleted;
    @XmlElement(name = "NumberOfRoutesModified")
    protected Integer numberOfRoutesModified;
    @XmlElement(name = "NumberOfTerritoriesCreated")
    protected Integer numberOfTerritoriesCreated;
    @XmlElement(name = "NumberOfTerritoriesDeleted")
    protected Integer numberOfTerritoriesDeleted;
    @XmlElement(name = "NumberOfTerritoriesModified")
    protected Integer numberOfTerritoriesModified;
    @XmlElementRef(name = "PassResults", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRoutingResultPassResult> passResults;
    @XmlElementRef(name = "RouteConstraintFlags_ConstraintsEncountered", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeConstraintFlagsConstraintsEncountered;
    @XmlElement(name = "ShortestRunTime")
    protected Duration shortestRunTime;
    @XmlElement(name = "TotalCost")
    protected Double totalCost;
    @XmlElementRef(name = "TotalDistance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> totalDistance;
    @XmlElement(name = "TotalMissedTimeWindowDuration")
    protected Duration totalMissedTimeWindowDuration;
    @XmlElement(name = "TotalNumberOfMissedTimeWindows")
    protected Integer totalNumberOfMissedTimeWindows;
    @XmlElement(name = "TotalRunTime")
    protected Duration totalRunTime;

    /**
     * Obtém o valor da propriedade longestRunTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getLongestRunTime() {
        return longestRunTime;
    }

    /**
     * Define o valor da propriedade longestRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setLongestRunTime(Duration value) {
        this.longestRunTime = value;
    }

    /**
     * Obtém o valor da propriedade notRoutedOrderResults.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoutingResultNotRoutedOrderResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRoutingResultNotRoutedOrderResult> getNotRoutedOrderResults() {
        return notRoutedOrderResults;
    }

    /**
     * Define o valor da propriedade notRoutedOrderResults.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoutingResultNotRoutedOrderResult }{@code >}
     *     
     */
    public void setNotRoutedOrderResults(JAXBElement<ArrayOfRoutingResultNotRoutedOrderResult> value) {
        this.notRoutedOrderResults = value;
    }

    /**
     * Obtém o valor da propriedade numberOfOrdersNotRouted.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfOrdersNotRouted() {
        return numberOfOrdersNotRouted;
    }

    /**
     * Define o valor da propriedade numberOfOrdersNotRouted.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfOrdersNotRouted(Integer value) {
        this.numberOfOrdersNotRouted = value;
    }

    /**
     * Obtém o valor da propriedade numberOfOrdersRouted.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfOrdersRouted() {
        return numberOfOrdersRouted;
    }

    /**
     * Define o valor da propriedade numberOfOrdersRouted.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfOrdersRouted(Integer value) {
        this.numberOfOrdersRouted = value;
    }

    /**
     * Obtém o valor da propriedade numberOfRoutesCouldNotModify.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRoutesCouldNotModify() {
        return numberOfRoutesCouldNotModify;
    }

    /**
     * Define o valor da propriedade numberOfRoutesCouldNotModify.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRoutesCouldNotModify(Integer value) {
        this.numberOfRoutesCouldNotModify = value;
    }

    /**
     * Obtém o valor da propriedade numberOfRoutesCreated.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRoutesCreated() {
        return numberOfRoutesCreated;
    }

    /**
     * Define o valor da propriedade numberOfRoutesCreated.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRoutesCreated(Integer value) {
        this.numberOfRoutesCreated = value;
    }

    /**
     * Obtém o valor da propriedade numberOfRoutesDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRoutesDeleted() {
        return numberOfRoutesDeleted;
    }

    /**
     * Define o valor da propriedade numberOfRoutesDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRoutesDeleted(Integer value) {
        this.numberOfRoutesDeleted = value;
    }

    /**
     * Obtém o valor da propriedade numberOfRoutesModified.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRoutesModified() {
        return numberOfRoutesModified;
    }

    /**
     * Define o valor da propriedade numberOfRoutesModified.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRoutesModified(Integer value) {
        this.numberOfRoutesModified = value;
    }

    /**
     * Obtém o valor da propriedade numberOfTerritoriesCreated.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfTerritoriesCreated() {
        return numberOfTerritoriesCreated;
    }

    /**
     * Define o valor da propriedade numberOfTerritoriesCreated.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfTerritoriesCreated(Integer value) {
        this.numberOfTerritoriesCreated = value;
    }

    /**
     * Obtém o valor da propriedade numberOfTerritoriesDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfTerritoriesDeleted() {
        return numberOfTerritoriesDeleted;
    }

    /**
     * Define o valor da propriedade numberOfTerritoriesDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfTerritoriesDeleted(Integer value) {
        this.numberOfTerritoriesDeleted = value;
    }

    /**
     * Obtém o valor da propriedade numberOfTerritoriesModified.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfTerritoriesModified() {
        return numberOfTerritoriesModified;
    }

    /**
     * Define o valor da propriedade numberOfTerritoriesModified.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfTerritoriesModified(Integer value) {
        this.numberOfTerritoriesModified = value;
    }

    /**
     * Obtém o valor da propriedade passResults.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoutingResultPassResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRoutingResultPassResult> getPassResults() {
        return passResults;
    }

    /**
     * Define o valor da propriedade passResults.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoutingResultPassResult }{@code >}
     *     
     */
    public void setPassResults(JAXBElement<ArrayOfRoutingResultPassResult> value) {
        this.passResults = value;
    }

    /**
     * Obtém o valor da propriedade routeConstraintFlagsConstraintsEncountered.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteConstraintFlagsConstraintsEncountered() {
        return routeConstraintFlagsConstraintsEncountered;
    }

    /**
     * Define o valor da propriedade routeConstraintFlagsConstraintsEncountered.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteConstraintFlagsConstraintsEncountered(JAXBElement<String> value) {
        this.routeConstraintFlagsConstraintsEncountered = value;
    }

    /**
     * Obtém o valor da propriedade shortestRunTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getShortestRunTime() {
        return shortestRunTime;
    }

    /**
     * Define o valor da propriedade shortestRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setShortestRunTime(Duration value) {
        this.shortestRunTime = value;
    }

    /**
     * Obtém o valor da propriedade totalCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalCost() {
        return totalCost;
    }

    /**
     * Define o valor da propriedade totalCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalCost(Double value) {
        this.totalCost = value;
    }

    /**
     * Obtém o valor da propriedade totalDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getTotalDistance() {
        return totalDistance;
    }

    /**
     * Define o valor da propriedade totalDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setTotalDistance(JAXBElement<Distance> value) {
        this.totalDistance = value;
    }

    /**
     * Obtém o valor da propriedade totalMissedTimeWindowDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalMissedTimeWindowDuration() {
        return totalMissedTimeWindowDuration;
    }

    /**
     * Define o valor da propriedade totalMissedTimeWindowDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalMissedTimeWindowDuration(Duration value) {
        this.totalMissedTimeWindowDuration = value;
    }

    /**
     * Obtém o valor da propriedade totalNumberOfMissedTimeWindows.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumberOfMissedTimeWindows() {
        return totalNumberOfMissedTimeWindows;
    }

    /**
     * Define o valor da propriedade totalNumberOfMissedTimeWindows.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumberOfMissedTimeWindows(Integer value) {
        this.totalNumberOfMissedTimeWindows = value;
    }

    /**
     * Obtém o valor da propriedade totalRunTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalRunTime() {
        return totalRunTime;
    }

    /**
     * Define o valor da propriedade totalRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalRunTime(Duration value) {
        this.totalRunTime = value;
    }

}
