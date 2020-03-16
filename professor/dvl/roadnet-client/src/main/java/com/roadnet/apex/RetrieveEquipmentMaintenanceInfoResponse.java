
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfEquipmentMaintenanceInfo;


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
 *         &lt;element name="RetrieveEquipmentMaintenanceInfoResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfEquipmentMaintenanceInfo" minOccurs="0"/&gt;
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
    "retrieveEquipmentMaintenanceInfoResult"
})
@XmlRootElement(name = "RetrieveEquipmentMaintenanceInfoResponse")
public class RetrieveEquipmentMaintenanceInfoResponse {

    @XmlElementRef(name = "RetrieveEquipmentMaintenanceInfoResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEquipmentMaintenanceInfo> retrieveEquipmentMaintenanceInfoResult;

    /**
     * Obtém o valor da propriedade retrieveEquipmentMaintenanceInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentMaintenanceInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEquipmentMaintenanceInfo> getRetrieveEquipmentMaintenanceInfoResult() {
        return retrieveEquipmentMaintenanceInfoResult;
    }

    /**
     * Define o valor da propriedade retrieveEquipmentMaintenanceInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentMaintenanceInfo }{@code >}
     *     
     */
    public void setRetrieveEquipmentMaintenanceInfoResult(JAXBElement<ArrayOfEquipmentMaintenanceInfo> value) {
        this.retrieveEquipmentMaintenanceInfoResult = value;
    }

}
