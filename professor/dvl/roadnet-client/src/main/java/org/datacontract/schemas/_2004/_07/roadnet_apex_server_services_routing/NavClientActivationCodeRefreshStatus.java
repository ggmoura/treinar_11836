
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de NavClientActivationCodeRefreshStatus complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NavClientActivationCodeRefreshStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Error" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}NavClientActivationCodeRefreshStatus.ErrorType" minOccurs="0"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavClientActivationCodeRefreshStatus", propOrder = {
    "activationCode",
    "error",
    "errorMessage",
    "mobileDeviceEntityKey"
})
public class NavClientActivationCodeRefreshStatus
    extends DataTransferObject
{

    @XmlElementRef(name = "ActivationCode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activationCode;
    @XmlElement(name = "Error")
    @XmlSchemaType(name = "string")
    protected NavClientActivationCodeRefreshStatusErrorType error;
    @XmlElementRef(name = "ErrorMessage", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorMessage;
    @XmlElement(name = "MobileDeviceEntityKey")
    protected Long mobileDeviceEntityKey;

    /**
     * Obtém o valor da propriedade activationCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActivationCode() {
        return activationCode;
    }

    /**
     * Define o valor da propriedade activationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActivationCode(JAXBElement<String> value) {
        this.activationCode = value;
    }

    /**
     * Obtém o valor da propriedade error.
     * 
     * @return
     *     possible object is
     *     {@link NavClientActivationCodeRefreshStatusErrorType }
     *     
     */
    public NavClientActivationCodeRefreshStatusErrorType getError() {
        return error;
    }

    /**
     * Define o valor da propriedade error.
     * 
     * @param value
     *     allowed object is
     *     {@link NavClientActivationCodeRefreshStatusErrorType }
     *     
     */
    public void setError(NavClientActivationCodeRefreshStatusErrorType value) {
        this.error = value;
    }

    /**
     * Obtém o valor da propriedade errorMessage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorMessage() {
        return errorMessage;
    }

    /**
     * Define o valor da propriedade errorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorMessage(JAXBElement<String> value) {
        this.errorMessage = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMobileDeviceEntityKey() {
        return mobileDeviceEntityKey;
    }

    /**
     * Define o valor da propriedade mobileDeviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMobileDeviceEntityKey(Long value) {
        this.mobileDeviceEntityKey = value;
    }

}
