
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de NetworkTurnRule complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkTurnRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Penalty" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkTurnRule", propOrder = {
    "penalty"
})
public class NetworkTurnRule
    extends DataTransferObject
{

    @XmlElement(name = "Penalty")
    protected Duration penalty;

    /**
     * Obtém o valor da propriedade penalty.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPenalty() {
        return penalty;
    }

    /**
     * Define o valor da propriedade penalty.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPenalty(Duration value) {
        this.penalty = value;
    }

}
