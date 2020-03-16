
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.Speed;


/**
 * <p>Classe Java de HarshDrivingingDescriptor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="HarshDrivingingDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions}ResourceExceptionSpecialDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ForwardGForce" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="GPSSpeed" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="LateralGForce" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="VerticalGForce" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HarshDrivingingDescriptor", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", propOrder = {
    "forwardGForce",
    "gpsSpeed",
    "lateralGForce",
    "verticalGForce"
})
@XmlSeeAlso({
    HarshAccelerationDescriptor.class,
    HarshBrakingDescriptor.class,
    HarshCorneringDescriptor.class
})
public class HarshDrivingingDescriptor
    extends ResourceExceptionSpecialDescriptor
{

    @XmlElementRef(name = "ForwardGForce", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> forwardGForce;
    @XmlElementRef(name = "GPSSpeed", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> gpsSpeed;
    @XmlElementRef(name = "LateralGForce", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lateralGForce;
    @XmlElementRef(name = "VerticalGForce", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> verticalGForce;

    /**
     * Obtém o valor da propriedade forwardGForce.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getForwardGForce() {
        return forwardGForce;
    }

    /**
     * Define o valor da propriedade forwardGForce.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setForwardGForce(JAXBElement<Double> value) {
        this.forwardGForce = value;
    }

    /**
     * Obtém o valor da propriedade gpsSpeed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getGPSSpeed() {
        return gpsSpeed;
    }

    /**
     * Define o valor da propriedade gpsSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setGPSSpeed(JAXBElement<Speed> value) {
        this.gpsSpeed = value;
    }

    /**
     * Obtém o valor da propriedade lateralGForce.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLateralGForce() {
        return lateralGForce;
    }

    /**
     * Define o valor da propriedade lateralGForce.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLateralGForce(JAXBElement<Double> value) {
        this.lateralGForce = value;
    }

    /**
     * Obtém o valor da propriedade verticalGForce.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVerticalGForce() {
        return verticalGForce;
    }

    /**
     * Define o valor da propriedade verticalGForce.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVerticalGForce(JAXBElement<Double> value) {
        this.verticalGForce = value;
    }

}
