
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.TravelPathResult;


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
 *         &lt;element name="GenerateRouteTravelPathResult" type="{http://roadnet.com/apex/DataContracts/}TravelPathResult" minOccurs="0"/&gt;
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
    "generateRouteTravelPathResult"
})
@XmlRootElement(name = "GenerateRouteTravelPathResponse")
public class GenerateRouteTravelPathResponse {

    @XmlElementRef(name = "GenerateRouteTravelPathResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<TravelPathResult> generateRouteTravelPathResult;

    /**
     * Obtém o valor da propriedade generateRouteTravelPathResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TravelPathResult }{@code >}
     *     
     */
    public JAXBElement<TravelPathResult> getGenerateRouteTravelPathResult() {
        return generateRouteTravelPathResult;
    }

    /**
     * Define o valor da propriedade generateRouteTravelPathResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TravelPathResult }{@code >}
     *     
     */
    public void setGenerateRouteTravelPathResult(JAXBElement<TravelPathResult> value) {
        this.generateRouteTravelPathResult = value;
    }

}
