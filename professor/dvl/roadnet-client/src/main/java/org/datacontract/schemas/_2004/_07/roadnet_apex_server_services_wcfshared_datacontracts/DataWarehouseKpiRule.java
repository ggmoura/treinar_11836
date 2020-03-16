
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DataWarehouseKpiRule complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseKpiRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Criteria" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}ArrayOfDataWarehouseKpiCriteria" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseKpiLogicalOperatorType_LogicalOperator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseKpiMeasure_MeasureCompareSetting_MeasureCompare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeasureGuid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseKpiRule", propOrder = {
    "criteria",
    "dataWarehouseKpiLogicalOperatorTypeLogicalOperator",
    "dataWarehouseKpiMeasureMeasureCompareSettingMeasureCompare",
    "measureGuid"
})
public class DataWarehouseKpiRule
    extends DataTransferObject
{

    @XmlElementRef(name = "Criteria", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDataWarehouseKpiCriteria> criteria;
    @XmlElementRef(name = "DataWarehouseKpiLogicalOperatorType_LogicalOperator", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseKpiLogicalOperatorTypeLogicalOperator;
    @XmlElementRef(name = "DataWarehouseKpiMeasure_MeasureCompareSetting_MeasureCompare", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseKpiMeasureMeasureCompareSettingMeasureCompare;
    @XmlElement(name = "MeasureGuid")
    protected String measureGuid;

    /**
     * Obtém o valor da propriedade criteria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseKpiCriteria }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDataWarehouseKpiCriteria> getCriteria() {
        return criteria;
    }

    /**
     * Define o valor da propriedade criteria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseKpiCriteria }{@code >}
     *     
     */
    public void setCriteria(JAXBElement<ArrayOfDataWarehouseKpiCriteria> value) {
        this.criteria = value;
    }

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
     * Obtém o valor da propriedade dataWarehouseKpiMeasureMeasureCompareSettingMeasureCompare.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseKpiMeasureMeasureCompareSettingMeasureCompare() {
        return dataWarehouseKpiMeasureMeasureCompareSettingMeasureCompare;
    }

    /**
     * Define o valor da propriedade dataWarehouseKpiMeasureMeasureCompareSettingMeasureCompare.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseKpiMeasureMeasureCompareSettingMeasureCompare(JAXBElement<String> value) {
        this.dataWarehouseKpiMeasureMeasureCompareSettingMeasureCompare = value;
    }

    /**
     * Obtém o valor da propriedade measureGuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureGuid() {
        return measureGuid;
    }

    /**
     * Define o valor da propriedade measureGuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureGuid(String value) {
        this.measureGuid = value;
    }

}
