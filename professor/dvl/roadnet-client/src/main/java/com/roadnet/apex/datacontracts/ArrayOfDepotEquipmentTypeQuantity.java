
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfDepotEquipmentTypeQuantity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDepotEquipmentTypeQuantity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepotEquipmentTypeQuantity" type="{http://roadnet.com/apex/DataContracts/}DepotEquipmentTypeQuantity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDepotEquipmentTypeQuantity", propOrder = {
    "depotEquipmentTypeQuantity"
})
public class ArrayOfDepotEquipmentTypeQuantity {

    @XmlElement(name = "DepotEquipmentTypeQuantity", nillable = true)
    protected List<DepotEquipmentTypeQuantity> depotEquipmentTypeQuantity;

    /**
     * Gets the value of the depotEquipmentTypeQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depotEquipmentTypeQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepotEquipmentTypeQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepotEquipmentTypeQuantity }
     * 
     * 
     */
    public List<DepotEquipmentTypeQuantity> getDepotEquipmentTypeQuantity() {
        if (depotEquipmentTypeQuantity == null) {
            depotEquipmentTypeQuantity = new ArrayList<DepotEquipmentTypeQuantity>();
        }
        return this.depotEquipmentTypeQuantity;
    }

}
