
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de EquipmentPositionHistoryResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentPositionHistoryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquipmentDataHistories" type="{http://roadnet.com/apex/DataContracts/}ArrayOfEquipmentDataHistory" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentPositionHistoryResult", propOrder = {
    "equipmentDataHistories"
})
public class EquipmentPositionHistoryResult
    extends DataTransferObject
{

    @XmlElementRef(name = "EquipmentDataHistories", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEquipmentDataHistory> equipmentDataHistories;

    /**
     * Obtém o valor da propriedade equipmentDataHistories.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentDataHistory }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEquipmentDataHistory> getEquipmentDataHistories() {
        return equipmentDataHistories;
    }

    /**
     * Define o valor da propriedade equipmentDataHistories.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentDataHistory }{@code >}
     *     
     */
    public void setEquipmentDataHistories(JAXBElement<ArrayOfEquipmentDataHistory> value) {
        this.equipmentDataHistories = value;
    }

}
