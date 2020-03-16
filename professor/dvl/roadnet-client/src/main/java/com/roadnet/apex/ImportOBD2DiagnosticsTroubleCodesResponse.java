
package com.roadnet.apex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ImportOBD2DiagnosticsTroubleCodesResult" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
    "importOBD2DiagnosticsTroubleCodesResult"
})
@XmlRootElement(name = "ImportOBD2DiagnosticsTroubleCodesResponse")
public class ImportOBD2DiagnosticsTroubleCodesResponse {

    @XmlElement(name = "ImportOBD2DiagnosticsTroubleCodesResult")
    protected Long importOBD2DiagnosticsTroubleCodesResult;

    /**
     * Obtém o valor da propriedade importOBD2DiagnosticsTroubleCodesResult.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImportOBD2DiagnosticsTroubleCodesResult() {
        return importOBD2DiagnosticsTroubleCodesResult;
    }

    /**
     * Define o valor da propriedade importOBD2DiagnosticsTroubleCodesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImportOBD2DiagnosticsTroubleCodesResult(Long value) {
        this.importOBD2DiagnosticsTroubleCodesResult = value;
    }

}
