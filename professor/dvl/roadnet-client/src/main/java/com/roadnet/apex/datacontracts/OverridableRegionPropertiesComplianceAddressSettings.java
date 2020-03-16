
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OverridableRegionProperties.ComplianceAddressSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OverridableRegionProperties.ComplianceAddressSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanadianRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CarrierName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DotNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverridableRegionProperties.ComplianceAddressSettings", propOrder = {
    "canadianRegistrationNumber",
    "carrierName",
    "dotNumber",
    "fax",
    "organizationAddress",
    "telephone"
})
public class OverridableRegionPropertiesComplianceAddressSettings
    extends DataTransferObject
{

    @XmlElement(name = "CanadianRegistrationNumber")
    protected Boolean canadianRegistrationNumber;
    @XmlElement(name = "CarrierName")
    protected Boolean carrierName;
    @XmlElement(name = "DotNumber")
    protected Boolean dotNumber;
    @XmlElement(name = "Fax")
    protected Boolean fax;
    @XmlElement(name = "OrganizationAddress")
    protected Boolean organizationAddress;
    @XmlElement(name = "Telephone")
    protected Boolean telephone;

    /**
     * Obtém o valor da propriedade canadianRegistrationNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanadianRegistrationNumber() {
        return canadianRegistrationNumber;
    }

    /**
     * Define o valor da propriedade canadianRegistrationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanadianRegistrationNumber(Boolean value) {
        this.canadianRegistrationNumber = value;
    }

    /**
     * Obtém o valor da propriedade carrierName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCarrierName() {
        return carrierName;
    }

    /**
     * Define o valor da propriedade carrierName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCarrierName(Boolean value) {
        this.carrierName = value;
    }

    /**
     * Obtém o valor da propriedade dotNumber.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDotNumber() {
        return dotNumber;
    }

    /**
     * Define o valor da propriedade dotNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDotNumber(Boolean value) {
        this.dotNumber = value;
    }

    /**
     * Obtém o valor da propriedade fax.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFax() {
        return fax;
    }

    /**
     * Define o valor da propriedade fax.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFax(Boolean value) {
        this.fax = value;
    }

    /**
     * Obtém o valor da propriedade organizationAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationAddress() {
        return organizationAddress;
    }

    /**
     * Define o valor da propriedade organizationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationAddress(Boolean value) {
        this.organizationAddress = value;
    }

    /**
     * Obtém o valor da propriedade telephone.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTelephone() {
        return telephone;
    }

    /**
     * Define o valor da propriedade telephone.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTelephone(Boolean value) {
        this.telephone = value;
    }

}
