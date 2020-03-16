
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.OnboardDataProvider;
import com.roadnet.apex.datacontracts.WorldTimeZone;


/**
 * <p>Classe Java de OnboardImportParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OnboardImportParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import}ImportParameters"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CoordinateFormat" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import}CoordinateFormat" minOccurs="0"/&gt;
 *         &lt;element name="OnboardDataProvider" type="{http://roadnet.com/apex/DataContracts/}OnboardDataProvider" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TimeZone" type="{http://roadnet.com/apex/DataContracts/}WorldTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="UpdateServiceLocationInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnboardImportParameters", propOrder = {
    "coordinateFormat",
    "onboardDataProvider",
    "routingSessionEntityKey",
    "timeZone",
    "updateServiceLocationInformation"
})
public class OnboardImportParameters
    extends ImportParameters
{

    @XmlElement(name = "CoordinateFormat")
    @XmlSchemaType(name = "string")
    protected CoordinateFormat coordinateFormat;
    @XmlElement(name = "OnboardDataProvider")
    @XmlSchemaType(name = "string")
    protected OnboardDataProvider onboardDataProvider;
    @XmlElementRef(name = "RoutingSessionEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> routingSessionEntityKey;
    @XmlElement(name = "TimeZone")
    @XmlSchemaType(name = "string")
    protected WorldTimeZone timeZone;
    @XmlElement(name = "UpdateServiceLocationInformation")
    protected Boolean updateServiceLocationInformation;

    /**
     * Obtém o valor da propriedade coordinateFormat.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateFormat }
     *     
     */
    public CoordinateFormat getCoordinateFormat() {
        return coordinateFormat;
    }

    /**
     * Define o valor da propriedade coordinateFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateFormat }
     *     
     */
    public void setCoordinateFormat(CoordinateFormat value) {
        this.coordinateFormat = value;
    }

    /**
     * Obtém o valor da propriedade onboardDataProvider.
     * 
     * @return
     *     possible object is
     *     {@link OnboardDataProvider }
     *     
     */
    public OnboardDataProvider getOnboardDataProvider() {
        return onboardDataProvider;
    }

    /**
     * Define o valor da propriedade onboardDataProvider.
     * 
     * @param value
     *     allowed object is
     *     {@link OnboardDataProvider }
     *     
     */
    public void setOnboardDataProvider(OnboardDataProvider value) {
        this.onboardDataProvider = value;
    }

    /**
     * Obtém o valor da propriedade routingSessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRoutingSessionEntityKey() {
        return routingSessionEntityKey;
    }

    /**
     * Define o valor da propriedade routingSessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRoutingSessionEntityKey(JAXBElement<Long> value) {
        this.routingSessionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade timeZone.
     * 
     * @return
     *     possible object is
     *     {@link WorldTimeZone }
     *     
     */
    public WorldTimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * Define o valor da propriedade timeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link WorldTimeZone }
     *     
     */
    public void setTimeZone(WorldTimeZone value) {
        this.timeZone = value;
    }

    /**
     * Obtém o valor da propriedade updateServiceLocationInformation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateServiceLocationInformation() {
        return updateServiceLocationInformation;
    }

    /**
     * Define o valor da propriedade updateServiceLocationInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateServiceLocationInformation(Boolean value) {
        this.updateServiceLocationInformation = value;
    }

}
