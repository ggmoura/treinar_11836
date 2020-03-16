
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DailyPassAttributes complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DailyPassAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutoGenerateOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnforceRouteTemplates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Goals" type="{http://roadnet.com/apex/DataContracts/}DailyRoutingGoals" minOccurs="0"/&gt;
 *         &lt;element name="OnlyCreateRoutesFromTemplates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteTemplateSetEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
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
@XmlType(name = "DailyPassAttributes", propOrder = {
    "autoGenerateOrders",
    "enforceRouteTemplates",
    "goals",
    "onlyCreateRoutesFromTemplates",
    "routeTemplateSetEntityKeys",
    "updateActivePasses",
    "weeklyRoutingBalanceDays"
})
public class DailyPassAttributes
    extends DataTransferObject
{

    @XmlElement(name = "AutoGenerateOrders")
    protected Boolean autoGenerateOrders;
    @XmlElement(name = "EnforceRouteTemplates")
    protected Boolean enforceRouteTemplates;
    @XmlElementRef(name = "Goals", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<DailyRoutingGoals> goals;
    @XmlElement(name = "OnlyCreateRoutesFromTemplates")
    protected Boolean onlyCreateRoutesFromTemplates;
    @XmlElementRef(name = "RouteTemplateSetEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> routeTemplateSetEntityKeys;
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
     *     {@link JAXBElement }{@code <}{@link DailyRoutingGoals }{@code >}
     *     
     */
    public JAXBElement<DailyRoutingGoals> getGoals() {
        return goals;
    }

    /**
     * Define o valor da propriedade goals.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DailyRoutingGoals }{@code >}
     *     
     */
    public void setGoals(JAXBElement<DailyRoutingGoals> value) {
        this.goals = value;
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
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getRouteTemplateSetEntityKeys() {
        return routeTemplateSetEntityKeys;
    }

    /**
     * Define o valor da propriedade routeTemplateSetEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setRouteTemplateSetEntityKeys(JAXBElement<ArrayOflong> value) {
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
