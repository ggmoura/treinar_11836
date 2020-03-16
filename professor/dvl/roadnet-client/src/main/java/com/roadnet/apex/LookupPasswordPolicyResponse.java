
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.PasswordPolicy;


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
 *         &lt;element name="LookupPasswordPolicyResult" type="{http://roadnet.com/apex/DataContracts/}PasswordPolicy" minOccurs="0"/&gt;
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
    "lookupPasswordPolicyResult"
})
@XmlRootElement(name = "LookupPasswordPolicyResponse")
public class LookupPasswordPolicyResponse {

    @XmlElementRef(name = "LookupPasswordPolicyResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<PasswordPolicy> lookupPasswordPolicyResult;

    /**
     * Obtém o valor da propriedade lookupPasswordPolicyResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PasswordPolicy }{@code >}
     *     
     */
    public JAXBElement<PasswordPolicy> getLookupPasswordPolicyResult() {
        return lookupPasswordPolicyResult;
    }

    /**
     * Define o valor da propriedade lookupPasswordPolicyResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PasswordPolicy }{@code >}
     *     
     */
    public void setLookupPasswordPolicyResult(JAXBElement<PasswordPolicy> value) {
        this.lookupPasswordPolicyResult = value;
    }

}
