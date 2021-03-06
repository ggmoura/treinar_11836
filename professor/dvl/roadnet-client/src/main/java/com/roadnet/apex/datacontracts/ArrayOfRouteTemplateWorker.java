
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfRouteTemplateWorker complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRouteTemplateWorker"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteTemplateWorker" type="{http://roadnet.com/apex/DataContracts/}RouteTemplateWorker" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRouteTemplateWorker", propOrder = {
    "routeTemplateWorker"
})
public class ArrayOfRouteTemplateWorker {

    @XmlElement(name = "RouteTemplateWorker", nillable = true)
    protected List<RouteTemplateWorker> routeTemplateWorker;

    /**
     * Gets the value of the routeTemplateWorker property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeTemplateWorker property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteTemplateWorker().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteTemplateWorker }
     * 
     * 
     */
    public List<RouteTemplateWorker> getRouteTemplateWorker() {
        if (routeTemplateWorker == null) {
            routeTemplateWorker = new ArrayList<RouteTemplateWorker>();
        }
        return this.routeTemplateWorker;
    }

}
