
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de StrategicRoutingSession complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StrategicRoutingSession"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RoutingSession"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsLockedBySupportUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LockedByUserEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategicRoutingSession", propOrder = {
    "isLockedBySupportUser",
    "lockedByUserEntityKey"
})
public class StrategicRoutingSession
    extends RoutingSession
{

    @XmlElement(name = "IsLockedBySupportUser")
    protected Boolean isLockedBySupportUser;
    @XmlElementRef(name = "LockedByUserEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> lockedByUserEntityKey;

    /**
     * Obtém o valor da propriedade isLockedBySupportUser.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLockedBySupportUser() {
        return isLockedBySupportUser;
    }

    /**
     * Define o valor da propriedade isLockedBySupportUser.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLockedBySupportUser(Boolean value) {
        this.isLockedBySupportUser = value;
    }

    /**
     * Obtém o valor da propriedade lockedByUserEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLockedByUserEntityKey() {
        return lockedByUserEntityKey;
    }

    /**
     * Define o valor da propriedade lockedByUserEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLockedByUserEntityKey(JAXBElement<Long> value) {
        this.lockedByUserEntityKey = value;
    }

}
