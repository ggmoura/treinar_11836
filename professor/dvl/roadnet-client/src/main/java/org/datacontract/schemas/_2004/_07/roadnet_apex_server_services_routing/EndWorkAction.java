
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.QualityPairedDateTime;


/**
 * <p>Classe Java de EndWorkAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EndWorkAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MobileDeviceAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DestinationDepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://roadnet.com/apex/DataContracts/}QualityPairedDateTime" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndWorkAction", propOrder = {
    "destinationDepotEntityKey",
    "endTime",
    "workerEntityKey"
})
public class EndWorkAction
    extends MobileDeviceAction
{

    @XmlElementRef(name = "DestinationDepotEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> destinationDepotEntityKey;
    @XmlElementRef(name = "EndTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<QualityPairedDateTime> endTime;
    @XmlElement(name = "WorkerEntityKey")
    protected Long workerEntityKey;

    /**
     * Obtém o valor da propriedade destinationDepotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDestinationDepotEntityKey() {
        return destinationDepotEntityKey;
    }

    /**
     * Define o valor da propriedade destinationDepotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDestinationDepotEntityKey(JAXBElement<Long> value) {
        this.destinationDepotEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade endTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public JAXBElement<QualityPairedDateTime> getEndTime() {
        return endTime;
    }

    /**
     * Define o valor da propriedade endTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualityPairedDateTime }{@code >}
     *     
     */
    public void setEndTime(JAXBElement<QualityPairedDateTime> value) {
        this.endTime = value;
    }

    /**
     * Obtém o valor da propriedade workerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkerEntityKey() {
        return workerEntityKey;
    }

    /**
     * Define o valor da propriedade workerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkerEntityKey(Long value) {
        this.workerEntityKey = value;
    }

}
