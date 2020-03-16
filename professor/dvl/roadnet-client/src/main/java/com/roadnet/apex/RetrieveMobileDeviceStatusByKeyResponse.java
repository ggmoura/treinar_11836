
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.MobileDeviceStatus;


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
 *         &lt;element name="RetrieveMobileDeviceStatusByKeyResult" type="{http://roadnet.com/apex/DataContracts/}MobileDeviceStatus" minOccurs="0"/&gt;
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
    "retrieveMobileDeviceStatusByKeyResult"
})
@XmlRootElement(name = "RetrieveMobileDeviceStatusByKeyResponse")
public class RetrieveMobileDeviceStatusByKeyResponse {

    @XmlElementRef(name = "RetrieveMobileDeviceStatusByKeyResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<MobileDeviceStatus> retrieveMobileDeviceStatusByKeyResult;

    /**
     * Obtém o valor da propriedade retrieveMobileDeviceStatusByKeyResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MobileDeviceStatus }{@code >}
     *     
     */
    public JAXBElement<MobileDeviceStatus> getRetrieveMobileDeviceStatusByKeyResult() {
        return retrieveMobileDeviceStatusByKeyResult;
    }

    /**
     * Define o valor da propriedade retrieveMobileDeviceStatusByKeyResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MobileDeviceStatus }{@code >}
     *     
     */
    public void setRetrieveMobileDeviceStatusByKeyResult(JAXBElement<MobileDeviceStatus> value) {
        this.retrieveMobileDeviceStatusByKeyResult = value;
    }

}
