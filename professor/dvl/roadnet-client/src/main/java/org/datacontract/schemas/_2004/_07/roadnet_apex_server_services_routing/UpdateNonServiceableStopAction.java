
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.SaveNonServiceableStopArgs;
import com.roadnet.apex.datacontracts.StopIdentity;


/**
 * <p>Classe Java de UpdateNonServiceableStopAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateNonServiceableStopAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MobileDeviceAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NonServiceableStopArgs" type="{http://roadnet.com/apex/DataContracts/}SaveNonServiceableStopArgs" minOccurs="0"/&gt;
 *         &lt;element name="NonServiceableStopPlacementMethodType_PlacementMethodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NonServiceableStopType_StopType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Placement" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}Placement" minOccurs="0"/&gt;
 *         &lt;element name="PlannedArrive" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RelatedStopKey" type="{http://roadnet.com/apex/DataContracts/}Stop.Identity" minOccurs="0"/&gt;
 *         &lt;element name="StopKey" type="{http://roadnet.com/apex/DataContracts/}Stop.Identity" minOccurs="0"/&gt;
 *         &lt;element name="StopReasonCodeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateNonServiceableStopAction", propOrder = {
    "nonServiceableStopArgs",
    "nonServiceableStopPlacementMethodTypePlacementMethodType",
    "nonServiceableStopTypeStopType",
    "placement",
    "plannedArrive",
    "relatedStopKey",
    "stopKey",
    "stopReasonCodeEntityKey"
})
public class UpdateNonServiceableStopAction
    extends MobileDeviceAction
{

    @XmlElementRef(name = "NonServiceableStopArgs", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<SaveNonServiceableStopArgs> nonServiceableStopArgs;
    @XmlElementRef(name = "NonServiceableStopPlacementMethodType_PlacementMethodType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nonServiceableStopPlacementMethodTypePlacementMethodType;
    @XmlElementRef(name = "NonServiceableStopType_StopType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nonServiceableStopTypeStopType;
    @XmlElementRef(name = "Placement", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Placement> placement;
    @XmlElement(name = "PlannedArrive")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar plannedArrive;
    @XmlElementRef(name = "RelatedStopKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<StopIdentity> relatedStopKey;
    @XmlElementRef(name = "StopKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<StopIdentity> stopKey;
    @XmlElementRef(name = "StopReasonCodeEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> stopReasonCodeEntityKey;

    /**
     * Obtém o valor da propriedade nonServiceableStopArgs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SaveNonServiceableStopArgs }{@code >}
     *     
     */
    public JAXBElement<SaveNonServiceableStopArgs> getNonServiceableStopArgs() {
        return nonServiceableStopArgs;
    }

    /**
     * Define o valor da propriedade nonServiceableStopArgs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SaveNonServiceableStopArgs }{@code >}
     *     
     */
    public void setNonServiceableStopArgs(JAXBElement<SaveNonServiceableStopArgs> value) {
        this.nonServiceableStopArgs = value;
    }

    /**
     * Obtém o valor da propriedade nonServiceableStopPlacementMethodTypePlacementMethodType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNonServiceableStopPlacementMethodTypePlacementMethodType() {
        return nonServiceableStopPlacementMethodTypePlacementMethodType;
    }

    /**
     * Define o valor da propriedade nonServiceableStopPlacementMethodTypePlacementMethodType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNonServiceableStopPlacementMethodTypePlacementMethodType(JAXBElement<String> value) {
        this.nonServiceableStopPlacementMethodTypePlacementMethodType = value;
    }

    /**
     * Obtém o valor da propriedade nonServiceableStopTypeStopType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNonServiceableStopTypeStopType() {
        return nonServiceableStopTypeStopType;
    }

    /**
     * Define o valor da propriedade nonServiceableStopTypeStopType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNonServiceableStopTypeStopType(JAXBElement<String> value) {
        this.nonServiceableStopTypeStopType = value;
    }

    /**
     * Obtém o valor da propriedade placement.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Placement }{@code >}
     *     
     */
    public JAXBElement<Placement> getPlacement() {
        return placement;
    }

    /**
     * Define o valor da propriedade placement.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Placement }{@code >}
     *     
     */
    public void setPlacement(JAXBElement<Placement> value) {
        this.placement = value;
    }

    /**
     * Obtém o valor da propriedade plannedArrive.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedArrive() {
        return plannedArrive;
    }

    /**
     * Define o valor da propriedade plannedArrive.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedArrive(XMLGregorianCalendar value) {
        this.plannedArrive = value;
    }

    /**
     * Obtém o valor da propriedade relatedStopKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}
     *     
     */
    public JAXBElement<StopIdentity> getRelatedStopKey() {
        return relatedStopKey;
    }

    /**
     * Define o valor da propriedade relatedStopKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}
     *     
     */
    public void setRelatedStopKey(JAXBElement<StopIdentity> value) {
        this.relatedStopKey = value;
    }

    /**
     * Obtém o valor da propriedade stopKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}
     *     
     */
    public JAXBElement<StopIdentity> getStopKey() {
        return stopKey;
    }

    /**
     * Define o valor da propriedade stopKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}
     *     
     */
    public void setStopKey(JAXBElement<StopIdentity> value) {
        this.stopKey = value;
    }

    /**
     * Obtém o valor da propriedade stopReasonCodeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getStopReasonCodeEntityKey() {
        return stopReasonCodeEntityKey;
    }

    /**
     * Define o valor da propriedade stopReasonCodeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setStopReasonCodeEntityKey(JAXBElement<Long> value) {
        this.stopReasonCodeEntityKey = value;
    }

}
