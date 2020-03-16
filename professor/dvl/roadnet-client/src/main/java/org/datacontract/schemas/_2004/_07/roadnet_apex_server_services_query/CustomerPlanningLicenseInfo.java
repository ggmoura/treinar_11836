
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CustomerPlanningLicenseInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerPlanningLicenseInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LicensedModelingVehicles" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LicensedOperationalVehicles" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UsedModelingVehicles" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UsedOperationalVehicles" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPlanningLicenseInfo", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", propOrder = {
    "licensedModelingVehicles",
    "licensedOperationalVehicles",
    "usedModelingVehicles",
    "usedOperationalVehicles"
})
public class CustomerPlanningLicenseInfo {

    @XmlElement(name = "LicensedModelingVehicles")
    protected Long licensedModelingVehicles;
    @XmlElement(name = "LicensedOperationalVehicles")
    protected Long licensedOperationalVehicles;
    @XmlElement(name = "UsedModelingVehicles")
    protected Long usedModelingVehicles;
    @XmlElement(name = "UsedOperationalVehicles")
    protected Long usedOperationalVehicles;

    /**
     * Obtém o valor da propriedade licensedModelingVehicles.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLicensedModelingVehicles() {
        return licensedModelingVehicles;
    }

    /**
     * Define o valor da propriedade licensedModelingVehicles.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLicensedModelingVehicles(Long value) {
        this.licensedModelingVehicles = value;
    }

    /**
     * Obtém o valor da propriedade licensedOperationalVehicles.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLicensedOperationalVehicles() {
        return licensedOperationalVehicles;
    }

    /**
     * Define o valor da propriedade licensedOperationalVehicles.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLicensedOperationalVehicles(Long value) {
        this.licensedOperationalVehicles = value;
    }

    /**
     * Obtém o valor da propriedade usedModelingVehicles.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUsedModelingVehicles() {
        return usedModelingVehicles;
    }

    /**
     * Define o valor da propriedade usedModelingVehicles.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUsedModelingVehicles(Long value) {
        this.usedModelingVehicles = value;
    }

    /**
     * Obtém o valor da propriedade usedOperationalVehicles.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUsedOperationalVehicles() {
        return usedOperationalVehicles;
    }

    /**
     * Define o valor da propriedade usedOperationalVehicles.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUsedOperationalVehicles(Long value) {
        this.usedOperationalVehicles = value;
    }

}
