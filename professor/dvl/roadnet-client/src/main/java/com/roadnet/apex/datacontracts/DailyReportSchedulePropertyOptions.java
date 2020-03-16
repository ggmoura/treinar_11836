
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DailyReportSchedulePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DailyReportSchedulePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}ReportSchedulePropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DayOfWeekFlags_Days" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExecutionTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyReportSchedulePropertyOptions", propOrder = {
    "dayOfWeekFlagsDays",
    "executionTime"
})
public class DailyReportSchedulePropertyOptions
    extends ReportSchedulePropertyOptions
{

    @XmlElement(name = "DayOfWeekFlags_Days")
    protected Boolean dayOfWeekFlagsDays;
    @XmlElement(name = "ExecutionTime")
    protected Boolean executionTime;

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

}
