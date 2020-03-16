
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import com.roadnet.apex.datacontracts.Temperature;


/**
 * <p>Classe Java de TemperatureDescriptor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TemperatureDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions}ResourceExceptionSpecialDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Duration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="IsCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Temperature" type="{http://roadnet.com/apex/DataContracts/}Temperature" minOccurs="0"/&gt;
 *         &lt;element name="TemperatureLimitType_LimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemperatureDescriptor", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", propOrder = {
    "duration",
    "isCompleted",
    "temperature",
    "temperatureLimitTypeLimitType"
})
public class TemperatureDescriptor
    extends ResourceExceptionSpecialDescriptor
{

    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElement(name = "IsCompleted")
    protected Boolean isCompleted;
    @XmlElementRef(name = "Temperature", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<Temperature> temperature;
    @XmlElementRef(name = "TemperatureLimitType_LimitType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<String> temperatureLimitTypeLimitType;

    /**
     * Obtém o valor da propriedade duration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Define o valor da propriedade duration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Obtém o valor da propriedade isCompleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCompleted() {
        return isCompleted;
    }

    /**
     * Define o valor da propriedade isCompleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCompleted(Boolean value) {
        this.isCompleted = value;
    }

    /**
     * Obtém o valor da propriedade temperature.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Temperature }{@code >}
     *     
     */
    public JAXBElement<Temperature> getTemperature() {
        return temperature;
    }

    /**
     * Define o valor da propriedade temperature.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Temperature }{@code >}
     *     
     */
    public void setTemperature(JAXBElement<Temperature> value) {
        this.temperature = value;
    }

    /**
     * Obtém o valor da propriedade temperatureLimitTypeLimitType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTemperatureLimitTypeLimitType() {
        return temperatureLimitTypeLimitType;
    }

    /**
     * Define o valor da propriedade temperatureLimitTypeLimitType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTemperatureLimitTypeLimitType(JAXBElement<String> value) {
        this.temperatureLimitTypeLimitType = value;
    }

}
