
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ReportSchedulePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReportSchedulePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}VisibleInMultipleRegionsAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EmailRecipients" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExecuteReportParameters_OutputFormatType_OutputFormat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastRunTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Options" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReportEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UserEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportSchedulePropertyOptions", propOrder = {
    "description",
    "emailRecipients",
    "executeReportParametersOutputFormatTypeOutputFormat",
    "lastRunTime",
    "options",
    "reportEntityKey",
    "userEntityKeys"
})
@XmlSeeAlso({
    DailyReportSchedulePropertyOptions.class,
    MonthlyReportSchedulePropertyOptions.class,
    WeeklyReportSchedulePropertyOptions.class
})
public class ReportSchedulePropertyOptions
    extends VisibleInMultipleRegionsAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "EmailRecipients")
    protected Boolean emailRecipients;
    @XmlElement(name = "ExecuteReportParameters_OutputFormatType_OutputFormat")
    protected Boolean executeReportParametersOutputFormatTypeOutputFormat;
    @XmlElement(name = "LastRunTime")
    protected Boolean lastRunTime;
    @XmlElement(name = "Options")
    protected Boolean options;
    @XmlElement(name = "ReportEntityKey")
    protected Boolean reportEntityKey;
    @XmlElement(name = "UserEntityKeys")
    protected Boolean userEntityKeys;

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
     * Obtém o valor da propriedade executeReportParametersOutputFormatTypeOutputFormat.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExecuteReportParametersOutputFormatTypeOutputFormat() {
        return executeReportParametersOutputFormatTypeOutputFormat;
    }

    /**
     * Define o valor da propriedade executeReportParametersOutputFormatTypeOutputFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExecuteReportParametersOutputFormatTypeOutputFormat(Boolean value) {
        this.executeReportParametersOutputFormatTypeOutputFormat = value;
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
     * Obtém o valor da propriedade reportEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReportEntityKey() {
        return reportEntityKey;
    }

    /**
     * Define o valor da propriedade reportEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReportEntityKey(Boolean value) {
        this.reportEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade userEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserEntityKeys() {
        return userEntityKeys;
    }

    /**
     * Define o valor da propriedade userEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserEntityKeys(Boolean value) {
        this.userEntityKeys = value;
    }

}
