
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de FixedArrivalAtNextStopLayover complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FixedArrivalAtNextStopLayover"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}LayoverDeparture"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArrivalAtNextStop" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedArrivalAtNextStopLayover", propOrder = {
    "arrivalAtNextStop"
})
public class FixedArrivalAtNextStopLayover
    extends LayoverDeparture
{

    @XmlElementRef(name = "ArrivalAtNextStop", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> arrivalAtNextStop;

    /**
     * Obtém o valor da propriedade arrivalAtNextStop.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getArrivalAtNextStop() {
        return arrivalAtNextStop;
    }

    /**
     * Define o valor da propriedade arrivalAtNextStop.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setArrivalAtNextStop(JAXBElement<XMLGregorianCalendar> value) {
        this.arrivalAtNextStop = value;
    }

}
