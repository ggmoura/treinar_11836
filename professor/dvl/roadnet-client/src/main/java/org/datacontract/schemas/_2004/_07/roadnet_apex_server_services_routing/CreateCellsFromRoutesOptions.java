
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de CreateCellsFromRoutesOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CreateCellsFromRoutesOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddCellsToCellSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CreateNewCellSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExistingCellSetEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NewCellSetID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SetColor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SetDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SetEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SetMaxTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SetMaxTravelTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SetPreferredTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SetStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SetWorker" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SetWorkerEquipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateCellsFromRoutesOptions", propOrder = {
    "addCellsToCellSet",
    "createNewCellSet",
    "existingCellSetEntityKey",
    "newCellSetID",
    "setColor",
    "setDescription",
    "setEquipment",
    "setMaxTime",
    "setMaxTravelTime",
    "setPreferredTime",
    "setStartTime",
    "setWorker",
    "setWorkerEquipment"
})
public class CreateCellsFromRoutesOptions
    extends DataTransferObject
{

    @XmlElement(name = "AddCellsToCellSet")
    protected Boolean addCellsToCellSet;
    @XmlElement(name = "CreateNewCellSet")
    protected Boolean createNewCellSet;
    @XmlElement(name = "ExistingCellSetEntityKey")
    protected Long existingCellSetEntityKey;
    @XmlElementRef(name = "NewCellSetID", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newCellSetID;
    @XmlElement(name = "SetColor")
    protected Boolean setColor;
    @XmlElement(name = "SetDescription")
    protected Boolean setDescription;
    @XmlElement(name = "SetEquipment")
    protected Boolean setEquipment;
    @XmlElement(name = "SetMaxTime")
    protected Boolean setMaxTime;
    @XmlElement(name = "SetMaxTravelTime")
    protected Boolean setMaxTravelTime;
    @XmlElement(name = "SetPreferredTime")
    protected Boolean setPreferredTime;
    @XmlElement(name = "SetStartTime")
    protected Boolean setStartTime;
    @XmlElement(name = "SetWorker")
    protected Boolean setWorker;
    @XmlElement(name = "SetWorkerEquipment")
    protected Boolean setWorkerEquipment;

    /**
     * Obtém o valor da propriedade addCellsToCellSet.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddCellsToCellSet() {
        return addCellsToCellSet;
    }

    /**
     * Define o valor da propriedade addCellsToCellSet.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddCellsToCellSet(Boolean value) {
        this.addCellsToCellSet = value;
    }

    /**
     * Obtém o valor da propriedade createNewCellSet.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateNewCellSet() {
        return createNewCellSet;
    }

    /**
     * Define o valor da propriedade createNewCellSet.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateNewCellSet(Boolean value) {
        this.createNewCellSet = value;
    }

    /**
     * Obtém o valor da propriedade existingCellSetEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExistingCellSetEntityKey() {
        return existingCellSetEntityKey;
    }

    /**
     * Define o valor da propriedade existingCellSetEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExistingCellSetEntityKey(Long value) {
        this.existingCellSetEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade newCellSetID.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewCellSetID() {
        return newCellSetID;
    }

    /**
     * Define o valor da propriedade newCellSetID.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewCellSetID(JAXBElement<String> value) {
        this.newCellSetID = value;
    }

    /**
     * Obtém o valor da propriedade setColor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetColor() {
        return setColor;
    }

    /**
     * Define o valor da propriedade setColor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetColor(Boolean value) {
        this.setColor = value;
    }

    /**
     * Obtém o valor da propriedade setDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetDescription() {
        return setDescription;
    }

    /**
     * Define o valor da propriedade setDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetDescription(Boolean value) {
        this.setDescription = value;
    }

    /**
     * Obtém o valor da propriedade setEquipment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetEquipment() {
        return setEquipment;
    }

    /**
     * Define o valor da propriedade setEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetEquipment(Boolean value) {
        this.setEquipment = value;
    }

    /**
     * Obtém o valor da propriedade setMaxTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetMaxTime() {
        return setMaxTime;
    }

    /**
     * Define o valor da propriedade setMaxTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetMaxTime(Boolean value) {
        this.setMaxTime = value;
    }

    /**
     * Obtém o valor da propriedade setMaxTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetMaxTravelTime() {
        return setMaxTravelTime;
    }

    /**
     * Define o valor da propriedade setMaxTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetMaxTravelTime(Boolean value) {
        this.setMaxTravelTime = value;
    }

    /**
     * Obtém o valor da propriedade setPreferredTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetPreferredTime() {
        return setPreferredTime;
    }

    /**
     * Define o valor da propriedade setPreferredTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetPreferredTime(Boolean value) {
        this.setPreferredTime = value;
    }

    /**
     * Obtém o valor da propriedade setStartTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetStartTime() {
        return setStartTime;
    }

    /**
     * Define o valor da propriedade setStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetStartTime(Boolean value) {
        this.setStartTime = value;
    }

    /**
     * Obtém o valor da propriedade setWorker.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetWorker() {
        return setWorker;
    }

    /**
     * Define o valor da propriedade setWorker.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetWorker(Boolean value) {
        this.setWorker = value;
    }

    /**
     * Obtém o valor da propriedade setWorkerEquipment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetWorkerEquipment() {
        return setWorkerEquipment;
    }

    /**
     * Define o valor da propriedade setWorkerEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetWorkerEquipment(Boolean value) {
        this.setWorkerEquipment = value;
    }

}
