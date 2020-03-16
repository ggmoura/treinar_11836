
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SendNoteAction.LineItemNoteMessageArgs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SendNoteAction.LineItemNoteMessageArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}SendNoteAction.OrderNoteMessageArgs"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineItemEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendNoteAction.LineItemNoteMessageArgs", propOrder = {
    "lineItemEntityKey"
})
public class SendNoteActionLineItemNoteMessageArgs
    extends SendNoteActionOrderNoteMessageArgs
{

    @XmlElement(name = "LineItemEntityKey")
    protected Long lineItemEntityKey;

    /**
     * Obtém o valor da propriedade lineItemEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineItemEntityKey() {
        return lineItemEntityKey;
    }

    /**
     * Define o valor da propriedade lineItemEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineItemEntityKey(Long value) {
        this.lineItemEntityKey = value;
    }

}
