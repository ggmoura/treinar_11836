
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de CorrespondencePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CorrespondencePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttachmentList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AttachmentListOptions" type="{http://roadnet.com/apex/DataContracts/}FileAttachmentPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="CorrespondencePriority_Priority" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Guid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDraft" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RecipientDescriptorList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RecipientDescriptorListOptions" type="{http://roadnet.com/apex/DataContracts/}CorrespondenceRecipientDescriptorPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="RecipientStatusList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RecipientStatusListOptions" type="{http://roadnet.com/apex/DataContracts/}CorrespondenceRecipientStatusPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="RegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SenderStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SenderStatusOptions" type="{http://roadnet.com/apex/DataContracts/}CorrespondenceSenderStatusPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="SentTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrespondencePropertyOptions", propOrder = {
    "attachmentList",
    "attachmentListOptions",
    "correspondencePriorityPriority",
    "guid",
    "isDraft",
    "recipientDescriptorList",
    "recipientDescriptorListOptions",
    "recipientStatusList",
    "recipientStatusListOptions",
    "regionEntityKey",
    "routeEntityKey",
    "senderStatus",
    "senderStatusOptions",
    "sentTime",
    "text"
})
public class CorrespondencePropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "AttachmentList")
    protected Boolean attachmentList;
    @XmlElementRef(name = "AttachmentListOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentPropertyOptions> attachmentListOptions;
    @XmlElement(name = "CorrespondencePriority_Priority")
    protected Boolean correspondencePriorityPriority;
    @XmlElement(name = "Guid")
    protected Boolean guid;
    @XmlElement(name = "IsDraft")
    protected Boolean isDraft;
    @XmlElement(name = "RecipientDescriptorList")
    protected Boolean recipientDescriptorList;
    @XmlElementRef(name = "RecipientDescriptorListOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<CorrespondenceRecipientDescriptorPropertyOptions> recipientDescriptorListOptions;
    @XmlElement(name = "RecipientStatusList")
    protected Boolean recipientStatusList;
    @XmlElementRef(name = "RecipientStatusListOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<CorrespondenceRecipientStatusPropertyOptions> recipientStatusListOptions;
    @XmlElement(name = "RegionEntityKey")
    protected Boolean regionEntityKey;
    @XmlElement(name = "RouteEntityKey")
    protected Boolean routeEntityKey;
    @XmlElement(name = "SenderStatus")
    protected Boolean senderStatus;
    @XmlElementRef(name = "SenderStatusOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<CorrespondenceSenderStatusPropertyOptions> senderStatusOptions;
    @XmlElement(name = "SentTime")
    protected Boolean sentTime;
    @XmlElement(name = "Text")
    protected Boolean text;

    /**
     * Obtém o valor da propriedade attachmentList.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttachmentList() {
        return attachmentList;
    }

    /**
     * Define o valor da propriedade attachmentList.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttachmentList(Boolean value) {
        this.attachmentList = value;
    }

    /**
     * Obtém o valor da propriedade attachmentListOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<FileAttachmentPropertyOptions> getAttachmentListOptions() {
        return attachmentListOptions;
    }

    /**
     * Define o valor da propriedade attachmentListOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentPropertyOptions }{@code >}
     *     
     */
    public void setAttachmentListOptions(JAXBElement<FileAttachmentPropertyOptions> value) {
        this.attachmentListOptions = value;
    }

    /**
     * Obtém o valor da propriedade correspondencePriorityPriority.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCorrespondencePriorityPriority() {
        return correspondencePriorityPriority;
    }

    /**
     * Define o valor da propriedade correspondencePriorityPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCorrespondencePriorityPriority(Boolean value) {
        this.correspondencePriorityPriority = value;
    }

    /**
     * Obtém o valor da propriedade guid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuid() {
        return guid;
    }

    /**
     * Define o valor da propriedade guid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuid(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isRecipientDescriptorList() {
        return recipientDescriptorList;
    }

    /**
     * Define o valor da propriedade recipientDescriptorList.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecipientDescriptorList(Boolean value) {
        this.recipientDescriptorList = value;
    }

    /**
     * Obtém o valor da propriedade recipientDescriptorListOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CorrespondenceRecipientDescriptorPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<CorrespondenceRecipientDescriptorPropertyOptions> getRecipientDescriptorListOptions() {
        return recipientDescriptorListOptions;
    }

    /**
     * Define o valor da propriedade recipientDescriptorListOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CorrespondenceRecipientDescriptorPropertyOptions }{@code >}
     *     
     */
    public void setRecipientDescriptorListOptions(JAXBElement<CorrespondenceRecipientDescriptorPropertyOptions> value) {
        this.recipientDescriptorListOptions = value;
    }

    /**
     * Obtém o valor da propriedade recipientStatusList.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecipientStatusList() {
        return recipientStatusList;
    }

    /**
     * Define o valor da propriedade recipientStatusList.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecipientStatusList(Boolean value) {
        this.recipientStatusList = value;
    }

    /**
     * Obtém o valor da propriedade recipientStatusListOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CorrespondenceRecipientStatusPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<CorrespondenceRecipientStatusPropertyOptions> getRecipientStatusListOptions() {
        return recipientStatusListOptions;
    }

    /**
     * Define o valor da propriedade recipientStatusListOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CorrespondenceRecipientStatusPropertyOptions }{@code >}
     *     
     */
    public void setRecipientStatusListOptions(JAXBElement<CorrespondenceRecipientStatusPropertyOptions> value) {
        this.recipientStatusListOptions = value;
    }

    /**
     * Obtém o valor da propriedade regionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegionEntityKey() {
        return regionEntityKey;
    }

    /**
     * Define o valor da propriedade regionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegionEntityKey(Boolean value) {
        this.regionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteEntityKey() {
        return routeEntityKey;
    }

    /**
     * Define o valor da propriedade routeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteEntityKey(Boolean value) {
        this.routeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade senderStatus.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSenderStatus() {
        return senderStatus;
    }

    /**
     * Define o valor da propriedade senderStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSenderStatus(Boolean value) {
        this.senderStatus = value;
    }

    /**
     * Obtém o valor da propriedade senderStatusOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CorrespondenceSenderStatusPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<CorrespondenceSenderStatusPropertyOptions> getSenderStatusOptions() {
        return senderStatusOptions;
    }

    /**
     * Define o valor da propriedade senderStatusOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CorrespondenceSenderStatusPropertyOptions }{@code >}
     *     
     */
    public void setSenderStatusOptions(JAXBElement<CorrespondenceSenderStatusPropertyOptions> value) {
        this.senderStatusOptions = value;
    }

    /**
     * Obtém o valor da propriedade sentTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSentTime() {
        return sentTime;
    }

    /**
     * Define o valor da propriedade sentTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSentTime(Boolean value) {
        this.sentTime = value;
    }

    /**
     * Obtém o valor da propriedade text.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isText() {
        return text;
    }

    /**
     * Define o valor da propriedade text.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setText(Boolean value) {
        this.text = value;
    }

}
