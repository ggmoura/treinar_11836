
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
 * <p>Classe Java de RouteResult.RouteDeltas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteResult.RouteDeltas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CostPercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Distance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="DistancePercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MissedTimeWindowDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MissedTimeWindowDurationPercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RouteConstraintFlags_FixedConstraints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteConstraintFlags_NewlyBrokenConstraints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RunTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="RunTimePercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="WeightedMissedTimeWindowMetric" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteResult.RouteDeltas", propOrder = {
    "cost",
    "costPercentage",
    "distance",
    "distancePercentage",
    "missedTimeWindowDuration",
    "missedTimeWindowDurationPercentage",
    "routeConstraintFlagsFixedConstraints",
    "routeConstraintFlagsNewlyBrokenConstraints",
    "runTime",
    "runTimePercentage",
    "weightedMissedTimeWindowMetric"
})
public class RouteResultRouteDeltas
    extends DataTransferObject
{

    @XmlElement(name = "Cost")
    protected Double cost;
    @XmlElement(name = "CostPercentage")
    protected Double costPercentage;
    @XmlElementRef(name = "Distance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> distance;
    @XmlElement(name = "DistancePercentage")
    protected Double distancePercentage;
    @XmlElement(name = "MissedTimeWindowDuration")
    protected Duration missedTimeWindowDuration;
    @XmlElement(name = "MissedTimeWindowDurationPercentage")
    protected Double missedTimeWindowDurationPercentage;
    @XmlElementRef(name = "RouteConstraintFlags_FixedConstraints", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeConstraintFlagsFixedConstraints;
    @XmlElementRef(name = "RouteConstraintFlags_NewlyBrokenConstraints", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeConstraintFlagsNewlyBrokenConstraints;
    @XmlElement(name = "RunTime")
    protected Duration runTime;
    @XmlElement(name = "RunTimePercentage")
    protected Double runTimePercentage;
    @XmlElement(name = "WeightedMissedTimeWindowMetric")
    protected Double weightedMissedTimeWindowMetric;

    /**
     * Obtém o valor da propriedade cost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCost() {
        return cost;
    }

    /**
     * Define o valor da propriedade cost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCost(Double value) {
        this.cost = value;
    }

    /**
     * Obtém o valor da propriedade costPercentage.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCostPercentage() {
        return costPercentage;
    }

    /**
     * Define o valor da propriedade costPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCostPercentage(Double value) {
        this.costPercentage = value;
    }

    /**
     * Obtém o valor da propriedade distance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDistance() {
        return distance;
    }

    /**
     * Define o valor da propriedade distance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDistance(JAXBElement<Distance> value) {
        this.distance = value;
    }

    /**
     * Obtém o valor da propriedade distancePercentage.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistancePercentage() {
        return distancePercentage;
    }

    /**
     * Define o valor da propriedade distancePercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistancePercentage(Double value) {
        this.distancePercentage = value;
    }

    /**
     * Obtém o valor da propriedade missedTimeWindowDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMissedTimeWindowDuration() {
        return missedTimeWindowDuration;
    }

    /**
     * Define o valor da propriedade missedTimeWindowDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMissedTimeWindowDuration(Duration value) {
        this.missedTimeWindowDuration = value;
    }

    /**
     * Obtém o valor da propriedade missedTimeWindowDurationPercentage.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMissedTimeWindowDurationPercentage() {
        return missedTimeWindowDurationPercentage;
    }

    /**
     * Define o valor da propriedade missedTimeWindowDurationPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMissedTimeWindowDurationPercentage(Double value) {
        this.missedTimeWindowDurationPercentage = value;
    }

    /**
     * Obtém o valor da propriedade routeConstraintFlagsFixedConstraints.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteConstraintFlagsFixedConstraints() {
        return routeConstraintFlagsFixedConstraints;
    }

    /**
     * Define o valor da propriedade routeConstraintFlagsFixedConstraints.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteConstraintFlagsFixedConstraints(JAXBElement<String> value) {
        this.routeConstraintFlagsFixedConstraints = value;
    }

    /**
     * Obtém o valor da propriedade routeConstraintFlagsNewlyBrokenConstraints.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteConstraintFlagsNewlyBrokenConstraints() {
        return routeConstraintFlagsNewlyBrokenConstraints;
    }

    /**
     * Define o valor da propriedade routeConstraintFlagsNewlyBrokenConstraints.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteConstraintFlagsNewlyBrokenConstraints(JAXBElement<String> value) {
        this.routeConstraintFlagsNewlyBrokenConstraints = value;
    }

    /**
     * Obtém o valor da propriedade runTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRunTime() {
        return runTime;
    }

    /**
     * Define o valor da propriedade runTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRunTime(Duration value) {
        this.runTime = value;
    }

    /**
     * Obtém o valor da propriedade runTimePercentage.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRunTimePercentage() {
        return runTimePercentage;
    }

    /**
     * Define o valor da propriedade runTimePercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRunTimePercentage(Double value) {
        this.runTimePercentage = value;
    }

    /**
     * Obtém o valor da propriedade weightedMissedTimeWindowMetric.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeightedMissedTimeWindowMetric() {
        return weightedMissedTimeWindowMetric;
    }

    /**
     * Define o valor da propriedade weightedMissedTimeWindowMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeightedMissedTimeWindowMetric(Double value) {
        this.weightedMissedTimeWindowMetric = value;
    }

}
