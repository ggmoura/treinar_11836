
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de NavRecalculationVehicleOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NavRecalculationVehicleOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommercialVehicle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GrossVehicleWeight" type="{http://roadnet.com/apex/DataContracts/}Weight" minOccurs="0"/&gt;
 *         &lt;element name="VehicleHeight" type="{http://roadnet.com/apex/DataContracts/}Length" minOccurs="0"/&gt;
 *         &lt;element name="VehicleLength" type="{http://roadnet.com/apex/DataContracts/}Length" minOccurs="0"/&gt;
 *         &lt;element name="VehicleWidth" type="{http://roadnet.com/apex/DataContracts/}Length" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavRecalculationVehicleOptions", propOrder = {
    "commercialVehicle",
    "grossVehicleWeight",
    "vehicleHeight",
    "vehicleLength",
    "vehicleWidth"
})
public class NavRecalculationVehicleOptions
    extends DataTransferObject
{

    @XmlElement(name = "CommercialVehicle")
    protected Boolean commercialVehicle;
    @XmlElementRef(name = "GrossVehicleWeight", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Weight> grossVehicleWeight;
    @XmlElementRef(name = "VehicleHeight", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Length> vehicleHeight;
    @XmlElementRef(name = "VehicleLength", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Length> vehicleLength;
    @XmlElementRef(name = "VehicleWidth", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Length> vehicleWidth;

    /**
     * Obtém o valor da propriedade commercialVehicle.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommercialVehicle() {
        return commercialVehicle;
    }

    /**
     * Define o valor da propriedade commercialVehicle.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommercialVehicle(Boolean value) {
        this.commercialVehicle = value;
    }

    /**
     * Obtém o valor da propriedade grossVehicleWeight.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Weight }{@code >}
     *     
     */
    public JAXBElement<Weight> getGrossVehicleWeight() {
        return grossVehicleWeight;
    }

    /**
     * Define o valor da propriedade grossVehicleWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Weight }{@code >}
     *     
     */
    public void setGrossVehicleWeight(JAXBElement<Weight> value) {
        this.grossVehicleWeight = value;
    }

    /**
     * Obtém o valor da propriedade vehicleHeight.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public JAXBElement<Length> getVehicleHeight() {
        return vehicleHeight;
    }

    /**
     * Define o valor da propriedade vehicleHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public void setVehicleHeight(JAXBElement<Length> value) {
        this.vehicleHeight = value;
    }

    /**
     * Obtém o valor da propriedade vehicleLength.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public JAXBElement<Length> getVehicleLength() {
        return vehicleLength;
    }

    /**
     * Define o valor da propriedade vehicleLength.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public void setVehicleLength(JAXBElement<Length> value) {
        this.vehicleLength = value;
    }

    /**
     * Obtém o valor da propriedade vehicleWidth.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public JAXBElement<Length> getVehicleWidth() {
        return vehicleWidth;
    }

    /**
     * Define o valor da propriedade vehicleWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public void setVehicleWidth(JAXBElement<Length> value) {
        this.vehicleWidth = value;
    }

}
