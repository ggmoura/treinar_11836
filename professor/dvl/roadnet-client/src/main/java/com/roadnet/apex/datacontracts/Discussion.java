
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Discussion complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Discussion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthorEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthorEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AuthorName" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="CanEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CommentCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://roadnet.com/apex/DataContracts/}ArrayOfComment" minOccurs="0"/&gt;
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentUserLastReadCommentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EntityPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EntityType_EntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastCommentAuthorEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LastCommentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Discussion", propOrder = {
    "authorEmailAddress",
    "authorEntityKey",
    "authorName",
    "canEdit",
    "commentCount",
    "comments",
    "content",
    "currentUserLastReadCommentTime",
    "entityPkey",
    "entityTypeEntityType",
    "lastCommentAuthorEntityKey",
    "lastCommentTime"
})
public class Discussion
    extends AggregateRootEntity
{

    @XmlElementRef(name = "AuthorEmailAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authorEmailAddress;
    @XmlElement(name = "AuthorEntityKey")
    protected Long authorEntityKey;
    @XmlElementRef(name = "AuthorName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> authorName;
    @XmlElement(name = "CanEdit")
    protected Boolean canEdit;
    @XmlElement(name = "CommentCount")
    protected Integer commentCount;
    @XmlElementRef(name = "Comments", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfComment> comments;
    @XmlElementRef(name = "Content", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> content;
    @XmlElementRef(name = "CurrentUserLastReadCommentTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> currentUserLastReadCommentTime;
    @XmlElementRef(name = "EntityPkey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> entityPkey;
    @XmlElementRef(name = "EntityType_EntityType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityTypeEntityType;
    @XmlElementRef(name = "LastCommentAuthorEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> lastCommentAuthorEntityKey;
    @XmlElementRef(name = "LastCommentTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastCommentTime;

    /**
     * Obtém o valor da propriedade authorEmailAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthorEmailAddress() {
        return authorEmailAddress;
    }

    /**
     * Define o valor da propriedade authorEmailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthorEmailAddress(JAXBElement<String> value) {
        this.authorEmailAddress = value;
    }

    /**
     * Obtém o valor da propriedade authorEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuthorEntityKey() {
        return authorEntityKey;
    }

    /**
     * Define o valor da propriedade authorEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuthorEntityKey(Long value) {
        this.authorEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade authorName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getAuthorName() {
        return authorName;
    }

    /**
     * Define o valor da propriedade authorName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setAuthorName(JAXBElement<PersonName> value) {
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
     *     {@link Integer }
     *     
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * Define o valor da propriedade commentCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommentCount(Integer value) {
        this.commentCount = value;
    }

    /**
     * Obtém o valor da propriedade comments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfComment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfComment> getComments() {
        return comments;
    }

    /**
     * Define o valor da propriedade comments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfComment }{@code >}
     *     
     */
    public void setComments(JAXBElement<ArrayOfComment> value) {
        this.comments = value;
    }

    /**
     * Obtém o valor da propriedade content.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContent() {
        return content;
    }

    /**
     * Define o valor da propriedade content.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContent(JAXBElement<String> value) {
        this.content = value;
    }

    /**
     * Obtém o valor da propriedade currentUserLastReadCommentTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCurrentUserLastReadCommentTime() {
        return currentUserLastReadCommentTime;
    }

    /**
     * Define o valor da propriedade currentUserLastReadCommentTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCurrentUserLastReadCommentTime(JAXBElement<XMLGregorianCalendar> value) {
        this.currentUserLastReadCommentTime = value;
    }

    /**
     * Obtém o valor da propriedade entityPkey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEntityPkey() {
        return entityPkey;
    }

    /**
     * Define o valor da propriedade entityPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEntityPkey(JAXBElement<Long> value) {
        this.entityPkey = value;
    }

    /**
     * Obtém o valor da propriedade entityTypeEntityType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityTypeEntityType() {
        return entityTypeEntityType;
    }

    /**
     * Define o valor da propriedade entityTypeEntityType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityTypeEntityType(JAXBElement<String> value) {
        this.entityTypeEntityType = value;
    }

    /**
     * Obtém o valor da propriedade lastCommentAuthorEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLastCommentAuthorEntityKey() {
        return lastCommentAuthorEntityKey;
    }

    /**
     * Define o valor da propriedade lastCommentAuthorEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLastCommentAuthorEntityKey(JAXBElement<Long> value) {
        this.lastCommentAuthorEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade lastCommentTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastCommentTime() {
        return lastCommentTime;
    }

    /**
     * Define o valor da propriedade lastCommentTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastCommentTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastCommentTime = value;
    }

}
