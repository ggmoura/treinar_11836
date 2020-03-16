
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de LineItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LineItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DamagedQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="DamagedQuantitiesReasonCode" type="{http://roadnet.com/apex/DataContracts/}QuantityReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="DamagedQuantitiesReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsDriverAdded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileQuantityItemSource_Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantitiesReasonCode" type="{http://roadnet.com/apex/DataContracts/}QuantityReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantitiesReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlannedQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="QuantitiesDifference" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="QuantitiesPercentageDifference" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="QuantitiesReasonCode" type="{http://roadnet.com/apex/DataContracts/}QuantityReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="QuantitiesReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuantityInputQuality_QuantityInputQuality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuantityInputTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SKUDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SKUEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SKUIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SKUIsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SKUPackageTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SKUPackageTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SKUPackageTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SKUProductTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SKUProductTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SKUProductTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantitiesReasonCode" type="{http://roadnet.com/apex/DataContracts/}QuantityReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantitiesReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VerificationHistory" type="{http://roadnet.com/apex/DataContracts/}ArrayOfVerificationHistoryItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItem", propOrder = {
    "damagedQuantities",
    "damagedQuantitiesReasonCode",
    "damagedQuantitiesReasonCodeDescription",
    "identifier",
    "isDriverAdded",
    "lineItemTypeType",
    "mobileQuantityItemSourceSource",
    "overQuantities",
    "overQuantitiesReasonCode",
    "overQuantitiesReasonCodeDescription",
    "plannedQuantities",
    "quantities",
    "quantitiesDifference",
    "quantitiesPercentageDifference",
    "quantitiesReasonCode",
    "quantitiesReasonCodeDescription",
    "quantityInputQualityQuantityInputQuality",
    "quantityInputTimestamp",
    "skuDescription",
    "skuEntityKey",
    "skuIdentifier",
    "skuIsDeleted",
    "skuPackageTypeDescription",
    "skuPackageTypeEntityKey",
    "skuPackageTypeIdentifier",
    "skuProductTypeDescription",
    "skuProductTypeEntityKey",
    "skuProductTypeIdentifier",
    "shortQuantities",
    "shortQuantitiesReasonCode",
    "shortQuantitiesReasonCodeDescription",
    "verificationHistory"
})
public class LineItem
    extends DomainEntity
{

    @XmlElementRef(name = "DamagedQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> damagedQuantities;
    @XmlElementRef(name = "DamagedQuantitiesReasonCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QuantityReasonCode> damagedQuantitiesReasonCode;
    @XmlElementRef(name = "DamagedQuantitiesReasonCodeDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> damagedQuantitiesReasonCodeDescription;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "IsDriverAdded")
    protected Boolean isDriverAdded;
    @XmlElementRef(name = "LineItemType_Type", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineItemTypeType;
    @XmlElementRef(name = "MobileQuantityItemSource_Source", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileQuantityItemSourceSource;
    @XmlElementRef(name = "OverQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> overQuantities;
    @XmlElementRef(name = "OverQuantitiesReasonCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QuantityReasonCode> overQuantitiesReasonCode;
    @XmlElementRef(name = "OverQuantitiesReasonCodeDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> overQuantitiesReasonCodeDescription;
    @XmlElementRef(name = "PlannedQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> plannedQuantities;
    @XmlElementRef(name = "Quantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> quantities;
    @XmlElementRef(name = "QuantitiesDifference", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> quantitiesDifference;
    @XmlElementRef(name = "QuantitiesPercentageDifference", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> quantitiesPercentageDifference;
    @XmlElementRef(name = "QuantitiesReasonCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QuantityReasonCode> quantitiesReasonCode;
    @XmlElementRef(name = "QuantitiesReasonCodeDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quantitiesReasonCodeDescription;
    @XmlElementRef(name = "QuantityInputQuality_QuantityInputQuality", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quantityInputQualityQuantityInputQuality;
    @XmlElementRef(name = "QuantityInputTimestamp", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> quantityInputTimestamp;
    @XmlElementRef(name = "SKUDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> skuDescription;
    @XmlElement(name = "SKUEntityKey")
    protected Long skuEntityKey;
    @XmlElementRef(name = "SKUIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> skuIdentifier;
    @XmlElement(name = "SKUIsDeleted")
    protected Boolean skuIsDeleted;
    @XmlElementRef(name = "SKUPackageTypeDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> skuPackageTypeDescription;
    @XmlElement(name = "SKUPackageTypeEntityKey")
    protected Long skuPackageTypeEntityKey;
    @XmlElementRef(name = "SKUPackageTypeIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> skuPackageTypeIdentifier;
    @XmlElementRef(name = "SKUProductTypeDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> skuProductTypeDescription;
    @XmlElementRef(name = "SKUProductTypeEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> skuProductTypeEntityKey;
    @XmlElementRef(name = "SKUProductTypeIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> skuProductTypeIdentifier;
    @XmlElementRef(name = "ShortQuantities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> shortQuantities;
    @XmlElementRef(name = "ShortQuantitiesReasonCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QuantityReasonCode> shortQuantitiesReasonCode;
    @XmlElementRef(name = "ShortQuantitiesReasonCodeDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shortQuantitiesReasonCodeDescription;
    @XmlElementRef(name = "VerificationHistory", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVerificationHistoryItem> verificationHistory;

    /**
     * Obtém o valor da propriedade damagedQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getDamagedQuantities() {
        return damagedQuantities;
    }

    /**
     * Define o valor da propriedade damagedQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setDamagedQuantities(JAXBElement<Quantities> value) {
        this.damagedQuantities = value;
    }

    /**
     * Obtém o valor da propriedade damagedQuantitiesReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCode }{@code >}
     *     
     */
    public JAXBElement<QuantityReasonCode> getDamagedQuantitiesReasonCode() {
        return damagedQuantitiesReasonCode;
    }

    /**
     * Define o valor da propriedade damagedQuantitiesReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCode }{@code >}
     *     
     */
    public void setDamagedQuantitiesReasonCode(JAXBElement<QuantityReasonCode> value) {
        this.damagedQuantitiesReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade damagedQuantitiesReasonCodeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDamagedQuantitiesReasonCodeDescription() {
        return damagedQuantitiesReasonCodeDescription;
    }

    /**
     * Define o valor da propriedade damagedQuantitiesReasonCodeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDamagedQuantitiesReasonCodeDescription(JAXBElement<String> value) {
        this.damagedQuantitiesReasonCodeDescription = value;
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
     * Obtém o valor da propriedade isDriverAdded.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDriverAdded() {
        return isDriverAdded;
    }

    /**
     * Define o valor da propriedade isDriverAdded.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDriverAdded(Boolean value) {
        this.isDriverAdded = value;
    }

    /**
     * Obtém o valor da propriedade lineItemTypeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineItemTypeType() {
        return lineItemTypeType;
    }

    /**
     * Define o valor da propriedade lineItemTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineItemTypeType(JAXBElement<String> value) {
        this.lineItemTypeType = value;
    }

    /**
     * Obtém o valor da propriedade mobileQuantityItemSourceSource.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileQuantityItemSourceSource() {
        return mobileQuantityItemSourceSource;
    }

    /**
     * Define o valor da propriedade mobileQuantityItemSourceSource.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileQuantityItemSourceSource(JAXBElement<String> value) {
        this.mobileQuantityItemSourceSource = value;
    }

    /**
     * Obtém o valor da propriedade overQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getOverQuantities() {
        return overQuantities;
    }

    /**
     * Define o valor da propriedade overQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setOverQuantities(JAXBElement<Quantities> value) {
        this.overQuantities = value;
    }

    /**
     * Obtém o valor da propriedade overQuantitiesReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCode }{@code >}
     *     
     */
    public JAXBElement<QuantityReasonCode> getOverQuantitiesReasonCode() {
        return overQuantitiesReasonCode;
    }

    /**
     * Define o valor da propriedade overQuantitiesReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCode }{@code >}
     *     
     */
    public void setOverQuantitiesReasonCode(JAXBElement<QuantityReasonCode> value) {
        this.overQuantitiesReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade overQuantitiesReasonCodeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOverQuantitiesReasonCodeDescription() {
        return overQuantitiesReasonCodeDescription;
    }

    /**
     * Define o valor da propriedade overQuantitiesReasonCodeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOverQuantitiesReasonCodeDescription(JAXBElement<String> value) {
        this.overQuantitiesReasonCodeDescription = value;
    }

    /**
     * Obtém o valor da propriedade plannedQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getPlannedQuantities() {
        return plannedQuantities;
    }

    /**
     * Define o valor da propriedade plannedQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setPlannedQuantities(JAXBElement<Quantities> value) {
        this.plannedQuantities = value;
    }

    /**
     * Obtém o valor da propriedade quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getQuantities() {
        return quantities;
    }

    /**
     * Define o valor da propriedade quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setQuantities(JAXBElement<Quantities> value) {
        this.quantities = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesDifference.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getQuantitiesDifference() {
        return quantitiesDifference;
    }

    /**
     * Define o valor da propriedade quantitiesDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setQuantitiesDifference(JAXBElement<Quantities> value) {
        this.quantitiesDifference = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesPercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getQuantitiesPercentageDifference() {
        return quantitiesPercentageDifference;
    }

    /**
     * Define o valor da propriedade quantitiesPercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setQuantitiesPercentageDifference(JAXBElement<Quantities> value) {
        this.quantitiesPercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCode }{@code >}
     *     
     */
    public JAXBElement<QuantityReasonCode> getQuantitiesReasonCode() {
        return quantitiesReasonCode;
    }

    /**
     * Define o valor da propriedade quantitiesReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCode }{@code >}
     *     
     */
    public void setQuantitiesReasonCode(JAXBElement<QuantityReasonCode> value) {
        this.quantitiesReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesReasonCodeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantitiesReasonCodeDescription() {
        return quantitiesReasonCodeDescription;
    }

    /**
     * Define o valor da propriedade quantitiesReasonCodeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantitiesReasonCodeDescription(JAXBElement<String> value) {
        this.quantitiesReasonCodeDescription = value;
    }

    /**
     * Obtém o valor da propriedade quantityInputQualityQuantityInputQuality.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantityInputQualityQuantityInputQuality() {
        return quantityInputQualityQuantityInputQuality;
    }

    /**
     * Define o valor da propriedade quantityInputQualityQuantityInputQuality.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantityInputQualityQuantityInputQuality(JAXBElement<String> value) {
        this.quantityInputQualityQuantityInputQuality = value;
    }

    /**
     * Obtém o valor da propriedade quantityInputTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getQuantityInputTimestamp() {
        return quantityInputTimestamp;
    }

    /**
     * Define o valor da propriedade quantityInputTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setQuantityInputTimestamp(JAXBElement<XMLGregorianCalendar> value) {
        this.quantityInputTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade skuDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSKUDescription() {
        return skuDescription;
    }

    /**
     * Define o valor da propriedade skuDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSKUDescription(JAXBElement<String> value) {
        this.skuDescription = value;
    }

    /**
     * Obtém o valor da propriedade skuEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSKUEntityKey() {
        return skuEntityKey;
    }

    /**
     * Define o valor da propriedade skuEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSKUEntityKey(Long value) {
        this.skuEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade skuIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSKUIdentifier() {
        return skuIdentifier;
    }

    /**
     * Define o valor da propriedade skuIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSKUIdentifier(JAXBElement<String> value) {
        this.skuIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade skuIsDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSKUIsDeleted() {
        return skuIsDeleted;
    }

    /**
     * Define o valor da propriedade skuIsDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSKUIsDeleted(Boolean value) {
        this.skuIsDeleted = value;
    }

    /**
     * Obtém o valor da propriedade skuPackageTypeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSKUPackageTypeDescription() {
        return skuPackageTypeDescription;
    }

    /**
     * Define o valor da propriedade skuPackageTypeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSKUPackageTypeDescription(JAXBElement<String> value) {
        this.skuPackageTypeDescription = value;
    }

    /**
     * Obtém o valor da propriedade skuPackageTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSKUPackageTypeEntityKey() {
        return skuPackageTypeEntityKey;
    }

    /**
     * Define o valor da propriedade skuPackageTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSKUPackageTypeEntityKey(Long value) {
        this.skuPackageTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade skuPackageTypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSKUPackageTypeIdentifier() {
        return skuPackageTypeIdentifier;
    }

    /**
     * Define o valor da propriedade skuPackageTypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSKUPackageTypeIdentifier(JAXBElement<String> value) {
        this.skuPackageTypeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade skuProductTypeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSKUProductTypeDescription() {
        return skuProductTypeDescription;
    }

    /**
     * Define o valor da propriedade skuProductTypeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSKUProductTypeDescription(JAXBElement<String> value) {
        this.skuProductTypeDescription = value;
    }

    /**
     * Obtém o valor da propriedade skuProductTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSKUProductTypeEntityKey() {
        return skuProductTypeEntityKey;
    }

    /**
     * Define o valor da propriedade skuProductTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSKUProductTypeEntityKey(JAXBElement<Long> value) {
        this.skuProductTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade skuProductTypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSKUProductTypeIdentifier() {
        return skuProductTypeIdentifier;
    }

    /**
     * Define o valor da propriedade skuProductTypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSKUProductTypeIdentifier(JAXBElement<String> value) {
        this.skuProductTypeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade shortQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getShortQuantities() {
        return shortQuantities;
    }

    /**
     * Define o valor da propriedade shortQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setShortQuantities(JAXBElement<Quantities> value) {
        this.shortQuantities = value;
    }

    /**
     * Obtém o valor da propriedade shortQuantitiesReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCode }{@code >}
     *     
     */
    public JAXBElement<QuantityReasonCode> getShortQuantitiesReasonCode() {
        return shortQuantitiesReasonCode;
    }

    /**
     * Define o valor da propriedade shortQuantitiesReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCode }{@code >}
     *     
     */
    public void setShortQuantitiesReasonCode(JAXBElement<QuantityReasonCode> value) {
        this.shortQuantitiesReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade shortQuantitiesReasonCodeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShortQuantitiesReasonCodeDescription() {
        return shortQuantitiesReasonCodeDescription;
    }

    /**
     * Define o valor da propriedade shortQuantitiesReasonCodeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShortQuantitiesReasonCodeDescription(JAXBElement<String> value) {
        this.shortQuantitiesReasonCodeDescription = value;
    }

    /**
     * Obtém o valor da propriedade verificationHistory.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVerificationHistoryItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVerificationHistoryItem> getVerificationHistory() {
        return verificationHistory;
    }

    /**
     * Define o valor da propriedade verificationHistory.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVerificationHistoryItem }{@code >}
     *     
     */
    public void setVerificationHistory(JAXBElement<ArrayOfVerificationHistoryItem> value) {
        this.verificationHistory = value;
    }

}
