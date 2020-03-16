
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DeleteStrategicRoutingSessionResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DeleteStrategicRoutingSessionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssignedOrdersDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AssignedOrdersRemoved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Details" type="{http://roadnet.com/apex/DataContracts/}ArrayOfDeleteStrategicRoutingSessionDetail" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedTimeRemaining" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="HasErrors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SessionsFailed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SessionsProcessed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SessionsTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TerritoriesInSessionDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UnassignedOrdersDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteStrategicRoutingSessionResult", propOrder = {
    "assignedOrdersDeleted",
    "assignedOrdersRemoved",
    "details",
    "estimatedTimeRemaining",
    "hasErrors",
    "percentComplete",
    "sessionsFailed",
    "sessionsProcessed",
    "sessionsTotal",
    "territoriesInSessionDeleted",
    "unassignedOrdersDeleted"
})
public class DeleteStrategicRoutingSessionResult
    extends DataTransferObject
{

    @XmlElement(name = "AssignedOrdersDeleted")
    protected Boolean assignedOrdersDeleted;
    @XmlElement(name = "AssignedOrdersRemoved")
    protected Boolean assignedOrdersRemoved;
    @XmlElementRef(name = "Details", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDeleteStrategicRoutingSessionDetail> details;
    @XmlElementRef(name = "EstimatedTimeRemaining", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> estimatedTimeRemaining;
    @XmlElement(name = "HasErrors")
    protected Boolean hasErrors;
    @XmlElement(name = "PercentComplete")
    protected Double percentComplete;
    @XmlElement(name = "SessionsFailed")
    protected Integer sessionsFailed;
    @XmlElement(name = "SessionsProcessed")
    protected Integer sessionsProcessed;
    @XmlElement(name = "SessionsTotal")
    protected Integer sessionsTotal;
    @XmlElement(name = "TerritoriesInSessionDeleted")
    protected Boolean territoriesInSessionDeleted;
    @XmlElement(name = "UnassignedOrdersDeleted")
    protected Boolean unassignedOrdersDeleted;

    /**
     * Obtém o valor da propriedade assignedOrdersDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssignedOrdersDeleted() {
        return assignedOrdersDeleted;
    }

    /**
     * Define o valor da propriedade assignedOrdersDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignedOrdersDeleted(Boolean value) {
        this.assignedOrdersDeleted = value;
    }

    /**
     * Obtém o valor da propriedade assignedOrdersRemoved.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssignedOrdersRemoved() {
        return assignedOrdersRemoved;
    }

    /**
     * Define o valor da propriedade assignedOrdersRemoved.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignedOrdersRemoved(Boolean value) {
        this.assignedOrdersRemoved = value;
    }

    /**
     * Obtém o valor da propriedade details.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDeleteStrategicRoutingSessionDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDeleteStrategicRoutingSessionDetail> getDetails() {
        return details;
    }

    /**
     * Define o valor da propriedade details.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDeleteStrategicRoutingSessionDetail }{@code >}
     *     
     */
    public void setDetails(JAXBElement<ArrayOfDeleteStrategicRoutingSessionDetail> value) {
        this.details = value;
    }

    /**
     * Obtém o valor da propriedade estimatedTimeRemaining.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getEstimatedTimeRemaining() {
        return estimatedTimeRemaining;
    }

    /**
     * Define o valor da propriedade estimatedTimeRemaining.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setEstimatedTimeRemaining(JAXBElement<Duration> value) {
        this.estimatedTimeRemaining = value;
    }

    /**
     * Obtém o valor da propriedade hasErrors.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasErrors() {
        return hasErrors;
    }

    /**
     * Define o valor da propriedade hasErrors.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasErrors(Boolean value) {
        this.hasErrors = value;
    }

    /**
     * Obtém o valor da propriedade percentComplete.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentComplete() {
        return percentComplete;
    }

    /**
     * Define o valor da propriedade percentComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentComplete(Double value) {
        this.percentComplete = value;
    }

    /**
     * Obtém o valor da propriedade sessionsFailed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSessionsFailed() {
        return sessionsFailed;
    }

    /**
     * Define o valor da propriedade sessionsFailed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSessionsFailed(Integer value) {
        this.sessionsFailed = value;
    }

    /**
     * Obtém o valor da propriedade sessionsProcessed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSessionsProcessed() {
        return sessionsProcessed;
    }

    /**
     * Define o valor da propriedade sessionsProcessed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSessionsProcessed(Integer value) {
        this.sessionsProcessed = value;
    }

    /**
     * Obtém o valor da propriedade sessionsTotal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSessionsTotal() {
        return sessionsTotal;
    }

    /**
     * Define o valor da propriedade sessionsTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSessionsTotal(Integer value) {
        this.sessionsTotal = value;
    }

    /**
     * Obtém o valor da propriedade territoriesInSessionDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTerritoriesInSessionDeleted() {
        return territoriesInSessionDeleted;
    }

    /**
     * Define o valor da propriedade territoriesInSessionDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerritoriesInSessionDeleted(Boolean value) {
        this.territoriesInSessionDeleted = value;
    }

    /**
     * Obtém o valor da propriedade unassignedOrdersDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnassignedOrdersDeleted() {
        return unassignedOrdersDeleted;
    }

    /**
     * Define o valor da propriedade unassignedOrdersDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnassignedOrdersDeleted(Boolean value) {
        this.unassignedOrdersDeleted = value;
    }

}
