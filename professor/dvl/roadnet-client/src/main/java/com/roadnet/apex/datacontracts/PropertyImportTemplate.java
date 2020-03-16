
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PropertyImportTemplate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PropertyImportTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}PropertyTransferTemplate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConstantText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImportCaseOperation_CaseOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImportConstantOperation_ConstantOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyImportTemplate", propOrder = {
    "constantText",
    "importCaseOperationCaseOperation",
    "importConstantOperationConstantOperation"
})
public class PropertyImportTemplate
    extends PropertyTransferTemplate
{

    @XmlElementRef(name = "ConstantText", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> constantText;
    @XmlElementRef(name = "ImportCaseOperation_CaseOperation", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importCaseOperationCaseOperation;
    @XmlElementRef(name = "ImportConstantOperation_ConstantOperation", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importConstantOperationConstantOperation;

    /**
     * Obtém o valor da propriedade constantText.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConstantText() {
        return constantText;
    }

    /**
     * Define o valor da propriedade constantText.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConstantText(JAXBElement<String> value) {
        this.constantText = value;
    }

    /**
     * Obtém o valor da propriedade importCaseOperationCaseOperation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImportCaseOperationCaseOperation() {
        return importCaseOperationCaseOperation;
    }

    /**
     * Define o valor da propriedade importCaseOperationCaseOperation.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImportCaseOperationCaseOperation(JAXBElement<String> value) {
        this.importCaseOperationCaseOperation = value;
    }

    /**
     * Obtém o valor da propriedade importConstantOperationConstantOperation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImportConstantOperationConstantOperation() {
        return importConstantOperationConstantOperation;
    }

    /**
     * Define o valor da propriedade importConstantOperationConstantOperation.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImportConstantOperationConstantOperation(JAXBElement<String> value) {
        this.importConstantOperationConstantOperation = value;
    }

}
