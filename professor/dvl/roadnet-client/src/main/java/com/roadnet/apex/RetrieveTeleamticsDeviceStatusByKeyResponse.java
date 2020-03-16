
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.TelematicsDeviceStatus;


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
 *         &lt;element name="RetrieveTeleamticsDeviceStatusByKeyResult" type="{http://roadnet.com/apex/DataContracts/}TelematicsDeviceStatus" minOccurs="0"/&gt;
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
    "retrieveTeleamticsDeviceStatusByKeyResult"
})
@XmlRootElement(name = "RetrieveTeleamticsDeviceStatusByKeyResponse")
public class RetrieveTeleamticsDeviceStatusByKeyResponse {

    @XmlElementRef(name = "RetrieveTeleamticsDeviceStatusByKeyResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<TelematicsDeviceStatus> retrieveTeleamticsDeviceStatusByKeyResult;

    /**
     * Obtém o valor da propriedade retrieveTeleamticsDeviceStatusByKeyResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceStatus }{@code >}
     *     
     */
    public JAXBElement<TelematicsDeviceStatus> getRetrieveTeleamticsDeviceStatusByKeyResult() {
        return retrieveTeleamticsDeviceStatusByKeyResult;
    }

    /**
     * Define o valor da propriedade retrieveTeleamticsDeviceStatusByKeyResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceStatus }{@code >}
     *     
     */
    public void setRetrieveTeleamticsDeviceStatusByKeyResult(JAXBElement<TelematicsDeviceStatus> value) {
        this.retrieveTeleamticsDeviceStatusByKeyResult = value;
    }

}
