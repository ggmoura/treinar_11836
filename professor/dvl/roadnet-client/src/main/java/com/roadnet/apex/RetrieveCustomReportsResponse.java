
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfReport;


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
 *         &lt;element name="RetrieveCustomReportsResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfReport" minOccurs="0"/&gt;
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
    "retrieveCustomReportsResult"
})
@XmlRootElement(name = "RetrieveCustomReportsResponse")
public class RetrieveCustomReportsResponse {

    @XmlElementRef(name = "RetrieveCustomReportsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReport> retrieveCustomReportsResult;

    /**
     * Obtém o valor da propriedade retrieveCustomReportsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReport }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReport> getRetrieveCustomReportsResult() {
        return retrieveCustomReportsResult;
    }

    /**
     * Define o valor da propriedade retrieveCustomReportsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReport }{@code >}
     *     
     */
    public void setRetrieveCustomReportsResult(JAXBElement<ArrayOfReport> value) {
        this.retrieveCustomReportsResult = value;
    }

}
