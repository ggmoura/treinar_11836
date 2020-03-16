
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.ArrayOfDimensionDetail;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseResourceEvent;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseRouteData;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseStop;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseTimeDimension;


/**
 * <p>Classe Java de MeasureResultDataPoint complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MeasureResultDataPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseResourceEvent" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseResourceEvent" minOccurs="0"/&gt;
 *         &lt;element name="DimensionDetails" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}ArrayOfDimensionDetail" minOccurs="0"/&gt;
 *         &lt;element name="RouteData" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseRouteData" minOccurs="0"/&gt;
 *         &lt;element name="RouteInternalKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RuleStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopHeader" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseStop" minOccurs="0"/&gt;
 *         &lt;element name="Time" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseTimeDimension" minOccurs="0"/&gt;
 *         &lt;element name="Values" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}ArrayOfMeasureResultValuePoint" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureResultDataPoint", propOrder = {
    "dataWarehouseResourceEvent",
    "dimensionDetails",
    "routeData",
    "routeInternalKey",
    "ruleStatus",
    "stopHeader",
    "time",
    "values"
})
public class MeasureResultDataPoint
    extends DataTransferObject
{

    @XmlElementRef(name = "DataWarehouseResourceEvent", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<DataWarehouseResourceEvent> dataWarehouseResourceEvent;
    @XmlElementRef(name = "DimensionDetails", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDimensionDetail> dimensionDetails;
    @XmlElementRef(name = "RouteData", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<DataWarehouseRouteData> routeData;
    @XmlElementRef(name = "RouteInternalKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> routeInternalKey;
    @XmlElement(name = "RuleStatus")
    protected Boolean ruleStatus;
    @XmlElementRef(name = "StopHeader", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<DataWarehouseStop> stopHeader;
    @XmlElementRef(name = "Time", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<DataWarehouseTimeDimension> time;
    @XmlElementRef(name = "Values", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMeasureResultValuePoint> values;

    /**
     * Obtém o valor da propriedade dataWarehouseResourceEvent.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseResourceEvent }{@code >}
     *     
     */
    public JAXBElement<DataWarehouseResourceEvent> getDataWarehouseResourceEvent() {
        return dataWarehouseResourceEvent;
    }

    /**
     * Define o valor da propriedade dataWarehouseResourceEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseResourceEvent }{@code >}
     *     
     */
    public void setDataWarehouseResourceEvent(JAXBElement<DataWarehouseResourceEvent> value) {
        this.dataWarehouseResourceEvent = value;
    }

    /**
     * Obtém o valor da propriedade dimensionDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDimensionDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDimensionDetail> getDimensionDetails() {
        return dimensionDetails;
    }

    /**
     * Define o valor da propriedade dimensionDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDimensionDetail }{@code >}
     *     
     */
    public void setDimensionDetails(JAXBElement<ArrayOfDimensionDetail> value) {
        this.dimensionDetails = value;
    }

    /**
     * Obtém o valor da propriedade routeData.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseRouteData }{@code >}
     *     
     */
    public JAXBElement<DataWarehouseRouteData> getRouteData() {
        return routeData;
    }

    /**
     * Define o valor da propriedade routeData.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseRouteData }{@code >}
     *     
     */
    public void setRouteData(JAXBElement<DataWarehouseRouteData> value) {
        this.routeData = value;
    }

    /**
     * Obtém o valor da propriedade routeInternalKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRouteInternalKey() {
        return routeInternalKey;
    }

    /**
     * Define o valor da propriedade routeInternalKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRouteInternalKey(JAXBElement<Long> value) {
        this.routeInternalKey = value;
    }

    /**
     * Obtém o valor da propriedade ruleStatus.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRuleStatus() {
        return ruleStatus;
    }

    /**
     * Define o valor da propriedade ruleStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRuleStatus(Boolean value) {
        this.ruleStatus = value;
    }

    /**
     * Obtém o valor da propriedade stopHeader.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseStop }{@code >}
     *     
     */
    public JAXBElement<DataWarehouseStop> getStopHeader() {
        return stopHeader;
    }

    /**
     * Define o valor da propriedade stopHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseStop }{@code >}
     *     
     */
    public void setStopHeader(JAXBElement<DataWarehouseStop> value) {
        this.stopHeader = value;
    }

    /**
     * Obtém o valor da propriedade time.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseTimeDimension }{@code >}
     *     
     */
    public JAXBElement<DataWarehouseTimeDimension> getTime() {
        return time;
    }

    /**
     * Define o valor da propriedade time.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseTimeDimension }{@code >}
     *     
     */
    public void setTime(JAXBElement<DataWarehouseTimeDimension> value) {
        this.time = value;
    }

    /**
     * Obtém o valor da propriedade values.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMeasureResultValuePoint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMeasureResultValuePoint> getValues() {
        return values;
    }

    /**
     * Define o valor da propriedade values.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMeasureResultValuePoint }{@code >}
     *     
     */
    public void setValues(JAXBElement<ArrayOfMeasureResultValuePoint> value) {
        this.values = value;
    }

}
