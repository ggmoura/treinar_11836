
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TimeWindowTypePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TimeWindowTypePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseTimes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpenCloseTimesOptions" type="{http://roadnet.com/apex/DataContracts/}OrderClassifiedOpenCloseDetailPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindows" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServiceWindowsOptions" type="{http://roadnet.com/apex/DataContracts/}OrderClassifiedServiceWindowDetailPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeWindowTypePropertyOptions", propOrder = {
    "color",
    "description",
    "identifier",
    "isDeleted",
    "openCloseTimes",
    "openCloseTimesOptions",
    "serviceWindows",
    "serviceWindowsOptions"
})
public class TimeWindowTypePropertyOptions
    extends VisibleInMultipleRegionsAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "Color")
    protected Boolean color;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "OpenCloseTimes")
    protected Boolean openCloseTimes;
    @XmlElementRef(name = "OpenCloseTimesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderClassifiedOpenCloseDetailPropertyOptions> openCloseTimesOptions;
    @XmlElement(name = "ServiceWindows")
    protected Boolean serviceWindows;
    @XmlElementRef(name = "ServiceWindowsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderClassifiedServiceWindowDetailPropertyOptions> serviceWindowsOptions;

    /**
     * Obtém o valor da propriedade color.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColor() {
        return color;
    }

    /**
     * Define o valor da propriedade color.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColor(Boolean value) {
        this.color = value;
    }

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
     * Obtém o valor da propriedade isDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Define o valor da propriedade isDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Obtém o valor da propriedade openCloseTimes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenCloseTimes() {
        return openCloseTimes;
    }

    /**
     * Define o valor da propriedade openCloseTimes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenCloseTimes(Boolean value) {
        this.openCloseTimes = value;
    }

    /**
     * Obtém o valor da propriedade openCloseTimesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderClassifiedOpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OrderClassifiedOpenCloseDetailPropertyOptions> getOpenCloseTimesOptions() {
        return openCloseTimesOptions;
    }

    /**
     * Define o valor da propriedade openCloseTimesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderClassifiedOpenCloseDetailPropertyOptions }{@code >}
     *     
     */
    public void setOpenCloseTimesOptions(JAXBElement<OrderClassifiedOpenCloseDetailPropertyOptions> value) {
        this.openCloseTimesOptions = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindows.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceWindows() {
        return serviceWindows;
    }

    /**
     * Define o valor da propriedade serviceWindows.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceWindows(Boolean value) {
        this.serviceWindows = value;
    }

    /**
     * Obtém o valor da propriedade serviceWindowsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderClassifiedServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OrderClassifiedServiceWindowDetailPropertyOptions> getServiceWindowsOptions() {
        return serviceWindowsOptions;
    }

    /**
     * Define o valor da propriedade serviceWindowsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderClassifiedServiceWindowDetailPropertyOptions }{@code >}
     *     
     */
    public void setServiceWindowsOptions(JAXBElement<OrderClassifiedServiceWindowDetailPropertyOptions> value) {
        this.serviceWindowsOptions = value;
    }

}
