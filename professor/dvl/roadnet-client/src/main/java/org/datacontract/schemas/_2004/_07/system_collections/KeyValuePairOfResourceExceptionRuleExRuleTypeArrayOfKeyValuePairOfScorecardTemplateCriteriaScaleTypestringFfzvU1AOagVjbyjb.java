
package org.datacontract.schemas._2004._07.system_collections;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ResourceExceptionRuleExRuleType;


/**
 * <p>Classe Java de KeyValuePairOfResourceExceptionRuleEx.RuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aOagVjbyjb complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="KeyValuePairOfResourceExceptionRuleEx.RuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aOagVjbyjb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="key" type="{http://roadnet.com/apex/DataContracts/}ResourceExceptionRuleEx.RuleType"/&gt;
 *         &lt;element name="value" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValuePairOfResourceExceptionRuleEx.RuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aOagVjbyjb", propOrder = {
    "key",
    "value"
})
public class KeyValuePairOfResourceExceptionRuleExRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ResourceExceptionRuleExRuleType key;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO value;

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
     *     {@link ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO }
     *     
     */
    public ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO getValue() {
        return value;
    }

    /**
     * Define o valor da propriedade value.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO }
     *     
     */
    public void setValue(ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO value) {
        this.value = value;
    }

}
