
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query_datawarehouse_roadnet_apex_server_services_query.AndMeasureRule;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query_datawarehouse_roadnet_apex_server_services_query.OrMeasureRule;


/**
 * <p>Classe Java de CompositeMeasureRuleBase complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CompositeMeasureRuleBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}IMeasureRule"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rules" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}ArrayOfIMeasureRule" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeMeasureRuleBase", propOrder = {
    "rules"
})
@XmlSeeAlso({
    AndMeasureRule.class,
    OrMeasureRule.class
})
public class CompositeMeasureRuleBase
    extends IMeasureRule
{

    @XmlElementRef(name = "Rules", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfIMeasureRule> rules;

    /**
     * Obtém o valor da propriedade rules.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIMeasureRule }{@code >}
     *     
     */
    public JAXBElement<ArrayOfIMeasureRule> getRules() {
        return rules;
    }

    /**
     * Define o valor da propriedade rules.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIMeasureRule }{@code >}
     *     
     */
    public void setRules(JAXBElement<ArrayOfIMeasureRule> value) {
        this.rules = value;
    }

}
