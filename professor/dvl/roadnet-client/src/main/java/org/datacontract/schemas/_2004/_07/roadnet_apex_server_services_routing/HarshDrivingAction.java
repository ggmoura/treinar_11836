
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.Coordinate;
import com.roadnet.apex.datacontracts.Speed;


/**
 * <p>Classe Java de HarshDrivingAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="HarshDrivingAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MobileDeviceAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Coordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="ForwardGForce" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="GPSSpeed" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="HarshDrivingType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Heading" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HorizontalDilutionOfPrecision" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="LateralGForce" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfSatellitesUsed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "HarshDrivingAction", propOrder = {
    "coordinate",
    "forwardGForce",
    "gpsSpeed",
    "harshDrivingTypeType",
    "heading",
    "horizontalDilutionOfPrecision",
    "lateralGForce",
    "numberOfSatellitesUsed",
    "verticalGForce"
})
public class HarshDrivingAction
    extends MobileDeviceAction
{

    @XmlElementRef(name = "Coordinate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinate;
    @XmlElementRef(name = "ForwardGForce", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> forwardGForce;
    @XmlElementRef(name = "GPSSpeed", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> gpsSpeed;
    @XmlElementRef(name = "HarshDrivingType_Type", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> harshDrivingTypeType;
    @XmlElementRef(name = "Heading", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> heading;
    @XmlElementRef(name = "HorizontalDilutionOfPrecision", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> horizontalDilutionOfPrecision;
    @XmlElementRef(name = "LateralGForce", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lateralGForce;
    @XmlElementRef(name = "NumberOfSatellitesUsed", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfSatellitesUsed;
    @XmlElementRef(name = "VerticalGForce", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> verticalGForce;

    /**
     * Obtém o valor da propriedade coordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getCoordinate() {
        return coordinate;
    }

    /**
     * Define o valor da propriedade coordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setCoordinate(JAXBElement<Coordinate> value) {
        this.coordinate = value;
    }

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
     * Obtém o valor da propriedade harshDrivingTypeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHarshDrivingTypeType() {
        return harshDrivingTypeType;
    }

    /**
     * Define o valor da propriedade harshDrivingTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHarshDrivingTypeType(JAXBElement<String> value) {
        this.harshDrivingTypeType = value;
    }

    /**
     * Obtém o valor da propriedade heading.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHeading() {
        return heading;
    }

    /**
     * Define o valor da propriedade heading.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHeading(JAXBElement<Integer> value) {
        this.heading = value;
    }

    /**
     * Obtém o valor da propriedade horizontalDilutionOfPrecision.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHorizontalDilutionOfPrecision() {
        return horizontalDilutionOfPrecision;
    }

    /**
     * Define o valor da propriedade horizontalDilutionOfPrecision.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHorizontalDilutionOfPrecision(JAXBElement<Double> value) {
        this.horizontalDilutionOfPrecision = value;
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
     * Obtém o valor da propriedade numberOfSatellitesUsed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfSatellitesUsed() {
        return numberOfSatellitesUsed;
    }

    /**
     * Define o valor da propriedade numberOfSatellitesUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfSatellitesUsed(JAXBElement<Integer> value) {
        this.numberOfSatellitesUsed = value;
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
