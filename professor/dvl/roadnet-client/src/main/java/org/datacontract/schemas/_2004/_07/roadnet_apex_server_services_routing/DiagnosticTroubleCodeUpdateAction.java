
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DiagnosticTroubleCodeUpdateAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticTroubleCodeUpdateAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MobileDeviceAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiagnosticTroubleCode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ActiveTroubleCodesUpdateAction.DiagnosticTroubleCode" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticTroubleCodeUpdateAction", propOrder = {
    "diagnosticTroubleCode",
    "isActive"
})
public class DiagnosticTroubleCodeUpdateAction
    extends MobileDeviceAction
{

    @XmlElementRef(name = "DiagnosticTroubleCode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ActiveTroubleCodesUpdateActionDiagnosticTroubleCode> diagnosticTroubleCode;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;

    /**
     * Obtém o valor da propriedade diagnosticTroubleCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActiveTroubleCodesUpdateActionDiagnosticTroubleCode }{@code >}
     *     
     */
    public JAXBElement<ActiveTroubleCodesUpdateActionDiagnosticTroubleCode> getDiagnosticTroubleCode() {
        return diagnosticTroubleCode;
    }

    /**
     * Define o valor da propriedade diagnosticTroubleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActiveTroubleCodesUpdateActionDiagnosticTroubleCode }{@code >}
     *     
     */
    public void setDiagnosticTroubleCode(JAXBElement<ActiveTroubleCodesUpdateActionDiagnosticTroubleCode> value) {
        this.diagnosticTroubleCode = value;
    }

    /**
     * Obtém o valor da propriedade isActive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Define o valor da propriedade isActive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

}
