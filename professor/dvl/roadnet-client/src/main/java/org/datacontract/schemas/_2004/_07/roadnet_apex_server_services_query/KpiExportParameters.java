
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiBase;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.MeasureUnitOptions;


/**
 * <p>Classe Java de KpiExportParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="KpiExportParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseFileType_FileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DownloadCenterUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Kpi" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseKpiBase" minOccurs="0"/&gt;
 *         &lt;element name="KpiQuery" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}KpiQuery" minOccurs="0"/&gt;
 *         &lt;element name="MeasureUnitOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}MeasureUnitOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KpiExportParameters", propOrder = {
    "dataWarehouseFileTypeFileType",
    "downloadCenterUrl",
    "fileName",
    "kpi",
    "kpiQuery",
    "measureUnitOptions"
})
public class KpiExportParameters
    extends DataTransferObject
{

    @XmlElementRef(name = "DataWarehouseFileType_FileType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseFileTypeFileType;
    @XmlElementRef(name = "DownloadCenterUrl", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> downloadCenterUrl;
    @XmlElementRef(name = "FileName", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileName;
    @XmlElementRef(name = "Kpi", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<DataWarehouseKpiBase> kpi;
    @XmlElementRef(name = "KpiQuery", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<KpiQuery> kpiQuery;
    @XmlElementRef(name = "MeasureUnitOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<MeasureUnitOptions> measureUnitOptions;

    /**
     * Obtém o valor da propriedade dataWarehouseFileTypeFileType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseFileTypeFileType() {
        return dataWarehouseFileTypeFileType;
    }

    /**
     * Define o valor da propriedade dataWarehouseFileTypeFileType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseFileTypeFileType(JAXBElement<String> value) {
        this.dataWarehouseFileTypeFileType = value;
    }

    /**
     * Obtém o valor da propriedade downloadCenterUrl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDownloadCenterUrl() {
        return downloadCenterUrl;
    }

    /**
     * Define o valor da propriedade downloadCenterUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDownloadCenterUrl(JAXBElement<String> value) {
        this.downloadCenterUrl = value;
    }

    /**
     * Obtém o valor da propriedade fileName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileName() {
        return fileName;
    }

    /**
     * Define o valor da propriedade fileName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileName(JAXBElement<String> value) {
        this.fileName = value;
    }

    /**
     * Obtém o valor da propriedade kpi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiBase }{@code >}
     *     
     */
    public JAXBElement<DataWarehouseKpiBase> getKpi() {
        return kpi;
    }

    /**
     * Define o valor da propriedade kpi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiBase }{@code >}
     *     
     */
    public void setKpi(JAXBElement<DataWarehouseKpiBase> value) {
        this.kpi = value;
    }

    /**
     * Obtém o valor da propriedade kpiQuery.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KpiQuery }{@code >}
     *     
     */
    public JAXBElement<KpiQuery> getKpiQuery() {
        return kpiQuery;
    }

    /**
     * Define o valor da propriedade kpiQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KpiQuery }{@code >}
     *     
     */
    public void setKpiQuery(JAXBElement<KpiQuery> value) {
        this.kpiQuery = value;
    }

    /**
     * Obtém o valor da propriedade measureUnitOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeasureUnitOptions }{@code >}
     *     
     */
    public JAXBElement<MeasureUnitOptions> getMeasureUnitOptions() {
        return measureUnitOptions;
    }

    /**
     * Define o valor da propriedade measureUnitOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeasureUnitOptions }{@code >}
     *     
     */
    public void setMeasureUnitOptions(JAXBElement<MeasureUnitOptions> value) {
        this.measureUnitOptions = value;
    }

}
