
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EquipmentTypeRestrictionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentTypeRestrictionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowDisallow_Rule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentTypeRestrictionPropertyOptions", propOrder = {
    "allowDisallowRule",
    "equipmentTypeEntityKeys"
})
public class EquipmentTypeRestrictionPropertyOptions {

    @XmlElement(name = "AllowDisallow_Rule")
    protected Boolean allowDisallowRule;
    @XmlElement(name = "EquipmentTypeEntityKeys")
    protected Boolean equipmentTypeEntityKeys;

    /**
     * Obtém o valor da propriedade allowDisallowRule.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowDisallowRule() {
        return allowDisallowRule;
    }

    /**
     * Define o valor da propriedade allowDisallowRule.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowDisallowRule(Boolean value) {
        this.allowDisallowRule = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentTypeEntityKeys() {
        return equipmentTypeEntityKeys;
    }

    /**
     * Define o valor da propriedade equipmentTypeEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentTypeEntityKeys(Boolean value) {
        this.equipmentTypeEntityKeys = value;
    }

}
