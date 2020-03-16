
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de ShareableEntityAccessPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ShareableEntityAccessPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityType_ShareableEntityType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OwnerEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShareableEntityAccessPermission_Permission" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShareableEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SharingUserGroupEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UserEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareableEntityAccessPropertyOptions", propOrder = {
    "entityTypeShareableEntityType",
    "ownerEntityKey",
    "shareableEntityAccessPermissionPermission",
    "shareableEntityKey",
    "sharingUserGroupEntityKey",
    "userEntityKey"
})
public class ShareableEntityAccessPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "EntityType_ShareableEntityType")
    protected Boolean entityTypeShareableEntityType;
    @XmlElement(name = "OwnerEntityKey")
    protected Boolean ownerEntityKey;
    @XmlElement(name = "ShareableEntityAccessPermission_Permission")
    protected Boolean shareableEntityAccessPermissionPermission;
    @XmlElement(name = "ShareableEntityKey")
    protected Boolean shareableEntityKey;
    @XmlElement(name = "SharingUserGroupEntityKey")
    protected Boolean sharingUserGroupEntityKey;
    @XmlElement(name = "UserEntityKey")
    protected Boolean userEntityKey;

    /**
     * Obtém o valor da propriedade entityTypeShareableEntityType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntityTypeShareableEntityType() {
        return entityTypeShareableEntityType;
    }

    /**
     * Define o valor da propriedade entityTypeShareableEntityType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntityTypeShareableEntityType(Boolean value) {
        this.entityTypeShareableEntityType = value;
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
     * Obtém o valor da propriedade shareableEntityAccessPermissionPermission.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShareableEntityAccessPermissionPermission() {
        return shareableEntityAccessPermissionPermission;
    }

    /**
     * Define o valor da propriedade shareableEntityAccessPermissionPermission.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShareableEntityAccessPermissionPermission(Boolean value) {
        this.shareableEntityAccessPermissionPermission = value;
    }

    /**
     * Obtém o valor da propriedade shareableEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShareableEntityKey() {
        return shareableEntityKey;
    }

    /**
     * Define o valor da propriedade shareableEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShareableEntityKey(Boolean value) {
        this.shareableEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade sharingUserGroupEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSharingUserGroupEntityKey() {
        return sharingUserGroupEntityKey;
    }

    /**
     * Define o valor da propriedade sharingUserGroupEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSharingUserGroupEntityKey(Boolean value) {
        this.sharingUserGroupEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade userEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserEntityKey() {
        return userEntityKey;
    }

    /**
     * Define o valor da propriedade userEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserEntityKey(Boolean value) {
        this.userEntityKey = value;
    }

}
