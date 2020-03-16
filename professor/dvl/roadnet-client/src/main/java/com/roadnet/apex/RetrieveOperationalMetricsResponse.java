
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.OperationalMetrics;


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
 *         &lt;element name="RetrieveOperationalMetricsResult" type="{http://roadnet.com/apex/DataContracts/}OperationalMetrics" minOccurs="0"/&gt;
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
    "retrieveOperationalMetricsResult"
})
@XmlRootElement(name = "RetrieveOperationalMetricsResponse")
public class RetrieveOperationalMetricsResponse {

    @XmlElementRef(name = "RetrieveOperationalMetricsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<OperationalMetrics> retrieveOperationalMetricsResult;

    /**
     * Obtém o valor da propriedade retrieveOperationalMetricsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OperationalMetrics }{@code >}
     *     
     */
    public JAXBElement<OperationalMetrics> getRetrieveOperationalMetricsResult() {
        return retrieveOperationalMetricsResult;
    }

    /**
     * Define o valor da propriedade retrieveOperationalMetricsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OperationalMetrics }{@code >}
     *     
     */
    public void setRetrieveOperationalMetricsResult(JAXBElement<OperationalMetrics> value) {
        this.retrieveOperationalMetricsResult = value;
    }

}
