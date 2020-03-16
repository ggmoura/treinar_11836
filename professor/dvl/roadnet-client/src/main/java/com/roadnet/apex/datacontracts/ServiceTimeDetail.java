
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de ServiceTimeDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceTimeDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BulkFixedHelper" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="BulkFixedNonHelper" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_Days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FixedHelper" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="FixedNonHelper" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PerUnitBulkVariableHelper" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PerUnitBulkVariableNonHelper" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PerUnitVariableHelper" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PerUnitVariableNonHelper" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceTimeDetail", propOrder = {
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
    LayoverLocationServiceTimeDetail.class,
    DepotServiceTimeDetail.class,
    OrderClassifiedServiceTimeDetail.class
})
public class ServiceTimeDetail
    extends DomainEntity
{

    @XmlElement(name = "BulkFixedHelper")
    protected Duration bulkFixedHelper;
    @XmlElement(name = "BulkFixedNonHelper")
    protected Duration bulkFixedNonHelper;
    @XmlElementRef(name = "DayOfWeekFlags_Days", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dayOfWeekFlagsDays;
    @XmlElement(name = "FixedHelper")
    protected Duration fixedHelper;
    @XmlElement(name = "FixedNonHelper")
    protected Duration fixedNonHelper;
    @XmlElement(name = "PerUnitBulkVariableHelper")
    protected Duration perUnitBulkVariableHelper;
    @XmlElement(name = "PerUnitBulkVariableNonHelper")
    protected Duration perUnitBulkVariableNonHelper;
    @XmlElement(name = "PerUnitVariableHelper")
    protected Duration perUnitVariableHelper;
    @XmlElement(name = "PerUnitVariableNonHelper")
    protected Duration perUnitVariableNonHelper;

    /**
     * Obtém o valor da propriedade bulkFixedHelper.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getBulkFixedHelper() {
        return bulkFixedHelper;
    }

    /**
     * Define o valor da propriedade bulkFixedHelper.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setBulkFixedHelper(Duration value) {
        this.bulkFixedHelper = value;
    }

    /**
     * Obtém o valor da propriedade bulkFixedNonHelper.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getBulkFixedNonHelper() {
        return bulkFixedNonHelper;
    }

    /**
     * Define o valor da propriedade bulkFixedNonHelper.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setBulkFixedNonHelper(Duration value) {
        this.bulkFixedNonHelper = value;
    }

    /**
     * Obtém o valor da propriedade dayOfWeekFlagsDays.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDayOfWeekFlagsDays() {
        return dayOfWeekFlagsDays;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsDays.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDayOfWeekFlagsDays(JAXBElement<String> value) {
        this.dayOfWeekFlagsDays = value;
    }

    /**
     * Obtém o valor da propriedade fixedHelper.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getFixedHelper() {
        return fixedHelper;
    }

    /**
     * Define o valor da propriedade fixedHelper.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setFixedHelper(Duration value) {
        this.fixedHelper = value;
    }

    /**
     * Obtém o valor da propriedade fixedNonHelper.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getFixedNonHelper() {
        return fixedNonHelper;
    }

    /**
     * Define o valor da propriedade fixedNonHelper.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setFixedNonHelper(Duration value) {
        this.fixedNonHelper = value;
    }

    /**
     * Obtém o valor da propriedade perUnitBulkVariableHelper.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPerUnitBulkVariableHelper() {
        return perUnitBulkVariableHelper;
    }

    /**
     * Define o valor da propriedade perUnitBulkVariableHelper.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPerUnitBulkVariableHelper(Duration value) {
        this.perUnitBulkVariableHelper = value;
    }

    /**
     * Obtém o valor da propriedade perUnitBulkVariableNonHelper.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPerUnitBulkVariableNonHelper() {
        return perUnitBulkVariableNonHelper;
    }

    /**
     * Define o valor da propriedade perUnitBulkVariableNonHelper.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPerUnitBulkVariableNonHelper(Duration value) {
        this.perUnitBulkVariableNonHelper = value;
    }

    /**
     * Obtém o valor da propriedade perUnitVariableHelper.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPerUnitVariableHelper() {
        return perUnitVariableHelper;
    }

    /**
     * Define o valor da propriedade perUnitVariableHelper.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPerUnitVariableHelper(Duration value) {
        this.perUnitVariableHelper = value;
    }

    /**
     * Obtém o valor da propriedade perUnitVariableNonHelper.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPerUnitVariableNonHelper() {
        return perUnitVariableNonHelper;
    }

    /**
     * Define o valor da propriedade perUnitVariableNonHelper.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPerUnitVariableNonHelper(Duration value) {
        this.perUnitVariableNonHelper = value;
    }

}
