
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de ReloadOptionsPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReloadOptionsPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllConsideredSizesMustMeetMinTripCapacity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AvailableReloadDepotsEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CapacityReloadThresholdPercent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableCapacityReloads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableRunTimeReloads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FixedReloadTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoadAction_ReloadAction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxRouteQuantity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumNumberOfReloads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MustMeetAllTripMinimums" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReloadAfterLastStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TripMaximumPaidTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TripMinimumPaidTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TripMinimumPercentOfCapacity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseDepotServiceTimeForReloadTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseMaxRouteQuantitySize1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseMaxRouteQuantitySize2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseMaxRouteQuantitySize3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseOriginAsReloadDepot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VariableReloadTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReloadOptionsPropertyOptions", propOrder = {
    "allConsideredSizesMustMeetMinTripCapacity",
    "availableReloadDepotsEntityKeys",
    "capacityReloadThresholdPercent",
    "enableCapacityReloads",
    "enableRunTimeReloads",
    "fixedReloadTime",
    "loadActionReloadAction",
    "maxRouteQuantity",
    "maximumNumberOfReloads",
    "mustMeetAllTripMinimums",
    "reloadAfterLastStop",
    "tripMaximumPaidTime",
    "tripMinimumPaidTime",
    "tripMinimumPercentOfCapacity",
    "useDepotServiceTimeForReloadTime",
    "useMaxRouteQuantitySize1",
    "useMaxRouteQuantitySize2",
    "useMaxRouteQuantitySize3",
    "useOriginAsReloadDepot",
    "variableReloadTime"
})
public class ReloadOptionsPropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "AllConsideredSizesMustMeetMinTripCapacity")
    protected Boolean allConsideredSizesMustMeetMinTripCapacity;
    @XmlElement(name = "AvailableReloadDepotsEntityKeys")
    protected Boolean availableReloadDepotsEntityKeys;
    @XmlElement(name = "CapacityReloadThresholdPercent")
    protected Boolean capacityReloadThresholdPercent;
    @XmlElement(name = "EnableCapacityReloads")
    protected Boolean enableCapacityReloads;
    @XmlElement(name = "EnableRunTimeReloads")
    protected Boolean enableRunTimeReloads;
    @XmlElement(name = "FixedReloadTime")
    protected Boolean fixedReloadTime;
    @XmlElement(name = "LoadAction_ReloadAction")
    protected Boolean loadActionReloadAction;
    @XmlElement(name = "MaxRouteQuantity")
    protected Boolean maxRouteQuantity;
    @XmlElement(name = "MaximumNumberOfReloads")
    protected Boolean maximumNumberOfReloads;
    @XmlElement(name = "MustMeetAllTripMinimums")
    protected Boolean mustMeetAllTripMinimums;
    @XmlElement(name = "ReloadAfterLastStop")
    protected Boolean reloadAfterLastStop;
    @XmlElement(name = "TripMaximumPaidTime")
    protected Boolean tripMaximumPaidTime;
    @XmlElement(name = "TripMinimumPaidTime")
    protected Boolean tripMinimumPaidTime;
    @XmlElement(name = "TripMinimumPercentOfCapacity")
    protected Boolean tripMinimumPercentOfCapacity;
    @XmlElement(name = "UseDepotServiceTimeForReloadTime")
    protected Boolean useDepotServiceTimeForReloadTime;
    @XmlElement(name = "UseMaxRouteQuantitySize1")
    protected Boolean useMaxRouteQuantitySize1;
    @XmlElement(name = "UseMaxRouteQuantitySize2")
    protected Boolean useMaxRouteQuantitySize2;
    @XmlElement(name = "UseMaxRouteQuantitySize3")
    protected Boolean useMaxRouteQuantitySize3;
    @XmlElement(name = "UseOriginAsReloadDepot")
    protected Boolean useOriginAsReloadDepot;
    @XmlElement(name = "VariableReloadTime")
    protected Boolean variableReloadTime;

    /**
     * Obtém o valor da propriedade allConsideredSizesMustMeetMinTripCapacity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllConsideredSizesMustMeetMinTripCapacity() {
        return allConsideredSizesMustMeetMinTripCapacity;
    }

    /**
     * Define o valor da propriedade allConsideredSizesMustMeetMinTripCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllConsideredSizesMustMeetMinTripCapacity(Boolean value) {
        this.allConsideredSizesMustMeetMinTripCapacity = value;
    }

    /**
     * Obtém o valor da propriedade availableReloadDepotsEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailableReloadDepotsEntityKeys() {
        return availableReloadDepotsEntityKeys;
    }

    /**
     * Define o valor da propriedade availableReloadDepotsEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailableReloadDepotsEntityKeys(Boolean value) {
        this.availableReloadDepotsEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade capacityReloadThresholdPercent.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCapacityReloadThresholdPercent() {
        return capacityReloadThresholdPercent;
    }

    /**
     * Define o valor da propriedade capacityReloadThresholdPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCapacityReloadThresholdPercent(Boolean value) {
        this.capacityReloadThresholdPercent = value;
    }

    /**
     * Obtém o valor da propriedade enableCapacityReloads.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableCapacityReloads() {
        return enableCapacityReloads;
    }

    /**
     * Define o valor da propriedade enableCapacityReloads.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableCapacityReloads(Boolean value) {
        this.enableCapacityReloads = value;
    }

    /**
     * Obtém o valor da propriedade enableRunTimeReloads.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableRunTimeReloads() {
        return enableRunTimeReloads;
    }

    /**
     * Define o valor da propriedade enableRunTimeReloads.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableRunTimeReloads(Boolean value) {
        this.enableRunTimeReloads = value;
    }

    /**
     * Obtém o valor da propriedade fixedReloadTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixedReloadTime() {
        return fixedReloadTime;
    }

    /**
     * Define o valor da propriedade fixedReloadTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedReloadTime(Boolean value) {
        this.fixedReloadTime = value;
    }

    /**
     * Obtém o valor da propriedade loadActionReloadAction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoadActionReloadAction() {
        return loadActionReloadAction;
    }

    /**
     * Define o valor da propriedade loadActionReloadAction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoadActionReloadAction(Boolean value) {
        this.loadActionReloadAction = value;
    }

    /**
     * Obtém o valor da propriedade maxRouteQuantity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxRouteQuantity() {
        return maxRouteQuantity;
    }

    /**
     * Define o valor da propriedade maxRouteQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxRouteQuantity(Boolean value) {
        this.maxRouteQuantity = value;
    }

    /**
     * Obtém o valor da propriedade maximumNumberOfReloads.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumNumberOfReloads() {
        return maximumNumberOfReloads;
    }

    /**
     * Define o valor da propriedade maximumNumberOfReloads.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumNumberOfReloads(Boolean value) {
        this.maximumNumberOfReloads = value;
    }

    /**
     * Obtém o valor da propriedade mustMeetAllTripMinimums.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustMeetAllTripMinimums() {
        return mustMeetAllTripMinimums;
    }

    /**
     * Define o valor da propriedade mustMeetAllTripMinimums.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustMeetAllTripMinimums(Boolean value) {
        this.mustMeetAllTripMinimums = value;
    }

    /**
     * Obtém o valor da propriedade reloadAfterLastStop.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReloadAfterLastStop() {
        return reloadAfterLastStop;
    }

    /**
     * Define o valor da propriedade reloadAfterLastStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReloadAfterLastStop(Boolean value) {
        this.reloadAfterLastStop = value;
    }

    /**
     * Obtém o valor da propriedade tripMaximumPaidTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTripMaximumPaidTime() {
        return tripMaximumPaidTime;
    }

    /**
     * Define o valor da propriedade tripMaximumPaidTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTripMaximumPaidTime(Boolean value) {
        this.tripMaximumPaidTime = value;
    }

    /**
     * Obtém o valor da propriedade tripMinimumPaidTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTripMinimumPaidTime() {
        return tripMinimumPaidTime;
    }

    /**
     * Define o valor da propriedade tripMinimumPaidTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTripMinimumPaidTime(Boolean value) {
        this.tripMinimumPaidTime = value;
    }

    /**
     * Obtém o valor da propriedade tripMinimumPercentOfCapacity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTripMinimumPercentOfCapacity() {
        return tripMinimumPercentOfCapacity;
    }

    /**
     * Define o valor da propriedade tripMinimumPercentOfCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTripMinimumPercentOfCapacity(Boolean value) {
        this.tripMinimumPercentOfCapacity = value;
    }

    /**
     * Obtém o valor da propriedade useDepotServiceTimeForReloadTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDepotServiceTimeForReloadTime() {
        return useDepotServiceTimeForReloadTime;
    }

    /**
     * Define o valor da propriedade useDepotServiceTimeForReloadTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDepotServiceTimeForReloadTime(Boolean value) {
        this.useDepotServiceTimeForReloadTime = value;
    }

    /**
     * Obtém o valor da propriedade useMaxRouteQuantitySize1.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseMaxRouteQuantitySize1() {
        return useMaxRouteQuantitySize1;
    }

    /**
     * Define o valor da propriedade useMaxRouteQuantitySize1.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseMaxRouteQuantitySize1(Boolean value) {
        this.useMaxRouteQuantitySize1 = value;
    }

    /**
     * Obtém o valor da propriedade useMaxRouteQuantitySize2.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseMaxRouteQuantitySize2() {
        return useMaxRouteQuantitySize2;
    }

    /**
     * Define o valor da propriedade useMaxRouteQuantitySize2.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseMaxRouteQuantitySize2(Boolean value) {
        this.useMaxRouteQuantitySize2 = value;
    }

    /**
     * Obtém o valor da propriedade useMaxRouteQuantitySize3.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseMaxRouteQuantitySize3() {
        return useMaxRouteQuantitySize3;
    }

    /**
     * Define o valor da propriedade useMaxRouteQuantitySize3.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseMaxRouteQuantitySize3(Boolean value) {
        this.useMaxRouteQuantitySize3 = value;
    }

    /**
     * Obtém o valor da propriedade useOriginAsReloadDepot.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseOriginAsReloadDepot() {
        return useOriginAsReloadDepot;
    }

    /**
     * Define o valor da propriedade useOriginAsReloadDepot.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseOriginAsReloadDepot(Boolean value) {
        this.useOriginAsReloadDepot = value;
    }

    /**
     * Obtém o valor da propriedade variableReloadTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVariableReloadTime() {
        return variableReloadTime;
    }

    /**
     * Define o valor da propriedade variableReloadTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVariableReloadTime(Boolean value) {
        this.variableReloadTime = value;
    }

}
