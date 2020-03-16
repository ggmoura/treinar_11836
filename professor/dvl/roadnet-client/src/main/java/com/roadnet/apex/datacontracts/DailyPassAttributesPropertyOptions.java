
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de DailyPassAttributesPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DailyPassAttributesPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutoGenerateOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnforceRouteTemplates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Goals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GoalsOptions" type="{http://roadnet.com/apex/DataContracts/}DailyRoutingGoalsPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="OnlyCreateRoutesFromTemplates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteTemplateSetEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UpdateActivePasses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WeeklyRoutingBalanceDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyPassAttributesPropertyOptions", propOrder = {
    "autoGenerateOrders",
    "enforceRouteTemplates",
    "goals",
    "goalsOptions",
    "onlyCreateRoutesFromTemplates",
    "routeTemplateSetEntityKeys",
    "updateActivePasses",
    "weeklyRoutingBalanceDays"
})
public class DailyPassAttributesPropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "AutoGenerateOrders")
    protected Boolean autoGenerateOrders;
    @XmlElement(name = "EnforceRouteTemplates")
    protected Boolean enforceRouteTemplates;
    @XmlElement(name = "Goals")
    protected Boolean goals;
    @XmlElementRef(name = "GoalsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<DailyRoutingGoalsPropertyOptions> goalsOptions;
    @XmlElement(name = "OnlyCreateRoutesFromTemplates")
    protected Boolean onlyCreateRoutesFromTemplates;
    @XmlElement(name = "RouteTemplateSetEntityKeys")
    protected Boolean routeTemplateSetEntityKeys;
    @XmlElement(name = "UpdateActivePasses")
    protected Boolean updateActivePasses;
    @XmlElement(name = "WeeklyRoutingBalanceDays")
    protected Boolean weeklyRoutingBalanceDays;

    /**
     * Obtém o valor da propriedade autoGenerateOrders.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoGenerateOrders() {
        return autoGenerateOrders;
    }

    /**
     * Define o valor da propriedade autoGenerateOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoGenerateOrders(Boolean value) {
        this.autoGenerateOrders = value;
    }

    /**
     * Obtém o valor da propriedade enforceRouteTemplates.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnforceRouteTemplates() {
        return enforceRouteTemplates;
    }

    /**
     * Define o valor da propriedade enforceRouteTemplates.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnforceRouteTemplates(Boolean value) {
        this.enforceRouteTemplates = value;
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
     *     {@link JAXBElement }{@code <}{@link DailyRoutingGoalsPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<DailyRoutingGoalsPropertyOptions> getGoalsOptions() {
        return goalsOptions;
    }

    /**
     * Define o valor da propriedade goalsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DailyRoutingGoalsPropertyOptions }{@code >}
     *     
     */
    public void setGoalsOptions(JAXBElement<DailyRoutingGoalsPropertyOptions> value) {
        this.goalsOptions = value;
    }

    /**
     * Obtém o valor da propriedade onlyCreateRoutesFromTemplates.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlyCreateRoutesFromTemplates() {
        return onlyCreateRoutesFromTemplates;
    }

    /**
     * Define o valor da propriedade onlyCreateRoutesFromTemplates.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyCreateRoutesFromTemplates(Boolean value) {
        this.onlyCreateRoutesFromTemplates = value;
    }

    /**
     * Obtém o valor da propriedade routeTemplateSetEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteTemplateSetEntityKeys() {
        return routeTemplateSetEntityKeys;
    }

    /**
     * Define o valor da propriedade routeTemplateSetEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteTemplateSetEntityKeys(Boolean value) {
        this.routeTemplateSetEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade updateActivePasses.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateActivePasses() {
        return updateActivePasses;
    }

    /**
     * Define o valor da propriedade updateActivePasses.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateActivePasses(Boolean value) {
        this.updateActivePasses = value;
    }

    /**
     * Obtém o valor da propriedade weeklyRoutingBalanceDays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeeklyRoutingBalanceDays() {
        return weeklyRoutingBalanceDays;
    }

    /**
     * Define o valor da propriedade weeklyRoutingBalanceDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeeklyRoutingBalanceDays(Boolean value) {
        this.weeklyRoutingBalanceDays = value;
    }

}
