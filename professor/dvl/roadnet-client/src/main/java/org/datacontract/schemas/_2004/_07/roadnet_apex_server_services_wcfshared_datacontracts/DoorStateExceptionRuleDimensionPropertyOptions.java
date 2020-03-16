
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de DoorStateExceptionRuleDimensionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DoorStateExceptionRuleDimensionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
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
@XmlType(name = "DoorStateExceptionRuleDimensionPropertyOptions", propOrder = {
    "ruleDescription",
    "ruleIdentifier"
})
public class DoorStateExceptionRuleDimensionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "RuleDescription")
    protected Boolean ruleDescription;
    @XmlElement(name = "RuleIdentifier")
    protected Boolean ruleIdentifier;

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
