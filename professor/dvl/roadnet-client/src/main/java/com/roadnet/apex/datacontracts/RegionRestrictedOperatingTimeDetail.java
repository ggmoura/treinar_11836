
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de RegionRestrictedOperatingTimeDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RegionRestrictedOperatingTimeDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RestrictedTimePeriod" type="{http://roadnet.com/apex/DataContracts/}DailyTimePeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionRestrictedOperatingTimeDetail", propOrder = {
    "restrictedTimePeriod"
})
public class RegionRestrictedOperatingTimeDetail
    extends DomainEntity
{

    @XmlElementRef(name = "RestrictedTimePeriod", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<DailyTimePeriod> restrictedTimePeriod;

    /**
     * Obtém o valor da propriedade restrictedTimePeriod.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DailyTimePeriod }{@code >}
     *     
     */
    public JAXBElement<DailyTimePeriod> getRestrictedTimePeriod() {
        return restrictedTimePeriod;
    }

    /**
     * Define o valor da propriedade restrictedTimePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DailyTimePeriod }{@code >}
     *     
     */
    public void setRestrictedTimePeriod(JAXBElement<DailyTimePeriod> value) {
        this.restrictedTimePeriod = value;
    }

}
