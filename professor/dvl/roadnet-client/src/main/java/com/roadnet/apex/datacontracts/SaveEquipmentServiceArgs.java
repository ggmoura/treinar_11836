
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de SaveEquipmentServiceArgs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SaveEquipmentServiceArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DateOfService" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Odometer" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="PerformedMaintenanceUpdates" type="{http://roadnet.com/apex/DataContracts/}ArrayOfUpdatePerformedMaintenanceArgs" minOccurs="0"/&gt;
 *         &lt;element name="TotalEngineRuntime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="Vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveEquipmentServiceArgs", propOrder = {
    "cost",
    "dateOfService",
    "duration",
    "entityKey",
    "equipmentEntityKey",
    "notes",
    "odometer",
    "performedMaintenanceUpdates",
    "totalEngineRuntime",
    "vendor"
})
public class SaveEquipmentServiceArgs
    extends DataTransferObject
{

    @XmlElementRef(name = "Cost", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cost;
    @XmlElementRef(name = "DateOfService", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateOfService;
    @XmlElementRef(name = "Duration", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> duration;
    @XmlElement(name = "EntityKey")
    protected Long entityKey;
    @XmlElement(name = "EquipmentEntityKey")
    protected Long equipmentEntityKey;
    @XmlElementRef(name = "Notes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlElementRef(name = "Odometer", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> odometer;
    @XmlElementRef(name = "PerformedMaintenanceUpdates", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUpdatePerformedMaintenanceArgs> performedMaintenanceUpdates;
    @XmlElementRef(name = "TotalEngineRuntime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> totalEngineRuntime;
    @XmlElementRef(name = "Vendor", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendor;

    /**
     * Obtém o valor da propriedade cost.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCost() {
        return cost;
    }

    /**
     * Define o valor da propriedade cost.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCost(JAXBElement<Double> value) {
        this.cost = value;
    }

    /**
     * Obtém o valor da propriedade dateOfService.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateOfService() {
        return dateOfService;
    }

    /**
     * Define o valor da propriedade dateOfService.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateOfService(JAXBElement<XMLGregorianCalendar> value) {
        this.dateOfService = value;
    }

    /**
     * Obtém o valor da propriedade duration.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getDuration() {
        return duration;
    }

    /**
     * Define o valor da propriedade duration.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setDuration(JAXBElement<Duration> value) {
        this.duration = value;
    }

    /**
     * Obtém o valor da propriedade entityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntityKey() {
        return entityKey;
    }

    /**
     * Define o valor da propriedade entityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntityKey(Long value) {
        this.entityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipmentEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEquipmentEntityKey() {
        return equipmentEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEquipmentEntityKey(Long value) {
        this.equipmentEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade notes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotes() {
        return notes;
    }

    /**
     * Define o valor da propriedade notes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotes(JAXBElement<String> value) {
        this.notes = value;
    }

    /**
     * Obtém o valor da propriedade odometer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getOdometer() {
        return odometer;
    }

    /**
     * Define o valor da propriedade odometer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setOdometer(JAXBElement<Distance> value) {
        this.odometer = value;
    }

    /**
     * Obtém o valor da propriedade performedMaintenanceUpdates.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUpdatePerformedMaintenanceArgs }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUpdatePerformedMaintenanceArgs> getPerformedMaintenanceUpdates() {
        return performedMaintenanceUpdates;
    }

    /**
     * Define o valor da propriedade performedMaintenanceUpdates.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUpdatePerformedMaintenanceArgs }{@code >}
     *     
     */
    public void setPerformedMaintenanceUpdates(JAXBElement<ArrayOfUpdatePerformedMaintenanceArgs> value) {
        this.performedMaintenanceUpdates = value;
    }

    /**
     * Obtém o valor da propriedade totalEngineRuntime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getTotalEngineRuntime() {
        return totalEngineRuntime;
    }

    /**
     * Define o valor da propriedade totalEngineRuntime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setTotalEngineRuntime(JAXBElement<Duration> value) {
        this.totalEngineRuntime = value;
    }

    /**
     * Obtém o valor da propriedade vendor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendor() {
        return vendor;
    }

    /**
     * Define o valor da propriedade vendor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendor(JAXBElement<String> value) {
        this.vendor = value;
    }

}
