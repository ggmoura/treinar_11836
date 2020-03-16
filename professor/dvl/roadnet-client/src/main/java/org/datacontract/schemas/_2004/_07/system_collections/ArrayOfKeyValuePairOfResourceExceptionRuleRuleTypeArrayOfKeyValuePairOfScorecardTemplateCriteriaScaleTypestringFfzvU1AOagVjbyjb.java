
package org.datacontract.schemas._2004._07.system_collections;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfKeyValuePairOfResourceExceptionRule.RuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aOagVjbyjb complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValuePairOfResourceExceptionRule.RuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aOagVjbyjb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValuePairOfResourceExceptionRule.RuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aOagVjbyjb" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOfResourceExceptionRule.RuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aOagVjbyjb" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValuePairOfResourceExceptionRule.RuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aOagVjbyjb", propOrder = {
    "keyValuePairOfResourceExceptionRuleRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb"
})
public class ArrayOfKeyValuePairOfResourceExceptionRuleRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb {

    @XmlElement(name = "KeyValuePairOfResourceExceptionRule.RuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aOagVjbyjb")
    protected List<KeyValuePairOfResourceExceptionRuleRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb> keyValuePairOfResourceExceptionRuleRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb;

    /**
     * Gets the value of the keyValuePairOfResourceExceptionRuleRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValuePairOfResourceExceptionRuleRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValuePairOfResourceExceptionRuleRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePairOfResourceExceptionRuleRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb }
     * 
     * 
     */
    public List<KeyValuePairOfResourceExceptionRuleRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb> getKeyValuePairOfResourceExceptionRuleRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb() {
        if (keyValuePairOfResourceExceptionRuleRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb == null) {
            keyValuePairOfResourceExceptionRuleRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb = new ArrayList<KeyValuePairOfResourceExceptionRuleRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb>();
        }
        return this.keyValuePairOfResourceExceptionRuleRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb;
    }

}
