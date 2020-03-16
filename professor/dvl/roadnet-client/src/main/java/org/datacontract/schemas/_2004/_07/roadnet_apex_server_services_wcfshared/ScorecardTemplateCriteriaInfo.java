
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system_collections.ArrayOfKeyValuePairOfResourceExceptionRuleExRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb;
import org.datacontract.schemas._2004._07.system_collections.ArrayOfKeyValuePairOfResourceExceptionRuleExRuleTypestringFfzvU1AO;
import org.datacontract.schemas._2004._07.system_collections.ArrayOfKeyValuePairOfResourceExceptionRuleRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb;
import org.datacontract.schemas._2004._07.system_collections.ArrayOfKeyValuePairOfResourceExceptionRuleRuleTypestringFfzvU1AO;
import org.datacontract.schemas._2004._07.system_collections.ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO;


/**
 * <p>Classe Java de ScorecardTemplateCriteriaInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ScorecardTemplateCriteriaInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CriteriaTypeInfoCollection" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.Scorecard}ArrayOfCriteriaTypeInfo" minOccurs="0"/&gt;
 *         &lt;element name="ResourceExceptionRuleExExampleMappings" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfResourceExceptionRuleEx.RuleTypestringFfzvU1aO" minOccurs="0"/&gt;
 *         &lt;element name="ResourceExceptionRuleExScaleTypeMappings" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfResourceExceptionRuleEx.RuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aOagVjbyjb" minOccurs="0"/&gt;
 *         &lt;element name="ResourceExceptionRuleExampleMappings" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfResourceExceptionRule.RuleTypestringFfzvU1aO" minOccurs="0"/&gt;
 *         &lt;element name="ResourceExceptionRuleScaleTypeMappings" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfResourceExceptionRule.RuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aOagVjbyjb" minOccurs="0"/&gt;
 *         &lt;element name="ScaleTypeExampleMappings" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aO" minOccurs="0"/&gt;
 *         &lt;element name="ScaleTypeThresholdDescriptionMappings" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfScorecardTemplateCriteria.ScaleTypestringFfzvU1aO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScorecardTemplateCriteriaInfo", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.Scorecard", propOrder = {
    "criteriaTypeInfoCollection",
    "resourceExceptionRuleExExampleMappings",
    "resourceExceptionRuleExScaleTypeMappings",
    "resourceExceptionRuleExampleMappings",
    "resourceExceptionRuleScaleTypeMappings",
    "scaleTypeExampleMappings",
    "scaleTypeThresholdDescriptionMappings"
})
public class ScorecardTemplateCriteriaInfo {

    @XmlElementRef(name = "CriteriaTypeInfoCollection", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.Scorecard", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCriteriaTypeInfo> criteriaTypeInfoCollection;
    @XmlElementRef(name = "ResourceExceptionRuleExExampleMappings", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.Scorecard", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValuePairOfResourceExceptionRuleExRuleTypestringFfzvU1AO> resourceExceptionRuleExExampleMappings;
    @XmlElementRef(name = "ResourceExceptionRuleExScaleTypeMappings", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.Scorecard", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValuePairOfResourceExceptionRuleExRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb> resourceExceptionRuleExScaleTypeMappings;
    @XmlElementRef(name = "ResourceExceptionRuleExampleMappings", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.Scorecard", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValuePairOfResourceExceptionRuleRuleTypestringFfzvU1AO> resourceExceptionRuleExampleMappings;
    @XmlElementRef(name = "ResourceExceptionRuleScaleTypeMappings", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.Scorecard", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValuePairOfResourceExceptionRuleRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb> resourceExceptionRuleScaleTypeMappings;
    @XmlElementRef(name = "ScaleTypeExampleMappings", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.Scorecard", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO> scaleTypeExampleMappings;
    @XmlElementRef(name = "ScaleTypeThresholdDescriptionMappings", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.Scorecard", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO> scaleTypeThresholdDescriptionMappings;

    /**
     * Obtém o valor da propriedade criteriaTypeInfoCollection.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCriteriaTypeInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCriteriaTypeInfo> getCriteriaTypeInfoCollection() {
        return criteriaTypeInfoCollection;
    }

    /**
     * Define o valor da propriedade criteriaTypeInfoCollection.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCriteriaTypeInfo }{@code >}
     *     
     */
    public void setCriteriaTypeInfoCollection(JAXBElement<ArrayOfCriteriaTypeInfo> value) {
        this.criteriaTypeInfoCollection = value;
    }

    /**
     * Obtém o valor da propriedade resourceExceptionRuleExExampleMappings.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfResourceExceptionRuleExRuleTypestringFfzvU1AO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValuePairOfResourceExceptionRuleExRuleTypestringFfzvU1AO> getResourceExceptionRuleExExampleMappings() {
        return resourceExceptionRuleExExampleMappings;
    }

    /**
     * Define o valor da propriedade resourceExceptionRuleExExampleMappings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfResourceExceptionRuleExRuleTypestringFfzvU1AO }{@code >}
     *     
     */
    public void setResourceExceptionRuleExExampleMappings(JAXBElement<ArrayOfKeyValuePairOfResourceExceptionRuleExRuleTypestringFfzvU1AO> value) {
        this.resourceExceptionRuleExExampleMappings = value;
    }

    /**
     * Obtém o valor da propriedade resourceExceptionRuleExScaleTypeMappings.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfResourceExceptionRuleExRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValuePairOfResourceExceptionRuleExRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb> getResourceExceptionRuleExScaleTypeMappings() {
        return resourceExceptionRuleExScaleTypeMappings;
    }

    /**
     * Define o valor da propriedade resourceExceptionRuleExScaleTypeMappings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfResourceExceptionRuleExRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb }{@code >}
     *     
     */
    public void setResourceExceptionRuleExScaleTypeMappings(JAXBElement<ArrayOfKeyValuePairOfResourceExceptionRuleExRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb> value) {
        this.resourceExceptionRuleExScaleTypeMappings = value;
    }

    /**
     * Obtém o valor da propriedade resourceExceptionRuleExampleMappings.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfResourceExceptionRuleRuleTypestringFfzvU1AO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValuePairOfResourceExceptionRuleRuleTypestringFfzvU1AO> getResourceExceptionRuleExampleMappings() {
        return resourceExceptionRuleExampleMappings;
    }

    /**
     * Define o valor da propriedade resourceExceptionRuleExampleMappings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfResourceExceptionRuleRuleTypestringFfzvU1AO }{@code >}
     *     
     */
    public void setResourceExceptionRuleExampleMappings(JAXBElement<ArrayOfKeyValuePairOfResourceExceptionRuleRuleTypestringFfzvU1AO> value) {
        this.resourceExceptionRuleExampleMappings = value;
    }

    /**
     * Obtém o valor da propriedade resourceExceptionRuleScaleTypeMappings.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfResourceExceptionRuleRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValuePairOfResourceExceptionRuleRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb> getResourceExceptionRuleScaleTypeMappings() {
        return resourceExceptionRuleScaleTypeMappings;
    }

    /**
     * Define o valor da propriedade resourceExceptionRuleScaleTypeMappings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfResourceExceptionRuleRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb }{@code >}
     *     
     */
    public void setResourceExceptionRuleScaleTypeMappings(JAXBElement<ArrayOfKeyValuePairOfResourceExceptionRuleRuleTypeArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AOagVjbyjb> value) {
        this.resourceExceptionRuleScaleTypeMappings = value;
    }

    /**
     * Obtém o valor da propriedade scaleTypeExampleMappings.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO> getScaleTypeExampleMappings() {
        return scaleTypeExampleMappings;
    }

    /**
     * Define o valor da propriedade scaleTypeExampleMappings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO }{@code >}
     *     
     */
    public void setScaleTypeExampleMappings(JAXBElement<ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO> value) {
        this.scaleTypeExampleMappings = value;
    }

    /**
     * Obtém o valor da propriedade scaleTypeThresholdDescriptionMappings.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO> getScaleTypeThresholdDescriptionMappings() {
        return scaleTypeThresholdDescriptionMappings;
    }

    /**
     * Define o valor da propriedade scaleTypeThresholdDescriptionMappings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO }{@code >}
     *     
     */
    public void setScaleTypeThresholdDescriptionMappings(JAXBElement<ArrayOfKeyValuePairOfScorecardTemplateCriteriaScaleTypestringFfzvU1AO> value) {
        this.scaleTypeThresholdDescriptionMappings = value;
    }

}
