
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ShareableEntityAccess complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ShareableEntityAccess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityType_ShareableEntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OwnerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ShareableEntityAccessPermission_Permission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShareableEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SharingUserGroupEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UserEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareableEntityAccess", propOrder = {
    "entityTypeShareableEntityType",
    "ownerEntityKey",
    "shareableEntityAccessPermissionPermission",
    "shareableEntityKey",
    "sharingUserGroupEntityKey",
    "userEntityKey"
})
public class ShareableEntityAccess
    extends AggregateRootEntity
{

    @XmlElementRef(name = "EntityType_ShareableEntityType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityTypeShareableEntityType;
    @XmlElement(name = "OwnerEntityKey")
    protected Long ownerEntityKey;
    @XmlElementRef(name = "ShareableEntityAccessPermission_Permission", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shareableEntityAccessPermissionPermission;
    @XmlElement(name = "ShareableEntityKey")
    protected Long shareableEntityKey;
    @XmlElementRef(name = "SharingUserGroupEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> sharingUserGroupEntityKey;
    @XmlElementRef(name = "UserEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> userEntityKey;

    /**
     * Obtém o valor da propriedade entityTypeShareableEntityType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityTypeShareableEntityType() {
        return entityTypeShareableEntityType;
    }

    /**
     * Define o valor da propriedade entityTypeShareableEntityType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityTypeShareableEntityType(JAXBElement<String> value) {
        this.entityTypeShareableEntityType = value;
    }

    /**
     * Obtém o valor da propriedade ownerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOwnerEntityKey() {
        return ownerEntityKey;
    }

    /**
     * Define o valor da propriedade ownerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOwnerEntityKey(Long value) {
        this.ownerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade shareableEntityAccessPermissionPermission.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShareableEntityAccessPermissionPermission() {
        return shareableEntityAccessPermissionPermission;
    }

    /**
     * Define o valor da propriedade shareableEntityAccessPermissionPermission.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShareableEntityAccessPermissionPermission(JAXBElement<String> value) {
        this.shareableEntityAccessPermissionPermission = value;
    }

    /**
     * Obtém o valor da propriedade shareableEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShareableEntityKey() {
        return shareableEntityKey;
    }

    /**
     * Define o valor da propriedade shareableEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShareableEntityKey(Long value) {
        this.shareableEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade sharingUserGroupEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSharingUserGroupEntityKey() {
        return sharingUserGroupEntityKey;
    }

    /**
     * Define o valor da propriedade sharingUserGroupEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSharingUserGroupEntityKey(JAXBElement<Long> value) {
        this.sharingUserGroupEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade userEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUserEntityKey() {
        return userEntityKey;
    }

    /**
     * Define o valor da propriedade userEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUserEntityKey(JAXBElement<Long> value) {
        this.userEntityKey = value;
    }

}
