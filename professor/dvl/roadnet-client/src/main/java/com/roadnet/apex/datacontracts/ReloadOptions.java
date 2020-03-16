
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ReloadOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReloadOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllConsideredSizesMustMeetMinTripCapacity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AvailableReloadDepotsEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="CapacityReloadThresholdPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="EnableCapacityReloads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableRunTimeReloads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FixedReloadTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="LoadAction_ReloadAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaxRouteQuantity" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="MaximumNumberOfReloads" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MustMeetAllTripMinimums" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReloadAfterLastStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TripMaximumPaidTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TripMinimumPaidTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="TripMinimumPercentOfCapacity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UseDepotServiceTimeForReloadTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseMaxRouteQuantitySize1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseMaxRouteQuantitySize2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseMaxRouteQuantitySize3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseOriginAsReloadDepot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VariableReloadTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReloadOptions", propOrder = {
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
public class ReloadOptions
    extends DataTransferObject
{

    @XmlElement(name = "AllConsideredSizesMustMeetMinTripCapacity")
    protected Boolean allConsideredSizesMustMeetMinTripCapacity;
    @XmlElementRef(name = "AvailableReloadDepotsEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> availableReloadDepotsEntityKeys;
    @XmlElement(name = "CapacityReloadThresholdPercent")
    protected Double capacityReloadThresholdPercent;
    @XmlElement(name = "EnableCapacityReloads")
    protected Boolean enableCapacityReloads;
    @XmlElement(name = "EnableRunTimeReloads")
    protected Boolean enableRunTimeReloads;
    @XmlElement(name = "FixedReloadTime")
    protected Duration fixedReloadTime;
    @XmlElementRef(name = "LoadAction_ReloadAction", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loadActionReloadAction;
    @XmlElementRef(name = "MaxRouteQuantity", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> maxRouteQuantity;
    @XmlElementRef(name = "MaximumNumberOfReloads", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maximumNumberOfReloads;
    @XmlElement(name = "MustMeetAllTripMinimums")
    protected Boolean mustMeetAllTripMinimums;
    @XmlElement(name = "ReloadAfterLastStop")
    protected Boolean reloadAfterLastStop;
    @XmlElement(name = "TripMaximumPaidTime")
    protected Duration tripMaximumPaidTime;
    @XmlElementRef(name = "TripMinimumPaidTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> tripMinimumPaidTime;
    @XmlElementRef(name = "TripMinimumPercentOfCapacity", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> tripMinimumPercentOfCapacity;
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
    protected Duration variableReloadTime;

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
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getAvailableReloadDepotsEntityKeys() {
        return availableReloadDepotsEntityKeys;
    }

    /**
     * Define o valor da propriedade availableReloadDepotsEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setAvailableReloadDepotsEntityKeys(JAXBElement<ArrayOflong> value) {
        this.availableReloadDepotsEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade capacityReloadThresholdPercent.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCapacityReloadThresholdPercent() {
        return capacityReloadThresholdPercent;
    }

    /**
     * Define o valor da propriedade capacityReloadThresholdPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCapacityReloadThresholdPercent(Double value) {
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
     *     {@link Duration }
     *     
     */
    public Duration getFixedReloadTime() {
        return fixedReloadTime;
    }

    /**
     * Define o valor da propriedade fixedReloadTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setFixedReloadTime(Duration value) {
        this.fixedReloadTime = value;
    }

    /**
     * Obtém o valor da propriedade loadActionReloadAction.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoadActionReloadAction() {
        return loadActionReloadAction;
    }

    /**
     * Define o valor da propriedade loadActionReloadAction.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoadActionReloadAction(JAXBElement<String> value) {
        this.loadActionReloadAction = value;
    }

    /**
     * Obtém o valor da propriedade maxRouteQuantity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getMaxRouteQuantity() {
        return maxRouteQuantity;
    }

    /**
     * Define o valor da propriedade maxRouteQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setMaxRouteQuantity(JAXBElement<Quantities> value) {
        this.maxRouteQuantity = value;
    }

    /**
     * Obtém o valor da propriedade maximumNumberOfReloads.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaximumNumberOfReloads() {
        return maximumNumberOfReloads;
    }

    /**
     * Define o valor da propriedade maximumNumberOfReloads.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaximumNumberOfReloads(JAXBElement<Integer> value) {
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
     *     {@link Duration }
     *     
     */
    public Duration getTripMaximumPaidTime() {
        return tripMaximumPaidTime;
    }

    /**
     * Define o valor da propriedade tripMaximumPaidTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTripMaximumPaidTime(Duration value) {
        this.tripMaximumPaidTime = value;
    }

    /**
     * Obtém o valor da propriedade tripMinimumPaidTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTripMinimumPaidTime() {
        return tripMinimumPaidTime;
    }

    /**
     * Define o valor da propriedade tripMinimumPaidTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTripMinimumPaidTime(JAXBElement<Duration> value) {
        this.tripMinimumPaidTime = value;
    }

    /**
     * Obtém o valor da propriedade tripMinimumPercentOfCapacity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTripMinimumPercentOfCapacity() {
        return tripMinimumPercentOfCapacity;
    }

    /**
     * Define o valor da propriedade tripMinimumPercentOfCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTripMinimumPercentOfCapacity(JAXBElement<Double> value) {
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
     *     {@link Duration }
     *     
     */
    public Duration getVariableReloadTime() {
        return variableReloadTime;
    }

    /**
     * Define o valor da propriedade variableReloadTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setVariableReloadTime(Duration value) {
        this.variableReloadTime = value;
    }

}
