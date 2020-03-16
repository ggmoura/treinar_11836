
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfEquipmentPosition;


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
 *         &lt;element name="RetrieveEquipmentPositionUpdatesResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfEquipmentPosition" minOccurs="0"/&gt;
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
    "retrieveEquipmentPositionUpdatesResult"
})
@XmlRootElement(name = "RetrieveEquipmentPositionUpdatesResponse")
public class RetrieveEquipmentPositionUpdatesResponse {

    @XmlElementRef(name = "RetrieveEquipmentPositionUpdatesResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEquipmentPosition> retrieveEquipmentPositionUpdatesResult;

    /**
     * Obtém o valor da propriedade retrieveEquipmentPositionUpdatesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentPosition }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEquipmentPosition> getRetrieveEquipmentPositionUpdatesResult() {
        return retrieveEquipmentPositionUpdatesResult;
    }

    /**
     * Define o valor da propriedade retrieveEquipmentPositionUpdatesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentPosition }{@code >}
     *     
     */
    public void setRetrieveEquipmentPositionUpdatesResult(JAXBElement<ArrayOfEquipmentPosition> value) {
        this.retrieveEquipmentPositionUpdatesResult = value;
    }

}
