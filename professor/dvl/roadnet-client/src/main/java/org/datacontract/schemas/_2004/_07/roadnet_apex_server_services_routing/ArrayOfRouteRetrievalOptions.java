
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfRouteRetrievalOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRouteRetrievalOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteRetrievalOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options}RouteRetrievalOptions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRouteRetrievalOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", propOrder = {
    "routeRetrievalOptions"
})
public class ArrayOfRouteRetrievalOptions {

    @XmlElement(name = "RouteRetrievalOptions", nillable = true)
    protected List<RouteRetrievalOptions> routeRetrievalOptions;

    /**
     * Gets the value of the routeRetrievalOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeRetrievalOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteRetrievalOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteRetrievalOptions }
     * 
     * 
     */
    public List<RouteRetrievalOptions> getRouteRetrievalOptions() {
        if (routeRetrievalOptions == null) {
            routeRetrievalOptions = new ArrayList<RouteRetrievalOptions>();
        }
        return this.routeRetrievalOptions;
    }

}
