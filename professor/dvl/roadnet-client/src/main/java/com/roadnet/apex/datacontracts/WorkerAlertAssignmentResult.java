
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de WorkerAlertAssignmentResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WorkerAlertAssignmentResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WorkerAlertAssignments" type="{http://roadnet.com/apex/DataContracts/}ArrayOfWorkerAlertAssignment" minOccurs="0"/&gt;
 *         &lt;element name="WorkerAlerts" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkerAlertAssignmentResult", propOrder = {
    "workerAlertAssignments",
    "workerAlerts"
})
public class WorkerAlertAssignmentResult
    extends DataTransferObject
{

    @XmlElementRef(name = "WorkerAlertAssignments", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWorkerAlertAssignment> workerAlertAssignments;
    @XmlElementRef(name = "WorkerAlerts", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> workerAlerts;

    /**
     * Obtém o valor da propriedade workerAlertAssignments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkerAlertAssignment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWorkerAlertAssignment> getWorkerAlertAssignments() {
        return workerAlertAssignments;
    }

    /**
     * Define o valor da propriedade workerAlertAssignments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkerAlertAssignment }{@code >}
     *     
     */
    public void setWorkerAlertAssignments(JAXBElement<ArrayOfWorkerAlertAssignment> value) {
        this.workerAlertAssignments = value;
    }

    /**
     * Obtém o valor da propriedade workerAlerts.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getWorkerAlerts() {
        return workerAlerts;
    }

    /**
     * Define o valor da propriedade workerAlerts.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setWorkerAlerts(JAXBElement<ArrayOfstring> value) {
        this.workerAlerts = value;
    }

}
