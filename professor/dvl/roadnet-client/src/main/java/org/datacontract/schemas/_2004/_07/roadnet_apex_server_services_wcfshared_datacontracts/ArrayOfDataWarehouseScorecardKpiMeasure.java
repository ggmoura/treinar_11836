
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfDataWarehouseScorecardKpiMeasure complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDataWarehouseScorecardKpiMeasure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseScorecardKpiMeasure" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseScorecardKpiMeasure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDataWarehouseScorecardKpiMeasure", propOrder = {
    "dataWarehouseScorecardKpiMeasure"
})
public class ArrayOfDataWarehouseScorecardKpiMeasure {

    @XmlElement(name = "DataWarehouseScorecardKpiMeasure", nillable = true)
    protected List<DataWarehouseScorecardKpiMeasure> dataWarehouseScorecardKpiMeasure;

    /**
     * Gets the value of the dataWarehouseScorecardKpiMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataWarehouseScorecardKpiMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataWarehouseScorecardKpiMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataWarehouseScorecardKpiMeasure }
     * 
     * 
     */
    public List<DataWarehouseScorecardKpiMeasure> getDataWarehouseScorecardKpiMeasure() {
        if (dataWarehouseScorecardKpiMeasure == null) {
            dataWarehouseScorecardKpiMeasure = new ArrayList<DataWarehouseScorecardKpiMeasure>();
        }
        return this.dataWarehouseScorecardKpiMeasure;
    }

}
