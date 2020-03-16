
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.ImportOBD2DiagnosticTroubleCodesParameters;


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
 *         &lt;element name="parameters" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.ImportOBD2}ImportOBD2DiagnosticTroubleCodesParameters" minOccurs="0"/&gt;
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
    "parameters"
})
@XmlRootElement(name = "ImportOBD2DiagnosticsTroubleCodes")
public class ImportOBD2DiagnosticsTroubleCodes {

    @XmlElementRef(name = "parameters", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ImportOBD2DiagnosticTroubleCodesParameters> parameters;

    /**
     * Obtém o valor da propriedade parameters.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImportOBD2DiagnosticTroubleCodesParameters }{@code >}
     *     
     */
    public JAXBElement<ImportOBD2DiagnosticTroubleCodesParameters> getParameters() {
        return parameters;
    }

    /**
     * Define o valor da propriedade parameters.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImportOBD2DiagnosticTroubleCodesParameters }{@code >}
     *     
     */
    public void setParameters(JAXBElement<ImportOBD2DiagnosticTroubleCodesParameters> value) {
        this.parameters = value;
    }

}
