
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ResourceExceptionRuleExRuleType;
import com.roadnet.apex.datacontracts.ScorecardTemplateCriteriaCriteriaType;
import org.datacontract.schemas._2004._07.system_collections.ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO;


/**
 * <p>Classe Java de CriteriaTypeInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CriteriaTypeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CriteriaType" type="{http://roadnet.com/apex/DataContracts/}ScorecardTemplateCriteria.CriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="ResourceExceptionRuleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResourceExceptionRuleEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ResourceExceptionRuleType" type="{http://roadnet.com/apex/DataContracts/}ResourceExceptionRuleEx.RuleType" minOccurs="0"/&gt;
 *         &lt;element name="ScaleTypes" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriteriaTypeInfo", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.Scorecard", propOrder = {
    "criteriaType",
    "resourceExceptionRuleDescription",
    "resourceExceptionRuleEntityKey",
    "resourceExceptionRuleType",
    "scaleTypes"
})
public class CriteriaTypeInfo {

    @XmlElement(name = "CriteriaType")
    @XmlSchemaType(name = "string")
    protected ScorecardTemplateCriteriaCriteriaType criteriaType;
    @XmlElementRef(name = "ResourceExceptionRuleDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.Scorecard", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resourceExceptionRuleDescription;
    @XmlElementRef(name = "ResourceExceptionRuleEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.Scorecard", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> resourceExceptionRuleEntityKey;
    @XmlElement(name = "ResourceExceptionRuleType")
    @XmlSchemaType(name = "string")
    protected ResourceExceptionRuleExRuleType resourceExceptionRuleType;
    @XmlElementRef(name = "ScaleTypes", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.Scorecard", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO> scaleTypes;

    /**
     * Obtém o valor da propriedade criteriaType.
     * 
     * @return
     *     possible object is
     *     {@link ScorecardTemplateCriteriaCriteriaType }
     *     
     */
    public ScorecardTemplateCriteriaCriteriaType getCriteriaType() {
        return criteriaType;
    }

    /**
     * Define o valor da propriedade criteriaType.
     * 
     * @param value
     *     allowed object is
     *     {@link ScorecardTemplateCriteriaCriteriaType }
     *     
     */
    public void setCriteriaType(ScorecardTemplateCriteriaCriteriaType value) {
        this.criteriaType = value;
    }

    /**
     * Obtém o valor da propriedade resourceExceptionRuleDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResourceExceptionRuleDescription() {
        return resourceExceptionRuleDescription;
    }

    /**
     * Define o valor da propriedade resourceExceptionRuleDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResourceExceptionRuleDescription(JAXBElement<String> value) {
        this.resourceExceptionRuleDescription = value;
    }

    /**
     * Obtém o valor da propriedade resourceExceptionRuleEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getResourceExceptionRuleEntityKey() {
        return resourceExceptionRuleEntityKey;
    }

    /**
     * Define o valor da propriedade resourceExceptionRuleEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setResourceExceptionRuleEntityKey(JAXBElement<Long> value) {
        this.resourceExceptionRuleEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade resourceExceptionRuleType.
     * 
     * @return
     *     possible object is
     *     {@link ResourceExceptionRuleExRuleType }
     *     
     */
    public ResourceExceptionRuleExRuleType getResourceExceptionRuleType() {
        return resourceExceptionRuleType;
    }

    /**
     * Define o valor da propriedade resourceExceptionRuleType.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceExceptionRuleExRuleType }
     *     
     */
    public void setResourceExceptionRuleType(ResourceExceptionRuleExRuleType value) {
        this.resourceExceptionRuleType = value;
    }

    /**
     * Obtém o valor da propriedade scaleTypes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO> getScaleTypes() {
        return scaleTypes;
    }

    /**
     * Define o valor da propriedade scaleTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO }{@code >}
     *     
     */
    public void setScaleTypes(JAXBElement<ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO> value) {
        this.scaleTypes = value;
    }

}
