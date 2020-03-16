
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OverridableRegionProperties.VideoSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OverridableRegionProperties.VideoSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CameraClipsLength" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CameraPassword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CameraResolution" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EventTriggerPrequel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EventTriggerSequel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EventTriggerTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverrideDefaultCameraPassword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverridableRegionProperties.VideoSettings", propOrder = {
    "cameraClipsLength",
    "cameraPassword",
    "cameraResolution",
    "eventTriggerPrequel",
    "eventTriggerSequel",
    "eventTriggerTypes",
    "overrideDefaultCameraPassword"
})
public class OverridableRegionPropertiesVideoSettings
    extends DataTransferObject
{

    @XmlElement(name = "CameraClipsLength")
    protected Boolean cameraClipsLength;
    @XmlElement(name = "CameraPassword")
    protected Boolean cameraPassword;
    @XmlElement(name = "CameraResolution")
    protected Boolean cameraResolution;
    @XmlElement(name = "EventTriggerPrequel")
    protected Boolean eventTriggerPrequel;
    @XmlElement(name = "EventTriggerSequel")
    protected Boolean eventTriggerSequel;
    @XmlElement(name = "EventTriggerTypes")
    protected Boolean eventTriggerTypes;
    @XmlElement(name = "OverrideDefaultCameraPassword")
    protected Boolean overrideDefaultCameraPassword;

    /**
     * Obtém o valor da propriedade cameraClipsLength.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCameraClipsLength() {
        return cameraClipsLength;
    }

    /**
     * Define o valor da propriedade cameraClipsLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCameraClipsLength(Boolean value) {
        this.cameraClipsLength = value;
    }

    /**
     * Obtém o valor da propriedade cameraPassword.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCameraPassword() {
        return cameraPassword;
    }

    /**
     * Define o valor da propriedade cameraPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCameraPassword(Boolean value) {
        this.cameraPassword = value;
    }

    /**
     * Obtém o valor da propriedade cameraResolution.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCameraResolution() {
        return cameraResolution;
    }

    /**
     * Define o valor da propriedade cameraResolution.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCameraResolution(Boolean value) {
        this.cameraResolution = value;
    }

    /**
     * Obtém o valor da propriedade eventTriggerPrequel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEventTriggerPrequel() {
        return eventTriggerPrequel;
    }

    /**
     * Define o valor da propriedade eventTriggerPrequel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEventTriggerPrequel(Boolean value) {
        this.eventTriggerPrequel = value;
    }

    /**
     * Obtém o valor da propriedade eventTriggerSequel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEventTriggerSequel() {
        return eventTriggerSequel;
    }

    /**
     * Define o valor da propriedade eventTriggerSequel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEventTriggerSequel(Boolean value) {
        this.eventTriggerSequel = value;
    }

    /**
     * Obtém o valor da propriedade eventTriggerTypes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEventTriggerTypes() {
        return eventTriggerTypes;
    }

    /**
     * Define o valor da propriedade eventTriggerTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEventTriggerTypes(Boolean value) {
        this.eventTriggerTypes = value;
    }

    /**
     * Obtém o valor da propriedade overrideDefaultCameraPassword.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideDefaultCameraPassword() {
        return overrideDefaultCameraPassword;
    }

    /**
     * Define o valor da propriedade overrideDefaultCameraPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideDefaultCameraPassword(Boolean value) {
        this.overrideDefaultCameraPassword = value;
    }

}
