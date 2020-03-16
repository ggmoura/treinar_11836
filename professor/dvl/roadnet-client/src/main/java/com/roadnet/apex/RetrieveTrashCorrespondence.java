
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.CorrespondencePropertyOptions;
import com.roadnet.apex.datacontracts.RetrieveCorrespondenceArgs;


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
 *         &lt;element name="propertyOptions" type="{http://roadnet.com/apex/DataContracts/}CorrespondencePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="args" type="{http://roadnet.com/apex/DataContracts/}RetrieveCorrespondenceArgs" minOccurs="0"/&gt;
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
    "propertyOptions",
    "args"
})
@XmlRootElement(name = "RetrieveTrashCorrespondence")
public class RetrieveTrashCorrespondence {

    @XmlElementRef(name = "propertyOptions", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<CorrespondencePropertyOptions> propertyOptions;
    @XmlElementRef(name = "args", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RetrieveCorrespondenceArgs> args;

    /**
     * Obtém o valor da propriedade propertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CorrespondencePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<CorrespondencePropertyOptions> getPropertyOptions() {
        return propertyOptions;
    }

    /**
     * Define o valor da propriedade propertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CorrespondencePropertyOptions }{@code >}
     *     
     */
    public void setPropertyOptions(JAXBElement<CorrespondencePropertyOptions> value) {
        this.propertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade args.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveCorrespondenceArgs }{@code >}
     *     
     */
    public JAXBElement<RetrieveCorrespondenceArgs> getArgs() {
        return args;
    }

    /**
     * Define o valor da propriedade args.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveCorrespondenceArgs }{@code >}
     *     
     */
    public void setArgs(JAXBElement<RetrieveCorrespondenceArgs> value) {
        this.args = value;
    }

}
