
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfDataWarehouseStagedOrder complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDataWarehouseStagedOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseStagedOrder" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse}DataWarehouseStagedOrder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDataWarehouseStagedOrder", propOrder = {
    "dataWarehouseStagedOrder"
})
public class ArrayOfDataWarehouseStagedOrder {

    @XmlElement(name = "DataWarehouseStagedOrder", nillable = true)
    protected List<DataWarehouseStagedOrder> dataWarehouseStagedOrder;

    /**
     * Gets the value of the dataWarehouseStagedOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataWarehouseStagedOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataWarehouseStagedOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataWarehouseStagedOrder }
     * 
     * 
     */
    public List<DataWarehouseStagedOrder> getDataWarehouseStagedOrder() {
        if (dataWarehouseStagedOrder == null) {
            dataWarehouseStagedOrder = new ArrayList<DataWarehouseStagedOrder>();
        }
        return this.dataWarehouseStagedOrder;
    }

}
