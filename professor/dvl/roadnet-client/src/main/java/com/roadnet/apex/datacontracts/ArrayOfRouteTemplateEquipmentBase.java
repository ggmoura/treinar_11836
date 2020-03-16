
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfRouteTemplateEquipmentBase complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRouteTemplateEquipmentBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteTemplateEquipmentBase" type="{http://roadnet.com/apex/DataContracts/}RouteTemplateEquipmentBase" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRouteTemplateEquipmentBase", propOrder = {
    "routeTemplateEquipmentBase"
})
public class ArrayOfRouteTemplateEquipmentBase {

    @XmlElement(name = "RouteTemplateEquipmentBase", nillable = true)
    protected List<RouteTemplateEquipmentBase> routeTemplateEquipmentBase;

    /**
     * Gets the value of the routeTemplateEquipmentBase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeTemplateEquipmentBase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteTemplateEquipmentBase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteTemplateEquipmentBase }
     * 
     * 
     */
    public List<RouteTemplateEquipmentBase> getRouteTemplateEquipmentBase() {
        if (routeTemplateEquipmentBase == null) {
            routeTemplateEquipmentBase = new ArrayList<RouteTemplateEquipmentBase>();
        }
        return this.routeTemplateEquipmentBase;
    }

}
