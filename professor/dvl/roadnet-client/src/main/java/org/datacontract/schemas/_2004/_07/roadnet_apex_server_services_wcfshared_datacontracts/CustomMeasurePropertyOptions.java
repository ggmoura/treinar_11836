
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de CustomMeasurePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomMeasurePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthorEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AuthorName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseMeasureUsageOptions_Options" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Formula" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsPublic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RawFormula" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomMeasurePropertyOptions", propOrder = {
    "authorEntityKey",
    "authorName",
    "dataWarehouseMeasureUsageOptionsOptions",
    "description",
    "formula",
    "isPublic",
    "name",
    "rawFormula"
})
public class CustomMeasurePropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "AuthorEntityKey")
    protected Boolean authorEntityKey;
    @XmlElement(name = "AuthorName")
    protected Boolean authorName;
    @XmlElement(name = "DataWarehouseMeasureUsageOptions_Options")
    protected Boolean dataWarehouseMeasureUsageOptionsOptions;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "Formula")
    protected Boolean formula;
    @XmlElement(name = "IsPublic")
    protected Boolean isPublic;
    @XmlElement(name = "Name")
    protected Boolean name;
    @XmlElement(name = "RawFormula")
    protected Boolean rawFormula;

    /**
     * Obtém o valor da propriedade authorEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorEntityKey() {
        return authorEntityKey;
    }

    /**
     * Define o valor da propriedade authorEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorEntityKey(Boolean value) {
        this.authorEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade authorName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorName() {
        return authorName;
    }

    /**
     * Define o valor da propriedade authorName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorName(Boolean value) {
        this.authorName = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseMeasureUsageOptionsOptions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseMeasureUsageOptionsOptions() {
        return dataWarehouseMeasureUsageOptionsOptions;
    }

    /**
     * Define o valor da propriedade dataWarehouseMeasureUsageOptionsOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseMeasureUsageOptionsOptions(Boolean value) {
        this.dataWarehouseMeasureUsageOptionsOptions = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade formula.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFormula() {
        return formula;
    }

    /**
     * Define o valor da propriedade formula.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFormula(Boolean value) {
        this.formula = value;
    }

    /**
     * Obtém o valor da propriedade isPublic.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPublic() {
        return isPublic;
    }

    /**
     * Define o valor da propriedade isPublic.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPublic(Boolean value) {
        this.isPublic = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setName(Boolean value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade rawFormula.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRawFormula() {
        return rawFormula;
    }

    /**
     * Define o valor da propriedade rawFormula.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRawFormula(Boolean value) {
        this.rawFormula = value;
    }

}
