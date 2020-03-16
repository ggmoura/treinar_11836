
package org.datacontract.schemas._2004._07.system_collections;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfKeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aO" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aO", propOrder = {
    "keyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO"
})
public class ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO {

    @XmlElement(name = "KeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aO")
    protected List<KeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO> keyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO;

    /**
     * Gets the value of the keyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO }
     * 
     * 
     */
    public List<KeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO> getKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO() {
        if (keyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO == null) {
            keyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO = new ArrayList<KeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO>();
        }
        return this.keyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO;
    }

}
