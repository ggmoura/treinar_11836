
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.WorkerAlertAssignmentResult;


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
 *         &lt;element name="RetrieveWorkerAlertAssignmentsForRouteResult" type="{http://roadnet.com/apex/DataContracts/}WorkerAlertAssignmentResult" minOccurs="0"/&gt;
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
    "retrieveWorkerAlertAssignmentsForRouteResult"
})
@XmlRootElement(name = "RetrieveWorkerAlertAssignmentsForRouteResponse")
public class RetrieveWorkerAlertAssignmentsForRouteResponse {

    @XmlElementRef(name = "RetrieveWorkerAlertAssignmentsForRouteResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<WorkerAlertAssignmentResult> retrieveWorkerAlertAssignmentsForRouteResult;

    /**
     * Obtém o valor da propriedade retrieveWorkerAlertAssignmentsForRouteResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WorkerAlertAssignmentResult }{@code >}
     *     
     */
    public JAXBElement<WorkerAlertAssignmentResult> getRetrieveWorkerAlertAssignmentsForRouteResult() {
        return retrieveWorkerAlertAssignmentsForRouteResult;
    }

    /**
     * Define o valor da propriedade retrieveWorkerAlertAssignmentsForRouteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WorkerAlertAssignmentResult }{@code >}
     *     
     */
    public void setRetrieveWorkerAlertAssignmentsForRouteResult(JAXBElement<WorkerAlertAssignmentResult> value) {
        this.retrieveWorkerAlertAssignmentsForRouteResult = value;
    }

}
