
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Classe Java de NotificationRecipient complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NotificationRecipient"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BusinessUnitBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListOfNotificationSubscriptionType_NotificationSubscriptionTypes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="LoadedRoutesOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SystemGenerated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationRecipient", propOrder = {
    "description",
    "identifier",
    "listOfNotificationSubscriptionTypeNotificationSubscriptionTypes",
    "loadedRoutesOnly",
    "systemGenerated"
})
public class NotificationRecipient
    extends BusinessUnitBasedAggregateRootEntity
{

    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "ListOfNotificationSubscriptionType_NotificationSubscriptionTypes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> listOfNotificationSubscriptionTypeNotificationSubscriptionTypes;
    @XmlElement(name = "LoadedRoutesOnly")
    protected Boolean loadedRoutesOnly;
    @XmlElement(name = "SystemGenerated")
    protected Boolean systemGenerated;

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
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
     * Obtém o valor da propriedade listOfNotificationSubscriptionTypeNotificationSubscriptionTypes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getListOfNotificationSubscriptionTypeNotificationSubscriptionTypes() {
        return listOfNotificationSubscriptionTypeNotificationSubscriptionTypes;
    }

    /**
     * Define o valor da propriedade listOfNotificationSubscriptionTypeNotificationSubscriptionTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setListOfNotificationSubscriptionTypeNotificationSubscriptionTypes(JAXBElement<ArrayOfstring> value) {
        this.listOfNotificationSubscriptionTypeNotificationSubscriptionTypes = value;
    }

    /**
     * Obtém o valor da propriedade loadedRoutesOnly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoadedRoutesOnly() {
        return loadedRoutesOnly;
    }

    /**
     * Define o valor da propriedade loadedRoutesOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoadedRoutesOnly(Boolean value) {
        this.loadedRoutesOnly = value;
    }

    /**
     * Obtém o valor da propriedade systemGenerated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSystemGenerated() {
        return systemGenerated;
    }

    /**
     * Define o valor da propriedade systemGenerated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSystemGenerated(Boolean value) {
        this.systemGenerated = value;
    }

}
