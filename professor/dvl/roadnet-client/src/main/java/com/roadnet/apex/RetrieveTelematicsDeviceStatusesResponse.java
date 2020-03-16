
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RetrieveTelematicsDeviceStatusesResults;


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
 *         &lt;element name="RetrieveTelematicsDeviceStatusesResult" type="{http://roadnet.com/apex/DataContracts/}RetrieveTelematicsDeviceStatusesResults" minOccurs="0"/&gt;
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
    "retrieveTelematicsDeviceStatusesResult"
})
@XmlRootElement(name = "RetrieveTelematicsDeviceStatusesResponse")
public class RetrieveTelematicsDeviceStatusesResponse {

    @XmlElementRef(name = "RetrieveTelematicsDeviceStatusesResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RetrieveTelematicsDeviceStatusesResults> retrieveTelematicsDeviceStatusesResult;

    /**
     * Obtém o valor da propriedade retrieveTelematicsDeviceStatusesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveTelematicsDeviceStatusesResults }{@code >}
     *     
     */
    public JAXBElement<RetrieveTelematicsDeviceStatusesResults> getRetrieveTelematicsDeviceStatusesResult() {
        return retrieveTelematicsDeviceStatusesResult;
    }

    /**
     * Define o valor da propriedade retrieveTelematicsDeviceStatusesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveTelematicsDeviceStatusesResults }{@code >}
     *     
     */
    public void setRetrieveTelematicsDeviceStatusesResult(JAXBElement<RetrieveTelematicsDeviceStatusesResults> value) {
        this.retrieveTelematicsDeviceStatusesResult = value;
    }

}
