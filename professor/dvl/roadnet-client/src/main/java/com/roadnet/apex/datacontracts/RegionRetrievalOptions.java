
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_core.ArrayOfRolePermission;


/**
 * <p>Classe Java de RegionRetrievalOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RegionRetrievalOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RetrievalOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MustGrantAllSpecifiedPermissions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Permissions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Core.Domain}ArrayOfRole.Permission" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionRetrievalOptions", propOrder = {
    "mustGrantAllSpecifiedPermissions",
    "permissions"
})
public class RegionRetrievalOptions
    extends RetrievalOptions
{

    @XmlElement(name = "MustGrantAllSpecifiedPermissions")
    protected Boolean mustGrantAllSpecifiedPermissions;
    @XmlElementRef(name = "Permissions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRolePermission> permissions;

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

}
