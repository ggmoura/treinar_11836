
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de RegionRestrictedOperatingTimeDetailPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RegionRestrictedOperatingTimeDetailPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RestrictedTimePeriod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionRestrictedOperatingTimeDetailPropertyOptions", propOrder = {
    "restrictedTimePeriod"
})
public class RegionRestrictedOperatingTimeDetailPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "RestrictedTimePeriod")
    protected Boolean restrictedTimePeriod;

    /**
     * Obtém o valor da propriedade restrictedTimePeriod.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedTimePeriod() {
        return restrictedTimePeriod;
    }

    /**
     * Define o valor da propriedade restrictedTimePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedTimePeriod(Boolean value) {
        this.restrictedTimePeriod = value;
    }

}
