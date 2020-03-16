
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de HosRuleSet complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="HosRuleSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Deprecated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HosRuleSetCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HosRuleSetJurisdictionType_JurisdictionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalizedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HosRuleSet", propOrder = {
    "deprecated",
    "hosRuleSetCode",
    "hosRuleSetJurisdictionTypeJurisdictionType",
    "localizedName"
})
public class HosRuleSet
    extends DataTransferObject
{

    @XmlElement(name = "Deprecated")
    protected Boolean deprecated;
    @XmlElement(name = "HosRuleSetCode")
    protected Integer hosRuleSetCode;
    @XmlElementRef(name = "HosRuleSetJurisdictionType_JurisdictionType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hosRuleSetJurisdictionTypeJurisdictionType;
    @XmlElementRef(name = "LocalizedName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localizedName;

    /**
     * Obtém o valor da propriedade deprecated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeprecated() {
        return deprecated;
    }

    /**
     * Define o valor da propriedade deprecated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeprecated(Boolean value) {
        this.deprecated = value;
    }

    /**
     * Obtém o valor da propriedade hosRuleSetCode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHosRuleSetCode() {
        return hosRuleSetCode;
    }

    /**
     * Define o valor da propriedade hosRuleSetCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHosRuleSetCode(Integer value) {
        this.hosRuleSetCode = value;
    }

    /**
     * Obtém o valor da propriedade hosRuleSetJurisdictionTypeJurisdictionType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHosRuleSetJurisdictionTypeJurisdictionType() {
        return hosRuleSetJurisdictionTypeJurisdictionType;
    }

    /**
     * Define o valor da propriedade hosRuleSetJurisdictionTypeJurisdictionType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHosRuleSetJurisdictionTypeJurisdictionType(JAXBElement<String> value) {
        this.hosRuleSetJurisdictionTypeJurisdictionType = value;
    }

    /**
     * Obtém o valor da propriedade localizedName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalizedName() {
        return localizedName;
    }

    /**
     * Define o valor da propriedade localizedName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalizedName(JAXBElement<String> value) {
        this.localizedName = value;
    }

}
