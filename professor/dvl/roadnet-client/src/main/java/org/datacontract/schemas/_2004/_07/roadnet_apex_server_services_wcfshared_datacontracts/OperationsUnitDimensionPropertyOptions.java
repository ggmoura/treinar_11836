
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OperationsUnitDimensionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OperationsUnitDimensionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DimensionPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseDepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisabledDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LevelEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ParentDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ParentEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ParentIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationsUnitDimensionPropertyOptions", propOrder = {
    "dataWarehouseDepotEntityKey",
    "description",
    "disabledDate",
    "identifier",
    "isActive",
    "levelEntityKey",
    "parentDescription",
    "parentEntityKey",
    "parentIdentifier"
})
public class OperationsUnitDimensionPropertyOptions
    extends DimensionPropertyOptions
{

    @XmlElement(name = "DataWarehouseDepotEntityKey")
    protected Boolean dataWarehouseDepotEntityKey;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "DisabledDate")
    protected Boolean disabledDate;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "LevelEntityKey")
    protected Boolean levelEntityKey;
    @XmlElement(name = "ParentDescription")
    protected Boolean parentDescription;
    @XmlElement(name = "ParentEntityKey")
    protected Boolean parentEntityKey;
    @XmlElement(name = "ParentIdentifier")
    protected Boolean parentIdentifier;

    /**
     * Obtém o valor da propriedade dataWarehouseDepotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseDepotEntityKey() {
        return dataWarehouseDepotEntityKey;
    }

    /**
     * Define o valor da propriedade dataWarehouseDepotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseDepotEntityKey(Boolean value) {
        this.dataWarehouseDepotEntityKey = value;
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
     * Obtém o valor da propriedade disabledDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabledDate() {
        return disabledDate;
    }

    /**
     * Define o valor da propriedade disabledDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabledDate(Boolean value) {
        this.disabledDate = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifier(Boolean value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade isActive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Define o valor da propriedade isActive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Obtém o valor da propriedade levelEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLevelEntityKey() {
        return levelEntityKey;
    }

    /**
     * Define o valor da propriedade levelEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLevelEntityKey(Boolean value) {
        this.levelEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade parentDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParentDescription() {
        return parentDescription;
    }

    /**
     * Define o valor da propriedade parentDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParentDescription(Boolean value) {
        this.parentDescription = value;
    }

    /**
     * Obtém o valor da propriedade parentEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParentEntityKey() {
        return parentEntityKey;
    }

    /**
     * Define o valor da propriedade parentEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParentEntityKey(Boolean value) {
        this.parentEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade parentIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParentIdentifier() {
        return parentIdentifier;
    }

    /**
     * Define o valor da propriedade parentIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParentIdentifier(Boolean value) {
        this.parentIdentifier = value;
    }

}
