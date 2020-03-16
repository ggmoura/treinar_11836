
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfUnassignedOrderGroupServiceWindowDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUnassignedOrderGroupServiceWindowDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UnassignedOrderGroupServiceWindowDetail" type="{http://roadnet.com/apex/DataContracts/}UnassignedOrderGroupServiceWindowDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUnassignedOrderGroupServiceWindowDetail", propOrder = {
    "unassignedOrderGroupServiceWindowDetail"
})
public class ArrayOfUnassignedOrderGroupServiceWindowDetail {

    @XmlElement(name = "UnassignedOrderGroupServiceWindowDetail", nillable = true)
    protected List<UnassignedOrderGroupServiceWindowDetail> unassignedOrderGroupServiceWindowDetail;

    /**
     * Gets the value of the unassignedOrderGroupServiceWindowDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unassignedOrderGroupServiceWindowDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnassignedOrderGroupServiceWindowDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnassignedOrderGroupServiceWindowDetail }
     * 
     * 
     */
    public List<UnassignedOrderGroupServiceWindowDetail> getUnassignedOrderGroupServiceWindowDetail() {
        if (unassignedOrderGroupServiceWindowDetail == null) {
            unassignedOrderGroupServiceWindowDetail = new ArrayList<UnassignedOrderGroupServiceWindowDetail>();
        }
        return this.unassignedOrderGroupServiceWindowDetail;
    }

}
