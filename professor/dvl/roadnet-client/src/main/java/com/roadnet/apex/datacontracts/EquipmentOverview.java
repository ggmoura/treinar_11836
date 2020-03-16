
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de EquipmentOverview complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentOverview"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrentRoute" type="{http://roadnet.com/apex/DataContracts/}RouteInformation" minOccurs="0"/&gt;
 *         &lt;element name="CurrentWorkers" type="{http://roadnet.com/apex/DataContracts/}ArrayOfWorkerInformation" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastKnownPosition" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="MotionState_LastKnownMotionState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentOverview", propOrder = {
    "currentRoute",
    "currentWorkers",
    "description",
    "entityKey",
    "equipmentTypeDescription",
    "equipmentTypeEntityKey",
    "equipmentTypeIdentifier",
    "identifier",
    "lastKnownPosition",
    "motionStateLastKnownMotionState"
})
public class EquipmentOverview
    extends DataTransferObject
{

    @XmlElementRef(name = "CurrentRoute", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteInformation> currentRoute;
    @XmlElementRef(name = "CurrentWorkers", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWorkerInformation> currentWorkers;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "EntityKey")
    protected Long entityKey;
    @XmlElementRef(name = "EquipmentTypeDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentTypeDescription;
    @XmlElement(name = "EquipmentTypeEntityKey")
    protected Long equipmentTypeEntityKey;
    @XmlElementRef(name = "EquipmentTypeIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentTypeIdentifier;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "LastKnownPosition", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> lastKnownPosition;
    @XmlElementRef(name = "MotionState_LastKnownMotionState", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> motionStateLastKnownMotionState;

    /**
     * Obtém o valor da propriedade currentRoute.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteInformation }{@code >}
     *     
     */
    public JAXBElement<RouteInformation> getCurrentRoute() {
        return currentRoute;
    }

    /**
     * Define o valor da propriedade currentRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteInformation }{@code >}
     *     
     */
    public void setCurrentRoute(JAXBElement<RouteInformation> value) {
        this.currentRoute = value;
    }

    /**
     * Obtém o valor da propriedade currentWorkers.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkerInformation }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWorkerInformation> getCurrentWorkers() {
        return currentWorkers;
    }

    /**
     * Define o valor da propriedade currentWorkers.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkerInformation }{@code >}
     *     
     */
    public void setCurrentWorkers(JAXBElement<ArrayOfWorkerInformation> value) {
        this.currentWorkers = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
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
     * Obtém o valor da propriedade equipmentTypeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentTypeDescription() {
        return equipmentTypeDescription;
    }

    /**
     * Define o valor da propriedade equipmentTypeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentTypeDescription(JAXBElement<String> value) {
        this.equipmentTypeDescription = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEquipmentTypeEntityKey() {
        return equipmentTypeEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentTypeEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEquipmentTypeEntityKey(Long value) {
        this.equipmentTypeEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipmentTypeIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentTypeIdentifier() {
        return equipmentTypeIdentifier;
    }

    /**
     * Define o valor da propriedade equipmentTypeIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentTypeIdentifier(JAXBElement<String> value) {
        this.equipmentTypeIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade lastKnownPosition.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getLastKnownPosition() {
        return lastKnownPosition;
    }

    /**
     * Define o valor da propriedade lastKnownPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setLastKnownPosition(JAXBElement<Coordinate> value) {
        this.lastKnownPosition = value;
    }

    /**
     * Obtém o valor da propriedade motionStateLastKnownMotionState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMotionStateLastKnownMotionState() {
        return motionStateLastKnownMotionState;
    }

    /**
     * Define o valor da propriedade motionStateLastKnownMotionState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMotionStateLastKnownMotionState(JAXBElement<String> value) {
        this.motionStateLastKnownMotionState = value;
    }

}
