
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.NavDeviceActivationStatus;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de NavDeviceStatusDto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NavDeviceStatusDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActivationCodeExpiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActivationStatus" type="{http://roadnet.com/apex/DataContracts/}NavDeviceActivationStatus" minOccurs="0"/&gt;
 *         &lt;element name="IsDevicePreAuthenticated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "NavDeviceStatusDto", propOrder = {
    "activationCode",
    "activationCodeExpiration",
    "activationStatus",
    "isDevicePreAuthenticated",
    "mobileDeviceEntityKey"
})
public class NavDeviceStatusDto
    extends DataTransferObject
{

    @XmlElementRef(name = "ActivationCode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activationCode;
    @XmlElement(name = "ActivationCodeExpiration")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activationCodeExpiration;
    @XmlElement(name = "ActivationStatus")
    @XmlSchemaType(name = "string")
    protected NavDeviceActivationStatus activationStatus;
    @XmlElement(name = "IsDevicePreAuthenticated")
    protected Boolean isDevicePreAuthenticated;
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
     * Obtém o valor da propriedade activationCodeExpiration.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivationCodeExpiration() {
        return activationCodeExpiration;
    }

    /**
     * Define o valor da propriedade activationCodeExpiration.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivationCodeExpiration(XMLGregorianCalendar value) {
        this.activationCodeExpiration = value;
    }

    /**
     * Obtém o valor da propriedade activationStatus.
     * 
     * @return
     *     possible object is
     *     {@link NavDeviceActivationStatus }
     *     
     */
    public NavDeviceActivationStatus getActivationStatus() {
        return activationStatus;
    }

    /**
     * Define o valor da propriedade activationStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link NavDeviceActivationStatus }
     *     
     */
    public void setActivationStatus(NavDeviceActivationStatus value) {
        this.activationStatus = value;
    }

    /**
     * Obtém o valor da propriedade isDevicePreAuthenticated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDevicePreAuthenticated() {
        return isDevicePreAuthenticated;
    }

    /**
     * Define o valor da propriedade isDevicePreAuthenticated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDevicePreAuthenticated(Boolean value) {
        this.isDevicePreAuthenticated = value;
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
