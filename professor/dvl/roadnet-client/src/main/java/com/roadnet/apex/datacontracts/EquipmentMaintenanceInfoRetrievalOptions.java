
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyInclusionMode;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de EquipmentMaintenanceInfoRetrievalOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentMaintenanceInfoRetrievalOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DaysInFuture" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DistanceInFuture" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="EngineHoursInFuture" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Paged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PropertyInclusionMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyInclusionMode" minOccurs="0"/&gt;
 *         &lt;element name="PropertyOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="States" type="{http://roadnet.com/apex/DataContracts/}ArrayOfEquipmentMaintenanceInfoState" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentMaintenanceInfoRetrievalOptions", propOrder = {
    "daysInFuture",
    "distanceInFuture",
    "engineHoursInFuture",
    "equipmentPkey",
    "pageIndex",
    "pageSize",
    "paged",
    "propertyInclusionMode",
    "propertyOptions",
    "states"
})
public class EquipmentMaintenanceInfoRetrievalOptions {

    @XmlElementRef(name = "DaysInFuture", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> daysInFuture;
    @XmlElementRef(name = "DistanceInFuture", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> distanceInFuture;
    @XmlElementRef(name = "EngineHoursInFuture", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> engineHoursInFuture;
    @XmlElementRef(name = "EquipmentPkey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> equipmentPkey;
    @XmlElement(name = "PageIndex")
    protected Integer pageIndex;
    @XmlElement(name = "PageSize")
    protected Integer pageSize;
    @XmlElement(name = "Paged")
    protected Boolean paged;
    @XmlElement(name = "PropertyInclusionMode")
    @XmlSchemaType(name = "string")
    protected PropertyInclusionMode propertyInclusionMode;
    @XmlElementRef(name = "PropertyOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyOptions> propertyOptions;
    @XmlElementRef(name = "States", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEquipmentMaintenanceInfoState> states;

    /**
     * Obtém o valor da propriedade daysInFuture.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDaysInFuture() {
        return daysInFuture;
    }

    /**
     * Define o valor da propriedade daysInFuture.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDaysInFuture(JAXBElement<Integer> value) {
        this.daysInFuture = value;
    }

    /**
     * Obtém o valor da propriedade distanceInFuture.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDistanceInFuture() {
        return distanceInFuture;
    }

    /**
     * Define o valor da propriedade distanceInFuture.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDistanceInFuture(JAXBElement<Distance> value) {
        this.distanceInFuture = value;
    }

    /**
     * Obtém o valor da propriedade engineHoursInFuture.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEngineHoursInFuture() {
        return engineHoursInFuture;
    }

    /**
     * Define o valor da propriedade engineHoursInFuture.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEngineHoursInFuture(JAXBElement<Integer> value) {
        this.engineHoursInFuture = value;
    }

    /**
     * Obtém o valor da propriedade equipmentPkey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEquipmentPkey() {
        return equipmentPkey;
    }

    /**
     * Define o valor da propriedade equipmentPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEquipmentPkey(JAXBElement<Long> value) {
        this.equipmentPkey = value;
    }

    /**
     * Obtém o valor da propriedade pageIndex.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * Define o valor da propriedade pageIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageIndex(Integer value) {
        this.pageIndex = value;
    }

    /**
     * Obtém o valor da propriedade pageSize.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Define o valor da propriedade pageSize.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * Obtém o valor da propriedade paged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaged() {
        return paged;
    }

    /**
     * Define o valor da propriedade paged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaged(Boolean value) {
        this.paged = value;
    }

    /**
     * Obtém o valor da propriedade propertyInclusionMode.
     * 
     * @return
     *     possible object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public PropertyInclusionMode getPropertyInclusionMode() {
        return propertyInclusionMode;
    }

    /**
     * Define o valor da propriedade propertyInclusionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public void setPropertyInclusionMode(PropertyInclusionMode value) {
        this.propertyInclusionMode = value;
    }

    /**
     * Obtém o valor da propriedade propertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyOptions }{@code >}
     *     
     */
    public JAXBElement<PropertyOptions> getPropertyOptions() {
        return propertyOptions;
    }

    /**
     * Define o valor da propriedade propertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyOptions }{@code >}
     *     
     */
    public void setPropertyOptions(JAXBElement<PropertyOptions> value) {
        this.propertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade states.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentMaintenanceInfoState }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEquipmentMaintenanceInfoState> getStates() {
        return states;
    }

    /**
     * Define o valor da propriedade states.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentMaintenanceInfoState }{@code >}
     *     
     */
    public void setStates(JAXBElement<ArrayOfEquipmentMaintenanceInfoState> value) {
        this.states = value;
    }

}
