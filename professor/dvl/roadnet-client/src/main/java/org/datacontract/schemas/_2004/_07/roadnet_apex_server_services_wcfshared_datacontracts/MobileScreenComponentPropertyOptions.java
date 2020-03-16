
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de MobileScreenComponentPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MobileScreenComponentPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomFormDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomFormEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomFormIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileScreenComponentDisplay_ComponentDisplay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MobileScreenComponentType_ComponentType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileScreenComponentPropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", propOrder = {
    "alias",
    "customFormDescription",
    "customFormEntityKey",
    "customFormIdentifier",
    "mobileScreenComponentDisplayComponentDisplay",
    "mobileScreenComponentTypeComponentType",
    "priority"
})
public class MobileScreenComponentPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "Alias")
    protected Boolean alias;
    @XmlElement(name = "CustomFormDescription")
    protected Boolean customFormDescription;
    @XmlElement(name = "CustomFormEntityKey")
    protected Boolean customFormEntityKey;
    @XmlElement(name = "CustomFormIdentifier")
    protected Boolean customFormIdentifier;
    @XmlElement(name = "MobileScreenComponentDisplay_ComponentDisplay")
    protected Boolean mobileScreenComponentDisplayComponentDisplay;
    @XmlElement(name = "MobileScreenComponentType_ComponentType")
    protected Boolean mobileScreenComponentTypeComponentType;
    @XmlElement(name = "Priority")
    protected Boolean priority;

    /**
     * Obtém o valor da propriedade alias.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlias() {
        return alias;
    }

    /**
     * Define o valor da propriedade alias.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlias(Boolean value) {
        this.alias = value;
    }

    /**
     * Obtém o valor da propriedade customFormDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomFormDescription() {
        return customFormDescription;
    }

    /**
     * Define o valor da propriedade customFormDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomFormDescription(Boolean value) {
        this.customFormDescription = value;
    }

    /**
     * Obtém o valor da propriedade customFormEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomFormEntityKey() {
        return customFormEntityKey;
    }

    /**
     * Define o valor da propriedade customFormEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomFormEntityKey(Boolean value) {
        this.customFormEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade customFormIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomFormIdentifier() {
        return customFormIdentifier;
    }

    /**
     * Define o valor da propriedade customFormIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomFormIdentifier(Boolean value) {
        this.customFormIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade mobileScreenComponentDisplayComponentDisplay.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileScreenComponentDisplayComponentDisplay() {
        return mobileScreenComponentDisplayComponentDisplay;
    }

    /**
     * Define o valor da propriedade mobileScreenComponentDisplayComponentDisplay.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileScreenComponentDisplayComponentDisplay(Boolean value) {
        this.mobileScreenComponentDisplayComponentDisplay = value;
    }

    /**
     * Obtém o valor da propriedade mobileScreenComponentTypeComponentType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileScreenComponentTypeComponentType() {
        return mobileScreenComponentTypeComponentType;
    }

    /**
     * Define o valor da propriedade mobileScreenComponentTypeComponentType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileScreenComponentTypeComponentType(Boolean value) {
        this.mobileScreenComponentTypeComponentType = value;
    }

    /**
     * Obtém o valor da propriedade priority.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriority() {
        return priority;
    }

    /**
     * Define o valor da propriedade priority.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriority(Boolean value) {
        this.priority = value;
    }

}
