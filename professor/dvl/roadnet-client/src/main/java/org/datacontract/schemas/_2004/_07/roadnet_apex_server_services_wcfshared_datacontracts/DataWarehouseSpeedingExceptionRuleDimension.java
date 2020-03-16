
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.AggregateRootEntity;


/**
 * <p>Classe Java de DataWarehouseSpeedingExceptionRuleDimension complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseSpeedingExceptionRuleDimension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseResourceEventType_EventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResourceExceptionRule_RuleType_RuleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RuleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RuleIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseSpeedingExceptionRuleDimension", propOrder = {
    "dataWarehouseResourceEventTypeEventType",
    "resourceExceptionRuleRuleTypeRuleType",
    "ruleDescription",
    "ruleIdentifier"
})
public class DataWarehouseSpeedingExceptionRuleDimension
    extends AggregateRootEntity
{

    @XmlElementRef(name = "DataWarehouseResourceEventType_EventType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseResourceEventTypeEventType;
    @XmlElementRef(name = "ResourceExceptionRule_RuleType_RuleType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resourceExceptionRuleRuleTypeRuleType;
    @XmlElementRef(name = "RuleDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ruleDescription;
    @XmlElementRef(name = "RuleIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ruleIdentifier;

    /**
     * Obtém o valor da propriedade dataWarehouseResourceEventTypeEventType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseResourceEventTypeEventType() {
        return dataWarehouseResourceEventTypeEventType;
    }

    /**
     * Define o valor da propriedade dataWarehouseResourceEventTypeEventType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseResourceEventTypeEventType(JAXBElement<String> value) {
        this.dataWarehouseResourceEventTypeEventType = value;
    }

    /**
     * Obtém o valor da propriedade resourceExceptionRuleRuleTypeRuleType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResourceExceptionRuleRuleTypeRuleType() {
        return resourceExceptionRuleRuleTypeRuleType;
    }

    /**
     * Define o valor da propriedade resourceExceptionRuleRuleTypeRuleType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResourceExceptionRuleRuleTypeRuleType(JAXBElement<String> value) {
        this.resourceExceptionRuleRuleTypeRuleType = value;
    }

    /**
     * Obtém o valor da propriedade ruleDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRuleDescription() {
        return ruleDescription;
    }

    /**
     * Define o valor da propriedade ruleDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRuleDescription(JAXBElement<String> value) {
        this.ruleDescription = value;
    }

    /**
     * Obtém o valor da propriedade ruleIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRuleIdentifier() {
        return ruleIdentifier;
    }

    /**
     * Define o valor da propriedade ruleIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRuleIdentifier(JAXBElement<String> value) {
        this.ruleIdentifier = value;
    }

}
