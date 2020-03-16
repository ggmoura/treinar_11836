
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de CalculateDistanceByJurisdictionResultPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CalculateDistanceByJurisdictionResultPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JurisdictionDistancesOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}JurisdictionDistancePropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculateDistanceByJurisdictionResultPropertyOptions", propOrder = {
    "jurisdictionDistancesOptions"
})
public class CalculateDistanceByJurisdictionResultPropertyOptions
    extends PropertyOptions
{

    @XmlElementRef(name = "JurisdictionDistancesOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<JurisdictionDistancePropertyOptions> jurisdictionDistancesOptions;

    /**
     * Obtém o valor da propriedade jurisdictionDistancesOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link JurisdictionDistancePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<JurisdictionDistancePropertyOptions> getJurisdictionDistancesOptions() {
        return jurisdictionDistancesOptions;
    }

    /**
     * Define o valor da propriedade jurisdictionDistancesOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link JurisdictionDistancePropertyOptions }{@code >}
     *     
     */
    public void setJurisdictionDistancesOptions(JAXBElement<JurisdictionDistancePropertyOptions> value) {
        this.jurisdictionDistancesOptions = value;
    }

}
