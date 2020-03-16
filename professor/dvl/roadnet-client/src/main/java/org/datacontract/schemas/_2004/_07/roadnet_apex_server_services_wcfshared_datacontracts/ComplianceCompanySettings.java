
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ComplianceCompanySettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ComplianceCompanySettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EldDriveTriggerSpeed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplianceCompanySettings", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Compliance", propOrder = {
    "eldDriveTriggerSpeed"
})
public class ComplianceCompanySettings {

    @XmlElement(name = "EldDriveTriggerSpeed")
    protected Integer eldDriveTriggerSpeed;

    /**
     * Obtém o valor da propriedade eldDriveTriggerSpeed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEldDriveTriggerSpeed() {
        return eldDriveTriggerSpeed;
    }

    /**
     * Define o valor da propriedade eldDriveTriggerSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEldDriveTriggerSpeed(Integer value) {
        this.eldDriveTriggerSpeed = value;
    }

}
