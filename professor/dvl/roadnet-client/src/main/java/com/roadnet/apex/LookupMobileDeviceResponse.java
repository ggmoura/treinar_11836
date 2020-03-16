
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.LookupMobileDeviceResult;


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
 *         &lt;element name="LookupMobileDeviceResult" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login}LookupMobileDeviceResult" minOccurs="0"/&gt;
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
    "lookupMobileDeviceResult"
})
@XmlRootElement(name = "LookupMobileDeviceResponse")
public class LookupMobileDeviceResponse {

    @XmlElementRef(name = "LookupMobileDeviceResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<LookupMobileDeviceResult> lookupMobileDeviceResult;

    /**
     * Obtém o valor da propriedade lookupMobileDeviceResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LookupMobileDeviceResult }{@code >}
     *     
     */
    public JAXBElement<LookupMobileDeviceResult> getLookupMobileDeviceResult() {
        return lookupMobileDeviceResult;
    }

    /**
     * Define o valor da propriedade lookupMobileDeviceResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LookupMobileDeviceResult }{@code >}
     *     
     */
    public void setLookupMobileDeviceResult(JAXBElement<LookupMobileDeviceResult> value) {
        this.lookupMobileDeviceResult = value;
    }

}
