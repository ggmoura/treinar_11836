
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de ServiceableStopServiceTimeDeviationFunction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceableStopServiceTimeDeviationFunction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions}ResourceExceptionRuleFunction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MinimumVariance" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="VariancePercentage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceableStopServiceTimeDeviationFunction", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", propOrder = {
    "minimumVariance",
    "variancePercentage"
})
public class ServiceableStopServiceTimeDeviationFunction
    extends ResourceExceptionRuleFunction
{

    @XmlElement(name = "MinimumVariance")
    protected Duration minimumVariance;
    @XmlElement(name = "VariancePercentage")
    protected Long variancePercentage;

    /**
     * Obtém o valor da propriedade minimumVariance.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumVariance() {
        return minimumVariance;
    }

    /**
     * Define o valor da propriedade minimumVariance.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumVariance(Duration value) {
        this.minimumVariance = value;
    }

    /**
     * Obtém o valor da propriedade variancePercentage.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVariancePercentage() {
        return variancePercentage;
    }

    /**
     * Define o valor da propriedade variancePercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVariancePercentage(Long value) {
        this.variancePercentage = value;
    }

}
