
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EquipmentService.PerformedMaintenanceDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentService.PerformedMaintenanceDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquipmentMaintenanceInfoEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentMaintenancePlanDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentMaintenancePlanIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentService.PerformedMaintenanceDetail", propOrder = {
    "equipmentMaintenanceInfoEntityKey",
    "equipmentMaintenancePlanDescription",
    "equipmentMaintenancePlanIdentifier"
})
public class EquipmentServicePerformedMaintenanceDetail {

    @XmlElement(name = "EquipmentMaintenanceInfoEntityKey")
    protected Long equipmentMaintenanceInfoEntityKey;
    @XmlElementRef(name = "EquipmentMaintenancePlanDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentMaintenancePlanDescription;
    @XmlElementRef(name = "EquipmentMaintenancePlanIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentMaintenancePlanIdentifier;

    /**
     * Obtém o valor da propriedade equipmentMaintenanceInfoEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEquipmentMaintenanceInfoEntityKey() {
        return equipmentMaintenanceInfoEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentMaintenanceInfoEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEquipmentMaintenanceInfoEntityKey(Long value) {
        this.equipmentMaintenanceInfoEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipmentMaintenancePlanDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentMaintenancePlanDescription() {
        return equipmentMaintenancePlanDescription;
    }

    /**
     * Define o valor da propriedade equipmentMaintenancePlanDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentMaintenancePlanDescription(JAXBElement<String> value) {
        this.equipmentMaintenancePlanDescription = value;
    }

    /**
     * Obtém o valor da propriedade equipmentMaintenancePlanIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentMaintenancePlanIdentifier() {
        return equipmentMaintenancePlanIdentifier;
    }

    /**
     * Define o valor da propriedade equipmentMaintenancePlanIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentMaintenancePlanIdentifier(JAXBElement<String> value) {
        this.equipmentMaintenancePlanIdentifier = value;
    }

}
