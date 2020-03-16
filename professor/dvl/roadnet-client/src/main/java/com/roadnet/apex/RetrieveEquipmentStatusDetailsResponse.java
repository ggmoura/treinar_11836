
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RetrieveEquipmentStatusDetailsResults;


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
 *         &lt;element name="RetrieveEquipmentStatusDetailsResult" type="{http://roadnet.com/apex/DataContracts/}RetrieveEquipmentStatusDetailsResults" minOccurs="0"/&gt;
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
    "retrieveEquipmentStatusDetailsResult"
})
@XmlRootElement(name = "RetrieveEquipmentStatusDetailsResponse")
public class RetrieveEquipmentStatusDetailsResponse {

    @XmlElementRef(name = "RetrieveEquipmentStatusDetailsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RetrieveEquipmentStatusDetailsResults> retrieveEquipmentStatusDetailsResult;

    /**
     * Obtém o valor da propriedade retrieveEquipmentStatusDetailsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetrieveEquipmentStatusDetailsResults }{@code >}
     *     
     */
    public JAXBElement<RetrieveEquipmentStatusDetailsResults> getRetrieveEquipmentStatusDetailsResult() {
        return retrieveEquipmentStatusDetailsResult;
    }

    /**
     * Define o valor da propriedade retrieveEquipmentStatusDetailsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetrieveEquipmentStatusDetailsResults }{@code >}
     *     
     */
    public void setRetrieveEquipmentStatusDetailsResult(JAXBElement<RetrieveEquipmentStatusDetailsResults> value) {
        this.retrieveEquipmentStatusDetailsResult = value;
    }

}
