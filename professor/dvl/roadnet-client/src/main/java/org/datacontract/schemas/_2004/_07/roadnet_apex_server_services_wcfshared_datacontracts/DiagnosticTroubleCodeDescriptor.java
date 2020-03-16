
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.Temperature;
import com.roadnet.apex.datacontracts.TransmissionGearState;


/**
 * <p>Classe Java de DiagnosticTroubleCodeDescriptor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticTroubleCodeDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions}ResourceExceptionSpecialDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CoolantTemperatureValue" type="{http://roadnet.com/apex/DataContracts/}Temperature" minOccurs="0"/&gt;
 *         &lt;element name="DiagnosticTroubleCodeEventEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DiagnosticTroubleCodes" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions}ArrayOfDiagnosticTroubleCodeDescriptor.DiagnosticTroubleCodeDetail" minOccurs="0"/&gt;
 *         &lt;element name="EngineRPM" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EngineTemperatureValue" type="{http://roadnet.com/apex/DataContracts/}Temperature" minOccurs="0"/&gt;
 *         &lt;element name="GearState" type="{http://roadnet.com/apex/DataContracts/}TransmissionGearState" minOccurs="0"/&gt;
 *         &lt;element name="TroubleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TroubleCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticTroubleCodeDescriptor", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", propOrder = {
    "coolantTemperatureValue",
    "diagnosticTroubleCodeEventEntityKey",
    "diagnosticTroubleCodes",
    "engineRPM",
    "engineTemperatureValue",
    "gearState",
    "troubleCode",
    "troubleCodeDescription"
})
public class DiagnosticTroubleCodeDescriptor
    extends ResourceExceptionSpecialDescriptor
{

    @XmlElementRef(name = "CoolantTemperatureValue", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<Temperature> coolantTemperatureValue;
    @XmlElement(name = "DiagnosticTroubleCodeEventEntityKey")
    protected Long diagnosticTroubleCodeEventEntityKey;
    @XmlElementRef(name = "DiagnosticTroubleCodes", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail> diagnosticTroubleCodes;
    @XmlElementRef(name = "EngineRPM", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> engineRPM;
    @XmlElementRef(name = "EngineTemperatureValue", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<Temperature> engineTemperatureValue;
    @XmlElementRef(name = "GearState", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<TransmissionGearState> gearState;
    @XmlElementRef(name = "TroubleCode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<String> troubleCode;
    @XmlElementRef(name = "TroubleCodeDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<String> troubleCodeDescription;

    /**
     * Obtém o valor da propriedade coolantTemperatureValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Temperature }{@code >}
     *     
     */
    public JAXBElement<Temperature> getCoolantTemperatureValue() {
        return coolantTemperatureValue;
    }

    /**
     * Define o valor da propriedade coolantTemperatureValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Temperature }{@code >}
     *     
     */
    public void setCoolantTemperatureValue(JAXBElement<Temperature> value) {
        this.coolantTemperatureValue = value;
    }

    /**
     * Obtém o valor da propriedade diagnosticTroubleCodeEventEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiagnosticTroubleCodeEventEntityKey() {
        return diagnosticTroubleCodeEventEntityKey;
    }

    /**
     * Define o valor da propriedade diagnosticTroubleCodeEventEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiagnosticTroubleCodeEventEntityKey(Long value) {
        this.diagnosticTroubleCodeEventEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade diagnosticTroubleCodes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail> getDiagnosticTroubleCodes() {
        return diagnosticTroubleCodes;
    }

    /**
     * Define o valor da propriedade diagnosticTroubleCodes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail }{@code >}
     *     
     */
    public void setDiagnosticTroubleCodes(JAXBElement<ArrayOfDiagnosticTroubleCodeDescriptorDiagnosticTroubleCodeDetail> value) {
        this.diagnosticTroubleCodes = value;
    }

    /**
     * Obtém o valor da propriedade engineRPM.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEngineRPM() {
        return engineRPM;
    }

    /**
     * Define o valor da propriedade engineRPM.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEngineRPM(JAXBElement<Integer> value) {
        this.engineRPM = value;
    }

    /**
     * Obtém o valor da propriedade engineTemperatureValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Temperature }{@code >}
     *     
     */
    public JAXBElement<Temperature> getEngineTemperatureValue() {
        return engineTemperatureValue;
    }

    /**
     * Define o valor da propriedade engineTemperatureValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Temperature }{@code >}
     *     
     */
    public void setEngineTemperatureValue(JAXBElement<Temperature> value) {
        this.engineTemperatureValue = value;
    }

    /**
     * Obtém o valor da propriedade gearState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransmissionGearState }{@code >}
     *     
     */
    public JAXBElement<TransmissionGearState> getGearState() {
        return gearState;
    }

    /**
     * Define o valor da propriedade gearState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransmissionGearState }{@code >}
     *     
     */
    public void setGearState(JAXBElement<TransmissionGearState> value) {
        this.gearState = value;
    }

    /**
     * Obtém o valor da propriedade troubleCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTroubleCode() {
        return troubleCode;
    }

    /**
     * Define o valor da propriedade troubleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTroubleCode(JAXBElement<String> value) {
        this.troubleCode = value;
    }

    /**
     * Obtém o valor da propriedade troubleCodeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTroubleCodeDescription() {
        return troubleCodeDescription;
    }

    /**
     * Define o valor da propriedade troubleCodeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTroubleCodeDescription(JAXBElement<String> value) {
        this.troubleCodeDescription = value;
    }

}
