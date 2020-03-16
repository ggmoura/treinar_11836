
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfEquipmentService.PerformedMaintenanceDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEquipmentService.PerformedMaintenanceDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquipmentService.PerformedMaintenanceDetail" type="{http://roadnet.com/apex/DataContracts/}EquipmentService.PerformedMaintenanceDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEquipmentService.PerformedMaintenanceDetail", propOrder = {
    "equipmentServicePerformedMaintenanceDetail"
})
public class ArrayOfEquipmentServicePerformedMaintenanceDetail {

    @XmlElement(name = "EquipmentService.PerformedMaintenanceDetail", nillable = true)
    protected List<EquipmentServicePerformedMaintenanceDetail> equipmentServicePerformedMaintenanceDetail;

    /**
     * Gets the value of the equipmentServicePerformedMaintenanceDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentServicePerformedMaintenanceDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentServicePerformedMaintenanceDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentServicePerformedMaintenanceDetail }
     * 
     * 
     */
    public List<EquipmentServicePerformedMaintenanceDetail> getEquipmentServicePerformedMaintenanceDetail() {
        if (equipmentServicePerformedMaintenanceDetail == null) {
            equipmentServicePerformedMaintenanceDetail = new ArrayList<EquipmentServicePerformedMaintenanceDetail>();
        }
        return this.equipmentServicePerformedMaintenanceDetail;
    }

}
