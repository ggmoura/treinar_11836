
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TimeWindowImportanceAlertParameter complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TimeWindowImportanceAlertParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AlertParameter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeWindowImportance_Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeWindowImportanceAlertParameter", propOrder = {
    "timeWindowImportanceValue"
})
public class TimeWindowImportanceAlertParameter
    extends AlertParameter
{

    @XmlElementRef(name = "TimeWindowImportance_Value", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeWindowImportanceValue;

    /**
     * Obtém o valor da propriedade timeWindowImportanceValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeWindowImportanceValue() {
        return timeWindowImportanceValue;
    }

    /**
     * Define o valor da propriedade timeWindowImportanceValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeWindowImportanceValue(JAXBElement<String> value) {
        this.timeWindowImportanceValue = value;
    }

}
