
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de CreateCorrespondenceForWorkerArgs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CreateCorrespondenceForWorkerArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Attachments" type="{http://roadnet.com/apex/DataContracts/}ArrayOfCorrespondenceAttachment" minOccurs="0"/&gt;
 *         &lt;element name="CorrespondencePriority_Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Guid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="RegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateCorrespondenceForWorkerArgs", propOrder = {
    "attachments",
    "correspondencePriorityPriority",
    "guid",
    "regionEntityKey",
    "routeEntityKey",
    "sentTime",
    "text",
    "workerEntityKey"
})
public class CreateCorrespondenceForWorkerArgs {

    @XmlElementRef(name = "Attachments", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCorrespondenceAttachment> attachments;
    @XmlElementRef(name = "CorrespondencePriority_Priority", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correspondencePriorityPriority;
    @XmlElement(name = "Guid")
    protected String guid;
    @XmlElement(name = "RegionEntityKey")
    protected Long regionEntityKey;
    @XmlElementRef(name = "RouteEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> routeEntityKey;
    @XmlElement(name = "SentTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sentTime;
    @XmlElementRef(name = "Text", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> text;
    @XmlElement(name = "WorkerEntityKey")
    protected Long workerEntityKey;

    /**
     * Obtém o valor da propriedade attachments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCorrespondenceAttachment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCorrespondenceAttachment> getAttachments() {
        return attachments;
    }

    /**
     * Define o valor da propriedade attachments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCorrespondenceAttachment }{@code >}
     *     
     */
    public void setAttachments(JAXBElement<ArrayOfCorrespondenceAttachment> value) {
        this.attachments = value;
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
     * Obtém o valor da propriedade sentTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentTime() {
        return sentTime;
    }

    /**
     * Define o valor da propriedade sentTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSentTime(XMLGregorianCalendar value) {
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

    /**
     * Obtém o valor da propriedade workerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkerEntityKey() {
        return workerEntityKey;
    }

    /**
     * Define o valor da propriedade workerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkerEntityKey(Long value) {
        this.workerEntityKey = value;
    }

}
