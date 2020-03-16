
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DetailItemVerificationAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DetailItemVerificationAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}StopBasedActionDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DetailItems" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ArrayOfDetailItem" minOccurs="0"/&gt;
 *         &lt;element name="VerificationLocationType_VerificationLocationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VerificationType_VerificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailItemVerificationAction", propOrder = {
    "detailItems",
    "verificationLocationTypeVerificationLocationType",
    "verificationTypeVerificationType"
})
public class DetailItemVerificationAction
    extends StopBasedActionDto
{

    @XmlElementRef(name = "DetailItems", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetailItem> detailItems;
    @XmlElementRef(name = "VerificationLocationType_VerificationLocationType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> verificationLocationTypeVerificationLocationType;
    @XmlElementRef(name = "VerificationType_VerificationType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> verificationTypeVerificationType;

    /**
     * Obtém o valor da propriedade detailItems.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetailItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDetailItem> getDetailItems() {
        return detailItems;
    }

    /**
     * Define o valor da propriedade detailItems.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetailItem }{@code >}
     *     
     */
    public void setDetailItems(JAXBElement<ArrayOfDetailItem> value) {
        this.detailItems = value;
    }

    /**
     * Obtém o valor da propriedade verificationLocationTypeVerificationLocationType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVerificationLocationTypeVerificationLocationType() {
        return verificationLocationTypeVerificationLocationType;
    }

    /**
     * Define o valor da propriedade verificationLocationTypeVerificationLocationType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVerificationLocationTypeVerificationLocationType(JAXBElement<String> value) {
        this.verificationLocationTypeVerificationLocationType = value;
    }

    /**
     * Obtém o valor da propriedade verificationTypeVerificationType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVerificationTypeVerificationType() {
        return verificationTypeVerificationType;
    }

    /**
     * Define o valor da propriedade verificationTypeVerificationType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVerificationTypeVerificationType(JAXBElement<String> value) {
        this.verificationTypeVerificationType = value;
    }

}
