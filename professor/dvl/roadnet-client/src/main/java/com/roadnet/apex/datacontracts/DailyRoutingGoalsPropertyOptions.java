
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de DailyRoutingGoalsPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DailyRoutingGoalsPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BasicGoalsMissedTimeWindowFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BasicGoalsRunTimeBalanceFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CellBoundariesFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MissedTimeWindowEarlyFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MissedTimeWindowLateFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRunTimeFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QuantityBalanceFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteClusteringFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteTemplateFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RunTimeBalanceFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "DailyRoutingGoalsPropertyOptions", propOrder = {
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
public class DailyRoutingGoalsPropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "BasicGoalsMissedTimeWindowFactor")
    protected Boolean basicGoalsMissedTimeWindowFactor;
    @XmlElement(name = "BasicGoalsRunTimeBalanceFactor")
    protected Boolean basicGoalsRunTimeBalanceFactor;
    @XmlElement(name = "CellBoundariesFactor")
    protected Boolean cellBoundariesFactor;
    @XmlElement(name = "MissedTimeWindowEarlyFactor")
    protected Boolean missedTimeWindowEarlyFactor;
    @XmlElement(name = "MissedTimeWindowLateFactor")
    protected Boolean missedTimeWindowLateFactor;
    @XmlElement(name = "PreferredRunTimeFactor")
    protected Boolean preferredRunTimeFactor;
    @XmlElement(name = "QuantityBalanceFactor")
    protected Boolean quantityBalanceFactor;
    @XmlElement(name = "RouteClusteringFactor")
    protected Boolean routeClusteringFactor;
    @XmlElement(name = "RouteTemplateFactor")
    protected Boolean routeTemplateFactor;
    @XmlElement(name = "RunTimeBalanceFactor")
    protected Boolean runTimeBalanceFactor;
    @XmlElement(name = "UseAdvancedGoals")
    protected Boolean useAdvancedGoals;

    /**
     * Obtém o valor da propriedade basicGoalsMissedTimeWindowFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBasicGoalsMissedTimeWindowFactor() {
        return basicGoalsMissedTimeWindowFactor;
    }

    /**
     * Define o valor da propriedade basicGoalsMissedTimeWindowFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBasicGoalsMissedTimeWindowFactor(Boolean value) {
        this.basicGoalsMissedTimeWindowFactor = value;
    }

    /**
     * Obtém o valor da propriedade basicGoalsRunTimeBalanceFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBasicGoalsRunTimeBalanceFactor() {
        return basicGoalsRunTimeBalanceFactor;
    }

    /**
     * Define o valor da propriedade basicGoalsRunTimeBalanceFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBasicGoalsRunTimeBalanceFactor(Boolean value) {
        this.basicGoalsRunTimeBalanceFactor = value;
    }

    /**
     * Obtém o valor da propriedade cellBoundariesFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCellBoundariesFactor() {
        return cellBoundariesFactor;
    }

    /**
     * Define o valor da propriedade cellBoundariesFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCellBoundariesFactor(Boolean value) {
        this.cellBoundariesFactor = value;
    }

    /**
     * Obtém o valor da propriedade missedTimeWindowEarlyFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMissedTimeWindowEarlyFactor() {
        return missedTimeWindowEarlyFactor;
    }

    /**
     * Define o valor da propriedade missedTimeWindowEarlyFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMissedTimeWindowEarlyFactor(Boolean value) {
        this.missedTimeWindowEarlyFactor = value;
    }

    /**
     * Obtém o valor da propriedade missedTimeWindowLateFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMissedTimeWindowLateFactor() {
        return missedTimeWindowLateFactor;
    }

    /**
     * Define o valor da propriedade missedTimeWindowLateFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMissedTimeWindowLateFactor(Boolean value) {
        this.missedTimeWindowLateFactor = value;
    }

    /**
     * Obtém o valor da propriedade preferredRunTimeFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredRunTimeFactor() {
        return preferredRunTimeFactor;
    }

    /**
     * Define o valor da propriedade preferredRunTimeFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredRunTimeFactor(Boolean value) {
        this.preferredRunTimeFactor = value;
    }

    /**
     * Obtém o valor da propriedade quantityBalanceFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantityBalanceFactor() {
        return quantityBalanceFactor;
    }

    /**
     * Define o valor da propriedade quantityBalanceFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantityBalanceFactor(Boolean value) {
        this.quantityBalanceFactor = value;
    }

    /**
     * Obtém o valor da propriedade routeClusteringFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteClusteringFactor() {
        return routeClusteringFactor;
    }

    /**
     * Define o valor da propriedade routeClusteringFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteClusteringFactor(Boolean value) {
        this.routeClusteringFactor = value;
    }

    /**
     * Obtém o valor da propriedade routeTemplateFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteTemplateFactor() {
        return routeTemplateFactor;
    }

    /**
     * Define o valor da propriedade routeTemplateFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteTemplateFactor(Boolean value) {
        this.routeTemplateFactor = value;
    }

    /**
     * Obtém o valor da propriedade runTimeBalanceFactor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRunTimeBalanceFactor() {
        return runTimeBalanceFactor;
    }

    /**
     * Define o valor da propriedade runTimeBalanceFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRunTimeBalanceFactor(Boolean value) {
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
