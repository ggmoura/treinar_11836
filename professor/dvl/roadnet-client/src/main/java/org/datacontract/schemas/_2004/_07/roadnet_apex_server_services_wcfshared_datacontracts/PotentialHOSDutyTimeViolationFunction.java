
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PotentialHOSDutyTimeViolationFunction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PotentialHOSDutyTimeViolationFunction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions}ResourceExceptionRuleFunction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaidBreaksConsideredHosOffDuty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UnpaidBreaksConsideredHosOffDuty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PotentialHOSDutyTimeViolationFunction", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", propOrder = {
    "paidBreaksConsideredHosOffDuty",
    "unpaidBreaksConsideredHosOffDuty"
})
public class PotentialHOSDutyTimeViolationFunction
    extends ResourceExceptionRuleFunction
{

    @XmlElement(name = "PaidBreaksConsideredHosOffDuty")
    protected Boolean paidBreaksConsideredHosOffDuty;
    @XmlElement(name = "UnpaidBreaksConsideredHosOffDuty")
    protected Boolean unpaidBreaksConsideredHosOffDuty;

    /**
     * Obtém o valor da propriedade paidBreaksConsideredHosOffDuty.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaidBreaksConsideredHosOffDuty() {
        return paidBreaksConsideredHosOffDuty;
    }

    /**
     * Define o valor da propriedade paidBreaksConsideredHosOffDuty.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaidBreaksConsideredHosOffDuty(Boolean value) {
        this.paidBreaksConsideredHosOffDuty = value;
    }

    /**
     * Obtém o valor da propriedade unpaidBreaksConsideredHosOffDuty.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnpaidBreaksConsideredHosOffDuty() {
        return unpaidBreaksConsideredHosOffDuty;
    }

    /**
     * Define o valor da propriedade unpaidBreaksConsideredHosOffDuty.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnpaidBreaksConsideredHosOffDuty(Boolean value) {
        this.unpaidBreaksConsideredHosOffDuty = value;
    }

}
