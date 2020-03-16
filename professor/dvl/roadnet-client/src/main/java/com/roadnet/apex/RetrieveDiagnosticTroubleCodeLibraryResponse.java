
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.DiagnosticTroubleCodeLibrary;


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
 *         &lt;element name="RetrieveDiagnosticTroubleCodeLibraryResult" type="{http://roadnet.com/apex/DataContracts/}DiagnosticTroubleCodeLibrary" minOccurs="0"/&gt;
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
    "retrieveDiagnosticTroubleCodeLibraryResult"
})
@XmlRootElement(name = "RetrieveDiagnosticTroubleCodeLibraryResponse")
public class RetrieveDiagnosticTroubleCodeLibraryResponse {

    @XmlElementRef(name = "RetrieveDiagnosticTroubleCodeLibraryResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<DiagnosticTroubleCodeLibrary> retrieveDiagnosticTroubleCodeLibraryResult;

    /**
     * Obtém o valor da propriedade retrieveDiagnosticTroubleCodeLibraryResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DiagnosticTroubleCodeLibrary }{@code >}
     *     
     */
    public JAXBElement<DiagnosticTroubleCodeLibrary> getRetrieveDiagnosticTroubleCodeLibraryResult() {
        return retrieveDiagnosticTroubleCodeLibraryResult;
    }

    /**
     * Define o valor da propriedade retrieveDiagnosticTroubleCodeLibraryResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DiagnosticTroubleCodeLibrary }{@code >}
     *     
     */
    public void setRetrieveDiagnosticTroubleCodeLibraryResult(JAXBElement<DiagnosticTroubleCodeLibrary> value) {
        this.retrieveDiagnosticTroubleCodeLibraryResult = value;
    }

}
