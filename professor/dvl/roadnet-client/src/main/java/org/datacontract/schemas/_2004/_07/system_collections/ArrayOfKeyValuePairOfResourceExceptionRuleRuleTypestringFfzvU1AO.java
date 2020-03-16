
package org.datacontract.schemas._2004._07.system_collections;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfKeyValuePairOfResourceExceptionRule.RuleTypestringFfzvU1aO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValuePairOfResourceExceptionRule.RuleTypestringFfzvU1aO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValuePairOfResourceExceptionRule.RuleTypestringFfzvU1aO" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOfResourceExceptionRule.RuleTypestringFfzvU1aO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValuePairOfResourceExceptionRule.RuleTypestringFfzvU1aO", propOrder = {
    "keyValuePairOfResourceExceptionRuleRuleTypestringFfzvU1AO"
})
public class ArrayOfKeyValuePairOfResourceExceptionRuleRuleTypestringFfzvU1AO {

    @XmlElement(name = "KeyValuePairOfResourceExceptionRule.RuleTypestringFfzvU1aO")
    protected List<KeyValuePairOfResourceExceptionRuleRuleTypestringFfzvU1AO> keyValuePairOfResourceExceptionRuleRuleTypestringFfzvU1AO;

    /**
     * Gets the value of the keyValuePairOfResourceExceptionRuleRuleTypestringFfzvU1AO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValuePairOfResourceExceptionRuleRuleTypestringFfzvU1AO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValuePairOfResourceExceptionRuleRuleTypestringFfzvU1AO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePairOfResourceExceptionRuleRuleTypestringFfzvU1AO }
     * 
     * 
     */
    public List<KeyValuePairOfResourceExceptionRuleRuleTypestringFfzvU1AO> getKeyValuePairOfResourceExceptionRuleRuleTypestringFfzvU1AO() {
        if (keyValuePairOfResourceExceptionRuleRuleTypestringFfzvU1AO == null) {
            keyValuePairOfResourceExceptionRuleRuleTypestringFfzvU1AO = new ArrayList<KeyValuePairOfResourceExceptionRuleRuleTypestringFfzvU1AO>();
        }
        return this.keyValuePairOfResourceExceptionRuleRuleTypestringFfzvU1AO;
    }

}
