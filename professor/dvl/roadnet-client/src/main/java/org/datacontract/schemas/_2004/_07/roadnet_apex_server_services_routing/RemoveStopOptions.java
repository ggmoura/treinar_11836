
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de RemoveStopOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RemoveStopOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancelledStopDeliveryQuantitiesOnVehicle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MakeOrdersUnassignedOnCancelledStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopCancelReasonCodeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveStopOptions", propOrder = {
    "cancelledStopDeliveryQuantitiesOnVehicle",
    "makeOrdersUnassignedOnCancelledStops",
    "stopCancelReasonCodeEntityKey"
})
public class RemoveStopOptions
    extends DataTransferObject
{

    @XmlElement(name = "CancelledStopDeliveryQuantitiesOnVehicle")
    protected Boolean cancelledStopDeliveryQuantitiesOnVehicle;
    @XmlElement(name = "MakeOrdersUnassignedOnCancelledStops")
    protected Boolean makeOrdersUnassignedOnCancelledStops;
    @XmlElementRef(name = "StopCancelReasonCodeEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> stopCancelReasonCodeEntityKey;

    /**
     * Obtém o valor da propriedade cancelledStopDeliveryQuantitiesOnVehicle.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelledStopDeliveryQuantitiesOnVehicle() {
        return cancelledStopDeliveryQuantitiesOnVehicle;
    }

    /**
     * Define o valor da propriedade cancelledStopDeliveryQuantitiesOnVehicle.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelledStopDeliveryQuantitiesOnVehicle(Boolean value) {
        this.cancelledStopDeliveryQuantitiesOnVehicle = value;
    }

    /**
     * Obtém o valor da propriedade makeOrdersUnassignedOnCancelledStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMakeOrdersUnassignedOnCancelledStops() {
        return makeOrdersUnassignedOnCancelledStops;
    }

    /**
     * Define o valor da propriedade makeOrdersUnassignedOnCancelledStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMakeOrdersUnassignedOnCancelledStops(Boolean value) {
        this.makeOrdersUnassignedOnCancelledStops = value;
    }

    /**
     * Obtém o valor da propriedade stopCancelReasonCodeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getStopCancelReasonCodeEntityKey() {
        return stopCancelReasonCodeEntityKey;
    }

    /**
     * Define o valor da propriedade stopCancelReasonCodeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setStopCancelReasonCodeEntityKey(JAXBElement<Long> value) {
        this.stopCancelReasonCodeEntityKey = value;
    }

}
