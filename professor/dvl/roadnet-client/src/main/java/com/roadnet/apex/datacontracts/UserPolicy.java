
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de UserPolicy complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UserPolicy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvalidLoginLockoutEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InvalidLoginsBeforeLockout" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="SuperUserLockoutMinutes" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserPolicy", propOrder = {
    "invalidLoginLockoutEnabled",
    "invalidLoginsBeforeLockout",
    "superUserLockoutMinutes"
})
public class UserPolicy
    extends DataTransferObject
{

    @XmlElement(name = "InvalidLoginLockoutEnabled")
    protected Boolean invalidLoginLockoutEnabled;
    @XmlElement(name = "InvalidLoginsBeforeLockout")
    protected Short invalidLoginsBeforeLockout;
    @XmlElement(name = "SuperUserLockoutMinutes")
    protected Short superUserLockoutMinutes;

    /**
     * Obtém o valor da propriedade invalidLoginLockoutEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvalidLoginLockoutEnabled() {
        return invalidLoginLockoutEnabled;
    }

    /**
     * Define o valor da propriedade invalidLoginLockoutEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvalidLoginLockoutEnabled(Boolean value) {
        this.invalidLoginLockoutEnabled = value;
    }

    /**
     * Obtém o valor da propriedade invalidLoginsBeforeLockout.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getInvalidLoginsBeforeLockout() {
        return invalidLoginsBeforeLockout;
    }

    /**
     * Define o valor da propriedade invalidLoginsBeforeLockout.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setInvalidLoginsBeforeLockout(Short value) {
        this.invalidLoginsBeforeLockout = value;
    }

    /**
     * Obtém o valor da propriedade superUserLockoutMinutes.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSuperUserLockoutMinutes() {
        return superUserLockoutMinutes;
    }

    /**
     * Define o valor da propriedade superUserLockoutMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSuperUserLockoutMinutes(Short value) {
        this.superUserLockoutMinutes = value;
    }

}
