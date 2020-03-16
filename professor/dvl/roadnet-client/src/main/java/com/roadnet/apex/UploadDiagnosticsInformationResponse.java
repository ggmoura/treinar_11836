
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
 *         &lt;element name="UploadDiagnosticsInformationResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "uploadDiagnosticsInformationResult"
})
@XmlRootElement(name = "UploadDiagnosticsInformationResponse")
public class UploadDiagnosticsInformationResponse {

    @XmlElement(name = "UploadDiagnosticsInformationResult")
    protected Boolean uploadDiagnosticsInformationResult;

    /**
     * Obtém o valor da propriedade uploadDiagnosticsInformationResult.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUploadDiagnosticsInformationResult() {
        return uploadDiagnosticsInformationResult;
    }

    /**
     * Define o valor da propriedade uploadDiagnosticsInformationResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUploadDiagnosticsInformationResult(Boolean value) {
        this.uploadDiagnosticsInformationResult = value;
    }

}
