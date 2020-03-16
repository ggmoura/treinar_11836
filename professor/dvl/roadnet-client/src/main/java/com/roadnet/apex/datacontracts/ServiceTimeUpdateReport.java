
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ServiceTimeUpdateReport complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceTimeUpdateReport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumItemsEvaluated" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Records" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceTimeUpdateReport.Record" minOccurs="0"/&gt;
 *         &lt;element name="Report" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceTimeUpdateReport", propOrder = {
    "numItemsEvaluated",
    "records",
    "report"
})
public class ServiceTimeUpdateReport
    extends DataTransferObject
{

    @XmlElement(name = "NumItemsEvaluated")
    protected Integer numItemsEvaluated;
    @XmlElementRef(name = "Records", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceTimeUpdateReportRecord> records;
    @XmlElementRef(name = "Report", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> report;

    /**
     * Obtém o valor da propriedade numItemsEvaluated.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumItemsEvaluated() {
        return numItemsEvaluated;
    }

    /**
     * Define o valor da propriedade numItemsEvaluated.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumItemsEvaluated(Integer value) {
        this.numItemsEvaluated = value;
    }

    /**
     * Obtém o valor da propriedade records.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceTimeUpdateReportRecord }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceTimeUpdateReportRecord> getRecords() {
        return records;
    }

    /**
     * Define o valor da propriedade records.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceTimeUpdateReportRecord }{@code >}
     *     
     */
    public void setRecords(JAXBElement<ArrayOfServiceTimeUpdateReportRecord> value) {
        this.records = value;
    }

    /**
     * Obtém o valor da propriedade report.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getReport() {
        return report;
    }

    /**
     * Define o valor da propriedade report.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setReport(JAXBElement<byte[]> value) {
        this.report = value;
    }

}
