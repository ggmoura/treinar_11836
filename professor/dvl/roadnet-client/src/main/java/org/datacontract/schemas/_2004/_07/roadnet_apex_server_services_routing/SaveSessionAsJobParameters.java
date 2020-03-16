
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.Depot;
import com.roadnet.apex.datacontracts.SessionMode;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de SaveSessionAsJobParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SaveSessionAsJobParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ArchivedRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BuiltRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DispatchedRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessionBusinessWeek" type="{http://roadnet.com/apex/DataContracts/}DayOfWeekFlags" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessionDepot" type="{http://roadnet.com/apex/DataContracts/}Depot" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessionHasBusinessWeekOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessionMode" type="{http://roadnet.com/apex/DataContracts/}SessionMode" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessionNumberOfTimeUnits" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoutingSessionStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="UnassignAllOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UnassignedOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveSessionAsJobParameters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SaveSessionAs", propOrder = {
    "activeRoutes",
    "archivedRoutes",
    "builtRoutes",
    "dispatchedRoutes",
    "routingSessionBusinessWeek",
    "routingSessionDepot",
    "routingSessionDescription",
    "routingSessionEntityKey",
    "routingSessionHasBusinessWeekOverride",
    "routingSessionMode",
    "routingSessionNumberOfTimeUnits",
    "routingSessionStartDate",
    "unassignAllOrders",
    "unassignedOrders"
})
public class SaveSessionAsJobParameters
    extends DataTransferObject
{

    @XmlElement(name = "ActiveRoutes")
    protected Boolean activeRoutes;
    @XmlElement(name = "ArchivedRoutes")
    protected Boolean archivedRoutes;
    @XmlElement(name = "BuiltRoutes")
    protected Boolean builtRoutes;
    @XmlElement(name = "DispatchedRoutes")
    protected Boolean dispatchedRoutes;
    @XmlList
    @XmlElement(name = "RoutingSessionBusinessWeek")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> routingSessionBusinessWeek;
    @XmlElementRef(name = "RoutingSessionDepot", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SaveSessionAs", type = JAXBElement.class, required = false)
    protected JAXBElement<Depot> routingSessionDepot;
    @XmlElementRef(name = "RoutingSessionDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SaveSessionAs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routingSessionDescription;
    @XmlElement(name = "RoutingSessionEntityKey")
    protected Long routingSessionEntityKey;
    @XmlElement(name = "RoutingSessionHasBusinessWeekOverride")
    protected Boolean routingSessionHasBusinessWeekOverride;
    @XmlElement(name = "RoutingSessionMode")
    @XmlSchemaType(name = "string")
    protected SessionMode routingSessionMode;
    @XmlElement(name = "RoutingSessionNumberOfTimeUnits")
    protected Integer routingSessionNumberOfTimeUnits;
    @XmlElementRef(name = "RoutingSessionStartDate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SaveSessionAs", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> routingSessionStartDate;
    @XmlElement(name = "UnassignAllOrders")
    protected Boolean unassignAllOrders;
    @XmlElement(name = "UnassignedOrders")
    protected Boolean unassignedOrders;

    /**
     * Obtém o valor da propriedade activeRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveRoutes() {
        return activeRoutes;
    }

    /**
     * Define o valor da propriedade activeRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveRoutes(Boolean value) {
        this.activeRoutes = value;
    }

    /**
     * Obtém o valor da propriedade archivedRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArchivedRoutes() {
        return archivedRoutes;
    }

    /**
     * Define o valor da propriedade archivedRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArchivedRoutes(Boolean value) {
        this.archivedRoutes = value;
    }

    /**
     * Obtém o valor da propriedade builtRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuiltRoutes() {
        return builtRoutes;
    }

    /**
     * Define o valor da propriedade builtRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuiltRoutes(Boolean value) {
        this.builtRoutes = value;
    }

    /**
     * Obtém o valor da propriedade dispatchedRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDispatchedRoutes() {
        return dispatchedRoutes;
    }

    /**
     * Define o valor da propriedade dispatchedRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDispatchedRoutes(Boolean value) {
        this.dispatchedRoutes = value;
    }

    /**
     * Gets the value of the routingSessionBusinessWeek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingSessionBusinessWeek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingSessionBusinessWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoutingSessionBusinessWeek() {
        if (routingSessionBusinessWeek == null) {
            routingSessionBusinessWeek = new ArrayList<String>();
        }
        return this.routingSessionBusinessWeek;
    }

    /**
     * Obtém o valor da propriedade routingSessionDepot.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Depot }{@code >}
     *     
     */
    public JAXBElement<Depot> getRoutingSessionDepot() {
        return routingSessionDepot;
    }

    /**
     * Define o valor da propriedade routingSessionDepot.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Depot }{@code >}
     *     
     */
    public void setRoutingSessionDepot(JAXBElement<Depot> value) {
        this.routingSessionDepot = value;
    }

    /**
     * Obtém o valor da propriedade routingSessionDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoutingSessionDescription() {
        return routingSessionDescription;
    }

    /**
     * Define o valor da propriedade routingSessionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoutingSessionDescription(JAXBElement<String> value) {
        this.routingSessionDescription = value;
    }

    /**
     * Obtém o valor da propriedade routingSessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRoutingSessionEntityKey() {
        return routingSessionEntityKey;
    }

    /**
     * Define o valor da propriedade routingSessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRoutingSessionEntityKey(Long value) {
        this.routingSessionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade routingSessionHasBusinessWeekOverride.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoutingSessionHasBusinessWeekOverride() {
        return routingSessionHasBusinessWeekOverride;
    }

    /**
     * Define o valor da propriedade routingSessionHasBusinessWeekOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoutingSessionHasBusinessWeekOverride(Boolean value) {
        this.routingSessionHasBusinessWeekOverride = value;
    }

    /**
     * Obtém o valor da propriedade routingSessionMode.
     * 
     * @return
     *     possible object is
     *     {@link SessionMode }
     *     
     */
    public SessionMode getRoutingSessionMode() {
        return routingSessionMode;
    }

    /**
     * Define o valor da propriedade routingSessionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionMode }
     *     
     */
    public void setRoutingSessionMode(SessionMode value) {
        this.routingSessionMode = value;
    }

    /**
     * Obtém o valor da propriedade routingSessionNumberOfTimeUnits.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoutingSessionNumberOfTimeUnits() {
        return routingSessionNumberOfTimeUnits;
    }

    /**
     * Define o valor da propriedade routingSessionNumberOfTimeUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoutingSessionNumberOfTimeUnits(Integer value) {
        this.routingSessionNumberOfTimeUnits = value;
    }

    /**
     * Obtém o valor da propriedade routingSessionStartDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRoutingSessionStartDate() {
        return routingSessionStartDate;
    }

    /**
     * Define o valor da propriedade routingSessionStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRoutingSessionStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.routingSessionStartDate = value;
    }

    /**
     * Obtém o valor da propriedade unassignAllOrders.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnassignAllOrders() {
        return unassignAllOrders;
    }

    /**
     * Define o valor da propriedade unassignAllOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnassignAllOrders(Boolean value) {
        this.unassignAllOrders = value;
    }

    /**
     * Obtém o valor da propriedade unassignedOrders.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnassignedOrders() {
        return unassignedOrders;
    }

    /**
     * Define o valor da propriedade unassignedOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnassignedOrders(Boolean value) {
        this.unassignedOrders = value;
    }

}
