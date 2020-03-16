
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OverridableRegionProperties.RoutingSessionsSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OverridableRegionProperties.RoutingSessionsSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutoCreateDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoCreateSession" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverridableRegionProperties.RoutingSessionsSettings", propOrder = {
    "autoCreateDescription",
    "autoCreateSession",
    "day"
})
public class OverridableRegionPropertiesRoutingSessionsSettings
    extends DataTransferObject
{

    @XmlElement(name = "AutoCreateDescription")
    protected Boolean autoCreateDescription;
    @XmlElement(name = "AutoCreateSession")
    protected Boolean autoCreateSession;
    @XmlElement(name = "Day")
    protected Boolean day;

    /**
     * Obtém o valor da propriedade autoCreateDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoCreateDescription() {
        return autoCreateDescription;
    }

    /**
     * Define o valor da propriedade autoCreateDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCreateDescription(Boolean value) {
        this.autoCreateDescription = value;
    }

    /**
     * Obtém o valor da propriedade autoCreateSession.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoCreateSession() {
        return autoCreateSession;
    }

    /**
     * Define o valor da propriedade autoCreateSession.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCreateSession(Boolean value) {
        this.autoCreateSession = value;
    }

    /**
     * Obtém o valor da propriedade day.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDay() {
        return day;
    }

    /**
     * Define o valor da propriedade day.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDay(Boolean value) {
        this.day = value;
    }

}
