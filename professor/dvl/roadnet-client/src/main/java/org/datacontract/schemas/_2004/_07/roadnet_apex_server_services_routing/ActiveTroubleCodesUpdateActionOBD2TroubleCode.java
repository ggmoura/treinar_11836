
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ActiveTroubleCodesUpdateAction.OBD2TroubleCode complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ActiveTroubleCodesUpdateAction.OBD2TroubleCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ActiveTroubleCodesUpdateAction.DiagnosticTroubleCode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TroubleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TroubleCodeState_TroubleCodeState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveTroubleCodesUpdateAction.OBD2TroubleCode", propOrder = {
    "troubleCode",
    "troubleCodeStateTroubleCodeState"
})
public class ActiveTroubleCodesUpdateActionOBD2TroubleCode
    extends ActiveTroubleCodesUpdateActionDiagnosticTroubleCode
{

    @XmlElementRef(name = "TroubleCode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> troubleCode;
    @XmlElementRef(name = "TroubleCodeState_TroubleCodeState", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> troubleCodeStateTroubleCodeState;

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
     * Obtém o valor da propriedade troubleCodeStateTroubleCodeState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTroubleCodeStateTroubleCodeState() {
        return troubleCodeStateTroubleCodeState;
    }

    /**
     * Define o valor da propriedade troubleCodeStateTroubleCodeState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTroubleCodeStateTroubleCodeState(JAXBElement<String> value) {
        this.troubleCodeStateTroubleCodeState = value;
    }

}
