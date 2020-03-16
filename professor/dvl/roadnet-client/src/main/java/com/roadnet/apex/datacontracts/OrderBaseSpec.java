
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OrderBaseSpec complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderBaseSpec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *         &lt;element name="ForceBulkServiceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LineItemTypeDefault_LineItemPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LineItems" type="{http://roadnet.com/apex/DataContracts/}ArrayOfLineItem" minOccurs="0"/&gt;
 *         &lt;element name="OrderClassEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OrderInstance" type="{http://roadnet.com/apex/DataContracts/}DomainInstance" minOccurs="0"/&gt;
 *         &lt;element name="RegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Selector" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="TaskSpec" type="{http://roadnet.com/apex/DataContracts/}TaskSpec" minOccurs="0"/&gt;
 *         &lt;element name="UploadSelector" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="Urgency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UrgencyIncrease" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderBaseSpec", propOrder = {
    "customProperties",
    "forceBulkServiceTime",
    "identifier",
    "lineItemTypeDefaultLineItemPreference",
    "lineItems",
    "orderClassEntityKey",
    "orderInstance",
    "regionEntityKey",
    "selector",
    "taskSpec",
    "uploadSelector",
    "urgency",
    "urgencyIncrease"
})
@XmlSeeAlso({
    RecurringOrderSpec.class,
    OrderSpec.class
})
public class OrderBaseSpec
    extends DataTransferObject
{

    @XmlElementRef(name = "CustomProperties", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> customProperties;
    @XmlElement(name = "ForceBulkServiceTime")
    protected Boolean forceBulkServiceTime;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "LineItemTypeDefault_LineItemPreference", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineItemTypeDefaultLineItemPreference;
    @XmlElementRef(name = "LineItems", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLineItem> lineItems;
    @XmlElement(name = "OrderClassEntityKey")
    protected Long orderClassEntityKey;
    @XmlElementRef(name = "OrderInstance", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<DomainInstance> orderInstance;
    @XmlElement(name = "RegionEntityKey")
    protected Long regionEntityKey;
    @XmlElementRef(name = "Selector", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> selector;
    @XmlElementRef(name = "TaskSpec", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TaskSpec> taskSpec;
    @XmlElementRef(name = "UploadSelector", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> uploadSelector;
    @XmlElementRef(name = "Urgency", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> urgency;
    @XmlElementRef(name = "UrgencyIncrease", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> urgencyIncrease;

    /**
     * Obtém o valor da propriedade customProperties.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringanyType> getCustomProperties() {
        return customProperties;
    }

    /**
     * Define o valor da propriedade customProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public void setCustomProperties(JAXBElement<ArrayOfKeyValueOfstringanyType> value) {
        this.customProperties = value;
    }

    /**
     * Obtém o valor da propriedade forceBulkServiceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceBulkServiceTime() {
        return forceBulkServiceTime;
    }

    /**
     * Define o valor da propriedade forceBulkServiceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceBulkServiceTime(Boolean value) {
        this.forceBulkServiceTime = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade lineItemTypeDefaultLineItemPreference.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineItemTypeDefaultLineItemPreference() {
        return lineItemTypeDefaultLineItemPreference;
    }

    /**
     * Define o valor da propriedade lineItemTypeDefaultLineItemPreference.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineItemTypeDefaultLineItemPreference(JAXBElement<String> value) {
        this.lineItemTypeDefaultLineItemPreference = value;
    }

    /**
     * Obtém o valor da propriedade lineItems.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLineItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLineItem> getLineItems() {
        return lineItems;
    }

    /**
     * Define o valor da propriedade lineItems.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLineItem }{@code >}
     *     
     */
    public void setLineItems(JAXBElement<ArrayOfLineItem> value) {
        this.lineItems = value;
    }

    /**
     * Obtém o valor da propriedade orderClassEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderClassEntityKey() {
        return orderClassEntityKey;
    }

    /**
     * Define o valor da propriedade orderClassEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderClassEntityKey(Long value) {
        this.orderClassEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderInstance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}
     *     
     */
    public JAXBElement<DomainInstance> getOrderInstance() {
        return orderInstance;
    }

    /**
     * Define o valor da propriedade orderInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DomainInstance }{@code >}
     *     
     */
    public void setOrderInstance(JAXBElement<DomainInstance> value) {
        this.orderInstance = value;
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
     * Obtém o valor da propriedade selector.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSelector() {
        return selector;
    }

    /**
     * Define o valor da propriedade selector.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSelector(JAXBElement<Integer> value) {
        this.selector = value;
    }

    /**
     * Obtém o valor da propriedade taskSpec.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaskSpec }{@code >}
     *     
     */
    public JAXBElement<TaskSpec> getTaskSpec() {
        return taskSpec;
    }

    /**
     * Define o valor da propriedade taskSpec.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaskSpec }{@code >}
     *     
     */
    public void setTaskSpec(JAXBElement<TaskSpec> value) {
        this.taskSpec = value;
    }

    /**
     * Obtém o valor da propriedade uploadSelector.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUploadSelector() {
        return uploadSelector;
    }

    /**
     * Define o valor da propriedade uploadSelector.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUploadSelector(JAXBElement<Integer> value) {
        this.uploadSelector = value;
    }

    /**
     * Obtém o valor da propriedade urgency.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUrgency() {
        return urgency;
    }

    /**
     * Define o valor da propriedade urgency.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUrgency(JAXBElement<Integer> value) {
        this.urgency = value;
    }

    /**
     * Obtém o valor da propriedade urgencyIncrease.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUrgencyIncrease() {
        return urgencyIncrease;
    }

    /**
     * Define o valor da propriedade urgencyIncrease.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUrgencyIncrease(JAXBElement<Integer> value) {
        this.urgencyIncrease = value;
    }

}
