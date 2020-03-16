
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LookupTelematicsDeviceResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LookupTelematicsDeviceResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login}LookupDeviceResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeviceMessageProcessingFacilityEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LookupTelematicsDeviceResult", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", propOrder = {
    "deviceMessageProcessingFacilityEntityKey",
    "identifier",
    "telematicsDeviceEntityKey"
})
public class LookupTelematicsDeviceResult
    extends LookupDeviceResult
{

    @XmlElement(name = "DeviceMessageProcessingFacilityEntityKey")
    protected Long deviceMessageProcessingFacilityEntityKey;
    @XmlElementRef(name = "Identifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "TelematicsDeviceEntityKey")
    protected Long telematicsDeviceEntityKey;

    /**
     * Obtém o valor da propriedade deviceMessageProcessingFacilityEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeviceMessageProcessingFacilityEntityKey() {
        return deviceMessageProcessingFacilityEntityKey;
    }

    /**
     * Define o valor da propriedade deviceMessageProcessingFacilityEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeviceMessageProcessingFacilityEntityKey(Long value) {
        this.deviceMessageProcessingFacilityEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTelematicsDeviceEntityKey() {
        return telematicsDeviceEntityKey;
    }

    /**
     * Define o valor da propriedade telematicsDeviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTelematicsDeviceEntityKey(Long value) {
        this.telematicsDeviceEntityKey = value;
    }

}
