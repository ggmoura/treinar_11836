
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
 *         &lt;element name="RetrieveComplianceDriverLicenseCountriesResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfCountry" minOccurs="0"/&gt;
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
    "retrieveComplianceDriverLicenseCountriesResult"
})
@XmlRootElement(name = "RetrieveComplianceDriverLicenseCountriesResponse")
public class RetrieveComplianceDriverLicenseCountriesResponse {

    @XmlElementRef(name = "RetrieveComplianceDriverLicenseCountriesResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCountry> retrieveComplianceDriverLicenseCountriesResult;

    /**
     * Obtém o valor da propriedade retrieveComplianceDriverLicenseCountriesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCountry }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCountry> getRetrieveComplianceDriverLicenseCountriesResult() {
        return retrieveComplianceDriverLicenseCountriesResult;
    }

    /**
     * Define o valor da propriedade retrieveComplianceDriverLicenseCountriesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCountry }{@code >}
     *     
     */
    public void setRetrieveComplianceDriverLicenseCountriesResult(JAXBElement<ArrayOfCountry> value) {
        this.retrieveComplianceDriverLicenseCountriesResult = value;
    }

}
