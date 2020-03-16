
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * <p>Classe Java de MoveResourcesToRegionParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MoveResourcesToRegionParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquipmentEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="MoveEntitiesToTopLevelComplianceOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="WorkerEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveResourcesToRegionParameters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", propOrder = {
    "equipmentEntityKeys",
    "mobileDeviceEntityKeys",
    "moveEntitiesToTopLevelComplianceOrganization",
    "regionEntityKey",
    "workerEntityKeys"
})
public class MoveResourcesToRegionParameters {

    @XmlElementRef(name = "EquipmentEntityKeys", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> equipmentEntityKeys;
    @XmlElementRef(name = "MobileDeviceEntityKeys", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> mobileDeviceEntityKeys;
    @XmlElement(name = "MoveEntitiesToTopLevelComplianceOrganization")
    protected Boolean moveEntitiesToTopLevelComplianceOrganization;
    @XmlElement(name = "RegionEntityKey")
    protected Long regionEntityKey;
    @XmlElementRef(name = "WorkerEntityKeys", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> workerEntityKeys;

    /**
     * Obtém o valor da propriedade equipmentEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getEquipmentEntityKeys() {
        return equipmentEntityKeys;
    }

    /**
     * Define o valor da propriedade equipmentEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setEquipmentEntityKeys(JAXBElement<ArrayOflong> value) {
        this.equipmentEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade mobileDeviceEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getMobileDeviceEntityKeys() {
        return mobileDeviceEntityKeys;
    }

    /**
     * Define o valor da propriedade mobileDeviceEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setMobileDeviceEntityKeys(JAXBElement<ArrayOflong> value) {
        this.mobileDeviceEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade moveEntitiesToTopLevelComplianceOrganization.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoveEntitiesToTopLevelComplianceOrganization() {
        return moveEntitiesToTopLevelComplianceOrganization;
    }

    /**
     * Define o valor da propriedade moveEntitiesToTopLevelComplianceOrganization.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoveEntitiesToTopLevelComplianceOrganization(Boolean value) {
        this.moveEntitiesToTopLevelComplianceOrganization = value;
    }

    /**
     * Obtém o valor da propriedade regionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegionEntityKey() {
        return regionEntityKey;
    }

    /**
     * Define o valor da propriedade regionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegionEntityKey(Long value) {
        this.regionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade workerEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getWorkerEntityKeys() {
        return workerEntityKeys;
    }

    /**
     * Define o valor da propriedade workerEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setWorkerEntityKeys(JAXBElement<ArrayOflong> value) {
        this.workerEntityKeys = value;
    }

}
