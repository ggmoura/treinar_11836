
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.DispatchRouteSummaryStatistics;


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
 *         &lt;element name="RetrieveDispatchRouteSummaryStatisticsResult" type="{http://roadnet.com/apex/DataContracts/}DispatchRouteSummaryStatistics" minOccurs="0"/&gt;
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
    "retrieveDispatchRouteSummaryStatisticsResult"
})
@XmlRootElement(name = "RetrieveDispatchRouteSummaryStatisticsResponse")
public class RetrieveDispatchRouteSummaryStatisticsResponse {

    @XmlElementRef(name = "RetrieveDispatchRouteSummaryStatisticsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<DispatchRouteSummaryStatistics> retrieveDispatchRouteSummaryStatisticsResult;

    /**
     * Obtém o valor da propriedade retrieveDispatchRouteSummaryStatisticsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DispatchRouteSummaryStatistics }{@code >}
     *     
     */
    public JAXBElement<DispatchRouteSummaryStatistics> getRetrieveDispatchRouteSummaryStatisticsResult() {
        return retrieveDispatchRouteSummaryStatisticsResult;
    }

    /**
     * Define o valor da propriedade retrieveDispatchRouteSummaryStatisticsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DispatchRouteSummaryStatistics }{@code >}
     *     
     */
    public void setRetrieveDispatchRouteSummaryStatisticsResult(JAXBElement<DispatchRouteSummaryStatistics> value) {
        this.retrieveDispatchRouteSummaryStatisticsResult = value;
    }

}
