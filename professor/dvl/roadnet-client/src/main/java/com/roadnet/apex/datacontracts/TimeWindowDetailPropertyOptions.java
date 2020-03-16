
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de TimeWindowDetailPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TimeWindowDetailPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DailyTimePeriod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeWindowDetailPropertyOptions", propOrder = {
    "dailyTimePeriod"
})
@XmlSeeAlso({
    OpenCloseDetailPropertyOptions.class,
    ServiceWindowDetailPropertyOptions.class
})
public class TimeWindowDetailPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "DailyTimePeriod")
    protected Boolean dailyTimePeriod;

    /**
     * Obtém o valor da propriedade dailyTimePeriod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDailyTimePeriod() {
        return dailyTimePeriod;
    }

    /**
     * Define o valor da propriedade dailyTimePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDailyTimePeriod(Boolean value) {
        this.dailyTimePeriod = value;
    }

}
