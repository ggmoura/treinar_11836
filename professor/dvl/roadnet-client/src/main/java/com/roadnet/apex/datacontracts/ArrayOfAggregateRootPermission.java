
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfAggregateRootPermission complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAggregateRootPermission"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AggregateRootPermission" type="{http://roadnet.com/apex/DataContracts/}AggregateRootPermission" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAggregateRootPermission", propOrder = {
    "aggregateRootPermission"
})
public class ArrayOfAggregateRootPermission {

    @XmlElement(name = "AggregateRootPermission", nillable = true)
    protected List<AggregateRootPermission> aggregateRootPermission;

    /**
     * Gets the value of the aggregateRootPermission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggregateRootPermission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggregateRootPermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregateRootPermission }
     * 
     * 
     */
    public List<AggregateRootPermission> getAggregateRootPermission() {
        if (aggregateRootPermission == null) {
            aggregateRootPermission = new ArrayList<AggregateRootPermission>();
        }
        return this.aggregateRootPermission;
    }

}
