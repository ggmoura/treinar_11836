
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de ServiceTimeAdjustToConstantOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceTimeAdjustToConstantOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ServiceTimeAdjustmentOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdjustToConstantValue" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceTimeAdjustToConstantOptions", propOrder = {
    "adjustToConstantValue"
})
public class ServiceTimeAdjustToConstantOptions
    extends ServiceTimeAdjustmentOptions
{

    @XmlElement(name = "AdjustToConstantValue")
    protected Duration adjustToConstantValue;

    /**
     * Obtém o valor da propriedade adjustToConstantValue.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAdjustToConstantValue() {
        return adjustToConstantValue;
    }

    /**
     * Define o valor da propriedade adjustToConstantValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAdjustToConstantValue(Duration value) {
        this.adjustToConstantValue = value;
    }

}
