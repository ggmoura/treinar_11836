
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de HosRulesValidationResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="HosRulesValidationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HosRulesValidationResultMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HosRulesValidationResultType_HosRulesValidationResultType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HosRulesValidationResult", propOrder = {
    "hosRulesValidationResultMessage",
    "hosRulesValidationResultTypeHosRulesValidationResultType"
})
public class HosRulesValidationResult
    extends DataTransferObject
{

    @XmlElementRef(name = "HosRulesValidationResultMessage", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hosRulesValidationResultMessage;
    @XmlElementRef(name = "HosRulesValidationResultType_HosRulesValidationResultType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hosRulesValidationResultTypeHosRulesValidationResultType;

    /**
     * Obtém o valor da propriedade hosRulesValidationResultMessage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHosRulesValidationResultMessage() {
        return hosRulesValidationResultMessage;
    }

    /**
     * Define o valor da propriedade hosRulesValidationResultMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHosRulesValidationResultMessage(JAXBElement<String> value) {
        this.hosRulesValidationResultMessage = value;
    }

    /**
     * Obtém o valor da propriedade hosRulesValidationResultTypeHosRulesValidationResultType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHosRulesValidationResultTypeHosRulesValidationResultType() {
        return hosRulesValidationResultTypeHosRulesValidationResultType;
    }

    /**
     * Define o valor da propriedade hosRulesValidationResultTypeHosRulesValidationResultType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHosRulesValidationResultTypeHosRulesValidationResultType(JAXBElement<String> value) {
        this.hosRulesValidationResultTypeHosRulesValidationResultType = value;
    }

}
