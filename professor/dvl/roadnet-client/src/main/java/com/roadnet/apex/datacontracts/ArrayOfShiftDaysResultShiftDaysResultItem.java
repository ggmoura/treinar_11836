
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfShiftDaysResult.ShiftDaysResultItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfShiftDaysResult.ShiftDaysResultItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShiftDaysResult.ShiftDaysResultItem" type="{http://roadnet.com/apex/DataContracts/}ShiftDaysResult.ShiftDaysResultItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfShiftDaysResult.ShiftDaysResultItem", propOrder = {
    "shiftDaysResultShiftDaysResultItem"
})
public class ArrayOfShiftDaysResultShiftDaysResultItem {

    @XmlElement(name = "ShiftDaysResult.ShiftDaysResultItem", nillable = true)
    protected List<ShiftDaysResultShiftDaysResultItem> shiftDaysResultShiftDaysResultItem;

    /**
     * Gets the value of the shiftDaysResultShiftDaysResultItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shiftDaysResultShiftDaysResultItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShiftDaysResultShiftDaysResultItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShiftDaysResultShiftDaysResultItem }
     * 
     * 
     */
    public List<ShiftDaysResultShiftDaysResultItem> getShiftDaysResultShiftDaysResultItem() {
        if (shiftDaysResultShiftDaysResultItem == null) {
            shiftDaysResultShiftDaysResultItem = new ArrayList<ShiftDaysResultShiftDaysResultItem>();
        }
        return this.shiftDaysResultShiftDaysResultItem;
    }

}
