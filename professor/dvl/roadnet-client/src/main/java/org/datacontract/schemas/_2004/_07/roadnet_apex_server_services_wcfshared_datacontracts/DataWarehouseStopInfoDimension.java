
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.AggregateRootEntity;


/**
 * <p>Classe Java de DataWarehouseStopInfoDimension complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseStopInfoDimension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseStopInfoDimension_IsOffDayStop_ServicedDuringOffDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseStopInfoDimension_StopExecutionType_ExecutionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseStopType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseTimeVarianceType_ActualTimeWindowVarianceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseTimeVarianceType_ArrivalVarianceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseTimeVarianceType_DepartureVarianceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseTimeVarianceType_PlannedTimeWindowVarianceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseStopInfoDimension", propOrder = {
    "dataWarehouseStopInfoDimensionIsOffDayStopServicedDuringOffDay",
    "dataWarehouseStopInfoDimensionStopExecutionTypeExecutionType",
    "dataWarehouseStopTypeType",
    "dataWarehouseTimeVarianceTypeActualTimeWindowVarianceType",
    "dataWarehouseTimeVarianceTypeArrivalVarianceType",
    "dataWarehouseTimeVarianceTypeDepartureVarianceType",
    "dataWarehouseTimeVarianceTypePlannedTimeWindowVarianceType"
})
public class DataWarehouseStopInfoDimension
    extends AggregateRootEntity
{

    @XmlElementRef(name = "DataWarehouseStopInfoDimension_IsOffDayStop_ServicedDuringOffDay", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseStopInfoDimensionIsOffDayStopServicedDuringOffDay;
    @XmlElementRef(name = "DataWarehouseStopInfoDimension_StopExecutionType_ExecutionType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseStopInfoDimensionStopExecutionTypeExecutionType;
    @XmlElementRef(name = "DataWarehouseStopType_Type", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseStopTypeType;
    @XmlElementRef(name = "DataWarehouseTimeVarianceType_ActualTimeWindowVarianceType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseTimeVarianceTypeActualTimeWindowVarianceType;
    @XmlElementRef(name = "DataWarehouseTimeVarianceType_ArrivalVarianceType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseTimeVarianceTypeArrivalVarianceType;
    @XmlElementRef(name = "DataWarehouseTimeVarianceType_DepartureVarianceType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseTimeVarianceTypeDepartureVarianceType;
    @XmlElementRef(name = "DataWarehouseTimeVarianceType_PlannedTimeWindowVarianceType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseTimeVarianceTypePlannedTimeWindowVarianceType;

    /**
     * Obtém o valor da propriedade dataWarehouseStopInfoDimensionIsOffDayStopServicedDuringOffDay.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseStopInfoDimensionIsOffDayStopServicedDuringOffDay() {
        return dataWarehouseStopInfoDimensionIsOffDayStopServicedDuringOffDay;
    }

    /**
     * Define o valor da propriedade dataWarehouseStopInfoDimensionIsOffDayStopServicedDuringOffDay.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseStopInfoDimensionIsOffDayStopServicedDuringOffDay(JAXBElement<String> value) {
        this.dataWarehouseStopInfoDimensionIsOffDayStopServicedDuringOffDay = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseStopInfoDimensionStopExecutionTypeExecutionType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseStopInfoDimensionStopExecutionTypeExecutionType() {
        return dataWarehouseStopInfoDimensionStopExecutionTypeExecutionType;
    }

    /**
     * Define o valor da propriedade dataWarehouseStopInfoDimensionStopExecutionTypeExecutionType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseStopInfoDimensionStopExecutionTypeExecutionType(JAXBElement<String> value) {
        this.dataWarehouseStopInfoDimensionStopExecutionTypeExecutionType = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseStopTypeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseStopTypeType() {
        return dataWarehouseStopTypeType;
    }

    /**
     * Define o valor da propriedade dataWarehouseStopTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseStopTypeType(JAXBElement<String> value) {
        this.dataWarehouseStopTypeType = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseTimeVarianceTypeActualTimeWindowVarianceType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseTimeVarianceTypeActualTimeWindowVarianceType() {
        return dataWarehouseTimeVarianceTypeActualTimeWindowVarianceType;
    }

    /**
     * Define o valor da propriedade dataWarehouseTimeVarianceTypeActualTimeWindowVarianceType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseTimeVarianceTypeActualTimeWindowVarianceType(JAXBElement<String> value) {
        this.dataWarehouseTimeVarianceTypeActualTimeWindowVarianceType = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseTimeVarianceTypeArrivalVarianceType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseTimeVarianceTypeArrivalVarianceType() {
        return dataWarehouseTimeVarianceTypeArrivalVarianceType;
    }

    /**
     * Define o valor da propriedade dataWarehouseTimeVarianceTypeArrivalVarianceType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseTimeVarianceTypeArrivalVarianceType(JAXBElement<String> value) {
        this.dataWarehouseTimeVarianceTypeArrivalVarianceType = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseTimeVarianceTypeDepartureVarianceType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseTimeVarianceTypeDepartureVarianceType() {
        return dataWarehouseTimeVarianceTypeDepartureVarianceType;
    }

    /**
     * Define o valor da propriedade dataWarehouseTimeVarianceTypeDepartureVarianceType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseTimeVarianceTypeDepartureVarianceType(JAXBElement<String> value) {
        this.dataWarehouseTimeVarianceTypeDepartureVarianceType = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseTimeVarianceTypePlannedTimeWindowVarianceType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseTimeVarianceTypePlannedTimeWindowVarianceType() {
        return dataWarehouseTimeVarianceTypePlannedTimeWindowVarianceType;
    }

    /**
     * Define o valor da propriedade dataWarehouseTimeVarianceTypePlannedTimeWindowVarianceType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseTimeVarianceTypePlannedTimeWindowVarianceType(JAXBElement<String> value) {
        this.dataWarehouseTimeVarianceTypePlannedTimeWindowVarianceType = value;
    }

}
