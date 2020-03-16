
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_core.ArrayOfRolePermission;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="permissions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Core.Domain}ArrayOfRole.Permission" minOccurs="0"/&gt;
 *         &lt;element name="mustGrantAllSpecifiedPermissions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "permissions",
    "mustGrantAllSpecifiedPermissions"
})
@XmlRootElement(name = "RetrieveBusinessUnitsGrantingPermissions")
public class RetrieveBusinessUnitsGrantingPermissions {

    @XmlElementRef(name = "permissions", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRolePermission> permissions;
    protected Boolean mustGrantAllSpecifiedPermissions;

    /**
     * Obtém o valor da propriedade permissions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRolePermission }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRolePermission> getPermissions() {
        return permissions;
    }

    /**
     * Define o valor da propriedade permissions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRolePermission }{@code >}
     *     
     */
    public void setPermissions(JAXBElement<ArrayOfRolePermission> value) {
        this.permissions = value;
    }

    /**
     * Obtém o valor da propriedade mustGrantAllSpecifiedPermissions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustGrantAllSpecifiedPermissions() {
        return mustGrantAllSpecifiedPermissions;
    }

    /**
     * Define o valor da propriedade mustGrantAllSpecifiedPermissions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustGrantAllSpecifiedPermissions(Boolean value) {
        this.mustGrantAllSpecifiedPermissions = value;
    }

}
