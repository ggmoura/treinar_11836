
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de StrategicPassAttributesPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StrategicPassAttributesPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DailyLoadPercentages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Goals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GoalsOptions" type="{http://roadnet.com/apex/DataContracts/}StrategicRoutingGoalsPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreDayAnchoring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreWeekAnchoring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumRunTimeOverrideByDayOfWeek" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumTravelTimeOverrideByDayOfWeek" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRunTimeOverrideByDayOfWeek" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteBalancingSize" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartTimeOverrideByDayOfWeek" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryLayoutMethod_RouteCreationMethod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategicPassAttributesPropertyOptions", propOrder = {
    "dailyLoadPercentages",
    "goals",
    "goalsOptions",
    "ignoreDayAnchoring",
    "ignoreWeekAnchoring",
    "maximumRunTimeOverrideByDayOfWeek",
    "maximumTravelTimeOverrideByDayOfWeek",
    "preferredRunTimeOverrideByDayOfWeek",
    "routeBalancingSize",
    "startTimeOverrideByDayOfWeek",
    "territoryLayoutMethodRouteCreationMethod"
})
public class StrategicPassAttributesPropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "DailyLoadPercentages")
    protected Boolean dailyLoadPercentages;
    @XmlElement(name = "Goals")
    protected Boolean goals;
    @XmlElementRef(name = "GoalsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<StrategicRoutingGoalsPropertyOptions> goalsOptions;
    @XmlElement(name = "IgnoreDayAnchoring")
    protected Boolean ignoreDayAnchoring;
    @XmlElement(name = "IgnoreWeekAnchoring")
    protected Boolean ignoreWeekAnchoring;
    @XmlElement(name = "MaximumRunTimeOverrideByDayOfWeek")
    protected Boolean maximumRunTimeOverrideByDayOfWeek;
    @XmlElement(name = "MaximumTravelTimeOverrideByDayOfWeek")
    protected Boolean maximumTravelTimeOverrideByDayOfWeek;
    @XmlElement(name = "PreferredRunTimeOverrideByDayOfWeek")
    protected Boolean preferredRunTimeOverrideByDayOfWeek;
    @XmlElement(name = "RouteBalancingSize")
    protected Boolean routeBalancingSize;
    @XmlElement(name = "StartTimeOverrideByDayOfWeek")
    protected Boolean startTimeOverrideByDayOfWeek;
    @XmlElement(name = "TerritoryLayoutMethod_RouteCreationMethod")
    protected Boolean territoryLayoutMethodRouteCreationMethod;

    /**
     * Obtém o valor da propriedade dailyLoadPercentages.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDailyLoadPercentages() {
        return dailyLoadPercentages;
    }

    /**
     * Define o valor da propriedade dailyLoadPercentages.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDailyLoadPercentages(Boolean value) {
        this.dailyLoadPercentages = value;
    }

    /**
     * Obtém o valor da propriedade goals.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoals() {
        return goals;
    }

    /**
     * Define o valor da propriedade goals.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoals(Boolean value) {
        this.goals = value;
    }

    /**
     * Obtém o valor da propriedade goalsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StrategicRoutingGoalsPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<StrategicRoutingGoalsPropertyOptions> getGoalsOptions() {
        return goalsOptions;
    }

    /**
     * Define o valor da propriedade goalsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StrategicRoutingGoalsPropertyOptions }{@code >}
     *     
     */
    public void setGoalsOptions(JAXBElement<StrategicRoutingGoalsPropertyOptions> value) {
        this.goalsOptions = value;
    }

    /**
     * Obtém o valor da propriedade ignoreDayAnchoring.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreDayAnchoring() {
        return ignoreDayAnchoring;
    }

    /**
     * Define o valor da propriedade ignoreDayAnchoring.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreDayAnchoring(Boolean value) {
        this.ignoreDayAnchoring = value;
    }

    /**
     * Obtém o valor da propriedade ignoreWeekAnchoring.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreWeekAnchoring() {
        return ignoreWeekAnchoring;
    }

    /**
     * Define o valor da propriedade ignoreWeekAnchoring.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreWeekAnchoring(Boolean value) {
        this.ignoreWeekAnchoring = value;
    }

    /**
     * Obtém o valor da propriedade maximumRunTimeOverrideByDayOfWeek.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumRunTimeOverrideByDayOfWeek() {
        return maximumRunTimeOverrideByDayOfWeek;
    }

    /**
     * Define o valor da propriedade maximumRunTimeOverrideByDayOfWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumRunTimeOverrideByDayOfWeek(Boolean value) {
        this.maximumRunTimeOverrideByDayOfWeek = value;
    }

    /**
     * Obtém o valor da propriedade maximumTravelTimeOverrideByDayOfWeek.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumTravelTimeOverrideByDayOfWeek() {
        return maximumTravelTimeOverrideByDayOfWeek;
    }

    /**
     * Define o valor da propriedade maximumTravelTimeOverrideByDayOfWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumTravelTimeOverrideByDayOfWeek(Boolean value) {
        this.maximumTravelTimeOverrideByDayOfWeek = value;
    }

    /**
     * Obtém o valor da propriedade preferredRunTimeOverrideByDayOfWeek.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredRunTimeOverrideByDayOfWeek() {
        return preferredRunTimeOverrideByDayOfWeek;
    }

    /**
     * Define o valor da propriedade preferredRunTimeOverrideByDayOfWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredRunTimeOverrideByDayOfWeek(Boolean value) {
        this.preferredRunTimeOverrideByDayOfWeek = value;
    }

    /**
     * Obtém o valor da propriedade routeBalancingSize.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteBalancingSize() {
        return routeBalancingSize;
    }

    /**
     * Define o valor da propriedade routeBalancingSize.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteBalancingSize(Boolean value) {
        this.routeBalancingSize = value;
    }

    /**
     * Obtém o valor da propriedade startTimeOverrideByDayOfWeek.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartTimeOverrideByDayOfWeek() {
        return startTimeOverrideByDayOfWeek;
    }

    /**
     * Define o valor da propriedade startTimeOverrideByDayOfWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartTimeOverrideByDayOfWeek(Boolean value) {
        this.startTimeOverrideByDayOfWeek = value;
    }

    /**
     * Obtém o valor da propriedade territoryLayoutMethodRouteCreationMethod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTerritoryLayoutMethodRouteCreationMethod() {
        return territoryLayoutMethodRouteCreationMethod;
    }

    /**
     * Define o valor da propriedade territoryLayoutMethodRouteCreationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerritoryLayoutMethodRouteCreationMethod(Boolean value) {
        this.territoryLayoutMethodRouteCreationMethod = value;
    }

}
