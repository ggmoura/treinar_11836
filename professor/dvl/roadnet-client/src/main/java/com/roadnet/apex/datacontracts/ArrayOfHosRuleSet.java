
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfHosRuleSet complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHosRuleSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HosRuleSet" type="{http://roadnet.com/apex/DataContracts/}HosRuleSet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHosRuleSet", propOrder = {
    "hosRuleSet"
})
public class ArrayOfHosRuleSet {

    @XmlElement(name = "HosRuleSet", nillable = true)
    protected List<HosRuleSet> hosRuleSet;

    /**
     * Gets the value of the hosRuleSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hosRuleSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHosRuleSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HosRuleSet }
     * 
     * 
     */
    public List<HosRuleSet> getHosRuleSet() {
        if (hosRuleSet == null) {
            hosRuleSet = new ArrayList<HosRuleSet>();
        }
        return this.hosRuleSet;
    }

}
