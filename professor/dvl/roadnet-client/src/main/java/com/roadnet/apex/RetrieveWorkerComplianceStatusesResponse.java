
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfWorkerComplianceStatus;


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
 *         &lt;element name="RetrieveWorkerComplianceStatusesResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfWorkerComplianceStatus" minOccurs="0"/&gt;
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
    "retrieveWorkerComplianceStatusesResult"
})
@XmlRootElement(name = "RetrieveWorkerComplianceStatusesResponse")
public class RetrieveWorkerComplianceStatusesResponse {

    @XmlElementRef(name = "RetrieveWorkerComplianceStatusesResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWorkerComplianceStatus> retrieveWorkerComplianceStatusesResult;

    /**
     * Obtém o valor da propriedade retrieveWorkerComplianceStatusesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkerComplianceStatus }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWorkerComplianceStatus> getRetrieveWorkerComplianceStatusesResult() {
        return retrieveWorkerComplianceStatusesResult;
    }

    /**
     * Define o valor da propriedade retrieveWorkerComplianceStatusesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkerComplianceStatus }{@code >}
     *     
     */
    public void setRetrieveWorkerComplianceStatusesResult(JAXBElement<ArrayOfWorkerComplianceStatus> value) {
        this.retrieveWorkerComplianceStatusesResult = value;
    }

}
