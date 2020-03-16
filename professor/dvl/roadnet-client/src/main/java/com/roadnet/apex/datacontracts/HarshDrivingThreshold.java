
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de HarshDrivingThreshold complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="HarshDrivingThreshold"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccelerationThreshold" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="AccelerationThresholdEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BrakingThreshold" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="BrakingThresholdEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CorneringThreshold" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CorneringThresholdEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentClassification_EquipmentClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HarshDrivingThreshold", propOrder = {
    "accelerationThreshold",
    "accelerationThresholdEnabled",
    "brakingThreshold",
    "brakingThresholdEnabled",
    "corneringThreshold",
    "corneringThresholdEnabled",
    "equipmentClassificationEquipmentClassification"
})
public class HarshDrivingThreshold
    extends DataTransferObject
{

    @XmlElement(name = "AccelerationThreshold")
    protected Double accelerationThreshold;
    @XmlElement(name = "AccelerationThresholdEnabled")
    protected Boolean accelerationThresholdEnabled;
    @XmlElement(name = "BrakingThreshold")
    protected Double brakingThreshold;
    @XmlElement(name = "BrakingThresholdEnabled")
    protected Boolean brakingThresholdEnabled;
    @XmlElement(name = "CorneringThreshold")
    protected Double corneringThreshold;
    @XmlElement(name = "CorneringThresholdEnabled")
    protected Boolean corneringThresholdEnabled;
    @XmlElementRef(name = "EquipmentClassification_EquipmentClassification", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentClassificationEquipmentClassification;

    /**
     * Obtém o valor da propriedade accelerationThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAccelerationThreshold() {
        return accelerationThreshold;
    }

    /**
     * Define o valor da propriedade accelerationThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAccelerationThreshold(Double value) {
        this.accelerationThreshold = value;
    }

    /**
     * Obtém o valor da propriedade accelerationThresholdEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccelerationThresholdEnabled() {
        return accelerationThresholdEnabled;
    }

    /**
     * Define o valor da propriedade accelerationThresholdEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccelerationThresholdEnabled(Boolean value) {
        this.accelerationThresholdEnabled = value;
    }

    /**
     * Obtém o valor da propriedade brakingThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBrakingThreshold() {
        return brakingThreshold;
    }

    /**
     * Define o valor da propriedade brakingThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBrakingThreshold(Double value) {
        this.brakingThreshold = value;
    }

    /**
     * Obtém o valor da propriedade brakingThresholdEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrakingThresholdEnabled() {
        return brakingThresholdEnabled;
    }

    /**
     * Define o valor da propriedade brakingThresholdEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrakingThresholdEnabled(Boolean value) {
        this.brakingThresholdEnabled = value;
    }

    /**
     * Obtém o valor da propriedade corneringThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCorneringThreshold() {
        return corneringThreshold;
    }

    /**
     * Define o valor da propriedade corneringThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCorneringThreshold(Double value) {
        this.corneringThreshold = value;
    }

    /**
     * Obtém o valor da propriedade corneringThresholdEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCorneringThresholdEnabled() {
        return corneringThresholdEnabled;
    }

    /**
     * Define o valor da propriedade corneringThresholdEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCorneringThresholdEnabled(Boolean value) {
        this.corneringThresholdEnabled = value;
    }

    /**
     * Obtém o valor da propriedade equipmentClassificationEquipmentClassification.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentClassificationEquipmentClassification() {
        return equipmentClassificationEquipmentClassification;
    }

    /**
     * Define o valor da propriedade equipmentClassificationEquipmentClassification.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentClassificationEquipmentClassification(JAXBElement<String> value) {
        this.equipmentClassificationEquipmentClassification = value;
    }

}
