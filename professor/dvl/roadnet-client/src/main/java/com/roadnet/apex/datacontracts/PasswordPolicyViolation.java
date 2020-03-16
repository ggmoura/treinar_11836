
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PasswordPolicyViolation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PasswordPolicyViolation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RuleValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://roadnet.com/apex/DataContracts/}PasswordPolicyViolation.ViolationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PasswordPolicyViolation", propOrder = {
    "ruleValue",
    "type"
})
public class PasswordPolicyViolation {

    @XmlElementRef(name = "RuleValue", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> ruleValue;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected PasswordPolicyViolationViolationType type;

    /**
     * Obtém o valor da propriedade ruleValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getRuleValue() {
        return ruleValue;
    }

    /**
     * Define o valor da propriedade ruleValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setRuleValue(JAXBElement<Object> value) {
        this.ruleValue = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link PasswordPolicyViolationViolationType }
     *     
     */
    public PasswordPolicyViolationViolationType getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordPolicyViolationViolationType }
     *     
     */
    public void setType(PasswordPolicyViolationViolationType value) {
        this.type = value;
    }

}
