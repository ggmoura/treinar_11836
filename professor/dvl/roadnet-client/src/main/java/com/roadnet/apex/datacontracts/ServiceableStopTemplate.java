
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;


/**
 * <p>Classe Java de ServiceableStopTemplate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceableStopTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}StopTemplate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeocodeAccuracy_ServiceLocationGeocodeAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAttentionReason_ServiceLocationGeocodeAttentionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeMethod_ServiceLocationGeocodeMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteTemplateIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationAccountEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationAddress" type="{http://roadnet.com/apex/DataContracts/}Address" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationAlternateContact" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationBuildingDeliverySequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCategoryEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationContact" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCustomProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationIsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationLastOrderDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationOpenCloseOverrides" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceLocationOpenCloseDetail" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationServiceWindowOverrides" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceLocationServiceWindowDetail" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationTimeWindowTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="StopTemplateAlertFlags_Alerts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeWindowImportance_ServiceLocationTimeWindowImportance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_ServiceLocationTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceableStopTemplate", propOrder = {
    "geocodeAccuracyServiceLocationGeocodeAccuracy",
    "geocodeAttentionReasonServiceLocationGeocodeAttentionReason",
    "geocodeMethodServiceLocationGeocodeMethod",
    "routeTemplateIdentifier",
    "sequenceNumber",
    "serviceLocationAccountEntityKey",
    "serviceLocationAddress",
    "serviceLocationAlternateContact",
    "serviceLocationBuildingDeliverySequence",
    "serviceLocationCategoryEntityKey",
    "serviceLocationContact",
    "serviceLocationCoordinate",
    "serviceLocationCustomProperties",
    "serviceLocationDescription",
    "serviceLocationEntityKey",
    "serviceLocationIdentifier",
    "serviceLocationIsDeleted",
    "serviceLocationLastOrderDate",
    "serviceLocationOpenCloseOverrides",
    "serviceLocationPriority",
    "serviceLocationServiceWindowOverrides",
    "serviceLocationTimeWindowTypeEntityKey",
    "stopTemplateAlertFlagsAlerts",
    "timeWindowImportanceServiceLocationTimeWindowImportance",
    "worldTimeZoneServiceLocationTimeZone"
})
public class ServiceableStopTemplate
    extends StopTemplate
{

    @XmlElementRef(name = "GeocodeAccuracy_ServiceLocationGeocodeAccuracy", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geocodeAccuracyServiceLocationGeocodeAccuracy;
    @XmlElementRef(name = "GeocodeAttentionReason_ServiceLocationGeocodeAttentionReason", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geocodeAttentionReasonServiceLocationGeocodeAttentionReason;
    @XmlElementRef(name = "GeocodeMethod_ServiceLocationGeocodeMethod", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geocodeMethodServiceLocationGeocodeMethod;
    @XmlElementRef(name = "RouteTemplateIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeTemplateIdentifier;
    @XmlElement(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlElementRef(name = "ServiceLocationAccountEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> serviceLocationAccountEntityKey;
    @XmlElementRef(name = "ServiceLocationAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> serviceLocationAddress;
    @XmlElementRef(name = "ServiceLocationAlternateContact", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> serviceLocationAlternateContact;
    @XmlElement(name = "ServiceLocationBuildingDeliverySequence")
    protected Integer serviceLocationBuildingDeliverySequence;
    @XmlElementRef(name = "ServiceLocationCategoryEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> serviceLocationCategoryEntityKey;
    @XmlElementRef(name = "ServiceLocationContact", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> serviceLocationContact;
    @XmlElementRef(name = "ServiceLocationCoordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> serviceLocationCoordinate;
    @XmlElementRef(name = "ServiceLocationCustomProperties", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> serviceLocationCustomProperties;
    @XmlElementRef(name = "ServiceLocationDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationDescription;
    @XmlElement(name = "ServiceLocationEntityKey")
    protected Long serviceLocationEntityKey;
    @XmlElementRef(name = "ServiceLocationIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationIdentifier;
    @XmlElement(name = "ServiceLocationIsDeleted")
    protected Boolean serviceLocationIsDeleted;
    @XmlElementRef(name = "ServiceLocationLastOrderDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> serviceLocationLastOrderDate;
    @XmlElementRef(name = "ServiceLocationOpenCloseOverrides", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceLocationOpenCloseDetail> serviceLocationOpenCloseOverrides;
    @XmlElement(name = "ServiceLocationPriority")
    protected Integer serviceLocationPriority;
    @XmlElementRef(name = "ServiceLocationServiceWindowOverrides", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceLocationServiceWindowDetail> serviceLocationServiceWindowOverrides;
    @XmlElementRef(name = "ServiceLocationTimeWindowTypeEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> serviceLocationTimeWindowTypeEntityKey;
    @XmlElementRef(name = "StopTemplateAlertFlags_Alerts", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stopTemplateAlertFlagsAlerts;
    @XmlElementRef(name = "TimeWindowImportance_ServiceLocationTimeWindowImportance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeWindowImportanceServiceLocationTimeWindowImportance;
    @XmlElementRef(name = "WorldTimeZone_ServiceLocationTimeZone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worldTimeZoneServiceLocationTimeZone;

    /**
     * Obtém o valor da propriedade geocodeAccuracyServiceLocationGeocodeAccuracy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeocodeAccuracyServiceLocationGeocodeAccuracy() {
        return geocodeAccuracyServiceLocationGeocodeAccuracy;
    }

    /**
     * Define o valor da propriedade geocodeAccuracyServiceLocationGeocodeAccuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeocodeAccuracyServiceLocationGeocodeAccuracy(JAXBElement<String> value) {
        this.geocodeAccuracyServiceLocationGeocodeAccuracy = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAttentionReasonServiceLocationGeocodeAttentionReason.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeocodeAttentionReasonServiceLocationGeocodeAttentionReason() {
        return geocodeAttentionReasonServiceLocationGeocodeAttentionReason;
    }

    /**
     * Define o valor da propriedade geocodeAttentionReasonServiceLocationGeocodeAttentionReason.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeocodeAttentionReasonServiceLocationGeocodeAttentionReason(JAXBElement<String> value) {
        this.geocodeAttentionReasonServiceLocationGeocodeAttentionReason = value;
    }

    /**
     * Obtém o valor da propriedade geocodeMethodServiceLocationGeocodeMethod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeocodeMethodServiceLocationGeocodeMethod() {
        return geocodeMethodServiceLocationGeocodeMethod;
    }

    /**
     * Define o valor da propriedade geocodeMethodServiceLocationGeocodeMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeocodeMethodServiceLocationGeocodeMethod(JAXBElement<String> value) {
        this.geocodeMethodServiceLocationGeocodeMethod = value;
    }

    /**
     * Obtém o valor da propriedade routeTemplateIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteTemplateIdentifier() {
        return routeTemplateIdentifier;
    }

    /**
     * Define o valor da propriedade routeTemplateIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteTemplateIdentifier(JAXBElement<String> value) {
        this.routeTemplateIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade sequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Define o valor da propriedade sequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNumber(Integer value) {
        this.sequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationAccountEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServiceLocationAccountEntityKey() {
        return serviceLocationAccountEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationAccountEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServiceLocationAccountEntityKey(JAXBElement<Long> value) {
        this.serviceLocationAccountEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getServiceLocationAddress() {
        return serviceLocationAddress;
    }

    /**
     * Define o valor da propriedade serviceLocationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setServiceLocationAddress(JAXBElement<Address> value) {
        this.serviceLocationAddress = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationAlternateContact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getServiceLocationAlternateContact() {
        return serviceLocationAlternateContact;
    }

    /**
     * Define o valor da propriedade serviceLocationAlternateContact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setServiceLocationAlternateContact(JAXBElement<PersonName> value) {
        this.serviceLocationAlternateContact = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationBuildingDeliverySequence.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceLocationBuildingDeliverySequence() {
        return serviceLocationBuildingDeliverySequence;
    }

    /**
     * Define o valor da propriedade serviceLocationBuildingDeliverySequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceLocationBuildingDeliverySequence(Integer value) {
        this.serviceLocationBuildingDeliverySequence = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCategoryEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServiceLocationCategoryEntityKey() {
        return serviceLocationCategoryEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationCategoryEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServiceLocationCategoryEntityKey(JAXBElement<Long> value) {
        this.serviceLocationCategoryEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationContact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getServiceLocationContact() {
        return serviceLocationContact;
    }

    /**
     * Define o valor da propriedade serviceLocationContact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setServiceLocationContact(JAXBElement<PersonName> value) {
        this.serviceLocationContact = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getServiceLocationCoordinate() {
        return serviceLocationCoordinate;
    }

    /**
     * Define o valor da propriedade serviceLocationCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setServiceLocationCoordinate(JAXBElement<Coordinate> value) {
        this.serviceLocationCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCustomProperties.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringanyType> getServiceLocationCustomProperties() {
        return serviceLocationCustomProperties;
    }

    /**
     * Define o valor da propriedade serviceLocationCustomProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public void setServiceLocationCustomProperties(JAXBElement<ArrayOfKeyValueOfstringanyType> value) {
        this.serviceLocationCustomProperties = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationDescription() {
        return serviceLocationDescription;
    }

    /**
     * Define o valor da propriedade serviceLocationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationDescription(JAXBElement<String> value) {
        this.serviceLocationDescription = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceLocationEntityKey() {
        return serviceLocationEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceLocationEntityKey(Long value) {
        this.serviceLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceLocationIdentifier() {
        return serviceLocationIdentifier;
    }

    /**
     * Define o valor da propriedade serviceLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceLocationIdentifier(JAXBElement<String> value) {
        this.serviceLocationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationIsDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationIsDeleted() {
        return serviceLocationIsDeleted;
    }

    /**
     * Define o valor da propriedade serviceLocationIsDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationIsDeleted(Boolean value) {
        this.serviceLocationIsDeleted = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationLastOrderDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getServiceLocationLastOrderDate() {
        return serviceLocationLastOrderDate;
    }

    /**
     * Define o valor da propriedade serviceLocationLastOrderDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setServiceLocationLastOrderDate(JAXBElement<XMLGregorianCalendar> value) {
        this.serviceLocationLastOrderDate = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationOpenCloseOverrides.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationOpenCloseDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceLocationOpenCloseDetail> getServiceLocationOpenCloseOverrides() {
        return serviceLocationOpenCloseOverrides;
    }

    /**
     * Define o valor da propriedade serviceLocationOpenCloseOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationOpenCloseDetail }{@code >}
     *     
     */
    public void setServiceLocationOpenCloseOverrides(JAXBElement<ArrayOfServiceLocationOpenCloseDetail> value) {
        this.serviceLocationOpenCloseOverrides = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationPriority.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceLocationPriority() {
        return serviceLocationPriority;
    }

    /**
     * Define o valor da propriedade serviceLocationPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceLocationPriority(Integer value) {
        this.serviceLocationPriority = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationServiceWindowOverrides.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationServiceWindowDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceLocationServiceWindowDetail> getServiceLocationServiceWindowOverrides() {
        return serviceLocationServiceWindowOverrides;
    }

    /**
     * Define o valor da propriedade serviceLocationServiceWindowOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceLocationServiceWindowDetail }{@code >}
     *     
     */
    public void setServiceLocationServiceWindowOverrides(JAXBElement<ArrayOfServiceLocationServiceWindowDetail> value) {
        this.serviceLocationServiceWindowOverrides = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationTimeWindowTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServiceLocationTimeWindowTypeEntityKey() {
        return serviceLocationTimeWindowTypeEntityKey;
    }

    /**
     * Define o valor da propriedade serviceLocationTimeWindowTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServiceLocationTimeWindowTypeEntityKey(JAXBElement<Long> value) {
        this.serviceLocationTimeWindowTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade stopTemplateAlertFlagsAlerts.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStopTemplateAlertFlagsAlerts() {
        return stopTemplateAlertFlagsAlerts;
    }

    /**
     * Define o valor da propriedade stopTemplateAlertFlagsAlerts.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStopTemplateAlertFlagsAlerts(JAXBElement<String> value) {
        this.stopTemplateAlertFlagsAlerts = value;
    }

    /**
     * Obtém o valor da propriedade timeWindowImportanceServiceLocationTimeWindowImportance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeWindowImportanceServiceLocationTimeWindowImportance() {
        return timeWindowImportanceServiceLocationTimeWindowImportance;
    }

    /**
     * Define o valor da propriedade timeWindowImportanceServiceLocationTimeWindowImportance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeWindowImportanceServiceLocationTimeWindowImportance(JAXBElement<String> value) {
        this.timeWindowImportanceServiceLocationTimeWindowImportance = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneServiceLocationTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorldTimeZoneServiceLocationTimeZone() {
        return worldTimeZoneServiceLocationTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneServiceLocationTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorldTimeZoneServiceLocationTimeZone(JAXBElement<String> value) {
        this.worldTimeZoneServiceLocationTimeZone = value;
    }

}
