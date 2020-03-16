
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DataWarehouseKpiRulesSet complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseKpiRulesSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseKpi_KpiGroupByType_GroupByType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseRuleAction_RuleAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Groupings" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}ArrayOfDimensionDescriber" minOccurs="0"/&gt;
 *         &lt;element name="LockLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RuleActionSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Rules" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}ArrayOfDataWarehouseKpiRule" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseKpiRulesSet", propOrder = {
    "dataWarehouseKpiKpiGroupByTypeGroupByType",
    "dataWarehouseRuleActionRuleAction",
    "groupings",
    "lockLevel",
    "ruleActionSpecified",
    "rules"
})
public class DataWarehouseKpiRulesSet
    extends DataTransferObject
{

    @XmlElementRef(name = "DataWarehouseKpi_KpiGroupByType_GroupByType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseKpiKpiGroupByTypeGroupByType;
    @XmlElementRef(name = "DataWarehouseRuleAction_RuleAction", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseRuleActionRuleAction;
    @XmlElementRef(name = "Groupings", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDimensionDescriber> groupings;
    @XmlElement(name = "LockLevel")
    protected Boolean lockLevel;
    @XmlElement(name = "RuleActionSpecified")
    protected Boolean ruleActionSpecified;
    @XmlElementRef(name = "Rules", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDataWarehouseKpiRule> rules;

    /**
     * Obtém o valor da propriedade dataWarehouseKpiKpiGroupByTypeGroupByType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseKpiKpiGroupByTypeGroupByType() {
        return dataWarehouseKpiKpiGroupByTypeGroupByType;
    }

    /**
     * Define o valor da propriedade dataWarehouseKpiKpiGroupByTypeGroupByType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseKpiKpiGroupByTypeGroupByType(JAXBElement<String> value) {
        this.dataWarehouseKpiKpiGroupByTypeGroupByType = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseRuleActionRuleAction.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseRuleActionRuleAction() {
        return dataWarehouseRuleActionRuleAction;
    }

    /**
     * Define o valor da propriedade dataWarehouseRuleActionRuleAction.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseRuleActionRuleAction(JAXBElement<String> value) {
        this.dataWarehouseRuleActionRuleAction = value;
    }

    /**
     * Obtém o valor da propriedade groupings.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDimensionDescriber }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDimensionDescriber> getGroupings() {
        return groupings;
    }

    /**
     * Define o valor da propriedade groupings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDimensionDescriber }{@code >}
     *     
     */
    public void setGroupings(JAXBElement<ArrayOfDimensionDescriber> value) {
        this.groupings = value;
    }

    /**
     * Obtém o valor da propriedade lockLevel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockLevel() {
        return lockLevel;
    }

    /**
     * Define o valor da propriedade lockLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockLevel(Boolean value) {
        this.lockLevel = value;
    }

    /**
     * Obtém o valor da propriedade ruleActionSpecified.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRuleActionSpecified() {
        return ruleActionSpecified;
    }

    /**
     * Define o valor da propriedade ruleActionSpecified.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRuleActionSpecified(Boolean value) {
        this.ruleActionSpecified = value;
    }

    /**
     * Obtém o valor da propriedade rules.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseKpiRule }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDataWarehouseKpiRule> getRules() {
        return rules;
    }

    /**
     * Define o valor da propriedade rules.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseKpiRule }{@code >}
     *     
     */
    public void setRules(JAXBElement<ArrayOfDataWarehouseKpiRule> value) {
        this.rules = value;
    }

}
