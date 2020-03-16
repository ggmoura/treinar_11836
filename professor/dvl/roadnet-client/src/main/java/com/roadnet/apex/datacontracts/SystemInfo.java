
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de SystemInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SystemInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MapInfo" type="{http://roadnet.com/apex/DataContracts/}MapDataInfo" minOccurs="0"/&gt;
 *         &lt;element name="ServerBuildType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServerVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TranslationRevision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TranslationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemInfo", propOrder = {
    "mapInfo",
    "serverBuildType",
    "serverVersion",
    "translationRevision",
    "translationVersion"
})
public class SystemInfo
    extends DataTransferObject
{

    @XmlElementRef(name = "MapInfo", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<MapDataInfo> mapInfo;
    @XmlElementRef(name = "ServerBuildType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serverBuildType;
    @XmlElementRef(name = "ServerVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serverVersion;
    @XmlElementRef(name = "TranslationRevision", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> translationRevision;
    @XmlElementRef(name = "TranslationVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> translationVersion;

    /**
     * Obtém o valor da propriedade mapInfo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MapDataInfo }{@code >}
     *     
     */
    public JAXBElement<MapDataInfo> getMapInfo() {
        return mapInfo;
    }

    /**
     * Define o valor da propriedade mapInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MapDataInfo }{@code >}
     *     
     */
    public void setMapInfo(JAXBElement<MapDataInfo> value) {
        this.mapInfo = value;
    }

    /**
     * Obtém o valor da propriedade serverBuildType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServerBuildType() {
        return serverBuildType;
    }

    /**
     * Define o valor da propriedade serverBuildType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServerBuildType(JAXBElement<String> value) {
        this.serverBuildType = value;
    }

    /**
     * Obtém o valor da propriedade serverVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServerVersion() {
        return serverVersion;
    }

    /**
     * Define o valor da propriedade serverVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServerVersion(JAXBElement<String> value) {
        this.serverVersion = value;
    }

    /**
     * Obtém o valor da propriedade translationRevision.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTranslationRevision() {
        return translationRevision;
    }

    /**
     * Define o valor da propriedade translationRevision.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTranslationRevision(JAXBElement<String> value) {
        this.translationRevision = value;
    }

    /**
     * Obtém o valor da propriedade translationVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTranslationVersion() {
        return translationVersion;
    }

    /**
     * Define o valor da propriedade translationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTranslationVersion(JAXBElement<String> value) {
        this.translationVersion = value;
    }

}
