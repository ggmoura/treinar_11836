
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfEquipmentStatusDetails;


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
 *         &lt;element name="RetrieveEquipmentStatusDetailsByKeysResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfEquipmentStatusDetails" minOccurs="0"/&gt;
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
    "retrieveEquipmentStatusDetailsByKeysResult"
})
@XmlRootElement(name = "RetrieveEquipmentStatusDetailsByKeysResponse")
public class RetrieveEquipmentStatusDetailsByKeysResponse {

    @XmlElementRef(name = "RetrieveEquipmentStatusDetailsByKeysResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEquipmentStatusDetails> retrieveEquipmentStatusDetailsByKeysResult;

    /**
     * Obtém o valor da propriedade retrieveEquipmentStatusDetailsByKeysResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentStatusDetails }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEquipmentStatusDetails> getRetrieveEquipmentStatusDetailsByKeysResult() {
        return retrieveEquipmentStatusDetailsByKeysResult;
    }

    /**
     * Define o valor da propriedade retrieveEquipmentStatusDetailsByKeysResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentStatusDetails }{@code >}
     *     
     */
    public void setRetrieveEquipmentStatusDetailsByKeysResult(JAXBElement<ArrayOfEquipmentStatusDetails> value) {
        this.retrieveEquipmentStatusDetailsByKeysResult = value;
    }

}
