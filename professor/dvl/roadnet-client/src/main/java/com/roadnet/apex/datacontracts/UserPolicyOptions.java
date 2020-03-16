
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UserPolicyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UserPolicyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvalidLoginLockoutEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InvalidLoginsBeforeLockout" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SuperUserLockoutMinutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserPolicyOptions", propOrder = {
    "invalidLoginLockoutEnabled",
    "invalidLoginsBeforeLockout",
    "superUserLockoutMinutes"
})
public class UserPolicyOptions {

    @XmlElement(name = "InvalidLoginLockoutEnabled")
    protected Boolean invalidLoginLockoutEnabled;
    @XmlElement(name = "InvalidLoginsBeforeLockout")
    protected Boolean invalidLoginsBeforeLockout;
    @XmlElement(name = "SuperUserLockoutMinutes")
    protected Boolean superUserLockoutMinutes;

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
     *     {@link Boolean }
     *     
     */
    public Boolean isInvalidLoginsBeforeLockout() {
        return invalidLoginsBeforeLockout;
    }

    /**
     * Define o valor da propriedade invalidLoginsBeforeLockout.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvalidLoginsBeforeLockout(Boolean value) {
        this.invalidLoginsBeforeLockout = value;
    }

    /**
     * Obtém o valor da propriedade superUserLockoutMinutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuperUserLockoutMinutes() {
        return superUserLockoutMinutes;
    }

    /**
     * Define o valor da propriedade superUserLockoutMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuperUserLockoutMinutes(Boolean value) {
        this.superUserLockoutMinutes = value;
    }

}
