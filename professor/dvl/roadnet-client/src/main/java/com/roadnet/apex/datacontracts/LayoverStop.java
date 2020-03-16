
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LayoverStop complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LayoverStop"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}NonServiceableStop"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Departure" type="{http://roadnet.com/apex/DataContracts/}LayoverDeparture" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeAccuracy_LayoverLocationGeocodeAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationAccountEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationAddress" type="{http://roadnet.com/apex/DataContracts/}Address" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationAlternateContact" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationContact" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationFixedFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationIsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationServiceAreaOverride" type="{http://roadnet.com/apex/DataContracts/}ServiceAreaBase" minOccurs="0"/&gt;
 *         &lt;element name="LayoverLocationStandardInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayoverStop", propOrder = {
    "departure",
    "geocodeAccuracyLayoverLocationGeocodeAccuracy",
    "layoverLocationAccountEntityKey",
    "layoverLocationAddress",
    "layoverLocationAlternateContact",
    "layoverLocationContact",
    "layoverLocationDescription",
    "layoverLocationEntityKey",
    "layoverLocationFixedFee",
    "layoverLocationIdentifier",
    "layoverLocationIsDeleted",
    "layoverLocationPhoneNumber",
    "layoverLocationServiceAreaOverride",
    "layoverLocationStandardInstructions"
})
public class LayoverStop
    extends NonServiceableStop
{

    @XmlElementRef(name = "Departure", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<LayoverDeparture> departure;
    @XmlElementRef(name = "GeocodeAccuracy_LayoverLocationGeocodeAccuracy", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geocodeAccuracyLayoverLocationGeocodeAccuracy;
    @XmlElementRef(name = "LayoverLocationAccountEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> layoverLocationAccountEntityKey;
    @XmlElementRef(name = "LayoverLocationAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> layoverLocationAddress;
    @XmlElementRef(name = "LayoverLocationAlternateContact", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> layoverLocationAlternateContact;
    @XmlElementRef(name = "LayoverLocationContact", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> layoverLocationContact;
    @XmlElementRef(name = "LayoverLocationDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> layoverLocationDescription;
    @XmlElementRef(name = "LayoverLocationEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> layoverLocationEntityKey;
    @XmlElement(name = "LayoverLocationFixedFee")
    protected Double layoverLocationFixedFee;
    @XmlElementRef(name = "LayoverLocationIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> layoverLocationIdentifier;
    @XmlElement(name = "LayoverLocationIsDeleted")
    protected Boolean layoverLocationIsDeleted;
    @XmlElementRef(name = "LayoverLocationPhoneNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> layoverLocationPhoneNumber;
    @XmlElementRef(name = "LayoverLocationServiceAreaOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceAreaBase> layoverLocationServiceAreaOverride;
    @XmlElementRef(name = "LayoverLocationStandardInstructions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> layoverLocationStandardInstructions;

    /**
     * Obtém o valor da propriedade departure.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LayoverDeparture }{@code >}
     *     
     */
    public JAXBElement<LayoverDeparture> getDeparture() {
        return departure;
    }

    /**
     * Define o valor da propriedade departure.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LayoverDeparture }{@code >}
     *     
     */
    public void setDeparture(JAXBElement<LayoverDeparture> value) {
        this.departure = value;
    }

    /**
     * Obtém o valor da propriedade geocodeAccuracyLayoverLocationGeocodeAccuracy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeocodeAccuracyLayoverLocationGeocodeAccuracy() {
        return geocodeAccuracyLayoverLocationGeocodeAccuracy;
    }

    /**
     * Define o valor da propriedade geocodeAccuracyLayoverLocationGeocodeAccuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeocodeAccuracyLayoverLocationGeocodeAccuracy(JAXBElement<String> value) {
        this.geocodeAccuracyLayoverLocationGeocodeAccuracy = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationAccountEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLayoverLocationAccountEntityKey() {
        return layoverLocationAccountEntityKey;
    }

    /**
     * Define o valor da propriedade layoverLocationAccountEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLayoverLocationAccountEntityKey(JAXBElement<Long> value) {
        this.layoverLocationAccountEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getLayoverLocationAddress() {
        return layoverLocationAddress;
    }

    /**
     * Define o valor da propriedade layoverLocationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setLayoverLocationAddress(JAXBElement<Address> value) {
        this.layoverLocationAddress = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationAlternateContact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getLayoverLocationAlternateContact() {
        return layoverLocationAlternateContact;
    }

    /**
     * Define o valor da propriedade layoverLocationAlternateContact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setLayoverLocationAlternateContact(JAXBElement<PersonName> value) {
        this.layoverLocationAlternateContact = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationContact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getLayoverLocationContact() {
        return layoverLocationContact;
    }

    /**
     * Define o valor da propriedade layoverLocationContact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setLayoverLocationContact(JAXBElement<PersonName> value) {
        this.layoverLocationContact = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLayoverLocationDescription() {
        return layoverLocationDescription;
    }

    /**
     * Define o valor da propriedade layoverLocationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLayoverLocationDescription(JAXBElement<String> value) {
        this.layoverLocationDescription = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLayoverLocationEntityKey() {
        return layoverLocationEntityKey;
    }

    /**
     * Define o valor da propriedade layoverLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLayoverLocationEntityKey(JAXBElement<Long> value) {
        this.layoverLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationFixedFee.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLayoverLocationFixedFee() {
        return layoverLocationFixedFee;
    }

    /**
     * Define o valor da propriedade layoverLocationFixedFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLayoverLocationFixedFee(Double value) {
        this.layoverLocationFixedFee = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLayoverLocationIdentifier() {
        return layoverLocationIdentifier;
    }

    /**
     * Define o valor da propriedade layoverLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLayoverLocationIdentifier(JAXBElement<String> value) {
        this.layoverLocationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationIsDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLayoverLocationIsDeleted() {
        return layoverLocationIsDeleted;
    }

    /**
     * Define o valor da propriedade layoverLocationIsDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLayoverLocationIsDeleted(Boolean value) {
        this.layoverLocationIsDeleted = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationPhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLayoverLocationPhoneNumber() {
        return layoverLocationPhoneNumber;
    }

    /**
     * Define o valor da propriedade layoverLocationPhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLayoverLocationPhoneNumber(JAXBElement<String> value) {
        this.layoverLocationPhoneNumber = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationServiceAreaOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceAreaBase }{@code >}
     *     
     */
    public JAXBElement<ServiceAreaBase> getLayoverLocationServiceAreaOverride() {
        return layoverLocationServiceAreaOverride;
    }

    /**
     * Define o valor da propriedade layoverLocationServiceAreaOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceAreaBase }{@code >}
     *     
     */
    public void setLayoverLocationServiceAreaOverride(JAXBElement<ServiceAreaBase> value) {
        this.layoverLocationServiceAreaOverride = value;
    }

    /**
     * Obtém o valor da propriedade layoverLocationStandardInstructions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLayoverLocationStandardInstructions() {
        return layoverLocationStandardInstructions;
    }

    /**
     * Define o valor da propriedade layoverLocationStandardInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLayoverLocationStandardInstructions(JAXBElement<String> value) {
        this.layoverLocationStandardInstructions = value;
    }

}
