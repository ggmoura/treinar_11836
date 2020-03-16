
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TelematicsDeviceInputOutputConfigurationPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TelematicsDeviceInputOutputConfigurationPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BusinessUnitBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InputPort1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InputPort2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InputPort3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InputPort4" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InputPort5" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InputPort6" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OutputPort1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OutputPort2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OutputPort3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OutputPort4" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TelematicsDeviceInputOutputConfigurationType_ConfigurationType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VehicleBusReportedPowerTakeOffEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelematicsDeviceInputOutputConfigurationPropertyOptions", propOrder = {
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
public class TelematicsDeviceInputOutputConfigurationPropertyOptions
    extends BusinessUnitBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "InputPort1")
    protected Boolean inputPort1;
    @XmlElement(name = "InputPort2")
    protected Boolean inputPort2;
    @XmlElement(name = "InputPort3")
    protected Boolean inputPort3;
    @XmlElement(name = "InputPort4")
    protected Boolean inputPort4;
    @XmlElement(name = "InputPort5")
    protected Boolean inputPort5;
    @XmlElement(name = "InputPort6")
    protected Boolean inputPort6;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "OutputPort1")
    protected Boolean outputPort1;
    @XmlElement(name = "OutputPort2")
    protected Boolean outputPort2;
    @XmlElement(name = "OutputPort3")
    protected Boolean outputPort3;
    @XmlElement(name = "OutputPort4")
    protected Boolean outputPort4;
    @XmlElement(name = "TelematicsDeviceInputOutputConfigurationType_ConfigurationType")
    protected Boolean telematicsDeviceInputOutputConfigurationTypeConfigurationType;
    @XmlElement(name = "VehicleBusReportedPowerTakeOffEntityKey")
    protected Boolean vehicleBusReportedPowerTakeOffEntityKey;

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifier(Boolean value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade inputPort1.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInputPort1() {
        return inputPort1;
    }

    /**
     * Define o valor da propriedade inputPort1.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInputPort1(Boolean value) {
        this.inputPort1 = value;
    }

    /**
     * Obtém o valor da propriedade inputPort2.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInputPort2() {
        return inputPort2;
    }

    /**
     * Define o valor da propriedade inputPort2.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInputPort2(Boolean value) {
        this.inputPort2 = value;
    }

    /**
     * Obtém o valor da propriedade inputPort3.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInputPort3() {
        return inputPort3;
    }

    /**
     * Define o valor da propriedade inputPort3.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInputPort3(Boolean value) {
        this.inputPort3 = value;
    }

    /**
     * Obtém o valor da propriedade inputPort4.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInputPort4() {
        return inputPort4;
    }

    /**
     * Define o valor da propriedade inputPort4.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInputPort4(Boolean value) {
        this.inputPort4 = value;
    }

    /**
     * Obtém o valor da propriedade inputPort5.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInputPort5() {
        return inputPort5;
    }

    /**
     * Define o valor da propriedade inputPort5.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInputPort5(Boolean value) {
        this.inputPort5 = value;
    }

    /**
     * Obtém o valor da propriedade inputPort6.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInputPort6() {
        return inputPort6;
    }

    /**
     * Define o valor da propriedade inputPort6.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInputPort6(Boolean value) {
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
     *     {@link Boolean }
     *     
     */
    public Boolean isOutputPort1() {
        return outputPort1;
    }

    /**
     * Define o valor da propriedade outputPort1.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutputPort1(Boolean value) {
        this.outputPort1 = value;
    }

    /**
     * Obtém o valor da propriedade outputPort2.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutputPort2() {
        return outputPort2;
    }

    /**
     * Define o valor da propriedade outputPort2.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutputPort2(Boolean value) {
        this.outputPort2 = value;
    }

    /**
     * Obtém o valor da propriedade outputPort3.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutputPort3() {
        return outputPort3;
    }

    /**
     * Define o valor da propriedade outputPort3.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutputPort3(Boolean value) {
        this.outputPort3 = value;
    }

    /**
     * Obtém o valor da propriedade outputPort4.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutputPort4() {
        return outputPort4;
    }

    /**
     * Define o valor da propriedade outputPort4.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutputPort4(Boolean value) {
        this.outputPort4 = value;
    }

    /**
     * Obtém o valor da propriedade telematicsDeviceInputOutputConfigurationTypeConfigurationType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelematicsDeviceInputOutputConfigurationTypeConfigurationType() {
        return telematicsDeviceInputOutputConfigurationTypeConfigurationType;
    }

    /**
     * Define o valor da propriedade telematicsDeviceInputOutputConfigurationTypeConfigurationType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelematicsDeviceInputOutputConfigurationTypeConfigurationType(Boolean value) {
        this.telematicsDeviceInputOutputConfigurationTypeConfigurationType = value;
    }

    /**
     * Obtém o valor da propriedade vehicleBusReportedPowerTakeOffEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehicleBusReportedPowerTakeOffEntityKey() {
        return vehicleBusReportedPowerTakeOffEntityKey;
    }

    /**
     * Define o valor da propriedade vehicleBusReportedPowerTakeOffEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehicleBusReportedPowerTakeOffEntityKey(Boolean value) {
        this.vehicleBusReportedPowerTakeOffEntityKey = value;
    }

}
