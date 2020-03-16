
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DataWarehouseRouteData complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseRouteData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActualRouteArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActualRouteDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActualStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedRouteArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedRouteDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseRouteData", propOrder = {
    "actualEndTime",
    "actualRouteArrivalTime",
    "actualRouteDepartureTime",
    "actualStartTime",
    "plannedEndTime",
    "plannedRouteArrivalTime",
    "plannedRouteDepartureTime",
    "plannedStartTime"
})
public class DataWarehouseRouteData
    extends DataTransferObject
{

    @XmlElementRef(name = "ActualEndTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualEndTime;
    @XmlElementRef(name = "ActualRouteArrivalTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualRouteArrivalTime;
    @XmlElementRef(name = "ActualRouteDepartureTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualRouteDepartureTime;
    @XmlElementRef(name = "ActualStartTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualStartTime;
    @XmlElementRef(name = "PlannedEndTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedEndTime;
    @XmlElementRef(name = "PlannedRouteArrivalTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedRouteArrivalTime;
    @XmlElementRef(name = "PlannedRouteDepartureTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedRouteDepartureTime;
    @XmlElementRef(name = "PlannedStartTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedStartTime;

    /**
     * Obtém o valor da propriedade actualEndTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualEndTime() {
        return actualEndTime;
    }

    /**
     * Define o valor da propriedade actualEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualEndTime(JAXBElement<XMLGregorianCalendar> value) {
        this.actualEndTime = value;
    }

    /**
     * Obtém o valor da propriedade actualRouteArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualRouteArrivalTime() {
        return actualRouteArrivalTime;
    }

    /**
     * Define o valor da propriedade actualRouteArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualRouteArrivalTime(JAXBElement<XMLGregorianCalendar> value) {
        this.actualRouteArrivalTime = value;
    }

    /**
     * Obtém o valor da propriedade actualRouteDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualRouteDepartureTime() {
        return actualRouteDepartureTime;
    }

    /**
     * Define o valor da propriedade actualRouteDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualRouteDepartureTime(JAXBElement<XMLGregorianCalendar> value) {
        this.actualRouteDepartureTime = value;
    }

    /**
     * Obtém o valor da propriedade actualStartTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualStartTime() {
        return actualStartTime;
    }

    /**
     * Define o valor da propriedade actualStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.actualStartTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedEndTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedEndTime() {
        return plannedEndTime;
    }

    /**
     * Define o valor da propriedade plannedEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedEndTime(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedEndTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedRouteArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedRouteArrivalTime() {
        return plannedRouteArrivalTime;
    }

    /**
     * Define o valor da propriedade plannedRouteArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedRouteArrivalTime(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedRouteArrivalTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedRouteDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedRouteDepartureTime() {
        return plannedRouteDepartureTime;
    }

    /**
     * Define o valor da propriedade plannedRouteDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedRouteDepartureTime(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedRouteDepartureTime = value;
    }

    /**
     * Obtém o valor da propriedade plannedStartTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedStartTime() {
        return plannedStartTime;
    }

    /**
     * Define o valor da propriedade plannedStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedStartTime = value;
    }

}
