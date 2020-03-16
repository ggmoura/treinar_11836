
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de TransferRecurringOrderDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TransferRecurringOrderDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Errors" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTransferErrorCode" minOccurs="0"/&gt;
 *         &lt;element name="RecurringOrderEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferRecurringOrderDetail", propOrder = {
    "errors",
    "recurringOrderEntityKey",
    "success"
})
public class TransferRecurringOrderDetail
    extends DataTransferObject
{

    @XmlElementRef(name = "Errors", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransferErrorCode> errors;
    @XmlElement(name = "RecurringOrderEntityKey")
    protected Long recurringOrderEntityKey;
    @XmlElement(name = "Success")
    protected Boolean success;

    /**
     * Obtém o valor da propriedade errors.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransferErrorCode }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTransferErrorCode> getErrors() {
        return errors;
    }

    /**
     * Define o valor da propriedade errors.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransferErrorCode }{@code >}
     *     
     */
    public void setErrors(JAXBElement<ArrayOfTransferErrorCode> value) {
        this.errors = value;
    }

    /**
     * Obtém o valor da propriedade recurringOrderEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecurringOrderEntityKey() {
        return recurringOrderEntityKey;
    }

    /**
     * Define o valor da propriedade recurringOrderEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecurringOrderEntityKey(Long value) {
        this.recurringOrderEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade success.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuccess() {
        return success;
    }

    /**
     * Define o valor da propriedade success.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuccess(Boolean value) {
        this.success = value;
    }

}
