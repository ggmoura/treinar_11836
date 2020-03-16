
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseActualStagedRouteCost complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseActualStagedRouteCost"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse}DataWarehouseStagedRouteCost"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseActualStagedRouteCost", propOrder = {
    "actualCost"
})
public class DataWarehouseActualStagedRouteCost
    extends DataWarehouseStagedRouteCost
{

    @XmlElement(name = "ActualCost")
    protected Double actualCost;

    /**
     * Obtém o valor da propriedade actualCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualCost() {
        return actualCost;
    }

    /**
     * Define o valor da propriedade actualCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualCost(Double value) {
        this.actualCost = value;
    }

}
