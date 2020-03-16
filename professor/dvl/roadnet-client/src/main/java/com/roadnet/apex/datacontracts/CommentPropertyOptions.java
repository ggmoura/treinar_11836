
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de CommentPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CommentPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthorEmailAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AuthorEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AuthorName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AuthorOptions" type="{http://roadnet.com/apex/DataContracts/}UserPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="CanEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DiscussionEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommentPropertyOptions", propOrder = {
    "authorEmailAddress",
    "authorEntityKey",
    "authorName",
    "authorOptions",
    "canEdit",
    "content",
    "discussionEntityKey"
})
public class CommentPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "AuthorEmailAddress")
    protected Boolean authorEmailAddress;
    @XmlElement(name = "AuthorEntityKey")
    protected Boolean authorEntityKey;
    @XmlElement(name = "AuthorName")
    protected Boolean authorName;
    @XmlElementRef(name = "AuthorOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<UserPropertyOptions> authorOptions;
    @XmlElement(name = "CanEdit")
    protected Boolean canEdit;
    @XmlElement(name = "Content")
    protected Boolean content;
    @XmlElement(name = "DiscussionEntityKey")
    protected Boolean discussionEntityKey;

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
     * Obtém o valor da propriedade authorOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<UserPropertyOptions> getAuthorOptions() {
        return authorOptions;
    }

    /**
     * Define o valor da propriedade authorOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserPropertyOptions }{@code >}
     *     
     */
    public void setAuthorOptions(JAXBElement<UserPropertyOptions> value) {
        this.authorOptions = value;
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
     * Obtém o valor da propriedade discussionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscussionEntityKey() {
        return discussionEntityKey;
    }

    /**
     * Define o valor da propriedade discussionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscussionEntityKey(Boolean value) {
        this.discussionEntityKey = value;
    }

}
