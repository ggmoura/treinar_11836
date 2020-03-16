
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de TelematicsDeviceInputPortInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TelematicsDeviceInputPortInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccessoryEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceInputType_InputType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelematicsDeviceInputPortInfo", propOrder = {
    "accessoryEntityKey",
    "telematicsDeviceInputTypeInputType"
})
public class TelematicsDeviceInputPortInfo
    extends DataTransferObject
{

    @XmlElementRef(name = "AccessoryEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> accessoryEntityKey;
    @XmlElementRef(name = "TelematicsDeviceInputType_InputType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telematicsDeviceInputTypeInputType;

    /**
     * Obtém o valor da propriedade accessoryEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAccessoryEntityKey() {
        return accessoryEntityKey;
    }

    /**
     * Define o valor da propriedade accessoryEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAccessoryEntityKey(JAXBElement<Long> value) {
        this.accessoryEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceInputTypeInputType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelematicsDeviceInputTypeInputType() {
        return telematicsDeviceInputTypeInputType;
    }

    /**
     * Define o valor da propriedade telematicsDeviceInputTypeInputType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelematicsDeviceInputTypeInputType(JAXBElement<String> value) {
        this.telematicsDeviceInputTypeInputType = value;
    }

}
