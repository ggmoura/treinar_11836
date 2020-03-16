
package com.roadnet.apex.datacontracts;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ComplianceDataRetrievalJobInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ComplianceDataRetrievalJobInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}JobInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DVIREntities" type="{http://roadnet.com/apex/DataContracts/}ArrayOfDVIRResult" minOccurs="0"/&gt;
 *         &lt;element name="PercentComplete" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplianceDataRetrievalJobInfo", propOrder = {
    "dvirEntities",
    "percentComplete"
})
public class ComplianceDataRetrievalJobInfo
    extends JobInfo
{

    @XmlElementRef(name = "DVIREntities", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDVIRResult> dvirEntities;
    @XmlElement(name = "PercentComplete")
    protected BigDecimal percentComplete;

    /**
     * Obtém o valor da propriedade dvirEntities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDVIRResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDVIRResult> getDVIREntities() {
        return dvirEntities;
    }

    /**
     * Define o valor da propriedade dvirEntities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDVIRResult }{@code >}
     *     
     */
    public void setDVIREntities(JAXBElement<ArrayOfDVIRResult> value) {
        this.dvirEntities = value;
    }

    /**
     * Obtém o valor da propriedade percentComplete.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentComplete() {
        return percentComplete;
    }

    /**
     * Define o valor da propriedade percentComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentComplete(BigDecimal value) {
        this.percentComplete = value;
    }

}
