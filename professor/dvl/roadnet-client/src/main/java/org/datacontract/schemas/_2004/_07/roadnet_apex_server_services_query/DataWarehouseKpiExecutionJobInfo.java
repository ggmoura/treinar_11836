
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.JobInfo;


/**
 * <p>Classe Java de DataWarehouseKpiExecutionJobInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseKpiExecutionJobInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}JobInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QueryResults" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}KpiQueryResults" minOccurs="0"/&gt;
 *         &lt;element name="Result" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}DataWarehouseKpiExecutionJobResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseKpiExecutionJobInfo", propOrder = {
    "percentComplete",
    "queryResults",
    "result"
})
public class DataWarehouseKpiExecutionJobInfo
    extends JobInfo
{

    @XmlElement(name = "PercentComplete")
    protected Double percentComplete;
    @XmlElementRef(name = "QueryResults", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<KpiQueryResults> queryResults;
    @XmlElementRef(name = "Result", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<DataWarehouseKpiExecutionJobResult> result;

    /**
     * Obtém o valor da propriedade percentComplete.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentComplete() {
        return percentComplete;
    }

    /**
     * Define o valor da propriedade percentComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentComplete(Double value) {
        this.percentComplete = value;
    }

    /**
     * Obtém o valor da propriedade queryResults.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KpiQueryResults }{@code >}
     *     
     */
    public JAXBElement<KpiQueryResults> getQueryResults() {
        return queryResults;
    }

    /**
     * Define o valor da propriedade queryResults.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KpiQueryResults }{@code >}
     *     
     */
    public void setQueryResults(JAXBElement<KpiQueryResults> value) {
        this.queryResults = value;
    }

    /**
     * Obtém o valor da propriedade result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiExecutionJobResult }{@code >}
     *     
     */
    public JAXBElement<DataWarehouseKpiExecutionJobResult> getResult() {
        return result;
    }

    /**
     * Define o valor da propriedade result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiExecutionJobResult }{@code >}
     *     
     */
    public void setResult(JAXBElement<DataWarehouseKpiExecutionJobResult> value) {
        this.result = value;
    }

}
