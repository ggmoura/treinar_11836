
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de RetrievePositionTextResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrievePositionTextResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PositionText" type="{http://roadnet.com/apex/DataContracts/}PositionText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievePositionTextResult", propOrder = {
    "positionText"
})
public class RetrievePositionTextResult
    extends DataTransferObject
{

    @XmlElementRef(name = "PositionText", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PositionText> positionText;

    /**
     * Obtém o valor da propriedade positionText.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PositionText }{@code >}
     *     
     */
    public JAXBElement<PositionText> getPositionText() {
        return positionText;
    }

    /**
     * Define o valor da propriedade positionText.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PositionText }{@code >}
     *     
     */
    public void setPositionText(JAXBElement<PositionText> value) {
        this.positionText = value;
    }

}
