
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NotificationRecipientPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NotificationRecipientPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BusinessUnitBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ListOfNotificationSubscriptionType_NotificationSubscriptionTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "NotificationRecipientPropertyOptions", propOrder = {
    "description",
    "identifier",
    "listOfNotificationSubscriptionTypeNotificationSubscriptionTypes",
    "loadedRoutesOnly",
    "systemGenerated"
})
public class NotificationRecipientPropertyOptions
    extends BusinessUnitBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "ListOfNotificationSubscriptionType_NotificationSubscriptionTypes")
    protected Boolean listOfNotificationSubscriptionTypeNotificationSubscriptionTypes;
    @XmlElement(name = "LoadedRoutesOnly")
    protected Boolean loadedRoutesOnly;
    @XmlElement(name = "SystemGenerated")
    protected Boolean systemGenerated;

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifier(Boolean value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade listOfNotificationSubscriptionTypeNotificationSubscriptionTypes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isListOfNotificationSubscriptionTypeNotificationSubscriptionTypes() {
        return listOfNotificationSubscriptionTypeNotificationSubscriptionTypes;
    }

    /**
     * Define o valor da propriedade listOfNotificationSubscriptionTypeNotificationSubscriptionTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setListOfNotificationSubscriptionTypeNotificationSubscriptionTypes(Boolean value) {
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
