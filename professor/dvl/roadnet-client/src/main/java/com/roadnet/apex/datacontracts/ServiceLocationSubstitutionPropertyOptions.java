
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ServiceLocationSubstitutionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceLocationSubstitutionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DestinationServiceLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SourceServiceLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLocationSubstitutionPropertyOptions", propOrder = {
    "destinationServiceLocationIdentifier",
    "sourceServiceLocationIdentifier"
})
public class ServiceLocationSubstitutionPropertyOptions
    extends RegionBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "DestinationServiceLocationIdentifier")
    protected Boolean destinationServiceLocationIdentifier;
    @XmlElement(name = "SourceServiceLocationIdentifier")
    protected Boolean sourceServiceLocationIdentifier;

    /**
     * Obtém o valor da propriedade destinationServiceLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDestinationServiceLocationIdentifier() {
        return destinationServiceLocationIdentifier;
    }

    /**
     * Define o valor da propriedade destinationServiceLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDestinationServiceLocationIdentifier(Boolean value) {
        this.destinationServiceLocationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade sourceServiceLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSourceServiceLocationIdentifier() {
        return sourceServiceLocationIdentifier;
    }

    /**
     * Define o valor da propriedade sourceServiceLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSourceServiceLocationIdentifier(Boolean value) {
        this.sourceServiceLocationIdentifier = value;
    }

}
