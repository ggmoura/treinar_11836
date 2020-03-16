
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MonthlyReportSchedulePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MonthlyReportSchedulePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}ReportSchedulePropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthlyReportSchedulePropertyOptions", propOrder = {
    "day"
})
public class MonthlyReportSchedulePropertyOptions
    extends ReportSchedulePropertyOptions
{

    @XmlElement(name = "Day")
    protected Boolean day;

    /**
     * Obtém o valor da propriedade day.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDay() {
        return day;
    }

    /**
     * Define o valor da propriedade day.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDay(Boolean value) {
        this.day = value;
    }

}
