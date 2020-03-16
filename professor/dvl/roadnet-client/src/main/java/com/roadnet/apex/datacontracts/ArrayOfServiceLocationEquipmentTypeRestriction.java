
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfServiceLocationEquipmentTypeRestriction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceLocationEquipmentTypeRestriction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceLocationEquipmentTypeRestriction" type="{http://roadnet.com/apex/DataContracts/}ServiceLocationEquipmentTypeRestriction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceLocationEquipmentTypeRestriction", propOrder = {
    "serviceLocationEquipmentTypeRestriction"
})
public class ArrayOfServiceLocationEquipmentTypeRestriction {

    @XmlElement(name = "ServiceLocationEquipmentTypeRestriction", nillable = true)
    protected List<ServiceLocationEquipmentTypeRestriction> serviceLocationEquipmentTypeRestriction;

    /**
     * Gets the value of the serviceLocationEquipmentTypeRestriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceLocationEquipmentTypeRestriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceLocationEquipmentTypeRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceLocationEquipmentTypeRestriction }
     * 
     * 
     */
    public List<ServiceLocationEquipmentTypeRestriction> getServiceLocationEquipmentTypeRestriction() {
        if (serviceLocationEquipmentTypeRestriction == null) {
            serviceLocationEquipmentTypeRestriction = new ArrayList<ServiceLocationEquipmentTypeRestriction>();
        }
        return this.serviceLocationEquipmentTypeRestriction;
    }

}
