
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfUpdatePerformedMaintenanceArgs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUpdatePerformedMaintenanceArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpdatePerformedMaintenanceArgs" type="{http://roadnet.com/apex/DataContracts/}UpdatePerformedMaintenanceArgs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUpdatePerformedMaintenanceArgs", propOrder = {
    "updatePerformedMaintenanceArgs"
})
public class ArrayOfUpdatePerformedMaintenanceArgs {

    @XmlElement(name = "UpdatePerformedMaintenanceArgs", nillable = true)
    protected List<UpdatePerformedMaintenanceArgs> updatePerformedMaintenanceArgs;

    /**
     * Gets the value of the updatePerformedMaintenanceArgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updatePerformedMaintenanceArgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdatePerformedMaintenanceArgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatePerformedMaintenanceArgs }
     * 
     * 
     */
    public List<UpdatePerformedMaintenanceArgs> getUpdatePerformedMaintenanceArgs() {
        if (updatePerformedMaintenanceArgs == null) {
            updatePerformedMaintenanceArgs = new ArrayList<UpdatePerformedMaintenanceArgs>();
        }
        return this.updatePerformedMaintenanceArgs;
    }

}
