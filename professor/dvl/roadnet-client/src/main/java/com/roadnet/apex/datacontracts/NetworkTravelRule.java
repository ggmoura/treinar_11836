
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de NetworkTravelRule complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkTravelRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetworkTravelModelTimePeriodType_TravelModelTimePeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetworkTravelModelType_TravelModelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpeedModifier" type="{http://roadnet.com/apex/DataContracts/}NetworkSpeedModifier" minOccurs="0"/&gt;
 *         &lt;element name="VehicleConstraints" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNetworkVehicleConstraint" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkTravelRule", propOrder = {
    "networkTravelModelTimePeriodTypeTravelModelTimePeriod",
    "networkTravelModelTypeTravelModelType",
    "speedModifier",
    "vehicleConstraints"
})
@XmlSeeAlso({
    NetworkRestrictedPathRule.class,
    NetworkTravelPolygonRule.class
})
public class NetworkTravelRule
    extends DataTransferObject
{

    @XmlElementRef(name = "NetworkTravelModelTimePeriodType_TravelModelTimePeriod", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkTravelModelTimePeriodTypeTravelModelTimePeriod;
    @XmlElementRef(name = "NetworkTravelModelType_TravelModelType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkTravelModelTypeTravelModelType;
    @XmlElementRef(name = "SpeedModifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkSpeedModifier> speedModifier;
    @XmlElementRef(name = "VehicleConstraints", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkVehicleConstraint> vehicleConstraints;

    /**
     * Obtém o valor da propriedade networkTravelModelTimePeriodTypeTravelModelTimePeriod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkTravelModelTimePeriodTypeTravelModelTimePeriod() {
        return networkTravelModelTimePeriodTypeTravelModelTimePeriod;
    }

    /**
     * Define o valor da propriedade networkTravelModelTimePeriodTypeTravelModelTimePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkTravelModelTimePeriodTypeTravelModelTimePeriod(JAXBElement<String> value) {
        this.networkTravelModelTimePeriodTypeTravelModelTimePeriod = value;
    }

    /**
     * Obtém o valor da propriedade networkTravelModelTypeTravelModelType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkTravelModelTypeTravelModelType() {
        return networkTravelModelTypeTravelModelType;
    }

    /**
     * Define o valor da propriedade networkTravelModelTypeTravelModelType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkTravelModelTypeTravelModelType(JAXBElement<String> value) {
        this.networkTravelModelTypeTravelModelType = value;
    }

    /**
     * Obtém o valor da propriedade speedModifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkSpeedModifier }{@code >}
     *     
     */
    public JAXBElement<NetworkSpeedModifier> getSpeedModifier() {
        return speedModifier;
    }

    /**
     * Define o valor da propriedade speedModifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkSpeedModifier }{@code >}
     *     
     */
    public void setSpeedModifier(JAXBElement<NetworkSpeedModifier> value) {
        this.speedModifier = value;
    }

    /**
     * Obtém o valor da propriedade vehicleConstraints.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkVehicleConstraint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkVehicleConstraint> getVehicleConstraints() {
        return vehicleConstraints;
    }

    /**
     * Define o valor da propriedade vehicleConstraints.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkVehicleConstraint }{@code >}
     *     
     */
    public void setVehicleConstraints(JAXBElement<ArrayOfNetworkVehicleConstraint> value) {
        this.vehicleConstraints = value;
    }

}
