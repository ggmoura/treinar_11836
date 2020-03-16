
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de LineItemPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LineItemPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DamagedQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DamagedQuantitiesReasonCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DamagedQuantitiesReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DamagedQuantitiesReasonCodeOptions" type="{http://roadnet.com/apex/DataContracts/}QuantityReasonCodePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDriverAdded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemType_Type" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileQuantityItemSource_Source" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantitiesReasonCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantitiesReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantitiesReasonCodeOptions" type="{http://roadnet.com/apex/DataContracts/}QuantityReasonCodePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="PlannedQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Quantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QuantitiesDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QuantitiesPercentageDifference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QuantitiesReasonCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QuantitiesReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QuantitiesReasonCodeOptions" type="{http://roadnet.com/apex/DataContracts/}QuantityReasonCodePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="QuantityInputQuality_QuantityInputQuality" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QuantityInputTimestamp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SKUDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SKUEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SKUIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SKUIsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SKUPackageTypeDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SKUPackageTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SKUPackageTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SKUProductTypeDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SKUProductTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SKUProductTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantitiesReasonCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantitiesReasonCodeDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantitiesReasonCodeOptions" type="{http://roadnet.com/apex/DataContracts/}QuantityReasonCodePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="VerificationHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VerificationHistoryOptions" type="{http://roadnet.com/apex/DataContracts/}VerificationHistoryItemPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemPropertyOptions", propOrder = {
    "damagedQuantities",
    "damagedQuantitiesReasonCode",
    "damagedQuantitiesReasonCodeDescription",
    "damagedQuantitiesReasonCodeOptions",
    "identifier",
    "isDriverAdded",
    "lineItemTypeType",
    "mobileQuantityItemSourceSource",
    "overQuantities",
    "overQuantitiesReasonCode",
    "overQuantitiesReasonCodeDescription",
    "overQuantitiesReasonCodeOptions",
    "plannedQuantities",
    "quantities",
    "quantitiesDifference",
    "quantitiesPercentageDifference",
    "quantitiesReasonCode",
    "quantitiesReasonCodeDescription",
    "quantitiesReasonCodeOptions",
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
    "shortQuantitiesReasonCodeOptions",
    "verificationHistory",
    "verificationHistoryOptions"
})
public class LineItemPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "DamagedQuantities")
    protected Boolean damagedQuantities;
    @XmlElement(name = "DamagedQuantitiesReasonCode")
    protected Boolean damagedQuantitiesReasonCode;
    @XmlElement(name = "DamagedQuantitiesReasonCodeDescription")
    protected Boolean damagedQuantitiesReasonCodeDescription;
    @XmlElementRef(name = "DamagedQuantitiesReasonCodeOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QuantityReasonCodePropertyOptions> damagedQuantitiesReasonCodeOptions;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsDriverAdded")
    protected Boolean isDriverAdded;
    @XmlElement(name = "LineItemType_Type")
    protected Boolean lineItemTypeType;
    @XmlElement(name = "MobileQuantityItemSource_Source")
    protected Boolean mobileQuantityItemSourceSource;
    @XmlElement(name = "OverQuantities")
    protected Boolean overQuantities;
    @XmlElement(name = "OverQuantitiesReasonCode")
    protected Boolean overQuantitiesReasonCode;
    @XmlElement(name = "OverQuantitiesReasonCodeDescription")
    protected Boolean overQuantitiesReasonCodeDescription;
    @XmlElementRef(name = "OverQuantitiesReasonCodeOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QuantityReasonCodePropertyOptions> overQuantitiesReasonCodeOptions;
    @XmlElement(name = "PlannedQuantities")
    protected Boolean plannedQuantities;
    @XmlElement(name = "Quantities")
    protected Boolean quantities;
    @XmlElement(name = "QuantitiesDifference")
    protected Boolean quantitiesDifference;
    @XmlElement(name = "QuantitiesPercentageDifference")
    protected Boolean quantitiesPercentageDifference;
    @XmlElement(name = "QuantitiesReasonCode")
    protected Boolean quantitiesReasonCode;
    @XmlElement(name = "QuantitiesReasonCodeDescription")
    protected Boolean quantitiesReasonCodeDescription;
    @XmlElementRef(name = "QuantitiesReasonCodeOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QuantityReasonCodePropertyOptions> quantitiesReasonCodeOptions;
    @XmlElement(name = "QuantityInputQuality_QuantityInputQuality")
    protected Boolean quantityInputQualityQuantityInputQuality;
    @XmlElement(name = "QuantityInputTimestamp")
    protected Boolean quantityInputTimestamp;
    @XmlElement(name = "SKUDescription")
    protected Boolean skuDescription;
    @XmlElement(name = "SKUEntityKey")
    protected Boolean skuEntityKey;
    @XmlElement(name = "SKUIdentifier")
    protected Boolean skuIdentifier;
    @XmlElement(name = "SKUIsDeleted")
    protected Boolean skuIsDeleted;
    @XmlElement(name = "SKUPackageTypeDescription")
    protected Boolean skuPackageTypeDescription;
    @XmlElement(name = "SKUPackageTypeEntityKey")
    protected Boolean skuPackageTypeEntityKey;
    @XmlElement(name = "SKUPackageTypeIdentifier")
    protected Boolean skuPackageTypeIdentifier;
    @XmlElement(name = "SKUProductTypeDescription")
    protected Boolean skuProductTypeDescription;
    @XmlElement(name = "SKUProductTypeEntityKey")
    protected Boolean skuProductTypeEntityKey;
    @XmlElement(name = "SKUProductTypeIdentifier")
    protected Boolean skuProductTypeIdentifier;
    @XmlElement(name = "ShortQuantities")
    protected Boolean shortQuantities;
    @XmlElement(name = "ShortQuantitiesReasonCode")
    protected Boolean shortQuantitiesReasonCode;
    @XmlElement(name = "ShortQuantitiesReasonCodeDescription")
    protected Boolean shortQuantitiesReasonCodeDescription;
    @XmlElementRef(name = "ShortQuantitiesReasonCodeOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<QuantityReasonCodePropertyOptions> shortQuantitiesReasonCodeOptions;
    @XmlElement(name = "VerificationHistory")
    protected Boolean verificationHistory;
    @XmlElementRef(name = "VerificationHistoryOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<VerificationHistoryItemPropertyOptions> verificationHistoryOptions;

    /**
     * Obtém o valor da propriedade damagedQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDamagedQuantities() {
        return damagedQuantities;
    }

    /**
     * Define o valor da propriedade damagedQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDamagedQuantities(Boolean value) {
        this.damagedQuantities = value;
    }

    /**
     * Obtém o valor da propriedade damagedQuantitiesReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDamagedQuantitiesReasonCode() {
        return damagedQuantitiesReasonCode;
    }

    /**
     * Define o valor da propriedade damagedQuantitiesReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDamagedQuantitiesReasonCode(Boolean value) {
        this.damagedQuantitiesReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade damagedQuantitiesReasonCodeDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDamagedQuantitiesReasonCodeDescription() {
        return damagedQuantitiesReasonCodeDescription;
    }

    /**
     * Define o valor da propriedade damagedQuantitiesReasonCodeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDamagedQuantitiesReasonCodeDescription(Boolean value) {
        this.damagedQuantitiesReasonCodeDescription = value;
    }

    /**
     * Obtém o valor da propriedade damagedQuantitiesReasonCodeOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCodePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<QuantityReasonCodePropertyOptions> getDamagedQuantitiesReasonCodeOptions() {
        return damagedQuantitiesReasonCodeOptions;
    }

    /**
     * Define o valor da propriedade damagedQuantitiesReasonCodeOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCodePropertyOptions }{@code >}
     *     
     */
    public void setDamagedQuantitiesReasonCodeOptions(JAXBElement<QuantityReasonCodePropertyOptions> value) {
        this.damagedQuantitiesReasonCodeOptions = value;
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
     *     {@link Boolean }
     *     
     */
    public Boolean isLineItemTypeType() {
        return lineItemTypeType;
    }

    /**
     * Define o valor da propriedade lineItemTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineItemTypeType(Boolean value) {
        this.lineItemTypeType = value;
    }

    /**
     * Obtém o valor da propriedade mobileQuantityItemSourceSource.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileQuantityItemSourceSource() {
        return mobileQuantityItemSourceSource;
    }

    /**
     * Define o valor da propriedade mobileQuantityItemSourceSource.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileQuantityItemSourceSource(Boolean value) {
        this.mobileQuantityItemSourceSource = value;
    }

    /**
     * Obtém o valor da propriedade overQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverQuantities() {
        return overQuantities;
    }

    /**
     * Define o valor da propriedade overQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverQuantities(Boolean value) {
        this.overQuantities = value;
    }

    /**
     * Obtém o valor da propriedade overQuantitiesReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverQuantitiesReasonCode() {
        return overQuantitiesReasonCode;
    }

    /**
     * Define o valor da propriedade overQuantitiesReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverQuantitiesReasonCode(Boolean value) {
        this.overQuantitiesReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade overQuantitiesReasonCodeDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverQuantitiesReasonCodeDescription() {
        return overQuantitiesReasonCodeDescription;
    }

    /**
     * Define o valor da propriedade overQuantitiesReasonCodeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverQuantitiesReasonCodeDescription(Boolean value) {
        this.overQuantitiesReasonCodeDescription = value;
    }

    /**
     * Obtém o valor da propriedade overQuantitiesReasonCodeOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCodePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<QuantityReasonCodePropertyOptions> getOverQuantitiesReasonCodeOptions() {
        return overQuantitiesReasonCodeOptions;
    }

    /**
     * Define o valor da propriedade overQuantitiesReasonCodeOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCodePropertyOptions }{@code >}
     *     
     */
    public void setOverQuantitiesReasonCodeOptions(JAXBElement<QuantityReasonCodePropertyOptions> value) {
        this.overQuantitiesReasonCodeOptions = value;
    }

    /**
     * Obtém o valor da propriedade plannedQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlannedQuantities() {
        return plannedQuantities;
    }

    /**
     * Define o valor da propriedade plannedQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlannedQuantities(Boolean value) {
        this.plannedQuantities = value;
    }

    /**
     * Obtém o valor da propriedade quantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantities() {
        return quantities;
    }

    /**
     * Define o valor da propriedade quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantities(Boolean value) {
        this.quantities = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantitiesDifference() {
        return quantitiesDifference;
    }

    /**
     * Define o valor da propriedade quantitiesDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantitiesDifference(Boolean value) {
        this.quantitiesDifference = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesPercentageDifference.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantitiesPercentageDifference() {
        return quantitiesPercentageDifference;
    }

    /**
     * Define o valor da propriedade quantitiesPercentageDifference.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantitiesPercentageDifference(Boolean value) {
        this.quantitiesPercentageDifference = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantitiesReasonCode() {
        return quantitiesReasonCode;
    }

    /**
     * Define o valor da propriedade quantitiesReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantitiesReasonCode(Boolean value) {
        this.quantitiesReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesReasonCodeDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantitiesReasonCodeDescription() {
        return quantitiesReasonCodeDescription;
    }

    /**
     * Define o valor da propriedade quantitiesReasonCodeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantitiesReasonCodeDescription(Boolean value) {
        this.quantitiesReasonCodeDescription = value;
    }

    /**
     * Obtém o valor da propriedade quantitiesReasonCodeOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCodePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<QuantityReasonCodePropertyOptions> getQuantitiesReasonCodeOptions() {
        return quantitiesReasonCodeOptions;
    }

    /**
     * Define o valor da propriedade quantitiesReasonCodeOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCodePropertyOptions }{@code >}
     *     
     */
    public void setQuantitiesReasonCodeOptions(JAXBElement<QuantityReasonCodePropertyOptions> value) {
        this.quantitiesReasonCodeOptions = value;
    }

    /**
     * Obtém o valor da propriedade quantityInputQualityQuantityInputQuality.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantityInputQualityQuantityInputQuality() {
        return quantityInputQualityQuantityInputQuality;
    }

    /**
     * Define o valor da propriedade quantityInputQualityQuantityInputQuality.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantityInputQualityQuantityInputQuality(Boolean value) {
        this.quantityInputQualityQuantityInputQuality = value;
    }

    /**
     * Obtém o valor da propriedade quantityInputTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantityInputTimestamp() {
        return quantityInputTimestamp;
    }

    /**
     * Define o valor da propriedade quantityInputTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantityInputTimestamp(Boolean value) {
        this.quantityInputTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade skuDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSKUDescription() {
        return skuDescription;
    }

    /**
     * Define o valor da propriedade skuDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSKUDescription(Boolean value) {
        this.skuDescription = value;
    }

    /**
     * Obtém o valor da propriedade skuEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSKUEntityKey() {
        return skuEntityKey;
    }

    /**
     * Define o valor da propriedade skuEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSKUEntityKey(Boolean value) {
        this.skuEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade skuIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSKUIdentifier() {
        return skuIdentifier;
    }

    /**
     * Define o valor da propriedade skuIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSKUIdentifier(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isSKUPackageTypeDescription() {
        return skuPackageTypeDescription;
    }

    /**
     * Define o valor da propriedade skuPackageTypeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSKUPackageTypeDescription(Boolean value) {
        this.skuPackageTypeDescription = value;
    }

    /**
     * Obtém o valor da propriedade skuPackageTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSKUPackageTypeEntityKey() {
        return skuPackageTypeEntityKey;
    }

    /**
     * Define o valor da propriedade skuPackageTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSKUPackageTypeEntityKey(Boolean value) {
        this.skuPackageTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade skuPackageTypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSKUPackageTypeIdentifier() {
        return skuPackageTypeIdentifier;
    }

    /**
     * Define o valor da propriedade skuPackageTypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSKUPackageTypeIdentifier(Boolean value) {
        this.skuPackageTypeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade skuProductTypeDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSKUProductTypeDescription() {
        return skuProductTypeDescription;
    }

    /**
     * Define o valor da propriedade skuProductTypeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSKUProductTypeDescription(Boolean value) {
        this.skuProductTypeDescription = value;
    }

    /**
     * Obtém o valor da propriedade skuProductTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSKUProductTypeEntityKey() {
        return skuProductTypeEntityKey;
    }

    /**
     * Define o valor da propriedade skuProductTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSKUProductTypeEntityKey(Boolean value) {
        this.skuProductTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade skuProductTypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSKUProductTypeIdentifier() {
        return skuProductTypeIdentifier;
    }

    /**
     * Define o valor da propriedade skuProductTypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSKUProductTypeIdentifier(Boolean value) {
        this.skuProductTypeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade shortQuantities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShortQuantities() {
        return shortQuantities;
    }

    /**
     * Define o valor da propriedade shortQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShortQuantities(Boolean value) {
        this.shortQuantities = value;
    }

    /**
     * Obtém o valor da propriedade shortQuantitiesReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShortQuantitiesReasonCode() {
        return shortQuantitiesReasonCode;
    }

    /**
     * Define o valor da propriedade shortQuantitiesReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShortQuantitiesReasonCode(Boolean value) {
        this.shortQuantitiesReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade shortQuantitiesReasonCodeDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShortQuantitiesReasonCodeDescription() {
        return shortQuantitiesReasonCodeDescription;
    }

    /**
     * Define o valor da propriedade shortQuantitiesReasonCodeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShortQuantitiesReasonCodeDescription(Boolean value) {
        this.shortQuantitiesReasonCodeDescription = value;
    }

    /**
     * Obtém o valor da propriedade shortQuantitiesReasonCodeOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCodePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<QuantityReasonCodePropertyOptions> getShortQuantitiesReasonCodeOptions() {
        return shortQuantitiesReasonCodeOptions;
    }

    /**
     * Define o valor da propriedade shortQuantitiesReasonCodeOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuantityReasonCodePropertyOptions }{@code >}
     *     
     */
    public void setShortQuantitiesReasonCodeOptions(JAXBElement<QuantityReasonCodePropertyOptions> value) {
        this.shortQuantitiesReasonCodeOptions = value;
    }

    /**
     * Obtém o valor da propriedade verificationHistory.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerificationHistory() {
        return verificationHistory;
    }

    /**
     * Define o valor da propriedade verificationHistory.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerificationHistory(Boolean value) {
        this.verificationHistory = value;
    }

    /**
     * Obtém o valor da propriedade verificationHistoryOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VerificationHistoryItemPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<VerificationHistoryItemPropertyOptions> getVerificationHistoryOptions() {
        return verificationHistoryOptions;
    }

    /**
     * Define o valor da propriedade verificationHistoryOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VerificationHistoryItemPropertyOptions }{@code >}
     *     
     */
    public void setVerificationHistoryOptions(JAXBElement<VerificationHistoryItemPropertyOptions> value) {
        this.verificationHistoryOptions = value;
    }

}
