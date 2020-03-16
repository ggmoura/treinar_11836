
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DataWarehouseKpiCriteria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseKpiCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseKpiLogicalOperatorType_LogicalOperator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelationalOperatorType_RelationalOperator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseKpiCriteria", propOrder = {
    "dataWarehouseKpiLogicalOperatorTypeLogicalOperator",
    "relationalOperatorTypeRelationalOperator",
    "value"
})
public class DataWarehouseKpiCriteria
    extends DataTransferObject
{

    @XmlElementRef(name = "DataWarehouseKpiLogicalOperatorType_LogicalOperator", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseKpiLogicalOperatorTypeLogicalOperator;
    @XmlElementRef(name = "RelationalOperatorType_RelationalOperator", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relationalOperatorTypeRelationalOperator;
    @XmlElementRef(name = "Value", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> value;

    /**
     * Obtém o valor da propriedade dataWarehouseKpiLogicalOperatorTypeLogicalOperator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseKpiLogicalOperatorTypeLogicalOperator() {
        return dataWarehouseKpiLogicalOperatorTypeLogicalOperator;
    }

    /**
     * Define o valor da propriedade dataWarehouseKpiLogicalOperatorTypeLogicalOperator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseKpiLogicalOperatorTypeLogicalOperator(JAXBElement<String> value) {
        this.dataWarehouseKpiLogicalOperatorTypeLogicalOperator = value;
    }

    /**
     * Obtém o valor da propriedade relationalOperatorTypeRelationalOperator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelationalOperatorTypeRelationalOperator() {
        return relationalOperatorTypeRelationalOperator;
    }

    /**
     * Define o valor da propriedade relationalOperatorTypeRelationalOperator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelationalOperatorTypeRelationalOperator(JAXBElement<String> value) {
        this.relationalOperatorTypeRelationalOperator = value;
    }

    /**
     * Obtém o valor da propriedade value.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValue() {
        return value;
    }

    /**
     * Define o valor da propriedade value.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValue(JAXBElement<Double> value) {
        this.value = value;
    }

}
