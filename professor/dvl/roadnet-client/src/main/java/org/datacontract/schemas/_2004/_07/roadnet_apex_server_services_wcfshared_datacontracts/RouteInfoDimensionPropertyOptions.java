
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de RouteInfoDimensionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteInfoDimensionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CeaseDispatchUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehousePlannedAndActualType_PlannedAndActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseTimeVarianceType_RouteArrivalTimeVarianceType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseTimeVarianceType_RouteDepartureTimeVarianceType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseTimeVarianceType_RouteEndTimeVarianceType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseTimeVarianceType_RouteStartTimeVarianceType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteDataTransferUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteInfoDimensionPropertyOptions", propOrder = {
    "ceaseDispatchUsed",
    "dataWarehousePlannedAndActualTypePlannedAndActual",
    "dataWarehouseTimeVarianceTypeRouteArrivalTimeVarianceType",
    "dataWarehouseTimeVarianceTypeRouteDepartureTimeVarianceType",
    "dataWarehouseTimeVarianceTypeRouteEndTimeVarianceType",
    "dataWarehouseTimeVarianceTypeRouteStartTimeVarianceType",
    "routeDataTransferUsed"
})
public class RouteInfoDimensionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "CeaseDispatchUsed")
    protected Boolean ceaseDispatchUsed;
    @XmlElement(name = "DataWarehousePlannedAndActualType_PlannedAndActual")
    protected Boolean dataWarehousePlannedAndActualTypePlannedAndActual;
    @XmlElement(name = "DataWarehouseTimeVarianceType_RouteArrivalTimeVarianceType")
    protected Boolean dataWarehouseTimeVarianceTypeRouteArrivalTimeVarianceType;
    @XmlElement(name = "DataWarehouseTimeVarianceType_RouteDepartureTimeVarianceType")
    protected Boolean dataWarehouseTimeVarianceTypeRouteDepartureTimeVarianceType;
    @XmlElement(name = "DataWarehouseTimeVarianceType_RouteEndTimeVarianceType")
    protected Boolean dataWarehouseTimeVarianceTypeRouteEndTimeVarianceType;
    @XmlElement(name = "DataWarehouseTimeVarianceType_RouteStartTimeVarianceType")
    protected Boolean dataWarehouseTimeVarianceTypeRouteStartTimeVarianceType;
    @XmlElement(name = "RouteDataTransferUsed")
    protected Boolean routeDataTransferUsed;

    /**
     * Obtém o valor da propriedade ceaseDispatchUsed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCeaseDispatchUsed() {
        return ceaseDispatchUsed;
    }

    /**
     * Define o valor da propriedade ceaseDispatchUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCeaseDispatchUsed(Boolean value) {
        this.ceaseDispatchUsed = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehousePlannedAndActualTypePlannedAndActual.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehousePlannedAndActualTypePlannedAndActual() {
        return dataWarehousePlannedAndActualTypePlannedAndActual;
    }

    /**
     * Define o valor da propriedade dataWarehousePlannedAndActualTypePlannedAndActual.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehousePlannedAndActualTypePlannedAndActual(Boolean value) {
        this.dataWarehousePlannedAndActualTypePlannedAndActual = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseTimeVarianceTypeRouteArrivalTimeVarianceType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseTimeVarianceTypeRouteArrivalTimeVarianceType() {
        return dataWarehouseTimeVarianceTypeRouteArrivalTimeVarianceType;
    }

    /**
     * Define o valor da propriedade dataWarehouseTimeVarianceTypeRouteArrivalTimeVarianceType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseTimeVarianceTypeRouteArrivalTimeVarianceType(Boolean value) {
        this.dataWarehouseTimeVarianceTypeRouteArrivalTimeVarianceType = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseTimeVarianceTypeRouteDepartureTimeVarianceType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseTimeVarianceTypeRouteDepartureTimeVarianceType() {
        return dataWarehouseTimeVarianceTypeRouteDepartureTimeVarianceType;
    }

    /**
     * Define o valor da propriedade dataWarehouseTimeVarianceTypeRouteDepartureTimeVarianceType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseTimeVarianceTypeRouteDepartureTimeVarianceType(Boolean value) {
        this.dataWarehouseTimeVarianceTypeRouteDepartureTimeVarianceType = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseTimeVarianceTypeRouteEndTimeVarianceType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseTimeVarianceTypeRouteEndTimeVarianceType() {
        return dataWarehouseTimeVarianceTypeRouteEndTimeVarianceType;
    }

    /**
     * Define o valor da propriedade dataWarehouseTimeVarianceTypeRouteEndTimeVarianceType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseTimeVarianceTypeRouteEndTimeVarianceType(Boolean value) {
        this.dataWarehouseTimeVarianceTypeRouteEndTimeVarianceType = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseTimeVarianceTypeRouteStartTimeVarianceType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseTimeVarianceTypeRouteStartTimeVarianceType() {
        return dataWarehouseTimeVarianceTypeRouteStartTimeVarianceType;
    }

    /**
     * Define o valor da propriedade dataWarehouseTimeVarianceTypeRouteStartTimeVarianceType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseTimeVarianceTypeRouteStartTimeVarianceType(Boolean value) {
        this.dataWarehouseTimeVarianceTypeRouteStartTimeVarianceType = value;
    }

    /**
     * Obtém o valor da propriedade routeDataTransferUsed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteDataTransferUsed() {
        return routeDataTransferUsed;
    }

    /**
     * Define o valor da propriedade routeDataTransferUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteDataTransferUsed(Boolean value) {
        this.routeDataTransferUsed = value;
    }

}
