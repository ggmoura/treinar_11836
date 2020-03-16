
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfHosRuleSet;


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
 *         &lt;element name="RetrieveHosRuleSetsResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfHosRuleSet" minOccurs="0"/&gt;
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
    "retrieveHosRuleSetsResult"
})
@XmlRootElement(name = "RetrieveHosRuleSetsResponse")
public class RetrieveHosRuleSetsResponse {

    @XmlElementRef(name = "RetrieveHosRuleSetsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHosRuleSet> retrieveHosRuleSetsResult;

    /**
     * Obtém o valor da propriedade retrieveHosRuleSetsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHosRuleSet }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHosRuleSet> getRetrieveHosRuleSetsResult() {
        return retrieveHosRuleSetsResult;
    }

    /**
     * Define o valor da propriedade retrieveHosRuleSetsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHosRuleSet }{@code >}
     *     
     */
    public void setRetrieveHosRuleSetsResult(JAXBElement<ArrayOfHosRuleSet> value) {
        this.retrieveHosRuleSetsResult = value;
    }

}
