
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.EquipmentDataHistoryResult;


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
 *         &lt;element name="RetrieveEquipmentDataHistoryResult" type="{http://roadnet.com/apex/DataContracts/}EquipmentDataHistoryResult" minOccurs="0"/&gt;
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
    "retrieveEquipmentDataHistoryResult"
})
@XmlRootElement(name = "RetrieveEquipmentDataHistoryResponse")
public class RetrieveEquipmentDataHistoryResponse {

    @XmlElementRef(name = "RetrieveEquipmentDataHistoryResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<EquipmentDataHistoryResult> retrieveEquipmentDataHistoryResult;

    /**
     * Obtém o valor da propriedade retrieveEquipmentDataHistoryResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EquipmentDataHistoryResult }{@code >}
     *     
     */
    public JAXBElement<EquipmentDataHistoryResult> getRetrieveEquipmentDataHistoryResult() {
        return retrieveEquipmentDataHistoryResult;
    }

    /**
     * Define o valor da propriedade retrieveEquipmentDataHistoryResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EquipmentDataHistoryResult }{@code >}
     *     
     */
    public void setRetrieveEquipmentDataHistoryResult(JAXBElement<EquipmentDataHistoryResult> value) {
        this.retrieveEquipmentDataHistoryResult = value;
    }

}
