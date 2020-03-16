
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.Notification;
import com.roadnet.apex.datacontracts.Speed;
import com.roadnet.apex.datacontracts.Weight;


/**
 * <p>Classe Java de TelematicsDeviceParameterChangeNotification complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TelematicsDeviceParameterChangeNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}Notification"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnableHarshDrivingBuzzer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableHarshDrivingBuzzerChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableKeyFobAuthenticationBuzzer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableKeyFobAuthenticationBuzzerChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentWeight" type="{http://roadnet.com/apex/DataContracts/}Weight" minOccurs="0"/&gt;
 *         &lt;element name="HarshAccelerationThreshold" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="HarshAccelerationThresholdChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HarshBrakingThreshold" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="HarshBrakingThresholdChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HarshCorneringThreshold" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="HarshCorneringThresholdChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input0BiasChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input1BiasChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input2BiasChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input3BiasChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input4BiasChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input5BiasChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input6BiasChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Input7BiasChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InputBiasType_Input0Bias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InputBiasType_Input1Bias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InputBiasType_Input2Bias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InputBiasType_Input3Bias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InputBiasType_Input4Bias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InputBiasType_Input5Bias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InputBiasType_Input6Bias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InputBiasType_Input7Bias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpeedBuzzerThreshold" type="{http://roadnet.com/apex/DataContracts/}Speed" minOccurs="0"/&gt;
 *         &lt;element name="SpeedBuzzerThresholdChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelematicsDeviceParameterChangeNotification", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", propOrder = {
    "enableHarshDrivingBuzzer",
    "enableHarshDrivingBuzzerChanged",
    "enableKeyFobAuthenticationBuzzer",
    "enableKeyFobAuthenticationBuzzerChanged",
    "equipmentWeight",
    "harshAccelerationThreshold",
    "harshAccelerationThresholdChanged",
    "harshBrakingThreshold",
    "harshBrakingThresholdChanged",
    "harshCorneringThreshold",
    "harshCorneringThresholdChanged",
    "input0BiasChanged",
    "input1BiasChanged",
    "input2BiasChanged",
    "input3BiasChanged",
    "input4BiasChanged",
    "input5BiasChanged",
    "input6BiasChanged",
    "input7BiasChanged",
    "inputBiasTypeInput0Bias",
    "inputBiasTypeInput1Bias",
    "inputBiasTypeInput2Bias",
    "inputBiasTypeInput3Bias",
    "inputBiasTypeInput4Bias",
    "inputBiasTypeInput5Bias",
    "inputBiasTypeInput6Bias",
    "inputBiasTypeInput7Bias",
    "speedBuzzerThreshold",
    "speedBuzzerThresholdChanged"
})
public class TelematicsDeviceParameterChangeNotification
    extends Notification
{

    @XmlElement(name = "EnableHarshDrivingBuzzer")
    protected Boolean enableHarshDrivingBuzzer;
    @XmlElement(name = "EnableHarshDrivingBuzzerChanged")
    protected Boolean enableHarshDrivingBuzzerChanged;
    @XmlElement(name = "EnableKeyFobAuthenticationBuzzer")
    protected Boolean enableKeyFobAuthenticationBuzzer;
    @XmlElement(name = "EnableKeyFobAuthenticationBuzzerChanged")
    protected Boolean enableKeyFobAuthenticationBuzzerChanged;
    @XmlElementRef(name = "EquipmentWeight", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", type = JAXBElement.class, required = false)
    protected JAXBElement<Weight> equipmentWeight;
    @XmlElementRef(name = "HarshAccelerationThreshold", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> harshAccelerationThreshold;
    @XmlElement(name = "HarshAccelerationThresholdChanged")
    protected Boolean harshAccelerationThresholdChanged;
    @XmlElementRef(name = "HarshBrakingThreshold", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> harshBrakingThreshold;
    @XmlElement(name = "HarshBrakingThresholdChanged")
    protected Boolean harshBrakingThresholdChanged;
    @XmlElementRef(name = "HarshCorneringThreshold", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> harshCorneringThreshold;
    @XmlElement(name = "HarshCorneringThresholdChanged")
    protected Boolean harshCorneringThresholdChanged;
    @XmlElement(name = "Input0BiasChanged")
    protected Boolean input0BiasChanged;
    @XmlElement(name = "Input1BiasChanged")
    protected Boolean input1BiasChanged;
    @XmlElement(name = "Input2BiasChanged")
    protected Boolean input2BiasChanged;
    @XmlElement(name = "Input3BiasChanged")
    protected Boolean input3BiasChanged;
    @XmlElement(name = "Input4BiasChanged")
    protected Boolean input4BiasChanged;
    @XmlElement(name = "Input5BiasChanged")
    protected Boolean input5BiasChanged;
    @XmlElement(name = "Input6BiasChanged")
    protected Boolean input6BiasChanged;
    @XmlElement(name = "Input7BiasChanged")
    protected Boolean input7BiasChanged;
    @XmlElementRef(name = "InputBiasType_Input0Bias", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inputBiasTypeInput0Bias;
    @XmlElementRef(name = "InputBiasType_Input1Bias", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inputBiasTypeInput1Bias;
    @XmlElementRef(name = "InputBiasType_Input2Bias", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inputBiasTypeInput2Bias;
    @XmlElementRef(name = "InputBiasType_Input3Bias", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inputBiasTypeInput3Bias;
    @XmlElementRef(name = "InputBiasType_Input4Bias", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inputBiasTypeInput4Bias;
    @XmlElementRef(name = "InputBiasType_Input5Bias", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inputBiasTypeInput5Bias;
    @XmlElementRef(name = "InputBiasType_Input6Bias", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inputBiasTypeInput6Bias;
    @XmlElementRef(name = "InputBiasType_Input7Bias", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inputBiasTypeInput7Bias;
    @XmlElementRef(name = "SpeedBuzzerThreshold", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", type = JAXBElement.class, required = false)
    protected JAXBElement<Speed> speedBuzzerThreshold;
    @XmlElement(name = "SpeedBuzzerThresholdChanged")
    protected Boolean speedBuzzerThresholdChanged;

    /**
     * Obtém o valor da propriedade enableHarshDrivingBuzzer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableHarshDrivingBuzzer() {
        return enableHarshDrivingBuzzer;
    }

    /**
     * Define o valor da propriedade enableHarshDrivingBuzzer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableHarshDrivingBuzzer(Boolean value) {
        this.enableHarshDrivingBuzzer = value;
    }

    /**
     * Obtém o valor da propriedade enableHarshDrivingBuzzerChanged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableHarshDrivingBuzzerChanged() {
        return enableHarshDrivingBuzzerChanged;
    }

    /**
     * Define o valor da propriedade enableHarshDrivingBuzzerChanged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableHarshDrivingBuzzerChanged(Boolean value) {
        this.enableHarshDrivingBuzzerChanged = value;
    }

    /**
     * Obtém o valor da propriedade enableKeyFobAuthenticationBuzzer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableKeyFobAuthenticationBuzzer() {
        return enableKeyFobAuthenticationBuzzer;
    }

    /**
     * Define o valor da propriedade enableKeyFobAuthenticationBuzzer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableKeyFobAuthenticationBuzzer(Boolean value) {
        this.enableKeyFobAuthenticationBuzzer = value;
    }

    /**
     * Obtém o valor da propriedade enableKeyFobAuthenticationBuzzerChanged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableKeyFobAuthenticationBuzzerChanged() {
        return enableKeyFobAuthenticationBuzzerChanged;
    }

    /**
     * Define o valor da propriedade enableKeyFobAuthenticationBuzzerChanged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableKeyFobAuthenticationBuzzerChanged(Boolean value) {
        this.enableKeyFobAuthenticationBuzzerChanged = value;
    }

    /**
     * Obtém o valor da propriedade equipmentWeight.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Weight }{@code >}
     *     
     */
    public JAXBElement<Weight> getEquipmentWeight() {
        return equipmentWeight;
    }

    /**
     * Define o valor da propriedade equipmentWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Weight }{@code >}
     *     
     */
    public void setEquipmentWeight(JAXBElement<Weight> value) {
        this.equipmentWeight = value;
    }

    /**
     * Obtém o valor da propriedade harshAccelerationThreshold.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHarshAccelerationThreshold() {
        return harshAccelerationThreshold;
    }

    /**
     * Define o valor da propriedade harshAccelerationThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHarshAccelerationThreshold(JAXBElement<Double> value) {
        this.harshAccelerationThreshold = value;
    }

    /**
     * Obtém o valor da propriedade harshAccelerationThresholdChanged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHarshAccelerationThresholdChanged() {
        return harshAccelerationThresholdChanged;
    }

    /**
     * Define o valor da propriedade harshAccelerationThresholdChanged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHarshAccelerationThresholdChanged(Boolean value) {
        this.harshAccelerationThresholdChanged = value;
    }

    /**
     * Obtém o valor da propriedade harshBrakingThreshold.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHarshBrakingThreshold() {
        return harshBrakingThreshold;
    }

    /**
     * Define o valor da propriedade harshBrakingThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHarshBrakingThreshold(JAXBElement<Double> value) {
        this.harshBrakingThreshold = value;
    }

    /**
     * Obtém o valor da propriedade harshBrakingThresholdChanged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHarshBrakingThresholdChanged() {
        return harshBrakingThresholdChanged;
    }

    /**
     * Define o valor da propriedade harshBrakingThresholdChanged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHarshBrakingThresholdChanged(Boolean value) {
        this.harshBrakingThresholdChanged = value;
    }

    /**
     * Obtém o valor da propriedade harshCorneringThreshold.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHarshCorneringThreshold() {
        return harshCorneringThreshold;
    }

    /**
     * Define o valor da propriedade harshCorneringThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHarshCorneringThreshold(JAXBElement<Double> value) {
        this.harshCorneringThreshold = value;
    }

    /**
     * Obtém o valor da propriedade harshCorneringThresholdChanged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHarshCorneringThresholdChanged() {
        return harshCorneringThresholdChanged;
    }

    /**
     * Define o valor da propriedade harshCorneringThresholdChanged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHarshCorneringThresholdChanged(Boolean value) {
        this.harshCorneringThresholdChanged = value;
    }

    /**
     * Obtém o valor da propriedade input0BiasChanged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput0BiasChanged() {
        return input0BiasChanged;
    }

    /**
     * Define o valor da propriedade input0BiasChanged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput0BiasChanged(Boolean value) {
        this.input0BiasChanged = value;
    }

    /**
     * Obtém o valor da propriedade input1BiasChanged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput1BiasChanged() {
        return input1BiasChanged;
    }

    /**
     * Define o valor da propriedade input1BiasChanged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput1BiasChanged(Boolean value) {
        this.input1BiasChanged = value;
    }

    /**
     * Obtém o valor da propriedade input2BiasChanged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput2BiasChanged() {
        return input2BiasChanged;
    }

    /**
     * Define o valor da propriedade input2BiasChanged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput2BiasChanged(Boolean value) {
        this.input2BiasChanged = value;
    }

    /**
     * Obtém o valor da propriedade input3BiasChanged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput3BiasChanged() {
        return input3BiasChanged;
    }

    /**
     * Define o valor da propriedade input3BiasChanged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput3BiasChanged(Boolean value) {
        this.input3BiasChanged = value;
    }

    /**
     * Obtém o valor da propriedade input4BiasChanged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput4BiasChanged() {
        return input4BiasChanged;
    }

    /**
     * Define o valor da propriedade input4BiasChanged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput4BiasChanged(Boolean value) {
        this.input4BiasChanged = value;
    }

    /**
     * Obtém o valor da propriedade input5BiasChanged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput5BiasChanged() {
        return input5BiasChanged;
    }

    /**
     * Define o valor da propriedade input5BiasChanged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput5BiasChanged(Boolean value) {
        this.input5BiasChanged = value;
    }

    /**
     * Obtém o valor da propriedade input6BiasChanged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput6BiasChanged() {
        return input6BiasChanged;
    }

    /**
     * Define o valor da propriedade input6BiasChanged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput6BiasChanged(Boolean value) {
        this.input6BiasChanged = value;
    }

    /**
     * Obtém o valor da propriedade input7BiasChanged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInput7BiasChanged() {
        return input7BiasChanged;
    }

    /**
     * Define o valor da propriedade input7BiasChanged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInput7BiasChanged(Boolean value) {
        this.input7BiasChanged = value;
    }

    /**
     * Obtém o valor da propriedade inputBiasTypeInput0Bias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInputBiasTypeInput0Bias() {
        return inputBiasTypeInput0Bias;
    }

    /**
     * Define o valor da propriedade inputBiasTypeInput0Bias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInputBiasTypeInput0Bias(JAXBElement<String> value) {
        this.inputBiasTypeInput0Bias = value;
    }

    /**
     * Obtém o valor da propriedade inputBiasTypeInput1Bias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInputBiasTypeInput1Bias() {
        return inputBiasTypeInput1Bias;
    }

    /**
     * Define o valor da propriedade inputBiasTypeInput1Bias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInputBiasTypeInput1Bias(JAXBElement<String> value) {
        this.inputBiasTypeInput1Bias = value;
    }

    /**
     * Obtém o valor da propriedade inputBiasTypeInput2Bias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInputBiasTypeInput2Bias() {
        return inputBiasTypeInput2Bias;
    }

    /**
     * Define o valor da propriedade inputBiasTypeInput2Bias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInputBiasTypeInput2Bias(JAXBElement<String> value) {
        this.inputBiasTypeInput2Bias = value;
    }

    /**
     * Obtém o valor da propriedade inputBiasTypeInput3Bias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInputBiasTypeInput3Bias() {
        return inputBiasTypeInput3Bias;
    }

    /**
     * Define o valor da propriedade inputBiasTypeInput3Bias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInputBiasTypeInput3Bias(JAXBElement<String> value) {
        this.inputBiasTypeInput3Bias = value;
    }

    /**
     * Obtém o valor da propriedade inputBiasTypeInput4Bias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInputBiasTypeInput4Bias() {
        return inputBiasTypeInput4Bias;
    }

    /**
     * Define o valor da propriedade inputBiasTypeInput4Bias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInputBiasTypeInput4Bias(JAXBElement<String> value) {
        this.inputBiasTypeInput4Bias = value;
    }

    /**
     * Obtém o valor da propriedade inputBiasTypeInput5Bias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInputBiasTypeInput5Bias() {
        return inputBiasTypeInput5Bias;
    }

    /**
     * Define o valor da propriedade inputBiasTypeInput5Bias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInputBiasTypeInput5Bias(JAXBElement<String> value) {
        this.inputBiasTypeInput5Bias = value;
    }

    /**
     * Obtém o valor da propriedade inputBiasTypeInput6Bias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInputBiasTypeInput6Bias() {
        return inputBiasTypeInput6Bias;
    }

    /**
     * Define o valor da propriedade inputBiasTypeInput6Bias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInputBiasTypeInput6Bias(JAXBElement<String> value) {
        this.inputBiasTypeInput6Bias = value;
    }

    /**
     * Obtém o valor da propriedade inputBiasTypeInput7Bias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInputBiasTypeInput7Bias() {
        return inputBiasTypeInput7Bias;
    }

    /**
     * Define o valor da propriedade inputBiasTypeInput7Bias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInputBiasTypeInput7Bias(JAXBElement<String> value) {
        this.inputBiasTypeInput7Bias = value;
    }

    /**
     * Obtém o valor da propriedade speedBuzzerThreshold.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public JAXBElement<Speed> getSpeedBuzzerThreshold() {
        return speedBuzzerThreshold;
    }

    /**
     * Define o valor da propriedade speedBuzzerThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Speed }{@code >}
     *     
     */
    public void setSpeedBuzzerThreshold(JAXBElement<Speed> value) {
        this.speedBuzzerThreshold = value;
    }

    /**
     * Obtém o valor da propriedade speedBuzzerThresholdChanged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpeedBuzzerThresholdChanged() {
        return speedBuzzerThresholdChanged;
    }

    /**
     * Define o valor da propriedade speedBuzzerThresholdChanged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpeedBuzzerThresholdChanged(Boolean value) {
        this.speedBuzzerThresholdChanged = value;
    }

}
