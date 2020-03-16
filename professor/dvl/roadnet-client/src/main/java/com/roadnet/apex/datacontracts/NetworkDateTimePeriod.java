
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de NetworkDateTimePeriod complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkDateTimePeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndHour" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="EndMinute" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="NetworkDateType_DateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartHour" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="StartMinute" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkDateTimePeriod", propOrder = {
    "endHour",
    "endMinute",
    "networkDateTypeDateType",
    "startHour",
    "startMinute"
})
public class NetworkDateTimePeriod
    extends DataTransferObject
{

    @XmlElement(name = "EndHour")
    @XmlSchemaType(name = "unsignedByte")
    protected Short endHour;
    @XmlElement(name = "EndMinute")
    @XmlSchemaType(name = "unsignedByte")
    protected Short endMinute;
    @XmlElementRef(name = "NetworkDateType_DateType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkDateTypeDateType;
    @XmlElement(name = "StartHour")
    @XmlSchemaType(name = "unsignedByte")
    protected Short startHour;
    @XmlElement(name = "StartMinute")
    @XmlSchemaType(name = "unsignedByte")
    protected Short startMinute;

    /**
     * Obtém o valor da propriedade endHour.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getEndHour() {
        return endHour;
    }

    /**
     * Define o valor da propriedade endHour.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setEndHour(Short value) {
        this.endHour = value;
    }

    /**
     * Obtém o valor da propriedade endMinute.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getEndMinute() {
        return endMinute;
    }

    /**
     * Define o valor da propriedade endMinute.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setEndMinute(Short value) {
        this.endMinute = value;
    }

    /**
     * Obtém o valor da propriedade networkDateTypeDateType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkDateTypeDateType() {
        return networkDateTypeDateType;
    }

    /**
     * Define o valor da propriedade networkDateTypeDateType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkDateTypeDateType(JAXBElement<String> value) {
        this.networkDateTypeDateType = value;
    }

    /**
     * Obtém o valor da propriedade startHour.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStartHour() {
        return startHour;
    }

    /**
     * Define o valor da propriedade startHour.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStartHour(Short value) {
        this.startHour = value;
    }

    /**
     * Obtém o valor da propriedade startMinute.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStartMinute() {
        return startMinute;
    }

    /**
     * Define o valor da propriedade startMinute.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStartMinute(Short value) {
        this.startMinute = value;
    }

}
