
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Comment complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Comment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthorEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthorEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AuthorName" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="CanEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscussionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Comment", propOrder = {
    "authorEmailAddress",
    "authorEntityKey",
    "authorName",
    "canEdit",
    "content",
    "discussionEntityKey"
})
public class Comment
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
    @XmlElementRef(name = "Content", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> content;
    @XmlElement(name = "DiscussionEntityKey")
    protected Long discussionEntityKey;

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
     * Obtém o valor da propriedade discussionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiscussionEntityKey() {
        return discussionEntityKey;
    }

    /**
     * Define o valor da propriedade discussionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiscussionEntityKey(Long value) {
        this.discussionEntityKey = value;
    }

}
