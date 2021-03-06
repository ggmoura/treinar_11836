
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de WorkerAlertAssignment complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WorkerAlertAssignment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StopEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="WorkerAlertIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WorkerAlertTriggerProximity_TriggerProximity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkerAlertAssignment", propOrder = {
    "stopEntityKey",
    "workerAlertIndex",
    "workerAlertTriggerProximityTriggerProximity"
})
public class WorkerAlertAssignment
    extends DataTransferObject
{

    @XmlElement(name = "StopEntityKey")
    protected Long stopEntityKey;
    @XmlElement(name = "WorkerAlertIndex")
    protected Integer workerAlertIndex;
    @XmlElementRef(name = "WorkerAlertTriggerProximity_TriggerProximity", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerAlertTriggerProximityTriggerProximity;

    /**
     * Obtém o valor da propriedade stopEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStopEntityKey() {
        return stopEntityKey;
    }

    /**
     * Define o valor da propriedade stopEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStopEntityKey(Long value) {
        this.stopEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade workerAlertIndex.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkerAlertIndex() {
        return workerAlertIndex;
    }

    /**
     * Define o valor da propriedade workerAlertIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkerAlertIndex(Integer value) {
        this.workerAlertIndex = value;
    }

    /**
     * Obtém o valor da propriedade workerAlertTriggerProximityTriggerProximity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerAlertTriggerProximityTriggerProximity() {
        return workerAlertTriggerProximityTriggerProximity;
    }

    /**
     * Define o valor da propriedade workerAlertTriggerProximityTriggerProximity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerAlertTriggerProximityTriggerProximity(JAXBElement<String> value) {
        this.workerAlertTriggerProximityTriggerProximity = value;
    }

}
