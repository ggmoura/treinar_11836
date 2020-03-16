
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DailyPassTemplatePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DailyPassTemplatePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}PassTemplatePropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DailyAttributes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DailyAttributesOptions" type="{http://roadnet.com/apex/DataContracts/}DailyPassAttributesPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyPassTemplatePropertyOptions", propOrder = {
    "dailyAttributes",
    "dailyAttributesOptions"
})
public class DailyPassTemplatePropertyOptions
    extends PassTemplatePropertyOptions
{

    @XmlElement(name = "DailyAttributes")
    protected Boolean dailyAttributes;
    @XmlElementRef(name = "DailyAttributesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<DailyPassAttributesPropertyOptions> dailyAttributesOptions;

    /**
     * Obtém o valor da propriedade dailyAttributes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDailyAttributes() {
        return dailyAttributes;
    }

    /**
     * Define o valor da propriedade dailyAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDailyAttributes(Boolean value) {
        this.dailyAttributes = value;
    }

    /**
     * Obtém o valor da propriedade dailyAttributesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DailyPassAttributesPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<DailyPassAttributesPropertyOptions> getDailyAttributesOptions() {
        return dailyAttributesOptions;
    }

    /**
     * Define o valor da propriedade dailyAttributesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DailyPassAttributesPropertyOptions }{@code >}
     *     
     */
    public void setDailyAttributesOptions(JAXBElement<DailyPassAttributesPropertyOptions> value) {
        this.dailyAttributesOptions = value;
    }

}
