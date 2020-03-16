
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LocationPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LocationPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccessPoints" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AccessPointsOptions" type="{http://roadnet.com/apex/DataContracts/}LocationAccessPointPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="AccountEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AlternateContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AlternatePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BulkThreshold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CommentsOptions" type="{http://roadnet.com/apex/DataContracts/}LocationCommentPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Coordinate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FixedFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAccuracy_GeocodeAccuracy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAttentionReason_GeocodeAttentionReason" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeMethod_GeocodeMethod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastOrderDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceAreaOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceRadiusOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StandardInstructions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VariableFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_TimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Zone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationPropertyOptions", propOrder = {
    "accessPoints",
    "accessPointsOptions",
    "accountEntityKey",
    "address",
    "alternateContact",
    "alternatePhoneNumber",
    "bulkThreshold",
    "comments",
    "commentsOptions",
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
    FuelLocationPropertyOptions.class,
    LayoverLocationPropertyOptions.class,
    RestrictedLocationPropertyOptions.class,
    DepotPropertyOptions.class,
    ServiceLocationPropertyOptions.class
})
public class LocationPropertyOptions
    extends VisibleInMultipleRegionsAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "AccessPoints")
    protected Boolean accessPoints;
    @XmlElementRef(name = "AccessPointsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LocationAccessPointPropertyOptions> accessPointsOptions;
    @XmlElement(name = "AccountEntityKey")
    protected Boolean accountEntityKey;
    @XmlElement(name = "Address")
    protected Boolean address;
    @XmlElement(name = "AlternateContact")
    protected Boolean alternateContact;
    @XmlElement(name = "AlternatePhoneNumber")
    protected Boolean alternatePhoneNumber;
    @XmlElement(name = "BulkThreshold")
    protected Boolean bulkThreshold;
    @XmlElement(name = "Comments")
    protected Boolean comments;
    @XmlElementRef(name = "CommentsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LocationCommentPropertyOptions> commentsOptions;
    @XmlElement(name = "Contact")
    protected Boolean contact;
    @XmlElement(name = "Coordinate")
    protected Boolean coordinate;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "FaxNumber")
    protected Boolean faxNumber;
    @XmlElement(name = "FixedFee")
    protected Boolean fixedFee;
    @XmlElement(name = "GeocodeAccuracy_GeocodeAccuracy")
    protected Boolean geocodeAccuracyGeocodeAccuracy;
    @XmlElement(name = "GeocodeAttentionReason_GeocodeAttentionReason")
    protected Boolean geocodeAttentionReasonGeocodeAttentionReason;
    @XmlElement(name = "GeocodeMethod_GeocodeMethod")
    protected Boolean geocodeMethodGeocodeMethod;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "LastOrderDate")
    protected Boolean lastOrderDate;
    @XmlElement(name = "PhoneNumber")
    protected Boolean phoneNumber;
    @XmlElement(name = "ServiceAreaOverride")
    protected Boolean serviceAreaOverride;
    @XmlElement(name = "ServiceRadiusOverride")
    protected Boolean serviceRadiusOverride;
    @XmlElement(name = "StandardInstructions")
    protected Boolean standardInstructions;
    @XmlElement(name = "VariableFee")
    protected Boolean variableFee;
    @XmlElement(name = "WorldTimeZone_TimeZone")
    protected Boolean worldTimeZoneTimeZone;
    @XmlElement(name = "Zone")
    protected Boolean zone;

    /**
     * Obtém o valor da propriedade accessPoints.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccessPoints() {
        return accessPoints;
    }

    /**
     * Define o valor da propriedade accessPoints.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessPoints(Boolean value) {
        this.accessPoints = value;
    }

    /**
     * Obtém o valor da propriedade accessPointsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocationAccessPointPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<LocationAccessPointPropertyOptions> getAccessPointsOptions() {
        return accessPointsOptions;
    }

    /**
     * Define o valor da propriedade accessPointsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocationAccessPointPropertyOptions }{@code >}
     *     
     */
    public void setAccessPointsOptions(JAXBElement<LocationAccessPointPropertyOptions> value) {
        this.accessPointsOptions = value;
    }

    /**
     * Obtém o valor da propriedade accountEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountEntityKey() {
        return accountEntityKey;
    }

    /**
     * Define o valor da propriedade accountEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountEntityKey(Boolean value) {
        this.accountEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddress(Boolean value) {
        this.address = value;
    }

    /**
     * Obtém o valor da propriedade alternateContact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlternateContact() {
        return alternateContact;
    }

    /**
     * Define o valor da propriedade alternateContact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlternateContact(Boolean value) {
        this.alternateContact = value;
    }

    /**
     * Obtém o valor da propriedade alternatePhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlternatePhoneNumber() {
        return alternatePhoneNumber;
    }

    /**
     * Define o valor da propriedade alternatePhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlternatePhoneNumber(Boolean value) {
        this.alternatePhoneNumber = value;
    }

    /**
     * Obtém o valor da propriedade bulkThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBulkThreshold() {
        return bulkThreshold;
    }

    /**
     * Define o valor da propriedade bulkThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBulkThreshold(Boolean value) {
        this.bulkThreshold = value;
    }

    /**
     * Obtém o valor da propriedade comments.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComments() {
        return comments;
    }

    /**
     * Define o valor da propriedade comments.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComments(Boolean value) {
        this.comments = value;
    }

    /**
     * Obtém o valor da propriedade commentsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocationCommentPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<LocationCommentPropertyOptions> getCommentsOptions() {
        return commentsOptions;
    }

    /**
     * Define o valor da propriedade commentsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocationCommentPropertyOptions }{@code >}
     *     
     */
    public void setCommentsOptions(JAXBElement<LocationCommentPropertyOptions> value) {
        this.commentsOptions = value;
    }

    /**
     * Obtém o valor da propriedade contact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContact() {
        return contact;
    }

    /**
     * Define o valor da propriedade contact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContact(Boolean value) {
        this.contact = value;
    }

    /**
     * Obtém o valor da propriedade coordinate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoordinate() {
        return coordinate;
    }

    /**
     * Define o valor da propriedade coordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoordinate(Boolean value) {
        this.coordinate = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade faxNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFaxNumber() {
        return faxNumber;
    }

    /**
     * Define o valor da propriedade faxNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFaxNumber(Boolean value) {
        this.faxNumber = value;
    }

    /**
     * Obtém o valor da propriedade fixedFee.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixedFee() {
        return fixedFee;
    }

    /**
     * Define o valor da propriedade fixedFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedFee(Boolean value) {
        this.fixedFee = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAccuracyGeocodeAccuracy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocodeAccuracyGeocodeAccuracy() {
        return geocodeAccuracyGeocodeAccuracy;
    }

    /**
     * Define o valor da propriedade geocodeAccuracyGeocodeAccuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocodeAccuracyGeocodeAccuracy(Boolean value) {
        this.geocodeAccuracyGeocodeAccuracy = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAttentionReasonGeocodeAttentionReason.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocodeAttentionReasonGeocodeAttentionReason() {
        return geocodeAttentionReasonGeocodeAttentionReason;
    }

    /**
     * Define o valor da propriedade geocodeAttentionReasonGeocodeAttentionReason.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocodeAttentionReasonGeocodeAttentionReason(Boolean value) {
        this.geocodeAttentionReasonGeocodeAttentionReason = value;
    }

    /**
     * Obtém o valor da propriedade geocodeMethodGeocodeMethod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocodeMethodGeocodeMethod() {
        return geocodeMethodGeocodeMethod;
    }

    /**
     * Define o valor da propriedade geocodeMethodGeocodeMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocodeMethodGeocodeMethod(Boolean value) {
        this.geocodeMethodGeocodeMethod = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifier(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isLastOrderDate() {
        return lastOrderDate;
    }

    /**
     * Define o valor da propriedade lastOrderDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastOrderDate(Boolean value) {
        this.lastOrderDate = value;
    }

    /**
     * Obtém o valor da propriedade phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Define o valor da propriedade phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhoneNumber(Boolean value) {
        this.phoneNumber = value;
    }

    /**
     * Obtém o valor da propriedade serviceAreaOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceAreaOverride() {
        return serviceAreaOverride;
    }

    /**
     * Define o valor da propriedade serviceAreaOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceAreaOverride(Boolean value) {
        this.serviceAreaOverride = value;
    }

    /**
     * Obtém o valor da propriedade serviceRadiusOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceRadiusOverride() {
        return serviceRadiusOverride;
    }

    /**
     * Define o valor da propriedade serviceRadiusOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceRadiusOverride(Boolean value) {
        this.serviceRadiusOverride = value;
    }

    /**
     * Obtém o valor da propriedade standardInstructions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandardInstructions() {
        return standardInstructions;
    }

    /**
     * Define o valor da propriedade standardInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandardInstructions(Boolean value) {
        this.standardInstructions = value;
    }

    /**
     * Obtém o valor da propriedade variableFee.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVariableFee() {
        return variableFee;
    }

    /**
     * Define o valor da propriedade variableFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVariableFee(Boolean value) {
        this.variableFee = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorldTimeZoneTimeZone() {
        return worldTimeZoneTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorldTimeZoneTimeZone(Boolean value) {
        this.worldTimeZoneTimeZone = value;
    }

    /**
     * Obtém o valor da propriedade zone.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZone() {
        return zone;
    }

    /**
     * Define o valor da propriedade zone.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZone(Boolean value) {
        this.zone = value;
    }

}
