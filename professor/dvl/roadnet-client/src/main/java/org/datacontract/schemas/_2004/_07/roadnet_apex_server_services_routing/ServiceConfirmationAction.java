
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ServiceConfirmationAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceConfirmationAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MobileDeviceAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceConfirmationInfos" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ArrayOfServiceConfirmationInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceConfirmationAction", propOrder = {
    "serviceConfirmationInfos"
})
public class ServiceConfirmationAction
    extends MobileDeviceAction
{

    @XmlElementRef(name = "ServiceConfirmationInfos", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceConfirmationInfo> serviceConfirmationInfos;

    /**
     * Obtém o valor da propriedade serviceConfirmationInfos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceConfirmationInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceConfirmationInfo> getServiceConfirmationInfos() {
        return serviceConfirmationInfos;
    }

    /**
     * Define o valor da propriedade serviceConfirmationInfos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceConfirmationInfo }{@code >}
     *     
     */
    public void setServiceConfirmationInfos(JAXBElement<ArrayOfServiceConfirmationInfo> value) {
        this.serviceConfirmationInfos = value;
    }

}
