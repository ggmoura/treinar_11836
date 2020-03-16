
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActiveTroubleCodesUpdateAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ActiveTroubleCodesUpdateAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MobileDeviceAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiagnosticTroubleCodes" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ArrayOfActiveTroubleCodesUpdateAction.DiagnosticTroubleCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveTroubleCodesUpdateAction", propOrder = {
    "diagnosticTroubleCodes"
})
public class ActiveTroubleCodesUpdateAction
    extends MobileDeviceAction
{

    @XmlElementRef(name = "DiagnosticTroubleCodes", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode> diagnosticTroubleCodes;

    /**
     * Obtém o valor da propriedade diagnosticTroubleCodes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode }{@code >}
     *     
     */
    public JAXBElement<ArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode> getDiagnosticTroubleCodes() {
        return diagnosticTroubleCodes;
    }

    /**
     * Define o valor da propriedade diagnosticTroubleCodes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode }{@code >}
     *     
     */
    public void setDiagnosticTroubleCodes(JAXBElement<ArrayOfActiveTroubleCodesUpdateActionDiagnosticTroubleCode> value) {
        this.diagnosticTroubleCodes = value;
    }

}
