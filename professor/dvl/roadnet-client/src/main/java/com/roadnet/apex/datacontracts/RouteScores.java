
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de RouteScores complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteScores"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BuildingDeliverySequenceViolationsMetric" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DistanceMetric" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DistanceOutsideOfCellMetric" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="NonTemplateStopsInIllegalPositionMetric" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QuantitiesNormalizedVarianceMetric" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RouteLastTotalPenalty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RunTimeVarianceMetric" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="StopDistanceFromCentroidMetric" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TemplateStopsMissingMetric" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TemplateStopsOutOfSequenceMetric" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TimeOverPreferredTimeMetric" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
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
@XmlType(name = "RouteScores", propOrder = {
    "buildingDeliverySequenceViolationsMetric",
    "distanceMetric",
    "distanceOutsideOfCellMetric",
    "nonTemplateStopsInIllegalPositionMetric",
    "quantitiesNormalizedVarianceMetric",
    "routeLastTotalPenalty",
    "runTimeVarianceMetric",
    "stopDistanceFromCentroidMetric",
    "templateStopsMissingMetric",
    "templateStopsOutOfSequenceMetric",
    "timeOverPreferredTimeMetric",
    "weightedMissedTimeWindowMetric"
})
public class RouteScores
    extends DataTransferObject
{

    @XmlElement(name = "BuildingDeliverySequenceViolationsMetric")
    protected Integer buildingDeliverySequenceViolationsMetric;
    @XmlElement(name = "DistanceMetric")
    protected Double distanceMetric;
    @XmlElement(name = "DistanceOutsideOfCellMetric")
    protected Double distanceOutsideOfCellMetric;
    @XmlElement(name = "NonTemplateStopsInIllegalPositionMetric")
    protected Integer nonTemplateStopsInIllegalPositionMetric;
    @XmlElement(name = "QuantitiesNormalizedVarianceMetric")
    protected Double quantitiesNormalizedVarianceMetric;
    @XmlElement(name = "RouteLastTotalPenalty")
    protected Double routeLastTotalPenalty;
    @XmlElement(name = "RunTimeVarianceMetric")
    protected Duration runTimeVarianceMetric;
    @XmlElement(name = "StopDistanceFromCentroidMetric")
    protected Double stopDistanceFromCentroidMetric;
    @XmlElement(name = "TemplateStopsMissingMetric")
    protected Integer templateStopsMissingMetric;
    @XmlElement(name = "TemplateStopsOutOfSequenceMetric")
    protected Integer templateStopsOutOfSequenceMetric;
    @XmlElement(name = "TimeOverPreferredTimeMetric")
    protected Duration timeOverPreferredTimeMetric;
    @XmlElement(name = "WeightedMissedTimeWindowMetric")
    protected Double weightedMissedTimeWindowMetric;

    /**
     * Obtém o valor da propriedade buildingDeliverySequenceViolationsMetric.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuildingDeliverySequenceViolationsMetric() {
        return buildingDeliverySequenceViolationsMetric;
    }

    /**
     * Define o valor da propriedade buildingDeliverySequenceViolationsMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuildingDeliverySequenceViolationsMetric(Integer value) {
        this.buildingDeliverySequenceViolationsMetric = value;
    }

    /**
     * Obtém o valor da propriedade distanceMetric.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistanceMetric() {
        return distanceMetric;
    }

    /**
     * Define o valor da propriedade distanceMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistanceMetric(Double value) {
        this.distanceMetric = value;
    }

    /**
     * Obtém o valor da propriedade distanceOutsideOfCellMetric.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistanceOutsideOfCellMetric() {
        return distanceOutsideOfCellMetric;
    }

    /**
     * Define o valor da propriedade distanceOutsideOfCellMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistanceOutsideOfCellMetric(Double value) {
        this.distanceOutsideOfCellMetric = value;
    }

    /**
     * Obtém o valor da propriedade nonTemplateStopsInIllegalPositionMetric.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNonTemplateStopsInIllegalPositionMetric() {
        return nonTemplateStopsInIllegalPositionMetric;
    }

    /**
     * Define o valor da propriedade nonTemplateStopsInIllegalPositionMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNonTemplateStopsInIllegalPositionMetric(Integer value) {
        this.nonTemplateStopsInIllegalPositionMetric = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesNormalizedVarianceMetric.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantitiesNormalizedVarianceMetric() {
        return quantitiesNormalizedVarianceMetric;
    }

    /**
     * Define o valor da propriedade quantitiesNormalizedVarianceMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantitiesNormalizedVarianceMetric(Double value) {
        this.quantitiesNormalizedVarianceMetric = value;
    }

    /**
     * Obtém o valor da propriedade routeLastTotalPenalty.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRouteLastTotalPenalty() {
        return routeLastTotalPenalty;
    }

    /**
     * Define o valor da propriedade routeLastTotalPenalty.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRouteLastTotalPenalty(Double value) {
        this.routeLastTotalPenalty = value;
    }

    /**
     * Obtém o valor da propriedade runTimeVarianceMetric.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRunTimeVarianceMetric() {
        return runTimeVarianceMetric;
    }

    /**
     * Define o valor da propriedade runTimeVarianceMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRunTimeVarianceMetric(Duration value) {
        this.runTimeVarianceMetric = value;
    }

    /**
     * Obtém o valor da propriedade stopDistanceFromCentroidMetric.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStopDistanceFromCentroidMetric() {
        return stopDistanceFromCentroidMetric;
    }

    /**
     * Define o valor da propriedade stopDistanceFromCentroidMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStopDistanceFromCentroidMetric(Double value) {
        this.stopDistanceFromCentroidMetric = value;
    }

    /**
     * Obtém o valor da propriedade templateStopsMissingMetric.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTemplateStopsMissingMetric() {
        return templateStopsMissingMetric;
    }

    /**
     * Define o valor da propriedade templateStopsMissingMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTemplateStopsMissingMetric(Integer value) {
        this.templateStopsMissingMetric = value;
    }

    /**
     * Obtém o valor da propriedade templateStopsOutOfSequenceMetric.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTemplateStopsOutOfSequenceMetric() {
        return templateStopsOutOfSequenceMetric;
    }

    /**
     * Define o valor da propriedade templateStopsOutOfSequenceMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTemplateStopsOutOfSequenceMetric(Integer value) {
        this.templateStopsOutOfSequenceMetric = value;
    }

    /**
     * Obtém o valor da propriedade timeOverPreferredTimeMetric.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeOverPreferredTimeMetric() {
        return timeOverPreferredTimeMetric;
    }

    /**
     * Define o valor da propriedade timeOverPreferredTimeMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeOverPreferredTimeMetric(Duration value) {
        this.timeOverPreferredTimeMetric = value;
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
