
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ServicePatternAnalyzerResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServicePatternAnalyzerResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Report" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="Summary" type="{http://roadnet.com/apex/DataContracts/}ServicePatternAnalyzerResult.ServicePatternAnalyzerSummary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicePatternAnalyzerResult", propOrder = {
    "report",
    "summary"
})
public class ServicePatternAnalyzerResult
    extends DataTransferObject
{

    @XmlElementRef(name = "Report", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> report;
    @XmlElementRef(name = "Summary", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServicePatternAnalyzerResultServicePatternAnalyzerSummary> summary;

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

    /**
     * Obtém o valor da propriedade summary.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServicePatternAnalyzerResultServicePatternAnalyzerSummary }{@code >}
     *     
     */
    public JAXBElement<ServicePatternAnalyzerResultServicePatternAnalyzerSummary> getSummary() {
        return summary;
    }

    /**
     * Define o valor da propriedade summary.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServicePatternAnalyzerResultServicePatternAnalyzerSummary }{@code >}
     *     
     */
    public void setSummary(JAXBElement<ServicePatternAnalyzerResultServicePatternAnalyzerSummary> value) {
        this.summary = value;
    }

}
