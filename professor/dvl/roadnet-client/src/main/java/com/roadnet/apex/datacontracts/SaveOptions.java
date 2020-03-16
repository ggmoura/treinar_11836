
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyInclusionMode;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de SaveOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SaveOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IgnoreEntityVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InclusionMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyInclusionMode" minOccurs="0"/&gt;
 *         &lt;element name="PropertyOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ReturnInclusionMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyInclusionMode" minOccurs="0"/&gt;
 *         &lt;element name="ReturnPropertyOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ReturnSavedItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveOptions", propOrder = {
    "ignoreEntityVersion",
    "inclusionMode",
    "propertyOptions",
    "returnInclusionMode",
    "returnPropertyOptions",
    "returnSavedItems"
})
public class SaveOptions {

    @XmlElement(name = "IgnoreEntityVersion")
    protected Boolean ignoreEntityVersion;
    @XmlElement(name = "InclusionMode")
    @XmlSchemaType(name = "string")
    protected PropertyInclusionMode inclusionMode;
    @XmlElementRef(name = "PropertyOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyOptions> propertyOptions;
    @XmlElement(name = "ReturnInclusionMode")
    @XmlSchemaType(name = "string")
    protected PropertyInclusionMode returnInclusionMode;
    @XmlElementRef(name = "ReturnPropertyOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyOptions> returnPropertyOptions;
    @XmlElement(name = "ReturnSavedItems")
    protected Boolean returnSavedItems;

    /**
     * Obtém o valor da propriedade ignoreEntityVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreEntityVersion() {
        return ignoreEntityVersion;
    }

    /**
     * Define o valor da propriedade ignoreEntityVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreEntityVersion(Boolean value) {
        this.ignoreEntityVersion = value;
    }

    /**
     * Obtém o valor da propriedade inclusionMode.
     * 
     * @return
     *     possible object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public PropertyInclusionMode getInclusionMode() {
        return inclusionMode;
    }

    /**
     * Define o valor da propriedade inclusionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public void setInclusionMode(PropertyInclusionMode value) {
        this.inclusionMode = value;
    }

    /**
     * Obtém o valor da propriedade propertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyOptions }{@code >}
     *     
     */
    public JAXBElement<PropertyOptions> getPropertyOptions() {
        return propertyOptions;
    }

    /**
     * Define o valor da propriedade propertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyOptions }{@code >}
     *     
     */
    public void setPropertyOptions(JAXBElement<PropertyOptions> value) {
        this.propertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade returnInclusionMode.
     * 
     * @return
     *     possible object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public PropertyInclusionMode getReturnInclusionMode() {
        return returnInclusionMode;
    }

    /**
     * Define o valor da propriedade returnInclusionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public void setReturnInclusionMode(PropertyInclusionMode value) {
        this.returnInclusionMode = value;
    }

    /**
     * Obtém o valor da propriedade returnPropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyOptions }{@code >}
     *     
     */
    public JAXBElement<PropertyOptions> getReturnPropertyOptions() {
        return returnPropertyOptions;
    }

    /**
     * Define o valor da propriedade returnPropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyOptions }{@code >}
     *     
     */
    public void setReturnPropertyOptions(JAXBElement<PropertyOptions> value) {
        this.returnPropertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade returnSavedItems.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnSavedItems() {
        return returnSavedItems;
    }

    /**
     * Define o valor da propriedade returnSavedItems.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnSavedItems(Boolean value) {
        this.returnSavedItems = value;
    }

}
