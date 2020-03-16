
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ServiceTimeAdjustByPercentageOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceTimeAdjustByPercentageOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ServiceTimeAdjustmentOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdjustByPercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceTimeAdjustByPercentageOptions", propOrder = {
    "adjustByPercentage"
})
public class ServiceTimeAdjustByPercentageOptions
    extends ServiceTimeAdjustmentOptions
{

    @XmlElement(name = "AdjustByPercentage")
    protected Double adjustByPercentage;

    /**
     * Obtém o valor da propriedade adjustByPercentage.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjustByPercentage() {
        return adjustByPercentage;
    }

    /**
     * Define o valor da propriedade adjustByPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjustByPercentage(Double value) {
        this.adjustByPercentage = value;
    }

}
