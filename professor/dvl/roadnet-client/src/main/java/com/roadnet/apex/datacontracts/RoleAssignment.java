
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de RoleAssignment complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RoleAssignment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessUnitEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ParentRoleAssignmentPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RoleEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleAssignment", propOrder = {
    "businessUnitEntityKey",
    "parentRoleAssignmentPkey",
    "regionEntityKey",
    "roleEntityKey"
})
@XmlSeeAlso({
    UserRoleAssignment.class,
    UserGroupRoleAssignment.class
})
public class RoleAssignment
    extends DomainEntity
{

    @XmlElementRef(name = "BusinessUnitEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> businessUnitEntityKey;
    @XmlElementRef(name = "ParentRoleAssignmentPkey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> parentRoleAssignmentPkey;
    @XmlElementRef(name = "RegionEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> regionEntityKey;
    @XmlElement(name = "RoleEntityKey")
    protected Long roleEntityKey;

    /**
     * Obtém o valor da propriedade businessUnitEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBusinessUnitEntityKey() {
        return businessUnitEntityKey;
    }

    /**
     * Define o valor da propriedade businessUnitEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBusinessUnitEntityKey(JAXBElement<Long> value) {
        this.businessUnitEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade parentRoleAssignmentPkey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getParentRoleAssignmentPkey() {
        return parentRoleAssignmentPkey;
    }

    /**
     * Define o valor da propriedade parentRoleAssignmentPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setParentRoleAssignmentPkey(JAXBElement<Long> value) {
        this.parentRoleAssignmentPkey = value;
    }

    /**
     * Obtém o valor da propriedade regionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRegionEntityKey() {
        return regionEntityKey;
    }

    /**
     * Define o valor da propriedade regionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRegionEntityKey(JAXBElement<Long> value) {
        this.regionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade roleEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRoleEntityKey() {
        return roleEntityKey;
    }

    /**
     * Define o valor da propriedade roleEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRoleEntityKey(Long value) {
        this.roleEntityKey = value;
    }

}
