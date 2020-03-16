
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
 * <p>Classe Java de WorkerCosts complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WorkerCosts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FixedRouteCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MinDistance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="MinSizeCount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MinTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MinimumStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OvertimeHoursBegin" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="OvertimePayRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PerDistanceRate" type="{http://roadnet.com/apex/DataContracts/}DistanceCost" minOccurs="0"/&gt;
 *         &lt;element name="PerSizeOverMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PerStopRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RegularPayRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkerCosts", propOrder = {
    "fixedRouteCost",
    "minDistance",
    "minSizeCount",
    "minTime",
    "minimumStops",
    "overtimeHoursBegin",
    "overtimePayRate",
    "perDistanceRate",
    "perSizeOverMin",
    "perStopRate",
    "regularPayRate"
})
public class WorkerCosts
    extends DataTransferObject
{

    @XmlElement(name = "FixedRouteCost")
    protected Double fixedRouteCost;
    @XmlElementRef(name = "MinDistance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> minDistance;
    @XmlElement(name = "MinSizeCount")
    protected Double minSizeCount;
    @XmlElement(name = "MinTime")
    protected Duration minTime;
    @XmlElement(name = "MinimumStops")
    protected Integer minimumStops;
    @XmlElement(name = "OvertimeHoursBegin")
    protected Duration overtimeHoursBegin;
    @XmlElement(name = "OvertimePayRate")
    protected Double overtimePayRate;
    @XmlElementRef(name = "PerDistanceRate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceCost> perDistanceRate;
    @XmlElement(name = "PerSizeOverMin")
    protected Double perSizeOverMin;
    @XmlElement(name = "PerStopRate")
    protected Double perStopRate;
    @XmlElement(name = "RegularPayRate")
    protected Double regularPayRate;

    /**
     * Obtém o valor da propriedade fixedRouteCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFixedRouteCost() {
        return fixedRouteCost;
    }

    /**
     * Define o valor da propriedade fixedRouteCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFixedRouteCost(Double value) {
        this.fixedRouteCost = value;
    }

    /**
     * Obtém o valor da propriedade minDistance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getMinDistance() {
        return minDistance;
    }

    /**
     * Define o valor da propriedade minDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setMinDistance(JAXBElement<Distance> value) {
        this.minDistance = value;
    }

    /**
     * Obtém o valor da propriedade minSizeCount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinSizeCount() {
        return minSizeCount;
    }

    /**
     * Define o valor da propriedade minSizeCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinSizeCount(Double value) {
        this.minSizeCount = value;
    }

    /**
     * Obtém o valor da propriedade minTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinTime() {
        return minTime;
    }

    /**
     * Define o valor da propriedade minTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinTime(Duration value) {
        this.minTime = value;
    }

    /**
     * Obtém o valor da propriedade minimumStops.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumStops() {
        return minimumStops;
    }

    /**
     * Define o valor da propriedade minimumStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumStops(Integer value) {
        this.minimumStops = value;
    }

    /**
     * Obtém o valor da propriedade overtimeHoursBegin.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOvertimeHoursBegin() {
        return overtimeHoursBegin;
    }

    /**
     * Define o valor da propriedade overtimeHoursBegin.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOvertimeHoursBegin(Duration value) {
        this.overtimeHoursBegin = value;
    }

    /**
     * Obtém o valor da propriedade overtimePayRate.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOvertimePayRate() {
        return overtimePayRate;
    }

    /**
     * Define o valor da propriedade overtimePayRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOvertimePayRate(Double value) {
        this.overtimePayRate = value;
    }

    /**
     * Obtém o valor da propriedade perDistanceRate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceCost }{@code >}
     *     
     */
    public JAXBElement<DistanceCost> getPerDistanceRate() {
        return perDistanceRate;
    }

    /**
     * Define o valor da propriedade perDistanceRate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceCost }{@code >}
     *     
     */
    public void setPerDistanceRate(JAXBElement<DistanceCost> value) {
        this.perDistanceRate = value;
    }

    /**
     * Obtém o valor da propriedade perSizeOverMin.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPerSizeOverMin() {
        return perSizeOverMin;
    }

    /**
     * Define o valor da propriedade perSizeOverMin.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPerSizeOverMin(Double value) {
        this.perSizeOverMin = value;
    }

    /**
     * Obtém o valor da propriedade perStopRate.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPerStopRate() {
        return perStopRate;
    }

    /**
     * Define o valor da propriedade perStopRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPerStopRate(Double value) {
        this.perStopRate = value;
    }

    /**
     * Obtém o valor da propriedade regularPayRate.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRegularPayRate() {
        return regularPayRate;
    }

    /**
     * Define o valor da propriedade regularPayRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRegularPayRate(Double value) {
        this.regularPayRate = value;
    }

}
