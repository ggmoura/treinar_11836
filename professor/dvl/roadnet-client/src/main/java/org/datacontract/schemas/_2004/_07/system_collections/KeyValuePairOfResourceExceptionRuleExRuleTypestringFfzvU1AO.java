
package org.datacontract.schemas._2004._07.system_collections;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ResourceExceptionRuleExRuleType;


/**
 * <p>Classe Java de KeyValuePairOfResourceExceptionRuleEx.RuleTypestringFfzvU1aO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="KeyValuePairOfResourceExceptionRuleEx.RuleTypestringFfzvU1aO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="key" type="{http://roadnet.com/apex/DataContracts/}ResourceExceptionRuleEx.RuleType"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValuePairOfResourceExceptionRuleEx.RuleTypestringFfzvU1aO", propOrder = {
    "key",
    "value"
})
public class KeyValuePairOfResourceExceptionRuleExRuleTypestringFfzvU1AO {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ResourceExceptionRuleExRuleType key;
    @XmlElement(required = true, nillable = true)
    protected String value;

    /**
     * Obtém o valor da propriedade key.
     * 
     * @return
     *     possible object is
     *     {@link ResourceExceptionRuleExRuleType }
     *     
     */
    public ResourceExceptionRuleExRuleType getKey() {
        return key;
    }

    /**
     * Define o valor da propriedade key.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceExceptionRuleExRuleType }
     *     
     */
    public void setKey(ResourceExceptionRuleExRuleType value) {
        this.key = value;
    }

    /**
     * Obtém o valor da propriedade value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define o valor da propriedade value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
