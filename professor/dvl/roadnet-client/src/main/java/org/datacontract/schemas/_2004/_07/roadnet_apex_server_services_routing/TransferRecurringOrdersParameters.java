
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * <p>Classe Java de TransferRecurringOrdersParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TransferRecurringOrdersParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DestinationStrategicSessionEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="MaintainTerritoryAssignment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RecurringOrderEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="SetAssignDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="TransferCopy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UpdateCustomProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UpdatePrevious" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferRecurringOrdersParameters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.TransferSession", propOrder = {
    "destinationStrategicSessionEntityKeys",
    "maintainTerritoryAssignment",
    "recurringOrderEntityKeys",
    "setAssignDays",
    "territoryEntityKeys",
    "transferCopy",
    "updateCustomProperties",
    "updatePrevious"
})
public class TransferRecurringOrdersParameters {

    @XmlElementRef(name = "DestinationStrategicSessionEntityKeys", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.TransferSession", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> destinationStrategicSessionEntityKeys;
    @XmlElement(name = "MaintainTerritoryAssignment")
    protected Boolean maintainTerritoryAssignment;
    @XmlElementRef(name = "RecurringOrderEntityKeys", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.TransferSession", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> recurringOrderEntityKeys;
    @XmlElementRef(name = "SetAssignDays", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.TransferSession", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> setAssignDays;
    @XmlElementRef(name = "TerritoryEntityKeys", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.TransferSession", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> territoryEntityKeys;
    @XmlElement(name = "TransferCopy")
    protected Boolean transferCopy;
    @XmlElement(name = "UpdateCustomProperties")
    protected Boolean updateCustomProperties;
    @XmlElement(name = "UpdatePrevious")
    protected Boolean updatePrevious;

    /**
     * Obtém o valor da propriedade destinationStrategicSessionEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getDestinationStrategicSessionEntityKeys() {
        return destinationStrategicSessionEntityKeys;
    }

    /**
     * Define o valor da propriedade destinationStrategicSessionEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setDestinationStrategicSessionEntityKeys(JAXBElement<ArrayOflong> value) {
        this.destinationStrategicSessionEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade maintainTerritoryAssignment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaintainTerritoryAssignment() {
        return maintainTerritoryAssignment;
    }

    /**
     * Define o valor da propriedade maintainTerritoryAssignment.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaintainTerritoryAssignment(Boolean value) {
        this.maintainTerritoryAssignment = value;
    }

    /**
     * Obtém o valor da propriedade recurringOrderEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getRecurringOrderEntityKeys() {
        return recurringOrderEntityKeys;
    }

    /**
     * Define o valor da propriedade recurringOrderEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setRecurringOrderEntityKeys(JAXBElement<ArrayOflong> value) {
        this.recurringOrderEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade setAssignDays.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSetAssignDays() {
        return setAssignDays;
    }

    /**
     * Define o valor da propriedade setAssignDays.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSetAssignDays(JAXBElement<Boolean> value) {
        this.setAssignDays = value;
    }

    /**
     * Obtém o valor da propriedade territoryEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getTerritoryEntityKeys() {
        return territoryEntityKeys;
    }

    /**
     * Define o valor da propriedade territoryEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setTerritoryEntityKeys(JAXBElement<ArrayOflong> value) {
        this.territoryEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade transferCopy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferCopy() {
        return transferCopy;
    }

    /**
     * Define o valor da propriedade transferCopy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferCopy(Boolean value) {
        this.transferCopy = value;
    }

    /**
     * Obtém o valor da propriedade updateCustomProperties.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateCustomProperties() {
        return updateCustomProperties;
    }

    /**
     * Define o valor da propriedade updateCustomProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateCustomProperties(Boolean value) {
        this.updateCustomProperties = value;
    }

    /**
     * Obtém o valor da propriedade updatePrevious.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdatePrevious() {
        return updatePrevious;
    }

    /**
     * Define o valor da propriedade updatePrevious.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdatePrevious(Boolean value) {
        this.updatePrevious = value;
    }

}
