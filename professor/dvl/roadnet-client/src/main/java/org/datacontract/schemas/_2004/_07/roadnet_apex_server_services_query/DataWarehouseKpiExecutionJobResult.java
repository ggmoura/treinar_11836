
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DataWarehouseKpiExecutionJobResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseKpiExecutionJobResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KpiQueryResults" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}KpiQueryResults" minOccurs="0"/&gt;
 *         &lt;element name="KpiResult" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}DataWarehouseKpiResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseKpiExecutionJobResult", propOrder = {
    "kpiQueryResults",
    "kpiResult"
})
public class DataWarehouseKpiExecutionJobResult
    extends DataTransferObject
{

    @XmlElementRef(name = "KpiQueryResults", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<KpiQueryResults> kpiQueryResults;
    @XmlElementRef(name = "KpiResult", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<DataWarehouseKpiResult> kpiResult;

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

    /**
     * Obtém o valor da propriedade kpiResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiResult }{@code >}
     *     
     */
    public JAXBElement<DataWarehouseKpiResult> getKpiResult() {
        return kpiResult;
    }

    /**
     * Define o valor da propriedade kpiResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiResult }{@code >}
     *     
     */
    public void setKpiResult(JAXBElement<DataWarehouseKpiResult> value) {
        this.kpiResult = value;
    }

}
