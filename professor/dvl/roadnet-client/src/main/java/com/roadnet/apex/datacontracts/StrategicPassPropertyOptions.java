
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de StrategicPassPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StrategicPassPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}PassPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StrategicAttributes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StrategicAttributesOptions" type="{http://roadnet.com/apex/DataContracts/}StrategicPassAttributesPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategicPassPropertyOptions", propOrder = {
    "strategicAttributes",
    "strategicAttributesOptions"
})
@XmlSeeAlso({
    AssignDaysPassPropertyOptions.class,
    CreateTerritoriesPassPropertyOptions.class
})
public class StrategicPassPropertyOptions
    extends PassPropertyOptions
{

    @XmlElement(name = "StrategicAttributes")
    protected Boolean strategicAttributes;
    @XmlElementRef(name = "StrategicAttributesOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<StrategicPassAttributesPropertyOptions> strategicAttributesOptions;

    /**
     * Obtém o valor da propriedade strategicAttributes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStrategicAttributes() {
        return strategicAttributes;
    }

    /**
     * Define o valor da propriedade strategicAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrategicAttributes(Boolean value) {
        this.strategicAttributes = value;
    }

    /**
     * Obtém o valor da propriedade strategicAttributesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StrategicPassAttributesPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<StrategicPassAttributesPropertyOptions> getStrategicAttributesOptions() {
        return strategicAttributesOptions;
    }

    /**
     * Define o valor da propriedade strategicAttributesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StrategicPassAttributesPropertyOptions }{@code >}
     *     
     */
    public void setStrategicAttributesOptions(JAXBElement<StrategicPassAttributesPropertyOptions> value) {
        this.strategicAttributesOptions = value;
    }

}
