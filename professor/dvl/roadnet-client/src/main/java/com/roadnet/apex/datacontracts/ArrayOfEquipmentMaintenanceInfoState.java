
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfEquipmentMaintenanceInfoState complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEquipmentMaintenanceInfoState"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquipmentMaintenanceInfoState" type="{http://roadnet.com/apex/DataContracts/}EquipmentMaintenanceInfoState" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEquipmentMaintenanceInfoState", propOrder = {
    "equipmentMaintenanceInfoState"
})
public class ArrayOfEquipmentMaintenanceInfoState {

    @XmlElement(name = "EquipmentMaintenanceInfoState")
    @XmlSchemaType(name = "string")
    protected List<EquipmentMaintenanceInfoState> equipmentMaintenanceInfoState;

    /**
     * Gets the value of the equipmentMaintenanceInfoState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentMaintenanceInfoState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentMaintenanceInfoState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentMaintenanceInfoState }
     * 
     * 
     */
    public List<EquipmentMaintenanceInfoState> getEquipmentMaintenanceInfoState() {
        if (equipmentMaintenanceInfoState == null) {
            equipmentMaintenanceInfoState = new ArrayList<EquipmentMaintenanceInfoState>();
        }
        return this.equipmentMaintenanceInfoState;
    }

}
