
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UploadCustomReportResults complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UploadCustomReportResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReportFileUploaded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReportSaved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StoredProcedureCreated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StoredProcedureIsNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadCustomReportResults", propOrder = {
    "reportFileUploaded",
    "reportSaved",
    "storedProcedureCreated",
    "storedProcedureIsNeeded"
})
public class UploadCustomReportResults {

    @XmlElement(name = "ReportFileUploaded")
    protected Boolean reportFileUploaded;
    @XmlElement(name = "ReportSaved")
    protected Boolean reportSaved;
    @XmlElement(name = "StoredProcedureCreated")
    protected Boolean storedProcedureCreated;
    @XmlElement(name = "StoredProcedureIsNeeded")
    protected Boolean storedProcedureIsNeeded;

    /**
     * Obtém o valor da propriedade reportFileUploaded.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReportFileUploaded() {
        return reportFileUploaded;
    }

    /**
     * Define o valor da propriedade reportFileUploaded.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReportFileUploaded(Boolean value) {
        this.reportFileUploaded = value;
    }

    /**
     * Obtém o valor da propriedade reportSaved.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReportSaved() {
        return reportSaved;
    }

    /**
     * Define o valor da propriedade reportSaved.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReportSaved(Boolean value) {
        this.reportSaved = value;
    }

    /**
     * Obtém o valor da propriedade storedProcedureCreated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStoredProcedureCreated() {
        return storedProcedureCreated;
    }

    /**
     * Define o valor da propriedade storedProcedureCreated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoredProcedureCreated(Boolean value) {
        this.storedProcedureCreated = value;
    }

    /**
     * Obtém o valor da propriedade storedProcedureIsNeeded.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStoredProcedureIsNeeded() {
        return storedProcedureIsNeeded;
    }

    /**
     * Define o valor da propriedade storedProcedureIsNeeded.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoredProcedureIsNeeded(Boolean value) {
        this.storedProcedureIsNeeded = value;
    }

}
