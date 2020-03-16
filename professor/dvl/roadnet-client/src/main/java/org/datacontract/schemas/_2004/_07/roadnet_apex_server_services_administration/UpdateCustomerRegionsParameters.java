
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UpdateCustomerRegionsParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateCustomerRegionsParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MigrateNewCustomerRegions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RegionsToUpdate" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.MigrateCustomer}ArrayOfUpdateCustomerRegionsParameters.TransferHistoricRoutesRegionInfo" minOccurs="0"/&gt;
 *         &lt;element name="UpdateLegacyDB" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UpdateLegacyDBFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCustomerRegionsParameters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.MigrateCustomer", propOrder = {
    "customerEntityKey",
    "migrateNewCustomerRegions",
    "regionsToUpdate",
    "updateLegacyDB",
    "updateLegacyDBFilePath"
})
public class UpdateCustomerRegionsParameters {

    @XmlElement(name = "CustomerEntityKey")
    protected Long customerEntityKey;
    @XmlElement(name = "MigrateNewCustomerRegions")
    protected Boolean migrateNewCustomerRegions;
    @XmlElementRef(name = "RegionsToUpdate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.MigrateCustomer", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo> regionsToUpdate;
    @XmlElement(name = "UpdateLegacyDB")
    protected Boolean updateLegacyDB;
    @XmlElementRef(name = "UpdateLegacyDBFilePath", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.MigrateCustomer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> updateLegacyDBFilePath;

    /**
     * Obtém o valor da propriedade customerEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerEntityKey() {
        return customerEntityKey;
    }

    /**
     * Define o valor da propriedade customerEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerEntityKey(Long value) {
        this.customerEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade migrateNewCustomerRegions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMigrateNewCustomerRegions() {
        return migrateNewCustomerRegions;
    }

    /**
     * Define o valor da propriedade migrateNewCustomerRegions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMigrateNewCustomerRegions(Boolean value) {
        this.migrateNewCustomerRegions = value;
    }

    /**
     * Obtém o valor da propriedade regionsToUpdate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo> getRegionsToUpdate() {
        return regionsToUpdate;
    }

    /**
     * Define o valor da propriedade regionsToUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo }{@code >}
     *     
     */
    public void setRegionsToUpdate(JAXBElement<ArrayOfUpdateCustomerRegionsParametersTransferHistoricRoutesRegionInfo> value) {
        this.regionsToUpdate = value;
    }

    /**
     * Obtém o valor da propriedade updateLegacyDB.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateLegacyDB() {
        return updateLegacyDB;
    }

    /**
     * Define o valor da propriedade updateLegacyDB.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateLegacyDB(Boolean value) {
        this.updateLegacyDB = value;
    }

    /**
     * Obtém o valor da propriedade updateLegacyDBFilePath.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUpdateLegacyDBFilePath() {
        return updateLegacyDBFilePath;
    }

    /**
     * Define o valor da propriedade updateLegacyDBFilePath.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUpdateLegacyDBFilePath(JAXBElement<String> value) {
        this.updateLegacyDBFilePath = value;
    }

}
