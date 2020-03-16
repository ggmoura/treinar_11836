
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.HosRulesValidationResult;


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
 *         &lt;element name="ValidateHosRuleSetsResult" type="{http://roadnet.com/apex/DataContracts/}HosRulesValidationResult" minOccurs="0"/&gt;
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
    "validateHosRuleSetsResult"
})
@XmlRootElement(name = "ValidateHosRuleSetsResponse")
public class ValidateHosRuleSetsResponse {

    @XmlElementRef(name = "ValidateHosRuleSetsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<HosRulesValidationResult> validateHosRuleSetsResult;

    /**
     * Obtém o valor da propriedade validateHosRuleSetsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HosRulesValidationResult }{@code >}
     *     
     */
    public JAXBElement<HosRulesValidationResult> getValidateHosRuleSetsResult() {
        return validateHosRuleSetsResult;
    }

    /**
     * Define o valor da propriedade validateHosRuleSetsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HosRulesValidationResult }{@code >}
     *     
     */
    public void setValidateHosRuleSetsResult(JAXBElement<HosRulesValidationResult> value) {
        this.validateHosRuleSetsResult = value;
    }

}
