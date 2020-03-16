
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Location complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Location"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccessPoints" type="{http://roadnet.com/apex/DataContracts/}ArrayOfLocationAccessPoint" minOccurs="0"/&gt;
 *         &lt;element name="AccountEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://roadnet.com/apex/DataContracts/}Address" minOccurs="0"/&gt;
 *         &lt;element name="AlternateContact" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="AlternatePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BulkThreshold" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://roadnet.com/apex/DataContracts/}ArrayOfLocationComment" minOccurs="0"/&gt;
 *         &lt;element name="Contact" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="Coordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FixedFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAccuracy_GeocodeAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAttentionReason_GeocodeAttentionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeMethod_GeocodeMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastOrderDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceAreaOverride" type="{http://roadnet.com/apex/DataContracts/}ServiceAreaBase" minOccurs="0"/&gt;
 *         &lt;element name="ServiceRadiusOverride" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="StandardInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VariableFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
    "accessPoints",
    "accountEntityKey",
    "address",
    "alternateContact",
    "alternatePhoneNumber",
    "bulkThreshold",
    "comments",
    "contact",
    "coordinate",
    "description",
    "faxNumber",
    "fixedFee",
    "geocodeAccuracyGeocodeAccuracy",
    "geocodeAttentionReasonGeocodeAttentionReason",
    "geocodeMethodGeocodeMethod",
    "identifier",
    "isDeleted",
    "lastOrderDate",
    "phoneNumber",
    "serviceAreaOverride",
    "serviceRadiusOverride",
    "standardInstructions",
    "variableFee",
    "worldTimeZoneTimeZone",
    "zone"
})
@XmlSeeAlso({
    FuelLocation.class,
    LayoverLocation.class,
    RestrictedLocation.class,
    Depot.class,
    ServiceLocation.class
})
public class Location
    extends VisibleInMultipleRegionsAggregateRootEntity
{

    @XmlElementRef(name = "AccessPoints", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLocationAccessPoint> accessPoints;
    @XmlElementRef(name = "AccountEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> accountEntityKey;
    @XmlElementRef(name = "Address", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> address;
    @XmlElementRef(name = "AlternateContact", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> alternateContact;
    @XmlElementRef(name = "AlternatePhoneNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alternatePhoneNumber;
    @XmlElementRef(name = "BulkThreshold", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> bulkThreshold;
    @XmlElementRef(name = "Comments", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLocationComment> comments;
    @XmlElementRef(name = "Contact", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> contact;
    @XmlElementRef(name = "Coordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinate;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "FaxNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> faxNumber;
    @XmlElement(name = "FixedFee")
    protected Double fixedFee;
    @XmlElementRef(name = "GeocodeAccuracy_GeocodeAccuracy", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geocodeAccuracyGeocodeAccuracy;
    @XmlElementRef(name = "GeocodeAttentionReason_GeocodeAttentionReason", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geocodeAttentionReasonGeocodeAttentionReason;
    @XmlElementRef(name = "GeocodeMethod_GeocodeMethod", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geocodeMethodGeocodeMethod;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElementRef(name = "LastOrderDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastOrderDate;
    @XmlElementRef(name = "PhoneNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneNumber;
    @XmlElementRef(name = "ServiceAreaOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceAreaBase> serviceAreaOverride;
    @XmlElementRef(name = "ServiceRadiusOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> serviceRadiusOverride;
    @XmlElementRef(name = "StandardInstructions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> standardInstructions;
    @XmlElement(name = "VariableFee")
    protected Double variableFee;
    @XmlElementRef(name = "WorldTimeZone_TimeZone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worldTimeZoneTimeZone;
    @XmlElementRef(name = "Zone", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> zone;

    /**
     * Obtém o valor da propriedade accessPoints.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLocationAccessPoint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLocationAccessPoint> getAccessPoints() {
        return accessPoints;
    }

    /**
     * Define o valor da propriedade accessPoints.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLocationAccessPoint }{@code >}
     *     
     */
    public void setAccessPoints(JAXBElement<ArrayOfLocationAccessPoint> value) {
        this.accessPoints = value;
    }

    /**
     * Obtém o valor da propriedade accountEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAccountEntityKey() {
        return accountEntityKey;
    }

    /**
     * Define o valor da propriedade accountEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAccountEntityKey(JAXBElement<Long> value) {
        this.accountEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setAddress(JAXBElement<Address> value) {
        this.address = value;
    }

    /**
     * Obtém o valor da propriedade alternateContact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getAlternateContact() {
        return alternateContact;
    }

    /**
     * Define o valor da propriedade alternateContact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setAlternateContact(JAXBElement<PersonName> value) {
        this.alternateContact = value;
    }

    /**
     * Obtém o valor da propriedade alternatePhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlternatePhoneNumber() {
        return alternatePhoneNumber;
    }

    /**
     * Define o valor da propriedade alternatePhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlternatePhoneNumber(JAXBElement<String> value) {
        this.alternatePhoneNumber = value;
    }

    /**
     * Obtém o valor da propriedade bulkThreshold.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getBulkThreshold() {
        return bulkThreshold;
    }

    /**
     * Define o valor da propriedade bulkThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setBulkThreshold(JAXBElement<Quantities> value) {
        this.bulkThreshold = value;
    }

    /**
     * Obtém o valor da propriedade comments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLocationComment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLocationComment> getComments() {
        return comments;
    }

    /**
     * Define o valor da propriedade comments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLocationComment }{@code >}
     *     
     */
    public void setComments(JAXBElement<ArrayOfLocationComment> value) {
        this.comments = value;
    }

    /**
     * Obtém o valor da propriedade contact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getContact() {
        return contact;
    }

    /**
     * Define o valor da propriedade contact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setContact(JAXBElement<PersonName> value) {
        this.contact = value;
    }

    /**
     * Obtém o valor da propriedade coordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getCoordinate() {
        return coordinate;
    }

    /**
     * Define o valor da propriedade coordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setCoordinate(JAXBElement<Coordinate> value) {
        this.coordinate = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade faxNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxNumber() {
        return faxNumber;
    }

    /**
     * Define o valor da propriedade faxNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxNumber(JAXBElement<String> value) {
        this.faxNumber = value;
    }

    /**
     * Obtém o valor da propriedade fixedFee.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFixedFee() {
        return fixedFee;
    }

    /**
     * Define o valor da propriedade fixedFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFixedFee(Double value) {
        this.fixedFee = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAccuracyGeocodeAccuracy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeocodeAccuracyGeocodeAccuracy() {
        return geocodeAccuracyGeocodeAccuracy;
    }

    /**
     * Define o valor da propriedade geocodeAccuracyGeocodeAccuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeocodeAccuracyGeocodeAccuracy(JAXBElement<String> value) {
        this.geocodeAccuracyGeocodeAccuracy = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAttentionReasonGeocodeAttentionReason.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeocodeAttentionReasonGeocodeAttentionReason() {
        return geocodeAttentionReasonGeocodeAttentionReason;
    }

    /**
     * Define o valor da propriedade geocodeAttentionReasonGeocodeAttentionReason.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeocodeAttentionReasonGeocodeAttentionReason(JAXBElement<String> value) {
        this.geocodeAttentionReasonGeocodeAttentionReason = value;
    }

    /**
     * Obtém o valor da propriedade geocodeMethodGeocodeMethod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeocodeMethodGeocodeMethod() {
        return geocodeMethodGeocodeMethod;
    }

    /**
     * Define o valor da propriedade geocodeMethodGeocodeMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeocodeMethodGeocodeMethod(JAXBElement<String> value) {
        this.geocodeMethodGeocodeMethod = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade isDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Define o valor da propriedade isDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Obtém o valor da propriedade lastOrderDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastOrderDate() {
        return lastOrderDate;
    }

    /**
     * Define o valor da propriedade lastOrderDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastOrderDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastOrderDate = value;
    }

    /**
     * Obtém o valor da propriedade phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Define o valor da propriedade phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneNumber(JAXBElement<String> value) {
        this.phoneNumber = value;
    }

    /**
     * Obtém o valor da propriedade serviceAreaOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceAreaBase }{@code >}
     *     
     */
    public JAXBElement<ServiceAreaBase> getServiceAreaOverride() {
        return serviceAreaOverride;
    }

    /**
     * Define o valor da propriedade serviceAreaOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceAreaBase }{@code >}
     *     
     */
    public void setServiceAreaOverride(JAXBElement<ServiceAreaBase> value) {
        this.serviceAreaOverride = value;
    }

    /**
     * Obtém o valor da propriedade serviceRadiusOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getServiceRadiusOverride() {
        return serviceRadiusOverride;
    }

    /**
     * Define o valor da propriedade serviceRadiusOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setServiceRadiusOverride(JAXBElement<Distance> value) {
        this.serviceRadiusOverride = value;
    }

    /**
     * Obtém o valor da propriedade standardInstructions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStandardInstructions() {
        return standardInstructions;
    }

    /**
     * Define o valor da propriedade standardInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStandardInstructions(JAXBElement<String> value) {
        this.standardInstructions = value;
    }

    /**
     * Obtém o valor da propriedade variableFee.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVariableFee() {
        return variableFee;
    }

    /**
     * Define o valor da propriedade variableFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVariableFee(Double value) {
        this.variableFee = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorldTimeZoneTimeZone() {
        return worldTimeZoneTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorldTimeZoneTimeZone(JAXBElement<String> value) {
        this.worldTimeZoneTimeZone = value;
    }

    /**
     * Obtém o valor da propriedade zone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getZone() {
        return zone;
    }

    /**
     * Define o valor da propriedade zone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setZone(JAXBElement<String> value) {
        this.zone = value;
    }

}
