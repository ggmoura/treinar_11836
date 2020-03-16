
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RetrievePositionTextOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrievePositionTextOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BuilderOptions" type="{http://roadnet.com/apex/DataContracts/}PositionTextBuilderOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievePositionTextOptions", propOrder = {
    "builderOptions"
})
public class RetrievePositionTextOptions {

    @XmlElementRef(name = "BuilderOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PositionTextBuilderOptions> builderOptions;

    /**
     * Obtém o valor da propriedade builderOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PositionTextBuilderOptions }{@code >}
     *     
     */
    public JAXBElement<PositionTextBuilderOptions> getBuilderOptions() {
        return builderOptions;
    }

    /**
     * Define o valor da propriedade builderOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PositionTextBuilderOptions }{@code >}
     *     
     */
    public void setBuilderOptions(JAXBElement<PositionTextBuilderOptions> value) {
        this.builderOptions = value;
    }

}
