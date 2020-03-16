
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfEquipmentErrorCodeHZ9Gpz1G;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfMobileDeviceErrorCodeHZ9Gpz1G;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfWorkerErrorCodeHZ9Gpz1G;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de MoveResourcesToRegionResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MoveResourcesToRegionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FailedEquipment" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfEquipmentErrorCodeHZ9gpz1G" minOccurs="0"/&gt;
 *         &lt;element name="FailedMobileDevices" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfMobileDeviceErrorCodeHZ9gpz1G" minOccurs="0"/&gt;
 *         &lt;element name="FailedWorkers" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfWorkerErrorCodeHZ9gpz1G" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveResourcesToRegionResult", propOrder = {
    "failedEquipment",
    "failedMobileDevices",
    "failedWorkers"
})
public class MoveResourcesToRegionResult
    extends DataTransferObject
{

    @XmlElementRef(name = "FailedEquipment", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfEquipmentErrorCodeHZ9Gpz1G> failedEquipment;
    @XmlElementRef(name = "FailedMobileDevices", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfMobileDeviceErrorCodeHZ9Gpz1G> failedMobileDevices;
    @XmlElementRef(name = "FailedWorkers", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfWorkerErrorCodeHZ9Gpz1G> failedWorkers;

    /**
     * Obtém o valor da propriedade failedEquipment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfEquipmentErrorCodeHZ9Gpz1G }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfEquipmentErrorCodeHZ9Gpz1G> getFailedEquipment() {
        return failedEquipment;
    }

    /**
     * Define o valor da propriedade failedEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfEquipmentErrorCodeHZ9Gpz1G }{@code >}
     *     
     */
    public void setFailedEquipment(JAXBElement<ArrayOfKeyValueOfEquipmentErrorCodeHZ9Gpz1G> value) {
        this.failedEquipment = value;
    }

    /**
     * Obtém o valor da propriedade failedMobileDevices.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfMobileDeviceErrorCodeHZ9Gpz1G }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfMobileDeviceErrorCodeHZ9Gpz1G> getFailedMobileDevices() {
        return failedMobileDevices;
    }

    /**
     * Define o valor da propriedade failedMobileDevices.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfMobileDeviceErrorCodeHZ9Gpz1G }{@code >}
     *     
     */
    public void setFailedMobileDevices(JAXBElement<ArrayOfKeyValueOfMobileDeviceErrorCodeHZ9Gpz1G> value) {
        this.failedMobileDevices = value;
    }

    /**
     * Obtém o valor da propriedade failedWorkers.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfWorkerErrorCodeHZ9Gpz1G }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfWorkerErrorCodeHZ9Gpz1G> getFailedWorkers() {
        return failedWorkers;
    }

    /**
     * Define o valor da propriedade failedWorkers.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfWorkerErrorCodeHZ9Gpz1G }{@code >}
     *     
     */
    public void setFailedWorkers(JAXBElement<ArrayOfKeyValueOfWorkerErrorCodeHZ9Gpz1G> value) {
        this.failedWorkers = value;
    }

}
