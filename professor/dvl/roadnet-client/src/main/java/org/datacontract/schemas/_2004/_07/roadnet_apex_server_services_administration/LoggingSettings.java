
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LoggingSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LoggingSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsIntegrationServiceRequestLoggingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoggingLevel_LoggingLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoggingSettings", propOrder = {
    "isIntegrationServiceRequestLoggingEnabled",
    "loggingLevelLoggingLevel"
})
public class LoggingSettings {

    @XmlElement(name = "IsIntegrationServiceRequestLoggingEnabled")
    protected Boolean isIntegrationServiceRequestLoggingEnabled;
    @XmlElementRef(name = "LoggingLevel_LoggingLevel", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loggingLevelLoggingLevel;

    /**
     * Obtém o valor da propriedade isIntegrationServiceRequestLoggingEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIntegrationServiceRequestLoggingEnabled() {
        return isIntegrationServiceRequestLoggingEnabled;
    }

    /**
     * Define o valor da propriedade isIntegrationServiceRequestLoggingEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIntegrationServiceRequestLoggingEnabled(Boolean value) {
        this.isIntegrationServiceRequestLoggingEnabled = value;
    }

    /**
     * Obtém o valor da propriedade loggingLevelLoggingLevel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoggingLevelLoggingLevel() {
        return loggingLevelLoggingLevel;
    }

    /**
     * Define o valor da propriedade loggingLevelLoggingLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoggingLevelLoggingLevel(JAXBElement<String> value) {
        this.loggingLevelLoggingLevel = value;
    }

}
