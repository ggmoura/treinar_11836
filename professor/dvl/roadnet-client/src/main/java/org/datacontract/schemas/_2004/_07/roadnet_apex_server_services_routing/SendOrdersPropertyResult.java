
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.PropertySendOrderTemplate;


/**
 * <p>Classe Java de SendOrdersPropertyResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SendOrdersPropertyResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Property" type="{http://roadnet.com/apex/DataContracts/}PropertySendOrderTemplate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendOrdersPropertyResult", propOrder = {
    "errorTypeType",
    "property"
})
public class SendOrdersPropertyResult {

    @XmlElementRef(name = "ErrorType_Type", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorTypeType;
    @XmlElementRef(name = "Property", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertySendOrderTemplate> property;

    /**
     * Obtém o valor da propriedade errorTypeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorTypeType() {
        return errorTypeType;
    }

    /**
     * Define o valor da propriedade errorTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorTypeType(JAXBElement<String> value) {
        this.errorTypeType = value;
    }

    /**
     * Obtém o valor da propriedade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertySendOrderTemplate }{@code >}
     *     
     */
    public JAXBElement<PropertySendOrderTemplate> getProperty() {
        return property;
    }

    /**
     * Define o valor da propriedade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertySendOrderTemplate }{@code >}
     *     
     */
    public void setProperty(JAXBElement<PropertySendOrderTemplate> value) {
        this.property = value;
    }

}
