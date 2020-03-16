
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfDataWarehouseKpiMeasureDescription complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDataWarehouseKpiMeasureDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseKpiMeasureDescription" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseKpiMeasureDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDataWarehouseKpiMeasureDescription", propOrder = {
    "dataWarehouseKpiMeasureDescription"
})
public class ArrayOfDataWarehouseKpiMeasureDescription {

    @XmlElement(name = "DataWarehouseKpiMeasureDescription", nillable = true)
    protected List<DataWarehouseKpiMeasureDescription> dataWarehouseKpiMeasureDescription;

    /**
     * Gets the value of the dataWarehouseKpiMeasureDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataWarehouseKpiMeasureDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataWarehouseKpiMeasureDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataWarehouseKpiMeasureDescription }
     * 
     * 
     */
    public List<DataWarehouseKpiMeasureDescription> getDataWarehouseKpiMeasureDescription() {
        if (dataWarehouseKpiMeasureDescription == null) {
            dataWarehouseKpiMeasureDescription = new ArrayList<DataWarehouseKpiMeasureDescription>();
        }
        return this.dataWarehouseKpiMeasureDescription;
    }

}
