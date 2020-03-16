
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de OpportunityExample complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OpportunityExample"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseImage" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="BaseMetrics" type="{http://roadnet.com/apex/DataContracts/}OpportunityMetrics" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpportunityMetrics" type="{http://roadnet.com/apex/DataContracts/}OpportunityMetrics" minOccurs="0"/&gt;
 *         &lt;element name="OptimizedImage" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpportunityExample", propOrder = {
    "baseImage",
    "baseMetrics",
    "identifier",
    "opportunityMetrics",
    "optimizedImage"
})
public class OpportunityExample
    extends DomainEntity
{

    @XmlElementRef(name = "BaseImage", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> baseImage;
    @XmlElementRef(name = "BaseMetrics", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpportunityMetrics> baseMetrics;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "OpportunityMetrics", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpportunityMetrics> opportunityMetrics;
    @XmlElementRef(name = "OptimizedImage", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> optimizedImage;

    /**
     * Obtém o valor da propriedade baseImage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getBaseImage() {
        return baseImage;
    }

    /**
     * Define o valor da propriedade baseImage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setBaseImage(JAXBElement<byte[]> value) {
        this.baseImage = value;
    }

    /**
     * Obtém o valor da propriedade baseMetrics.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpportunityMetrics }{@code >}
     *     
     */
    public JAXBElement<OpportunityMetrics> getBaseMetrics() {
        return baseMetrics;
    }

    /**
     * Define o valor da propriedade baseMetrics.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpportunityMetrics }{@code >}
     *     
     */
    public void setBaseMetrics(JAXBElement<OpportunityMetrics> value) {
        this.baseMetrics = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade opportunityMetrics.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpportunityMetrics }{@code >}
     *     
     */
    public JAXBElement<OpportunityMetrics> getOpportunityMetrics() {
        return opportunityMetrics;
    }

    /**
     * Define o valor da propriedade opportunityMetrics.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpportunityMetrics }{@code >}
     *     
     */
    public void setOpportunityMetrics(JAXBElement<OpportunityMetrics> value) {
        this.opportunityMetrics = value;
    }

    /**
     * Obtém o valor da propriedade optimizedImage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getOptimizedImage() {
        return optimizedImage;
    }

    /**
     * Define o valor da propriedade optimizedImage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setOptimizedImage(JAXBElement<byte[]> value) {
        this.optimizedImage = value;
    }

}
