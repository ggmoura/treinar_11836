
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de TransitMatrixBuildRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TransitMatrixBuildRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualSendTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CustomerDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CustomerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefaultMapDatasetPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ForceFullBuild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MapDatasetEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MapPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MapPathOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginatingServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledSendTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitMatrixBuildRequest", propOrder = {
    "actualSendTime",
    "customerDescription",
    "customerEntityKey",
    "customerIdentifier",
    "defaultMapDatasetPkey",
    "forceFullBuild",
    "mapDatasetEntityKey",
    "mapPath",
    "mapPathOverride",
    "originatingServer",
    "regionDescription",
    "regionEntityKey",
    "regionIdentifier",
    "requestNumber",
    "scheduledSendTime"
})
public class TransitMatrixBuildRequest
    extends DataTransferObject
{

    @XmlElement(name = "ActualSendTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualSendTime;
    @XmlElementRef(name = "CustomerDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerDescription;
    @XmlElement(name = "CustomerEntityKey")
    protected Long customerEntityKey;
    @XmlElementRef(name = "CustomerIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerIdentifier;
    @XmlElement(name = "DefaultMapDatasetPkey")
    protected Long defaultMapDatasetPkey;
    @XmlElement(name = "ForceFullBuild")
    protected Boolean forceFullBuild;
    @XmlElementRef(name = "MapDatasetEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> mapDatasetEntityKey;
    @XmlElementRef(name = "MapPath", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapPath;
    @XmlElementRef(name = "MapPathOverride", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapPathOverride;
    @XmlElementRef(name = "OriginatingServer", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originatingServer;
    @XmlElementRef(name = "RegionDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionDescription;
    @XmlElement(name = "RegionEntityKey")
    protected Long regionEntityKey;
    @XmlElementRef(name = "RegionIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionIdentifier;
    @XmlElement(name = "RequestNumber")
    protected Integer requestNumber;
    @XmlElement(name = "ScheduledSendTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledSendTime;

    /**
     * Obtém o valor da propriedade actualSendTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualSendTime() {
        return actualSendTime;
    }

    /**
     * Define o valor da propriedade actualSendTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualSendTime(XMLGregorianCalendar value) {
        this.actualSendTime = value;
    }

    /**
     * Obtém o valor da propriedade customerDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerDescription() {
        return customerDescription;
    }

    /**
     * Define o valor da propriedade customerDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerDescription(JAXBElement<String> value) {
        this.customerDescription = value;
    }

    /**
     * Obtém o valor da propriedade customerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerEntityKey() {
        return customerEntityKey;
    }

    /**
     * Define o valor da propriedade customerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerEntityKey(Long value) {
        this.customerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade customerIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * Define o valor da propriedade customerIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerIdentifier(JAXBElement<String> value) {
        this.customerIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade defaultMapDatasetPkey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDefaultMapDatasetPkey() {
        return defaultMapDatasetPkey;
    }

    /**
     * Define o valor da propriedade defaultMapDatasetPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDefaultMapDatasetPkey(Long value) {
        this.defaultMapDatasetPkey = value;
    }

    /**
     * Obtém o valor da propriedade forceFullBuild.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceFullBuild() {
        return forceFullBuild;
    }

    /**
     * Define o valor da propriedade forceFullBuild.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceFullBuild(Boolean value) {
        this.forceFullBuild = value;
    }

    /**
     * Obtém o valor da propriedade mapDatasetEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMapDatasetEntityKey() {
        return mapDatasetEntityKey;
    }

    /**
     * Define o valor da propriedade mapDatasetEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMapDatasetEntityKey(JAXBElement<Long> value) {
        this.mapDatasetEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade mapPath.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMapPath() {
        return mapPath;
    }

    /**
     * Define o valor da propriedade mapPath.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMapPath(JAXBElement<String> value) {
        this.mapPath = value;
    }

    /**
     * Obtém o valor da propriedade mapPathOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMapPathOverride() {
        return mapPathOverride;
    }

    /**
     * Define o valor da propriedade mapPathOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMapPathOverride(JAXBElement<String> value) {
        this.mapPathOverride = value;
    }

    /**
     * Obtém o valor da propriedade originatingServer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginatingServer() {
        return originatingServer;
    }

    /**
     * Define o valor da propriedade originatingServer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginatingServer(JAXBElement<String> value) {
        this.originatingServer = value;
    }

    /**
     * Obtém o valor da propriedade regionDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegionDescription() {
        return regionDescription;
    }

    /**
     * Define o valor da propriedade regionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegionDescription(JAXBElement<String> value) {
        this.regionDescription = value;
    }

    /**
     * Obtém o valor da propriedade regionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegionEntityKey() {
        return regionEntityKey;
    }

    /**
     * Define o valor da propriedade regionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegionEntityKey(Long value) {
        this.regionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade regionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegionIdentifier() {
        return regionIdentifier;
    }

    /**
     * Define o valor da propriedade regionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegionIdentifier(JAXBElement<String> value) {
        this.regionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade requestNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequestNumber() {
        return requestNumber;
    }

    /**
     * Define o valor da propriedade requestNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequestNumber(Integer value) {
        this.requestNumber = value;
    }

    /**
     * Obtém o valor da propriedade scheduledSendTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledSendTime() {
        return scheduledSendTime;
    }

    /**
     * Define o valor da propriedade scheduledSendTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledSendTime(XMLGregorianCalendar value) {
        this.scheduledSendTime = value;
    }

}
