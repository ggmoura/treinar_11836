
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de MobileScreenComponent complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MobileScreenComponent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileScreenComponentDisplay_ComponentDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileScreenComponentType_ComponentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileScreenComponent", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", propOrder = {
    "alias",
    "mobileScreenComponentDisplayComponentDisplay",
    "mobileScreenComponentTypeComponentType",
    "priority"
})
@XmlSeeAlso({
    MobileFormScreenComponent.class
})
public class MobileScreenComponent
    extends DomainEntity
{

    @XmlElementRef(name = "Alias", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alias;
    @XmlElementRef(name = "MobileScreenComponentDisplay_ComponentDisplay", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileScreenComponentDisplayComponentDisplay;
    @XmlElementRef(name = "MobileScreenComponentType_ComponentType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileScreenComponentTypeComponentType;
    @XmlElement(name = "Priority")
    protected Integer priority;

    /**
     * Obtém o valor da propriedade alias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlias() {
        return alias;
    }

    /**
     * Define o valor da propriedade alias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlias(JAXBElement<String> value) {
        this.alias = value;
    }

    /**
     * Obtém o valor da propriedade mobileScreenComponentDisplayComponentDisplay.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileScreenComponentDisplayComponentDisplay() {
        return mobileScreenComponentDisplayComponentDisplay;
    }

    /**
     * Define o valor da propriedade mobileScreenComponentDisplayComponentDisplay.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileScreenComponentDisplayComponentDisplay(JAXBElement<String> value) {
        this.mobileScreenComponentDisplayComponentDisplay = value;
    }

    /**
     * Obtém o valor da propriedade mobileScreenComponentTypeComponentType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileScreenComponentTypeComponentType() {
        return mobileScreenComponentTypeComponentType;
    }

    /**
     * Define o valor da propriedade mobileScreenComponentTypeComponentType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileScreenComponentTypeComponentType(JAXBElement<String> value) {
        this.mobileScreenComponentTypeComponentType = value;
    }

    /**
     * Obtém o valor da propriedade priority.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Define o valor da propriedade priority.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

}
