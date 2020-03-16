
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ReportCriteriaSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReportCriteriaSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteCriteriaSettings" type="{http://roadnet.com/apex/DataContracts/}ReportRouteCriteriaSettings" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportCriteriaSettings", propOrder = {
    "routeCriteriaSettings"
})
public class ReportCriteriaSettings
    extends DataTransferObject
{

    @XmlElementRef(name = "RouteCriteriaSettings", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ReportRouteCriteriaSettings> routeCriteriaSettings;

    /**
     * Obtém o valor da propriedade routeCriteriaSettings.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReportRouteCriteriaSettings }{@code >}
     *     
     */
    public JAXBElement<ReportRouteCriteriaSettings> getRouteCriteriaSettings() {
        return routeCriteriaSettings;
    }

    /**
     * Define o valor da propriedade routeCriteriaSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReportRouteCriteriaSettings }{@code >}
     *     
     */
    public void setRouteCriteriaSettings(JAXBElement<ReportRouteCriteriaSettings> value) {
        this.routeCriteriaSettings = value;
    }

}
