
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DataWarehouseStop complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseStop"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="ActualEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActualSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActualStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseRouteInternalKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PlannedEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlannedStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RouteDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RouteDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseStop", propOrder = {
    "actualDuration",
    "actualEndTime",
    "actualSequenceNumber",
    "actualStartTime",
    "dataWarehouseRouteInternalKey",
    "plannedDuration",
    "plannedEndTime",
    "plannedSequenceNumber",
    "plannedStartTime",
    "routeDate",
    "routeDescription",
    "routeIdentifier"
})
public class DataWarehouseStop
    extends DataTransferObject
{

    @XmlElement(name = "ActualDuration")
    protected Duration actualDuration;
    @XmlElement(name = "ActualEndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualEndTime;
    @XmlElementRef(name = "ActualSequenceNumber", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> actualSequenceNumber;
    @XmlElement(name = "ActualStartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualStartTime;
    @XmlElementRef(name = "DataWarehouseRouteInternalKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dataWarehouseRouteInternalKey;
    @XmlElement(name = "PlannedDuration")
    protected Duration plannedDuration;
    @XmlElement(name = "PlannedEndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar plannedEndTime;
    @XmlElementRef(name = "PlannedSequenceNumber", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> plannedSequenceNumber;
    @XmlElement(name = "PlannedStartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar plannedStartTime;
    @XmlElementRef(name = "RouteDate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> routeDate;
    @XmlElementRef(name = "RouteDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeDescription;
    @XmlElementRef(name = "RouteIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeIdentifier;

    /**
     * Obtém o valor da propriedade actualDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getActualDuration() {
        return actualDuration;
    }

    /**
     * Define o valor da propriedade actualDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setActualDuration(Duration value) {
        this.actualDuration = value;
    }

    /**
     * Obtém o valor da propriedade actualEndTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualEndTime() {
        return actualEndTime;
    }

    /**
     * Define o valor da propriedade actualEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualEndTime(XMLGregorianCalendar value) {
        this.actualEndTime = value;
    }

    /**
     * Obtém o valor da propriedade actualSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getActualSequenceNumber() {
        return actualSequenceNumber;
    }

    /**
     * Define o valor da propriedade actualSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setActualSequenceNumber(JAXBElement<Integer> value) {
        this.actualSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade actualStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualStartTime() {
        return actualStartTime;
    }

    /**
     * Define o valor da propriedade actualStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualStartTime(XMLGregorianCalendar value) {
        this.actualStartTime = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseRouteInternalKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDataWarehouseRouteInternalKey() {
        return dataWarehouseRouteInternalKey;
    }

    /**
     * Define o valor da propriedade dataWarehouseRouteInternalKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDataWarehouseRouteInternalKey(JAXBElement<Long> value) {
        this.dataWarehouseRouteInternalKey = value;
    }

    /**
     * Obtém o valor da propriedade plannedDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPlannedDuration() {
        return plannedDuration;
    }

    /**
     * Define o valor da propriedade plannedDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPlannedDuration(Duration value) {
        this.plannedDuration = value;
    }

    /**
     * Obtém o valor da propriedade plannedEndTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedEndTime() {
        return plannedEndTime;
    }

    /**
     * Define o valor da propriedade plannedEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedEndTime(XMLGregorianCalendar value) {
        this.plannedEndTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedSequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPlannedSequenceNumber() {
        return plannedSequenceNumber;
    }

    /**
     * Define o valor da propriedade plannedSequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPlannedSequenceNumber(JAXBElement<Integer> value) {
        this.plannedSequenceNumber = value;
    }

    /**
     * Obtém o valor da propriedade plannedStartTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedStartTime() {
        return plannedStartTime;
    }

    /**
     * Define o valor da propriedade plannedStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedStartTime(XMLGregorianCalendar value) {
        this.plannedStartTime = value;
    }

    /**
     * Obtém o valor da propriedade routeDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRouteDate() {
        return routeDate;
    }

    /**
     * Define o valor da propriedade routeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRouteDate(JAXBElement<XMLGregorianCalendar> value) {
        this.routeDate = value;
    }

    /**
     * Obtém o valor da propriedade routeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteDescription() {
        return routeDescription;
    }

    /**
     * Define o valor da propriedade routeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteDescription(JAXBElement<String> value) {
        this.routeDescription = value;
    }

    /**
     * Obtém o valor da propriedade routeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteIdentifier() {
        return routeIdentifier;
    }

    /**
     * Define o valor da propriedade routeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteIdentifier(JAXBElement<String> value) {
        this.routeIdentifier = value;
    }

}
