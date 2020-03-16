
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Classe Java de UserPermissions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UserPermissions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientApplicationPermissions" type="{http://roadnet.com/apex/DataContracts/}ArrayOfClientApplicationPermission" minOccurs="0"/&gt;
 *         &lt;element name="CompliancePermission" type="{http://roadnet.com/apex/DataContracts/}Role.CompliancePermissionLevel" minOccurs="0"/&gt;
 *         &lt;element name="CompliancePermissions" type="{http://roadnet.com/apex/DataContracts/}CompliancePermissions" minOccurs="0"/&gt;
 *         &lt;element name="DeletableEntities" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="ExperimentalFeatureCodes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="IsAdmin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsComplianceOnlyCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCompressedDataSetMessageEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDepotOptionInRegionContextEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsNavigationOnlyCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsOmnitracsOneEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsQtracsEntityManagementEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRealTimeTrafficEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRegionHierarchyEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTelematicsOnlyCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ListOfPermission_Permissions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="ListOfPurchasableFeaturesEx_PurchasedFeaturesEx" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="PurchasedFeatures" type="{http://roadnet.com/apex/DataContracts/}PurchasableFeatures" minOccurs="0"/&gt;
 *         &lt;element name="PurchasedModules" type="{http://roadnet.com/apex/DataContracts/}PurchasableModules" minOccurs="0"/&gt;
 *         &lt;element name="SavableEntities" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="TransferableEntities" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="UseCoPilotNavigation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseLegacyXrsIntegration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="XrsIntegrationType" type="{http://roadnet.com/apex/DataContracts/}XrsIntegrationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserPermissions", propOrder = {
    "clientApplicationPermissions",
    "compliancePermission",
    "compliancePermissions",
    "deletableEntities",
    "experimentalFeatureCodes",
    "isAdmin",
    "isComplianceOnlyCustomer",
    "isCompressedDataSetMessageEnabled",
    "isDepotOptionInRegionContextEnabled",
    "isNavigationOnlyCustomer",
    "isOmnitracsOneEnabled",
    "isQtracsEntityManagementEnabled",
    "isRealTimeTrafficEnabled",
    "isRegionHierarchyEnabled",
    "isTelematicsOnlyCustomer",
    "listOfPermissionPermissions",
    "listOfPurchasableFeaturesExPurchasedFeaturesEx",
    "purchasedFeatures",
    "purchasedModules",
    "savableEntities",
    "transferableEntities",
    "useCoPilotNavigation",
    "useLegacyXrsIntegration",
    "xrsIntegrationType"
})
public class UserPermissions {

