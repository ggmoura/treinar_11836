
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.ResourceExceptionSpecialDescriptor;


/**
 * <p>Classe Java de ResourceException complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResourceException"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Coordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="IsAcknowledged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OrderEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PositionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryWorkerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryWorkerName" type="{http://roadnet.com/apex/DataContracts/}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="RegionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RuleEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SpecialDescriptor" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions}ResourceExceptionSpecialDescriptor" minOccurs="0"/&gt;
 *         &lt;element name="StopEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceException", propOrder = {
    "coordinate",
    "equipmentEntityKey",
    "isAcknowledged",
    "lineItemEntityKey",
    "mobileDeviceEntityKey",
    "orderEntityKey",
    "positionText",
    "primaryWorkerEntityKey",
    "primaryWorkerName",
    "regionDescription",
    "regionIdentifier",
    "routeEntityKey",
    "ruleEntityKey",
    "specialDescriptor",
    "stopEntityKey",
    "timestamp"
})
public class ResourceException
    extends RegionBasedAggregateRootEntity
{

    @XmlElementRef(name = "Coordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> coordinate;
    @XmlElementRef(name = "EquipmentEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> equipmentEntityKey;
    @XmlElement(name = "IsAcknowledged")
    protected Boolean isAcknowledged;
    @XmlElementRef(name = "LineItemEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> lineItemEntityKey;
    @XmlElementRef(name = "MobileDeviceEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> mobileDeviceEntityKey;
    @XmlElementRef(name = "OrderEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> orderEntityKey;
    @XmlElementRef(name = "PositionText", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> positionText;
    @XmlElementRef(name = "PrimaryWorkerEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> primaryWorkerEntityKey;
    @XmlElementRef(name = "PrimaryWorkerName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonName> primaryWorkerName;
    @XmlElementRef(name = "RegionDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionDescription;
    @XmlElementRef(name = "RegionIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionIdentifier;
    @XmlElementRef(name = "RouteEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> routeEntityKey;
    @XmlElement(name = "RuleEntityKey")
    protected Long ruleEntityKey;
    @XmlElementRef(name = "SpecialDescriptor", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceExceptionSpecialDescriptor> specialDescriptor;
    @XmlElementRef(name = "StopEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> stopEntityKey;
    @XmlElement(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

    /**
     * Obtém o valor da propriedade coordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getCoordinate() {
        return coordinate;
    }

    /**
     * Define o valor da propriedade coordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setCoordinate(JAXBElement<Coordinate> value) {
        this.coordinate = value;
    }

    /**
     * Obtém o valor da propriedade equipmentEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEquipmentEntityKey() {
        return equipmentEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEquipmentEntityKey(JAXBElement<Long> value) {
        this.equipmentEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade isAcknowledged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAcknowledged() {
        return isAcknowledged;
    }

    /**
     * Define o valor da propriedade isAcknowledged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAcknowledged(Boolean value) {
        this.isAcknowledged = value;
    }

    /**
     * Obtém o valor da propriedade lineItemEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLineItemEntityKey() {
        return lineItemEntityKey;
    }

    /**
     * Define o valor da propriedade lineItemEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLineItemEntityKey(JAXBElement<Long> value) {
        this.lineItemEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMobileDeviceEntityKey() {
        return mobileDeviceEntityKey;
    }

    /**
     * Define o valor da propriedade mobileDeviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMobileDeviceEntityKey(JAXBElement<Long> value) {
        this.mobileDeviceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade orderEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOrderEntityKey() {
        return orderEntityKey;
    }

    /**
     * Define o valor da propriedade orderEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOrderEntityKey(JAXBElement<Long> value) {
        this.orderEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade positionText.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPositionText() {
        return positionText;
    }

    /**
     * Define o valor da propriedade positionText.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPositionText(JAXBElement<String> value) {
        this.positionText = value;
    }

    /**
     * Obtém o valor da propriedade primaryWorkerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryWorkerEntityKey() {
        return primaryWorkerEntityKey;
    }

    /**
     * Define o valor da propriedade primaryWorkerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryWorkerEntityKey(JAXBElement<Long> value) {
        this.primaryWorkerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade primaryWorkerName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public JAXBElement<PersonName> getPrimaryWorkerName() {
        return primaryWorkerName;
    }

    /**
     * Define o valor da propriedade primaryWorkerName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonName }{@code >}
     *     
     */
    public void setPrimaryWorkerName(JAXBElement<PersonName> value) {
        this.primaryWorkerName = value;
    }

    /**
     * Obtém o valor da propriedade regionDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegionDescription() {
        return regionDescription;
    }

    /**
     * Define o valor da propriedade regionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegionDescription(JAXBElement<String> value) {
        this.regionDescription = value;
    }

    /**
     * Obtém o valor da propriedade regionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegionIdentifier() {
        return regionIdentifier;
    }

    /**
     * Define o valor da propriedade regionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegionIdentifier(JAXBElement<String> value) {
        this.regionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade routeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRouteEntityKey() {
        return routeEntityKey;
    }

    /**
     * Define o valor da propriedade routeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRouteEntityKey(JAXBElement<Long> value) {
        this.routeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade ruleEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRuleEntityKey() {
        return ruleEntityKey;
    }

    /**
     * Define o valor da propriedade ruleEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRuleEntityKey(Long value) {
        this.ruleEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade specialDescriptor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceExceptionSpecialDescriptor }{@code >}
     *     
     */
    public JAXBElement<ResourceExceptionSpecialDescriptor> getSpecialDescriptor() {
        return specialDescriptor;
    }

    /**
     * Define o valor da propriedade specialDescriptor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceExceptionSpecialDescriptor }{@code >}
     *     
     */
    public void setSpecialDescriptor(JAXBElement<ResourceExceptionSpecialDescriptor> value) {
        this.specialDescriptor = value;
    }

    /**
     * Obtém o valor da propriedade stopEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getStopEntityKey() {
        return stopEntityKey;
    }

    /**
     * Define o valor da propriedade stopEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setStopEntityKey(JAXBElement<Long> value) {
        this.stopEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade timestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Define o valor da propriedade timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

}
