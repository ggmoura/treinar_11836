
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de WorkerOverview complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WorkerOverview"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentEquipment" type="{http://roadnet.com/apex/DataContracts/}ArrayOfEquipmentInformation" minOccurs="0"/&gt;
 *         &lt;element name="CurrentRoute" type="{http://roadnet.com/apex/DataContracts/}RouteInformation" minOccurs="0"/&gt;
 *         &lt;element name="EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemainingDutyTimeToday" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="WorkerDutyStatus_DutyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkerOverview", propOrder = {
    "contactNumber",
    "currentEquipment",
    "currentRoute",
    "entityKey",
    "firstName",
    "identifier",
    "lastName",
    "remainingDutyTimeToday",
    "workerDutyStatusDutyStatus"
})
public class WorkerOverview
    extends DataTransferObject
{

    @XmlElementRef(name = "ContactNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactNumber;
    @XmlElementRef(name = "CurrentEquipment", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEquipmentInformation> currentEquipment;
    @XmlElementRef(name = "CurrentRoute", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteInformation> currentRoute;
    @XmlElement(name = "EntityKey")
    protected Long entityKey;
    @XmlElementRef(name = "FirstName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "LastName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastName;
    @XmlElementRef(name = "RemainingDutyTimeToday", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> remainingDutyTimeToday;
    @XmlElementRef(name = "WorkerDutyStatus_DutyStatus", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerDutyStatusDutyStatus;

    /**
     * Obtém o valor da propriedade contactNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactNumber() {
        return contactNumber;
    }

    /**
     * Define o valor da propriedade contactNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactNumber(JAXBElement<String> value) {
        this.contactNumber = value;
    }

    /**
     * Obtém o valor da propriedade currentEquipment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentInformation }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEquipmentInformation> getCurrentEquipment() {
        return currentEquipment;
    }

    /**
     * Define o valor da propriedade currentEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentInformation }{@code >}
     *     
     */
    public void setCurrentEquipment(JAXBElement<ArrayOfEquipmentInformation> value) {
        this.currentEquipment = value;
    }

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
     * Obtém o valor da propriedade firstName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Define o valor da propriedade firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
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
     * Obtém o valor da propriedade lastName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }

    /**
     * Define o valor da propriedade lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = value;
    }

    /**
     * Obtém o valor da propriedade remainingDutyTimeToday.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getRemainingDutyTimeToday() {
        return remainingDutyTimeToday;
    }

    /**
     * Define o valor da propriedade remainingDutyTimeToday.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setRemainingDutyTimeToday(JAXBElement<Duration> value) {
        this.remainingDutyTimeToday = value;
    }

    /**
     * Obtém o valor da propriedade workerDutyStatusDutyStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerDutyStatusDutyStatus() {
        return workerDutyStatusDutyStatus;
    }

    /**
     * Define o valor da propriedade workerDutyStatusDutyStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerDutyStatusDutyStatus(JAXBElement<String> value) {
        this.workerDutyStatusDutyStatus = value;
    }

}
