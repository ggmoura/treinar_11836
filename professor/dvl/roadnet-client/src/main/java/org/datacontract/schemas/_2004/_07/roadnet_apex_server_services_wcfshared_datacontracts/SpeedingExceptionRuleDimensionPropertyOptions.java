
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de SpeedingExceptionRuleDimensionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SpeedingExceptionRuleDimensionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseResourceEventType_EventType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ResourceExceptionRule_RuleType_RuleType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RuleDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RuleIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedingExceptionRuleDimensionPropertyOptions", propOrder = {
    "dataWarehouseResourceEventTypeEventType",
    "resourceExceptionRuleRuleTypeRuleType",
    "ruleDescription",
    "ruleIdentifier"
})
public class SpeedingExceptionRuleDimensionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "DataWarehouseResourceEventType_EventType")
    protected Boolean dataWarehouseResourceEventTypeEventType;
    @XmlElement(name = "ResourceExceptionRule_RuleType_RuleType")
    protected Boolean resourceExceptionRuleRuleTypeRuleType;
    @XmlElement(name = "RuleDescription")
    protected Boolean ruleDescription;
    @XmlElement(name = "RuleIdentifier")
    protected Boolean ruleIdentifier;

    /**
     * Obtém o valor da propriedade dataWarehouseResourceEventTypeEventType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseResourceEventTypeEventType() {
        return dataWarehouseResourceEventTypeEventType;
    }

    /**
     * Define o valor da propriedade dataWarehouseResourceEventTypeEventType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseResourceEventTypeEventType(Boolean value) {
        this.dataWarehouseResourceEventTypeEventType = value;
    }

    /**
     * Obtém o valor da propriedade resourceExceptionRuleRuleTypeRuleType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResourceExceptionRuleRuleTypeRuleType() {
        return resourceExceptionRuleRuleTypeRuleType;
    }

    /**
     * Define o valor da propriedade resourceExceptionRuleRuleTypeRuleType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResourceExceptionRuleRuleTypeRuleType(Boolean value) {
        this.resourceExceptionRuleRuleTypeRuleType = value;
    }

    /**
     * Obtém o valor da propriedade ruleDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRuleDescription() {
        return ruleDescription;
    }

    /**
     * Define o valor da propriedade ruleDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRuleDescription(Boolean value) {
        this.ruleDescription = value;
    }

    /**
     * Obtém o valor da propriedade ruleIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRuleIdentifier() {
        return ruleIdentifier;
    }

    /**
     * Define o valor da propriedade ruleIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRuleIdentifier(Boolean value) {
        this.ruleIdentifier = value;
    }

}
