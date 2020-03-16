
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de NetworkTravelModel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkTravelModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommercialVehicleRestrictionsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HistoricalTravelSpeedsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxHeight" type="{http://roadnet.com/apex/DataContracts/}Length" minOccurs="0"/&gt;
 *         &lt;element name="MaxWeight" type="{http://roadnet.com/apex/DataContracts/}Weight" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedTimePeriod1" type="{http://roadnet.com/apex/DataContracts/}NetworkDateTimePeriod" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedTimePeriod1IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedTimePeriod2" type="{http://roadnet.com/apex/DataContracts/}NetworkDateTimePeriod" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedTimePeriod2IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedTimePeriod3" type="{http://roadnet.com/apex/DataContracts/}NetworkDateTimePeriod" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedTimePeriod3IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RushHour1SpeedAdjustmentPercentage" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="RushHour1SpeedAdjustmentPercentageEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RushHour2SpeedAdjustmentPercentage" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="RushHour2SpeedAdjustmentPercentageEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RushHour3SpeedAdjustmentPercentage" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="RushHour3SpeedAdjustmentPercentageEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RushHourTimePeriod1" type="{http://roadnet.com/apex/DataContracts/}NetworkDateTimePeriod" minOccurs="0"/&gt;
 *         &lt;element name="RushHourTimePeriod1IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RushHourTimePeriod2" type="{http://roadnet.com/apex/DataContracts/}NetworkDateTimePeriod" minOccurs="0"/&gt;
 *         &lt;element name="RushHourTimePeriod2IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RushHourTimePeriod3" type="{http://roadnet.com/apex/DataContracts/}NetworkDateTimePeriod" minOccurs="0"/&gt;
 *         &lt;element name="RushHourTimePeriod3IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkTravelModel", propOrder = {
    "commercialVehicleRestrictionsEnabled",
    "historicalTravelSpeedsEnabled",
    "maxHeight",
    "maxWeight",
    "restrictedTimePeriod1",
    "restrictedTimePeriod1IsActive",
    "restrictedTimePeriod2",
    "restrictedTimePeriod2IsActive",
    "restrictedTimePeriod3",
    "restrictedTimePeriod3IsActive",
    "rushHour1SpeedAdjustmentPercentage",
    "rushHour1SpeedAdjustmentPercentageEnabled",
    "rushHour2SpeedAdjustmentPercentage",
    "rushHour2SpeedAdjustmentPercentageEnabled",
    "rushHour3SpeedAdjustmentPercentage",
    "rushHour3SpeedAdjustmentPercentageEnabled",
    "rushHourTimePeriod1",
    "rushHourTimePeriod1IsActive",
    "rushHourTimePeriod2",
    "rushHourTimePeriod2IsActive",
    "rushHourTimePeriod3",
    "rushHourTimePeriod3IsActive"
})
public class NetworkTravelModel
    extends DataTransferObject
{

    @XmlElement(name = "CommercialVehicleRestrictionsEnabled")
    protected Boolean commercialVehicleRestrictionsEnabled;
    @XmlElement(name = "HistoricalTravelSpeedsEnabled")
    protected Boolean historicalTravelSpeedsEnabled;
    @XmlElementRef(name = "MaxHeight", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Length> maxHeight;
    @XmlElementRef(name = "MaxWeight", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Weight> maxWeight;
    @XmlElementRef(name = "RestrictedTimePeriod1", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkDateTimePeriod> restrictedTimePeriod1;
    @XmlElement(name = "RestrictedTimePeriod1IsActive")
    protected Boolean restrictedTimePeriod1IsActive;
    @XmlElementRef(name = "RestrictedTimePeriod2", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkDateTimePeriod> restrictedTimePeriod2;
    @XmlElement(name = "RestrictedTimePeriod2IsActive")
    protected Boolean restrictedTimePeriod2IsActive;
    @XmlElementRef(name = "RestrictedTimePeriod3", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkDateTimePeriod> restrictedTimePeriod3;
    @XmlElement(name = "RestrictedTimePeriod3IsActive")
    protected Boolean restrictedTimePeriod3IsActive;
    @XmlElement(name = "RushHour1SpeedAdjustmentPercentage")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer rushHour1SpeedAdjustmentPercentage;
    @XmlElement(name = "RushHour1SpeedAdjustmentPercentageEnabled")
    protected Boolean rushHour1SpeedAdjustmentPercentageEnabled;
    @XmlElement(name = "RushHour2SpeedAdjustmentPercentage")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer rushHour2SpeedAdjustmentPercentage;
    @XmlElement(name = "RushHour2SpeedAdjustmentPercentageEnabled")
    protected Boolean rushHour2SpeedAdjustmentPercentageEnabled;
    @XmlElement(name = "RushHour3SpeedAdjustmentPercentage")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer rushHour3SpeedAdjustmentPercentage;
    @XmlElement(name = "RushHour3SpeedAdjustmentPercentageEnabled")
    protected Boolean rushHour3SpeedAdjustmentPercentageEnabled;
    @XmlElementRef(name = "RushHourTimePeriod1", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkDateTimePeriod> rushHourTimePeriod1;
    @XmlElement(name = "RushHourTimePeriod1IsActive")
    protected Boolean rushHourTimePeriod1IsActive;
    @XmlElementRef(name = "RushHourTimePeriod2", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkDateTimePeriod> rushHourTimePeriod2;
    @XmlElement(name = "RushHourTimePeriod2IsActive")
    protected Boolean rushHourTimePeriod2IsActive;
    @XmlElementRef(name = "RushHourTimePeriod3", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkDateTimePeriod> rushHourTimePeriod3;
    @XmlElement(name = "RushHourTimePeriod3IsActive")
    protected Boolean rushHourTimePeriod3IsActive;

    /**
     * Obtém o valor da propriedade commercialVehicleRestrictionsEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommercialVehicleRestrictionsEnabled() {
        return commercialVehicleRestrictionsEnabled;
    }

    /**
     * Define o valor da propriedade commercialVehicleRestrictionsEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommercialVehicleRestrictionsEnabled(Boolean value) {
        this.commercialVehicleRestrictionsEnabled = value;
    }

    /**
     * Obtém o valor da propriedade historicalTravelSpeedsEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHistoricalTravelSpeedsEnabled() {
        return historicalTravelSpeedsEnabled;
    }

    /**
     * Define o valor da propriedade historicalTravelSpeedsEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHistoricalTravelSpeedsEnabled(Boolean value) {
        this.historicalTravelSpeedsEnabled = value;
    }

    /**
     * Obtém o valor da propriedade maxHeight.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public JAXBElement<Length> getMaxHeight() {
        return maxHeight;
    }

    /**
     * Define o valor da propriedade maxHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public void setMaxHeight(JAXBElement<Length> value) {
        this.maxHeight = value;
    }

    /**
     * Obtém o valor da propriedade maxWeight.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Weight }{@code >}
     *     
     */
    public JAXBElement<Weight> getMaxWeight() {
        return maxWeight;
    }

    /**
     * Define o valor da propriedade maxWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Weight }{@code >}
     *     
     */
    public void setMaxWeight(JAXBElement<Weight> value) {
        this.maxWeight = value;
    }

    /**
     * Obtém o valor da propriedade restrictedTimePeriod1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkDateTimePeriod }{@code >}
     *     
     */
    public JAXBElement<NetworkDateTimePeriod> getRestrictedTimePeriod1() {
        return restrictedTimePeriod1;
    }

    /**
     * Define o valor da propriedade restrictedTimePeriod1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkDateTimePeriod }{@code >}
     *     
     */
    public void setRestrictedTimePeriod1(JAXBElement<NetworkDateTimePeriod> value) {
        this.restrictedTimePeriod1 = value;
    }

    /**
     * Obtém o valor da propriedade restrictedTimePeriod1IsActive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedTimePeriod1IsActive() {
        return restrictedTimePeriod1IsActive;
    }

    /**
     * Define o valor da propriedade restrictedTimePeriod1IsActive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedTimePeriod1IsActive(Boolean value) {
        this.restrictedTimePeriod1IsActive = value;
    }

    /**
     * Obtém o valor da propriedade restrictedTimePeriod2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkDateTimePeriod }{@code >}
     *     
     */
    public JAXBElement<NetworkDateTimePeriod> getRestrictedTimePeriod2() {
        return restrictedTimePeriod2;
    }

    /**
     * Define o valor da propriedade restrictedTimePeriod2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkDateTimePeriod }{@code >}
     *     
     */
    public void setRestrictedTimePeriod2(JAXBElement<NetworkDateTimePeriod> value) {
        this.restrictedTimePeriod2 = value;
    }

    /**
     * Obtém o valor da propriedade restrictedTimePeriod2IsActive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedTimePeriod2IsActive() {
        return restrictedTimePeriod2IsActive;
    }

    /**
     * Define o valor da propriedade restrictedTimePeriod2IsActive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedTimePeriod2IsActive(Boolean value) {
        this.restrictedTimePeriod2IsActive = value;
    }

    /**
     * Obtém o valor da propriedade restrictedTimePeriod3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkDateTimePeriod }{@code >}
     *     
     */
    public JAXBElement<NetworkDateTimePeriod> getRestrictedTimePeriod3() {
        return restrictedTimePeriod3;
    }

    /**
     * Define o valor da propriedade restrictedTimePeriod3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkDateTimePeriod }{@code >}
     *     
     */
    public void setRestrictedTimePeriod3(JAXBElement<NetworkDateTimePeriod> value) {
        this.restrictedTimePeriod3 = value;
    }

    /**
     * Obtém o valor da propriedade restrictedTimePeriod3IsActive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedTimePeriod3IsActive() {
        return restrictedTimePeriod3IsActive;
    }

    /**
     * Define o valor da propriedade restrictedTimePeriod3IsActive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedTimePeriod3IsActive(Boolean value) {
        this.restrictedTimePeriod3IsActive = value;
    }

    /**
     * Obtém o valor da propriedade rushHour1SpeedAdjustmentPercentage.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRushHour1SpeedAdjustmentPercentage() {
        return rushHour1SpeedAdjustmentPercentage;
    }

    /**
     * Define o valor da propriedade rushHour1SpeedAdjustmentPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRushHour1SpeedAdjustmentPercentage(Integer value) {
        this.rushHour1SpeedAdjustmentPercentage = value;
    }

    /**
     * Obtém o valor da propriedade rushHour1SpeedAdjustmentPercentageEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRushHour1SpeedAdjustmentPercentageEnabled() {
        return rushHour1SpeedAdjustmentPercentageEnabled;
    }

    /**
     * Define o valor da propriedade rushHour1SpeedAdjustmentPercentageEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRushHour1SpeedAdjustmentPercentageEnabled(Boolean value) {
        this.rushHour1SpeedAdjustmentPercentageEnabled = value;
    }

    /**
     * Obtém o valor da propriedade rushHour2SpeedAdjustmentPercentage.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRushHour2SpeedAdjustmentPercentage() {
        return rushHour2SpeedAdjustmentPercentage;
    }

    /**
     * Define o valor da propriedade rushHour2SpeedAdjustmentPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRushHour2SpeedAdjustmentPercentage(Integer value) {
        this.rushHour2SpeedAdjustmentPercentage = value;
    }

    /**
     * Obtém o valor da propriedade rushHour2SpeedAdjustmentPercentageEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRushHour2SpeedAdjustmentPercentageEnabled() {
        return rushHour2SpeedAdjustmentPercentageEnabled;
    }

    /**
     * Define o valor da propriedade rushHour2SpeedAdjustmentPercentageEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRushHour2SpeedAdjustmentPercentageEnabled(Boolean value) {
        this.rushHour2SpeedAdjustmentPercentageEnabled = value;
    }

    /**
     * Obtém o valor da propriedade rushHour3SpeedAdjustmentPercentage.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRushHour3SpeedAdjustmentPercentage() {
        return rushHour3SpeedAdjustmentPercentage;
    }

    /**
     * Define o valor da propriedade rushHour3SpeedAdjustmentPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRushHour3SpeedAdjustmentPercentage(Integer value) {
        this.rushHour3SpeedAdjustmentPercentage = value;
    }

    /**
     * Obtém o valor da propriedade rushHour3SpeedAdjustmentPercentageEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRushHour3SpeedAdjustmentPercentageEnabled() {
        return rushHour3SpeedAdjustmentPercentageEnabled;
    }

    /**
     * Define o valor da propriedade rushHour3SpeedAdjustmentPercentageEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRushHour3SpeedAdjustmentPercentageEnabled(Boolean value) {
        this.rushHour3SpeedAdjustmentPercentageEnabled = value;
    }

    /**
     * Obtém o valor da propriedade rushHourTimePeriod1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkDateTimePeriod }{@code >}
     *     
     */
    public JAXBElement<NetworkDateTimePeriod> getRushHourTimePeriod1() {
        return rushHourTimePeriod1;
    }

    /**
     * Define o valor da propriedade rushHourTimePeriod1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkDateTimePeriod }{@code >}
     *     
     */
    public void setRushHourTimePeriod1(JAXBElement<NetworkDateTimePeriod> value) {
        this.rushHourTimePeriod1 = value;
    }

    /**
     * Obtém o valor da propriedade rushHourTimePeriod1IsActive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRushHourTimePeriod1IsActive() {
        return rushHourTimePeriod1IsActive;
    }

    /**
     * Define o valor da propriedade rushHourTimePeriod1IsActive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRushHourTimePeriod1IsActive(Boolean value) {
        this.rushHourTimePeriod1IsActive = value;
    }

    /**
     * Obtém o valor da propriedade rushHourTimePeriod2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkDateTimePeriod }{@code >}
     *     
     */
    public JAXBElement<NetworkDateTimePeriod> getRushHourTimePeriod2() {
        return rushHourTimePeriod2;
    }

    /**
     * Define o valor da propriedade rushHourTimePeriod2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkDateTimePeriod }{@code >}
     *     
     */
    public void setRushHourTimePeriod2(JAXBElement<NetworkDateTimePeriod> value) {
        this.rushHourTimePeriod2 = value;
    }

    /**
     * Obtém o valor da propriedade rushHourTimePeriod2IsActive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRushHourTimePeriod2IsActive() {
        return rushHourTimePeriod2IsActive;
    }

    /**
     * Define o valor da propriedade rushHourTimePeriod2IsActive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRushHourTimePeriod2IsActive(Boolean value) {
        this.rushHourTimePeriod2IsActive = value;
    }

    /**
     * Obtém o valor da propriedade rushHourTimePeriod3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkDateTimePeriod }{@code >}
     *     
     */
    public JAXBElement<NetworkDateTimePeriod> getRushHourTimePeriod3() {
        return rushHourTimePeriod3;
    }

    /**
     * Define o valor da propriedade rushHourTimePeriod3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkDateTimePeriod }{@code >}
     *     
     */
    public void setRushHourTimePeriod3(JAXBElement<NetworkDateTimePeriod> value) {
        this.rushHourTimePeriod3 = value;
    }

    /**
     * Obtém o valor da propriedade rushHourTimePeriod3IsActive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRushHourTimePeriod3IsActive() {
        return rushHourTimePeriod3IsActive;
    }

    /**
     * Define o valor da propriedade rushHourTimePeriod3IsActive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRushHourTimePeriod3IsActive(Boolean value) {
        this.rushHourTimePeriod3IsActive = value;
    }

}
