
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AttachCustomerParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AttachCustomerParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessUnitIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EnableCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsFromProduction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MapDatasetEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OverwriteExistingCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProductionCustomerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ProductionMapEditsPath" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeedCustomerDatabase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UploadedCustomerDBFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserEmailAdress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachCustomerParameters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.AttachCustomer", propOrder = {
    "businessUnitIdentifier",
    "customerEntityKey",
    "enableCustomer",
    "isFromProduction",
    "mapDatasetEntityKey",
    "overwriteExistingCustomer",
    "productionCustomerEntityKey",
    "productionMapEditsPath",
    "regionIdentifier",
    "seedCustomerDatabase",
    "uploadedCustomerDBFileName",
    "userEmailAdress"
})
public class AttachCustomerParameters {

    @XmlElementRef(name = "BusinessUnitIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.AttachCustomer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessUnitIdentifier;
    @XmlElement(name = "CustomerEntityKey")
    protected Long customerEntityKey;
    @XmlElement(name = "EnableCustomer")
    protected Boolean enableCustomer;
    @XmlElement(name = "IsFromProduction")
    protected Boolean isFromProduction;
    @XmlElement(name = "MapDatasetEntityKey")
    protected Long mapDatasetEntityKey;
    @XmlElement(name = "OverwriteExistingCustomer")
    protected Boolean overwriteExistingCustomer;
    @XmlElement(name = "ProductionCustomerEntityKey")
    protected Long productionCustomerEntityKey;
    @XmlElement(name = "ProductionMapEditsPath")
    protected Long productionMapEditsPath;
    @XmlElementRef(name = "RegionIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.AttachCustomer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionIdentifier;
    @XmlElement(name = "SeedCustomerDatabase")
    protected Boolean seedCustomerDatabase;
    @XmlElementRef(name = "UploadedCustomerDBFileName", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.AttachCustomer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uploadedCustomerDBFileName;
    @XmlElementRef(name = "UserEmailAdress", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.AttachCustomer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userEmailAdress;

    /**
     * Obtém o valor da propriedade businessUnitIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessUnitIdentifier() {
        return businessUnitIdentifier;
    }

    /**
     * Define o valor da propriedade businessUnitIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessUnitIdentifier(JAXBElement<String> value) {
        this.businessUnitIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade customerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerEntityKey() {
        return customerEntityKey;
    }

    /**
     * Define o valor da propriedade customerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerEntityKey(Long value) {
        this.customerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade enableCustomer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableCustomer() {
        return enableCustomer;
    }

    /**
     * Define o valor da propriedade enableCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableCustomer(Boolean value) {
        this.enableCustomer = value;
    }

    /**
     * Obtém o valor da propriedade isFromProduction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFromProduction() {
        return isFromProduction;
    }

    /**
     * Define o valor da propriedade isFromProduction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFromProduction(Boolean value) {
        this.isFromProduction = value;
    }

    /**
     * Obtém o valor da propriedade mapDatasetEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMapDatasetEntityKey() {
        return mapDatasetEntityKey;
    }

    /**
     * Define o valor da propriedade mapDatasetEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMapDatasetEntityKey(Long value) {
        this.mapDatasetEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade overwriteExistingCustomer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverwriteExistingCustomer() {
        return overwriteExistingCustomer;
    }

    /**
     * Define o valor da propriedade overwriteExistingCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverwriteExistingCustomer(Boolean value) {
        this.overwriteExistingCustomer = value;
    }

    /**
     * Obtém o valor da propriedade productionCustomerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductionCustomerEntityKey() {
        return productionCustomerEntityKey;
    }

    /**
     * Define o valor da propriedade productionCustomerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductionCustomerEntityKey(Long value) {
        this.productionCustomerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade productionMapEditsPath.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductionMapEditsPath() {
        return productionMapEditsPath;
    }

    /**
     * Define o valor da propriedade productionMapEditsPath.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductionMapEditsPath(Long value) {
        this.productionMapEditsPath = value;
    }

    /**
     * Obtém o valor da propriedade regionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegionIdentifier() {
        return regionIdentifier;
    }

    /**
     * Define o valor da propriedade regionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegionIdentifier(JAXBElement<String> value) {
        this.regionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade seedCustomerDatabase.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeedCustomerDatabase() {
        return seedCustomerDatabase;
    }

    /**
     * Define o valor da propriedade seedCustomerDatabase.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeedCustomerDatabase(Boolean value) {
        this.seedCustomerDatabase = value;
    }

    /**
     * Obtém o valor da propriedade uploadedCustomerDBFileName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUploadedCustomerDBFileName() {
        return uploadedCustomerDBFileName;
    }

    /**
     * Define o valor da propriedade uploadedCustomerDBFileName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUploadedCustomerDBFileName(JAXBElement<String> value) {
        this.uploadedCustomerDBFileName = value;
    }

    /**
     * Obtém o valor da propriedade userEmailAdress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserEmailAdress() {
        return userEmailAdress;
    }

    /**
     * Define o valor da propriedade userEmailAdress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserEmailAdress(JAXBElement<String> value) {
        this.userEmailAdress = value;
    }

}
