
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfValidationFailure;
import com.roadnet.apex.datacontracts.ErrorCode;


/**
 * <p>Classe Java de MappingErrorInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MappingErrorInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorCode" type="{http://roadnet.com/apex/DataContracts/}ErrorCode" minOccurs="0"/&gt;
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
@XmlType(name = "MappingErrorInfo", propOrder = {
    "errorCode",
    "validationFailures"
})
public class MappingErrorInfo {

    @XmlElement(name = "ErrorCode")
    @XmlSchemaType(name = "string")
    protected ErrorCode errorCode;
    @XmlElementRef(name = "ValidationFailures", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfValidationFailure> validationFailures;

    /**
     * Obtém o valor da propriedade errorCode.
     * 
     * @return
     *     possible object is
     *     {@link ErrorCode }
     *     
     */
    public ErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * Define o valor da propriedade errorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorCode }
     *     
     */
    public void setErrorCode(ErrorCode value) {
        this.errorCode = value;
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
