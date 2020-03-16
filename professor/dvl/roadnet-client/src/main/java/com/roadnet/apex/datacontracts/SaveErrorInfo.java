
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SaveErrorInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SaveErrorInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://roadnet.com/apex/DataContracts/}TransferErrorCode" minOccurs="0"/&gt;
 *         &lt;element name="Detail" type="{http://roadnet.com/apex/DataContracts/}SaveErrorInfo.ErrorDetailBase" minOccurs="0"/&gt;
 *         &lt;element name="ValidationFailures" type="{http://roadnet.com/apex/DataContracts/}ArrayOfValidationFailure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveErrorInfo", propOrder = {
    "code",
    "detail",
    "validationFailures"
})
public class SaveErrorInfo {

    @XmlElementRef(name = "Code", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TransferErrorCode> code;
    @XmlElementRef(name = "Detail", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<SaveErrorInfoErrorDetailBase> detail;
    @XmlElementRef(name = "ValidationFailures", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfValidationFailure> validationFailures;

    /**
     * Obtém o valor da propriedade code.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransferErrorCode }{@code >}
     *     
     */
    public JAXBElement<TransferErrorCode> getCode() {
        return code;
    }

    /**
     * Define o valor da propriedade code.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransferErrorCode }{@code >}
     *     
     */
    public void setCode(JAXBElement<TransferErrorCode> value) {
        this.code = value;
    }

    /**
     * Obtém o valor da propriedade detail.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SaveErrorInfoErrorDetailBase }{@code >}
     *     
     */
    public JAXBElement<SaveErrorInfoErrorDetailBase> getDetail() {
        return detail;
    }

    /**
     * Define o valor da propriedade detail.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SaveErrorInfoErrorDetailBase }{@code >}
     *     
     */
    public void setDetail(JAXBElement<SaveErrorInfoErrorDetailBase> value) {
        this.detail = value;
    }

    /**
     * Obtém o valor da propriedade validationFailures.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfValidationFailure }{@code >}
     *     
     */
    public JAXBElement<ArrayOfValidationFailure> getValidationFailures() {
        return validationFailures;
    }

    /**
     * Define o valor da propriedade validationFailures.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfValidationFailure }{@code >}
     *     
     */
    public void setValidationFailures(JAXBElement<ArrayOfValidationFailure> value) {
        this.validationFailures = value;
    }

}
