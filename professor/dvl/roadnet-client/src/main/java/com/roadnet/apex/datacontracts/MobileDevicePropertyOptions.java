
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MobileDevicePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MobileDevicePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BaseMobileDevicePropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrentRegionDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableOmnitracsNavigation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableOmnitracsNavigationPlus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableVoiceNavigation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsFixedDisplay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsOmnitracsDeviceSynced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileNetworkOperator_MobileNetworkOperator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobilePlatform_MobilePlatform" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsNavigationActivationCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileDevicePropertyOptions", propOrder = {
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
public class MobileDevicePropertyOptions
    extends BaseMobileDevicePropertyOptions
{

    @XmlElement(name = "CurrentRegionDescription")
    protected Boolean currentRegionDescription;
    @XmlElement(name = "CurrentRegionIdentifier")
    protected Boolean currentRegionIdentifier;
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
    @XmlElement(name = "MobileNetworkOperator_MobileNetworkOperator")
    protected Boolean mobileNetworkOperatorMobileNetworkOperator;
    @XmlElement(name = "MobilePlatform_MobilePlatform")
    protected Boolean mobilePlatformMobilePlatform;
    @XmlElement(name = "OmnitracsNavigationActivationCode")
    protected Boolean omnitracsNavigationActivationCode;

    /**
     * Obtém o valor da propriedade currentRegionDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentRegionDescription() {
        return currentRegionDescription;
    }

    /**
     * Define o valor da propriedade currentRegionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentRegionDescription(Boolean value) {
        this.currentRegionDescription = value;
    }

    /**
     * Obtém o valor da propriedade currentRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentRegionIdentifier() {
        return currentRegionIdentifier;
    }

    /**
     * Define o valor da propriedade currentRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentRegionIdentifier(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileNetworkOperatorMobileNetworkOperator() {
        return mobileNetworkOperatorMobileNetworkOperator;
    }

    /**
     * Define o valor da propriedade mobileNetworkOperatorMobileNetworkOperator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileNetworkOperatorMobileNetworkOperator(Boolean value) {
        this.mobileNetworkOperatorMobileNetworkOperator = value;
    }

    /**
     * Obtém o valor da propriedade mobilePlatformMobilePlatform.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobilePlatformMobilePlatform() {
        return mobilePlatformMobilePlatform;
    }

    /**
     * Define o valor da propriedade mobilePlatformMobilePlatform.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobilePlatformMobilePlatform(Boolean value) {
        this.mobilePlatformMobilePlatform = value;
    }

    /**
     * Obtém o valor da propriedade omnitracsNavigationActivationCode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOmnitracsNavigationActivationCode() {
        return omnitracsNavigationActivationCode;
    }

    /**
     * Define o valor da propriedade omnitracsNavigationActivationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOmnitracsNavigationActivationCode(Boolean value) {
        this.omnitracsNavigationActivationCode = value;
    }

}
