
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de MidRouteDepotStopTemplate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MidRouteDepotStopTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}StopTemplate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlwaysCreate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotAddress" type="{http://roadnet.com/apex/DataContracts/}Address" minOccurs="0"/&gt;
 *         &lt;element name="DepotCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="DepotDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DepotIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAccuracy_DepotGeocodeAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAttentionReason_DepotGeocodeAttentionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeMethod_DepotGeocodeMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LoadAction_LoadAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReloadTimeOverride" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_DepotTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MidRouteDepotStopTemplate", propOrder = {
    "alwaysCreate",
    "depotAddress",
    "depotCoordinate",
    "depotDescription",
    "depotEntityKey",
    "depotIdentifier",
    "geocodeAccuracyDepotGeocodeAccuracy",
    "geocodeAttentionReasonDepotGeocodeAttentionReason",
    "geocodeMethodDepotGeocodeMethod",
    "loadActionLoadAction",
    "reloadTimeOverride",
    "worldTimeZoneDepotTimeZone"
})
public class MidRouteDepotStopTemplate
    extends StopTemplate
{

    @XmlElement(name = "AlwaysCreate")
    protected Boolean alwaysCreate;
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
    @XmlElementRef(name = "GeocodeAccuracy_DepotGeocodeAccuracy", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geocodeAccuracyDepotGeocodeAccuracy;
    @XmlElementRef(name = "GeocodeAttentionReason_DepotGeocodeAttentionReason", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geocodeAttentionReasonDepotGeocodeAttentionReason;
    @XmlElementRef(name = "GeocodeMethod_DepotGeocodeMethod", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geocodeMethodDepotGeocodeMethod;
    @XmlElementRef(name = "LoadAction_LoadAction", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loadActionLoadAction;
    @XmlElementRef(name = "ReloadTimeOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> reloadTimeOverride;
    @XmlElementRef(name = "WorldTimeZone_DepotTimeZone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worldTimeZoneDepotTimeZone;

    /**
     * Obtém o valor da propriedade alwaysCreate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlwaysCreate() {
        return alwaysCreate;
    }

    /**
     * Define o valor da propriedade alwaysCreate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlwaysCreate(Boolean value) {
        this.alwaysCreate = value;
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
     * Obtém o valor da propriedade worldTimeZoneDepotTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorldTimeZoneDepotTimeZone() {
        return worldTimeZoneDepotTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneDepotTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorldTimeZoneDepotTimeZone(JAXBElement<String> value) {
        this.worldTimeZoneDepotTimeZone = value;
    }

}
