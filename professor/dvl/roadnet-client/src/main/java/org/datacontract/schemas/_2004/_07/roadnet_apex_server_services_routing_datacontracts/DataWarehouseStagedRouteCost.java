
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DataWarehouseStagedRouteCost complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseStagedRouteCost"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseCostType_CostType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlannedCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseStagedRouteCost", propOrder = {
    "dataWarehouseCostTypeCostType",
    "plannedCost"
})
@XmlSeeAlso({
    DataWarehouseActualStagedRouteCost.class,
    DataWarehousePlannedStagedRouteCost.class
})
public class DataWarehouseStagedRouteCost
    extends DataTransferObject
{

    @XmlElementRef(name = "DataWarehouseCostType_CostType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseCostTypeCostType;
    @XmlElement(name = "PlannedCost")
    protected Double plannedCost;

    /**
     * Obtém o valor da propriedade dataWarehouseCostTypeCostType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseCostTypeCostType() {
        return dataWarehouseCostTypeCostType;
    }

    /**
     * Define o valor da propriedade dataWarehouseCostTypeCostType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseCostTypeCostType(JAXBElement<String> value) {
        this.dataWarehouseCostTypeCostType = value;
    }

    /**
     * Obtém o valor da propriedade plannedCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPlannedCost() {
        return plannedCost;
    }

    /**
     * Define o valor da propriedade plannedCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPlannedCost(Double value) {
        this.plannedCost = value;
    }

}
