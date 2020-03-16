
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.ActionType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ShareableEntityAccessor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ShareableEntityAccessor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccessorEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Action" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}ActionType" minOccurs="0"/&gt;
 *         &lt;element name="ShareableEntityAccessPermission_Permissions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareableEntityAccessor", propOrder = {
    "accessorEntityKey",
    "action",
    "shareableEntityAccessPermissionPermissions"
})
@XmlSeeAlso({
    ShareableEntityGroupAccessor.class,
    ShareableEntityUserAccessor.class
})
public class ShareableEntityAccessor
    extends DataTransferObject
{

    @XmlElement(name = "AccessorEntityKey")
    protected Long accessorEntityKey;
    @XmlElement(name = "Action")
    @XmlSchemaType(name = "string")
    protected ActionType action;
    @XmlElementRef(name = "ShareableEntityAccessPermission_Permissions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shareableEntityAccessPermissionPermissions;

    /**
     * Obtém o valor da propriedade accessorEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccessorEntityKey() {
        return accessorEntityKey;
    }

    /**
     * Define o valor da propriedade accessorEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccessorEntityKey(Long value) {
        this.accessorEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade action.
     * 
     * @return
     *     possible object is
     *     {@link ActionType }
     *     
     */
    public ActionType getAction() {
        return action;
    }

    /**
     * Define o valor da propriedade action.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    public void setAction(ActionType value) {
        this.action = value;
    }

    /**
     * Obtém o valor da propriedade shareableEntityAccessPermissionPermissions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShareableEntityAccessPermissionPermissions() {
        return shareableEntityAccessPermissionPermissions;
    }

    /**
     * Define o valor da propriedade shareableEntityAccessPermissionPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShareableEntityAccessPermissionPermissions(JAXBElement<String> value) {
        this.shareableEntityAccessPermissionPermissions = value;
    }

}
