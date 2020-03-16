
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de TimeWindowDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TimeWindowDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DailyTimePeriod" type="{http://roadnet.com/apex/DataContracts/}DailyTimePeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeWindowDetail", propOrder = {
    "dailyTimePeriod"
})
@XmlSeeAlso({
    OpenCloseDetail.class,
    ServiceWindowDetail.class
})
public class TimeWindowDetail
    extends DomainEntity
{

    @XmlElementRef(name = "DailyTimePeriod", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<DailyTimePeriod> dailyTimePeriod;

    /**
     * Obtém o valor da propriedade dailyTimePeriod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DailyTimePeriod }{@code >}
     *     
     */
    public JAXBElement<DailyTimePeriod> getDailyTimePeriod() {
        return dailyTimePeriod;
    }

    /**
     * Define o valor da propriedade dailyTimePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DailyTimePeriod }{@code >}
     *     
     */
    public void setDailyTimePeriod(JAXBElement<DailyTimePeriod> value) {
        this.dailyTimePeriod = value;
    }

}
