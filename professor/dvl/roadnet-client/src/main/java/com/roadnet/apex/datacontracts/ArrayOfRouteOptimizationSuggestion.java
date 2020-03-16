
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfRouteOptimizationSuggestion complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRouteOptimizationSuggestion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteOptimizationSuggestion" type="{http://roadnet.com/apex/DataContracts/}RouteOptimizationSuggestion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRouteOptimizationSuggestion", propOrder = {
    "routeOptimizationSuggestion"
})
public class ArrayOfRouteOptimizationSuggestion {

    @XmlElement(name = "RouteOptimizationSuggestion", nillable = true)
    protected List<RouteOptimizationSuggestion> routeOptimizationSuggestion;

    /**
     * Gets the value of the routeOptimizationSuggestion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeOptimizationSuggestion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteOptimizationSuggestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteOptimizationSuggestion }
     * 
     * 
     */
    public List<RouteOptimizationSuggestion> getRouteOptimizationSuggestion() {
        if (routeOptimizationSuggestion == null) {
            routeOptimizationSuggestion = new ArrayList<RouteOptimizationSuggestion>();
        }
        return this.routeOptimizationSuggestion;
    }

}
