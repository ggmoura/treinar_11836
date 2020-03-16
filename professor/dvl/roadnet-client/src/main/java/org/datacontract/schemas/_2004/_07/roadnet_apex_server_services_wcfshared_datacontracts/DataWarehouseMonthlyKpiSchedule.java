
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseMonthlyKpiSchedule complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseMonthlyKpiSchedule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseKpiSchedule"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DayOfMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MonthInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseMonthlyKpiSchedule", propOrder = {
    "dayOfMonth",
    "monthInterval"
})
public class DataWarehouseMonthlyKpiSchedule
    extends DataWarehouseKpiSchedule
{

    @XmlElement(name = "DayOfMonth")
    protected Integer dayOfMonth;
    @XmlElement(name = "MonthInterval")
    protected Integer monthInterval;

    /**
     * Obtém o valor da propriedade dayOfMonth.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * Define o valor da propriedade dayOfMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDayOfMonth(Integer value) {
        this.dayOfMonth = value;
    }

    /**
     * Obtém o valor da propriedade monthInterval.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonthInterval() {
        return monthInterval;
    }

    /**
     * Define o valor da propriedade monthInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonthInterval(Integer value) {
        this.monthInterval = value;
    }

}
