
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de QuantityReasonCodePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="QuantityReasonCodePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}ReasonCodeBasePropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuantityType_QuantityTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityReasonCodePropertyOptions", propOrder = {
    "quantityTypeQuantityTypes"
})
public class QuantityReasonCodePropertyOptions
    extends ReasonCodeBasePropertyOptions
{

    @XmlElement(name = "QuantityType_QuantityTypes")
    protected Boolean quantityTypeQuantityTypes;

    /**
     * Obtém o valor da propriedade quantityTypeQuantityTypes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantityTypeQuantityTypes() {
        return quantityTypeQuantityTypes;
    }

    /**
     * Define o valor da propriedade quantityTypeQuantityTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantityTypeQuantityTypes(Boolean value) {
        this.quantityTypeQuantityTypes = value;
    }

}
