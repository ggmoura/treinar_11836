
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de LocationDimensionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LocationDimensionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AccountOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}AccountDimensionPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="CreatedInRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseLocationType_LocationType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsAggregate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCategory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCategoryOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}ServiceLocationCategoryDimensionPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationDimensionPropertyOptions", propOrder = {
    "account",
    "accountOptions",
    "createdInRegionIdentifier",
    "dataWarehouseLocationTypeLocationType",
    "description",
    "isAggregate",
    "locationIdentifier",
    "serviceLocationCategory",
    "serviceLocationCategoryOptions",
    "type"
})
public class LocationDimensionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "Account")
    protected Boolean account;
    @XmlElementRef(name = "AccountOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountDimensionPropertyOptions> accountOptions;
    @XmlElement(name = "CreatedInRegionIdentifier")
    protected Boolean createdInRegionIdentifier;
    @XmlElement(name = "DataWarehouseLocationType_LocationType")
    protected Boolean dataWarehouseLocationTypeLocationType;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "IsAggregate")
    protected Boolean isAggregate;
    @XmlElement(name = "LocationIdentifier")
    protected Boolean locationIdentifier;
    @XmlElement(name = "ServiceLocationCategory")
    protected Boolean serviceLocationCategory;
    @XmlElementRef(name = "ServiceLocationCategoryOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceLocationCategoryDimensionPropertyOptions> serviceLocationCategoryOptions;
    @XmlElement(name = "Type")
    protected Boolean type;

    /**
     * Obtém o valor da propriedade account.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccount() {
        return account;
    }

    /**
     * Define o valor da propriedade account.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccount(Boolean value) {
        this.account = value;
    }

    /**
     * Obtém o valor da propriedade accountOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountDimensionPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<AccountDimensionPropertyOptions> getAccountOptions() {
        return accountOptions;
    }

    /**
     * Define o valor da propriedade accountOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountDimensionPropertyOptions }{@code >}
     *     
     */
    public void setAccountOptions(JAXBElement<AccountDimensionPropertyOptions> value) {
        this.accountOptions = value;
    }

    /**
     * Obtém o valor da propriedade createdInRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreatedInRegionIdentifier() {
        return createdInRegionIdentifier;
    }

    /**
     * Define o valor da propriedade createdInRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreatedInRegionIdentifier(Boolean value) {
        this.createdInRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseLocationTypeLocationType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseLocationTypeLocationType() {
        return dataWarehouseLocationTypeLocationType;
    }

    /**
     * Define o valor da propriedade dataWarehouseLocationTypeLocationType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseLocationTypeLocationType(Boolean value) {
        this.dataWarehouseLocationTypeLocationType = value;
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
     * Obtém o valor da propriedade isAggregate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAggregate() {
        return isAggregate;
    }

    /**
     * Define o valor da propriedade isAggregate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAggregate(Boolean value) {
        this.isAggregate = value;
    }

    /**
     * Obtém o valor da propriedade locationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationIdentifier() {
        return locationIdentifier;
    }

    /**
     * Define o valor da propriedade locationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationIdentifier(Boolean value) {
        this.locationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCategory.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceLocationCategory() {
        return serviceLocationCategory;
    }

    /**
     * Define o valor da propriedade serviceLocationCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceLocationCategory(Boolean value) {
        this.serviceLocationCategory = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCategoryOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceLocationCategoryDimensionPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ServiceLocationCategoryDimensionPropertyOptions> getServiceLocationCategoryOptions() {
        return serviceLocationCategoryOptions;
    }

    /**
     * Define o valor da propriedade serviceLocationCategoryOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceLocationCategoryDimensionPropertyOptions }{@code >}
     *     
     */
    public void setServiceLocationCategoryOptions(JAXBElement<ServiceLocationCategoryDimensionPropertyOptions> value) {
        this.serviceLocationCategoryOptions = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setType(Boolean value) {
        this.type = value;
    }

}
