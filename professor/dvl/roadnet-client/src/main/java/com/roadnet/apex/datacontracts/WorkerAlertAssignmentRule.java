
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.SimpleExpressionBase;


/**
 * <p>Classe Java de WorkerAlertAssignmentRule complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WorkerAlertAssignmentRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderAssignmentCriteria" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression}SimpleExpressionBase" minOccurs="0"/&gt;
 *         &lt;element name="RouteAssignmentCriteria" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression}SimpleExpressionBase" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationAssignmentCriteria" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression}SimpleExpressionBase" minOccurs="0"/&gt;
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
@XmlType(name = "WorkerAlertAssignmentRule", propOrder = {
    "description",
    "orderAssignmentCriteria",
    "routeAssignmentCriteria",
    "serviceLocationAssignmentCriteria",
    "workerAlertTriggerProximityTriggerProximity"
})
public class WorkerAlertAssignmentRule
    extends DomainEntity
{

    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "OrderAssignmentCriteria", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<SimpleExpressionBase> orderAssignmentCriteria;
    @XmlElementRef(name = "RouteAssignmentCriteria", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<SimpleExpressionBase> routeAssignmentCriteria;
    @XmlElementRef(name = "ServiceLocationAssignmentCriteria", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<SimpleExpressionBase> serviceLocationAssignmentCriteria;
    @XmlElementRef(name = "WorkerAlertTriggerProximity_TriggerProximity", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerAlertTriggerProximityTriggerProximity;

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade orderAssignmentCriteria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}
     *     
     */
    public JAXBElement<SimpleExpressionBase> getOrderAssignmentCriteria() {
        return orderAssignmentCriteria;
    }

    /**
     * Define o valor da propriedade orderAssignmentCriteria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}
     *     
     */
    public void setOrderAssignmentCriteria(JAXBElement<SimpleExpressionBase> value) {
        this.orderAssignmentCriteria = value;
    }

    /**
     * Obtém o valor da propriedade routeAssignmentCriteria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}
     *     
     */
    public JAXBElement<SimpleExpressionBase> getRouteAssignmentCriteria() {
        return routeAssignmentCriteria;
    }

    /**
     * Define o valor da propriedade routeAssignmentCriteria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}
     *     
     */
    public void setRouteAssignmentCriteria(JAXBElement<SimpleExpressionBase> value) {
        this.routeAssignmentCriteria = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationAssignmentCriteria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}
     *     
     */
    public JAXBElement<SimpleExpressionBase> getServiceLocationAssignmentCriteria() {
        return serviceLocationAssignmentCriteria;
    }

    /**
     * Define o valor da propriedade serviceLocationAssignmentCriteria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}
     *     
     */
    public void setServiceLocationAssignmentCriteria(JAXBElement<SimpleExpressionBase> value) {
        this.serviceLocationAssignmentCriteria = value;
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
