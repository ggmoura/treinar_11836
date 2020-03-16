
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de QuantityReasonCode complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="QuantityReasonCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}ReasonCodeBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuantityType_QuantityTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityReasonCode", propOrder = {
    "quantityTypeQuantityTypes"
})
public class QuantityReasonCode
    extends ReasonCodeBase
{

    @XmlElementRef(name = "QuantityType_QuantityTypes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quantityTypeQuantityTypes;

    /**
     * Obtém o valor da propriedade quantityTypeQuantityTypes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantityTypeQuantityTypes() {
        return quantityTypeQuantityTypes;
    }

    /**
     * Define o valor da propriedade quantityTypeQuantityTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantityTypeQuantityTypes(JAXBElement<String> value) {
        this.quantityTypeQuantityTypes = value;
    }

}
