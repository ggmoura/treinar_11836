
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de Region.VideoSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Region.VideoSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CameraClipsLength" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="CameraPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EventTriggerPrequel" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="EventTriggerSequel" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="ListOfVideoEventTriggerType_EventTriggerTypes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="OverrideDefaultCameraPassword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VideoResolution_CameraResolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Region.VideoSettings", propOrder = {
    "cameraClipsLength",
    "cameraPassword",
    "eventTriggerPrequel",
    "eventTriggerSequel",
    "listOfVideoEventTriggerTypeEventTriggerTypes",
    "overrideDefaultCameraPassword",
    "videoResolutionCameraResolution"
})
public class RegionVideoSettings
    extends DataTransferObject
{

    @XmlElement(name = "CameraClipsLength")
    protected Duration cameraClipsLength;
    @XmlElementRef(name = "CameraPassword", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cameraPassword;
    @XmlElement(name = "EventTriggerPrequel")
    protected Duration eventTriggerPrequel;
    @XmlElement(name = "EventTriggerSequel")
    protected Duration eventTriggerSequel;
    @XmlElementRef(name = "ListOfVideoEventTriggerType_EventTriggerTypes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> listOfVideoEventTriggerTypeEventTriggerTypes;
    @XmlElement(name = "OverrideDefaultCameraPassword")
    protected Boolean overrideDefaultCameraPassword;
    @XmlElementRef(name = "VideoResolution_CameraResolution", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> videoResolutionCameraResolution;

    /**
     * Obtém o valor da propriedade cameraClipsLength.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getCameraClipsLength() {
        return cameraClipsLength;
    }

    /**
     * Define o valor da propriedade cameraClipsLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setCameraClipsLength(Duration value) {
        this.cameraClipsLength = value;
    }

    /**
     * Obtém o valor da propriedade cameraPassword.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCameraPassword() {
        return cameraPassword;
    }

    /**
     * Define o valor da propriedade cameraPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCameraPassword(JAXBElement<String> value) {
        this.cameraPassword = value;
    }

    /**
     * Obtém o valor da propriedade eventTriggerPrequel.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEventTriggerPrequel() {
        return eventTriggerPrequel;
    }

    /**
     * Define o valor da propriedade eventTriggerPrequel.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEventTriggerPrequel(Duration value) {
        this.eventTriggerPrequel = value;
    }

    /**
     * Obtém o valor da propriedade eventTriggerSequel.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEventTriggerSequel() {
        return eventTriggerSequel;
    }

    /**
     * Define o valor da propriedade eventTriggerSequel.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEventTriggerSequel(Duration value) {
        this.eventTriggerSequel = value;
    }

    /**
     * Obtém o valor da propriedade listOfVideoEventTriggerTypeEventTriggerTypes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getListOfVideoEventTriggerTypeEventTriggerTypes() {
        return listOfVideoEventTriggerTypeEventTriggerTypes;
    }

    /**
     * Define o valor da propriedade listOfVideoEventTriggerTypeEventTriggerTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setListOfVideoEventTriggerTypeEventTriggerTypes(JAXBElement<ArrayOfstring> value) {
        this.listOfVideoEventTriggerTypeEventTriggerTypes = value;
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

    /**
     * Obtém o valor da propriedade videoResolutionCameraResolution.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVideoResolutionCameraResolution() {
        return videoResolutionCameraResolution;
    }

    /**
     * Define o valor da propriedade videoResolutionCameraResolution.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVideoResolutionCameraResolution(JAXBElement<String> value) {
        this.videoResolutionCameraResolution = value;
    }

}
