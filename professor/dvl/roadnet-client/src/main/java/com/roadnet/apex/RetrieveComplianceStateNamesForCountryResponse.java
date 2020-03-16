
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


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
 *         &lt;element name="RetrieveComplianceStateNamesForCountryResult" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
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
    "retrieveComplianceStateNamesForCountryResult"
})
@XmlRootElement(name = "RetrieveComplianceStateNamesForCountryResponse")
public class RetrieveComplianceStateNamesForCountryResponse {

    @XmlElementRef(name = "RetrieveComplianceStateNamesForCountryResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> retrieveComplianceStateNamesForCountryResult;

    /**
     * Obtém o valor da propriedade retrieveComplianceStateNamesForCountryResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getRetrieveComplianceStateNamesForCountryResult() {
        return retrieveComplianceStateNamesForCountryResult;
    }

    /**
     * Define o valor da propriedade retrieveComplianceStateNamesForCountryResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setRetrieveComplianceStateNamesForCountryResult(JAXBElement<ArrayOfstring> value) {
        this.retrieveComplianceStateNamesForCountryResult = value;
    }

}
