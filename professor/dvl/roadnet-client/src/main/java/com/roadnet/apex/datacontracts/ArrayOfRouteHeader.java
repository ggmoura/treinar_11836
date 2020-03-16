
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfRouteHeader complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRouteHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteHeader" type="{http://roadnet.com/apex/DataContracts/}RouteHeader" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRouteHeader", propOrder = {
    "routeHeader"
})
public class ArrayOfRouteHeader {

    @XmlElement(name = "RouteHeader", nillable = true)
    protected List<RouteHeader> routeHeader;

    /**
     * Gets the value of the routeHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteHeader }
     * 
     * 
     */
    public List<RouteHeader> getRouteHeader() {
        if (routeHeader == null) {
            routeHeader = new ArrayList<RouteHeader>();
        }
        return this.routeHeader;
    }

}
