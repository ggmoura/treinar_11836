
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de RouteScoresPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteScoresPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BuildingDeliverySequenceViolationsMetric" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DistanceMetric" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DistanceOutsideOfCellMetric" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NonTemplateStopsInIllegalPositionMetric" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QuantitiesNormalizedVarianceMetric" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteLastTotalPenalty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RunTimeVarianceMetric" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopDistanceFromCentroidMetric" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TemplateStopsMissingMetric" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TemplateStopsOutOfSequenceMetric" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeOverPreferredTimeMetric" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WeightedMissedTimeWindowMetric" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteScoresPropertyOptions", propOrder = {
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
public class RouteScoresPropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "BuildingDeliverySequenceViolationsMetric")
    protected Boolean buildingDeliverySequenceViolationsMetric;
    @XmlElement(name = "DistanceMetric")
    protected Boolean distanceMetric;
    @XmlElement(name = "DistanceOutsideOfCellMetric")
    protected Boolean distanceOutsideOfCellMetric;
    @XmlElement(name = "NonTemplateStopsInIllegalPositionMetric")
    protected Boolean nonTemplateStopsInIllegalPositionMetric;
    @XmlElement(name = "QuantitiesNormalizedVarianceMetric")
    protected Boolean quantitiesNormalizedVarianceMetric;
    @XmlElement(name = "RouteLastTotalPenalty")
    protected Boolean routeLastTotalPenalty;
    @XmlElement(name = "RunTimeVarianceMetric")
    protected Boolean runTimeVarianceMetric;
    @XmlElement(name = "StopDistanceFromCentroidMetric")
    protected Boolean stopDistanceFromCentroidMetric;
    @XmlElement(name = "TemplateStopsMissingMetric")
    protected Boolean templateStopsMissingMetric;
    @XmlElement(name = "TemplateStopsOutOfSequenceMetric")
    protected Boolean templateStopsOutOfSequenceMetric;
    @XmlElement(name = "TimeOverPreferredTimeMetric")
    protected Boolean timeOverPreferredTimeMetric;
    @XmlElement(name = "WeightedMissedTimeWindowMetric")
    protected Boolean weightedMissedTimeWindowMetric;

    /**
     * Obtém o valor da propriedade buildingDeliverySequenceViolationsMetric.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuildingDeliverySequenceViolationsMetric() {
        return buildingDeliverySequenceViolationsMetric;
    }

    /**
     * Define o valor da propriedade buildingDeliverySequenceViolationsMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuildingDeliverySequenceViolationsMetric(Boolean value) {
        this.buildingDeliverySequenceViolationsMetric = value;
    }

    /**
     * Obtém o valor da propriedade distanceMetric.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistanceMetric() {
        return distanceMetric;
    }

    /**
     * Define o valor da propriedade distanceMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistanceMetric(Boolean value) {
        this.distanceMetric = value;
    }

    /**
     * Obtém o valor da propriedade distanceOutsideOfCellMetric.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistanceOutsideOfCellMetric() {
        return distanceOutsideOfCellMetric;
    }

    /**
     * Define o valor da propriedade distanceOutsideOfCellMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistanceOutsideOfCellMetric(Boolean value) {
        this.distanceOutsideOfCellMetric = value;
    }

    /**
     * Obtém o valor da propriedade nonTemplateStopsInIllegalPositionMetric.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonTemplateStopsInIllegalPositionMetric() {
        return nonTemplateStopsInIllegalPositionMetric;
    }

    /**
     * Define o valor da propriedade nonTemplateStopsInIllegalPositionMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonTemplateStopsInIllegalPositionMetric(Boolean value) {
        this.nonTemplateStopsInIllegalPositionMetric = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesNormalizedVarianceMetric.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantitiesNormalizedVarianceMetric() {
        return quantitiesNormalizedVarianceMetric;
    }

    /**
     * Define o valor da propriedade quantitiesNormalizedVarianceMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantitiesNormalizedVarianceMetric(Boolean value) {
        this.quantitiesNormalizedVarianceMetric = value;
    }

    /**
     * Obtém o valor da propriedade routeLastTotalPenalty.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteLastTotalPenalty() {
        return routeLastTotalPenalty;
    }

    /**
     * Define o valor da propriedade routeLastTotalPenalty.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteLastTotalPenalty(Boolean value) {
        this.routeLastTotalPenalty = value;
    }

    /**
     * Obtém o valor da propriedade runTimeVarianceMetric.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRunTimeVarianceMetric() {
        return runTimeVarianceMetric;
    }

    /**
     * Define o valor da propriedade runTimeVarianceMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRunTimeVarianceMetric(Boolean value) {
        this.runTimeVarianceMetric = value;
    }

    /**
     * Obtém o valor da propriedade stopDistanceFromCentroidMetric.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopDistanceFromCentroidMetric() {
        return stopDistanceFromCentroidMetric;
    }

    /**
     * Define o valor da propriedade stopDistanceFromCentroidMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopDistanceFromCentroidMetric(Boolean value) {
        this.stopDistanceFromCentroidMetric = value;
    }

    /**
     * Obtém o valor da propriedade templateStopsMissingMetric.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTemplateStopsMissingMetric() {
        return templateStopsMissingMetric;
    }

    /**
     * Define o valor da propriedade templateStopsMissingMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTemplateStopsMissingMetric(Boolean value) {
        this.templateStopsMissingMetric = value;
    }

    /**
     * Obtém o valor da propriedade templateStopsOutOfSequenceMetric.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTemplateStopsOutOfSequenceMetric() {
        return templateStopsOutOfSequenceMetric;
    }

    /**
     * Define o valor da propriedade templateStopsOutOfSequenceMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTemplateStopsOutOfSequenceMetric(Boolean value) {
        this.templateStopsOutOfSequenceMetric = value;
    }

    /**
     * Obtém o valor da propriedade timeOverPreferredTimeMetric.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeOverPreferredTimeMetric() {
        return timeOverPreferredTimeMetric;
    }

    /**
     * Define o valor da propriedade timeOverPreferredTimeMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeOverPreferredTimeMetric(Boolean value) {
        this.timeOverPreferredTimeMetric = value;
    }

    /**
     * Obtém o valor da propriedade weightedMissedTimeWindowMetric.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeightedMissedTimeWindowMetric() {
        return weightedMissedTimeWindowMetric;
    }

    /**
     * Define o valor da propriedade weightedMissedTimeWindowMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeightedMissedTimeWindowMetric(Boolean value) {
        this.weightedMissedTimeWindowMetric = value;
    }

}
