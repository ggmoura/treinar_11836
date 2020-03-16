
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DataWarehouseKpiMeasureFilter complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseKpiMeasureFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataFilters" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}ArrayOfDataWarehouseKpiMeasureDataFilter" minOccurs="0"/&gt;
 *         &lt;element name="Exclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseKpiMeasureFilter", propOrder = {
    "dataFilters",
    "exclusive"
})
public class DataWarehouseKpiMeasureFilter
    extends DataTransferObject
{

    @XmlElementRef(name = "DataFilters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDataWarehouseKpiMeasureDataFilter> dataFilters;
    @XmlElement(name = "Exclusive")
    protected Boolean exclusive;

    /**
     * Obtém o valor da propriedade dataFilters.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseKpiMeasureDataFilter }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDataWarehouseKpiMeasureDataFilter> getDataFilters() {
        return dataFilters;
    }

    /**
     * Define o valor da propriedade dataFilters.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseKpiMeasureDataFilter }{@code >}
     *     
     */
    public void setDataFilters(JAXBElement<ArrayOfDataWarehouseKpiMeasureDataFilter> value) {
        this.dataFilters = value;
    }

    /**
     * Obtém o valor da propriedade exclusive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclusive() {
        return exclusive;
    }

    /**
     * Define o valor da propriedade exclusive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclusive(Boolean value) {
        this.exclusive = value;
    }

}
