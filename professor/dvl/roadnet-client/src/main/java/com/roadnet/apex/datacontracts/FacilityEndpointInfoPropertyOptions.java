
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FacilityEndpointInfoPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FacilityEndpointInfoPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Host" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Scheme" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityEndpointInfoPropertyOptions", propOrder = {
    "host",
    "port",
    "scheme"
})
public class FacilityEndpointInfoPropertyOptions {

    @XmlElement(name = "Host")
    protected Boolean host;
    @XmlElement(name = "Port")
    protected Boolean port;
    @XmlElement(name = "Scheme")
    protected Boolean scheme;

    /**
     * Obtém o valor da propriedade host.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHost() {
        return host;
    }

    /**
     * Define o valor da propriedade host.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHost(Boolean value) {
        this.host = value;
    }

    /**
     * Obtém o valor da propriedade port.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPort() {
        return port;
    }

    /**
     * Define o valor da propriedade port.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPort(Boolean value) {
        this.port = value;
    }

    /**
     * Obtém o valor da propriedade scheme.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScheme() {
        return scheme;
    }

    /**
     * Define o valor da propriedade scheme.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheme(Boolean value) {
        this.scheme = value;
    }

}
