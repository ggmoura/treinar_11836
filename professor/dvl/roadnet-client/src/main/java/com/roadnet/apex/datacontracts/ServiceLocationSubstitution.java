
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ServiceLocationSubstitution complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceLocationSubstitution"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DestinationServiceLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceServiceLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLocationSubstitution", propOrder = {
    "destinationServiceLocationIdentifier",
    "sourceServiceLocationIdentifier"
})
public class ServiceLocationSubstitution
    extends RegionBasedAggregateRootEntity
{

    @XmlElementRef(name = "DestinationServiceLocationIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinationServiceLocationIdentifier;
    @XmlElementRef(name = "SourceServiceLocationIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceServiceLocationIdentifier;

    /**
     * Obtém o valor da propriedade destinationServiceLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinationServiceLocationIdentifier() {
        return destinationServiceLocationIdentifier;
    }

    /**
     * Define o valor da propriedade destinationServiceLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinationServiceLocationIdentifier(JAXBElement<String> value) {
        this.destinationServiceLocationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade sourceServiceLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceServiceLocationIdentifier() {
        return sourceServiceLocationIdentifier;
    }

    /**
     * Define o valor da propriedade sourceServiceLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceServiceLocationIdentifier(JAXBElement<String> value) {
        this.sourceServiceLocationIdentifier = value;
    }

}
