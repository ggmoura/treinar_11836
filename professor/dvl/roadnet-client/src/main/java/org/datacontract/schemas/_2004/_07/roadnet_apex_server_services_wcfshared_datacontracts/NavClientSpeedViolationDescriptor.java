
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import com.roadnet.apex.datacontracts.Distance;
import com.roadnet.apex.datacontracts.Speed;


/**
 * <p>Classe Java de NavClientSpeedViolationDescriptor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NavClientSpeedViolationDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions}ResourceExceptionSpecialDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowedSpeed" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="Distance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="MaxViolatingSpeed" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="OverLimitThreshold" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavClientSpeedViolationDescriptor", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", propOrder = {
    "allowedSpeed",
    "distance",
    "duration",
    "maxViolatingSpeed",
    "overLimitThreshold"
})
public class NavClientSpeedViolationDescriptor
    extends ResourceExceptionSpecialDescriptor
{

    @XmlElementRef(name = "AllowedSpeed", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> allowedSpeed;
    @XmlElementRef(name = "Distance", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> distance;
    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElementRef(name = "MaxViolatingSpeed", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> maxViolatingSpeed;
    @XmlElementRef(name = "OverLimitThreshold", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> overLimitThreshold;

    /**
     * Obtém o valor da propriedade allowedSpeed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getAllowedSpeed() {
        return allowedSpeed;
    }

    /**
     * Define o valor da propriedade allowedSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setAllowedSpeed(JAXBElement<Speed> value) {
        this.allowedSpeed = value;
    }

    /**
     * Obtém o valor da propriedade distance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDistance() {
        return distance;
    }

    /**
     * Define o valor da propriedade distance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDistance(JAXBElement<Distance> value) {
        this.distance = value;
    }

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
     * Obtém o valor da propriedade maxViolatingSpeed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getMaxViolatingSpeed() {
        return maxViolatingSpeed;
    }

    /**
     * Define o valor da propriedade maxViolatingSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setMaxViolatingSpeed(JAXBElement<Speed> value) {
        this.maxViolatingSpeed = value;
    }

    /**
     * Obtém o valor da propriedade overLimitThreshold.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getOverLimitThreshold() {
        return overLimitThreshold;
    }

    /**
     * Define o valor da propriedade overLimitThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setOverLimitThreshold(JAXBElement<Speed> value) {
        this.overLimitThreshold = value;
    }

}
