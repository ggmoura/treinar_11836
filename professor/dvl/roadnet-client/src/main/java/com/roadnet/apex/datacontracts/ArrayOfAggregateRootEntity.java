
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfAggregateRootEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAggregateRootEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AggregateRootEntity" type="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAggregateRootEntity", propOrder = {
    "aggregateRootEntity"
})
public class ArrayOfAggregateRootEntity {

    @XmlElement(name = "AggregateRootEntity", nillable = true)
    protected List<AggregateRootEntity> aggregateRootEntity;

    /**
     * Gets the value of the aggregateRootEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggregateRootEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggregateRootEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregateRootEntity }
     * 
     * 
     */
    public List<AggregateRootEntity> getAggregateRootEntity() {
        if (aggregateRootEntity == null) {
            aggregateRootEntity = new ArrayList<AggregateRootEntity>();
        }
        return this.aggregateRootEntity;
    }

}
