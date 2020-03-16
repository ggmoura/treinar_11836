
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfResourceExceptionRuleExCondition complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResourceExceptionRuleExCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResourceExceptionRuleExCondition" type="{http://roadnet.com/apex/DataContracts/}ResourceExceptionRuleExCondition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResourceExceptionRuleExCondition", propOrder = {
    "resourceExceptionRuleExCondition"
})
public class ArrayOfResourceExceptionRuleExCondition {

    @XmlElement(name = "ResourceExceptionRuleExCondition", nillable = true)
    protected List<ResourceExceptionRuleExCondition> resourceExceptionRuleExCondition;

    /**
     * Gets the value of the resourceExceptionRuleExCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceExceptionRuleExCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceExceptionRuleExCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceExceptionRuleExCondition }
     * 
     * 
     */
    public List<ResourceExceptionRuleExCondition> getResourceExceptionRuleExCondition() {
        if (resourceExceptionRuleExCondition == null) {
            resourceExceptionRuleExCondition = new ArrayList<ResourceExceptionRuleExCondition>();
        }
        return this.resourceExceptionRuleExCondition;
    }

}
