
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfAggregateRootEntity;
import com.roadnet.apex.datacontracts.SaveOptions;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="objects" type="{http://roadnet.com/apex/DataContracts/}ArrayOfAggregateRootEntity" minOccurs="0"/&gt;
 *         &lt;element name="options" type="{http://roadnet.com/apex/DataContracts/}SaveOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "objects",
    "options"
})
@XmlRootElement(name = "SaveAdmin")
public class SaveAdmin {

    @XmlElementRef(name = "objects", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAggregateRootEntity> objects;
    @XmlElementRef(name = "options", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<SaveOptions> options;

    /**
     * Obtém o valor da propriedade objects.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAggregateRootEntity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAggregateRootEntity> getObjects() {
        return objects;
    }

    /**
     * Define o valor da propriedade objects.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAggregateRootEntity }{@code >}
     *     
     */
    public void setObjects(JAXBElement<ArrayOfAggregateRootEntity> value) {
        this.objects = value;
    }

    /**
     * Obtém o valor da propriedade options.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SaveOptions }{@code >}
     *     
     */
    public JAXBElement<SaveOptions> getOptions() {
        return options;
    }

    /**
     * Define o valor da propriedade options.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SaveOptions }{@code >}
     *     
     */
    public void setOptions(JAXBElement<SaveOptions> value) {
        this.options = value;
    }

}
