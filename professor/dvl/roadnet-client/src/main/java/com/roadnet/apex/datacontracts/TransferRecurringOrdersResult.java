
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
 * <p>Classe Java de TransferRecurringOrdersResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TransferRecurringOrdersResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Details" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTransferRecurringOrderDetail" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedTimeRemaining" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="OrdersFailed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OrdersProcessed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OrdersTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferRecurringOrdersResult", propOrder = {
    "details",
    "estimatedTimeRemaining",
    "ordersFailed",
    "ordersProcessed",
    "ordersTotal",
    "percentComplete"
})
public class TransferRecurringOrdersResult
    extends DataTransferObject
{

    @XmlElementRef(name = "Details", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransferRecurringOrderDetail> details;
    @XmlElementRef(name = "EstimatedTimeRemaining", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> estimatedTimeRemaining;
    @XmlElement(name = "OrdersFailed")
    protected Integer ordersFailed;
    @XmlElement(name = "OrdersProcessed")
    protected Integer ordersProcessed;
    @XmlElement(name = "OrdersTotal")
    protected Integer ordersTotal;
    @XmlElement(name = "PercentComplete")
    protected Double percentComplete;

    /**
     * Obtém o valor da propriedade details.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransferRecurringOrderDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTransferRecurringOrderDetail> getDetails() {
        return details;
    }

    /**
     * Define o valor da propriedade details.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransferRecurringOrderDetail }{@code >}
     *     
     */
    public void setDetails(JAXBElement<ArrayOfTransferRecurringOrderDetail> value) {
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
     * Obtém o valor da propriedade ordersFailed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrdersFailed() {
        return ordersFailed;
    }

    /**
     * Define o valor da propriedade ordersFailed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrdersFailed(Integer value) {
        this.ordersFailed = value;
    }

    /**
     * Obtém o valor da propriedade ordersProcessed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrdersProcessed() {
        return ordersProcessed;
    }

    /**
     * Define o valor da propriedade ordersProcessed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrdersProcessed(Integer value) {
        this.ordersProcessed = value;
    }

    /**
     * Obtém o valor da propriedade ordersTotal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrdersTotal() {
        return ordersTotal;
    }

    /**
     * Define o valor da propriedade ordersTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrdersTotal(Integer value) {
        this.ordersTotal = value;
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

}
