
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MoveUnassignedOrdersToSessionJobParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MoveUnassignedOrdersToSessionJobParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DestinationRoutingSessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SourceRoutingSessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UpdateOrderBeginDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UpdateOrderEndDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveUnassignedOrdersToSessionJobParameters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.MoveUnassignedOrdersToSession", propOrder = {
    "destinationRoutingSessionEntityKey",
    "sourceRoutingSessionEntityKey",
    "updateOrderBeginDate",
    "updateOrderEndDate"
})
public class MoveUnassignedOrdersToSessionJobParameters {

    @XmlElement(name = "DestinationRoutingSessionEntityKey")
    protected Long destinationRoutingSessionEntityKey;
    @XmlElement(name = "SourceRoutingSessionEntityKey")
    protected Long sourceRoutingSessionEntityKey;
    @XmlElement(name = "UpdateOrderBeginDate")
    protected Boolean updateOrderBeginDate;
    @XmlElement(name = "UpdateOrderEndDate")
    protected Boolean updateOrderEndDate;

    /**
     * Obtém o valor da propriedade destinationRoutingSessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDestinationRoutingSessionEntityKey() {
        return destinationRoutingSessionEntityKey;
    }

    /**
     * Define o valor da propriedade destinationRoutingSessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDestinationRoutingSessionEntityKey(Long value) {
        this.destinationRoutingSessionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade sourceRoutingSessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceRoutingSessionEntityKey() {
        return sourceRoutingSessionEntityKey;
    }

    /**
     * Define o valor da propriedade sourceRoutingSessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceRoutingSessionEntityKey(Long value) {
        this.sourceRoutingSessionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade updateOrderBeginDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateOrderBeginDate() {
        return updateOrderBeginDate;
    }

    /**
     * Define o valor da propriedade updateOrderBeginDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateOrderBeginDate(Boolean value) {
        this.updateOrderBeginDate = value;
    }

    /**
     * Obtém o valor da propriedade updateOrderEndDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateOrderEndDate() {
        return updateOrderEndDate;
    }

    /**
     * Define o valor da propriedade updateOrderEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateOrderEndDate(Boolean value) {
        this.updateOrderEndDate = value;
    }

}
