
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.EquipmentPositionHistoryResult;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetrieveEquipmentPositionHistoryResult" type="{http://roadnet.com/apex/DataContracts/}EquipmentPositionHistoryResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "retrieveEquipmentPositionHistoryResult"
})
@XmlRootElement(name = "RetrieveEquipmentPositionHistoryResponse")
public class RetrieveEquipmentPositionHistoryResponse {

    @XmlElementRef(name = "RetrieveEquipmentPositionHistoryResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<EquipmentPositionHistoryResult> retrieveEquipmentPositionHistoryResult;

    /**
     * Obtém o valor da propriedade retrieveEquipmentPositionHistoryResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EquipmentPositionHistoryResult }{@code >}
     *     
     */
    public JAXBElement<EquipmentPositionHistoryResult> getRetrieveEquipmentPositionHistoryResult() {
        return retrieveEquipmentPositionHistoryResult;
    }

    /**
     * Define o valor da propriedade retrieveEquipmentPositionHistoryResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EquipmentPositionHistoryResult }{@code >}
     *     
     */
    public void setRetrieveEquipmentPositionHistoryResult(JAXBElement<EquipmentPositionHistoryResult> value) {
        this.retrieveEquipmentPositionHistoryResult = value;
    }

}
