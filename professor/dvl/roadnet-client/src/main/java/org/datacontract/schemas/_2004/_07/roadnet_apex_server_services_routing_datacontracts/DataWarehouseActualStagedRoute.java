
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.Distance;
import com.roadnet.apex.datacontracts.Quantities;


/**
 * <p>Classe Java de DataWarehouseActualStagedRoute complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseActualStagedRoute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse}DataWarehouseStagedRoute"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActualCompleteTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActualDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActualStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DistanceToDestination" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="DistanceToDestinationGps" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="DistanceToDestinationOdometer" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="RunningQuantityAfterOrigin" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseActualStagedRoute", propOrder = {
    "actualArrivalTime",
    "actualCompleteTime",
    "actualDepartureTime",
    "actualStart",
    "distanceToDestination",
    "distanceToDestinationGps",
    "distanceToDestinationOdometer",
    "runningQuantityAfterOrigin"
})
public class DataWarehouseActualStagedRoute
    extends DataWarehouseStagedRoute
{

    @XmlElementRef(name = "ActualArrivalTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualArrivalTime;
    @XmlElementRef(name = "ActualCompleteTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualCompleteTime;
    @XmlElementRef(name = "ActualDepartureTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualDepartureTime;
    @XmlElement(name = "ActualStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualStart;
    @XmlElementRef(name = "DistanceToDestination", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> distanceToDestination;
    @XmlElementRef(name = "DistanceToDestinationGps", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> distanceToDestinationGps;
    @XmlElementRef(name = "DistanceToDestinationOdometer", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> distanceToDestinationOdometer;
    @XmlElementRef(name = "RunningQuantityAfterOrigin", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> runningQuantityAfterOrigin;

    /**
     * Obtém o valor da propriedade actualArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualArrivalTime() {
        return actualArrivalTime;
    }

    /**
     * Define o valor da propriedade actualArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualArrivalTime(JAXBElement<XMLGregorianCalendar> value) {
        this.actualArrivalTime = value;
    }

    /**
     * Obtém o valor da propriedade actualCompleteTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualCompleteTime() {
        return actualCompleteTime;
    }

    /**
     * Define o valor da propriedade actualCompleteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualCompleteTime(JAXBElement<XMLGregorianCalendar> value) {
        this.actualCompleteTime = value;
    }

    /**
     * Obtém o valor da propriedade actualDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualDepartureTime() {
        return actualDepartureTime;
    }

    /**
     * Define o valor da propriedade actualDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualDepartureTime(JAXBElement<XMLGregorianCalendar> value) {
        this.actualDepartureTime = value;
    }

    /**
     * Obtém o valor da propriedade actualStart.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualStart() {
        return actualStart;
    }

    /**
     * Define o valor da propriedade actualStart.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualStart(XMLGregorianCalendar value) {
        this.actualStart = value;
    }

    /**
     * Obtém o valor da propriedade distanceToDestination.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDistanceToDestination() {
        return distanceToDestination;
    }

    /**
     * Define o valor da propriedade distanceToDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDistanceToDestination(JAXBElement<Distance> value) {
        this.distanceToDestination = value;
    }

    /**
     * Obtém o valor da propriedade distanceToDestinationGps.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDistanceToDestinationGps() {
        return distanceToDestinationGps;
    }

    /**
     * Define o valor da propriedade distanceToDestinationGps.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDistanceToDestinationGps(JAXBElement<Distance> value) {
        this.distanceToDestinationGps = value;
    }

    /**
     * Obtém o valor da propriedade distanceToDestinationOdometer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDistanceToDestinationOdometer() {
        return distanceToDestinationOdometer;
    }

    /**
     * Define o valor da propriedade distanceToDestinationOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDistanceToDestinationOdometer(JAXBElement<Distance> value) {
        this.distanceToDestinationOdometer = value;
    }

    /**
     * Obtém o valor da propriedade runningQuantityAfterOrigin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getRunningQuantityAfterOrigin() {
        return runningQuantityAfterOrigin;
    }

    /**
     * Define o valor da propriedade runningQuantityAfterOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setRunningQuantityAfterOrigin(JAXBElement<Quantities> value) {
        this.runningQuantityAfterOrigin = value;
    }

}
