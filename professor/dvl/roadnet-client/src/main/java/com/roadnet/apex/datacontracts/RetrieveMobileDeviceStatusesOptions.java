
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.SortingDetail;


/**
 * <p>Classe Java de RetrieveMobileDeviceStatusesOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveMobileDeviceStatusesOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Order" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared}SortingDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveMobileDeviceStatusesOptions", propOrder = {
    "order"
})
public class RetrieveMobileDeviceStatusesOptions {

    @XmlElementRef(name = "Order", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<SortingDetail> order;

    /**
     * Obtém o valor da propriedade order.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SortingDetail }{@code >}
     *     
     */
    public JAXBElement<SortingDetail> getOrder() {
        return order;
    }

    /**
     * Define o valor da propriedade order.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SortingDetail }{@code >}
     *     
     */
    public void setOrder(JAXBElement<SortingDetail> value) {
        this.order = value;
    }

}
