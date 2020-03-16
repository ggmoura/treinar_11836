
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RouteTemplate;


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
 *         &lt;element name="UpdateLayoverStopTemplateResult" type="{http://roadnet.com/apex/DataContracts/}RouteTemplate" minOccurs="0"/&gt;
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
    "updateLayoverStopTemplateResult"
})
@XmlRootElement(name = "UpdateLayoverStopTemplateResponse")
public class UpdateLayoverStopTemplateResponse {

    @XmlElementRef(name = "UpdateLayoverStopTemplateResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteTemplate> updateLayoverStopTemplateResult;

    /**
     * Obtém o valor da propriedade updateLayoverStopTemplateResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteTemplate }{@code >}
     *     
     */
    public JAXBElement<RouteTemplate> getUpdateLayoverStopTemplateResult() {
        return updateLayoverStopTemplateResult;
    }

    /**
     * Define o valor da propriedade updateLayoverStopTemplateResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteTemplate }{@code >}
     *     
     */
    public void setUpdateLayoverStopTemplateResult(JAXBElement<RouteTemplate> value) {
        this.updateLayoverStopTemplateResult = value;
    }

}
