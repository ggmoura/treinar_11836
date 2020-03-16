
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.AggregateRootEntity;


/**
 * <p>Classe Java de DataWarehouseRouteInfoDimension complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseRouteInfoDimension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CeaseDispatchUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehousePlannedAndActualType_PlannedAndActual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseTimeVarianceType_RouteArrivalTimeVarianceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseTimeVarianceType_RouteDepartureTimeVarianceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseTimeVarianceType_RouteEndTimeVarianceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseTimeVarianceType_RouteStartTimeVarianceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "DataWarehouseRouteInfoDimension", propOrder = {
    "ceaseDispatchUsed",
    "dataWarehousePlannedAndActualTypePlannedAndActual",
    "dataWarehouseTimeVarianceTypeRouteArrivalTimeVarianceType",
    "dataWarehouseTimeVarianceTypeRouteDepartureTimeVarianceType",
    "dataWarehouseTimeVarianceTypeRouteEndTimeVarianceType",
    "dataWarehouseTimeVarianceTypeRouteStartTimeVarianceType",
    "routeDataTransferUsed"
})
public class DataWarehouseRouteInfoDimension
    extends AggregateRootEntity
{

    @XmlElement(name = "CeaseDispatchUsed")
    protected Boolean ceaseDispatchUsed;
    @XmlElementRef(name = "DataWarehousePlannedAndActualType_PlannedAndActual", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehousePlannedAndActualTypePlannedAndActual;
    @XmlElementRef(name = "DataWarehouseTimeVarianceType_RouteArrivalTimeVarianceType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseTimeVarianceTypeRouteArrivalTimeVarianceType;
    @XmlElementRef(name = "DataWarehouseTimeVarianceType_RouteDepartureTimeVarianceType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseTimeVarianceTypeRouteDepartureTimeVarianceType;
    @XmlElementRef(name = "DataWarehouseTimeVarianceType_RouteEndTimeVarianceType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseTimeVarianceTypeRouteEndTimeVarianceType;
    @XmlElementRef(name = "DataWarehouseTimeVarianceType_RouteStartTimeVarianceType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseTimeVarianceTypeRouteStartTimeVarianceType;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehousePlannedAndActualTypePlannedAndActual() {
        return dataWarehousePlannedAndActualTypePlannedAndActual;
    }

    /**
     * Define o valor da propriedade dataWarehousePlannedAndActualTypePlannedAndActual.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehousePlannedAndActualTypePlannedAndActual(JAXBElement<String> value) {
        this.dataWarehousePlannedAndActualTypePlannedAndActual = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseTimeVarianceTypeRouteArrivalTimeVarianceType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseTimeVarianceTypeRouteArrivalTimeVarianceType() {
        return dataWarehouseTimeVarianceTypeRouteArrivalTimeVarianceType;
    }

    /**
     * Define o valor da propriedade dataWarehouseTimeVarianceTypeRouteArrivalTimeVarianceType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseTimeVarianceTypeRouteArrivalTimeVarianceType(JAXBElement<String> value) {
        this.dataWarehouseTimeVarianceTypeRouteArrivalTimeVarianceType = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseTimeVarianceTypeRouteDepartureTimeVarianceType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseTimeVarianceTypeRouteDepartureTimeVarianceType() {
        return dataWarehouseTimeVarianceTypeRouteDepartureTimeVarianceType;
    }

    /**
     * Define o valor da propriedade dataWarehouseTimeVarianceTypeRouteDepartureTimeVarianceType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseTimeVarianceTypeRouteDepartureTimeVarianceType(JAXBElement<String> value) {
        this.dataWarehouseTimeVarianceTypeRouteDepartureTimeVarianceType = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseTimeVarianceTypeRouteEndTimeVarianceType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseTimeVarianceTypeRouteEndTimeVarianceType() {
        return dataWarehouseTimeVarianceTypeRouteEndTimeVarianceType;
    }

    /**
     * Define o valor da propriedade dataWarehouseTimeVarianceTypeRouteEndTimeVarianceType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseTimeVarianceTypeRouteEndTimeVarianceType(JAXBElement<String> value) {
        this.dataWarehouseTimeVarianceTypeRouteEndTimeVarianceType = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseTimeVarianceTypeRouteStartTimeVarianceType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseTimeVarianceTypeRouteStartTimeVarianceType() {
        return dataWarehouseTimeVarianceTypeRouteStartTimeVarianceType;
    }

    /**
     * Define o valor da propriedade dataWarehouseTimeVarianceTypeRouteStartTimeVarianceType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseTimeVarianceTypeRouteStartTimeVarianceType(JAXBElement<String> value) {
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
