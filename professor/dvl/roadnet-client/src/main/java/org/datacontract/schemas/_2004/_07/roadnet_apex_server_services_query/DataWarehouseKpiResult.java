
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiDescription;


/**
 * <p>Classe Java de DataWarehouseKpiResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseKpiResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KpiDescription" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseKpiDescription" minOccurs="0"/&gt;
 *         &lt;element name="KpiQueryResults" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}KpiQueryResults" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseKpiResult", propOrder = {
    "kpiDescription",
    "kpiQueryResults"
})
public class DataWarehouseKpiResult
    extends DataTransferObject
{

    @XmlElementRef(name = "KpiDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<DataWarehouseKpiDescription> kpiDescription;
    @XmlElementRef(name = "KpiQueryResults", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<KpiQueryResults> kpiQueryResults;

    /**
     * Obtém o valor da propriedade kpiDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiDescription }{@code >}
     *     
     */
    public JAXBElement<DataWarehouseKpiDescription> getKpiDescription() {
        return kpiDescription;
    }

    /**
     * Define o valor da propriedade kpiDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiDescription }{@code >}
     *     
     */
    public void setKpiDescription(JAXBElement<DataWarehouseKpiDescription> value) {
        this.kpiDescription = value;
    }

    /**
     * Obtém o valor da propriedade kpiQueryResults.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KpiQueryResults }{@code >}
     *     
     */
    public JAXBElement<KpiQueryResults> getKpiQueryResults() {
        return kpiQueryResults;
    }

    /**
     * Define o valor da propriedade kpiQueryResults.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KpiQueryResults }{@code >}
     *     
     */
    public void setKpiQueryResults(JAXBElement<KpiQueryResults> value) {
        this.kpiQueryResults = value;
    }

}
