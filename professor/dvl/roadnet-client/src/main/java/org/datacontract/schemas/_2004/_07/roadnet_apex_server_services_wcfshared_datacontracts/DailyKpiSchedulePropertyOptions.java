
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DailyKpiSchedulePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DailyKpiSchedulePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}KpiSchedulePropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DayOfWeekFlags_Days" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyKpiSchedulePropertyOptions", propOrder = {
    "dayOfWeekFlagsDays"
})
public class DailyKpiSchedulePropertyOptions
    extends KpiSchedulePropertyOptions
{

    @XmlElement(name = "DayOfWeekFlags_Days")
    protected Boolean dayOfWeekFlagsDays;

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

}
