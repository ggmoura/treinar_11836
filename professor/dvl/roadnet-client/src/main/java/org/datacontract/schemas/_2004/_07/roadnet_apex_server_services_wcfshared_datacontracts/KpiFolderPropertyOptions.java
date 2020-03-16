
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de KpiFolderPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="KpiFolderPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsShared" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Kpis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OwnerEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OwnerName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Settings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShareableEntityAccessPermission_Permission" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KpiFolderPropertyOptions", propOrder = {
    "isOwner",
    "isShared",
    "kpis",
    "name",
    "ownerEntityKey",
    "ownerName",
    "settings",
    "shareableEntityAccessPermissionPermission",
    "user"
})
public class KpiFolderPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "IsOwner")
    protected Boolean isOwner;
    @XmlElement(name = "IsShared")
    protected Boolean isShared;
    @XmlElement(name = "Kpis")
    protected Boolean kpis;
    @XmlElement(name = "Name")
    protected Boolean name;
    @XmlElement(name = "OwnerEntityKey")
    protected Boolean ownerEntityKey;
    @XmlElement(name = "OwnerName")
    protected Boolean ownerName;
    @XmlElement(name = "Settings")
    protected Boolean settings;
    @XmlElement(name = "ShareableEntityAccessPermission_Permission")
    protected Boolean shareableEntityAccessPermissionPermission;
    @XmlElement(name = "User")
    protected Boolean user;

    /**
     * Obtém o valor da propriedade isOwner.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOwner() {
        return isOwner;
    }

    /**
     * Define o valor da propriedade isOwner.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOwner(Boolean value) {
        this.isOwner = value;
    }

    /**
     * Obtém o valor da propriedade isShared.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShared() {
        return isShared;
    }

    /**
     * Define o valor da propriedade isShared.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShared(Boolean value) {
        this.isShared = value;
    }

    /**
     * Obtém o valor da propriedade kpis.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKpis() {
        return kpis;
    }

    /**
     * Define o valor da propriedade kpis.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKpis(Boolean value) {
        this.kpis = value;
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
     * Obtém o valor da propriedade ownerName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOwnerName() {
        return ownerName;
    }

    /**
     * Define o valor da propriedade ownerName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwnerName(Boolean value) {
        this.ownerName = value;
    }

    /**
     * Obtém o valor da propriedade settings.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSettings() {
        return settings;
    }

    /**
     * Define o valor da propriedade settings.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSettings(Boolean value) {
        this.settings = value;
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
     * Obtém o valor da propriedade user.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUser() {
        return user;
    }

    /**
     * Define o valor da propriedade user.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUser(Boolean value) {
        this.user = value;
    }

}
