
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de StopInfoDimensionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StopInfoDimensionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseStopInfoDimension_IsOffDayStop_ServicedDuringOffDay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseStopInfoDimension_StopExecutionType_ExecutionType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseStopType_Type" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseTimeVarianceType_ActualTimeWindowVarianceType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseTimeVarianceType_ArrivalVarianceType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseTimeVarianceType_DepartureVarianceType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseTimeVarianceType_PlannedTimeWindowVarianceType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopInfoDimensionPropertyOptions", propOrder = {
    "dataWarehouseStopInfoDimensionIsOffDayStopServicedDuringOffDay",
    "dataWarehouseStopInfoDimensionStopExecutionTypeExecutionType",
    "dataWarehouseStopTypeType",
    "dataWarehouseTimeVarianceTypeActualTimeWindowVarianceType",
    "dataWarehouseTimeVarianceTypeArrivalVarianceType",
    "dataWarehouseTimeVarianceTypeDepartureVarianceType",
    "dataWarehouseTimeVarianceTypePlannedTimeWindowVarianceType"
})
public class StopInfoDimensionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "DataWarehouseStopInfoDimension_IsOffDayStop_ServicedDuringOffDay")
    protected Boolean dataWarehouseStopInfoDimensionIsOffDayStopServicedDuringOffDay;
    @XmlElement(name = "DataWarehouseStopInfoDimension_StopExecutionType_ExecutionType")
    protected Boolean dataWarehouseStopInfoDimensionStopExecutionTypeExecutionType;
    @XmlElement(name = "DataWarehouseStopType_Type")
    protected Boolean dataWarehouseStopTypeType;
    @XmlElement(name = "DataWarehouseTimeVarianceType_ActualTimeWindowVarianceType")
    protected Boolean dataWarehouseTimeVarianceTypeActualTimeWindowVarianceType;
    @XmlElement(name = "DataWarehouseTimeVarianceType_ArrivalVarianceType")
    protected Boolean dataWarehouseTimeVarianceTypeArrivalVarianceType;
    @XmlElement(name = "DataWarehouseTimeVarianceType_DepartureVarianceType")
    protected Boolean dataWarehouseTimeVarianceTypeDepartureVarianceType;
    @XmlElement(name = "DataWarehouseTimeVarianceType_PlannedTimeWindowVarianceType")
    protected Boolean dataWarehouseTimeVarianceTypePlannedTimeWindowVarianceType;

    /**
     * Obtém o valor da propriedade dataWarehouseStopInfoDimensionIsOffDayStopServicedDuringOffDay.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseStopInfoDimensionIsOffDayStopServicedDuringOffDay() {
        return dataWarehouseStopInfoDimensionIsOffDayStopServicedDuringOffDay;
    }

    /**
     * Define o valor da propriedade dataWarehouseStopInfoDimensionIsOffDayStopServicedDuringOffDay.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseStopInfoDimensionIsOffDayStopServicedDuringOffDay(Boolean value) {
        this.dataWarehouseStopInfoDimensionIsOffDayStopServicedDuringOffDay = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseStopInfoDimensionStopExecutionTypeExecutionType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseStopInfoDimensionStopExecutionTypeExecutionType() {
        return dataWarehouseStopInfoDimensionStopExecutionTypeExecutionType;
    }

    /**
     * Define o valor da propriedade dataWarehouseStopInfoDimensionStopExecutionTypeExecutionType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseStopInfoDimensionStopExecutionTypeExecutionType(Boolean value) {
        this.dataWarehouseStopInfoDimensionStopExecutionTypeExecutionType = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseStopTypeType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseStopTypeType() {
        return dataWarehouseStopTypeType;
    }

    /**
     * Define o valor da propriedade dataWarehouseStopTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseStopTypeType(Boolean value) {
        this.dataWarehouseStopTypeType = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseTimeVarianceTypeActualTimeWindowVarianceType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseTimeVarianceTypeActualTimeWindowVarianceType() {
        return dataWarehouseTimeVarianceTypeActualTimeWindowVarianceType;
    }

    /**
     * Define o valor da propriedade dataWarehouseTimeVarianceTypeActualTimeWindowVarianceType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseTimeVarianceTypeActualTimeWindowVarianceType(Boolean value) {
        this.dataWarehouseTimeVarianceTypeActualTimeWindowVarianceType = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseTimeVarianceTypeArrivalVarianceType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseTimeVarianceTypeArrivalVarianceType() {
        return dataWarehouseTimeVarianceTypeArrivalVarianceType;
    }

    /**
     * Define o valor da propriedade dataWarehouseTimeVarianceTypeArrivalVarianceType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseTimeVarianceTypeArrivalVarianceType(Boolean value) {
        this.dataWarehouseTimeVarianceTypeArrivalVarianceType = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseTimeVarianceTypeDepartureVarianceType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseTimeVarianceTypeDepartureVarianceType() {
        return dataWarehouseTimeVarianceTypeDepartureVarianceType;
    }

    /**
     * Define o valor da propriedade dataWarehouseTimeVarianceTypeDepartureVarianceType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseTimeVarianceTypeDepartureVarianceType(Boolean value) {
        this.dataWarehouseTimeVarianceTypeDepartureVarianceType = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseTimeVarianceTypePlannedTimeWindowVarianceType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseTimeVarianceTypePlannedTimeWindowVarianceType() {
        return dataWarehouseTimeVarianceTypePlannedTimeWindowVarianceType;
    }

    /**
     * Define o valor da propriedade dataWarehouseTimeVarianceTypePlannedTimeWindowVarianceType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseTimeVarianceTypePlannedTimeWindowVarianceType(Boolean value) {
        this.dataWarehouseTimeVarianceTypePlannedTimeWindowVarianceType = value;
    }

}
