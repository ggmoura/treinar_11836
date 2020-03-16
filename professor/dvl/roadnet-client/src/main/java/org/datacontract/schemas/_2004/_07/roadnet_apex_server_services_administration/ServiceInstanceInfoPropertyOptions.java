
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de ServiceInstanceInfoPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceInstanceInfoPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FacilityEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MachineName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInstanceInfoPropertyOptions", propOrder = {
    "facilityEntityKey",
    "machineName"
})
public class ServiceInstanceInfoPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "FacilityEntityKey")
    protected Boolean facilityEntityKey;
    @XmlElement(name = "MachineName")
    protected Boolean machineName;

    /**
     * Obtém o valor da propriedade facilityEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFacilityEntityKey() {
        return facilityEntityKey;
    }

    /**
     * Define o valor da propriedade facilityEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFacilityEntityKey(Boolean value) {
        this.facilityEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade machineName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMachineName() {
        return machineName;
    }

    /**
     * Define o valor da propriedade machineName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMachineName(Boolean value) {
        this.machineName = value;
    }

}
