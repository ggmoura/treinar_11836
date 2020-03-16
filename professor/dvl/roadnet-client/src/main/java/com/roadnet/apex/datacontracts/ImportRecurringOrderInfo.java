
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ImportRecurringOrderInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ImportRecurringOrderInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}ImportOrderBaseInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AnchorDaysRange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AnchorWeeksRange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_PreviousDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsConsideredForAssignDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfDaysToShift" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PreviousDeliveryWeeks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousOriginId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousTerritoryIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousWeek" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServicePatternSetEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ShouldUseAnchorDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShouldUseAnchorWeeks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportRecurringOrderInfo", propOrder = {
    "anchorDaysRange",
    "anchorWeeksRange",
    "dayOfWeekFlagsPreviousDays",
    "isConsideredForAssignDays",
    "numberOfDaysToShift",
    "previousDeliveryWeeks",
    "previousOriginId",
    "previousTerritoryIds",
    "previousWeek",
    "servicePatternSetEntityKey",
    "sessionEntityKey",
    "shouldUseAnchorDays",
    "shouldUseAnchorWeeks"
})
public class ImportRecurringOrderInfo
    extends ImportOrderBaseInfo
{

    @XmlElement(name = "AnchorDaysRange")
    protected Integer anchorDaysRange;
    @XmlElement(name = "AnchorWeeksRange")
    protected Integer anchorWeeksRange;
    @XmlElementRef(name = "DayOfWeekFlags_PreviousDays", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dayOfWeekFlagsPreviousDays;
    @XmlElement(name = "IsConsideredForAssignDays")
    protected Boolean isConsideredForAssignDays;
    @XmlElement(name = "NumberOfDaysToShift")
    protected Integer numberOfDaysToShift;
    @XmlElementRef(name = "PreviousDeliveryWeeks", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousDeliveryWeeks;
    @XmlElementRef(name = "PreviousOriginId", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousOriginId;
    @XmlElementRef(name = "PreviousTerritoryIds", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousTerritoryIds;
    @XmlElement(name = "PreviousWeek")
    protected Integer previousWeek;
    @XmlElementRef(name = "ServicePatternSetEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> servicePatternSetEntityKey;
    @XmlElementRef(name = "SessionEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> sessionEntityKey;
    @XmlElement(name = "ShouldUseAnchorDays")
    protected Boolean shouldUseAnchorDays;
    @XmlElement(name = "ShouldUseAnchorWeeks")
    protected Boolean shouldUseAnchorWeeks;

    /**
     * Obtém o valor da propriedade anchorDaysRange.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnchorDaysRange() {
        return anchorDaysRange;
    }

    /**
     * Define o valor da propriedade anchorDaysRange.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnchorDaysRange(Integer value) {
        this.anchorDaysRange = value;
    }

    /**
     * Obtém o valor da propriedade anchorWeeksRange.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnchorWeeksRange() {
        return anchorWeeksRange;
    }

    /**
     * Define o valor da propriedade anchorWeeksRange.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnchorWeeksRange(Integer value) {
        this.anchorWeeksRange = value;
    }

    /**
     * Obtém o valor da propriedade dayOfWeekFlagsPreviousDays.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDayOfWeekFlagsPreviousDays() {
        return dayOfWeekFlagsPreviousDays;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsPreviousDays.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDayOfWeekFlagsPreviousDays(JAXBElement<String> value) {
        this.dayOfWeekFlagsPreviousDays = value;
    }

    /**
     * Obtém o valor da propriedade isConsideredForAssignDays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConsideredForAssignDays() {
        return isConsideredForAssignDays;
    }

    /**
     * Define o valor da propriedade isConsideredForAssignDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConsideredForAssignDays(Boolean value) {
        this.isConsideredForAssignDays = value;
    }

    /**
     * Obtém o valor da propriedade numberOfDaysToShift.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfDaysToShift() {
        return numberOfDaysToShift;
    }

    /**
     * Define o valor da propriedade numberOfDaysToShift.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfDaysToShift(Integer value) {
        this.numberOfDaysToShift = value;
    }

    /**
     * Obtém o valor da propriedade previousDeliveryWeeks.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousDeliveryWeeks() {
        return previousDeliveryWeeks;
    }

    /**
     * Define o valor da propriedade previousDeliveryWeeks.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousDeliveryWeeks(JAXBElement<String> value) {
        this.previousDeliveryWeeks = value;
    }

    /**
     * Obtém o valor da propriedade previousOriginId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousOriginId() {
        return previousOriginId;
    }

    /**
     * Define o valor da propriedade previousOriginId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousOriginId(JAXBElement<String> value) {
        this.previousOriginId = value;
    }

    /**
     * Obtém o valor da propriedade previousTerritoryIds.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousTerritoryIds() {
        return previousTerritoryIds;
    }

    /**
     * Define o valor da propriedade previousTerritoryIds.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousTerritoryIds(JAXBElement<String> value) {
        this.previousTerritoryIds = value;
    }

    /**
     * Obtém o valor da propriedade previousWeek.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreviousWeek() {
        return previousWeek;
    }

    /**
     * Define o valor da propriedade previousWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreviousWeek(Integer value) {
        this.previousWeek = value;
    }

    /**
     * Obtém o valor da propriedade servicePatternSetEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServicePatternSetEntityKey() {
        return servicePatternSetEntityKey;
    }

    /**
     * Define o valor da propriedade servicePatternSetEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServicePatternSetEntityKey(JAXBElement<Long> value) {
        this.servicePatternSetEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade sessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSessionEntityKey() {
        return sessionEntityKey;
    }

    /**
     * Define o valor da propriedade sessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSessionEntityKey(JAXBElement<Long> value) {
        this.sessionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade shouldUseAnchorDays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldUseAnchorDays() {
        return shouldUseAnchorDays;
    }

    /**
     * Define o valor da propriedade shouldUseAnchorDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldUseAnchorDays(Boolean value) {
        this.shouldUseAnchorDays = value;
    }

    /**
     * Obtém o valor da propriedade shouldUseAnchorWeeks.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldUseAnchorWeeks() {
        return shouldUseAnchorWeeks;
    }

    /**
     * Define o valor da propriedade shouldUseAnchorWeeks.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldUseAnchorWeeks(Boolean value) {
        this.shouldUseAnchorWeeks = value;
    }

}
