
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfStopIdentity;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ServiceConfirmationInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceConfirmationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AppliesToOrders" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ArrayOfServiceConfirmationAction.OrderIdentity" minOccurs="0"/&gt;
 *         &lt;element name="AppliesToStops" type="{http://roadnet.com/apex/DataContracts/}ArrayOfStop.Identity" minOccurs="0"/&gt;
 *         &lt;element name="Consignee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryImage" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="SignatureImage" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="SkipSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceConfirmationInfo", propOrder = {
    "appliesToOrders",
    "appliesToStops",
    "consignee",
    "deliveryImage",
    "signatureImage",
    "skipSignature"
})
public class ServiceConfirmationInfo
    extends DataTransferObject
{

    @XmlElementRef(name = "AppliesToOrders", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceConfirmationActionOrderIdentity> appliesToOrders;
    @XmlElementRef(name = "AppliesToStops", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStopIdentity> appliesToStops;
    @XmlElementRef(name = "Consignee", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consignee;
    @XmlElementRef(name = "DeliveryImage", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> deliveryImage;
    @XmlElementRef(name = "SignatureImage", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> signatureImage;
    @XmlElement(name = "SkipSignature")
    protected Boolean skipSignature;

    /**
     * Obtém o valor da propriedade appliesToOrders.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceConfirmationActionOrderIdentity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceConfirmationActionOrderIdentity> getAppliesToOrders() {
        return appliesToOrders;
    }

    /**
     * Define o valor da propriedade appliesToOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceConfirmationActionOrderIdentity }{@code >}
     *     
     */
    public void setAppliesToOrders(JAXBElement<ArrayOfServiceConfirmationActionOrderIdentity> value) {
        this.appliesToOrders = value;
    }

    /**
     * Obtém o valor da propriedade appliesToStops.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStopIdentity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStopIdentity> getAppliesToStops() {
        return appliesToStops;
    }

    /**
     * Define o valor da propriedade appliesToStops.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStopIdentity }{@code >}
     *     
     */
    public void setAppliesToStops(JAXBElement<ArrayOfStopIdentity> value) {
        this.appliesToStops = value;
    }

    /**
     * Obtém o valor da propriedade consignee.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsignee() {
        return consignee;
    }

    /**
     * Define o valor da propriedade consignee.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsignee(JAXBElement<String> value) {
        this.consignee = value;
    }

    /**
     * Obtém o valor da propriedade deliveryImage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getDeliveryImage() {
        return deliveryImage;
    }

    /**
     * Define o valor da propriedade deliveryImage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setDeliveryImage(JAXBElement<byte[]> value) {
        this.deliveryImage = value;
    }

    /**
     * Obtém o valor da propriedade signatureImage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getSignatureImage() {
        return signatureImage;
    }

    /**
     * Define o valor da propriedade signatureImage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setSignatureImage(JAXBElement<byte[]> value) {
        this.signatureImage = value;
    }

    /**
     * Obtém o valor da propriedade skipSignature.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipSignature() {
        return skipSignature;
    }

    /**
     * Define o valor da propriedade skipSignature.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipSignature(Boolean value) {
        this.skipSignature = value;
    }

}
