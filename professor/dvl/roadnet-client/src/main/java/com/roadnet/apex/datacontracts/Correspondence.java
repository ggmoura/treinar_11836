
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Correspondence complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Correspondence"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttachmentList" type="{http://roadnet.com/apex/DataContracts/}ArrayOfCorrespondenceAttachment" minOccurs="0"/&gt;
 *         &lt;element name="CorrespondencePriority_Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Guid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="IsDraft" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RecipientDescriptorList" type="{http://roadnet.com/apex/DataContracts/}ArrayOfCorrespondenceRecipientDescriptor" minOccurs="0"/&gt;
 *         &lt;element name="RecipientStatusList" type="{http://roadnet.com/apex/DataContracts/}ArrayOfCorrespondenceRecipientStatus" minOccurs="0"/&gt;
 *         &lt;element name="RegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SenderStatus" type="{http://roadnet.com/apex/DataContracts/}CorrespondenceSenderStatus" minOccurs="0"/&gt;
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
@XmlType(name = "Correspondence", propOrder = {
    "attachmentList",
    "correspondencePriorityPriority",
    "guid",
    "isDraft",
    "recipientDescriptorList",
    "recipientStatusList",
    "regionEntityKey",
    "routeEntityKey",
    "senderStatus",
    "sentTime",
    "text"
})
public class Correspondence
    extends AggregateRootEntity
{

    @XmlElementRef(name = "AttachmentList", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCorrespondenceAttachment> attachmentList;
    @XmlElementRef(name = "CorrespondencePriority_Priority", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correspondencePriorityPriority;
    @XmlElement(name = "Guid")
    protected String guid;
    @XmlElement(name = "IsDraft")
    protected Boolean isDraft;
    @XmlElementRef(name = "RecipientDescriptorList", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCorrespondenceRecipientDescriptor> recipientDescriptorList;
    @XmlElementRef(name = "RecipientStatusList", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCorrespondenceRecipientStatus> recipientStatusList;
    @XmlElementRef(name = "RegionEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> regionEntityKey;
    @XmlElementRef(name = "RouteEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> routeEntityKey;
    @XmlElementRef(name = "SenderStatus", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<CorrespondenceSenderStatus> senderStatus;
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
     * Obtém o valor da propriedade isDraft.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDraft() {
        return isDraft;
    }

    /**
     * Define o valor da propriedade isDraft.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDraft(Boolean value) {
        this.isDraft = value;
    }

    /**
     * Obtém o valor da propriedade recipientDescriptorList.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCorrespondenceRecipientDescriptor }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCorrespondenceRecipientDescriptor> getRecipientDescriptorList() {
        return recipientDescriptorList;
    }

    /**
     * Define o valor da propriedade recipientDescriptorList.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCorrespondenceRecipientDescriptor }{@code >}
     *     
     */
    public void setRecipientDescriptorList(JAXBElement<ArrayOfCorrespondenceRecipientDescriptor> value) {
        this.recipientDescriptorList = value;
    }

    /**
     * Obtém o valor da propriedade recipientStatusList.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCorrespondenceRecipientStatus }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCorrespondenceRecipientStatus> getRecipientStatusList() {
        return recipientStatusList;
    }

    /**
     * Define o valor da propriedade recipientStatusList.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCorrespondenceRecipientStatus }{@code >}
     *     
     */
    public void setRecipientStatusList(JAXBElement<ArrayOfCorrespondenceRecipientStatus> value) {
        this.recipientStatusList = value;
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
     * Obtém o valor da propriedade senderStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CorrespondenceSenderStatus }{@code >}
     *     
     */
    public JAXBElement<CorrespondenceSenderStatus> getSenderStatus() {
        return senderStatus;
    }

    /**
     * Define o valor da propriedade senderStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CorrespondenceSenderStatus }{@code >}
     *     
     */
    public void setSenderStatus(JAXBElement<CorrespondenceSenderStatus> value) {
        this.senderStatus = value;
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
