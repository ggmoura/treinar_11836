
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfOpportunityScenario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOpportunityScenario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OpportunityScenario" type="{http://roadnet.com/apex/DataContracts/}OpportunityScenario" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOpportunityScenario", propOrder = {
    "opportunityScenario"
})
public class ArrayOfOpportunityScenario {

    @XmlElement(name = "OpportunityScenario", nillable = true)
    protected List<OpportunityScenario> opportunityScenario;

    /**
     * Gets the value of the opportunityScenario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityScenario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityScenario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityScenario }
     * 
     * 
     */
    public List<OpportunityScenario> getOpportunityScenario() {
        if (opportunityScenario == null) {
            opportunityScenario = new ArrayList<OpportunityScenario>();
        }
        return this.opportunityScenario;
    }

}
