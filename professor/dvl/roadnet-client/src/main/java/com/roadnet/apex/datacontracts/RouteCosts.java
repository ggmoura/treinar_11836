
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de RouteCosts complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteCosts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AverageCostPerDistance" type="{http://roadnet.com/apex/DataContracts/}DistanceCost" minOccurs="0"/&gt;
 *         &lt;element name="AverageCostPerQuantitySize1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="AverageCostPerQuantitySize2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="AverageCostPerQuantitySize3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="AverageCostPerStop" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalEquipmentCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalEquipmentDistanceCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalEquipmentFixedCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalEquipmentTimeCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalWorkerCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalWorkerDistanceCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalWorkerFixedCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalWorkerHourlyCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalWorkerOvertimeCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalWorkerPerQuantityCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalWorkerStopCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteCosts", propOrder = {
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
public class RouteCosts
    extends DataTransferObject
{

    @XmlElementRef(name = "AverageCostPerDistance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceCost> averageCostPerDistance;
    @XmlElement(name = "AverageCostPerQuantitySize1")
    protected Double averageCostPerQuantitySize1;
    @XmlElement(name = "AverageCostPerQuantitySize2")
    protected Double averageCostPerQuantitySize2;
    @XmlElement(name = "AverageCostPerQuantitySize3")
    protected Double averageCostPerQuantitySize3;
    @XmlElement(name = "AverageCostPerStop")
    protected Double averageCostPerStop;
    @XmlElement(name = "TotalCost")
    protected Double totalCost;
    @XmlElement(name = "TotalEquipmentCost")
    protected Double totalEquipmentCost;
    @XmlElement(name = "TotalEquipmentDistanceCost")
    protected Double totalEquipmentDistanceCost;
    @XmlElement(name = "TotalEquipmentFixedCost")
    protected Double totalEquipmentFixedCost;
    @XmlElement(name = "TotalEquipmentTimeCost")
    protected Double totalEquipmentTimeCost;
    @XmlElement(name = "TotalWorkerCost")
    protected Double totalWorkerCost;
    @XmlElement(name = "TotalWorkerDistanceCost")
    protected Double totalWorkerDistanceCost;
    @XmlElement(name = "TotalWorkerFixedCost")
    protected Double totalWorkerFixedCost;
    @XmlElement(name = "TotalWorkerHourlyCost")
    protected Double totalWorkerHourlyCost;
    @XmlElement(name = "TotalWorkerOvertimeCost")
    protected Double totalWorkerOvertimeCost;
    @XmlElement(name = "TotalWorkerPerQuantityCost")
    protected Double totalWorkerPerQuantityCost;
    @XmlElement(name = "TotalWorkerStopCost")
    protected Double totalWorkerStopCost;

    /**
     * Obtém o valor da propriedade averageCostPerDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceCost }{@code >}
     *     
     */
    public JAXBElement<DistanceCost> getAverageCostPerDistance() {
        return averageCostPerDistance;
    }

    /**
     * Define o valor da propriedade averageCostPerDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceCost }{@code >}
     *     
     */
    public void setAverageCostPerDistance(JAXBElement<DistanceCost> value) {
        this.averageCostPerDistance = value;
    }

    /**
     * Obtém o valor da propriedade averageCostPerQuantitySize1.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageCostPerQuantitySize1() {
        return averageCostPerQuantitySize1;
    }

    /**
     * Define o valor da propriedade averageCostPerQuantitySize1.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageCostPerQuantitySize1(Double value) {
        this.averageCostPerQuantitySize1 = value;
    }

    /**
     * Obtém o valor da propriedade averageCostPerQuantitySize2.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageCostPerQuantitySize2() {
        return averageCostPerQuantitySize2;
    }

    /**
     * Define o valor da propriedade averageCostPerQuantitySize2.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageCostPerQuantitySize2(Double value) {
        this.averageCostPerQuantitySize2 = value;
    }

    /**
     * Obtém o valor da propriedade averageCostPerQuantitySize3.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageCostPerQuantitySize3() {
        return averageCostPerQuantitySize3;
    }

    /**
     * Define o valor da propriedade averageCostPerQuantitySize3.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageCostPerQuantitySize3(Double value) {
        this.averageCostPerQuantitySize3 = value;
    }

    /**
     * Obtém o valor da propriedade averageCostPerStop.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageCostPerStop() {
        return averageCostPerStop;
    }

    /**
     * Define o valor da propriedade averageCostPerStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageCostPerStop(Double value) {
        this.averageCostPerStop = value;
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
     * Obtém o valor da propriedade totalEquipmentCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalEquipmentCost() {
        return totalEquipmentCost;
    }

    /**
     * Define o valor da propriedade totalEquipmentCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalEquipmentCost(Double value) {
        this.totalEquipmentCost = value;
    }

    /**
     * Obtém o valor da propriedade totalEquipmentDistanceCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalEquipmentDistanceCost() {
        return totalEquipmentDistanceCost;
    }

    /**
     * Define o valor da propriedade totalEquipmentDistanceCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalEquipmentDistanceCost(Double value) {
        this.totalEquipmentDistanceCost = value;
    }

    /**
     * Obtém o valor da propriedade totalEquipmentFixedCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalEquipmentFixedCost() {
        return totalEquipmentFixedCost;
    }

    /**
     * Define o valor da propriedade totalEquipmentFixedCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalEquipmentFixedCost(Double value) {
        this.totalEquipmentFixedCost = value;
    }

    /**
     * Obtém o valor da propriedade totalEquipmentTimeCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalEquipmentTimeCost() {
        return totalEquipmentTimeCost;
    }

    /**
     * Define o valor da propriedade totalEquipmentTimeCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalEquipmentTimeCost(Double value) {
        this.totalEquipmentTimeCost = value;
    }

    /**
     * Obtém o valor da propriedade totalWorkerCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalWorkerCost() {
        return totalWorkerCost;
    }

    /**
     * Define o valor da propriedade totalWorkerCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalWorkerCost(Double value) {
        this.totalWorkerCost = value;
    }

    /**
     * Obtém o valor da propriedade totalWorkerDistanceCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalWorkerDistanceCost() {
        return totalWorkerDistanceCost;
    }

    /**
     * Define o valor da propriedade totalWorkerDistanceCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalWorkerDistanceCost(Double value) {
        this.totalWorkerDistanceCost = value;
    }

    /**
     * Obtém o valor da propriedade totalWorkerFixedCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalWorkerFixedCost() {
        return totalWorkerFixedCost;
    }

    /**
     * Define o valor da propriedade totalWorkerFixedCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalWorkerFixedCost(Double value) {
        this.totalWorkerFixedCost = value;
    }

    /**
     * Obtém o valor da propriedade totalWorkerHourlyCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalWorkerHourlyCost() {
        return totalWorkerHourlyCost;
    }

    /**
     * Define o valor da propriedade totalWorkerHourlyCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalWorkerHourlyCost(Double value) {
        this.totalWorkerHourlyCost = value;
    }

    /**
     * Obtém o valor da propriedade totalWorkerOvertimeCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalWorkerOvertimeCost() {
        return totalWorkerOvertimeCost;
    }

    /**
     * Define o valor da propriedade totalWorkerOvertimeCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalWorkerOvertimeCost(Double value) {
        this.totalWorkerOvertimeCost = value;
    }

    /**
     * Obtém o valor da propriedade totalWorkerPerQuantityCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalWorkerPerQuantityCost() {
        return totalWorkerPerQuantityCost;
    }

    /**
     * Define o valor da propriedade totalWorkerPerQuantityCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalWorkerPerQuantityCost(Double value) {
        this.totalWorkerPerQuantityCost = value;
    }

    /**
     * Obtém o valor da propriedade totalWorkerStopCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalWorkerStopCost() {
        return totalWorkerStopCost;
    }

    /**
     * Define o valor da propriedade totalWorkerStopCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalWorkerStopCost(Double value) {
        this.totalWorkerStopCost = value;
    }

}
