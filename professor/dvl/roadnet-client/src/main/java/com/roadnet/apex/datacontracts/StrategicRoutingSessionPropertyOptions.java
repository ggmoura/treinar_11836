
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de StrategicRoutingSessionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StrategicRoutingSessionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RoutingSessionPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LockedByUserEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategicRoutingSessionPropertyOptions", propOrder = {
    "lockedByUserEntityKey"
})
public class StrategicRoutingSessionPropertyOptions
    extends RoutingSessionPropertyOptions
{

    @XmlElement(name = "LockedByUserEntityKey")
    protected Boolean lockedByUserEntityKey;

    /**
     * Obtém o valor da propriedade lockedByUserEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockedByUserEntityKey() {
        return lockedByUserEntityKey;
    }

    /**
     * Define o valor da propriedade lockedByUserEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockedByUserEntityKey(Boolean value) {
        this.lockedByUserEntityKey = value;
    }

}
