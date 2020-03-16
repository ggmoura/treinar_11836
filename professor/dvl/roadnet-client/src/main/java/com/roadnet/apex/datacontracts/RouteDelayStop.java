
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteDelayStop complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteDelayStop"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}NonServiceableStop"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DelayLocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DelayLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DelayLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteDelayStop", propOrder = {
    "delayLocationDescription",
    "delayLocationEntityKey",
    "delayLocationIdentifier"
})
public class RouteDelayStop
    extends NonServiceableStop
{

    @XmlElementRef(name = "DelayLocationDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> delayLocationDescription;
    @XmlElementRef(name = "DelayLocationEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> delayLocationEntityKey;
    @XmlElementRef(name = "DelayLocationIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> delayLocationIdentifier;

    /**
     * Obtém o valor da propriedade delayLocationDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDelayLocationDescription() {
        return delayLocationDescription;
    }

    /**
     * Define o valor da propriedade delayLocationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDelayLocationDescription(JAXBElement<String> value) {
        this.delayLocationDescription = value;
    }

    /**
     * Obtém o valor da propriedade delayLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDelayLocationEntityKey() {
        return delayLocationEntityKey;
    }

    /**
     * Define o valor da propriedade delayLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDelayLocationEntityKey(JAXBElement<Long> value) {
        this.delayLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade delayLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDelayLocationIdentifier() {
        return delayLocationIdentifier;
    }

    /**
     * Define o valor da propriedade delayLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDelayLocationIdentifier(JAXBElement<String> value) {
        this.delayLocationIdentifier = value;
    }

}
