
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.Report;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetrieveCustomReportResult" type="{http://roadnet.com/apex/DataContracts/}Report" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "retrieveCustomReportResult"
})
@XmlRootElement(name = "RetrieveCustomReportResponse")
public class RetrieveCustomReportResponse {

    @XmlElementRef(name = "RetrieveCustomReportResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<Report> retrieveCustomReportResult;

    /**
     * Obtém o valor da propriedade retrieveCustomReportResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Report }{@code >}
     *     
     */
    public JAXBElement<Report> getRetrieveCustomReportResult() {
        return retrieveCustomReportResult;
    }

    /**
     * Define o valor da propriedade retrieveCustomReportResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Report }{@code >}
     *     
     */
    public void setRetrieveCustomReportResult(JAXBElement<Report> value) {
        this.retrieveCustomReportResult = value;
    }

}
