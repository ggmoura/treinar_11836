
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.Length;
import com.roadnet.apex.datacontracts.Weight;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de EquipmentProfileResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentProfileResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquipmentTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HasEquipmentTypeInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Height" type="{http://roadnet.com/apex/DataContracts/}Length" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{http://roadnet.com/apex/DataContracts/}Length" minOccurs="0"/&gt;
 *         &lt;element name="LockVehicleProfile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedCommercialRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Weight" type="{http://roadnet.com/apex/DataContracts/}Weight" minOccurs="0"/&gt;
 *         &lt;element name="Width" type="{http://roadnet.com/apex/DataContracts/}Length" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentProfileResult", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", propOrder = {
    "equipmentTypeDescription",
    "equipmentTypeIdentifier",
    "hasEquipmentTypeInfo",
    "height",
    "length",
    "lockVehicleProfile",
    "restrictedCommercialRoads",
    "weight",
    "width"
})
public class EquipmentProfileResult
    extends DataTransferObject
{

    @XmlElementRef(name = "EquipmentTypeDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentTypeDescription;
    @XmlElementRef(name = "EquipmentTypeIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentTypeIdentifier;
    @XmlElement(name = "HasEquipmentTypeInfo")
    protected Boolean hasEquipmentTypeInfo;
    @XmlElementRef(name = "Height", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", type = JAXBElement.class, required = false)
    protected JAXBElement<Length> height;
    @XmlElementRef(name = "Length", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", type = JAXBElement.class, required = false)
    protected JAXBElement<Length> length;
    @XmlElement(name = "LockVehicleProfile")
    protected Boolean lockVehicleProfile;
    @XmlElement(name = "RestrictedCommercialRoads")
    protected Boolean restrictedCommercialRoads;
    @XmlElementRef(name = "Weight", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", type = JAXBElement.class, required = false)
    protected JAXBElement<Weight> weight;
    @XmlElementRef(name = "Width", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Navigation", type = JAXBElement.class, required = false)
    protected JAXBElement<Length> width;

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
     * Obtém o valor da propriedade hasEquipmentTypeInfo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasEquipmentTypeInfo() {
        return hasEquipmentTypeInfo;
    }

    /**
     * Define o valor da propriedade hasEquipmentTypeInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasEquipmentTypeInfo(Boolean value) {
        this.hasEquipmentTypeInfo = value;
    }

    /**
     * Obtém o valor da propriedade height.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public JAXBElement<Length> getHeight() {
        return height;
    }

    /**
     * Define o valor da propriedade height.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public void setHeight(JAXBElement<Length> value) {
        this.height = value;
    }

    /**
     * Obtém o valor da propriedade length.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public JAXBElement<Length> getLength() {
        return length;
    }

    /**
     * Define o valor da propriedade length.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public void setLength(JAXBElement<Length> value) {
        this.length = value;
    }

    /**
     * Obtém o valor da propriedade lockVehicleProfile.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockVehicleProfile() {
        return lockVehicleProfile;
    }

    /**
     * Define o valor da propriedade lockVehicleProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockVehicleProfile(Boolean value) {
        this.lockVehicleProfile = value;
    }

    /**
     * Obtém o valor da propriedade restrictedCommercialRoads.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedCommercialRoads() {
        return restrictedCommercialRoads;
    }

    /**
     * Define o valor da propriedade restrictedCommercialRoads.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedCommercialRoads(Boolean value) {
        this.restrictedCommercialRoads = value;
    }

    /**
     * Obtém o valor da propriedade weight.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Weight }{@code >}
     *     
     */
    public JAXBElement<Weight> getWeight() {
        return weight;
    }

    /**
     * Define o valor da propriedade weight.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Weight }{@code >}
     *     
     */
    public void setWeight(JAXBElement<Weight> value) {
        this.weight = value;
    }

    /**
     * Obtém o valor da propriedade width.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public JAXBElement<Length> getWidth() {
        return width;
    }

    /**
     * Define o valor da propriedade width.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Length }{@code >}
     *     
     */
    public void setWidth(JAXBElement<Length> value) {
        this.width = value;
    }

}
