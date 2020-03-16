
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;
import org.datacontract.schemas._2004._07.system.ArrayOfNullableOfduration;
import org.datacontract.schemas._2004._07.system.ArrayOfNullableOflong;


/**
 * <p>Classe Java de StrategicPassAttributes complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StrategicPassAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DailyLoadPercentages" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfNullableOflong" minOccurs="0"/&gt;
 *         &lt;element name="Goals" type="{http://roadnet.com/apex/DataContracts/}StrategicRoutingGoals" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreDayAnchoring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreWeekAnchoring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumRunTimeOverrideByDayOfWeek" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfNullableOfduration" minOccurs="0"/&gt;
 *         &lt;element name="MaximumTravelTimeOverrideByDayOfWeek" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfNullableOfduration" minOccurs="0"/&gt;
 *         &lt;element name="PreferredRunTimeOverrideByDayOfWeek" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfNullableOfduration" minOccurs="0"/&gt;
 *         &lt;element name="RouteBalancingSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StartTimeOverrideByDayOfWeek" type="{http://schemas.datacontract.org/2004/07/System}ArrayOfNullableOfduration" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryLayoutMethod_RouteCreationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategicPassAttributes", propOrder = {
    "dailyLoadPercentages",
    "goals",
    "ignoreDayAnchoring",
    "ignoreWeekAnchoring",
    "maximumRunTimeOverrideByDayOfWeek",
    "maximumTravelTimeOverrideByDayOfWeek",
    "preferredRunTimeOverrideByDayOfWeek",
    "routeBalancingSize",
    "startTimeOverrideByDayOfWeek",
    "territoryLayoutMethodRouteCreationMethod"
})
public class StrategicPassAttributes
    extends DataTransferObject
{

    @XmlElementRef(name = "DailyLoadPercentages", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNullableOflong> dailyLoadPercentages;
    @XmlElementRef(name = "Goals", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<StrategicRoutingGoals> goals;
    @XmlElement(name = "IgnoreDayAnchoring")
    protected Boolean ignoreDayAnchoring;
    @XmlElement(name = "IgnoreWeekAnchoring")
    protected Boolean ignoreWeekAnchoring;
    @XmlElementRef(name = "MaximumRunTimeOverrideByDayOfWeek", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNullableOfduration> maximumRunTimeOverrideByDayOfWeek;
    @XmlElementRef(name = "MaximumTravelTimeOverrideByDayOfWeek", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNullableOfduration> maximumTravelTimeOverrideByDayOfWeek;
    @XmlElementRef(name = "PreferredRunTimeOverrideByDayOfWeek", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNullableOfduration> preferredRunTimeOverrideByDayOfWeek;
    @XmlElementRef(name = "RouteBalancingSize", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> routeBalancingSize;
    @XmlElementRef(name = "StartTimeOverrideByDayOfWeek", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNullableOfduration> startTimeOverrideByDayOfWeek;
    @XmlElementRef(name = "TerritoryLayoutMethod_RouteCreationMethod", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> territoryLayoutMethodRouteCreationMethod;

    /**
     * Obtém o valor da propriedade dailyLoadPercentages.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNullableOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNullableOflong> getDailyLoadPercentages() {
        return dailyLoadPercentages;
    }

    /**
     * Define o valor da propriedade dailyLoadPercentages.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNullableOflong }{@code >}
     *     
     */
    public void setDailyLoadPercentages(JAXBElement<ArrayOfNullableOflong> value) {
        this.dailyLoadPercentages = value;
    }

    /**
     * Obtém o valor da propriedade goals.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StrategicRoutingGoals }{@code >}
     *     
     */
    public JAXBElement<StrategicRoutingGoals> getGoals() {
        return goals;
    }

    /**
     * Define o valor da propriedade goals.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StrategicRoutingGoals }{@code >}
     *     
     */
    public void setGoals(JAXBElement<StrategicRoutingGoals> value) {
        this.goals = value;
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfNullableOfduration }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNullableOfduration> getMaximumRunTimeOverrideByDayOfWeek() {
        return maximumRunTimeOverrideByDayOfWeek;
    }

    /**
     * Define o valor da propriedade maximumRunTimeOverrideByDayOfWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNullableOfduration }{@code >}
     *     
     */
    public void setMaximumRunTimeOverrideByDayOfWeek(JAXBElement<ArrayOfNullableOfduration> value) {
        this.maximumRunTimeOverrideByDayOfWeek = value;
    }

    /**
     * Obtém o valor da propriedade maximumTravelTimeOverrideByDayOfWeek.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNullableOfduration }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNullableOfduration> getMaximumTravelTimeOverrideByDayOfWeek() {
        return maximumTravelTimeOverrideByDayOfWeek;
    }

    /**
     * Define o valor da propriedade maximumTravelTimeOverrideByDayOfWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNullableOfduration }{@code >}
     *     
     */
    public void setMaximumTravelTimeOverrideByDayOfWeek(JAXBElement<ArrayOfNullableOfduration> value) {
        this.maximumTravelTimeOverrideByDayOfWeek = value;
    }

    /**
     * Obtém o valor da propriedade preferredRunTimeOverrideByDayOfWeek.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNullableOfduration }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNullableOfduration> getPreferredRunTimeOverrideByDayOfWeek() {
        return preferredRunTimeOverrideByDayOfWeek;
    }

    /**
     * Define o valor da propriedade preferredRunTimeOverrideByDayOfWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNullableOfduration }{@code >}
     *     
     */
    public void setPreferredRunTimeOverrideByDayOfWeek(JAXBElement<ArrayOfNullableOfduration> value) {
        this.preferredRunTimeOverrideByDayOfWeek = value;
    }

    /**
     * Obtém o valor da propriedade routeBalancingSize.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRouteBalancingSize() {
        return routeBalancingSize;
    }

    /**
     * Define o valor da propriedade routeBalancingSize.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRouteBalancingSize(JAXBElement<Integer> value) {
        this.routeBalancingSize = value;
    }

    /**
     * Obtém o valor da propriedade startTimeOverrideByDayOfWeek.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNullableOfduration }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNullableOfduration> getStartTimeOverrideByDayOfWeek() {
        return startTimeOverrideByDayOfWeek;
    }

    /**
     * Define o valor da propriedade startTimeOverrideByDayOfWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNullableOfduration }{@code >}
     *     
     */
    public void setStartTimeOverrideByDayOfWeek(JAXBElement<ArrayOfNullableOfduration> value) {
        this.startTimeOverrideByDayOfWeek = value;
    }

    /**
     * Obtém o valor da propriedade territoryLayoutMethodRouteCreationMethod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTerritoryLayoutMethodRouteCreationMethod() {
        return territoryLayoutMethodRouteCreationMethod;
    }

    /**
     * Define o valor da propriedade territoryLayoutMethodRouteCreationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTerritoryLayoutMethodRouteCreationMethod(JAXBElement<String> value) {
        this.territoryLayoutMethodRouteCreationMethod = value;
    }

}
