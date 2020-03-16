
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfRoute;


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
 *         &lt;element name="RetrieveRoutesForDeviceResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRoute" minOccurs="0"/&gt;
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
    "retrieveRoutesForDeviceResult"
})
@XmlRootElement(name = "RetrieveRoutesForDeviceResponse")
public class RetrieveRoutesForDeviceResponse {

    @XmlElementRef(name = "RetrieveRoutesForDeviceResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRoute> retrieveRoutesForDeviceResult;

    /**
     * Obtém o valor da propriedade retrieveRoutesForDeviceResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoute }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRoute> getRetrieveRoutesForDeviceResult() {
        return retrieveRoutesForDeviceResult;
    }

    /**
     * Define o valor da propriedade retrieveRoutesForDeviceResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoute }{@code >}
     *     
     */
    public void setRetrieveRoutesForDeviceResult(JAXBElement<ArrayOfRoute> value) {
        this.retrieveRoutesForDeviceResult = value;
    }

}
