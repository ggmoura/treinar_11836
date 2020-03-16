
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de MultiDayRoutingOptionsPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MultiDayRoutingOptionsPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Departure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumLayoverDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumLayoverDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MultiDayIsPaid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MultiDayMaxLayovers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MultiDayRoutingIsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RecalculateLayoversAfterRouteCreation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseIndeterminateLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseLayoverLocations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiDayRoutingOptionsPropertyOptions", propOrder = {
    "departure",
    "maximumLayoverDuration",
    "minimumLayoverDuration",
    "multiDayIsPaid",
    "multiDayMaxLayovers",
    "multiDayRoutingIsEnabled",
    "recalculateLayoversAfterRouteCreation",
    "useIndeterminateLocation",
    "useLayoverLocations"
})
public class MultiDayRoutingOptionsPropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "Departure")
    protected Boolean departure;
    @XmlElement(name = "MaximumLayoverDuration")
    protected Boolean maximumLayoverDuration;
    @XmlElement(name = "MinimumLayoverDuration")
    protected Boolean minimumLayoverDuration;
    @XmlElement(name = "MultiDayIsPaid")
    protected Boolean multiDayIsPaid;
    @XmlElement(name = "MultiDayMaxLayovers")
    protected Boolean multiDayMaxLayovers;
    @XmlElement(name = "MultiDayRoutingIsEnabled")
    protected Boolean multiDayRoutingIsEnabled;
    @XmlElement(name = "RecalculateLayoversAfterRouteCreation")
    protected Boolean recalculateLayoversAfterRouteCreation;
    @XmlElement(name = "UseIndeterminateLocation")
    protected Boolean useIndeterminateLocation;
    @XmlElement(name = "UseLayoverLocations")
    protected Boolean useLayoverLocations;

    /**
     * Obtém o valor da propriedade departure.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeparture() {
        return departure;
    }

    /**
     * Define o valor da propriedade departure.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeparture(Boolean value) {
        this.departure = value;
    }

    /**
     * Obtém o valor da propriedade maximumLayoverDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumLayoverDuration() {
        return maximumLayoverDuration;
    }

    /**
     * Define o valor da propriedade maximumLayoverDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumLayoverDuration(Boolean value) {
        this.maximumLayoverDuration = value;
    }

    /**
     * Obtém o valor da propriedade minimumLayoverDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumLayoverDuration() {
        return minimumLayoverDuration;
    }

    /**
     * Define o valor da propriedade minimumLayoverDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumLayoverDuration(Boolean value) {
        this.minimumLayoverDuration = value;
    }

    /**
     * Obtém o valor da propriedade multiDayIsPaid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiDayIsPaid() {
        return multiDayIsPaid;
    }

    /**
     * Define o valor da propriedade multiDayIsPaid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiDayIsPaid(Boolean value) {
        this.multiDayIsPaid = value;
    }

    /**
     * Obtém o valor da propriedade multiDayMaxLayovers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiDayMaxLayovers() {
        return multiDayMaxLayovers;
    }

    /**
     * Define o valor da propriedade multiDayMaxLayovers.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiDayMaxLayovers(Boolean value) {
        this.multiDayMaxLayovers = value;
    }

    /**
     * Obtém o valor da propriedade multiDayRoutingIsEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiDayRoutingIsEnabled() {
        return multiDayRoutingIsEnabled;
    }

    /**
     * Define o valor da propriedade multiDayRoutingIsEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiDayRoutingIsEnabled(Boolean value) {
        this.multiDayRoutingIsEnabled = value;
    }

    /**
     * Obtém o valor da propriedade recalculateLayoversAfterRouteCreation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecalculateLayoversAfterRouteCreation() {
        return recalculateLayoversAfterRouteCreation;
    }

    /**
     * Define o valor da propriedade recalculateLayoversAfterRouteCreation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecalculateLayoversAfterRouteCreation(Boolean value) {
        this.recalculateLayoversAfterRouteCreation = value;
    }

    /**
     * Obtém o valor da propriedade useIndeterminateLocation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseIndeterminateLocation() {
        return useIndeterminateLocation;
    }

    /**
     * Define o valor da propriedade useIndeterminateLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseIndeterminateLocation(Boolean value) {
        this.useIndeterminateLocation = value;
    }

    /**
     * Obtém o valor da propriedade useLayoverLocations.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseLayoverLocations() {
        return useLayoverLocations;
    }

    /**
     * Define o valor da propriedade useLayoverLocations.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLayoverLocations(Boolean value) {
        this.useLayoverLocations = value;
    }

}
