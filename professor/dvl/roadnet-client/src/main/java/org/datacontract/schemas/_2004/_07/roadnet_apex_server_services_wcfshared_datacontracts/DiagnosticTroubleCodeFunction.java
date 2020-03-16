
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfDiagnosticTroubleCodeClassification;
import com.roadnet.apex.datacontracts.ArrayOfDiagnosticTroubleCodeCriteria;


/**
 * <p>Classe Java de DiagnosticTroubleCodeFunction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticTroubleCodeFunction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions}ResourceExceptionRuleFunction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdvancedCriteria" type="{http://roadnet.com/apex/DataContracts/}ArrayOfDiagnosticTroubleCodeCriteria" minOccurs="0"/&gt;
 *         &lt;element name="SelectedClassifications" type="{http://roadnet.com/apex/DataContracts/}ArrayOfDiagnosticTroubleCodeClassification" minOccurs="0"/&gt;
 *         &lt;element name="UseAdvancedConfiguration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticTroubleCodeFunction", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", propOrder = {
    "advancedCriteria",
    "selectedClassifications",
    "useAdvancedConfiguration"
})
public class DiagnosticTroubleCodeFunction
    extends ResourceExceptionRuleFunction
{

    @XmlElementRef(name = "AdvancedCriteria", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDiagnosticTroubleCodeCriteria> advancedCriteria;
    @XmlElementRef(name = "SelectedClassifications", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDiagnosticTroubleCodeClassification> selectedClassifications;
    @XmlElement(name = "UseAdvancedConfiguration")
    protected Boolean useAdvancedConfiguration;

    /**
     * Obtém o valor da propriedade advancedCriteria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDiagnosticTroubleCodeCriteria }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDiagnosticTroubleCodeCriteria> getAdvancedCriteria() {
        return advancedCriteria;
    }

    /**
     * Define o valor da propriedade advancedCriteria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDiagnosticTroubleCodeCriteria }{@code >}
     *     
     */
    public void setAdvancedCriteria(JAXBElement<ArrayOfDiagnosticTroubleCodeCriteria> value) {
        this.advancedCriteria = value;
    }

    /**
     * Obtém o valor da propriedade selectedClassifications.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDiagnosticTroubleCodeClassification }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDiagnosticTroubleCodeClassification> getSelectedClassifications() {
        return selectedClassifications;
    }

    /**
     * Define o valor da propriedade selectedClassifications.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDiagnosticTroubleCodeClassification }{@code >}
     *     
     */
    public void setSelectedClassifications(JAXBElement<ArrayOfDiagnosticTroubleCodeClassification> value) {
        this.selectedClassifications = value;
    }

    /**
     * Obtém o valor da propriedade useAdvancedConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseAdvancedConfiguration() {
        return useAdvancedConfiguration;
    }

    /**
     * Define o valor da propriedade useAdvancedConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseAdvancedConfiguration(Boolean value) {
        this.useAdvancedConfiguration = value;
    }

}
