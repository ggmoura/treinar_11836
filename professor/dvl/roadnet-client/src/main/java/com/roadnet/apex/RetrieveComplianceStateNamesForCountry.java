
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.Country;


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
 *         &lt;element name="countryDto" type="{http://roadnet.com/apex/DataContracts/}Country" minOccurs="0"/&gt;
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
    "countryDto"
})
@XmlRootElement(name = "RetrieveComplianceStateNamesForCountry")
public class RetrieveComplianceStateNamesForCountry {

    @XmlElementRef(name = "countryDto", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<Country> countryDto;

    /**
     * Obtém o valor da propriedade countryDto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Country }{@code >}
     *     
     */
    public JAXBElement<Country> getCountryDto() {
        return countryDto;
    }

    /**
     * Define o valor da propriedade countryDto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Country }{@code >}
     *     
     */
    public void setCountryDto(JAXBElement<Country> value) {
        this.countryDto = value;
    }

}
