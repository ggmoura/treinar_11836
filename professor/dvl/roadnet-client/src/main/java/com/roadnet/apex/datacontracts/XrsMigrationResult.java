
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de XrsMigrationResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="XrsMigrationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityResults" type="{http://roadnet.com/apex/DataContracts/}ArrayOfXrsMigrationResult.EntityResult" minOccurs="0"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HasSucceeded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ResultWorkbook" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XrsMigrationResult", propOrder = {
    "entityResults",
    "errorMessage",
    "hasSucceeded",
    "resultWorkbook"
})
public class XrsMigrationResult
    extends DataTransferObject
{

    @XmlElementRef(name = "EntityResults", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfXrsMigrationResultEntityResult> entityResults;
    @XmlElementRef(name = "ErrorMessage", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorMessage;
    @XmlElement(name = "HasSucceeded")
    protected Boolean hasSucceeded;
    @XmlElementRef(name = "ResultWorkbook", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> resultWorkbook;

    /**
     * Obtém o valor da propriedade entityResults.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfXrsMigrationResultEntityResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfXrsMigrationResultEntityResult> getEntityResults() {
        return entityResults;
    }

    /**
     * Define o valor da propriedade entityResults.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfXrsMigrationResultEntityResult }{@code >}
     *     
     */
    public void setEntityResults(JAXBElement<ArrayOfXrsMigrationResultEntityResult> value) {
        this.entityResults = value;
    }

    /**
     * Obtém o valor da propriedade errorMessage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorMessage() {
        return errorMessage;
    }

    /**
     * Define o valor da propriedade errorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorMessage(JAXBElement<String> value) {
        this.errorMessage = value;
    }

    /**
     * Obtém o valor da propriedade hasSucceeded.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasSucceeded() {
        return hasSucceeded;
    }

    /**
     * Define o valor da propriedade hasSucceeded.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasSucceeded(Boolean value) {
        this.hasSucceeded = value;
    }

    /**
     * Obtém o valor da propriedade resultWorkbook.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getResultWorkbook() {
        return resultWorkbook;
    }

    /**
     * Define o valor da propriedade resultWorkbook.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setResultWorkbook(JAXBElement<byte[]> value) {
        this.resultWorkbook = value;
    }

}
