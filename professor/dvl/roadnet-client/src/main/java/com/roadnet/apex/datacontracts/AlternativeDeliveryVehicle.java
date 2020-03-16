
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de AlternativeDeliveryVehicle complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AlternativeDeliveryVehicle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowWalkwaysAndFerriesTravel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FixedSpeed" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreOneWays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProhibitInterstateAndHighwayTravel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternativeDeliveryVehicle", propOrder = {
    "allowWalkwaysAndFerriesTravel",
    "fixedSpeed",
    "ignoreOneWays",
    "isEnabled",
    "prohibitInterstateAndHighwayTravel"
})
public class AlternativeDeliveryVehicle
    extends DataTransferObject
{

    @XmlElement(name = "AllowWalkwaysAndFerriesTravel")
    protected Boolean allowWalkwaysAndFerriesTravel;
    @XmlElementRef(name = "FixedSpeed", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> fixedSpeed;
    @XmlElement(name = "IgnoreOneWays")
    protected Boolean ignoreOneWays;
    @XmlElement(name = "IsEnabled")
    protected Boolean isEnabled;
    @XmlElement(name = "ProhibitInterstateAndHighwayTravel")
    protected Boolean prohibitInterstateAndHighwayTravel;

    /**
     * Obtém o valor da propriedade allowWalkwaysAndFerriesTravel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowWalkwaysAndFerriesTravel() {
        return allowWalkwaysAndFerriesTravel;
    }

    /**
     * Define o valor da propriedade allowWalkwaysAndFerriesTravel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowWalkwaysAndFerriesTravel(Boolean value) {
        this.allowWalkwaysAndFerriesTravel = value;
    }

    /**
     * Obtém o valor da propriedade fixedSpeed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getFixedSpeed() {
        return fixedSpeed;
    }

    /**
     * Define o valor da propriedade fixedSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setFixedSpeed(JAXBElement<Speed> value) {
        this.fixedSpeed = value;
    }

    /**
     * Obtém o valor da propriedade ignoreOneWays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreOneWays() {
        return ignoreOneWays;
    }

    /**
     * Define o valor da propriedade ignoreOneWays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreOneWays(Boolean value) {
        this.ignoreOneWays = value;
    }

    /**
     * Obtém o valor da propriedade isEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * Define o valor da propriedade isEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabled(Boolean value) {
        this.isEnabled = value;
    }

    /**
     * Obtém o valor da propriedade prohibitInterstateAndHighwayTravel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProhibitInterstateAndHighwayTravel() {
        return prohibitInterstateAndHighwayTravel;
    }

    /**
     * Define o valor da propriedade prohibitInterstateAndHighwayTravel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitInterstateAndHighwayTravel(Boolean value) {
        this.prohibitInterstateAndHighwayTravel = value;
    }

}
