
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DailyRoutingGoals complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DailyRoutingGoals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BasicGoalsMissedTimeWindowFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="BasicGoalsRunTimeBalanceFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CellBoundariesFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MissedTimeWindowEarlyFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MissedTimeWindowLateFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRunTimeFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QuantityBalanceFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RouteClusteringFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RouteTemplateFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RunTimeBalanceFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UseAdvancedGoals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyRoutingGoals", propOrder = {
    "basicGoalsMissedTimeWindowFactor",
    "basicGoalsRunTimeBalanceFactor",
    "cellBoundariesFactor",
    "missedTimeWindowEarlyFactor",
    "missedTimeWindowLateFactor",
    "preferredRunTimeFactor",
    "quantityBalanceFactor",
    "routeClusteringFactor",
    "routeTemplateFactor",
    "runTimeBalanceFactor",
    "useAdvancedGoals"
})
public class DailyRoutingGoals
    extends DataTransferObject
{

    @XmlElement(name = "BasicGoalsMissedTimeWindowFactor")
    protected Double basicGoalsMissedTimeWindowFactor;
    @XmlElement(name = "BasicGoalsRunTimeBalanceFactor")
    protected Double basicGoalsRunTimeBalanceFactor;
    @XmlElement(name = "CellBoundariesFactor")
    protected Double cellBoundariesFactor;
    @XmlElement(name = "MissedTimeWindowEarlyFactor")
    protected Double missedTimeWindowEarlyFactor;
    @XmlElement(name = "MissedTimeWindowLateFactor")
    protected Double missedTimeWindowLateFactor;
    @XmlElement(name = "PreferredRunTimeFactor")
    protected Double preferredRunTimeFactor;
    @XmlElement(name = "QuantityBalanceFactor")
    protected Double quantityBalanceFactor;
    @XmlElement(name = "RouteClusteringFactor")
    protected Double routeClusteringFactor;
    @XmlElement(name = "RouteTemplateFactor")
    protected Double routeTemplateFactor;
    @XmlElement(name = "RunTimeBalanceFactor")
    protected Double runTimeBalanceFactor;
    @XmlElement(name = "UseAdvancedGoals")
    protected Boolean useAdvancedGoals;

    /**
     * Obtém o valor da propriedade basicGoalsMissedTimeWindowFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBasicGoalsMissedTimeWindowFactor() {
        return basicGoalsMissedTimeWindowFactor;
    }

    /**
     * Define o valor da propriedade basicGoalsMissedTimeWindowFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBasicGoalsMissedTimeWindowFactor(Double value) {
        this.basicGoalsMissedTimeWindowFactor = value;
    }

    /**
     * Obtém o valor da propriedade basicGoalsRunTimeBalanceFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBasicGoalsRunTimeBalanceFactor() {
        return basicGoalsRunTimeBalanceFactor;
    }

    /**
     * Define o valor da propriedade basicGoalsRunTimeBalanceFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBasicGoalsRunTimeBalanceFactor(Double value) {
        this.basicGoalsRunTimeBalanceFactor = value;
    }

    /**
     * Obtém o valor da propriedade cellBoundariesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCellBoundariesFactor() {
        return cellBoundariesFactor;
    }

    /**
     * Define o valor da propriedade cellBoundariesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCellBoundariesFactor(Double value) {
        this.cellBoundariesFactor = value;
    }

    /**
     * Obtém o valor da propriedade missedTimeWindowEarlyFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMissedTimeWindowEarlyFactor() {
        return missedTimeWindowEarlyFactor;
    }

    /**
     * Define o valor da propriedade missedTimeWindowEarlyFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMissedTimeWindowEarlyFactor(Double value) {
        this.missedTimeWindowEarlyFactor = value;
    }

    /**
     * Obtém o valor da propriedade missedTimeWindowLateFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMissedTimeWindowLateFactor() {
        return missedTimeWindowLateFactor;
    }

    /**
     * Define o valor da propriedade missedTimeWindowLateFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMissedTimeWindowLateFactor(Double value) {
        this.missedTimeWindowLateFactor = value;
    }

    /**
     * Obtém o valor da propriedade preferredRunTimeFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreferredRunTimeFactor() {
        return preferredRunTimeFactor;
    }

    /**
     * Define o valor da propriedade preferredRunTimeFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreferredRunTimeFactor(Double value) {
        this.preferredRunTimeFactor = value;
    }

    /**
     * Obtém o valor da propriedade quantityBalanceFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityBalanceFactor() {
        return quantityBalanceFactor;
    }

    /**
     * Define o valor da propriedade quantityBalanceFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityBalanceFactor(Double value) {
        this.quantityBalanceFactor = value;
    }

    /**
     * Obtém o valor da propriedade routeClusteringFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRouteClusteringFactor() {
        return routeClusteringFactor;
    }

    /**
     * Define o valor da propriedade routeClusteringFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRouteClusteringFactor(Double value) {
        this.routeClusteringFactor = value;
    }

    /**
     * Obtém o valor da propriedade routeTemplateFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRouteTemplateFactor() {
        return routeTemplateFactor;
    }

    /**
     * Define o valor da propriedade routeTemplateFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRouteTemplateFactor(Double value) {
        this.routeTemplateFactor = value;
    }

    /**
     * Obtém o valor da propriedade runTimeBalanceFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRunTimeBalanceFactor() {
        return runTimeBalanceFactor;
    }

    /**
     * Define o valor da propriedade runTimeBalanceFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRunTimeBalanceFactor(Double value) {
        this.runTimeBalanceFactor = value;
    }

    /**
     * Obtém o valor da propriedade useAdvancedGoals.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseAdvancedGoals() {
        return useAdvancedGoals;
    }

    /**
     * Define o valor da propriedade useAdvancedGoals.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseAdvancedGoals(Boolean value) {
        this.useAdvancedGoals = value;
    }

}
