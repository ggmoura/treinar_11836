
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfDataWarehouseStagedRoute complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDataWarehouseStagedRoute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseStagedRoute" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse}DataWarehouseStagedRoute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDataWarehouseStagedRoute", propOrder = {
    "dataWarehouseStagedRoute"
})
public class ArrayOfDataWarehouseStagedRoute {

    @XmlElement(name = "DataWarehouseStagedRoute", nillable = true)
    protected List<DataWarehouseStagedRoute> dataWarehouseStagedRoute;

    /**
     * Gets the value of the dataWarehouseStagedRoute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataWarehouseStagedRoute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataWarehouseStagedRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataWarehouseStagedRoute }
     * 
     * 
     */
    public List<DataWarehouseStagedRoute> getDataWarehouseStagedRoute() {
        if (dataWarehouseStagedRoute == null) {
            dataWarehouseStagedRoute = new ArrayList<DataWarehouseStagedRoute>();
        }
        return this.dataWarehouseStagedRoute;
    }

}
