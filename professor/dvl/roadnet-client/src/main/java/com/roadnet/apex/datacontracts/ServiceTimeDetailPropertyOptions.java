
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de ServiceTimeDetailPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceTimeDetailPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BulkFixedHelper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BulkFixedNonHelper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_Days" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FixedHelper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FixedNonHelper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PerUnitBulkVariableHelper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PerUnitBulkVariableNonHelper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PerUnitVariableHelper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PerUnitVariableNonHelper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceTimeDetailPropertyOptions", propOrder = {
    "bulkFixedHelper",
    "bulkFixedNonHelper",
    "dayOfWeekFlagsDays",
    "fixedHelper",
    "fixedNonHelper",
    "perUnitBulkVariableHelper",
    "perUnitBulkVariableNonHelper",
    "perUnitVariableHelper",
    "perUnitVariableNonHelper"
})
@XmlSeeAlso({
    OrderClassifiedServiceTimeDetailPropertyOptions.class
})
public class ServiceTimeDetailPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "BulkFixedHelper")
    protected Boolean bulkFixedHelper;
    @XmlElement(name = "BulkFixedNonHelper")
    protected Boolean bulkFixedNonHelper;
    @XmlElement(name = "DayOfWeekFlags_Days")
    protected Boolean dayOfWeekFlagsDays;
    @XmlElement(name = "FixedHelper")
    protected Boolean fixedHelper;
    @XmlElement(name = "FixedNonHelper")
    protected Boolean fixedNonHelper;
    @XmlElement(name = "PerUnitBulkVariableHelper")
    protected Boolean perUnitBulkVariableHelper;
    @XmlElement(name = "PerUnitBulkVariableNonHelper")
    protected Boolean perUnitBulkVariableNonHelper;
    @XmlElement(name = "PerUnitVariableHelper")
    protected Boolean perUnitVariableHelper;
    @XmlElement(name = "PerUnitVariableNonHelper")
    protected Boolean perUnitVariableNonHelper;

    /**
     * Obtém o valor da propriedade bulkFixedHelper.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBulkFixedHelper() {
        return bulkFixedHelper;
    }

    /**
     * Define o valor da propriedade bulkFixedHelper.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBulkFixedHelper(Boolean value) {
        this.bulkFixedHelper = value;
    }

    /**
     * Obtém o valor da propriedade bulkFixedNonHelper.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBulkFixedNonHelper() {
        return bulkFixedNonHelper;
    }

    /**
     * Define o valor da propriedade bulkFixedNonHelper.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBulkFixedNonHelper(Boolean value) {
        this.bulkFixedNonHelper = value;
    }

    /**
     * Obtém o valor da propriedade dayOfWeekFlagsDays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDayOfWeekFlagsDays() {
        return dayOfWeekFlagsDays;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDayOfWeekFlagsDays(Boolean value) {
        this.dayOfWeekFlagsDays = value;
    }

    /**
     * Obtém o valor da propriedade fixedHelper.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixedHelper() {
        return fixedHelper;
    }

    /**
     * Define o valor da propriedade fixedHelper.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedHelper(Boolean value) {
        this.fixedHelper = value;
    }

    /**
     * Obtém o valor da propriedade fixedNonHelper.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixedNonHelper() {
        return fixedNonHelper;
    }

    /**
     * Define o valor da propriedade fixedNonHelper.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedNonHelper(Boolean value) {
        this.fixedNonHelper = value;
    }

    /**
     * Obtém o valor da propriedade perUnitBulkVariableHelper.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerUnitBulkVariableHelper() {
        return perUnitBulkVariableHelper;
    }

    /**
     * Define o valor da propriedade perUnitBulkVariableHelper.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerUnitBulkVariableHelper(Boolean value) {
        this.perUnitBulkVariableHelper = value;
    }

    /**
     * Obtém o valor da propriedade perUnitBulkVariableNonHelper.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerUnitBulkVariableNonHelper() {
        return perUnitBulkVariableNonHelper;
    }

    /**
     * Define o valor da propriedade perUnitBulkVariableNonHelper.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerUnitBulkVariableNonHelper(Boolean value) {
        this.perUnitBulkVariableNonHelper = value;
    }

    /**
     * Obtém o valor da propriedade perUnitVariableHelper.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerUnitVariableHelper() {
        return perUnitVariableHelper;
    }

    /**
     * Define o valor da propriedade perUnitVariableHelper.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerUnitVariableHelper(Boolean value) {
        this.perUnitVariableHelper = value;
    }

    /**
     * Obtém o valor da propriedade perUnitVariableNonHelper.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerUnitVariableNonHelper() {
        return perUnitVariableNonHelper;
    }

    /**
     * Define o valor da propriedade perUnitVariableNonHelper.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerUnitVariableNonHelper(Boolean value) {
        this.perUnitVariableNonHelper = value;
    }

}
