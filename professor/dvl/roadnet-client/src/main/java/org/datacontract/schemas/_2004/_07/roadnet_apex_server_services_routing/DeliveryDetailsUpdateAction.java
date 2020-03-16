
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.StopIdentity;


/**
 * <p>Classe Java de DeliveryDetailsUpdateAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DeliveryDetailsUpdateAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MobileDeviceAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DetailItems" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ArrayOfDetailItem" minOccurs="0"/&gt;
 *         &lt;element name="StopKey" type="{http://roadnet.com/apex/DataContracts/}Stop.Identity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryDetailsUpdateAction", propOrder = {
    "detailItems",
    "stopKey"
})
public class DeliveryDetailsUpdateAction
    extends MobileDeviceAction
{

    @XmlElementRef(name = "DetailItems", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetailItem> detailItems;
    @XmlElementRef(name = "StopKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<StopIdentity> stopKey;

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
     * Obtém o valor da propriedade stopKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}
     *     
     */
    public JAXBElement<StopIdentity> getStopKey() {
        return stopKey;
    }

    /**
     * Define o valor da propriedade stopKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}
     *     
     */
    public void setStopKey(JAXBElement<StopIdentity> value) {
        this.stopKey = value;
    }

}
