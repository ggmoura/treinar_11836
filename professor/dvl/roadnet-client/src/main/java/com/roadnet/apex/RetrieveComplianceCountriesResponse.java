
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfCountry;


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
 *         &lt;element name="RetrieveComplianceCountriesResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfCountry" minOccurs="0"/&gt;
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
    "retrieveComplianceCountriesResult"
})
@XmlRootElement(name = "RetrieveComplianceCountriesResponse")
public class RetrieveComplianceCountriesResponse {

    @XmlElementRef(name = "RetrieveComplianceCountriesResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCountry> retrieveComplianceCountriesResult;

    /**
     * Obtém o valor da propriedade retrieveComplianceCountriesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCountry }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCountry> getRetrieveComplianceCountriesResult() {
        return retrieveComplianceCountriesResult;
    }

    /**
     * Define o valor da propriedade retrieveComplianceCountriesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCountry }{@code >}
     *     
     */
    public void setRetrieveComplianceCountriesResult(JAXBElement<ArrayOfCountry> value) {
        this.retrieveComplianceCountriesResult = value;
    }

}
