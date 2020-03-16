
package com.roadnet.apex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="SwitchDataWarehouseMappingModeResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "switchDataWarehouseMappingModeResult"
})
@XmlRootElement(name = "SwitchDataWarehouseMappingModeResponse")
public class SwitchDataWarehouseMappingModeResponse {

    @XmlElement(name = "SwitchDataWarehouseMappingModeResult")
    protected Boolean switchDataWarehouseMappingModeResult;

    /**
     * Obtém o valor da propriedade switchDataWarehouseMappingModeResult.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSwitchDataWarehouseMappingModeResult() {
        return switchDataWarehouseMappingModeResult;
    }

    /**
     * Define o valor da propriedade switchDataWarehouseMappingModeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSwitchDataWarehouseMappingModeResult(Boolean value) {
        this.switchDataWarehouseMappingModeResult = value;
    }

}
