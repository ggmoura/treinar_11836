
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de Region.PerformanceSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Region.PerformanceSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HighOptimumRpmThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LowOptimumRpmThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SpeedBracketSetEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Region.PerformanceSettings", propOrder = {
    "highOptimumRpmThreshold",
    "lowOptimumRpmThreshold",
    "speedBracketSetEntityKey"
})
public class RegionPerformanceSettings
    extends DataTransferObject
{

    @XmlElement(name = "HighOptimumRpmThreshold")
    protected Integer highOptimumRpmThreshold;
    @XmlElement(name = "LowOptimumRpmThreshold")
    protected Integer lowOptimumRpmThreshold;
    @XmlElementRef(name = "SpeedBracketSetEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> speedBracketSetEntityKey;

    /**
     * Obtém o valor da propriedade highOptimumRpmThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHighOptimumRpmThreshold() {
        return highOptimumRpmThreshold;
    }

    /**
     * Define o valor da propriedade highOptimumRpmThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHighOptimumRpmThreshold(Integer value) {
        this.highOptimumRpmThreshold = value;
    }

    /**
     * Obtém o valor da propriedade lowOptimumRpmThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLowOptimumRpmThreshold() {
        return lowOptimumRpmThreshold;
    }

    /**
     * Define o valor da propriedade lowOptimumRpmThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLowOptimumRpmThreshold(Integer value) {
        this.lowOptimumRpmThreshold = value;
    }

    /**
     * Obtém o valor da propriedade speedBracketSetEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSpeedBracketSetEntityKey() {
        return speedBracketSetEntityKey;
    }

    /**
     * Define o valor da propriedade speedBracketSetEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSpeedBracketSetEntityKey(JAXBElement<Long> value) {
        this.speedBracketSetEntityKey = value;
    }

}
