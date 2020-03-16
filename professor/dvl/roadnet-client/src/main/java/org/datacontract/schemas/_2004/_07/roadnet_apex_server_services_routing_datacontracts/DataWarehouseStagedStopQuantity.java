
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de DataWarehouseStagedStopQuantity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseStagedStopQuantity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Capacity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseStagedStopQuantityServiceType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RunningQuantityAfter" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UnitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseStagedStopQuantity", propOrder = {
    "capacity",
    "dataWarehouseStagedStopQuantityServiceTypeType",
    "quantity",
    "runningQuantityAfter",
    "unitType"
})
@XmlSeeAlso({
    DataWarehouseActualStagedStopQuantity.class,
    DataWarehousePlannedStagedStopQuantity.class
})
public class DataWarehouseStagedStopQuantity
    extends DomainEntity
{

    @XmlElement(name = "Capacity")
    protected Double capacity;
    @XmlElementRef(name = "DataWarehouseStagedStopQuantityServiceType_Type", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseStagedStopQuantityServiceTypeType;
    @XmlElement(name = "Quantity")
    protected Double quantity;
    @XmlElement(name = "RunningQuantityAfter")
    protected Double runningQuantityAfter;
    @XmlElementRef(name = "UnitType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitType;

    /**
     * Obtém o valor da propriedade capacity.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCapacity() {
        return capacity;
    }

    /**
     * Define o valor da propriedade capacity.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCapacity(Double value) {
        this.capacity = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseStagedStopQuantityServiceTypeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseStagedStopQuantityServiceTypeType() {
        return dataWarehouseStagedStopQuantityServiceTypeType;
    }

    /**
     * Define o valor da propriedade dataWarehouseStagedStopQuantityServiceTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseStagedStopQuantityServiceTypeType(JAXBElement<String> value) {
        this.dataWarehouseStagedStopQuantityServiceTypeType = value;
    }

    /**
     * Obtém o valor da propriedade quantity.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * Define o valor da propriedade quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity(Double value) {
        this.quantity = value;
    }

    /**
     * Obtém o valor da propriedade runningQuantityAfter.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRunningQuantityAfter() {
        return runningQuantityAfter;
    }

    /**
     * Define o valor da propriedade runningQuantityAfter.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRunningQuantityAfter(Double value) {
        this.runningQuantityAfter = value;
    }

    /**
     * Obtém o valor da propriedade unitType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitType() {
        return unitType;
    }

    /**
     * Define o valor da propriedade unitType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitType(JAXBElement<String> value) {
        this.unitType = value;
    }

}
