
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfDepotServiceTimeDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDepotServiceTimeDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepotServiceTimeDetail" type="{http://roadnet.com/apex/DataContracts/}DepotServiceTimeDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDepotServiceTimeDetail", propOrder = {
    "depotServiceTimeDetail"
})
public class ArrayOfDepotServiceTimeDetail {

    @XmlElement(name = "DepotServiceTimeDetail", nillable = true)
    protected List<DepotServiceTimeDetail> depotServiceTimeDetail;

    /**
     * Gets the value of the depotServiceTimeDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depotServiceTimeDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepotServiceTimeDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepotServiceTimeDetail }
     * 
     * 
     */
    public List<DepotServiceTimeDetail> getDepotServiceTimeDetail() {
        if (depotServiceTimeDetail == null) {
            depotServiceTimeDetail = new ArrayList<DepotServiceTimeDetail>();
        }
        return this.depotServiceTimeDetail;
    }

}
