
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de PotentialHOSDutyTimeViolationDescriptor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PotentialHOSDutyTimeViolationDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions}ResourceExceptionSpecialDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PotentialDutyTimeViolationTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PotentialHOSDutyTimeViolationDescriptor", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", propOrder = {
    "potentialDutyTimeViolationTime"
})
public class PotentialHOSDutyTimeViolationDescriptor
    extends ResourceExceptionSpecialDescriptor
{

    @XmlElement(name = "PotentialDutyTimeViolationTime")
    protected Duration potentialDutyTimeViolationTime;

    /**
     * Obtém o valor da propriedade potentialDutyTimeViolationTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPotentialDutyTimeViolationTime() {
        return potentialDutyTimeViolationTime;
    }

    /**
     * Define o valor da propriedade potentialDutyTimeViolationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPotentialDutyTimeViolationTime(Duration value) {
        this.potentialDutyTimeViolationTime = value;
    }

}
