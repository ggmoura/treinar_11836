
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import com.roadnet.apex.datacontracts.CorrespondencePriority;


/**
 * <p>Classe Java de SaveCorrespondenceParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SaveCorrespondenceParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DepotRecipients" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MailingListRecipients" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://roadnet.com/apex/DataContracts/}CorrespondencePriority" minOccurs="0"/&gt;
 *         &lt;element name="RegionRecipients" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="RouteRecipients" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="Send" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SenderBusinessUnitEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SenderUserEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkerRecipients" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveCorrespondenceParameters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", propOrder = {
    "activeOnly",
    "depotRecipients",
    "entityKey",
    "mailingListRecipients",
    "priority",
    "regionRecipients",
    "routeRecipients",
    "send",
    "senderBusinessUnitEntityKey",
    "senderUserEntityKey",
    "text",
    "workerRecipients"
})
public class SaveCorrespondenceParameters {

    @XmlElement(name = "ActiveOnly")
    protected Boolean activeOnly;
    @XmlElementRef(name = "DepotRecipients", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> depotRecipients;
    @XmlElementRef(name = "EntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> entityKey;
    @XmlElementRef(name = "MailingListRecipients", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> mailingListRecipients;
    @XmlElement(name = "Priority")
    @XmlSchemaType(name = "string")
    protected CorrespondencePriority priority;
    @XmlElementRef(name = "RegionRecipients", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> regionRecipients;
    @XmlElementRef(name = "RouteRecipients", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> routeRecipients;
    @XmlElement(name = "Send")
    protected Boolean send;
    @XmlElement(name = "SenderBusinessUnitEntityKey")
    protected Long senderBusinessUnitEntityKey;
    @XmlElement(name = "SenderUserEntityKey")
    protected Long senderUserEntityKey;
    @XmlElementRef(name = "Text", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", type = JAXBElement.class, required = false)
    protected JAXBElement<String> text;
    @XmlElementRef(name = "WorkerRecipients", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> workerRecipients;

    /**
     * Obtém o valor da propriedade activeOnly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveOnly() {
        return activeOnly;
    }

    /**
     * Define o valor da propriedade activeOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveOnly(Boolean value) {
        this.activeOnly = value;
    }

    /**
     * Obtém o valor da propriedade depotRecipients.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getDepotRecipients() {
        return depotRecipients;
    }

    /**
     * Define o valor da propriedade depotRecipients.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setDepotRecipients(JAXBElement<ArrayOflong> value) {
        this.depotRecipients = value;
    }

    /**
     * Obtém o valor da propriedade entityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEntityKey() {
        return entityKey;
    }

    /**
     * Define o valor da propriedade entityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEntityKey(JAXBElement<Long> value) {
        this.entityKey = value;
    }

    /**
     * Obtém o valor da propriedade mailingListRecipients.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getMailingListRecipients() {
        return mailingListRecipients;
    }

    /**
     * Define o valor da propriedade mailingListRecipients.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setMailingListRecipients(JAXBElement<ArrayOflong> value) {
        this.mailingListRecipients = value;
    }

    /**
     * Obtém o valor da propriedade priority.
     * 
     * @return
     *     possible object is
     *     {@link CorrespondencePriority }
     *     
     */
    public CorrespondencePriority getPriority() {
        return priority;
    }

    /**
     * Define o valor da propriedade priority.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrespondencePriority }
     *     
     */
    public void setPriority(CorrespondencePriority value) {
        this.priority = value;
    }

    /**
     * Obtém o valor da propriedade regionRecipients.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getRegionRecipients() {
        return regionRecipients;
    }

    /**
     * Define o valor da propriedade regionRecipients.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setRegionRecipients(JAXBElement<ArrayOflong> value) {
        this.regionRecipients = value;
    }

    /**
     * Obtém o valor da propriedade routeRecipients.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getRouteRecipients() {
        return routeRecipients;
    }

    /**
     * Define o valor da propriedade routeRecipients.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setRouteRecipients(JAXBElement<ArrayOflong> value) {
        this.routeRecipients = value;
    }

    /**
     * Obtém o valor da propriedade send.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSend() {
        return send;
    }

    /**
     * Define o valor da propriedade send.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSend(Boolean value) {
        this.send = value;
    }

    /**
     * Obtém o valor da propriedade senderBusinessUnitEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSenderBusinessUnitEntityKey() {
        return senderBusinessUnitEntityKey;
    }

    /**
     * Define o valor da propriedade senderBusinessUnitEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSenderBusinessUnitEntityKey(Long value) {
        this.senderBusinessUnitEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade senderUserEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSenderUserEntityKey() {
        return senderUserEntityKey;
    }

    /**
     * Define o valor da propriedade senderUserEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSenderUserEntityKey(Long value) {
        this.senderUserEntityKey = value;
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
     * Obtém o valor da propriedade workerRecipients.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getWorkerRecipients() {
        return workerRecipients;
    }

    /**
     * Define o valor da propriedade workerRecipients.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setWorkerRecipients(JAXBElement<ArrayOflong> value) {
        this.workerRecipients = value;
    }

}
