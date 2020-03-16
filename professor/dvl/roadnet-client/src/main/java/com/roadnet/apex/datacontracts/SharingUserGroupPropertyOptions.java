
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de SharingUserGroupPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SharingUserGroupPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OwnerEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SharingUserGroupAccessType_AccessType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SharingUserGroupType_GroupType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UserEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharingUserGroupPropertyOptions", propOrder = {
    "isDeleted",
    "name",
    "ownerEntityKey",
    "sharingUserGroupAccessTypeAccessType",
    "sharingUserGroupTypeGroupType",
    "userEntityKeys"
})
public class SharingUserGroupPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "Name")
    protected Boolean name;
    @XmlElement(name = "OwnerEntityKey")
    protected Boolean ownerEntityKey;
    @XmlElement(name = "SharingUserGroupAccessType_AccessType")
    protected Boolean sharingUserGroupAccessTypeAccessType;
    @XmlElement(name = "SharingUserGroupType_GroupType")
    protected Boolean sharingUserGroupTypeGroupType;
    @XmlElement(name = "UserEntityKeys")
    protected Boolean userEntityKeys;

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
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setName(Boolean value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade ownerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOwnerEntityKey() {
        return ownerEntityKey;
    }

    /**
     * Define o valor da propriedade ownerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwnerEntityKey(Boolean value) {
        this.ownerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade sharingUserGroupAccessTypeAccessType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSharingUserGroupAccessTypeAccessType() {
        return sharingUserGroupAccessTypeAccessType;
    }

    /**
     * Define o valor da propriedade sharingUserGroupAccessTypeAccessType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSharingUserGroupAccessTypeAccessType(Boolean value) {
        this.sharingUserGroupAccessTypeAccessType = value;
    }

    /**
     * Obtém o valor da propriedade sharingUserGroupTypeGroupType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSharingUserGroupTypeGroupType() {
        return sharingUserGroupTypeGroupType;
    }

    /**
     * Define o valor da propriedade sharingUserGroupTypeGroupType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSharingUserGroupTypeGroupType(Boolean value) {
        this.sharingUserGroupTypeGroupType = value;
    }

    /**
     * Obtém o valor da propriedade userEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserEntityKeys() {
        return userEntityKeys;
    }

    /**
     * Define o valor da propriedade userEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserEntityKeys(Boolean value) {
        this.userEntityKeys = value;
    }

}
