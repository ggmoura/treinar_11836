
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TelematicsDeviceInputOutputConfiguration complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TelematicsDeviceInputOutputConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BusinessUnitBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeletedEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InputPort1" type="{http://roadnet.com/apex/DataContracts/}TelematicsDeviceInputPortInfo" minOccurs="0"/&gt;
 *         &lt;element name="InputPort2" type="{http://roadnet.com/apex/DataContracts/}TelematicsDeviceInputPortInfo" minOccurs="0"/&gt;
 *         &lt;element name="InputPort3" type="{http://roadnet.com/apex/DataContracts/}TelematicsDeviceInputPortInfo" minOccurs="0"/&gt;
 *         &lt;element name="InputPort4" type="{http://roadnet.com/apex/DataContracts/}TelematicsDeviceInputPortInfo" minOccurs="0"/&gt;
 *         &lt;element name="InputPort5" type="{http://roadnet.com/apex/DataContracts/}TelematicsDeviceInputPortInfo" minOccurs="0"/&gt;
 *         &lt;element name="InputPort6" type="{http://roadnet.com/apex/DataContracts/}TelematicsDeviceInputPortInfo" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OutputPort1" type="{http://roadnet.com/apex/DataContracts/}TelematicsDeviceOutputPortInfo" minOccurs="0"/&gt;
 *         &lt;element name="OutputPort2" type="{http://roadnet.com/apex/DataContracts/}TelematicsDeviceOutputPortInfo" minOccurs="0"/&gt;
 *         &lt;element name="OutputPort3" type="{http://roadnet.com/apex/DataContracts/}TelematicsDeviceOutputPortInfo" minOccurs="0"/&gt;
 *         &lt;element name="OutputPort4" type="{http://roadnet.com/apex/DataContracts/}TelematicsDeviceOutputPortInfo" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceInputOutputConfigurationType_ConfigurationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleBusReportedPowerTakeOffEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelematicsDeviceInputOutputConfiguration", propOrder = {
    "deletedEntityKey",
    "description",
    "identifier",
    "inputPort1",
    "inputPort2",
    "inputPort3",
    "inputPort4",
    "inputPort5",
    "inputPort6",
    "isDeleted",
    "outputPort1",
    "outputPort2",
    "outputPort3",
    "outputPort4",
    "telematicsDeviceInputOutputConfigurationTypeConfigurationType",
    "vehicleBusReportedPowerTakeOffEntityKey"
})
public class TelematicsDeviceInputOutputConfiguration
    extends BusinessUnitBasedAggregateRootEntity
{

    @XmlElement(name = "DeletedEntityKey")
    protected Long deletedEntityKey;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "InputPort1", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TelematicsDeviceInputPortInfo> inputPort1;
    @XmlElementRef(name = "InputPort2", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TelematicsDeviceInputPortInfo> inputPort2;
    @XmlElementRef(name = "InputPort3", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TelematicsDeviceInputPortInfo> inputPort3;
    @XmlElementRef(name = "InputPort4", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TelematicsDeviceInputPortInfo> inputPort4;
    @XmlElementRef(name = "InputPort5", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TelematicsDeviceInputPortInfo> inputPort5;
    @XmlElementRef(name = "InputPort6", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TelematicsDeviceInputPortInfo> inputPort6;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElementRef(name = "OutputPort1", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TelematicsDeviceOutputPortInfo> outputPort1;
    @XmlElementRef(name = "OutputPort2", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TelematicsDeviceOutputPortInfo> outputPort2;
    @XmlElementRef(name = "OutputPort3", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TelematicsDeviceOutputPortInfo> outputPort3;
    @XmlElementRef(name = "OutputPort4", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TelematicsDeviceOutputPortInfo> outputPort4;
    @XmlElementRef(name = "TelematicsDeviceInputOutputConfigurationType_ConfigurationType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telematicsDeviceInputOutputConfigurationTypeConfigurationType;
    @XmlElementRef(name = "VehicleBusReportedPowerTakeOffEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> vehicleBusReportedPowerTakeOffEntityKey;

    /**
     * Obtém o valor da propriedade deletedEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeletedEntityKey() {
        return deletedEntityKey;
    }

    /**
     * Define o valor da propriedade deletedEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeletedEntityKey(Long value) {
        this.deletedEntityKey = value;
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
     * Obtém o valor da propriedade inputPort1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceInputPortInfo }{@code >}
     *     
     */
    public JAXBElement<TelematicsDeviceInputPortInfo> getInputPort1() {
        return inputPort1;
    }

    /**
     * Define o valor da propriedade inputPort1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceInputPortInfo }{@code >}
     *     
     */
    public void setInputPort1(JAXBElement<TelematicsDeviceInputPortInfo> value) {
        this.inputPort1 = value;
    }

    /**
     * Obtém o valor da propriedade inputPort2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceInputPortInfo }{@code >}
     *     
     */
    public JAXBElement<TelematicsDeviceInputPortInfo> getInputPort2() {
        return inputPort2;
    }

    /**
     * Define o valor da propriedade inputPort2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceInputPortInfo }{@code >}
     *     
     */
    public void setInputPort2(JAXBElement<TelematicsDeviceInputPortInfo> value) {
        this.inputPort2 = value;
    }

    /**
     * Obtém o valor da propriedade inputPort3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceInputPortInfo }{@code >}
     *     
     */
    public JAXBElement<TelematicsDeviceInputPortInfo> getInputPort3() {
        return inputPort3;
    }

    /**
     * Define o valor da propriedade inputPort3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceInputPortInfo }{@code >}
     *     
     */
    public void setInputPort3(JAXBElement<TelematicsDeviceInputPortInfo> value) {
        this.inputPort3 = value;
    }

    /**
     * Obtém o valor da propriedade inputPort4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceInputPortInfo }{@code >}
     *     
     */
    public JAXBElement<TelematicsDeviceInputPortInfo> getInputPort4() {
        return inputPort4;
    }

    /**
     * Define o valor da propriedade inputPort4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceInputPortInfo }{@code >}
     *     
     */
    public void setInputPort4(JAXBElement<TelematicsDeviceInputPortInfo> value) {
        this.inputPort4 = value;
    }

    /**
     * Obtém o valor da propriedade inputPort5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceInputPortInfo }{@code >}
     *     
     */
    public JAXBElement<TelematicsDeviceInputPortInfo> getInputPort5() {
        return inputPort5;
    }

    /**
     * Define o valor da propriedade inputPort5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceInputPortInfo }{@code >}
     *     
     */
    public void setInputPort5(JAXBElement<TelematicsDeviceInputPortInfo> value) {
        this.inputPort5 = value;
    }

    /**
     * Obtém o valor da propriedade inputPort6.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceInputPortInfo }{@code >}
     *     
     */
    public JAXBElement<TelematicsDeviceInputPortInfo> getInputPort6() {
        return inputPort6;
    }

    /**
     * Define o valor da propriedade inputPort6.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceInputPortInfo }{@code >}
     *     
     */
    public void setInputPort6(JAXBElement<TelematicsDeviceInputPortInfo> value) {
        this.inputPort6 = value;
    }

    /**
     * Obtém o valor da propriedade isDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Define o valor da propriedade isDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Obtém o valor da propriedade outputPort1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceOutputPortInfo }{@code >}
     *     
     */
    public JAXBElement<TelematicsDeviceOutputPortInfo> getOutputPort1() {
        return outputPort1;
    }

    /**
     * Define o valor da propriedade outputPort1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceOutputPortInfo }{@code >}
     *     
     */
    public void setOutputPort1(JAXBElement<TelematicsDeviceOutputPortInfo> value) {
        this.outputPort1 = value;
    }

    /**
     * Obtém o valor da propriedade outputPort2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceOutputPortInfo }{@code >}
     *     
     */
    public JAXBElement<TelematicsDeviceOutputPortInfo> getOutputPort2() {
        return outputPort2;
    }

    /**
     * Define o valor da propriedade outputPort2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceOutputPortInfo }{@code >}
     *     
     */
    public void setOutputPort2(JAXBElement<TelematicsDeviceOutputPortInfo> value) {
        this.outputPort2 = value;
    }

    /**
     * Obtém o valor da propriedade outputPort3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceOutputPortInfo }{@code >}
     *     
     */
    public JAXBElement<TelematicsDeviceOutputPortInfo> getOutputPort3() {
        return outputPort3;
    }

    /**
     * Define o valor da propriedade outputPort3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceOutputPortInfo }{@code >}
     *     
     */
    public void setOutputPort3(JAXBElement<TelematicsDeviceOutputPortInfo> value) {
        this.outputPort3 = value;
    }

    /**
     * Obtém o valor da propriedade outputPort4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceOutputPortInfo }{@code >}
     *     
     */
    public JAXBElement<TelematicsDeviceOutputPortInfo> getOutputPort4() {
        return outputPort4;
    }

    /**
     * Define o valor da propriedade outputPort4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TelematicsDeviceOutputPortInfo }{@code >}
     *     
     */
    public void setOutputPort4(JAXBElement<TelematicsDeviceOutputPortInfo> value) {
        this.outputPort4 = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceInputOutputConfigurationTypeConfigurationType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelematicsDeviceInputOutputConfigurationTypeConfigurationType() {
        return telematicsDeviceInputOutputConfigurationTypeConfigurationType;
    }

    /**
     * Define o valor da propriedade telematicsDeviceInputOutputConfigurationTypeConfigurationType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelematicsDeviceInputOutputConfigurationTypeConfigurationType(JAXBElement<String> value) {
        this.telematicsDeviceInputOutputConfigurationTypeConfigurationType = value;
    }

    /**
     * Obtém o valor da propriedade vehicleBusReportedPowerTakeOffEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getVehicleBusReportedPowerTakeOffEntityKey() {
        return vehicleBusReportedPowerTakeOffEntityKey;
    }

    /**
     * Define o valor da propriedade vehicleBusReportedPowerTakeOffEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setVehicleBusReportedPowerTakeOffEntityKey(JAXBElement<Long> value) {
        this.vehicleBusReportedPowerTakeOffEntityKey = value;
    }

}
