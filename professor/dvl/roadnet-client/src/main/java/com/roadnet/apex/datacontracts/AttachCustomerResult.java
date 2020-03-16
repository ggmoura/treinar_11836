
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de AttachCustomerResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AttachCustomerResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerAttachComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerAttached" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerDataStaged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerDatabaseRestored" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CustomerFailoverAttachComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerFailoverAttached" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerFailoverDatabaseRestored" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerInitialDataPopulated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerMapEditsStaged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerMirroringComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Error" type="{http://roadnet.com/apex/DataContracts/}SaveErrorInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachCustomerResult", propOrder = {
    "customerAttachComplete",
    "customerAttached",
    "customerDataStaged",
    "customerDatabaseRestored",
    "customerEntityKey",
    "customerFailoverAttachComplete",
    "customerFailoverAttached",
    "customerFailoverDatabaseRestored",
    "customerInitialDataPopulated",
    "customerMapEditsStaged",
    "customerMirroringComplete",
    "error"
})
public class AttachCustomerResult
    extends DataTransferObject
{

    @XmlElement(name = "CustomerAttachComplete")
    protected Boolean customerAttachComplete;
    @XmlElement(name = "CustomerAttached")
    protected Boolean customerAttached;
    @XmlElement(name = "CustomerDataStaged")
    protected Boolean customerDataStaged;
    @XmlElement(name = "CustomerDatabaseRestored")
    protected Boolean customerDatabaseRestored;
    @XmlElement(name = "CustomerEntityKey")
    protected Long customerEntityKey;
    @XmlElement(name = "CustomerFailoverAttachComplete")
    protected Boolean customerFailoverAttachComplete;
    @XmlElement(name = "CustomerFailoverAttached")
    protected Boolean customerFailoverAttached;
    @XmlElement(name = "CustomerFailoverDatabaseRestored")
    protected Boolean customerFailoverDatabaseRestored;
    @XmlElement(name = "CustomerInitialDataPopulated")
    protected Boolean customerInitialDataPopulated;
    @XmlElement(name = "CustomerMapEditsStaged")
    protected Boolean customerMapEditsStaged;
    @XmlElement(name = "CustomerMirroringComplete")
    protected Boolean customerMirroringComplete;
    @XmlElementRef(name = "Error", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<SaveErrorInfo> error;

    /**
     * Obtém o valor da propriedade customerAttachComplete.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerAttachComplete() {
        return customerAttachComplete;
    }

    /**
     * Define o valor da propriedade customerAttachComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerAttachComplete(Boolean value) {
        this.customerAttachComplete = value;
    }

    /**
     * Obtém o valor da propriedade customerAttached.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerAttached() {
        return customerAttached;
    }

    /**
     * Define o valor da propriedade customerAttached.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerAttached(Boolean value) {
        this.customerAttached = value;
    }

    /**
     * Obtém o valor da propriedade customerDataStaged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerDataStaged() {
        return customerDataStaged;
    }

    /**
     * Define o valor da propriedade customerDataStaged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerDataStaged(Boolean value) {
        this.customerDataStaged = value;
    }

    /**
     * Obtém o valor da propriedade customerDatabaseRestored.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerDatabaseRestored() {
        return customerDatabaseRestored;
    }

    /**
     * Define o valor da propriedade customerDatabaseRestored.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerDatabaseRestored(Boolean value) {
        this.customerDatabaseRestored = value;
    }

    /**
     * Obtém o valor da propriedade customerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerEntityKey() {
        return customerEntityKey;
    }

    /**
     * Define o valor da propriedade customerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerEntityKey(Long value) {
        this.customerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade customerFailoverAttachComplete.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerFailoverAttachComplete() {
        return customerFailoverAttachComplete;
    }

    /**
     * Define o valor da propriedade customerFailoverAttachComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerFailoverAttachComplete(Boolean value) {
        this.customerFailoverAttachComplete = value;
    }

    /**
     * Obtém o valor da propriedade customerFailoverAttached.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerFailoverAttached() {
        return customerFailoverAttached;
    }

    /**
     * Define o valor da propriedade customerFailoverAttached.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerFailoverAttached(Boolean value) {
        this.customerFailoverAttached = value;
    }

    /**
     * Obtém o valor da propriedade customerFailoverDatabaseRestored.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerFailoverDatabaseRestored() {
        return customerFailoverDatabaseRestored;
    }

    /**
     * Define o valor da propriedade customerFailoverDatabaseRestored.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerFailoverDatabaseRestored(Boolean value) {
        this.customerFailoverDatabaseRestored = value;
    }

    /**
     * Obtém o valor da propriedade customerInitialDataPopulated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerInitialDataPopulated() {
        return customerInitialDataPopulated;
    }

    /**
     * Define o valor da propriedade customerInitialDataPopulated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerInitialDataPopulated(Boolean value) {
        this.customerInitialDataPopulated = value;
    }

    /**
     * Obtém o valor da propriedade customerMapEditsStaged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerMapEditsStaged() {
        return customerMapEditsStaged;
    }

    /**
     * Define o valor da propriedade customerMapEditsStaged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerMapEditsStaged(Boolean value) {
        this.customerMapEditsStaged = value;
    }

    /**
     * Obtém o valor da propriedade customerMirroringComplete.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerMirroringComplete() {
        return customerMirroringComplete;
    }

    /**
     * Define o valor da propriedade customerMirroringComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerMirroringComplete(Boolean value) {
        this.customerMirroringComplete = value;
    }

    /**
     * Obtém o valor da propriedade error.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SaveErrorInfo }{@code >}
     *     
     */
    public JAXBElement<SaveErrorInfo> getError() {
        return error;
    }

    /**
     * Define o valor da propriedade error.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SaveErrorInfo }{@code >}
     *     
     */
    public void setError(JAXBElement<SaveErrorInfo> value) {
        this.error = value;
    }

}
