
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IntersectionNodePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IntersectionNodePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}MapNodePropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PenalizedTurns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntersectionNodePropertyOptions", propOrder = {
    "penalizedTurns"
})
public class IntersectionNodePropertyOptions
    extends MapNodePropertyOptions
{

    @XmlElement(name = "PenalizedTurns")
    protected Boolean penalizedTurns;

    /**
     * Obtém o valor da propriedade penalizedTurns.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPenalizedTurns() {
        return penalizedTurns;
    }

    /**
     * Define o valor da propriedade penalizedTurns.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPenalizedTurns(Boolean value) {
        this.penalizedTurns = value;
    }

}
