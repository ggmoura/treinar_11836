
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.CustomFormAssignmentResult;


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
 *         &lt;element name="RetrieveRoutelessCustomFormsResult" type="{http://roadnet.com/apex/DataContracts/}CustomFormAssignmentResult" minOccurs="0"/&gt;
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
    "retrieveRoutelessCustomFormsResult"
})
@XmlRootElement(name = "RetrieveRoutelessCustomFormsResponse")
public class RetrieveRoutelessCustomFormsResponse {

    @XmlElementRef(name = "RetrieveRoutelessCustomFormsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomFormAssignmentResult> retrieveRoutelessCustomFormsResult;

    /**
     * Obtém o valor da propriedade retrieveRoutelessCustomFormsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomFormAssignmentResult }{@code >}
     *     
     */
    public JAXBElement<CustomFormAssignmentResult> getRetrieveRoutelessCustomFormsResult() {
        return retrieveRoutelessCustomFormsResult;
    }

    /**
     * Define o valor da propriedade retrieveRoutelessCustomFormsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomFormAssignmentResult }{@code >}
     *     
     */
    public void setRetrieveRoutelessCustomFormsResult(JAXBElement<CustomFormAssignmentResult> value) {
        this.retrieveRoutelessCustomFormsResult = value;
    }

}
