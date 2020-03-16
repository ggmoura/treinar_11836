
package com.roadnet.apex.datacontracts;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UpdateCustomerRegionsJobInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateCustomerRegionsJobInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}JobInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OverallDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OverallPercentComplete" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingRegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegionPercentComplete" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SubTaskDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubTaskPercentComplete" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCustomerRegionsJobInfo", propOrder = {
    "customerEntityKey",
    "overallDescription",
    "overallPercentComplete",
    "processingRegionIdentifier",
    "processingTypeName",
    "regionPercentComplete",
    "subTaskDescription",
    "subTaskPercentComplete"
})
public class UpdateCustomerRegionsJobInfo
    extends JobInfo
{

    @XmlElement(name = "CustomerEntityKey")
    protected Long customerEntityKey;
    @XmlElementRef(name = "OverallDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> overallDescription;
    @XmlElement(name = "OverallPercentComplete")
    protected BigDecimal overallPercentComplete;
    @XmlElementRef(name = "ProcessingRegionIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> processingRegionIdentifier;
    @XmlElementRef(name = "ProcessingTypeName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> processingTypeName;
    @XmlElement(name = "RegionPercentComplete")
    protected BigDecimal regionPercentComplete;
    @XmlElementRef(name = "SubTaskDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subTaskDescription;
    @XmlElement(name = "SubTaskPercentComplete")
    protected BigDecimal subTaskPercentComplete;

    /**
     * Obtém o valor da propriedade customerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerEntityKey() {
        return customerEntityKey;
    }

    /**
     * Define o valor da propriedade customerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerEntityKey(Long value) {
        this.customerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade overallDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOverallDescription() {
        return overallDescription;
    }

    /**
     * Define o valor da propriedade overallDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOverallDescription(JAXBElement<String> value) {
        this.overallDescription = value;
    }

    /**
     * Obtém o valor da propriedade overallPercentComplete.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverallPercentComplete() {
        return overallPercentComplete;
    }

    /**
     * Define o valor da propriedade overallPercentComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverallPercentComplete(BigDecimal value) {
        this.overallPercentComplete = value;
    }

    /**
     * Obtém o valor da propriedade processingRegionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcessingRegionIdentifier() {
        return processingRegionIdentifier;
    }

    /**
     * Define o valor da propriedade processingRegionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcessingRegionIdentifier(JAXBElement<String> value) {
        this.processingRegionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade processingTypeName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcessingTypeName() {
        return processingTypeName;
    }

    /**
     * Define o valor da propriedade processingTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcessingTypeName(JAXBElement<String> value) {
        this.processingTypeName = value;
    }

    /**
     * Obtém o valor da propriedade regionPercentComplete.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegionPercentComplete() {
        return regionPercentComplete;
    }

    /**
     * Define o valor da propriedade regionPercentComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegionPercentComplete(BigDecimal value) {
        this.regionPercentComplete = value;
    }

    /**
     * Obtém o valor da propriedade subTaskDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubTaskDescription() {
        return subTaskDescription;
    }

    /**
     * Define o valor da propriedade subTaskDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubTaskDescription(JAXBElement<String> value) {
        this.subTaskDescription = value;
    }

    /**
     * Obtém o valor da propriedade subTaskPercentComplete.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubTaskPercentComplete() {
        return subTaskPercentComplete;
    }

    /**
     * Define o valor da propriedade subTaskPercentComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubTaskPercentComplete(BigDecimal value) {
        this.subTaskPercentComplete = value;
    }

}
