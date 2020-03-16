
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ScorecardThresholdConfiguration complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ScorecardThresholdConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HigherThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LowerThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ScorecardThresholdConfiguration_Thresholds_ThresholdScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecondColor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ThirdColor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TopColor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScorecardThresholdConfiguration", propOrder = {
    "higherThreshold",
    "lowerThreshold",
    "scorecardThresholdConfigurationThresholdsThresholdScheme",
    "secondColor",
    "thirdColor",
    "topColor"
})
public class ScorecardThresholdConfiguration
    extends DataTransferObject
{

    @XmlElement(name = "HigherThreshold")
    protected Integer higherThreshold;
    @XmlElement(name = "LowerThreshold")
    protected Integer lowerThreshold;
    @XmlElementRef(name = "ScorecardThresholdConfiguration_Thresholds_ThresholdScheme", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scorecardThresholdConfigurationThresholdsThresholdScheme;
    @XmlElement(name = "SecondColor")
    protected Integer secondColor;
    @XmlElement(name = "ThirdColor")
    protected Integer thirdColor;
    @XmlElement(name = "TopColor")
    protected Integer topColor;

    /**
     * Obtém o valor da propriedade higherThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHigherThreshold() {
        return higherThreshold;
    }

    /**
     * Define o valor da propriedade higherThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHigherThreshold(Integer value) {
        this.higherThreshold = value;
    }

    /**
     * Obtém o valor da propriedade lowerThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLowerThreshold() {
        return lowerThreshold;
    }

    /**
     * Define o valor da propriedade lowerThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLowerThreshold(Integer value) {
        this.lowerThreshold = value;
    }

    /**
     * Obtém o valor da propriedade scorecardThresholdConfigurationThresholdsThresholdScheme.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScorecardThresholdConfigurationThresholdsThresholdScheme() {
        return scorecardThresholdConfigurationThresholdsThresholdScheme;
    }

    /**
     * Define o valor da propriedade scorecardThresholdConfigurationThresholdsThresholdScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScorecardThresholdConfigurationThresholdsThresholdScheme(JAXBElement<String> value) {
        this.scorecardThresholdConfigurationThresholdsThresholdScheme = value;
    }

    /**
     * Obtém o valor da propriedade secondColor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecondColor() {
        return secondColor;
    }

    /**
     * Define o valor da propriedade secondColor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecondColor(Integer value) {
        this.secondColor = value;
    }

    /**
     * Obtém o valor da propriedade thirdColor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThirdColor() {
        return thirdColor;
    }

    /**
     * Define o valor da propriedade thirdColor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThirdColor(Integer value) {
        this.thirdColor = value;
    }

    /**
     * Obtém o valor da propriedade topColor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTopColor() {
        return topColor;
    }

    /**
     * Define o valor da propriedade topColor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTopColor(Integer value) {
        this.topColor = value;
    }

}
