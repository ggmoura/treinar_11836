
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfRouteStopTaskInstances complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRouteStopTaskInstances"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteStopTaskInstances" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}RouteStopTaskInstances" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRouteStopTaskInstances", propOrder = {
    "routeStopTaskInstances"
})
public class ArrayOfRouteStopTaskInstances {

    @XmlElement(name = "RouteStopTaskInstances", nillable = true)
    protected List<RouteStopTaskInstances> routeStopTaskInstances;

    /**
     * Gets the value of the routeStopTaskInstances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeStopTaskInstances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteStopTaskInstances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteStopTaskInstances }
     * 
     * 
     */
    public List<RouteStopTaskInstances> getRouteStopTaskInstances() {
        if (routeStopTaskInstances == null) {
            routeStopTaskInstances = new ArrayList<RouteStopTaskInstances>();
        }
        return this.routeStopTaskInstances;
    }

}
