
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ServiceLocationServiceStatistics;


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
 *         &lt;element name="RetrieveServiceLocationServiceStatisticsResult" type="{http://roadnet.com/apex/DataContracts/}ServiceLocationServiceStatistics" minOccurs="0"/&gt;
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
    "retrieveServiceLocationServiceStatisticsResult"
})
@XmlRootElement(name = "RetrieveServiceLocationServiceStatisticsResponse")
public class RetrieveServiceLocationServiceStatisticsResponse {

    @XmlElementRef(name = "RetrieveServiceLocationServiceStatisticsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceLocationServiceStatistics> retrieveServiceLocationServiceStatisticsResult;

    /**
     * Obtém o valor da propriedade retrieveServiceLocationServiceStatisticsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceLocationServiceStatistics }{@code >}
     *     
     */
    public JAXBElement<ServiceLocationServiceStatistics> getRetrieveServiceLocationServiceStatisticsResult() {
        return retrieveServiceLocationServiceStatisticsResult;
    }

    /**
     * Define o valor da propriedade retrieveServiceLocationServiceStatisticsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceLocationServiceStatistics }{@code >}
     *     
     */
    public void setRetrieveServiceLocationServiceStatisticsResult(JAXBElement<ServiceLocationServiceStatistics> value) {
        this.retrieveServiceLocationServiceStatisticsResult = value;
    }

}
