
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.AggregateRootEntity;


/**
 * <p>Classe Java de CustomerBusinessUnit complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerBusinessUnit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessUnitPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CustomerEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MapDatasetPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UseCommunityEdits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseNavigationPathCalculator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerBusinessUnit", propOrder = {
    "businessUnitPkey",
    "customerEntityKey",
    "description",
    "identifier",
    "isDeleted",
    "mapDatasetPkey",
    "useCommunityEdits",
    "useNavigationPathCalculator"
})
public class CustomerBusinessUnit
    extends AggregateRootEntity
{

    @XmlElement(name = "BusinessUnitPkey")
    protected Long businessUnitPkey;
    @XmlElement(name = "CustomerEntityKey")
    protected Long customerEntityKey;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Identifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlElement(name = "MapDatasetPkey")
    protected Long mapDatasetPkey;
    @XmlElement(name = "UseCommunityEdits")
    protected Boolean useCommunityEdits;
    @XmlElement(name = "UseNavigationPathCalculator")
    protected Boolean useNavigationPathCalculator;

    /**
     * Obtém o valor da propriedade businessUnitPkey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBusinessUnitPkey() {
        return businessUnitPkey;
    }

    /**
     * Define o valor da propriedade businessUnitPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBusinessUnitPkey(Long value) {
        this.businessUnitPkey = value;
    }

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
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade isDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Define o valor da propriedade isDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Obtém o valor da propriedade mapDatasetPkey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMapDatasetPkey() {
        return mapDatasetPkey;
    }

    /**
     * Define o valor da propriedade mapDatasetPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMapDatasetPkey(Long value) {
        this.mapDatasetPkey = value;
    }

    /**
     * Obtém o valor da propriedade useCommunityEdits.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCommunityEdits() {
        return useCommunityEdits;
    }

    /**
     * Define o valor da propriedade useCommunityEdits.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCommunityEdits(Boolean value) {
        this.useCommunityEdits = value;
    }

    /**
     * Obtém o valor da propriedade useNavigationPathCalculator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseNavigationPathCalculator() {
        return useNavigationPathCalculator;
    }

    /**
     * Define o valor da propriedade useNavigationPathCalculator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseNavigationPathCalculator(Boolean value) {
        this.useNavigationPathCalculator = value;
    }

}
