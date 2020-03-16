
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de KpiExportParametersPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="KpiExportParametersPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseFileType_FileType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DownloadCenterUrl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Kpi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="KpiQuery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MeasureUnitOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KpiExportParametersPropertyOptions", propOrder = {
    "dataWarehouseFileTypeFileType",
    "downloadCenterUrl",
    "fileName",
    "kpi",
    "kpiQuery",
    "measureUnitOptions"
})
public class KpiExportParametersPropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "DataWarehouseFileType_FileType")
    protected Boolean dataWarehouseFileTypeFileType;
    @XmlElement(name = "DownloadCenterUrl")
    protected Boolean downloadCenterUrl;
    @XmlElement(name = "FileName")
    protected Boolean fileName;
    @XmlElement(name = "Kpi")
    protected Boolean kpi;
    @XmlElement(name = "KpiQuery")
    protected Boolean kpiQuery;
    @XmlElement(name = "MeasureUnitOptions")
    protected Boolean measureUnitOptions;

    /**
     * Obtém o valor da propriedade dataWarehouseFileTypeFileType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseFileTypeFileType() {
        return dataWarehouseFileTypeFileType;
    }

    /**
     * Define o valor da propriedade dataWarehouseFileTypeFileType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseFileTypeFileType(Boolean value) {
        this.dataWarehouseFileTypeFileType = value;
    }

    /**
     * Obtém o valor da propriedade downloadCenterUrl.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDownloadCenterUrl() {
        return downloadCenterUrl;
    }

    /**
     * Define o valor da propriedade downloadCenterUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDownloadCenterUrl(Boolean value) {
        this.downloadCenterUrl = value;
    }

    /**
     * Obtém o valor da propriedade fileName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFileName() {
        return fileName;
    }

    /**
     * Define o valor da propriedade fileName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFileName(Boolean value) {
        this.fileName = value;
    }

    /**
     * Obtém o valor da propriedade kpi.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKpi() {
        return kpi;
    }

    /**
     * Define o valor da propriedade kpi.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKpi(Boolean value) {
        this.kpi = value;
    }

    /**
     * Obtém o valor da propriedade kpiQuery.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKpiQuery() {
        return kpiQuery;
    }

    /**
     * Define o valor da propriedade kpiQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKpiQuery(Boolean value) {
        this.kpiQuery = value;
    }

    /**
     * Obtém o valor da propriedade measureUnitOptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeasureUnitOptions() {
        return measureUnitOptions;
    }

    /**
     * Define o valor da propriedade measureUnitOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeasureUnitOptions(Boolean value) {
        this.measureUnitOptions = value;
    }

}
