
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfDomainInstance;


/**
 * <p>Classe Java de ShiftDaysJobParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ShiftDaysJobParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Options" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}DayShiftOptions" minOccurs="0"/&gt;
 *         &lt;element name="RecurringOrders" type="{http://roadnet.com/apex/DataContracts/}ArrayOfDomainInstance" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShiftDaysJobParameters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ShiftDays", propOrder = {
    "options",
    "recurringOrders"
})
public class ShiftDaysJobParameters {

    @XmlElementRef(name = "Options", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ShiftDays", type = JAXBElement.class, required = false)
    protected JAXBElement<DayShiftOptions> options;
    @XmlElementRef(name = "RecurringOrders", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ShiftDays", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDomainInstance> recurringOrders;

    /**
     * Obtém o valor da propriedade options.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DayShiftOptions }{@code >}
     *     
     */
    public JAXBElement<DayShiftOptions> getOptions() {
        return options;
    }

    /**
     * Define o valor da propriedade options.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DayShiftOptions }{@code >}
     *     
     */
    public void setOptions(JAXBElement<DayShiftOptions> value) {
        this.options = value;
    }

    /**
     * Obtém o valor da propriedade recurringOrders.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDomainInstance> getRecurringOrders() {
        return recurringOrders;
    }

    /**
     * Define o valor da propriedade recurringOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDomainInstance }{@code >}
     *     
     */
    public void setRecurringOrders(JAXBElement<ArrayOfDomainInstance> value) {
        this.recurringOrders = value;
    }

}
