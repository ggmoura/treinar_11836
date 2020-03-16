
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ServiceableStopActuals complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceableStopActuals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}StopActuals"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Orders" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ArrayOfOrderActuals" minOccurs="0"/&gt;
 *         &lt;element name="ServiceStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceableStopActuals", propOrder = {
    "orders",
    "serviceStartTime"
})
public class ServiceableStopActuals
    extends StopActuals
{

    @XmlElementRef(name = "Orders", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderActuals> orders;
    @XmlElement(name = "ServiceStartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceStartTime;

    /**
     * Obtém o valor da propriedade orders.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderActuals }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderActuals> getOrders() {
        return orders;
    }

    /**
     * Define o valor da propriedade orders.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderActuals }{@code >}
     *     
     */
    public void setOrders(JAXBElement<ArrayOfOrderActuals> value) {
        this.orders = value;
    }

    /**
     * Obtém o valor da propriedade serviceStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceStartTime() {
        return serviceStartTime;
    }

    /**
     * Define o valor da propriedade serviceStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceStartTime(XMLGregorianCalendar value) {
        this.serviceStartTime = value;
    }

}
