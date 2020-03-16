
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.ArrayOfDataWarehouseOperationsUnitPermission;


/**
 * <p>Classe Java de Role complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Role"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AggregateRootPermissions" type="{http://roadnet.com/apex/DataContracts/}ArrayOfAggregateRootPermission" minOccurs="0"/&gt;
 *         &lt;element name="ClientApplicationPermissions" type="{http://roadnet.com/apex/DataContracts/}ArrayOfClientApplicationPermission" minOccurs="0"/&gt;
 *         &lt;element name="CompliancePermissionLevel_CompliancePermission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompliancePermissions" type="{http://roadnet.com/apex/DataContracts/}CompliancePermissions" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsAdmin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ListOfPermission_Permissions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="OperationsUnitPermissions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}ArrayOfDataWarehouseOperationsUnitPermission" minOccurs="0"/&gt;
 *         &lt;element name="RoleType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Role", propOrder = {
    "aggregateRootPermissions",
    "clientApplicationPermissions",
    "compliancePermissionLevelCompliancePermission",
    "compliancePermissions",
    "description",
    "identifier",
    "isAdmin",
    "isDeleted",
    "listOfPermissionPermissions",
    "operationsUnitPermissions",
    "roleTypeType"
})
public class Role
    extends AggregateRootEntity
{

    @XmlElementRef(name = "AggregateRootPermissions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAggregateRootPermission> aggregateRootPermissions;
    @XmlElementRef(name = "ClientApplicationPermissions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfClientApplicationPermission> clientApplicationPermissions;
    @XmlElementRef(name = "CompliancePermissionLevel_CompliancePermission", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compliancePermissionLevelCompliancePermission;
    @XmlElementRef(name = "CompliancePermissions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<CompliancePermissions> compliancePermissions;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "IsAdmin")
    protected Boolean isAdmin;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElementRef(name = "ListOfPermission_Permissions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> listOfPermissionPermissions;
    @XmlElementRef(name = "OperationsUnitPermissions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDataWarehouseOperationsUnitPermission> operationsUnitPermissions;
    @XmlElementRef(name = "RoleType_Type", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roleTypeType;

    /**
     * Obtém o valor da propriedade aggregateRootPermissions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAggregateRootPermission }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAggregateRootPermission> getAggregateRootPermissions() {
        return aggregateRootPermissions;
    }

    /**
     * Define o valor da propriedade aggregateRootPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAggregateRootPermission }{@code >}
     *     
     */
    public void setAggregateRootPermissions(JAXBElement<ArrayOfAggregateRootPermission> value) {
        this.aggregateRootPermissions = value;
    }

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
     * Obtém o valor da propriedade compliancePermissionLevelCompliancePermission.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompliancePermissionLevelCompliancePermission() {
        return compliancePermissionLevelCompliancePermission;
    }

    /**
     * Define o valor da propriedade compliancePermissionLevelCompliancePermission.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompliancePermissionLevelCompliancePermission(JAXBElement<String> value) {
        this.compliancePermissionLevelCompliancePermission = value;
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
     * Obtém o valor da propriedade operationsUnitPermissions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseOperationsUnitPermission }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDataWarehouseOperationsUnitPermission> getOperationsUnitPermissions() {
        return operationsUnitPermissions;
    }

    /**
     * Define o valor da propriedade operationsUnitPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseOperationsUnitPermission }{@code >}
     *     
     */
    public void setOperationsUnitPermissions(JAXBElement<ArrayOfDataWarehouseOperationsUnitPermission> value) {
        this.operationsUnitPermissions = value;
    }

    /**
     * Obtém o valor da propriedade roleTypeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoleTypeType() {
        return roleTypeType;
    }

    /**
     * Define o valor da propriedade roleTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoleTypeType(JAXBElement<String> value) {
        this.roleTypeType = value;
    }

}
