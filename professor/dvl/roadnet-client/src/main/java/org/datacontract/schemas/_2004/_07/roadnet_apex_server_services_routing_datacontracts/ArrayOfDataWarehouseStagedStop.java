
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfDataWarehouseStagedStop complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDataWarehouseStagedStop"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseStagedStop" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse}DataWarehouseStagedStop" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDataWarehouseStagedStop", propOrder = {
    "dataWarehouseStagedStop"
})
public class ArrayOfDataWarehouseStagedStop {

    @XmlElement(name = "DataWarehouseStagedStop", nillable = true)
    protected List<DataWarehouseStagedStop> dataWarehouseStagedStop;

    /**
     * Gets the value of the dataWarehouseStagedStop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataWarehouseStagedStop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataWarehouseStagedStop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataWarehouseStagedStop }
     * 
     * 
     */
    public List<DataWarehouseStagedStop> getDataWarehouseStagedStop() {
        if (dataWarehouseStagedStop == null) {
            dataWarehouseStagedStop = new ArrayList<DataWarehouseStagedStop>();
        }
        return this.dataWarehouseStagedStop;
    }

}
