
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de KpiSchedulePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="KpiSchedulePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CultureName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseKpiOutputType_OutputType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EmailRecipients" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExecutionTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="KpiEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="KpiName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastRunTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Options" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_TimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KpiSchedulePropertyOptions", propOrder = {
    "cultureName",
    "dataWarehouseKpiOutputTypeOutputType",
    "description",
    "emailRecipients",
    "executionTime",
    "kpiEntityKey",
    "kpiName",
    "lastRunTime",
    "options",
    "worldTimeZoneTimeZone"
})
@XmlSeeAlso({
    DailyKpiSchedulePropertyOptions.class,
    MonthlyKpiSchedulePropertyOptions.class
})
public class KpiSchedulePropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "CultureName")
    protected Boolean cultureName;
    @XmlElement(name = "DataWarehouseKpiOutputType_OutputType")
    protected Boolean dataWarehouseKpiOutputTypeOutputType;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "EmailRecipients")
    protected Boolean emailRecipients;
    @XmlElement(name = "ExecutionTime")
    protected Boolean executionTime;
    @XmlElement(name = "KpiEntityKey")
    protected Boolean kpiEntityKey;
    @XmlElement(name = "KpiName")
    protected Boolean kpiName;
    @XmlElement(name = "LastRunTime")
    protected Boolean lastRunTime;
    @XmlElement(name = "Options")
    protected Boolean options;
    @XmlElement(name = "WorldTimeZone_TimeZone")
    protected Boolean worldTimeZoneTimeZone;

    /**
     * Obtém o valor da propriedade cultureName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCultureName() {
        return cultureName;
    }

    /**
     * Define o valor da propriedade cultureName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCultureName(Boolean value) {
        this.cultureName = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseKpiOutputTypeOutputType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseKpiOutputTypeOutputType() {
        return dataWarehouseKpiOutputTypeOutputType;
    }

    /**
     * Define o valor da propriedade dataWarehouseKpiOutputTypeOutputType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseKpiOutputTypeOutputType(Boolean value) {
        this.dataWarehouseKpiOutputTypeOutputType = value;
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
     * Obtém o valor da propriedade emailRecipients.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailRecipients() {
        return emailRecipients;
    }

    /**
     * Define o valor da propriedade emailRecipients.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailRecipients(Boolean value) {
        this.emailRecipients = value;
    }

    /**
     * Obtém o valor da propriedade executionTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExecutionTime() {
        return executionTime;
    }

    /**
     * Define o valor da propriedade executionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExecutionTime(Boolean value) {
        this.executionTime = value;
    }

    /**
     * Obtém o valor da propriedade kpiEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKpiEntityKey() {
        return kpiEntityKey;
    }

    /**
     * Define o valor da propriedade kpiEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKpiEntityKey(Boolean value) {
        this.kpiEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade kpiName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKpiName() {
        return kpiName;
    }

    /**
     * Define o valor da propriedade kpiName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKpiName(Boolean value) {
        this.kpiName = value;
    }

    /**
     * Obtém o valor da propriedade lastRunTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastRunTime() {
        return lastRunTime;
    }

    /**
     * Define o valor da propriedade lastRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastRunTime(Boolean value) {
        this.lastRunTime = value;
    }

    /**
     * Obtém o valor da propriedade options.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptions() {
        return options;
    }

    /**
     * Define o valor da propriedade options.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptions(Boolean value) {
        this.options = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorldTimeZoneTimeZone() {
        return worldTimeZoneTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorldTimeZoneTimeZone(Boolean value) {
        this.worldTimeZoneTimeZone = value;
    }

}
