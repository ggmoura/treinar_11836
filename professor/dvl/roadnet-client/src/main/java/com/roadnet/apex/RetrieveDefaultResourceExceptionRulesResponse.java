
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfResourceExceptionRuleEx;


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
 *         &lt;element name="RetrieveDefaultResourceExceptionRulesResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfResourceExceptionRuleEx" minOccurs="0"/&gt;
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
    "retrieveDefaultResourceExceptionRulesResult"
})
@XmlRootElement(name = "RetrieveDefaultResourceExceptionRulesResponse")
public class RetrieveDefaultResourceExceptionRulesResponse {

    @XmlElementRef(name = "RetrieveDefaultResourceExceptionRulesResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResourceExceptionRuleEx> retrieveDefaultResourceExceptionRulesResult;

    /**
     * Obtém o valor da propriedade retrieveDefaultResourceExceptionRulesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResourceExceptionRuleEx }{@code >}
     *     
     */
    public JAXBElement<ArrayOfResourceExceptionRuleEx> getRetrieveDefaultResourceExceptionRulesResult() {
        return retrieveDefaultResourceExceptionRulesResult;
    }

    /**
     * Define o valor da propriedade retrieveDefaultResourceExceptionRulesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResourceExceptionRuleEx }{@code >}
     *     
     */
    public void setRetrieveDefaultResourceExceptionRulesResult(JAXBElement<ArrayOfResourceExceptionRuleEx> value) {
        this.retrieveDefaultResourceExceptionRulesResult = value;
    }

}
