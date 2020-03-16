
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de RolePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RolePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AggregateRootPermissions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ClientApplicationPermissions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ClientApplicationPermissionsOptions" type="{http://roadnet.com/apex/DataContracts/}ClientApplicationPermissionPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="CompliancePermissions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsAdmin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ListOfPermission_Permissions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OperationsUnitPermissions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RoleType_Type" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RolePropertyOptions", propOrder = {
    "aggregateRootPermissions",
    "clientApplicationPermissions",
    "clientApplicationPermissionsOptions",
    "compliancePermissions",
    "description",
    "identifier",
    "isAdmin",
    "isDeleted",
    "listOfPermissionPermissions",
    "operationsUnitPermissions",
    "roleTypeType"
})
public class RolePropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "AggregateRootPermissions")
    protected Boolean aggregateRootPermissions;
    @XmlElement(name = "ClientApplicationPermissions")
    protected Boolean clientApplicationPermissions;
    @XmlElementRef(name = "ClientApplicationPermissionsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ClientApplicationPermissionPropertyOptions> clientApplicationPermissionsOptions;
    @XmlElement(name = "CompliancePermissions")
    protected Boolean compliancePermissions;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsAdmin")
    protected Boolean isAdmin;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "ListOfPermission_Permissions")
    protected Boolean listOfPermissionPermissions;
    @XmlElement(name = "OperationsUnitPermissions")
    protected Boolean operationsUnitPermissions;
    @XmlElement(name = "RoleType_Type")
    protected Boolean roleTypeType;

    /**
     * Obtém o valor da propriedade aggregateRootPermissions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAggregateRootPermissions() {
        return aggregateRootPermissions;
    }

    /**
     * Define o valor da propriedade aggregateRootPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAggregateRootPermissions(Boolean value) {
        this.aggregateRootPermissions = value;
    }

    /**
     * Obtém o valor da propriedade clientApplicationPermissions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClientApplicationPermissions() {
        return clientApplicationPermissions;
    }

    /**
     * Define o valor da propriedade clientApplicationPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClientApplicationPermissions(Boolean value) {
        this.clientApplicationPermissions = value;
    }

    /**
     * Obtém o valor da propriedade clientApplicationPermissionsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClientApplicationPermissionPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ClientApplicationPermissionPropertyOptions> getClientApplicationPermissionsOptions() {
        return clientApplicationPermissionsOptions;
    }

    /**
     * Define o valor da propriedade clientApplicationPermissionsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClientApplicationPermissionPropertyOptions }{@code >}
     *     
     */
    public void setClientApplicationPermissionsOptions(JAXBElement<ClientApplicationPermissionPropertyOptions> value) {
        this.clientApplicationPermissionsOptions = value;
    }

    /**
     * Obtém o valor da propriedade compliancePermissions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompliancePermissions() {
        return compliancePermissions;
    }

    /**
     * Define o valor da propriedade compliancePermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompliancePermissions(Boolean value) {
        this.compliancePermissions = value;
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
     *     {@link Boolean }
     *     
     */
    public Boolean isListOfPermissionPermissions() {
        return listOfPermissionPermissions;
    }

    /**
     * Define o valor da propriedade listOfPermissionPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setListOfPermissionPermissions(Boolean value) {
        this.listOfPermissionPermissions = value;
    }

    /**
     * Obtém o valor da propriedade operationsUnitPermissions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOperationsUnitPermissions() {
        return operationsUnitPermissions;
    }

    /**
     * Define o valor da propriedade operationsUnitPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOperationsUnitPermissions(Boolean value) {
        this.operationsUnitPermissions = value;
    }

    /**
     * Obtém o valor da propriedade roleTypeType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoleTypeType() {
        return roleTypeType;
    }

    /**
     * Define o valor da propriedade roleTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoleTypeType(Boolean value) {
        this.roleTypeType = value;
    }

}
