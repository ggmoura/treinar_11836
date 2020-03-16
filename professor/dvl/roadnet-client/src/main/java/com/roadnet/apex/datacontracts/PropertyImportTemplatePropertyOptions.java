
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PropertyImportTemplatePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PropertyImportTemplatePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}PropertyTransferTemplatePropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConstantText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ImportCaseOperation_CaseOperation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ImportConstantOperation_ConstantOperation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TrimOperation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyImportTemplatePropertyOptions", propOrder = {
    "constantText",
    "importCaseOperationCaseOperation",
    "importConstantOperationConstantOperation",
    "trimOperation"
})
public class PropertyImportTemplatePropertyOptions
    extends PropertyTransferTemplatePropertyOptions
{

    @XmlElement(name = "ConstantText")
    protected Boolean constantText;
    @XmlElement(name = "ImportCaseOperation_CaseOperation")
    protected Boolean importCaseOperationCaseOperation;
    @XmlElement(name = "ImportConstantOperation_ConstantOperation")
    protected Boolean importConstantOperationConstantOperation;
    @XmlElement(name = "TrimOperation")
    protected Boolean trimOperation;

    /**
     * Obtém o valor da propriedade constantText.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConstantText() {
        return constantText;
    }

    /**
     * Define o valor da propriedade constantText.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConstantText(Boolean value) {
        this.constantText = value;
    }

    /**
     * Obtém o valor da propriedade importCaseOperationCaseOperation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImportCaseOperationCaseOperation() {
        return importCaseOperationCaseOperation;
    }

    /**
     * Define o valor da propriedade importCaseOperationCaseOperation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportCaseOperationCaseOperation(Boolean value) {
        this.importCaseOperationCaseOperation = value;
    }

    /**
     * Obtém o valor da propriedade importConstantOperationConstantOperation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImportConstantOperationConstantOperation() {
        return importConstantOperationConstantOperation;
    }

    /**
     * Define o valor da propriedade importConstantOperationConstantOperation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportConstantOperationConstantOperation(Boolean value) {
        this.importConstantOperationConstantOperation = value;
    }

    /**
     * Obtém o valor da propriedade trimOperation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrimOperation() {
        return trimOperation;
    }

    /**
     * Define o valor da propriedade trimOperation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrimOperation(Boolean value) {
        this.trimOperation = value;
    }

}
