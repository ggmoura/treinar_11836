
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de DiscussionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DiscussionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthorEmailAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AuthorEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AuthorName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CanEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CommentCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CommentPropertyOptions" type="{http://roadnet.com/apex/DataContracts/}CommentPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CurrentUserLastReadCommentTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EntityPkey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EntityType_EntityType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastCommentAuthorEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastCommentTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscussionPropertyOptions", propOrder = {
    "authorEmailAddress",
    "authorEntityKey",
    "authorName",
    "canEdit",
    "commentCount",
    "commentPropertyOptions",
    "comments",
    "content",
    "currentUserLastReadCommentTime",
    "entityPkey",
    "entityTypeEntityType",
    "lastCommentAuthorEntityKey",
    "lastCommentTime"
})
public class DiscussionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "AuthorEmailAddress")
    protected Boolean authorEmailAddress;
    @XmlElement(name = "AuthorEntityKey")
    protected Boolean authorEntityKey;
    @XmlElement(name = "AuthorName")
    protected Boolean authorName;
    @XmlElement(name = "CanEdit")
    protected Boolean canEdit;
    @XmlElement(name = "CommentCount")
    protected Boolean commentCount;
    @XmlElementRef(name = "CommentPropertyOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<CommentPropertyOptions> commentPropertyOptions;
    @XmlElement(name = "Comments")
    protected Boolean comments;
    @XmlElement(name = "Content")
    protected Boolean content;
    @XmlElement(name = "CurrentUserLastReadCommentTime")
    protected Boolean currentUserLastReadCommentTime;
    @XmlElement(name = "EntityPkey")
    protected Boolean entityPkey;
    @XmlElement(name = "EntityType_EntityType")
    protected Boolean entityTypeEntityType;
    @XmlElement(name = "LastCommentAuthorEntityKey")
    protected Boolean lastCommentAuthorEntityKey;
    @XmlElement(name = "LastCommentTime")
    protected Boolean lastCommentTime;

    /**
     * Obtém o valor da propriedade authorEmailAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorEmailAddress() {
        return authorEmailAddress;
    }

    /**
     * Define o valor da propriedade authorEmailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorEmailAddress(Boolean value) {
        this.authorEmailAddress = value;
    }

    /**
     * Obtém o valor da propriedade authorEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorEntityKey() {
        return authorEntityKey;
    }

    /**
     * Define o valor da propriedade authorEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorEntityKey(Boolean value) {
        this.authorEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade authorName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorName() {
        return authorName;
    }

    /**
     * Define o valor da propriedade authorName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorName(Boolean value) {
        this.authorName = value;
    }

    /**
     * Obtém o valor da propriedade canEdit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanEdit() {
        return canEdit;
    }

    /**
     * Define o valor da propriedade canEdit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanEdit(Boolean value) {
        this.canEdit = value;
    }

    /**
     * Obtém o valor da propriedade commentCount.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommentCount() {
        return commentCount;
    }

    /**
     * Define o valor da propriedade commentCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommentCount(Boolean value) {
        this.commentCount = value;
    }

    /**
     * Obtém o valor da propriedade commentPropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CommentPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<CommentPropertyOptions> getCommentPropertyOptions() {
        return commentPropertyOptions;
    }

    /**
     * Define o valor da propriedade commentPropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CommentPropertyOptions }{@code >}
     *     
     */
    public void setCommentPropertyOptions(JAXBElement<CommentPropertyOptions> value) {
        this.commentPropertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade comments.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComments() {
        return comments;
    }

    /**
     * Define o valor da propriedade comments.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComments(Boolean value) {
        this.comments = value;
    }

    /**
     * Obtém o valor da propriedade content.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContent() {
        return content;
    }

    /**
     * Define o valor da propriedade content.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContent(Boolean value) {
        this.content = value;
    }

    /**
     * Obtém o valor da propriedade currentUserLastReadCommentTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentUserLastReadCommentTime() {
        return currentUserLastReadCommentTime;
    }

    /**
     * Define o valor da propriedade currentUserLastReadCommentTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentUserLastReadCommentTime(Boolean value) {
        this.currentUserLastReadCommentTime = value;
    }

    /**
     * Obtém o valor da propriedade entityPkey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntityPkey() {
        return entityPkey;
    }

    /**
     * Define o valor da propriedade entityPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntityPkey(Boolean value) {
        this.entityPkey = value;
    }

    /**
     * Obtém o valor da propriedade entityTypeEntityType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntityTypeEntityType() {
        return entityTypeEntityType;
    }

    /**
     * Define o valor da propriedade entityTypeEntityType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntityTypeEntityType(Boolean value) {
        this.entityTypeEntityType = value;
    }

    /**
     * Obtém o valor da propriedade lastCommentAuthorEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastCommentAuthorEntityKey() {
        return lastCommentAuthorEntityKey;
    }

    /**
     * Define o valor da propriedade lastCommentAuthorEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastCommentAuthorEntityKey(Boolean value) {
        this.lastCommentAuthorEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade lastCommentTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastCommentTime() {
        return lastCommentTime;
    }

    /**
     * Define o valor da propriedade lastCommentTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastCommentTime(Boolean value) {
        this.lastCommentTime = value;
    }

}
