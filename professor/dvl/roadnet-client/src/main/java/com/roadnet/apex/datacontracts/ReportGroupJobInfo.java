
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * <p>Classe Java de ReportGroupJobInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReportGroupJobInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}JobInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExecutedReportKeyCollection" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="ReportGroupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportGroupIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportsExecutedCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Results" type="{http://roadnet.com/apex/DataContracts/}ArrayOfReportGroupReportResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportGroupJobInfo", propOrder = {
    "executedReportKeyCollection",
    "reportGroupDescription",
    "reportGroupIdentifier",
    "reportsExecutedCount",
    "results"
})
public class ReportGroupJobInfo
    extends JobInfo
{

    @XmlElementRef(name = "ExecutedReportKeyCollection", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> executedReportKeyCollection;
    @XmlElementRef(name = "ReportGroupDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportGroupDescription;
    @XmlElementRef(name = "ReportGroupIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportGroupIdentifier;
    @XmlElement(name = "ReportsExecutedCount")
    protected Integer reportsExecutedCount;
    @XmlElementRef(name = "Results", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReportGroupReportResult> results;

    /**
     * Obtém o valor da propriedade executedReportKeyCollection.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getExecutedReportKeyCollection() {
        return executedReportKeyCollection;
    }

    /**
     * Define o valor da propriedade executedReportKeyCollection.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setExecutedReportKeyCollection(JAXBElement<ArrayOflong> value) {
        this.executedReportKeyCollection = value;
    }

    /**
     * Obtém o valor da propriedade reportGroupDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportGroupDescription() {
        return reportGroupDescription;
    }

    /**
     * Define o valor da propriedade reportGroupDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportGroupDescription(JAXBElement<String> value) {
        this.reportGroupDescription = value;
    }

    /**
     * Obtém o valor da propriedade reportGroupIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportGroupIdentifier() {
        return reportGroupIdentifier;
    }

    /**
     * Define o valor da propriedade reportGroupIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportGroupIdentifier(JAXBElement<String> value) {
        this.reportGroupIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade reportsExecutedCount.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReportsExecutedCount() {
        return reportsExecutedCount;
    }

    /**
     * Define o valor da propriedade reportsExecutedCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReportsExecutedCount(Integer value) {
        this.reportsExecutedCount = value;
    }

    /**
     * Obtém o valor da propriedade results.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReportGroupReportResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReportGroupReportResult> getResults() {
        return results;
    }

    /**
     * Define o valor da propriedade results.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReportGroupReportResult }{@code >}
     *     
     */
    public void setResults(JAXBElement<ArrayOfReportGroupReportResult> value) {
        this.results = value;
    }

}
