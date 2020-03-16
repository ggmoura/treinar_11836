
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de RouteCostsPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteCostsPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AverageCostPerDistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AverageCostPerQuantitySize1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AverageCostPerQuantitySize2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AverageCostPerQuantitySize3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AverageCostPerStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalEquipmentCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalEquipmentDistanceCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalEquipmentFixedCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalEquipmentTimeCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalWorkerCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalWorkerDistanceCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalWorkerFixedCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalWorkerHourlyCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalWorkerOvertimeCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalWorkerPerQuantityCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalWorkerStopCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteCostsPropertyOptions", propOrder = {
    "averageCostPerDistance",
    "averageCostPerQuantitySize1",
    "averageCostPerQuantitySize2",
    "averageCostPerQuantitySize3",
    "averageCostPerStop",
    "totalCost",
    "totalEquipmentCost",
    "totalEquipmentDistanceCost",
    "totalEquipmentFixedCost",
    "totalEquipmentTimeCost",
    "totalWorkerCost",
    "totalWorkerDistanceCost",
    "totalWorkerFixedCost",
    "totalWorkerHourlyCost",
    "totalWorkerOvertimeCost",
    "totalWorkerPerQuantityCost",
    "totalWorkerStopCost"
})
public class RouteCostsPropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "AverageCostPerDistance")
    protected Boolean averageCostPerDistance;
    @XmlElement(name = "AverageCostPerQuantitySize1")
    protected Boolean averageCostPerQuantitySize1;
    @XmlElement(name = "AverageCostPerQuantitySize2")
    protected Boolean averageCostPerQuantitySize2;
    @XmlElement(name = "AverageCostPerQuantitySize3")
    protected Boolean averageCostPerQuantitySize3;
    @XmlElement(name = "AverageCostPerStop")
    protected Boolean averageCostPerStop;
    @XmlElement(name = "TotalCost")
    protected Boolean totalCost;
    @XmlElement(name = "TotalEquipmentCost")
    protected Boolean totalEquipmentCost;
    @XmlElement(name = "TotalEquipmentDistanceCost")
    protected Boolean totalEquipmentDistanceCost;
    @XmlElement(name = "TotalEquipmentFixedCost")
    protected Boolean totalEquipmentFixedCost;
    @XmlElement(name = "TotalEquipmentTimeCost")
    protected Boolean totalEquipmentTimeCost;
    @XmlElement(name = "TotalWorkerCost")
    protected Boolean totalWorkerCost;
    @XmlElement(name = "TotalWorkerDistanceCost")
    protected Boolean totalWorkerDistanceCost;
    @XmlElement(name = "TotalWorkerFixedCost")
    protected Boolean totalWorkerFixedCost;
    @XmlElement(name = "TotalWorkerHourlyCost")
    protected Boolean totalWorkerHourlyCost;
    @XmlElement(name = "TotalWorkerOvertimeCost")
    protected Boolean totalWorkerOvertimeCost;
    @XmlElement(name = "TotalWorkerPerQuantityCost")
    protected Boolean totalWorkerPerQuantityCost;
    @XmlElement(name = "TotalWorkerStopCost")
    protected Boolean totalWorkerStopCost;

    /**
     * Obtém o valor da propriedade averageCostPerDistance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAverageCostPerDistance() {
        return averageCostPerDistance;
    }

    /**
     * Define o valor da propriedade averageCostPerDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAverageCostPerDistance(Boolean value) {
        this.averageCostPerDistance = value;
    }

    /**
     * Obtém o valor da propriedade averageCostPerQuantitySize1.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAverageCostPerQuantitySize1() {
        return averageCostPerQuantitySize1;
    }

    /**
     * Define o valor da propriedade averageCostPerQuantitySize1.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAverageCostPerQuantitySize1(Boolean value) {
        this.averageCostPerQuantitySize1 = value;
    }

    /**
     * Obtém o valor da propriedade averageCostPerQuantitySize2.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAverageCostPerQuantitySize2() {
        return averageCostPerQuantitySize2;
    }

    /**
     * Define o valor da propriedade averageCostPerQuantitySize2.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAverageCostPerQuantitySize2(Boolean value) {
        this.averageCostPerQuantitySize2 = value;
    }

    /**
     * Obtém o valor da propriedade averageCostPerQuantitySize3.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAverageCostPerQuantitySize3() {
        return averageCostPerQuantitySize3;
    }

    /**
     * Define o valor da propriedade averageCostPerQuantitySize3.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAverageCostPerQuantitySize3(Boolean value) {
        this.averageCostPerQuantitySize3 = value;
    }

    /**
     * Obtém o valor da propriedade averageCostPerStop.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAverageCostPerStop() {
        return averageCostPerStop;
    }

    /**
     * Define o valor da propriedade averageCostPerStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAverageCostPerStop(Boolean value) {
        this.averageCostPerStop = value;
    }

    /**
     * Obtém o valor da propriedade totalCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalCost() {
        return totalCost;
    }

    /**
     * Define o valor da propriedade totalCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalCost(Boolean value) {
        this.totalCost = value;
    }

    /**
     * Obtém o valor da propriedade totalEquipmentCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalEquipmentCost() {
        return totalEquipmentCost;
    }

    /**
     * Define o valor da propriedade totalEquipmentCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalEquipmentCost(Boolean value) {
        this.totalEquipmentCost = value;
    }

    /**
     * Obtém o valor da propriedade totalEquipmentDistanceCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalEquipmentDistanceCost() {
        return totalEquipmentDistanceCost;
    }

    /**
     * Define o valor da propriedade totalEquipmentDistanceCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalEquipmentDistanceCost(Boolean value) {
        this.totalEquipmentDistanceCost = value;
    }

    /**
     * Obtém o valor da propriedade totalEquipmentFixedCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalEquipmentFixedCost() {
        return totalEquipmentFixedCost;
    }

    /**
     * Define o valor da propriedade totalEquipmentFixedCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalEquipmentFixedCost(Boolean value) {
        this.totalEquipmentFixedCost = value;
    }

    /**
     * Obtém o valor da propriedade totalEquipmentTimeCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalEquipmentTimeCost() {
        return totalEquipmentTimeCost;
    }

    /**
     * Define o valor da propriedade totalEquipmentTimeCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalEquipmentTimeCost(Boolean value) {
        this.totalEquipmentTimeCost = value;
    }

    /**
     * Obtém o valor da propriedade totalWorkerCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalWorkerCost() {
        return totalWorkerCost;
    }

    /**
     * Define o valor da propriedade totalWorkerCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalWorkerCost(Boolean value) {
        this.totalWorkerCost = value;
    }

    /**
     * Obtém o valor da propriedade totalWorkerDistanceCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalWorkerDistanceCost() {
        return totalWorkerDistanceCost;
    }

    /**
     * Define o valor da propriedade totalWorkerDistanceCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalWorkerDistanceCost(Boolean value) {
        this.totalWorkerDistanceCost = value;
    }

    /**
     * Obtém o valor da propriedade totalWorkerFixedCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalWorkerFixedCost() {
        return totalWorkerFixedCost;
    }

    /**
     * Define o valor da propriedade totalWorkerFixedCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalWorkerFixedCost(Boolean value) {
        this.totalWorkerFixedCost = value;
    }

    /**
     * Obtém o valor da propriedade totalWorkerHourlyCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalWorkerHourlyCost() {
        return totalWorkerHourlyCost;
    }

    /**
     * Define o valor da propriedade totalWorkerHourlyCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalWorkerHourlyCost(Boolean value) {
        this.totalWorkerHourlyCost = value;
    }

    /**
     * Obtém o valor da propriedade totalWorkerOvertimeCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalWorkerOvertimeCost() {
        return totalWorkerOvertimeCost;
    }

    /**
     * Define o valor da propriedade totalWorkerOvertimeCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalWorkerOvertimeCost(Boolean value) {
        this.totalWorkerOvertimeCost = value;
    }

    /**
     * Obtém o valor da propriedade totalWorkerPerQuantityCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalWorkerPerQuantityCost() {
        return totalWorkerPerQuantityCost;
    }

    /**
     * Define o valor da propriedade totalWorkerPerQuantityCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalWorkerPerQuantityCost(Boolean value) {
        this.totalWorkerPerQuantityCost = value;
    }

    /**
     * Obtém o valor da propriedade totalWorkerStopCost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalWorkerStopCost() {
        return totalWorkerStopCost;
    }

    /**
     * Define o valor da propriedade totalWorkerStopCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalWorkerStopCost(Boolean value) {
        this.totalWorkerStopCost = value;
    }

}
