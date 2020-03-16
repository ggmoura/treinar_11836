
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfEquipmentDataHistory complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEquipmentDataHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquipmentDataHistory" type="{http://roadnet.com/apex/DataContracts/}EquipmentDataHistory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEquipmentDataHistory", propOrder = {
    "equipmentDataHistory"
})
public class ArrayOfEquipmentDataHistory {

    @XmlElement(name = "EquipmentDataHistory", nillable = true)
    protected List<EquipmentDataHistory> equipmentDataHistory;

    /**
     * Gets the value of the equipmentDataHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentDataHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentDataHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentDataHistory }
     * 
     * 
     */
    public List<EquipmentDataHistory> getEquipmentDataHistory() {
        if (equipmentDataHistory == null) {
            equipmentDataHistory = new ArrayList<EquipmentDataHistory>();
        }
        return this.equipmentDataHistory;
    }

}
