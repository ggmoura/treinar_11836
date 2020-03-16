
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de EquipmentDropHookEventPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentDropHookEventPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DropHookEventType_EventType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsEmpty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TrailerIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentDropHookEventPropertyOptions", propOrder = {
    "dropHookEventTypeEventType",
    "equipmentEntityKey",
    "isEmpty",
    "routeEntityKey",
    "stopEntityKey",
    "timestamp",
    "trailerIdentifier"
})
public class EquipmentDropHookEventPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "DropHookEventType_EventType")
    protected Boolean dropHookEventTypeEventType;
    @XmlElement(name = "EquipmentEntityKey")
    protected Boolean equipmentEntityKey;
    @XmlElement(name = "IsEmpty")
    protected Boolean isEmpty;
    @XmlElement(name = "RouteEntityKey")
    protected Boolean routeEntityKey;
    @XmlElement(name = "StopEntityKey")
    protected Boolean stopEntityKey;
    @XmlElement(name = "Timestamp")
    protected Boolean timestamp;
    @XmlElement(name = "TrailerIdentifier")
    protected Boolean trailerIdentifier;

    /**
     * Obtém o valor da propriedade dropHookEventTypeEventType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDropHookEventTypeEventType() {
        return dropHookEventTypeEventType;
    }

    /**
     * Define o valor da propriedade dropHookEventTypeEventType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDropHookEventTypeEventType(Boolean value) {
        this.dropHookEventTypeEventType = value;
    }

    /**
     * Obtém o valor da propriedade equipmentEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquipmentEntityKey() {
        return equipmentEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquipmentEntityKey(Boolean value) {
        this.equipmentEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade isEmpty.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEmpty() {
        return isEmpty;
    }

    /**
     * Define o valor da propriedade isEmpty.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEmpty(Boolean value) {
        this.isEmpty = value;
    }

    /**
     * Obtém o valor da propriedade routeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteEntityKey() {
        return routeEntityKey;
    }

    /**
     * Define o valor da propriedade routeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteEntityKey(Boolean value) {
        this.routeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade stopEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopEntityKey() {
        return stopEntityKey;
    }

    /**
     * Define o valor da propriedade stopEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopEntityKey(Boolean value) {
        this.stopEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade timestamp.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimestamp() {
        return timestamp;
    }

    /**
     * Define o valor da propriedade timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimestamp(Boolean value) {
        this.timestamp = value;
    }

    /**
     * Obtém o valor da propriedade trailerIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrailerIdentifier() {
        return trailerIdentifier;
    }

    /**
     * Define o valor da propriedade trailerIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrailerIdentifier(Boolean value) {
        this.trailerIdentifier = value;
    }

}
