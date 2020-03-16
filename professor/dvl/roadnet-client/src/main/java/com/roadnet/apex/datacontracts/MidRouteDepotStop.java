
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de MidRouteDepotStop complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MidRouteDepotStop"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}Stop"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DepotAddress" type="{http://roadnet.com/apex/DataContracts/}Address" minOccurs="0"/&gt;
 *         &lt;element name="DepotCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="DepotDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DepotIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepotServiceAreaOverride" type="{http://roadnet.com/apex/DataContracts/}ServiceAreaBase" minOccurs="0"/&gt;
 *         &lt;element name="DepotServiceRadiusOverride" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAccuracy_DepotGeocodeAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAttentionReason_DepotGeocodeAttentionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeMethod_DepotGeocodeMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LoadAction_LoadAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlannedRunningQuantityAfter" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="ReloadTimeOverride" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="RunningQuantityAfter" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalPickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedDeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalPlannedPickupQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MidRouteDepotStop", propOrder = {
    "cellEntityKey",
    "depotAddress",
    "depotCoordinate",
    "depotDescription",
    "depotEntityKey",
    "depotIdentifier",
    "depotServiceAreaOverride",
    "depotServiceRadiusOverride",
    "geocodeAccuracyDepotGeocodeAccuracy",
    "geocodeAttentionReasonDepotGeocodeAttentionReason",
    "geocodeMethodDepotGeocodeMethod",
    "loadActionLoadAction",
    "plannedRunningQuantityAfter",
    "reloadTimeOverride",
    "runningQuantityAfter",
    "totalDeliveryQuantities",
    "totalFee",
    "totalPickupQuantities",
    "totalPlannedDeliveryQuantities",
    "totalPlannedFee",
    "totalPlannedPickupQuantities"
})
public class MidRouteDepotStop
    extends Stop
{

    @XmlElementRef(name = "CellEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> cellEntityKey;
    @XmlElementRef(name = "DepotAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> depotAddress;
    @XmlElementRef(name = "DepotCoordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> depotCoordinate;
    @XmlElementRef(name = "DepotDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depotDescription;
    @XmlElement(name = "DepotEntityKey")
    protected Long depotEntityKey;
    @XmlElementRef(name = "DepotIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depotIdentifier;
    @XmlElementRef(name = "DepotServiceAreaOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceAreaBase> depotServiceAreaOverride;
    @XmlElementRef(name = "DepotServiceRadiusOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> depotServiceRadiusOverride;
    @XmlElementRef(name = "GeocodeAccuracy_DepotGeocodeAccuracy", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geocodeAccuracyDepotGeocodeAccuracy;
    @XmlElementRef(name = "GeocodeAttentionReason_DepotGeocodeAttentionReason", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geocodeAttentionReasonDepotGeocodeAttentionReason;
    @XmlElementRef(name = "GeocodeMethod_DepotGeocodeMethod", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geocodeMethodDepotGeocodeMethod;
    @XmlElementRef(name = "LoadAction_LoadAction", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loadActionLoadAction;
    @XmlElementRef(name = "PlannedRunningQuantityAfter", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedRunningQuantityAfter;
    @XmlElementRef(name = "ReloadTimeOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> reloadTimeOverride;
    @XmlElementRef(name = "RunningQuantityAfter", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> runningQuantityAfter;
    @XmlElementRef(name = "TotalDeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalDeliveryQuantities;
    @XmlElementRef(name = "TotalFee", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalFee;
    @XmlElementRef(name = "TotalPickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPickupQuantities;
    @XmlElementRef(name = "TotalPlannedDeliveryQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPlannedDeliveryQuantities;
    @XmlElementRef(name = "TotalPlannedFee", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalPlannedFee;
    @XmlElementRef(name = "TotalPlannedPickupQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> totalPlannedPickupQuantities;

    /**
     * Obtém o valor da propriedade cellEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCellEntityKey() {
        return cellEntityKey;
    }

    /**
     * Define o valor da propriedade cellEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCellEntityKey(JAXBElement<Long> value) {
        this.cellEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade depotAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getDepotAddress() {
        return depotAddress;
    }

    /**
     * Define o valor da propriedade depotAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setDepotAddress(JAXBElement<Address> value) {
        this.depotAddress = value;
    }

    /**
     * Obtém o valor da propriedade depotCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getDepotCoordinate() {
        return depotCoordinate;
    }

    /**
     * Define o valor da propriedade depotCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setDepotCoordinate(JAXBElement<Coordinate> value) {
        this.depotCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade depotDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepotDescription() {
        return depotDescription;
    }

    /**
     * Define o valor da propriedade depotDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepotDescription(JAXBElement<String> value) {
        this.depotDescription = value;
    }

    /**
     * Obtém o valor da propriedade depotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDepotEntityKey() {
        return depotEntityKey;
    }

    /**
     * Define o valor da propriedade depotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDepotEntityKey(Long value) {
        this.depotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade depotIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepotIdentifier() {
        return depotIdentifier;
    }

    /**
     * Define o valor da propriedade depotIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepotIdentifier(JAXBElement<String> value) {
        this.depotIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade depotServiceAreaOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceAreaBase }{@code >}
     *     
     */
    public JAXBElement<ServiceAreaBase> getDepotServiceAreaOverride() {
        return depotServiceAreaOverride;
    }

    /**
     * Define o valor da propriedade depotServiceAreaOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceAreaBase }{@code >}
     *     
     */
    public void setDepotServiceAreaOverride(JAXBElement<ServiceAreaBase> value) {
        this.depotServiceAreaOverride = value;
    }

    /**
     * Obtém o valor da propriedade depotServiceRadiusOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDepotServiceRadiusOverride() {
        return depotServiceRadiusOverride;
    }

    /**
     * Define o valor da propriedade depotServiceRadiusOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDepotServiceRadiusOverride(JAXBElement<Distance> value) {
        this.depotServiceRadiusOverride = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAccuracyDepotGeocodeAccuracy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeocodeAccuracyDepotGeocodeAccuracy() {
        return geocodeAccuracyDepotGeocodeAccuracy;
    }

    /**
     * Define o valor da propriedade geocodeAccuracyDepotGeocodeAccuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeocodeAccuracyDepotGeocodeAccuracy(JAXBElement<String> value) {
        this.geocodeAccuracyDepotGeocodeAccuracy = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAttentionReasonDepotGeocodeAttentionReason.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeocodeAttentionReasonDepotGeocodeAttentionReason() {
        return geocodeAttentionReasonDepotGeocodeAttentionReason;
    }

    /**
     * Define o valor da propriedade geocodeAttentionReasonDepotGeocodeAttentionReason.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeocodeAttentionReasonDepotGeocodeAttentionReason(JAXBElement<String> value) {
        this.geocodeAttentionReasonDepotGeocodeAttentionReason = value;
    }

    /**
     * Obtém o valor da propriedade geocodeMethodDepotGeocodeMethod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeocodeMethodDepotGeocodeMethod() {
        return geocodeMethodDepotGeocodeMethod;
    }

    /**
     * Define o valor da propriedade geocodeMethodDepotGeocodeMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeocodeMethodDepotGeocodeMethod(JAXBElement<String> value) {
        this.geocodeMethodDepotGeocodeMethod = value;
    }

    /**
     * Obtém o valor da propriedade loadActionLoadAction.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoadActionLoadAction() {
        return loadActionLoadAction;
    }

    /**
     * Define o valor da propriedade loadActionLoadAction.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoadActionLoadAction(JAXBElement<String> value) {
        this.loadActionLoadAction = value;
    }

    /**
     * Obtém o valor da propriedade plannedRunningQuantityAfter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedRunningQuantityAfter() {
        return plannedRunningQuantityAfter;
    }

    /**
     * Define o valor da propriedade plannedRunningQuantityAfter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedRunningQuantityAfter(JAXBElement<Quantities> value) {
        this.plannedRunningQuantityAfter = value;
    }

    /**
     * Obtém o valor da propriedade reloadTimeOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getReloadTimeOverride() {
        return reloadTimeOverride;
    }

    /**
     * Define o valor da propriedade reloadTimeOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setReloadTimeOverride(JAXBElement<Duration> value) {
        this.reloadTimeOverride = value;
    }

    /**
     * Obtém o valor da propriedade runningQuantityAfter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getRunningQuantityAfter() {
        return runningQuantityAfter;
    }

    /**
     * Define o valor da propriedade runningQuantityAfter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setRunningQuantityAfter(JAXBElement<Quantities> value) {
        this.runningQuantityAfter = value;
    }

    /**
     * Obtém o valor da propriedade totalDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalDeliveryQuantities() {
        return totalDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade totalDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalDeliveryQuantities(JAXBElement<Quantities> value) {
        this.totalDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalFee.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalFee() {
        return totalFee;
    }

    /**
     * Define o valor da propriedade totalFee.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalFee(JAXBElement<Double> value) {
        this.totalFee = value;
    }

    /**
     * Obtém o valor da propriedade totalPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalPickupQuantities() {
        return totalPickupQuantities;
    }

    /**
     * Define o valor da propriedade totalPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalPickupQuantities(JAXBElement<Quantities> value) {
        this.totalPickupQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedDeliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalPlannedDeliveryQuantities() {
        return totalPlannedDeliveryQuantities;
    }

    /**
     * Define o valor da propriedade totalPlannedDeliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalPlannedDeliveryQuantities(JAXBElement<Quantities> value) {
        this.totalPlannedDeliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedFee.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalPlannedFee() {
        return totalPlannedFee;
    }

    /**
     * Define o valor da propriedade totalPlannedFee.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalPlannedFee(JAXBElement<Double> value) {
        this.totalPlannedFee = value;
    }

    /**
     * Obtém o valor da propriedade totalPlannedPickupQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getTotalPlannedPickupQuantities() {
        return totalPlannedPickupQuantities;
    }

    /**
     * Define o valor da propriedade totalPlannedPickupQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setTotalPlannedPickupQuantities(JAXBElement<Quantities> value) {
        this.totalPlannedPickupQuantities = value;
    }

}
