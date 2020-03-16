
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * <p>Classe Java de SharingUserGroupSearchResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SharingUserGroupSearchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}SearchResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OwnerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SharingUserGroup_SharingUserGroupAccessType_AccessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharingUserGroupSearchResult", propOrder = {
    "entityKey",
    "name",
    "ownerEntityKey",
    "sharingUserGroupSharingUserGroupAccessTypeAccessType",
    "userEntityKeys",
    "version"
})
public class SharingUserGroupSearchResult
    extends SearchResult
{

    @XmlElement(name = "EntityKey")
    protected Long entityKey;
    @XmlElementRef(name = "Name", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "OwnerEntityKey")
    protected Long ownerEntityKey;
    @XmlElementRef(name = "SharingUserGroup_SharingUserGroupAccessType_AccessType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sharingUserGroupSharingUserGroupAccessTypeAccessType;
    @XmlElementRef(name = "UserEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> userEntityKeys;
    @XmlElement(name = "Version")
    protected Long version;

    /**
     * Obtém o valor da propriedade entityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntityKey() {
        return entityKey;
    }

    /**
     * Define o valor da propriedade entityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntityKey(Long value) {
        this.entityKey = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
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
     * Obtém o valor da propriedade sharingUserGroupSharingUserGroupAccessTypeAccessType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSharingUserGroupSharingUserGroupAccessTypeAccessType() {
        return sharingUserGroupSharingUserGroupAccessTypeAccessType;
    }

    /**
     * Define o valor da propriedade sharingUserGroupSharingUserGroupAccessTypeAccessType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSharingUserGroupSharingUserGroupAccessTypeAccessType(JAXBElement<String> value) {
        this.sharingUserGroupSharingUserGroupAccessTypeAccessType = value;
    }

    /**
     * Obtém o valor da propriedade userEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getUserEntityKeys() {
        return userEntityKeys;
    }

    /**
     * Define o valor da propriedade userEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setUserEntityKeys(JAXBElement<ArrayOflong> value) {
        this.userEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade version.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Define o valor da propriedade version.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersion(Long value) {
        this.version = value;
    }

}
