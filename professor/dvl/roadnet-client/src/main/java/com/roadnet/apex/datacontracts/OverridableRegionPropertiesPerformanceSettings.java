
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OverridableRegionProperties.PerformanceSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OverridableRegionProperties.PerformanceSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HighOptimumRpmThreshold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LowOptimumRpmThreshold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SpeedBracketSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverridableRegionProperties.PerformanceSettings", propOrder = {
    "highOptimumRpmThreshold",
    "lowOptimumRpmThreshold",
    "speedBracketSet"
})
public class OverridableRegionPropertiesPerformanceSettings
    extends DataTransferObject
{

    @XmlElement(name = "HighOptimumRpmThreshold")
    protected Boolean highOptimumRpmThreshold;
    @XmlElement(name = "LowOptimumRpmThreshold")
    protected Boolean lowOptimumRpmThreshold;
    @XmlElement(name = "SpeedBracketSet")
    protected Boolean speedBracketSet;

    /**
     * Obtém o valor da propriedade highOptimumRpmThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHighOptimumRpmThreshold() {
        return highOptimumRpmThreshold;
    }

    /**
     * Define o valor da propriedade highOptimumRpmThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighOptimumRpmThreshold(Boolean value) {
        this.highOptimumRpmThreshold = value;
    }

    /**
     * Obtém o valor da propriedade lowOptimumRpmThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLowOptimumRpmThreshold() {
        return lowOptimumRpmThreshold;
    }

    /**
     * Define o valor da propriedade lowOptimumRpmThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowOptimumRpmThreshold(Boolean value) {
        this.lowOptimumRpmThreshold = value;
    }

    /**
     * Obtém o valor da propriedade speedBracketSet.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpeedBracketSet() {
        return speedBracketSet;
    }

    /**
     * Define o valor da propriedade speedBracketSet.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpeedBracketSet(Boolean value) {
        this.speedBracketSet = value;
    }

}
