
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DailyPass complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DailyPass"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}Pass"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DailyAttributes" type="{http://roadnet.com/apex/DataContracts/}DailyPassAttributes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyPass", propOrder = {
    "dailyAttributes"
})
public class DailyPass
    extends Pass
{

    @XmlElementRef(name = "DailyAttributes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<DailyPassAttributes> dailyAttributes;

    /**
     * Obtém o valor da propriedade dailyAttributes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DailyPassAttributes }{@code >}
     *     
     */
    public JAXBElement<DailyPassAttributes> getDailyAttributes() {
        return dailyAttributes;
    }

    /**
     * Define o valor da propriedade dailyAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DailyPassAttributes }{@code >}
     *     
     */
    public void setDailyAttributes(JAXBElement<DailyPassAttributes> value) {
        this.dailyAttributes = value;
    }

}
