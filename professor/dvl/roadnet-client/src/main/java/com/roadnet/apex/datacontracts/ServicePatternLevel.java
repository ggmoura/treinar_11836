
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de ServicePatternLevel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServicePatternLevel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MinQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PatternEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicePatternLevel", propOrder = {
    "minQuantity",
    "patternEntityKeys"
})
public class ServicePatternLevel
    extends DomainEntity
{

    @XmlElement(name = "MinQuantity")
    protected Double minQuantity;
    @XmlElementRef(name = "PatternEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> patternEntityKeys;

    /**
     * Obtém o valor da propriedade minQuantity.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinQuantity() {
        return minQuantity;
    }

    /**
     * Define o valor da propriedade minQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinQuantity(Double value) {
        this.minQuantity = value;
    }

    /**
     * Obtém o valor da propriedade patternEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getPatternEntityKeys() {
        return patternEntityKeys;
    }

    /**
     * Define o valor da propriedade patternEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setPatternEntityKeys(JAXBElement<ArrayOflong> value) {
        this.patternEntityKeys = value;
    }

}
