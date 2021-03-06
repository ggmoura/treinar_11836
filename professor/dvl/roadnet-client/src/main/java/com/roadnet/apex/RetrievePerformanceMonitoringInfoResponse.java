
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RetrievePerformanceMonitoringInfoResult;


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
 *         &lt;element name="RetrievePerformanceMonitoringInfoResult" type="{http://roadnet.com/apex/DataContracts/}RetrievePerformanceMonitoringInfoResult" minOccurs="0"/&gt;
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
    "retrievePerformanceMonitoringInfoResult"
})
@XmlRootElement(name = "RetrievePerformanceMonitoringInfoResponse")
public class RetrievePerformanceMonitoringInfoResponse {

    @XmlElementRef(name = "RetrievePerformanceMonitoringInfoResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RetrievePerformanceMonitoringInfoResult> retrievePerformanceMonitoringInfoResult;

    /**
     * Obtém o valor da propriedade retrievePerformanceMonitoringInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrievePerformanceMonitoringInfoResult }{@code >}
     *     
     */
    public JAXBElement<RetrievePerformanceMonitoringInfoResult> getRetrievePerformanceMonitoringInfoResult() {
        return retrievePerformanceMonitoringInfoResult;
    }

    /**
     * Define o valor da propriedade retrievePerformanceMonitoringInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrievePerformanceMonitoringInfoResult }{@code >}
     *     
     */
    public void setRetrievePerformanceMonitoringInfoResult(JAXBElement<RetrievePerformanceMonitoringInfoResult> value) {
        this.retrievePerformanceMonitoringInfoResult = value;
    }

}
