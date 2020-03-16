
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de OpportunityExamplePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OpportunityExamplePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseImage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BaseMetrics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BaseMetricsOptions" type="{http://roadnet.com/apex/DataContracts/}OpportunityMetricsPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpportunityMetrics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OpportunityMetricsOptions" type="{http://roadnet.com/apex/DataContracts/}OpportunityMetricsPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="OptimizedImage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpportunityExamplePropertyOptions", propOrder = {
    "baseImage",
    "baseMetrics",
    "baseMetricsOptions",
    "identifier",
    "opportunityMetrics",
    "opportunityMetricsOptions",
    "optimizedImage"
})
public class OpportunityExamplePropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "BaseImage")
    protected Boolean baseImage;
    @XmlElement(name = "BaseMetrics")
    protected Boolean baseMetrics;
    @XmlElementRef(name = "BaseMetricsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpportunityMetricsPropertyOptions> baseMetricsOptions;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "OpportunityMetrics")
    protected Boolean opportunityMetrics;
    @XmlElementRef(name = "OpportunityMetricsOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<OpportunityMetricsPropertyOptions> opportunityMetricsOptions;
    @XmlElement(name = "OptimizedImage")
    protected Boolean optimizedImage;

    /**
     * Obtém o valor da propriedade baseImage.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBaseImage() {
        return baseImage;
    }

    /**
     * Define o valor da propriedade baseImage.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBaseImage(Boolean value) {
        this.baseImage = value;
    }

    /**
     * Obtém o valor da propriedade baseMetrics.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBaseMetrics() {
        return baseMetrics;
    }

    /**
     * Define o valor da propriedade baseMetrics.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBaseMetrics(Boolean value) {
        this.baseMetrics = value;
    }

    /**
     * Obtém o valor da propriedade baseMetricsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpportunityMetricsPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OpportunityMetricsPropertyOptions> getBaseMetricsOptions() {
        return baseMetricsOptions;
    }

    /**
     * Define o valor da propriedade baseMetricsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpportunityMetricsPropertyOptions }{@code >}
     *     
     */
    public void setBaseMetricsOptions(JAXBElement<OpportunityMetricsPropertyOptions> value) {
        this.baseMetricsOptions = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifier(Boolean value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade opportunityMetrics.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpportunityMetrics() {
        return opportunityMetrics;
    }

    /**
     * Define o valor da propriedade opportunityMetrics.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpportunityMetrics(Boolean value) {
        this.opportunityMetrics = value;
    }

    /**
     * Obtém o valor da propriedade opportunityMetricsOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpportunityMetricsPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<OpportunityMetricsPropertyOptions> getOpportunityMetricsOptions() {
        return opportunityMetricsOptions;
    }

    /**
     * Define o valor da propriedade opportunityMetricsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpportunityMetricsPropertyOptions }{@code >}
     *     
     */
    public void setOpportunityMetricsOptions(JAXBElement<OpportunityMetricsPropertyOptions> value) {
        this.opportunityMetricsOptions = value;
    }

    /**
     * Obtém o valor da propriedade optimizedImage.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptimizedImage() {
        return optimizedImage;
    }

    /**
     * Define o valor da propriedade optimizedImage.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptimizedImage(Boolean value) {
        this.optimizedImage = value;
    }

}
