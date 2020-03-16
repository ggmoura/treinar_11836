
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de CorrespondenceView complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CorrespondenceView"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttachmentList" type="{http://roadnet.com/apex/DataContracts/}ArrayOfCorrespondenceAttachment" minOccurs="0"/&gt;
 *         &lt;element name="CorrespondencePriority_Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Guid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="IsOutbound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTrash" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReadTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ReceivedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Sender" type="{http://roadnet.com/apex/DataContracts/}Correspondent" minOccurs="0"/&gt;
 *         &lt;element name="SentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrespondenceView", propOrder = {
    "attachmentList",
    "correspondencePriorityPriority",
    "entityKey",
    "guid",
    "isOutbound",
    "isTrash",
    "readTime",
    "receivedTime",
    "regionEntityKey",
    "routeEntityKey",
    "sender",
    "sentTime",
    "text"
})
public class CorrespondenceView
    extends DataTransferObject
{

    @XmlElementRef(name = "AttachmentList", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCorrespondenceAttachment> attachmentList;
    @XmlElementRef(name = "CorrespondencePriority_Priority", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correspondencePriorityPriority;
    @XmlElement(name = "EntityKey")
    protected Long entityKey;
    @XmlElement(name = "Guid")
    protected String guid;
    @XmlElement(name = "IsOutbound")
    protected Boolean isOutbound;
    @XmlElement(name = "IsTrash")
    protected Boolean isTrash;
    @XmlElementRef(name = "ReadTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> readTime;
    @XmlElementRef(name = "ReceivedTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> receivedTime;
    @XmlElementRef(name = "RegionEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> regionEntityKey;
    @XmlElementRef(name = "RouteEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> routeEntityKey;
    @XmlElementRef(name = "Sender", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Correspondent> sender;
    @XmlElementRef(name = "SentTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> sentTime;
    @XmlElementRef(name = "Text", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> text;

    /**
     * Obtém o valor da propriedade attachmentList.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCorrespondenceAttachment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCorrespondenceAttachment> getAttachmentList() {
        return attachmentList;
    }

    /**
     * Define o valor da propriedade attachmentList.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCorrespondenceAttachment }{@code >}
     *     
     */
    public void setAttachmentList(JAXBElement<ArrayOfCorrespondenceAttachment> value) {
        this.attachmentList = value;
    }

    /**
     * Obtém o valor da propriedade correspondencePriorityPriority.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorrespondencePriorityPriority() {
        return correspondencePriorityPriority;
    }

    /**
     * Define o valor da propriedade correspondencePriorityPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorrespondencePriorityPriority(JAXBElement<String> value) {
        this.correspondencePriorityPriority = value;
    }

    /**
     * Obtém o valor da propriedade entityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntityKey() {
        return entityKey;
    }

    /**
     * Define o valor da propriedade entityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntityKey(Long value) {
        this.entityKey = value;
    }

    /**
     * Obtém o valor da propriedade guid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Define o valor da propriedade guid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Obtém o valor da propriedade isOutbound.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOutbound() {
        return isOutbound;
    }

    /**
     * Define o valor da propriedade isOutbound.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOutbound(Boolean value) {
        this.isOutbound = value;
    }

    /**
     * Obtém o valor da propriedade isTrash.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTrash() {
        return isTrash;
    }

    /**
     * Define o valor da propriedade isTrash.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTrash(Boolean value) {
        this.isTrash = value;
    }

    /**
     * Obtém o valor da propriedade readTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReadTime() {
        return readTime;
    }

    /**
     * Define o valor da propriedade readTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReadTime(JAXBElement<XMLGregorianCalendar> value) {
        this.readTime = value;
    }

    /**
     * Obtém o valor da propriedade receivedTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReceivedTime() {
        return receivedTime;
    }

    /**
     * Define o valor da propriedade receivedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReceivedTime(JAXBElement<XMLGregorianCalendar> value) {
        this.receivedTime = value;
    }

    /**
     * Obtém o valor da propriedade regionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRegionEntityKey() {
        return regionEntityKey;
    }

    /**
     * Define o valor da propriedade regionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRegionEntityKey(JAXBElement<Long> value) {
        this.regionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRouteEntityKey() {
        return routeEntityKey;
    }

    /**
     * Define o valor da propriedade routeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRouteEntityKey(JAXBElement<Long> value) {
        this.routeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade sender.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Correspondent }{@code >}
     *     
     */
    public JAXBElement<Correspondent> getSender() {
        return sender;
    }

    /**
     * Define o valor da propriedade sender.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Correspondent }{@code >}
     *     
     */
    public void setSender(JAXBElement<Correspondent> value) {
        this.sender = value;
    }

    /**
     * Obtém o valor da propriedade sentTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSentTime() {
        return sentTime;
    }

    /**
     * Define o valor da propriedade sentTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSentTime(JAXBElement<XMLGregorianCalendar> value) {
        this.sentTime = value;
    }

    /**
     * Obtém o valor da propriedade text.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getText() {
        return text;
    }

    /**
     * Define o valor da propriedade text.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setText(JAXBElement<String> value) {
        this.text = value;
    }

}