    @XmlElementRef(name = "ClientApplicationPermissions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfClientApplicationPermission> clientApplicationPermissions;
    @XmlElement(name = "CompliancePermission")
    @XmlSchemaType(name = "string")
    protected RoleCompliancePermissionLevel compliancePermission;
    @XmlElementRef(name = "CompliancePermissions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<CompliancePermissions> compliancePermissions;
    @XmlElementRef(name = "DeletableEntities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> deletableEntities;
    @XmlElementRef(name = "ExperimentalFeatureCodes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> experimentalFeatureCodes;
    @XmlElement(name = "IsAdmin")
    protected Boolean isAdmin;
    @XmlElement(name = "IsComplianceOnlyCustomer")
    protected Boolean isComplianceOnlyCustomer;
    @XmlElement(name = "IsCompressedDataSetMessageEnabled")
    protected Boolean isCompressedDataSetMessageEnabled;
    @XmlElement(name = "IsDepotOptionInRegionContextEnabled")
    protected Boolean isDepotOptionInRegionContextEnabled;
    @XmlElement(name = "IsNavigationOnlyCustomer")
    protected Boolean isNavigationOnlyCustomer;
    @XmlElement(name = "IsOmnitracsOneEnabled")
    protected Boolean isOmnitracsOneEnabled;
    @XmlElement(name = "IsQtracsEntityManagementEnabled")
    protected Boolean isQtracsEntityManagementEnabled;
    @XmlElement(name = "IsRealTimeTrafficEnabled")
    protected Boolean isRealTimeTrafficEnabled;
    @XmlElement(name = "IsRegionHierarchyEnabled")
    protected Boolean isRegionHierarchyEnabled;
    @XmlElement(name = "IsTelematicsOnlyCustomer")
    protected Boolean isTelematicsOnlyCustomer;
    @XmlElementRef(name = "ListOfPermission_Permissions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> listOfPermissionPermissions;
    @XmlElementRef(name = "ListOfPurchasableFeaturesEx_PurchasedFeaturesEx", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> listOfPurchasableFeaturesExPurchasedFeaturesEx;
    @XmlList
    @XmlElement(name = "PurchasedFeatures")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> purchasedFeatures;
    @XmlList
    @XmlElement(name = "PurchasedModules")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> purchasedModules;
    @XmlElementRef(name = "SavableEntities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> savableEntities;
    @XmlElementRef(name = "TransferableEntities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> transferableEntities;
    @XmlElement(name = "UseCoPilotNavigation")
    protected Boolean useCoPilotNavigation;
    @XmlElement(name = "UseLegacyXrsIntegration")
    protected Boolean useLegacyXrsIntegration;
    @XmlElement(name = "XrsIntegrationType")
    @XmlSchemaType(name = "string")
    protected XrsIntegrationType xrsIntegrationType;

    /**
     * Obtém o valor da propriedade clientApplicationPermissions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClientApplicationPermission }{@code >}
     *     
     */
    public JAXBElement<ArrayOfClientApplicationPermission> getClientApplicationPermissions() {
        return clientApplicationPermissions;
    }

    /**
     * Define o valor da propriedade clientApplicationPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClientApplicationPermission }{@code >}
     *     
     */
    public void setClientApplicationPermissions(JAXBElement<ArrayOfClientApplicationPermission> value) {
        this.clientApplicationPermissions = value;
    }

    /**
     * Obtém o valor da propriedade compliancePermission.
     * 
     * @return
     *     possible object is
     *     {@link RoleCompliancePermissionLevel }
     *     
     */
    public RoleCompliancePermissionLevel getCompliancePermission() {
        return compliancePermission;
    }

    /**
     * Define o valor da propriedade compliancePermission.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleCompliancePermissionLevel }
     *     
     */
    public void setCompliancePermission(RoleCompliancePermissionLevel value) {
        this.compliancePermission = value;
    }

    /**
     * Obtém o valor da propriedade compliancePermissions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompliancePermissions }{@code >}
     *     
     */
    public JAXBElement<CompliancePermissions> getCompliancePermissions() {
        return compliancePermissions;
    }

    /**
     * Define o valor da propriedade compliancePermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompliancePermissions }{@code >}
     *     
     */
    public void setCompliancePermissions(JAXBElement<CompliancePermissions> value) {
        this.compliancePermissions = value;
    }

    /**
     * Obtém o valor da propriedade deletableEntities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getDeletableEntities() {
        return deletableEntities;
    }

    /**
     * Define o valor da propriedade deletableEntities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setDeletableEntities(JAXBElement<ArrayOfstring> value) {
        this.deletableEntities = value;
    }

    /**
     * Obtém o valor da propriedade experimentalFeatureCodes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getExperimentalFeatureCodes() {
        return experimentalFeatureCodes;
    }

    /**
     * Define o valor da propriedade experimentalFeatureCodes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setExperimentalFeatureCodes(JAXBElement<ArrayOfstring> value) {
        this.experimentalFeatureCodes = value;
    }

    /**
     * Obtém o valor da propriedade isAdmin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdmin() {
        return isAdmin;
    }

    /**
     * Define o valor da propriedade isAdmin.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdmin(Boolean value) {
        this.isAdmin = value;
    }

    /**
     * Obtém o valor da propriedade isComplianceOnlyCustomer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsComplianceOnlyCustomer() {
        return isComplianceOnlyCustomer;
    }

    /**
     * Define o valor da propriedade isComplianceOnlyCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsComplianceOnlyCustomer(Boolean value) {
        this.isComplianceOnlyCustomer = value;
    }

    /**
     * Obtém o valor da propriedade isCompressedDataSetMessageEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCompressedDataSetMessageEnabled() {
        return isCompressedDataSetMessageEnabled;
    }

    /**
     * Define o valor da propriedade isCompressedDataSetMessageEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCompressedDataSetMessageEnabled(Boolean value) {
        this.isCompressedDataSetMessageEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isDepotOptionInRegionContextEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDepotOptionInRegionContextEnabled() {
        return isDepotOptionInRegionContextEnabled;
    }

    /**
     * Define o valor da propriedade isDepotOptionInRegionContextEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDepotOptionInRegionContextEnabled(Boolean value) {
        this.isDepotOptionInRegionContextEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isNavigationOnlyCustomer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNavigationOnlyCustomer() {
        return isNavigationOnlyCustomer;
    }

    /**
     * Define o valor da propriedade isNavigationOnlyCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNavigationOnlyCustomer(Boolean value) {
        this.isNavigationOnlyCustomer = value;
    }

    /**
     * Obtém o valor da propriedade isOmnitracsOneEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOmnitracsOneEnabled() {
        return isOmnitracsOneEnabled;
    }

    /**
     * Define o valor da propriedade isOmnitracsOneEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOmnitracsOneEnabled(Boolean value) {
        this.isOmnitracsOneEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isQtracsEntityManagementEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsQtracsEntityManagementEnabled() {
        return isQtracsEntityManagementEnabled;
    }

    /**
     * Define o valor da propriedade isQtracsEntityManagementEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsQtracsEntityManagementEnabled(Boolean value) {
        this.isQtracsEntityManagementEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isRealTimeTrafficEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRealTimeTrafficEnabled() {
        return isRealTimeTrafficEnabled;
    }

    /**
     * Define o valor da propriedade isRealTimeTrafficEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRealTimeTrafficEnabled(Boolean value) {
        this.isRealTimeTrafficEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isRegionHierarchyEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRegionHierarchyEnabled() {
        return isRegionHierarchyEnabled;
    }

    /**
     * Define o valor da propriedade isRegionHierarchyEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRegionHierarchyEnabled(Boolean value) {
        this.isRegionHierarchyEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isTelematicsOnlyCustomer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTelematicsOnlyCustomer() {
        return isTelematicsOnlyCustomer;
    }

    /**
     * Define o valor da propriedade isTelematicsOnlyCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTelematicsOnlyCustomer(Boolean value) {
        this.isTelematicsOnlyCustomer = value;
    }

    /**
     * Obtém o valor da propriedade listOfPermissionPermissions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getListOfPermissionPermissions() {
        return listOfPermissionPermissions;
    }

    /**
     * Define o valor da propriedade listOfPermissionPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setListOfPermissionPermissions(JAXBElement<ArrayOfstring> value) {
        this.listOfPermissionPermissions = value;
    }

    /**
     * Obtém o valor da propriedade listOfPurchasableFeaturesExPurchasedFeaturesEx.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getListOfPurchasableFeaturesExPurchasedFeaturesEx() {
        return listOfPurchasableFeaturesExPurchasedFeaturesEx;
    }

    /**
     * Define o valor da propriedade listOfPurchasableFeaturesExPurchasedFeaturesEx.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setListOfPurchasableFeaturesExPurchasedFeaturesEx(JAXBElement<ArrayOfstring> value) {
        this.listOfPurchasableFeaturesExPurchasedFeaturesEx = value;
    }

    /**
     * Gets the value of the purchasedFeatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchasedFeatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchasedFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPurchasedFeatures() {
        if (purchasedFeatures == null) {
            purchasedFeatures = new ArrayList<String>();
        }
        return this.purchasedFeatures;
    }

    /**
     * Gets the value of the purchasedModules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchasedModules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchasedModules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPurchasedModules() {
        if (purchasedModules == null) {
            purchasedModules = new ArrayList<String>();
        }
        return this.purchasedModules;
    }

    /**
     * Obtém o valor da propriedade savableEntities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getSavableEntities() {
        return savableEntities;
    }

    /**
     * Define o valor da propriedade savableEntities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setSavableEntities(JAXBElement<ArrayOfstring> value) {
        this.savableEntities = value;
    }

    /**
     * Obtém o valor da propriedade transferableEntities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getTransferableEntities() {
        return transferableEntities;
    }

    /**
     * Define o valor da propriedade transferableEntities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setTransferableEntities(JAXBElement<ArrayOfstring> value) {
        this.transferableEntities = value;
    }

    /**
     * Obtém o valor da propriedade useCoPilotNavigation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCoPilotNavigation() {
        return useCoPilotNavigation;
    }

    /**
     * Define o valor da propriedade useCoPilotNavigation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCoPilotNavigation(Boolean value) {
        this.useCoPilotNavigation = value;
    }

    /**
     * Obtém o valor da propriedade useLegacyXrsIntegration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseLegacyXrsIntegration() {
        return useLegacyXrsIntegration;
    }

    /**
     * Define o valor da propriedade useLegacyXrsIntegration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLegacyXrsIntegration(Boolean value) {
        this.useLegacyXrsIntegration = value;
    }

    /**
     * Obtém o valor da propriedade xrsIntegrationType.
     * 
     * @return
     *     possible object is
     *     {@link XrsIntegrationType }
     *     
     */
    public XrsIntegrationType getXrsIntegrationType() {
        return xrsIntegrationType;
    }

    /**
     * Define o valor da propriedade xrsIntegrationType.
     * 
     * @param value
     *     allowed object is
     *     {@link XrsIntegrationType }
     *     
     */
    public void setXrsIntegrationType(XrsIntegrationType value) {
        this.xrsIntegrationType = value;
    }

}
