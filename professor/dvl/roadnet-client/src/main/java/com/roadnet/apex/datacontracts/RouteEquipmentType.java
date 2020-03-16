
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteEquipmentType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteEquipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RouteEquipmentBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquipmentTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteEquipmentType", propOrder = {
    "equipmentTypeEntityKey"
})
public class RouteEquipmentType
    extends RouteEquipmentBase
{

    @XmlElement(name = "EquipmentTypeEntityKey")
    protected Long equipmentTypeEntityKey;

    /**
     * Obtém o valor da propriedade equipmentTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEquipmentTypeEntityKey() {
        return equipmentTypeEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEquipmentTypeEntityKey(Long value) {
        this.equipmentTypeEntityKey = value;
    }

}
