
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de PositionTextListResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PositionTextListResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PositionsTexts" type="{http://roadnet.com/apex/DataContracts/}ArrayOfPositionText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionTextListResult", propOrder = {
    "positionsTexts"
})
public class PositionTextListResult
    extends DataTransferObject
{

    @XmlElementRef(name = "PositionsTexts", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPositionText> positionsTexts;

    /**
     * Obtém o valor da propriedade positionsTexts.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPositionText }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPositionText> getPositionsTexts() {
        return positionsTexts;
    }

    /**
     * Define o valor da propriedade positionsTexts.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPositionText }{@code >}
     *     
     */
    public void setPositionsTexts(JAXBElement<ArrayOfPositionText> value) {
        this.positionsTexts = value;
    }

}
