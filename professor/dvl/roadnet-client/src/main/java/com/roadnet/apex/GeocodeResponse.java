
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfGeocodeResult;


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
 *         &lt;element name="GeocodeResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfGeocodeResult" minOccurs="0"/&gt;
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
    "geocodeResult"
})
@XmlRootElement(name = "GeocodeResponse")
public class GeocodeResponse {

    @XmlElementRef(name = "GeocodeResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGeocodeResult> geocodeResult;

    /**
     * Obtém o valor da propriedade geocodeResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGeocodeResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGeocodeResult> getGeocodeResult() {
        return geocodeResult;
    }

    /**
     * Define o valor da propriedade geocodeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGeocodeResult }{@code >}
     *     
     */
    public void setGeocodeResult(JAXBElement<ArrayOfGeocodeResult> value) {
        this.geocodeResult = value;
    }

}
