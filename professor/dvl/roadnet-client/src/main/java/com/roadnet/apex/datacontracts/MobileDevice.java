
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MobileDevice complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MobileDevice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BaseMobileDevice"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrentRegionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnableOmnitracsNavigation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableOmnitracsNavigationPlus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableVoiceNavigation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsFixedDisplay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsOmnitracsDeviceSynced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileNetworkOperator_MobileNetworkOperator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobilePlatform_MobilePlatform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsNavigationActivationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileDevice", propOrder = {
    "currentRegionDescription",
    "currentRegionIdentifier",
    "enableOmnitracsNavigation",
    "enableOmnitracsNavigationPlus",
    "enableVoiceNavigation",
    "isFixedDisplay",
    "isOmnitracsDeviceSynced",
    "mobileNetworkOperatorMobileNetworkOperator",
    "mobilePlatformMobilePlatform",
    "omnitracsNavigationActivationCode"
})
public class MobileDevice
    extends BaseMobileDevice
{

    @XmlElementRef(name = "CurrentRegionDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentRegionDescription;
    @XmlElementRef(name = "CurrentRegionIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentRegionIdentifier;
    @XmlElement(name = "EnableOmnitracsNavigation")
    protected Boolean enableOmnitracsNavigation;
    @XmlElement(name = "EnableOmnitracsNavigationPlus")
    protected Boolean enableOmnitracsNavigationPlus;
    @XmlElement(name = "EnableVoiceNavigation")
    protected Boolean enableVoiceNavigation;
    @XmlElement(name = "IsFixedDisplay")
    protected Boolean isFixedDisplay;
    @XmlElement(name = "IsOmnitracsDeviceSynced")
    protected Boolean isOmnitracsDeviceSynced;
    @XmlElementRef(name = "MobileNetworkOperator_MobileNetworkOperator", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileNetworkOperatorMobileNetworkOperator;
    @XmlElementRef(name = "MobilePlatform_MobilePlatform", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobilePlatformMobilePlatform;
    @XmlElementRef(name = "OmnitracsNavigationActivationCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> omnitracsNavigationActivationCode;

    /**
     * Obtém o valor da propriedade currentRegionDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentRegionDescription() {
        return currentRegionDescription;
    }

    /**
     * Define o valor da propriedade currentRegionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentRegionDescription(JAXBElement<String> value) {
        this.currentRegionDescription = value;
    }

    /**
     * Obtém o valor da propriedade currentRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentRegionIdentifier() {
        return currentRegionIdentifier;
    }

    /**
     * Define o valor da propriedade currentRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentRegionIdentifier(JAXBElement<String> value) {
        this.currentRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade enableOmnitracsNavigation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableOmnitracsNavigation() {
        return enableOmnitracsNavigation;
    }

    /**
     * Define o valor da propriedade enableOmnitracsNavigation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableOmnitracsNavigation(Boolean value) {
        this.enableOmnitracsNavigation = value;
    }

    /**
     * Obtém o valor da propriedade enableOmnitracsNavigationPlus.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableOmnitracsNavigationPlus() {
        return enableOmnitracsNavigationPlus;
    }

    /**
     * Define o valor da propriedade enableOmnitracsNavigationPlus.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableOmnitracsNavigationPlus(Boolean value) {
        this.enableOmnitracsNavigationPlus = value;
    }

    /**
     * Obtém o valor da propriedade enableVoiceNavigation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableVoiceNavigation() {
        return enableVoiceNavigation;
    }

    /**
     * Define o valor da propriedade enableVoiceNavigation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableVoiceNavigation(Boolean value) {
        this.enableVoiceNavigation = value;
    }

    /**
     * Obtém o valor da propriedade isFixedDisplay.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFixedDisplay() {
        return isFixedDisplay;
    }

    /**
     * Define o valor da propriedade isFixedDisplay.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFixedDisplay(Boolean value) {
        this.isFixedDisplay = value;
    }

    /**
     * Obtém o valor da propriedade isOmnitracsDeviceSynced.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOmnitracsDeviceSynced() {
        return isOmnitracsDeviceSynced;
    }

    /**
     * Define o valor da propriedade isOmnitracsDeviceSynced.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOmnitracsDeviceSynced(Boolean value) {
        this.isOmnitracsDeviceSynced = value;
    }

    /**
     * Obtém o valor da propriedade mobileNetworkOperatorMobileNetworkOperator.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileNetworkOperatorMobileNetworkOperator() {
        return mobileNetworkOperatorMobileNetworkOperator;
    }

    /**
     * Define o valor da propriedade mobileNetworkOperatorMobileNetworkOperator.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileNetworkOperatorMobileNetworkOperator(JAXBElement<String> value) {
        this.mobileNetworkOperatorMobileNetworkOperator = value;
    }

    /**
     * Obtém o valor da propriedade mobilePlatformMobilePlatform.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobilePlatformMobilePlatform() {
        return mobilePlatformMobilePlatform;
    }

    /**
     * Define o valor da propriedade mobilePlatformMobilePlatform.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobilePlatformMobilePlatform(JAXBElement<String> value) {
        this.mobilePlatformMobilePlatform = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsNavigationActivationCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOmnitracsNavigationActivationCode() {
        return omnitracsNavigationActivationCode;
    }

    /**
     * Define o valor da propriedade omnitracsNavigationActivationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOmnitracsNavigationActivationCode(JAXBElement<String> value) {
        this.omnitracsNavigationActivationCode = value;
    }

}
