
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.LoggingSettings;


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
 *         &lt;element name="RetrieveCustomerLoggingSettingsResult" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts}LoggingSettings" minOccurs="0"/&gt;
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
    "retrieveCustomerLoggingSettingsResult"
})
@XmlRootElement(name = "RetrieveCustomerLoggingSettingsResponse")
public class RetrieveCustomerLoggingSettingsResponse {

    @XmlElementRef(name = "RetrieveCustomerLoggingSettingsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<LoggingSettings> retrieveCustomerLoggingSettingsResult;

    /**
     * Obtém o valor da propriedade retrieveCustomerLoggingSettingsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoggingSettings }{@code >}
     *     
     */
    public JAXBElement<LoggingSettings> getRetrieveCustomerLoggingSettingsResult() {
        return retrieveCustomerLoggingSettingsResult;
    }

    /**
     * Define o valor da propriedade retrieveCustomerLoggingSettingsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoggingSettings }{@code >}
     *     
     */
    public void setRetrieveCustomerLoggingSettingsResult(JAXBElement<LoggingSettings> value) {
        this.retrieveCustomerLoggingSettingsResult = value;
    }

}
