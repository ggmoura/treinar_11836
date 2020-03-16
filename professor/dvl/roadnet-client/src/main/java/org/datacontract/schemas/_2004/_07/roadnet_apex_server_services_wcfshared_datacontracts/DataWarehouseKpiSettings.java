
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DataWarehouseKpiSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseKpiSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseKpiSettings_KpiDisplayMode_DisplayMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SortingOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseKpiSortingOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseKpiSettings", propOrder = {
    "dataWarehouseKpiSettingsKpiDisplayModeDisplayMode",
    "sortingOptions"
})
public class DataWarehouseKpiSettings
    extends DataTransferObject
{

    @XmlElementRef(name = "DataWarehouseKpiSettings_KpiDisplayMode_DisplayMode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseKpiSettingsKpiDisplayModeDisplayMode;
    @XmlElementRef(name = "SortingOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<DataWarehouseKpiSortingOptions> sortingOptions;

    /**
     * Obtém o valor da propriedade dataWarehouseKpiSettingsKpiDisplayModeDisplayMode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseKpiSettingsKpiDisplayModeDisplayMode() {
        return dataWarehouseKpiSettingsKpiDisplayModeDisplayMode;
    }

    /**
     * Define o valor da propriedade dataWarehouseKpiSettingsKpiDisplayModeDisplayMode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseKpiSettingsKpiDisplayModeDisplayMode(JAXBElement<String> value) {
        this.dataWarehouseKpiSettingsKpiDisplayModeDisplayMode = value;
    }

    /**
     * Obtém o valor da propriedade sortingOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiSortingOptions }{@code >}
     *     
     */
    public JAXBElement<DataWarehouseKpiSortingOptions> getSortingOptions() {
        return sortingOptions;
    }

    /**
     * Define o valor da propriedade sortingOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiSortingOptions }{@code >}
     *     
     */
    public void setSortingOptions(JAXBElement<DataWarehouseKpiSortingOptions> value) {
        this.sortingOptions = value;
    }

}
