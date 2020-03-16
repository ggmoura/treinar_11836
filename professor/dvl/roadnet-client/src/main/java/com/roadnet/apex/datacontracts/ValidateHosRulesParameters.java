
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ValidateHosRulesParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ValidateHosRulesParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowCoDrivers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DefaultReportingLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EnableBigDayException" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableShortHaulExemption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosEnabledRules" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateHosRulesParameters", propOrder = {
    "allowCoDrivers",
    "defaultReportingLocationEntityKey",
    "enableBigDayException",
    "enableShortHaulExemption",
    "hosEnabledRules"
})
public class ValidateHosRulesParameters
    extends DataTransferObject
{

    @XmlElement(name = "AllowCoDrivers")
    protected Boolean allowCoDrivers;
    @XmlElementRef(name = "DefaultReportingLocationEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> defaultReportingLocationEntityKey;
    @XmlElement(name = "EnableBigDayException")
    protected Boolean enableBigDayException;
    @XmlElement(name = "EnableShortHaulExemption")
    protected Boolean enableShortHaulExemption;
    @XmlElementRef(name = "HosEnabledRules", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> hosEnabledRules;

    /**
     * Obtém o valor da propriedade allowCoDrivers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowCoDrivers() {
        return allowCoDrivers;
    }

    /**
     * Define o valor da propriedade allowCoDrivers.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowCoDrivers(Boolean value) {
        this.allowCoDrivers = value;
    }

    /**
     * Obtém o valor da propriedade defaultReportingLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDefaultReportingLocationEntityKey() {
        return defaultReportingLocationEntityKey;
    }

    /**
     * Define o valor da propriedade defaultReportingLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDefaultReportingLocationEntityKey(JAXBElement<Long> value) {
        this.defaultReportingLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade enableBigDayException.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableBigDayException() {
        return enableBigDayException;
    }

    /**
     * Define o valor da propriedade enableBigDayException.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableBigDayException(Boolean value) {
        this.enableBigDayException = value;
    }

    /**
     * Obtém o valor da propriedade enableShortHaulExemption.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableShortHaulExemption() {
        return enableShortHaulExemption;
    }

    /**
     * Define o valor da propriedade enableShortHaulExemption.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableShortHaulExemption(Boolean value) {
        this.enableShortHaulExemption = value;
    }

    /**
     * Obtém o valor da propriedade hosEnabledRules.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getHosEnabledRules() {
        return hosEnabledRules;
    }

    /**
     * Define o valor da propriedade hosEnabledRules.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setHosEnabledRules(JAXBElement<ArrayOfint> value) {
        this.hosEnabledRules = value;
    }

}
