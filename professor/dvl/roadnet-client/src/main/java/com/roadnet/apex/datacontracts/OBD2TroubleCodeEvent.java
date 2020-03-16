
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OBD2TroubleCodeEvent complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OBD2TroubleCodeEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}DiagnosticTroubleCodeEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TroubleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBD2TroubleCodeEvent", propOrder = {
    "troubleCode"
})
public class OBD2TroubleCodeEvent
    extends DiagnosticTroubleCodeEvent
{

    @XmlElementRef(name = "TroubleCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> troubleCode;

    /**
     * Obtém o valor da propriedade troubleCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTroubleCode() {
        return troubleCode;
    }

    /**
     * Define o valor da propriedade troubleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTroubleCode(JAXBElement<String> value) {
        this.troubleCode = value;
    }

}
