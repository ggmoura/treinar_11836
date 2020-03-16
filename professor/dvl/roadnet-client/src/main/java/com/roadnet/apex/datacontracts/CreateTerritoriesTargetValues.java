
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de CreateTerritoriesTargetValues complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CreateTerritoriesTargetValues"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberOfOrdersPerTerritory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfStopsPerTerritory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfTerritories" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalCycleQuantitySize1PerTerritory" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalCycleQuantitySize2PerTerritory" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalCycleQuantitySize3PerTerritory" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalServiceTimePerTerritory" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateTerritoriesTargetValues", propOrder = {
    "numberOfOrdersPerTerritory",
    "numberOfStopsPerTerritory",
    "numberOfTerritories",
    "totalCycleQuantitySize1PerTerritory",
    "totalCycleQuantitySize2PerTerritory",
    "totalCycleQuantitySize3PerTerritory",
    "totalServiceTimePerTerritory"
})
public class CreateTerritoriesTargetValues
    extends DataTransferObject
{

    @XmlElement(name = "NumberOfOrdersPerTerritory")
    protected Integer numberOfOrdersPerTerritory;
    @XmlElement(name = "NumberOfStopsPerTerritory")
    protected Integer numberOfStopsPerTerritory;
    @XmlElement(name = "NumberOfTerritories")
    protected Integer numberOfTerritories;
    @XmlElement(name = "TotalCycleQuantitySize1PerTerritory")
    protected Double totalCycleQuantitySize1PerTerritory;
    @XmlElement(name = "TotalCycleQuantitySize2PerTerritory")
    protected Double totalCycleQuantitySize2PerTerritory;
    @XmlElement(name = "TotalCycleQuantitySize3PerTerritory")
    protected Double totalCycleQuantitySize3PerTerritory;
    @XmlElement(name = "TotalServiceTimePerTerritory")
    protected Duration totalServiceTimePerTerritory;

    /**
     * Obtém o valor da propriedade numberOfOrdersPerTerritory.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfOrdersPerTerritory() {
        return numberOfOrdersPerTerritory;
    }

    /**
     * Define o valor da propriedade numberOfOrdersPerTerritory.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfOrdersPerTerritory(Integer value) {
        this.numberOfOrdersPerTerritory = value;
    }

    /**
     * Obtém o valor da propriedade numberOfStopsPerTerritory.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfStopsPerTerritory() {
        return numberOfStopsPerTerritory;
    }

    /**
     * Define o valor da propriedade numberOfStopsPerTerritory.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfStopsPerTerritory(Integer value) {
        this.numberOfStopsPerTerritory = value;
    }

    /**
     * Obtém o valor da propriedade numberOfTerritories.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfTerritories() {
        return numberOfTerritories;
    }

    /**
     * Define o valor da propriedade numberOfTerritories.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfTerritories(Integer value) {
        this.numberOfTerritories = value;
    }

    /**
     * Obtém o valor da propriedade totalCycleQuantitySize1PerTerritory.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalCycleQuantitySize1PerTerritory() {
        return totalCycleQuantitySize1PerTerritory;
    }

    /**
     * Define o valor da propriedade totalCycleQuantitySize1PerTerritory.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalCycleQuantitySize1PerTerritory(Double value) {
        this.totalCycleQuantitySize1PerTerritory = value;
    }

    /**
     * Obtém o valor da propriedade totalCycleQuantitySize2PerTerritory.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalCycleQuantitySize2PerTerritory() {
        return totalCycleQuantitySize2PerTerritory;
    }

    /**
     * Define o valor da propriedade totalCycleQuantitySize2PerTerritory.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalCycleQuantitySize2PerTerritory(Double value) {
        this.totalCycleQuantitySize2PerTerritory = value;
    }

    /**
     * Obtém o valor da propriedade totalCycleQuantitySize3PerTerritory.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalCycleQuantitySize3PerTerritory() {
        return totalCycleQuantitySize3PerTerritory;
    }

    /**
     * Define o valor da propriedade totalCycleQuantitySize3PerTerritory.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalCycleQuantitySize3PerTerritory(Double value) {
        this.totalCycleQuantitySize3PerTerritory = value;
    }

    /**
     * Obtém o valor da propriedade totalServiceTimePerTerritory.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalServiceTimePerTerritory() {
        return totalServiceTimePerTerritory;
    }

    /**
     * Define o valor da propriedade totalServiceTimePerTerritory.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalServiceTimePerTerritory(Duration value) {
        this.totalServiceTimePerTerritory = value;
    }

}
